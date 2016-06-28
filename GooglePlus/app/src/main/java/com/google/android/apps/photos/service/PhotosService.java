package com.google.android.apps.photos.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.Log;
import aqn;

public class PhotosService
  extends Service
{
  private aqn a = new aqn(this);
  
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    AppOpsManager localAppOpsManager;
    if (Build.VERSION.SDK_INT >= 19) {
      localAppOpsManager = (AppOpsManager)paramContext.getSystemService("appops");
    }
    for (;;)
    {
      try
      {
        localAppOpsManager.checkPackage(paramInt, paramString);
        bool = true;
        return bool;
      }
      catch (SecurityException localSecurityException) {}
      String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt);
      boolean bool = false;
      if (paramString != null)
      {
        bool = false;
        if (arrayOfString != null) {
          for (int i = 0;; i++)
          {
            int j = arrayOfString.length;
            bool = false;
            if (i >= j) {
              break;
            }
            if (paramString.equals(arrayOfString[i])) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    if (Log.isLoggable("PhotosService", 3))
    {
      String str = String.valueOf(paramIntent);
      new StringBuilder(15 + String.valueOf(str).length()).append("onBind, intent=").append(str);
    }
    return this.a;
  }
  
  public void onDestroy()
  {
    this.a.h();
    super.onDestroy();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.service.PhotosService
 * JD-Core Version:    0.7.0.1
 */