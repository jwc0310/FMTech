import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

final class fox
  implements Runnable
{
  fox(fow paramfow, List paramList, String paramString, for paramfor) {}
  
  public final void run()
  {
    try
    {
      x localx = this.d.a.e;
      Collections.unmodifiableSet(new HashSet(this.a));
      localx.e();
      CheckServerAuthResult localCheckServerAuthResult = new CheckServerAuthResult(false, null);
      this.c.a(localCheckServerAuthResult);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fox
 * JD-Core Version:    0.7.0.1
 */