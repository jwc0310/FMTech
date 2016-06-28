import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.networkqueue.impl.PendingNetworkRequestsFragment;
import java.util.ArrayList;

public final class izv
  extends BroadcastReceiver
{
  public izv(PendingNetworkRequestsFragment paramPendingNetworkRequestsFragment) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getIntExtra("account_id", -1) != this.a.a) {
      return;
    }
    ArrayList localArrayList = paramIntent.getParcelableArrayListExtra("networkqueue_change_displayitems");
    PendingNetworkRequestsFragment.a(this.a, localArrayList);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izv
 * JD-Core Version:    0.7.0.1
 */