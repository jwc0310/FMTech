import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class cyo
  implements View.OnClickListener
{
  cyo(cyi paramcyi, bp parambp) {}
  
  public final void onClick(View paramView)
  {
    Uri localUri = efj.a(this.a, "plus_sync_address", "https://support.google.com/plus/?hl=%locale%");
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(localUri);
    this.b.a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyo
 * JD-Core Version:    0.7.0.1
 */