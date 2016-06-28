import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class eii
  extends eic
{
  private IBinder c;
  
  public eii(eib parameib, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(parameib, paramInt, paramBundle);
    this.c = paramIBinder;
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    if (eib.e(this.d) != null) {
      eib.e(this.d).a(paramConnectionResult);
    }
    this.d.a(paramConnectionResult);
  }
  
  protected final boolean a()
  {
    try
    {
      String str = this.c.getInterfaceDescriptor();
      if (!this.d.d().equals(str)) {
        Log.e("GmsClient", "service descriptor mismatch: " + this.d.d() + " vs. " + str);
      }
      IInterface localIInterface;
      do
      {
        return false;
        localIInterface = this.d.a(this.c);
      } while ((localIInterface == null) || (!eib.a(this.d, 2, 3, localIInterface)));
      Bundle localBundle = this.d.b();
      if (eib.b(this.d) != null) {
        eib.b(this.d).a(localBundle);
      }
      return true;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eii
 * JD-Core Version:    0.7.0.1
 */