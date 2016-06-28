import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

public final class hxf
  implements hwv
{
  public final boolean a(Exception paramException, hwu paramhwu)
  {
    String str1 = null;
    if ((paramException instanceof kdd))
    {
      if (kdd.a(paramException, "APP_UPGRADE_REQUIRED"))
      {
        hwx.a(paramhwu.a(), paramhwu.b());
        return true;
      }
      kdd localkdd = (kdd)paramException;
      String str2 = localkdd.b;
      String str3 = localkdd.a;
      Resources localResources = paramhwu.a().getResources();
      String str4;
      if ("APP_UPGRADE_REQUIRED".equals(str2)) {
        str4 = localResources.getString(efj.Lx);
      }
      for (;;)
      {
        paramhwu.a(str1, str4);
        return true;
        if ("INVALID_CREDENTIALS".equals(str2))
        {
          str4 = localResources.getString(efj.Lu);
          str1 = null;
        }
        else if ("BAD_PROFILE".equals(str2))
        {
          str4 = localResources.getString(efj.Lw);
          str1 = null;
        }
        else
        {
          if ("ES_BLOCKED_FOR_DOMAIN_BY_ADMIN".equals(str2))
          {
            int i = efj.Lv;
            Object[] arrayOfObject = new Object[2];
            int j;
            if (!TextUtils.isEmpty(str3))
            {
              j = 1 + str3.indexOf('@');
              if (j >= str3.length()) {}
            }
            for (String str5 = str3.substring(j);; str5 = "")
            {
              arrayOfObject[0] = str5;
              arrayOfObject[1] = efj.j("https://support.google.com/a/answer/1631744/");
              str4 = localResources.getString(i, arrayOfObject);
              str1 = null;
              break;
            }
          }
          if (!"ES_STREAM_POST_RESTRICTIONS_NOT_SUPPORTED".equals(str2)) {
            break;
          }
          str1 = localResources.getString(efj.Lz);
          str4 = localResources.getString(efj.Ly);
        }
      }
      return false;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxf
 * JD-Core Version:    0.7.0.1
 */