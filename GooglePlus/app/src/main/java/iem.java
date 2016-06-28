import android.accounts.Account;
import android.app.Activity;
import android.content.Context;

public final class iem
  implements idx
{
  private final hzx a;
  
  iem(Context paramContext)
  {
    this.a = ((hzx)mbb.a(paramContext, hzx.class));
  }
  
  iem(hzx paramhzx)
  {
    this.a = paramhzx;
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    fuj localfuj = ((fuk)mbb.a(paramActivity, fuk.class)).a(paramString2);
    localfuj.a(this.a.a());
    localfuj.a(paramActivity);
    localfuj.a(paramString3);
    if (paramString1 != null) {
      localfuj.a(new Account(paramString1, "com.google"));
    }
    iaa localiaa = this.a.b();
    fum localfum = (fum)mbb.a(paramActivity, fum.class);
    if (localiaa != null)
    {
      fun localfun = new fun();
      localfun.b = localiaa.b;
      localfun.a = localiaa.a;
      localfuj.a(localfun);
    }
    localfum.a(paramActivity).a(localfuj.a(paramActivity));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iem
 * JD-Core Version:    0.7.0.1
 */