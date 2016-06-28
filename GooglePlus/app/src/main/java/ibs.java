import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public final class ibs
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    int i = 1;
    Uri localUri = paramIntent.getData();
    if ((localUri != null) && (efj.a(localUri)))
    {
      List localList = localUri.getPathSegments();
      if ((localList.size() < 3) || (!"_".equals(localList.get(0))) || (!"notifications".equals(localList.get(i))) || ((!"emlink".equals(localList.get(2))) && (!"ngemlink".equals(localList.get(2))))) {
        break label105;
      }
    }
    while (i == 0)
    {
      return null;
      label105:
      i = 0;
    }
    String str1 = localUri.getQueryParameter("path");
    if (TextUtils.isEmpty(str1)) {
      return null;
    }
    String str2;
    String str3;
    if (!str1.startsWith("/"))
    {
      String str5 = String.valueOf(str1);
      if (str5.length() != 0) {
        str1 = "/".concat(str5);
      }
    }
    else
    {
      str2 = String.valueOf("http://plus.google.com");
      str3 = String.valueOf(str1);
      if (str3.length() == 0) {
        break label226;
      }
    }
    label226:
    for (String str4 = str2.concat(str3);; str4 = new String(str2))
    {
      return new ibt(Uri.parse(str4), localUri.getQueryParameter("emr"));
      str1 = new String("/");
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibs
 * JD-Core Version:    0.7.0.1
 */