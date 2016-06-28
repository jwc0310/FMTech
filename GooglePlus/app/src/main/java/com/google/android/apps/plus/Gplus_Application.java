package com.google.android.apps.plus;

import an;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Log;
import ao;
import bga;
import bgd;
import bgm;
import fqb;
import fwf;
import hgt;
import iah;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lqj;
import otl;
import oyu;
import oyv;
import ozj;
import pbd;
import pch;
import pcx;
import pdq;

public final class Gplus_Application
  extends Application
  implements oyv<bgm>
{
  private final Object a = new Object();
  private volatile bgm b;
  
  private bgm b()
  {
    c();
    return this.b;
  }
  
  private final void c()
  {
    if (this.b == null)
    {
      bgd localbgd;
      synchronized (this.a)
      {
        if (this.b != null) {
          break label248;
        }
        localbgd = new bgd();
        localbgd.a = new ozj(this);
        if (localbgd.a == null) {
          throw new IllegalStateException(String.valueOf(ozj.class.getCanonicalName()).concat(" must be set"));
        }
      }
      if (localbgd.b == null) {
        localbgd.b = new hgt();
      }
      if (localbgd.c == null) {
        localbgd.c = new pdq();
      }
      if (localbgd.d == null) {
        localbgd.d = new pcx();
      }
      if (localbgd.e == null) {
        localbgd.e = new otl();
      }
      if (localbgd.f == null) {
        localbgd.f = new fqb();
      }
      if (localbgd.g == null) {
        localbgd.g = new lqj();
      }
      if (localbgd.h == null) {
        localbgd.h = new pch();
      }
      if (localbgd.i == null) {
        localbgd.i = new pbd();
      }
      if (localbgd.j == null) {
        localbgd.j = new fwf();
      }
      this.b = new bga(localbgd);
    }
    label248:
  }
  
  protected final void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    if (!an.b) {
      if (Build.VERSION.SDK_INT < 4) {
        throw new RuntimeException("Multi dex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4" + ".");
      }
    }
    try
    {
      PackageManager localPackageManager = getPackageManager();
      String str1 = getPackageName();
      if ((localPackageManager == null) || (str1 == null)) {}
      ApplicationInfo localApplicationInfo;
      do
      {
        return;
        localApplicationInfo = localPackageManager.getApplicationInfo(str1, 128);
      } while (localApplicationInfo == null);
      String str2;
      synchronized (an.a)
      {
        str2 = localApplicationInfo.sourceDir;
        if (an.a.contains(str2)) {
          return;
        }
      }
      ClassLoader localClassLoader;
      File localFile;
      List localList1;
      List localList2;
      return;
    }
    catch (Exception localException)
    {
      Log.e("MultiDex", "Multidex installation failure", localException);
      throw new RuntimeException("Multi dex installation failed (" + localException.getMessage() + ").");
      an.a.add(str2);
      if (Build.VERSION.SDK_INT > 20) {
        new StringBuilder("MultiDex is not guaranteed to work in SDK version ").append(Build.VERSION.SDK_INT).append(": SDK version higher than 20").append(" should be backed by runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
      }
      try
      {
        localClassLoader = getClassLoader();
        if (localClassLoader == null)
        {
          Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
          return;
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        return;
      }
      localFile = new File(getFilesDir(), "secondary-dexes");
      localList1 = ao.a(this, localApplicationInfo, localFile, false);
      if (an.a(localList1)) {
        an.a(localClassLoader, localFile, localList1);
      }
      for (;;)
      {
        return;
        localList2 = ao.a(this, localApplicationInfo, localFile, true);
        if (!an.a(localList2)) {
          break;
        }
        an.a(localClassLoader, localFile, localList2);
      }
      throw new RuntimeException("Zip files were not valid.");
    }
    catch (RuntimeException localRuntimeException1) {}
  }
  
  public final void onCreate()
  {
    c();
    Iterator localIterator = this.b.i().iterator();
    while (localIterator.hasNext()) {
      ((oyu)localIterator.next()).a();
    }
    super.onCreate();
  }
  
  public final void onLowMemory()
  {
    super.onLowMemory();
    iah.a();
  }
  
  public final void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    iah.a(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.Gplus_Application
 * JD-Core Version:    0.7.0.1
 */