import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

public final class eif
  extends eix
{
  private eib a;
  private final int b;
  
  public eif(eib parameib, int paramInt)
  {
    this.a = parameib;
    this.b = paramInt;
  }
  
  public final void a(int paramInt, Bundle paramBundle)
  {
    efj.b(this.a, "onAccountValidationComplete can be called only once per call to validateAccount");
    eib localeib = this.a;
    int i = this.b;
    localeib.k.sendMessage(localeib.k.obtainMessage(5, i, -1, new eik(localeib, paramInt, paramBundle)));
    this.a = null;
  }
  
  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    efj.b(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
    this.a.a(paramInt, paramIBinder, paramBundle, this.b);
    this.a = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eif
 * JD-Core Version:    0.7.0.1
 */