import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.net.X509Util;

public final class rjl
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.security.STORAGE_CHANGED")) {}
    try
    {
      X509Util.b();
      return;
    }
    catch (CertificateException localCertificateException)
    {
      Log.e("X509Util", "Unable to reload the default TrustManager", localCertificateException);
      return;
    }
    catch (KeyStoreException localKeyStoreException)
    {
      Log.e("X509Util", "Unable to reload the default TrustManager", localKeyStoreException);
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Log.e("X509Util", "Unable to reload the default TrustManager", localNoSuchAlgorithmException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rjl
 * JD-Core Version:    0.7.0.1
 */