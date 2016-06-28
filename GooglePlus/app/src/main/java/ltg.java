import android.content.Context;
import android.net.Uri;
import java.util.Map;
import org.chromium.net.HttpUrlRequestListener;

final class ltg
  extends gzf
{
  private final HttpUrlRequestListener a;
  
  public ltg(lte paramlte, Context paramContext, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    super(paramContext, "SendCsiRequest");
    this.a = paramHttpUrlRequestListener;
  }
  
  protected final hae a()
  {
    hae localhae = new hae(true);
    lth locallth = this.b.a;
    lte locallte = this.b;
    String str1 = locallte.c.a();
    int i = locallte.c.b();
    if (i > locallte.e) {
      i = -1 + locallte.e;
    }
    String str2 = Uri.parse(str1).getQueryParameter("s");
    String str3 = Uri.parse(str1).getQueryParameter("action");
    kl localkl = new kl();
    localkl.put("s", str2);
    localkl.put("v", "3");
    localkl.put("action", str3);
    String str4 = Uri.parse(str1).getQueryParameter("it");
    int j = 0;
    if (j < i)
    {
      String str5 = locallte.c.a();
      if ((str2.equals(Uri.parse(str5).getQueryParameter("s"))) && (str3.equals(Uri.parse(str5).getQueryParameter("action"))))
      {
        String str6 = String.valueOf(str4);
        String str7 = String.valueOf(Uri.parse(str5).getQueryParameter("it"));
        str4 = 1 + String.valueOf(str6).length() + String.valueOf(str7).length() + str6 + "," + str7;
      }
      for (;;)
      {
        if (str4.length() > 2000) {
          break label306;
        }
        j++;
        break;
        gzj.a(locallte.d, new ltf(locallte, locallte.d, locallte.c, str5));
      }
    }
    label306:
    localkl.put("it", str4);
    locallth.a(aio.a(locallte.b, localkl), this.a);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltg
 * JD-Core Version:    0.7.0.1
 */