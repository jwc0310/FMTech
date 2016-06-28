package org.chromium.net;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

@Deprecated
public final class UserAgent
{
  private static final Object a = new Object();
  private static int b = 0;
  
  public static String a(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramContext.getPackageName());
    localStringBuilder.append('/');
    localStringBuilder.append(b(paramContext));
    localStringBuilder.append(" (Linux; U; Android ");
    localStringBuilder.append(Build.VERSION.RELEASE);
    localStringBuilder.append("; ");
    localStringBuilder.append(Locale.getDefault().toString());
    String str1 = Build.MODEL;
    if (str1.length() > 0)
    {
      localStringBuilder.append("; ");
      localStringBuilder.append(str1);
    }
    String str2 = Build.ID;
    if (str2.length() > 0)
    {
      localStringBuilder.append("; Build/");
      localStringBuilder.append(str2);
    }
    localStringBuilder.append("; Cronet/");
    localStringBuilder.append("48.0.2564.8");
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  private static int b(Context paramContext)
  {
    synchronized (a)
    {
      PackageManager localPackageManager;
      String str;
      if (b == 0)
      {
        localPackageManager = paramContext.getPackageManager();
        str = paramContext.getPackageName();
      }
      try
      {
        b = localPackageManager.getPackageInfo(str, 0).versionCode;
        int i = b;
        return i;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        throw new IllegalStateException("Cannot determine package version");
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.UserAgent
 * JD-Core Version:    0.7.0.1
 */