import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class kck
{
  private String a;
  private boolean b;
  private long c;
  private final ArrayList<kcl> d = new ArrayList();
  private String e;
  private long f;
  private int g;
  private int h;
  public long l;
  public kbx m;
  public boolean n;
  public String o = "Account.SyncState";
  
  private final void a(int paramInt1, int paramInt2)
  {
    try
    {
      kcl localkcl = new kcl();
      localkcl.a = this.e;
      localkcl.b = (System.currentTimeMillis() - this.f);
      localkcl.c = paramInt1;
      localkcl.d = paramInt2;
      localkcl.e = this.l;
      localkcl.f = this.m;
      this.m = null;
      this.d.add(localkcl);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static boolean a(kck paramkck)
  {
    return (paramkck != null) && (!paramkck.n);
  }
  
  private static void b(kck paramkck)
  {
    for (;;)
    {
      kcl localkcl;
      try
      {
        String str1 = paramkck.o;
        if (!Log.isLoggable(str1, 4)) {
          break;
        }
        String str2 = paramkck.a;
        long l1 = System.currentTimeMillis() - paramkck.c;
        new StringBuilder(47 + String.valueOf(str2).length()).append(str2).append(" finished. Elapsed time: ").append(l1).append("ms");
        Iterator localIterator = paramkck.d.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localkcl = (kcl)localIterator.next();
        if (localkcl.c == 0)
        {
          l2 = localkcl.b;
          String str3 = localkcl.a;
          int j = localkcl.c;
          int k = localkcl.d;
          long l3 = localkcl.e;
          long l4 = localkcl.b;
          new StringBuilder(139 + String.valueOf(str3).length()).append("  [").append(str3).append("] items: ").append(j).append(", sub-items: ").append(k).append(", bytes: ").append(l3).append(", duration: ").append(l4).append("ms, avg: ").append(l2).append("ms");
          if (localkcl.f == null) {
            continue;
          }
          localkcl.f.a(str1, "    ");
          continue;
        }
        d1 = localkcl.b;
      }
      finally {}
      double d1;
      int i = localkcl.c;
      long l2 = (d1 / i);
    }
  }
  
  public final void a()
  {
    try
    {
      this.b = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.g = (paramInt + this.g);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.l = (paramLong + this.l);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      if (Log.isLoggable(this.o, 4)) {
        String.valueOf(paramString).concat(" started.");
      }
      this.a = paramString;
      this.b = false;
      this.c = System.currentTimeMillis();
      this.d.clear();
      return;
    }
    finally {}
  }
  
  public final void b(int paramInt)
  {
    try
    {
      a(paramInt, 0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b(String paramString)
  {
    try
    {
      this.e = paramString;
      this.f = System.currentTimeMillis();
      this.g = 0;
      this.h = 0;
      this.l = 0L;
      this.m = new kbx();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.b;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void c()
  {
    try
    {
      this.g = (1 + this.g);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void d()
  {
    try
    {
      a(this.g, 0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void e()
  {
    try
    {
      b(this);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kck
 * JD-Core Version:    0.7.0.1
 */