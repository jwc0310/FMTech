import android.content.IntentFilter;

public final class rjg
  extends IntentFilter
{
  public rjg(boolean paramBoolean)
  {
    addAction("android.net.conn.CONNECTIVITY_CHANGE");
    if (paramBoolean) {
      addAction("android.net.wifi.RSSI_CHANGED");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rjg
 * JD-Core Version:    0.7.0.1
 */