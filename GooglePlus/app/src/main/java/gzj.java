import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gzj
  implements mdz, mes, meu, mew, mez, mfa, mfd
{
  private static final haa e = new gzm();
  public final ArrayList<gzi> a = new ArrayList();
  public gzy b;
  public gzn c;
  public haa d = e;
  private final la<String, ArrayList<had>> f = new la();
  private Activity g;
  private boolean h;
  
  public gzj(Activity paramActivity, mek parammek)
  {
    this.g = paramActivity;
    paramActivity.getClass().getSimpleName();
    parammek.a(this);
  }
  
  public gzj(bk parambk, mek parammek)
  {
    parambk.getClass().getSimpleName();
    parammek.a(this);
  }
  
  @Deprecated
  public static hae a(gzf paramgzf)
  {
    return b(null, paramgzf);
  }
  
  public static void a(Context paramContext, gzf paramgzf)
  {
    Context localContext = paramContext.getApplicationContext();
    gzy localgzy = (gzy)mbb.a(paramContext, gzy.class);
    paramgzf.c(localContext);
    if (efj.j())
    {
      localgzy.a(paramgzf, null);
      return;
    }
    gzk localgzk = new gzk(localgzy, paramgzf);
    efj.m().post(localgzk);
  }
  
  public static hae b(Context paramContext, gzf paramgzf)
  {
    if (paramContext != null) {}
    for (localContext = paramContext.getApplicationContext();; localContext = null) {
      try
      {
        paramgzf.c(localContext);
        paramgzf.f();
        hae localhae = paramgzf.e(localContext);
        paramgzf.a_(localhae);
        return localhae;
      }
      finally
      {
        paramgzf.d(localContext);
      }
    }
  }
  
  public final gzj a(String paramString, had paramhad)
  {
    ArrayList localArrayList = (ArrayList)this.f.get(paramString);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.f.put(paramString, localArrayList);
    }
    localArrayList.add(paramhad);
    return this;
  }
  
  public final void a(Activity paramActivity)
  {
    this.g = paramActivity;
  }
  
  public final void a(Bundle paramBundle)
  {
    this.b = ((gzy)mbb.a(this.g, gzy.class));
    if (paramBundle != null) {}
    for (this.c = ((gzn)paramBundle.getParcelable("boc_background_tasks"));; this.c = new gzn(this.b))
    {
      if (!this.h)
      {
        hab localhab = (hab)mbb.b(this.g, hab.class);
        if ((localhab != null) && ((this.g instanceof bp)))
        {
          bz localbz = ((bp)this.g).b.a.d;
          this.d = localhab.a(this.g, localbz);
        }
      }
      return;
    }
  }
  
  public final void a(haa paramhaa)
  {
    if (paramhaa != null) {}
    for (;;)
    {
      this.d = paramhaa;
      this.h = true;
      return;
      paramhaa = e;
    }
  }
  
  final void a(String paramString, hae paramhae)
  {
    this.c.a(paramString);
    this.d.a(paramString);
    this.d.c = true;
    ArrayList localArrayList = (ArrayList)this.f.get(paramString);
    if (localArrayList != null) {
      for (int j = -1 + localArrayList.size(); j >= 0; j--) {
        ((had)localArrayList.get(j)).a(paramhae);
      }
    }
    for (int i = -1 + this.a.size(); i >= 0; i--) {
      ((gzi)this.a.get(i)).a(paramString, paramhae, this.d);
    }
    if (this.d.c) {
      this.d.a(paramhae);
    }
  }
  
  public final boolean a(String paramString)
  {
    if (this.c == null) {}
    while (this.b.a(this, paramString) <= 0) {
      return false;
    }
    return true;
  }
  
  public final void b()
  {
    gzy localgzy = this.b;
    efj.k();
    int i = this.c.b;
    localgzy.b.put(i, this);
    if (Log.isLoggable("BackgroundTask", 3)) {
      new StringBuilder(29).append("Register manager: ").append(i);
    }
    gzn localgzn = this.c;
    String[] arrayOfString2;
    int j;
    if (localgzn.c.isEmpty())
    {
      arrayOfString2 = gzn.a;
      j = arrayOfString2.length;
    }
    for (int k = 0;; k++)
    {
      if (k >= j) {
        return;
      }
      String str1 = arrayOfString2[k];
      int n;
      for (int m = efj.a((Integer)this.c.c.get(str1)) - localgzy.a(this, str1);; m = n)
      {
        n = m - 1;
        if (m <= 0) {
          break;
        }
        hae localhae = localgzy.f.a(i, str1);
        if (Log.isLoggable("BackgroundTask", 4))
        {
          String str2 = String.valueOf(localhae);
          new StringBuilder(40 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Deliver saved background task result: ").append(str1).append(", ").append(str2);
        }
        a(str1, localhae);
      }
      String[] arrayOfString1 = new String[localgzn.c.size()];
      arrayOfString2 = (String[])localgzn.c.keySet().toArray(arrayOfString1);
      break;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("boc_background_tasks", this.c);
  }
  
  public final void b(gzf paramgzf)
  {
    gzn localgzn = this.c;
    String str = paramgzf.f;
    Integer localInteger1 = (Integer)localgzn.c.get(str);
    if (localInteger1 == null) {}
    for (Integer localInteger2 = Integer.valueOf(1);; localInteger2 = Integer.valueOf(1 + localInteger1.intValue()))
    {
      localgzn.c.put(str, localInteger2);
      paramgzf.c(this.g.getApplicationContext());
      this.b.a(paramgzf, this);
      return;
    }
  }
  
  public final void b(String paramString)
  {
    int i = 0;
    gzy localgzy = this.b;
    if (this != null) {}
    for (int j = this.c.b;; j = 0)
    {
      int k = localgzy.c.size();
      while (i < k)
      {
        gzf localgzf = (gzf)localgzy.c.get(i);
        if ((localgzf.h == j) && (localgzf.f.equals(paramString))) {
          localgzf.i = true;
        }
        i++;
      }
      return;
    }
  }
  
  public final void c()
  {
    gzy localgzy = this.b;
    efj.k();
    int i = this.c.b;
    localgzy.b.remove(i);
    if (Log.isLoggable("BackgroundTask", 3)) {
      new StringBuilder(31).append("Unregister manager: ").append(i);
    }
  }
  
  public final void c(gzf paramgzf)
  {
    this.d.a(paramgzf, false);
    b(paramgzf);
  }
  
  public final void m_()
  {
    gzy localgzy;
    int i;
    int k;
    int m;
    if (this.g.isFinishing())
    {
      localgzy = this.b;
      i = this.c.b;
      int j = localgzy.c.size();
      k = 0;
      m = 0;
      if (k < j)
      {
        gzf localgzf = (gzf)localgzy.c.get(k);
        if (localgzf.h != i) {
          break label154;
        }
        localgzf.h = 0;
      }
    }
    label154:
    for (int i1 = m + 1;; i1 = m)
    {
      k++;
      m = i1;
      break;
      int n = localgzy.f.a(i);
      if (Log.isLoggable("BackgroundTask", 3)) {
        new StringBuilder(95).append("Permanently remove manager: ").append(i).append(", pending ops: ").append(m).append(", results dropped: ").append(n);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzj
 * JD-Core Version:    0.7.0.1
 */