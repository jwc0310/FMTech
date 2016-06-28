import android.graphics.Bitmap;

final class lss
  extends ibh
{
  public int j;
  public int k;
  public int l;
  public lss m;
  public Bitmap n;
  public volatile int o = 1;
  
  public lss(lsr paramlsr, int paramInt1, int paramInt2, int paramInt3)
  {
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
  }
  
  protected final void a(Bitmap paramBitmap)
  {
    lsr.a.a(paramBitmap);
  }
  
  protected final Bitmap aD_()
  {
    if (this.o == 8) {}
    for (boolean bool = true;; bool = false)
    {
      iaw.a(bool);
      int i = this.p.k - this.j >> this.l;
      int i1 = this.p.l - this.k >> this.l;
      a(Math.min(this.p.b, i), Math.min(this.p.b, i1));
      Bitmap localBitmap = this.n;
      this.n = null;
      this.o = 1;
      return localBitmap;
    }
  }
  
  public final int d()
  {
    return this.p.b;
  }
  
  public final int e()
  {
    return this.p.b;
  }
  
  final boolean k()
  {
    try
    {
      Bitmap localBitmap = (Bitmap)lsr.a.a();
      if ((localBitmap != null) && (localBitmap.getWidth() != this.p.b)) {
        localBitmap = null;
      }
      this.n = this.p.c.a(this.l, this.j, this.k, localBitmap);
    }
    catch (Throwable localThrowable)
    {
      label59:
      break label59;
    }
    return this.n != null;
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.j / this.p.b);
    arrayOfObject[1] = Integer.valueOf(this.k / this.p.b);
    arrayOfObject[2] = Integer.valueOf(this.p.e);
    arrayOfObject[3] = Integer.valueOf(this.p.d);
    return String.format("tile(%s, %s, %s / %s)", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lss
 * JD-Core Version:    0.7.0.1
 */