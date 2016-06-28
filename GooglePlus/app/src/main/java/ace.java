import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ace
  extends BroadcastReceiver
{
  ace(acc paramacc) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) && (paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3))
    {
      int i = paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
      if ((i >= 0) && (i != this.a.j)) {
        this.a.a();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ace
 * JD-Core Version:    0.7.0.1
 */