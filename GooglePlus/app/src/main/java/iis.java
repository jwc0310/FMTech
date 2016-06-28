import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class iis
{
  private static final List<String> a = Arrays.asList(new String[] { "youtube.com", "google.com" });
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    b(paramContext, paramInt, paramString, null, null);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    b(paramContext, paramInt, paramString1, null, paramString2);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    b(paramContext, paramInt, paramString1, paramString2, paramString3);
  }
  
  public static Intent b(Context paramContext, int paramInt, String paramString)
  {
    return c(paramContext, paramInt, paramString);
  }
  
  private static void b(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    if (paramContext == null) {}
    do
    {
      return;
      try
      {
        localIntent = c(paramContext, paramInt, paramString1);
        if (!TextUtils.isEmpty(localIntent.getPackage())) {
          break label211;
        }
        bvn localbvn = (bvn)mbb.b(paramContext, bvn.class);
        if (localbvn == null) {
          break label211;
        }
        bool1 = localbvn.a(paramString3, paramInt, localIntent.getData());
      }
      catch (SecurityException localSecurityException)
      {
        Intent localIntent;
        boolean bool1;
        Bundle localBundle;
        int i;
        gxx localgxx;
        gxw localgxw;
        String str3 = String.valueOf(paramString1);
        if (str3.length() == 0) {
          break label280;
        }
        for (String str4 = "Unable to start activity for URL: ".concat(str3);; str4 = new String("Unable to start activity for URL: "))
        {
          Log.e("ViewUrlHelper", str4, localSecurityException);
          return;
          bool1 = false;
          break;
          String str5 = paramString1.toLowerCase(Locale.US);
          Iterator localIterator = a.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              boolean bool2 = str5.contains((String)localIterator.next());
              if (bool2)
              {
                i = 0;
                break;
              }
            }
          }
          i = 1;
          break label92;
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        str1 = String.valueOf(paramString1);
        if (str1.length() == 0) {
          break label330;
        }
      }
      if (!bool1) {
        paramContext.startActivity(localIntent);
      }
    } while (paramInt == -1);
    localBundle = gxy.a("extra_activity_id", paramString3);
    if (TextUtils.isEmpty(paramString1))
    {
      i = 0;
      label92:
      if (i != 0)
      {
        localBundle.putString("extra_external_url", paramString1);
        if (!TextUtils.isEmpty(paramString2)) {
          localBundle.putString("extra_creation_source_id", paramString2);
        }
      }
      localgxx = (gxx)mbb.a(paramContext, gxx.class);
      localgxw = new gxw(paramContext, paramInt);
      localgxw.c = gxz.V;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      return;
    }
    label211:
    String str1;
    label280:
    label330:
    for (String str2 = "Unable to start activity for URL: ".concat(str1);; str2 = new String("Unable to start activity for URL: "))
    {
      Log.e("ViewUrlHelper", str2, localActivityNotFoundException);
      return;
    }
  }
  
  private static Intent c(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    Uri localUri = localIntent.getData();
    String str3;
    int i;
    String str2;
    label108:
    int j;
    if (localUri != null)
    {
      str3 = localUri.getHost();
      if (TextUtils.isEmpty(str3))
      {
        i = 1;
        if (i == 0) {
          localIntent.addFlags(524288);
        }
        Bundle localBundle = new Bundle();
        localBundle.putString("Referer", "http://plus.url.google.com/mobileapp");
        localIntent.putExtra("com.android.browser.headers", localBundle);
        String str1 = String.valueOf(paramContext.getPackageName());
        if (str1.length() == 0) {
          break label368;
        }
        str2 = "android-app://".concat(str1);
        localIntent.putExtra("android.intent.extra.REFERRER_NAME", str2);
        localIntent.putExtra("com.android.browser.application_id", paramContext.getPackageName());
        localIntent.putExtra("create_new_tab", true);
        if (!TextUtils.isEmpty(localIntent.getPackage())) {
          break label388;
        }
        localIntent.setPackage("com.google.android.youtube");
        ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 0);
        if ((localResolveInfo == null) || (!"com.google.android.youtube".equals(localResolveInfo.activityInfo.packageName))) {
          break label382;
        }
        j = 1;
        label188:
        if ((j == 0) && (TextUtils.isEmpty(localIntent.getPackage())))
        {
          localIntent.setPackage(paramContext.getPackageName());
          if (paramContext.getPackageManager().resolveActivity(localIntent, 0) == null) {
            break label394;
          }
        }
      }
    }
    for (;;)
    {
      if (TextUtils.equals(localIntent.getPackage(), paramContext.getPackageName())) {
        localIntent.putExtra("account_id", paramInt);
      }
      return localIntent;
      String str4 = str3.toLowerCase();
      if ((str4.equals("plus.google.com")) || (str4.equals("plus.sandbox.google.com")))
      {
        i = 1;
        break;
      }
      if ((str4.equals("google.com")) || (str4.equals("www.google.com")))
      {
        List localList = localUri.getPathSegments();
        if (!localList.isEmpty())
        {
          String str5 = (String)localList.get(0);
          if ((!str5.equals("+")) && (str5.startsWith("+")))
          {
            i = 1;
            break;
          }
        }
      }
      i = 0;
      break;
      label368:
      str2 = new String("android-app://");
      break label108;
      label382:
      localIntent.setPackage(null);
      label388:
      j = 0;
      break label188;
      label394:
      localIntent.setPackage(null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iis
 * JD-Core Version:    0.7.0.1
 */