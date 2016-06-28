import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class lcn
  extends BroadcastReceiver
{
  lcn(iud paramiud) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("bytes_uploaded", 0L);
    long l2 = paramIntent.getLongExtra("bytes_total", 1L);
    this.a.a(paramIntent.getData(), l1, l2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcn
 * JD-Core Version:    0.7.0.1
 */