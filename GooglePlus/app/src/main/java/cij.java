import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;

public class cij
  implements mez, mfd
{
  final Activity a;
  final cil b;
  
  public cij(Activity paramActivity, mek parammek, cil paramcil)
  {
    this.a = paramActivity;
    this.b = paramcil;
    parammek.a(this);
  }
  
  @TargetApi(19)
  public final void b()
  {
    if (Build.VERSION.SDK_INT < 19) {}
    NfcAdapter localNfcAdapter;
    do
    {
      do
      {
        return;
      } while (this.a.getPackageManager().checkPermission("android.permission.NFC", this.a.getPackageName()) == -1);
      localNfcAdapter = NfcAdapter.getDefaultAdapter(this.a);
    } while (localNfcAdapter == null);
    localNfcAdapter.setBeamPushUris(null, this.a);
    localNfcAdapter.setBeamPushUrisCallback(new cik(this), this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cij
 * JD-Core Version:    0.7.0.1
 */