import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class fqa
  implements fpw
{
  private static final long b = TimeUnit.SECONDS.toMillis(2L);
  public final Context a;
  
  public fqa(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final String a(String paramString1, String paramString2)
  {
    try
    {
      String str = ebf.a(this.a, paramString1, paramString2);
      return str;
    }
    catch (ebg localebg)
    {
      throw new fpx(localebg.a, localebg.getMessage(), localebg.a(), localebg);
    }
    catch (ebh localebh)
    {
      throw new fpy(localebh.getMessage(), localebh.a());
    }
    catch (ebe localebe)
    {
      throw new fpv(localebe);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      ebf.a(this.a, paramString);
      return;
    }
    catch (ebe localebe)
    {
      throw new IOException(localebe);
    }
  }
  
  public Account[] a(String paramString, String[] paramArrayOfString)
  {
    try
    {
      Account[] arrayOfAccount = (Account[])AccountManager.get(this.a).getAccountsByTypeAndFeatures(paramString, paramArrayOfString, null, null).getResult(b, TimeUnit.MILLISECONDS);
      return arrayOfAccount;
    }
    catch (AuthenticatorException localAuthenticatorException)
    {
      throw new fpv(localAuthenticatorException);
    }
    catch (OperationCanceledException localOperationCanceledException)
    {
      throw new IOException(localOperationCanceledException);
    }
  }
  
  public Account[] b(String paramString)
  {
    return AccountManager.get(this.a).getAccountsByType(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fqa
 * JD-Core Version:    0.7.0.1
 */