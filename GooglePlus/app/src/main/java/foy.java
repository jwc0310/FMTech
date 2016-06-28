import android.os.RemoteException;
import android.util.Log;

final class foy
  implements Runnable
{
  foy(fow paramfow, String paramString1, String paramString2, for paramfor) {}
  
  public final void run()
  {
    try
    {
      boolean bool = this.d.a.e.f();
      this.c.a(bool);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     foy
 * JD-Core Version:    0.7.0.1
 */