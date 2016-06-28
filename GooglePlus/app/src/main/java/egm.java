import android.os.Bundle;
import java.util.concurrent.locks.Lock;

final class egm
  implements efg
{
  egm(egl paramegl) {}
  
  public final void a(int paramInt)
  {
    this.a.a.lock();
    try
    {
      this.a.s.a(paramInt);
      return;
    }
    finally
    {
      this.a.a.unlock();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    this.a.a.lock();
    try
    {
      this.a.s.a(paramBundle);
      return;
    }
    finally
    {
      this.a.a.unlock();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egm
 * JD-Core Version:    0.7.0.1
 */