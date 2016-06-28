import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public class gzf
{
  private int a;
  public final Context e;
  public String f;
  gzg g;
  public int h;
  public boolean i;
  public boolean j;
  public int k = haf.b;
  
  @Deprecated
  public gzf(Context paramContext, String paramString)
  {
    if (paramContext != null) {}
    for (Context localContext = paramContext.getApplicationContext();; localContext = null)
    {
      this.e = localContext;
      this.f = paramString;
      if (paramString != null) {
        break;
      }
      throw new IllegalArgumentException("BackgroundTask tag cannot be null.");
    }
  }
  
  public gzf(String paramString)
  {
    this(null, paramString);
  }
  
  @Deprecated
  public hae a()
  {
    return null;
  }
  
  public hae a(Context paramContext)
  {
    return null;
  }
  
  public void a_(hae paramhae) {}
  
  @Deprecated
  public String b()
  {
    return null;
  }
  
  public String b(Context paramContext)
  {
    return null;
  }
  
  @Deprecated
  public String c()
  {
    return null;
  }
  
  final void c(Context paramContext)
  {
    if ((paramContext != null) || (this.e != null)) {}
    for (int m = 1; m == 0; m = 0) {
      throw new IllegalArgumentException();
    }
    if (paramContext != null) {}
    for (;;)
    {
      if ((this.j) && (this.a == 0)) {
        this.a = hac.a(paramContext).a();
      }
      return;
      paramContext = this.e;
    }
  }
  
  final void d(Context paramContext)
  {
    if ((paramContext != null) || (this.e != null)) {}
    for (int m = 1; m == 0; m = 0) {
      throw new IllegalArgumentException();
    }
    if (paramContext != null) {}
    for (;;)
    {
      hac localhac;
      int n;
      if (this.a != 0)
      {
        localhac = hac.a(paramContext);
        n = this.a;
      }
      synchronized (localhac.a)
      {
        PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)localhac.a.get(n);
        if (localWakeLock != null)
        {
          localWakeLock.release();
          localhac.a.remove(n);
        }
        return;
        paramContext = this.e;
      }
    }
  }
  
  final hae e(Context paramContext)
  {
    boolean bool;
    hae localhae1;
    if ((paramContext != null) || (this.e != null))
    {
      bool = true;
      efj.c(bool, "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.");
      localhae1 = a();
      if ((localhae1 != null) || (paramContext == null)) {
        break label130;
      }
    }
    label130:
    for (hae localhae2 = a(paramContext);; localhae2 = localhae1)
    {
      if (localhae2 == null)
      {
        String str = String.valueOf(getClass());
        throw new AssertionError(31 + String.valueOf(str).length() + "Null result in BackgroundTask: " + str);
        bool = false;
        break;
      }
      localhae2.f = this.k;
      localhae2.h = new pdz((pdd)pea.b.get());
      return localhae2;
    }
  }
  
  public void f() {}
  
  @Deprecated
  public final Context g()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzf
 * JD-Core Version:    0.7.0.1
 */