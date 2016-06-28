import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy.Builder;

public final class hpu
  implements mes, mfd
{
  static final mcs a = new mcs("plusone.strictmode", (byte)0);
  
  public final void a(Bundle paramBundle)
  {
    StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyDeath().build());
    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().permitDiskReads().penaltyDeath().build());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpu
 * JD-Core Version:    0.7.0.1
 */