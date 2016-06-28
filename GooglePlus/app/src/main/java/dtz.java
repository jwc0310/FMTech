import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public final class dtz
{
  private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  private static final String[] b = { "android_id" };
  private Boolean c;
  
  public static long a(Context paramContext)
  {
    long l1 = 0L;
    for (;;)
    {
      try
      {
        localCursor2 = paramContext.getContentResolver().query(a, null, null, b, null);
        if (localCursor2 == null) {}
      }
      finally
      {
        String str;
        long l3;
        long l2;
        label78:
        localCursor1 = null;
        if (localCursor1 != null) {
          localCursor1.close();
        }
      }
      for (;;)
      {
        try
        {
          if (localCursor2.moveToFirst())
          {
            str = localCursor2.getString(1);
            if (str == null) {
              break label78;
            }
          }
        }
        finally
        {
          localCursor1 = localCursor2;
          break label88;
        }
        try
        {
          l3 = Long.parseLong(str);
          l2 = l3;
          l1 = l2;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          break;
        }
      }
      if (localCursor2 != null) {
        localCursor2.close();
      }
      return l1;
      l2 = l1;
    }
  }
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT > 18;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      localPackageManager.getPackageInfo(paramString, 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      boolean bool = paramContext.getPackageManager().getApplicationInfo(paramString1, 128).metaData.getBoolean(paramString2);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean b(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType() != 0;
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      ((frz)mbb.a(paramContext, frz.class)).a(localPackageManager, paramString);
      return true;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public final boolean a(Context paramContext, int paramInt)
  {
    boolean bool1 = false;
    int j;
    boolean bool5;
    if (paramInt != -1)
    {
      gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
      boolean bool2 = localgjb.c("is_plus_page");
      boolean bool3 = localgjb.c("is_google_plus");
      bool1 = false;
      if (bool3)
      {
        bool1 = false;
        if (!bool2) {
          if (this.c == null)
          {
            FeatureInfo[] arrayOfFeatureInfo = paramContext.getPackageManager().getSystemAvailableFeatures();
            if ((arrayOfFeatureInfo == null) || (arrayOfFeatureInfo.length <= 0)) {
              break label173;
            }
            int i = arrayOfFeatureInfo.length;
            j = 0;
            if (j >= i) {
              break label173;
            }
            FeatureInfo localFeatureInfo = arrayOfFeatureInfo[j];
            if (localFeatureInfo.name != null) {
              break label167;
            }
            if (localFeatureInfo.reqGlEsVersion >> 16 < 2) {
              break label161;
            }
            bool5 = true;
          }
        }
      }
    }
    for (;;)
    {
      this.c = Boolean.valueOf(bool5);
      boolean bool4 = this.c.booleanValue();
      bool1 = false;
      if (bool4) {
        bool1 = true;
      }
      return bool1;
      label161:
      bool5 = false;
      continue;
      label167:
      j++;
      break;
      label173:
      bool5 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtz
 * JD-Core Version:    0.7.0.1
 */