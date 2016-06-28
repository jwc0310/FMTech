import android.accounts.AuthenticatorException;
import android.content.Context;

class fpz
  implements fpu
{
  fpz() {}
  
  fpz(byte paramByte)
  {
    this();
  }
  
  public final String a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      String str = ebf.a(paramContext, paramString1, paramString2, null);
      return str;
    }
    catch (ebe localebe)
    {
      throw new AuthenticatorException("Cannot get Oauth2 token from GMS", localebe);
    }
  }
  
  public final void a(Context paramContext, String paramString)
  {
    try
    {
      ebf.a(paramContext, paramString);
      return;
    }
    catch (ebg localebg)
    {
      throw new AuthenticatorException("Cannot invalidate token", localebg);
    }
    catch (ebe localebe)
    {
      throw new AuthenticatorException("Cannot invalidate token", localebe);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpz
 * JD-Core Version:    0.7.0.1
 */