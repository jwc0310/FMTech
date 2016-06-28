import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class ier
  implements ieb
{
  private Context a;
  private String b;
  
  public ier(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  private static Uri.Builder a(Context paramContext, Uri.Builder paramBuilder)
  {
    String str1;
    try
    {
      paramBuilder.appendQueryParameter("version", String.valueOf(paramContext.getPackageManager().getPackageInfo(paramContext.getApplicationInfo().packageName, 0).versionCode));
      return paramBuilder;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (!Log.isLoggable("HelpUriGenerator", 6)) {}
      str1 = String.valueOf(paramContext.getApplicationInfo().packageName);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Error finding package ".concat(str1);; str2 = new String("Error finding package "))
    {
      Log.e("HelpUriGenerator", str2);
      return paramBuilder;
    }
  }
  
  public final Uri a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("getHelpUri(): fromWhere must be non-empty");
    }
    String str1 = this.b;
    Locale localLocale = Locale.getDefault();
    String str2 = String.valueOf(localLocale.getLanguage());
    String str3 = String.valueOf(localLocale.getCountry().toLowerCase(localLocale));
    String str4 = 1 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + "-" + str3;
    if (str1.contains("%locale%")) {}
    Uri.Builder localBuilder1;
    for (String str5 = str1.replace("%locale%", str4);; str5 = localBuilder1.build().toString())
    {
      Uri.Builder localBuilder2 = Uri.parse(str5).buildUpon();
      localBuilder2.appendQueryParameter("p", paramString);
      return a(this.a, localBuilder2).build();
      localBuilder1 = Uri.parse(str1).buildUpon();
      localBuilder1.appendQueryParameter("hl", str4);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ier
 * JD-Core Version:    0.7.0.1
 */