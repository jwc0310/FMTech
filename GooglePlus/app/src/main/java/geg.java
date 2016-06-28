import android.os.SystemClock;

public final class geg
{
  public final Object a = new Object();
  public int b = 0;
  public long c = 0L;
  private final int d;
  
  public geg(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final boolean a()
  {
    synchronized (this.a)
    {
      if (SystemClock.elapsedRealtime() - this.c > 1000L) {
        return false;
      }
      if (this.b >= this.d) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     geg
 * JD-Core Version:    0.7.0.1
 */