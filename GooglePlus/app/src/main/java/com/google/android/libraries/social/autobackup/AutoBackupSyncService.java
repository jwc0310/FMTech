package com.google.android.libraries.social.autobackup;

import android.accounts.Account;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.os.Bundle;
import android.os.IBinder;
import hay;
import hbu;
import java.util.Iterator;
import java.util.List;
import mbb;
import mbe;

public final class AutoBackupSyncService
  extends Service
  implements mbe
{
  private static hay a;
  private static mbb b;
  
  private static hay a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        b = new mbb(paramContext, mbb.b(paramContext.getApplicationContext()));
        a = new hay(paramContext);
      }
      hay localhay = a;
      return localhay;
    }
    finally {}
  }
  
  public static void a(Context paramContext, Account paramAccount)
  {
    String str = hbu.f(paramContext);
    List localList = ContentResolver.getPeriodicSyncs(paramAccount, str);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        PeriodicSync localPeriodicSync = (PeriodicSync)localIterator.next();
        if (localPeriodicSync.period == 21600L) {
          i = 1;
        } else {
          ContentResolver.removePeriodicSync(paramAccount, str, localPeriodicSync.extras);
        }
      }
    }
    int i = 0;
    if (i == 0)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("sync_periodic", true);
      ContentResolver.addPeriodicSync(paramAccount, str, localBundle, 21600L);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    String str = hbu.f(paramContext);
    Account localAccount = new Account(paramString, "com.google");
    ContentResolver.setIsSyncable(localAccount, str, 0);
    ContentResolver.cancelSync(localAccount, str);
  }
  
  public final mbb aE_()
  {
    return b;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return a(this).getSyncAdapterBinder();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupSyncService
 * JD-Core Version:    0.7.0.1
 */