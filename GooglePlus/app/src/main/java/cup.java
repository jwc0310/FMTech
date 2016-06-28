import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class cup
  implements ifd
{
  public final Map<String, String> a(Context paramContext, int paramInt, String paramString)
  {
    if (!iqw.a(paramString)) {
      return Collections.emptyMap();
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    if ((!localgiz.c(paramInt)) || (!localgiz.d(paramInt))) {
      return Collections.emptyMap();
    }
    String str1 = localgiz.a(paramInt).b("account_name");
    if (TextUtils.isEmpty(str1)) {
      return Collections.emptyMap();
    }
    try
    {
      kcn localkcn = ((kcm)mbb.a(paramContext, kcm.class)).a("oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
      String str2 = localkcn.a(paramContext, str1);
      if (str2 != null)
      {
        String str3 = Long.toString(localkcn.c(paramContext, str2).longValue());
        return new cuq(this, str2, str3);
      }
      Map localMap = Collections.emptyMap();
      return localMap;
    }
    catch (AuthenticatorException localAuthenticatorException)
    {
      new kqe(str1, 26, -1).b(paramContext);
      return Collections.emptyMap();
    }
    catch (IOException localIOException)
    {
      label147:
      break label147;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cup
 * JD-Core Version:    0.7.0.1
 */