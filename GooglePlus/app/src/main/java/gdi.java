import android.os.SystemClock;

abstract class gdi<M extends qat, E>
{
  final geg a;
  final gdm<E> b;
  final boolean c;
  
  gdi(gdh paramgdh, int paramInt)
  {
    this.a = new geg(paramgdh.b());
    if (gdn.a == paramInt) {}
    for (this.b = new gdl(this);; this.b = new gdj(this))
    {
      this.c = paramgdh.a();
      return;
    }
  }
  
  public void a(E paramE)
  {
    a(null, paramE);
  }
  
  public void a(String paramString, E paramE)
  {
    this.b.a(paramString, paramE);
    geg localgeg = this.a;
    synchronized (localgeg.a)
    {
      localgeg.b = (1 + localgeg.b);
      long l = SystemClock.elapsedRealtime();
      if (l - localgeg.c > 1000L)
      {
        localgeg.b = 0;
        localgeg.c = l;
      }
      return;
    }
  }
  
  public boolean a()
  {
    return (this.c) && (!this.a.a());
  }
  
  protected abstract void b(String paramString, E paramE);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gdi
 * JD-Core Version:    0.7.0.1
 */