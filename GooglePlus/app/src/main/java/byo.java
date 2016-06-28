import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

final class byo
  implements View.OnClickListener
{
  byo(byl parambyl) {}
  
  public final void onClick(View paramView)
  {
    byl localbyl = this.a;
    if (!TextUtils.equals(localbyl.a, "15")) {
      localbyl.a(efj.m(localbyl.bn, localbyl.am.c()));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byo
 * JD-Core Version:    0.7.0.1
 */