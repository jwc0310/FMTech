import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

public class fuj
{
  public final GoogleHelp a;
  public evj b;
  public boolean c;
  
  public fuj(String paramString)
  {
    this.a = new GoogleHelp(paramString);
  }
  
  public Intent a(Context paramContext)
  {
    if (this.c) {
      throw new IllegalStateException("Cannot call buildHelpIntent twice");
    }
    this.c = true;
    if (this.b != null)
    {
      GoogleHelp localGoogleHelp2 = this.a;
      localGoogleHelp2.w = ezk.a(this.b.a(), paramContext.getCacheDir());
      localGoogleHelp2.w.Y = "GoogleHelp";
    }
    GoogleHelp localGoogleHelp1 = this.a;
    return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", localGoogleHelp1);
  }
  
  public evj a()
  {
    if (this.b == null) {
      this.b = new evj();
    }
    return this.b;
  }
  
  public fuj a(Account paramAccount)
  {
    this.a.c = paramAccount;
    return this;
  }
  
  public fuj a(Activity paramActivity)
  {
    a(GoogleHelp.a(paramActivity));
    return this;
  }
  
  public fuj a(Bitmap paramBitmap)
  {
    a().a = paramBitmap;
    return this;
  }
  
  public fuj a(Uri paramUri)
  {
    this.a.q = paramUri;
    return this;
  }
  
  public fuj a(fun paramfun)
  {
    GoogleHelp localGoogleHelp = this.a;
    ThemeSettings localThemeSettings = new ThemeSettings();
    localThemeSettings.c = paramfun.a;
    localThemeSettings.b = paramfun.b;
    localGoogleHelp.t = localThemeSettings;
    return this;
  }
  
  public fuj a(String paramString)
  {
    a().e = paramString;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fuj
 * JD-Core Version:    0.7.0.1
 */