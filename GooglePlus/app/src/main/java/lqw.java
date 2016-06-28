import android.util.Log;

final class lqw
  implements oxr<pfk<lke>>
{
  boolean a = false;
  
  lqw(lqp paramlqp) {}
  
  public final void a() {}
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (!this.a)
    {
      this.a = true;
      this.b.b.a(this.b.a.a(this.b.p, this.b.l, this.b.k, paramInt1, paramInt2, true), oxx.a, this);
    }
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (Log.isLoggable("StreamViewManager", 3))
    {
      String str = String.valueOf(paramThrowable);
      new StringBuilder(7 + String.valueOf(str).length()).append("Error: ").append(str);
    }
    this.a = false;
  }
  
  public final void b()
  {
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqw
 * JD-Core Version:    0.7.0.1
 */