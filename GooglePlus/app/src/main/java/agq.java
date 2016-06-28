import android.view.animation.Interpolator;

public final class agq
{
  int a;
  int b;
  int c;
  int d = -1;
  Interpolator e;
  boolean f = false;
  int g = 0;
  
  public agq(int paramInt1, int paramInt2)
  {
    this(0, 0, -2147483648, null);
  }
  
  private agq(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = -2147483648;
    this.e = null;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.e = paramInterpolator;
    this.f = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agq
 * JD-Core Version:    0.7.0.1
 */