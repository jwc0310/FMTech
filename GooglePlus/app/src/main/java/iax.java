import java.util.WeakHashMap;

public abstract class iax
  implements ibg
{
  public static WeakHashMap<iax, Object> g = new WeakHashMap();
  private static ThreadLocal<Class<iax>> j = new ThreadLocal();
  public int a = -1;
  public int b = 0;
  public int c = -1;
  public int d = -1;
  boolean e;
  public iaz f = null;
  private int h;
  private int i;
  
  protected iax()
  {
    this(null, 0, 0);
  }
  
  protected iax(iaz paramiaz, int paramInt1, int paramInt2)
  {
    synchronized (g)
    {
      g.put(this, null);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    int k;
    if (paramInt1 > 0)
    {
      k = iaw.a(paramInt1);
      this.h = k;
      if (paramInt2 <= 0) {
        break label110;
      }
    }
    label110:
    for (int m = iaw.a(paramInt2);; m = 0)
    {
      this.i = m;
      if ((this.h > 4096) || (this.i > 4096))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(this.h);
        arrayOfObject[1] = Integer.valueOf(this.i);
        String.format("texture is too large: %d x %d", arrayOfObject);
        new Exception();
      }
      return;
      k = 0;
      break;
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  protected abstract boolean a(iaz paramiaz);
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public int d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.i;
  }
  
  protected abstract int f();
  
  protected void finalize()
  {
    j.set(iax.class);
    g();
    j.set(null);
  }
  
  public void g()
  {
    iaz localiaz = this.f;
    if ((localiaz != null) && (this.a != -1))
    {
      localiaz.a(this);
      this.a = -1;
    }
    this.b = 0;
    this.f = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iax
 * JD-Core Version:    0.7.0.1
 */