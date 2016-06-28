import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public final class aho
  implements MenuItem.OnMenuItemClickListener
{
  public aho(ShareActionProvider paramShareActionProvider) {}
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = yq.a(this.a.d, this.a.e).b(paramMenuItem.getItemId());
    if (localIntent != null)
    {
      String str = localIntent.getAction();
      if (("android.intent.action.SEND".equals(str)) || ("android.intent.action.SEND_MULTIPLE".equals(str)))
      {
        if (Build.VERSION.SDK_INT < 21) {
          break label87;
        }
        localIntent.addFlags(134742016);
      }
    }
    for (;;)
    {
      this.a.d.startActivity(localIntent);
      return true;
      label87:
      localIntent.addFlags(524288);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aho
 * JD-Core Version:    0.7.0.1
 */