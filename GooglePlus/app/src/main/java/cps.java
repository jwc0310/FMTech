import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class cps
  implements View.OnClickListener
{
  cps(cpr paramcpr) {}
  
  public final void onClick(View paramView)
  {
    String str = (String)paramView.getTag(aaw.ld);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse(str), "image/*");
    this.a.d.startActivity(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cps
 * JD-Core Version:    0.7.0.1
 */