import android.net.Uri;
import android.nfc.NfcAdapter.CreateBeamUrisCallback;
import android.nfc.NfcEvent;

final class cik
  implements NfcAdapter.CreateBeamUrisCallback
{
  cik(cij paramcij) {}
  
  public final Uri[] createBeamUris(NfcEvent paramNfcEvent)
  {
    if (this.a.b != null) {
      return this.a.b.a(this.a.a);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cik
 * JD-Core Version:    0.7.0.1
 */