import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Locale;

public final class ktn
  implements giv
{
  private final giz a;
  private final Context b;
  private String c;
  
  ktn(Activity paramActivity)
  {
    this.b = paramActivity.getApplicationContext();
    this.a = ((giz)mbb.a(paramActivity, giz.class));
    this.c = a(paramActivity.getIntent().getIntExtra("account_id", -1));
    git localgit = (git)mbb.b(paramActivity, git.class);
    if (localgit != null) {
      localgit.a(this);
    }
  }
  
  private final String a(int paramInt)
  {
    if (this.a.c(paramInt)) {
      return this.a.a(paramInt).b("account_name");
    }
    return null;
  }
  
  private final void a(gxq paramgxq)
  {
    gxr localgxr = new gxr();
    localgxr.b.add(paramgxq);
    gwz localgwz = new gwz(25, localgxr);
    localgwz.c = this.c;
    localgwz.b(this.b);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("AnalyticsAccount", 3))
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = paramgiu1.toString();
      arrayOfObject[1] = paramgiu2.toString();
      arrayOfObject[2] = Integer.valueOf(paramInt1);
      arrayOfObject[3] = Integer.valueOf(paramInt2);
      String.format(localLocale, "Account change notification: prevState=%s state=%s prevAccountId=%d accountId=%d", arrayOfObject);
    }
    if ((paramInt2 != paramInt1) && (giu.a != paramgiu2))
    {
      String str = a(paramInt2);
      if (!TextUtils.equals(str, this.c))
      {
        a(new gxq(pki.a));
        this.c = str;
        a(new gxq(pki.b));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ktn
 * JD-Core Version:    0.7.0.1
 */