import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class ego
  implements efi
{
  ego(egl paramegl, eew parameew, int paramInt) {}
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    this.c.a.lock();
    try
    {
      this.c.s.a(paramConnectionResult, this.a, this.b);
      return;
    }
    finally
    {
      this.c.a.unlock();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ego
 * JD-Core Version:    0.7.0.1
 */