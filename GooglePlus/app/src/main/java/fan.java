import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

final class fan
  extends faq<fkx>
{
  fan(fam paramfam, efd paramefd, Uri paramUri, Bundle paramBundle)
  {
    super(paramefd);
  }
  
  protected final void a(Context paramContext, faj paramfaj)
  {
    fap localfap = new fap(this);
    Uri localUri = this.a;
    Bundle localBundle = this.b;
    paramContext.grantUriPermission("com.google.android.gms", localUri, 1);
    fao localfao = new fao(paramContext, localUri, localfap);
    try
    {
      paramfaj.a(localfao, localUri, localBundle, true);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramContext.revokeUriPermission(localUri, 1);
      throw localRemoteException;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramContext.revokeUriPermission(localUri, 1);
      throw localRuntimeException;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fan
 * JD-Core Version:    0.7.0.1
 */