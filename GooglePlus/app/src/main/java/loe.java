import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

public class loe
  implements lli
{
  public final Context a;
  
  public loe(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, llu paramllu)
  {
    if ((paramllu != null) && (!paramllu.a.isEmpty()) && (!TextUtils.isEmpty(paramllu.b)))
    {
      iiq localiiq = (iiq)mbb.b(this.a, iiq.class);
      if (localiiq != null) {
        localiiq.a(paramString1, paramString2, paramllu.a, paramllu.b, paramString4, paramString3, false);
      }
    }
    while (TextUtils.isEmpty(paramString4)) {
      return;
    }
    int i = ((git)mbb.a(this.a, git.class)).c();
    iis.a(this.a, i, paramString4, paramString2, paramString1);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, llu paramllu)
  {
    if (paramllu != null)
    {
      if ((paramllu.a.isEmpty()) || (TextUtils.isEmpty(paramllu.b))) {
        break label73;
      }
      localiiq = (iiq)mbb.b(this.a, iiq.class);
      if (localiiq != null) {
        localiiq.a(paramString1, paramString2, paramllu.a, paramllu.b, paramllu.c, paramString3, true);
      }
    }
    label73:
    while (TextUtils.isEmpty(paramllu.c))
    {
      iiq localiiq;
      return;
    }
    int i = ((git)mbb.a(this.a, git.class)).c();
    iis.a(this.a, i, paramllu.c, paramString2, paramString1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loe
 * JD-Core Version:    0.7.0.1
 */