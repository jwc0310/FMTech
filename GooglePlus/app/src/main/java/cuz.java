import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cuz
  implements jtj
{
  private Context a;
  
  public cuz(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final List<dg> a(int paramInt, String paramString, mlw parammlw)
  {
    if ((parammlw.c == null) || (parammlw.c.a == null) || (parammlw.c.a.length == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    mmr[] arrayOfmmr = parammlw.c.a;
    int i = arrayOfmmr.length;
    int j = 0;
    if (j < i)
    {
      mmr localmmr = arrayOfmmr[j];
      Boolean localBoolean;
      boolean bool;
      if ((!TextUtils.isEmpty(localmmr.a)) && (!TextUtils.isEmpty(localmmr.b)) && (!TextUtils.isEmpty(localmmr.d)))
      {
        localBoolean = localmmr.c;
        if (localBoolean != null) {
          break label175;
        }
        bool = false;
        label118:
        if (!bool) {
          break label185;
        }
      }
      label175:
      label185:
      for (ipm localipm = ipm.b;; localipm = ipm.a)
      {
        localArrayList.add(new jpu(ipf.a(this.a, localmmr.b, Long.parseLong(localmmr.a), localmmr.d, null, localipm)));
        j++;
        break;
        bool = localBoolean.booleanValue();
        break label118;
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    Intent localIntent1 = efj.a(this.a, paramInt, localArrayList, null);
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "photoshare:".concat(str1);; str2 = new String("photoshare:"))
    {
      localIntent1.setData(Uri.parse(str2));
      fe localfe = new fe(this.a);
      Intent localIntent2 = efj.b(this.a, paramInt);
      localfe.a.add(localIntent2);
      localfe.a.add(localIntent1);
      PendingIntent localPendingIntent = localfe.a(paramInt, 134217728, null);
      return Arrays.asList(new dg[] { new dg(efj.sh, this.a.getString(aau.pr), localPendingIntent) });
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuz
 * JD-Core Version:    0.7.0.1
 */