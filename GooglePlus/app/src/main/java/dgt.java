import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public final class dgt
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    int i = 1;
    String str1 = paramIntent.getAction();
    if (("android.intent.action.SEND".equals(str1)) || ("com.google.android.apps.plus.GOOGLE_PLUS_SHARE".equals(str1)))
    {
      String str2 = paramIntent.getStringExtra("com.google.android.apps.plus.CONTENT_URL");
      if (!TextUtils.isEmpty(str2))
      {
        Uri localUri = Uri.parse(str2);
        if (efj.a(localUri))
        {
          List localList = localUri.getPathSegments();
          int j = localList.size();
          if ((j >= 2) && ("u".equals(localList.get(0))))
          {
            localList = localList.subList(2, j);
            j -= 2;
          }
          if ((j < 3) || (!"posts".equals(localList.get(i)))) {}
        }
        while (i != 0)
        {
          return new dgu();
          i = 0;
        }
      }
      return new dgv();
    }
    if (("com.google.android.apps.plus.SHARE_GOOGLE".equals(str1)) || ("android.intent.action.SEND_MULTIPLE".equals(str1))) {
      return new dgv();
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgt
 * JD-Core Version:    0.7.0.1
 */