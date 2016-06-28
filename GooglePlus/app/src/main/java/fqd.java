import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

final class fqd
  extends fqa
{
  public fqd(Context paramContext)
  {
    super(paramContext);
  }
  
  public final Account[] a(String paramString, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT <= 22) {
      return super.a(paramString, paramArrayOfString);
    }
    try
    {
      Account[] arrayOfAccount = ebf.a(this.a, paramString, paramArrayOfString);
      return arrayOfAccount;
    }
    catch (ebe localebe)
    {
      throw new fpv(localebe);
    }
  }
  
  public final Account[] b(String paramString)
  {
    if (Build.VERSION.SDK_INT <= 22) {
      return super.b(paramString);
    }
    try
    {
      Account[] arrayOfAccount = ebf.b(this.a, paramString);
      return arrayOfAccount;
    }
    catch (eeq localeeq)
    {
      throw new frv(localeeq.a, localeeq.getMessage(), new Intent(localeeq.b), localeeq);
    }
    catch (eep localeep)
    {
      throw new fru(localeep.a, localeep);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fqd
 * JD-Core Version:    0.7.0.1
 */