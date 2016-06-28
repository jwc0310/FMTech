import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

final class cjv
  implements View.OnClickListener
{
  cjv(cju paramcju, cjw paramcjw) {}
  
  public final void onClick(View paramView)
  {
    cju localcju = this.b;
    jjd localjjd = this.a.b;
    if (!TextUtils.isEmpty(localjjd.a)) {}
    for (String str1 = localjjd.a;; str1 = null)
    {
      String str4;
      if (str1 != null)
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0) {
          str4 = "g:".concat(str3);
        }
      }
      for (String str2 = str4;; str2 = null)
      {
        if (str2 != null)
        {
          int i = localcju.b.c();
          Intent localIntent = efj.a(localcju.a, i, str2, null, 0, false);
          localcju.a.startActivity(localIntent);
        }
        return;
        str4 = new String("g:");
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjv
 * JD-Core Version:    0.7.0.1
 */