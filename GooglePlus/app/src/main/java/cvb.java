import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cvb
  implements jtj
{
  private Context a;
  
  public cvb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final List<dg> a(int paramInt, String paramString, mlw parammlw)
  {
    if ((parammlw.b == null) || (parammlw.b.a == null) || (TextUtils.isEmpty(parammlw.b.a.a)) || (TextUtils.isEmpty(parammlw.b.a.b))) {
      return null;
    }
    gnb localgnb = new gnb(new jjd(parammlw.b.a.a, parammlw.b.a.b, null));
    Intent localIntent1 = efj.a(this.a, paramInt, null, localgnb);
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "sayhello:".concat(str1);; str2 = new String("sayhello:"))
    {
      localIntent1.setData(Uri.parse(str2));
      fe localfe = new fe(this.a);
      Intent localIntent2 = efj.b(this.a, paramInt);
      localfe.a.add(localIntent2);
      localfe.a.add(localIntent1);
      PendingIntent localPendingIntent = localfe.a(paramInt, 134217728, null);
      return Arrays.asList(new dg[] { new dg(efj.sf, this.a.getString(aau.lY), localPendingIntent) });
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvb
 * JD-Core Version:    0.7.0.1
 */