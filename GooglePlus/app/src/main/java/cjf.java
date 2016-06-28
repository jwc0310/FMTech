import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

final class cjf
  implements View.OnClickListener
{
  cjf(cjd paramcjd) {}
  
  public final void onClick(View paramView)
  {
    cjd localcjd = this.a;
    if (!TextUtils.equals(localcjd.a, "15")) {
      localcjd.a(efj.m(localcjd.bn, localcjd.am.c()));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjf
 * JD-Core Version:    0.7.0.1
 */