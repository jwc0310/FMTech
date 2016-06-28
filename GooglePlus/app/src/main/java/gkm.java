import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

final class gkm
  implements AccountManagerCallback<Bundle>
{
  gkm(gkl paramgkl, bk parambk) {}
  
  public final void run(AccountManagerFuture<Bundle> paramAccountManagerFuture)
  {
    try
    {
      if (this.a.i())
      {
        Intent localIntent = (Intent)((Bundle)paramAccountManagerFuture.getResult()).getParcelable("intent");
        gkl localgkl = this.b;
        bw localbw = this.a.h();
        gko localgko = (gko)localbw.a("new.account.launcher");
        if (localgko == null)
        {
          localgko = new gko();
          localbw.a().a(localgko, "new.account.launcher").c();
        }
        gkn localgkn = new gkn(localgkl, localgko, localIntent);
        efj.m().post(localgkn);
      }
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException(localException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkm
 * JD-Core Version:    0.7.0.1
 */