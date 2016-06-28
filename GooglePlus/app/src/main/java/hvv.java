import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class hvv
  extends BroadcastReceiver
{
  hvv(hvu paramhvu) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getBooleanExtra("noConnectivity", false)) {
      this.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvv
 * JD-Core Version:    0.7.0.1
 */