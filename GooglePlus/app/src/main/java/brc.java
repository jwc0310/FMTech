import android.os.Process;
import android.util.Log;
import com.google.android.libraries.social.autobackup.FingerprintScannerIntentService;

final class brc
  implements Runnable
{
  brc(bra parambra, boolean paramBoolean) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      ((dka)mbb.a(this.b.a, dka.class)).a(false);
      if (this.a) {
        FingerprintScannerIntentService.a(this.b.a);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("EsLoginExtension", "Error refreshing all photos media after account activation", localException);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brc
 * JD-Core Version:    0.7.0.1
 */