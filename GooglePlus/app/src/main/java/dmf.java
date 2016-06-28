import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.plus.service.EsSyncAdapterService;

public final class dmf
  implements lrj
{
  public dmf(Context paramContext) {}
  
  public final void a(int paramInt)
  {
    giz localgiz = (giz)mbb.a(this.a, giz.class);
    if (!localgiz.c(paramInt)) {
      return;
    }
    Account localAccount = new Account(localgiz.a(paramInt).b("account_name"), "com.google");
    EsSyncAdapterService.a(this.a, localAccount);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmf
 * JD-Core Version:    0.7.0.1
 */