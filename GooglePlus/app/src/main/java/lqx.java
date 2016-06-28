import android.util.Log;

final class lqx
  implements oxr<pfk<lke>>
{
  boolean a = false;
  int b;
  int c;
  private int d;
  
  lqx(lqp paramlqp) {}
  
  public final void a() {}
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((this.c == paramInt2) && (this.b == paramInt1) && (this.d == this.e.p)) {
      if (Log.isLoggable("StreamViewManager", 3)) {
        new StringBuilder(59).append("Already requested DB offset: ").append(paramInt1).append(", size: ").append(paramInt2);
      }
    }
    do
    {
      return;
      if (Log.isLoggable("StreamViewManager", 3)) {
        new StringBuilder(49).append("DB request offset: ").append(paramInt1).append(", size: ").append(paramInt2);
      }
    } while (this.a);
    this.a = true;
    this.e.b.a(this.e.a.a(this.e.p, this.e.l, this.e.k, paramInt1, paramInt2, true), oxx.a, this);
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = this.e.p;
  }
  
  public final void a(Throwable paramThrowable)
  {
    this.a = false;
  }
  
  public final void b()
  {
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqx
 * JD-Core Version:    0.7.0.1
 */