import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class kaz
{
  private kbe a;
  private boolean b;
  private kbb c;
  private ArrayList<kbb> d;
  public final kba o;
  public volatile Object p;
  public volatile int q;
  public volatile int r;
  public volatile int s;
  public boolean t;
  public volatile boolean u;
  
  public kaz(kbe paramkbe, kba paramkba)
  {
    this.a = paramkbe;
    this.o = paramkba;
    this.t = Log.isLoggable("EsResource", 3);
  }
  
  private final void a()
  {
    if (this.b) {
      throw new ConcurrentModificationException("Registering/unregistering resource while delivering status change notification");
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, kbb paramkbb)
  {
    paramStringBuilder.append(paramkbb);
    if ((paramkbb instanceof View)) {
      paramStringBuilder.append(" context: ").append(((View)paramkbb).getContext());
    }
  }
  
  public static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return String.valueOf(paramInt);
    case 7: 
      return "canceled";
    case 2: 
      return "loading";
    case 3: 
      return "not found";
    case 6: 
      return "out of memory";
    case 5: 
      return "permanent error";
    case 1: 
      return "ready";
    case 4: 
      return "transient error";
    }
    return "undefined";
  }
  
  public void a(int paramInt)
  {
    if (this.q != 2)
    {
      if (this.t)
      {
        String str3 = String.valueOf(this.o);
        String str4 = String.valueOf(c(this.q));
        String str5 = String.valueOf(c(paramInt));
        new StringBuilder(96 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append("Request no longer needed, not delivering status change: ").append(str3).append(", current status: ").append(str4).append(", ignored new status: ").append(str5);
      }
      return;
    }
    if (this.t)
    {
      String str1 = String.valueOf(this.o);
      String str2 = String.valueOf(c(paramInt));
      new StringBuilder(45 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Delivering error code to consumers: ").append(str1).append(" status: ").append(str2);
    }
    this.a.a(this, paramInt);
  }
  
  public void a(int paramInt, String paramString)
  {
    if (paramInt == 404)
    {
      this.a.a(this, 3);
      return;
    }
    if (paramInt == 401)
    {
      this.a.a(this, 4, paramInt);
      return;
    }
    this.a.a(this, 5, paramInt);
  }
  
  public abstract void a(Object paramObject);
  
  public void a(StringBuilder paramStringBuilder) {}
  
  public final void a(kbb paramkbb)
  {
    efj.k();
    a();
    int i;
    if (this.c == paramkbb) {
      i = 1;
    }
    while (i != 0)
    {
      return;
      if (this.d != null)
      {
        int j = this.d.size();
        for (int k = 0;; k++)
        {
          if (k >= j) {
            break label72;
          }
          if (this.d.get(k) == paramkbb)
          {
            i = 1;
            break;
          }
        }
      }
      label72:
      i = 0;
    }
    boolean bool;
    if (this.d != null)
    {
      bool = this.d.isEmpty();
      this.d.add(paramkbb);
    }
    for (;;)
    {
      if (bool) {
        this.a.a(this);
      }
      paramkbb.a(this);
      return;
      if (this.c != null)
      {
        this.d = new ArrayList();
        this.d.add(this.c);
        this.c = null;
        this.d.add(paramkbb);
        bool = false;
      }
      else
      {
        this.c = paramkbb;
        bool = true;
      }
    }
  }
  
  public final void b(kbb paramkbb)
  {
    efj.k();
    a();
    if (this.c == paramkbb)
    {
      this.c = null;
      this.a.b(this);
    }
    while (this.d == null) {
      return;
    }
    int i = this.d.size();
    for (int j = 0;; j++) {
      if (j < i)
      {
        if (this.d.get(j) == paramkbb) {
          this.d.remove(j);
        }
      }
      else
      {
        if (!this.d.isEmpty()) {
          break;
        }
        this.a.b(this);
        return;
      }
    }
  }
  
  public abstract void c();
  
  public void c(Object paramObject)
  {
    this.a.a(this, 1, paramObject);
  }
  
  public File f()
  {
    return null;
  }
  
  public File g()
  {
    return null;
  }
  
  public void i()
  {
    this.q = 0;
    this.p = null;
  }
  
  public final int o()
  {
    if (this.d != null) {
      return this.d.size();
    }
    if (this.c != null) {
      return 1;
    }
    return 0;
  }
  
  public final void p()
  {
    
    if (o() == 0)
    {
      i();
      return;
    }
    this.b = true;
    try
    {
      if (this.d != null)
      {
        Iterator localIterator = this.d.iterator();
        while (localIterator.hasNext()) {
          ((kbb)localIterator.next()).a(this);
        }
      }
      if (this.c == null) {
        break label87;
      }
    }
    finally
    {
      this.b = false;
    }
    this.c.a(this);
    label87:
    this.b = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append('@').append(System.identityHashCode(this)).append("\n  ID: ").append(this.o).append("\n  Status: ").append(c(this.q));
    if (this.u) {
      localStringBuilder.append("; downloading");
    }
    if (this.p != null) {
      a(localStringBuilder);
    }
    localStringBuilder.append("\n  Consumers:");
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        kbb localkbb = (kbb)localIterator.next();
        localStringBuilder.append("\n   ");
        a(localStringBuilder, localkbb);
      }
    }
    if (this.c != null)
    {
      localStringBuilder.append("\n   ");
      a(localStringBuilder, this.c);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("\n   none");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kaz
 * JD-Core Version:    0.7.0.1
 */