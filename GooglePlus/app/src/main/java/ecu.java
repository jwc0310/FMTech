import android.os.Handler;
import android.os.Looper;

public abstract class ecu
  extends ecw
{
  public boolean a;
  private Handler e = new Handler(Looper.getMainLooper());
  private long f = 1000L;
  private Runnable g = new ecv(this);
  
  public ecu(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramString1, paramString2, paramString3);
    a(false);
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (this.a != paramBoolean)
    {
      this.a = paramBoolean;
      if (paramBoolean) {
        this.e.postDelayed(this.g, this.f);
      }
    }
    else
    {
      return;
    }
    this.e.removeCallbacks(this.g);
  }
  
  protected abstract boolean a(long paramLong);
  
  public void b()
  {
    a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecu
 * JD-Core Version:    0.7.0.1
 */