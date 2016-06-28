package com.google.android.apps.plus.service;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import dmf;
import dmg;
import dmi;
import efj;
import giz;
import gjb;
import ild;
import ile;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kck;
import lrj;
import lrl;
import lrw;
import mbb;

public class EsSyncAdapterService
  extends Service
{
  static final ild a;
  public static final ild b;
  static final Object c = new Object();
  static PowerManager.WakeLock d;
  public static Map<String, dmg> e = Collections.synchronizedMap(new HashMap());
  public static dmg f;
  private static final Object g;
  private static dmi h;
  
  static
  {
    ile localile1 = new ile();
    localile1.b = 3600000L;
    a = new ild(localile1);
    ile localile2 = new ile();
    localile2.a = true;
    b = new ild(localile2);
    g = new Object();
    h = null;
  }
  
  public static lrj a(Context paramContext)
  {
    return new dmf(paramContext);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    a(paramContext, "android contacts", ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name"));
  }
  
  public static void a(Context paramContext, Account paramAccount)
  {
    if (paramAccount != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("ignore_settings", true);
      ContentResolver.requestSync(paramAccount, EsProvider.a(paramContext), localBundle);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    ContentResolver.setIsSyncable(new Account(paramString, "com.google"), EsProvider.a(paramContext), 1);
  }
  
  static void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((lrl)((lrw)mbb.a(paramContext, lrw.class)).b.get(paramString1) != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "No registered synclet for name %s", new Object[] { paramString1 });
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("ignore_settings", true);
      localBundle.putString("synclet_name", paramString1);
      ContentResolver.requestSync(new Account(paramString2, "com.google"), EsProvider.a(paramContext), localBundle);
      return;
    }
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    Account localAccount = new Account(paramString, "com.google");
    ContentResolver.setSyncAutomatically(localAccount, EsProvider.a(paramContext), true);
    b(paramContext, localAccount);
    a(paramContext, localAccount);
  }
  
  public static void b(Context paramContext)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      gjb localgjb = localgiz.a(i);
      if (!localgjb.c("is_plus_page"))
      {
        String str1 = localgjb.b("account_name");
        if (!TextUtils.isEmpty(str1))
        {
          b(paramContext, new Account(str1, "com.google"));
        }
        else if (Log.isLoggable("EsSyncAdapterService", 3))
        {
          String str2 = String.valueOf("Can NOT ensurePeriodicSyncScheduled since accountName is empty.Account ID: ");
          new StringBuilder(26 + String.valueOf(str2).length() + String.valueOf(str1).length()).append(str2).append(i).append(" Account Name: ").append(str1);
        }
      }
    }
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = new Intent("com.google.android.apps.plus.checkandengagesync");
    localIntent.putExtra("account", ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name"));
    Random localRandom = new Random();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 10 + localRandom.nextInt(5));
    localCalendar.set(12, localRandom.nextInt(60));
    if (localCalendar.getTimeInMillis() < System.currentTimeMillis()) {
      localCalendar.add(5, 1);
    }
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, localIntent, 0);
    localAlarmManager.cancel(localPendingIntent);
    localAlarmManager.setInexactRepeating(0, localCalendar.getTimeInMillis(), 86400000L, localPendingIntent);
  }
  
  static void b(Context paramContext, Account paramAccount)
  {
    List localList = ContentResolver.getPeriodicSyncs(paramAccount, EsProvider.a(paramContext));
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        PeriodicSync localPeriodicSync = (PeriodicSync)localIterator.next();
        if (localPeriodicSync.period == 3600L) {
          i = 1;
        } else {
          ContentResolver.removePeriodicSync(paramAccount, EsProvider.a(paramContext), localPeriodicSync.extras);
        }
      }
    }
    int i = 0;
    if (i == 0)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("sync_periodic", true);
      ContentResolver.addPeriodicSync(paramAccount, EsProvider.a(paramContext), localBundle, 3600L);
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    Account localAccount = new Account(paramString, "com.google");
    ContentResolver.setIsSyncable(localAccount, EsProvider.a(paramContext), 0);
    ContentResolver.cancelSync(localAccount, EsProvider.a(paramContext));
    dmg localdmg = (dmg)e.get(paramString);
    if (localdmg != null)
    {
      localdmg.a.a();
      e.remove(paramString);
    }
  }
  
  public static void c(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, new Intent("com.google.android.apps.plus.mandatorysync"), 0);
    localAlarmManager.cancel(localPendingIntent);
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    long l1 = SystemClock.elapsedRealtime();
    long l2 = localSharedPreferences.getLong("last_mandatory_sync_ts", 0L);
    int i;
    long l3;
    if (l2 == 0L)
    {
      i = 1;
      l3 = l1 + 43200000L;
    }
    for (;;)
    {
      if (i != 0) {
        d(paramContext);
      }
      localAlarmManager.setInexactRepeating(2, l3, 43200000L, localPendingIntent);
      return;
      if (43200000L + l2 <= 10000L + l1)
      {
        i = 1;
        l3 = l1 + 43200000L;
      }
      else
      {
        l3 = 43200000L + l2;
        i = 0;
      }
    }
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    return ContentResolver.getSyncAutomatically(new Account(paramString, "com.google"), EsProvider.a(paramContext));
  }
  
  public static void d(Context paramContext)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    localEditor.putLong("last_mandatory_sync_ts", SystemClock.elapsedRealtime());
    localEditor.commit();
    for (;;)
    {
      synchronized (c)
      {
        if (d == null) {
          d = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "mandatory_sync");
        }
        if (!d.isHeld())
        {
          d.acquire();
          i = 1;
          if (i != 0) {
            paramContext.startService(new Intent(paramContext, EsSyncAdapterService.MandatorySyncService.class));
          }
          return;
        }
      }
      int i = 0;
    }
  }
  
  public static void d(Context paramContext, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("ignore_settings", true);
    localBundle.putBoolean("sync_check_and_engage", true);
    ContentResolver.requestSync(new Account(paramString, "com.google"), EsProvider.a(paramContext), localBundle);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return h.getSyncAdapterBinder();
  }
  
  public void onCreate()
  {
    synchronized (g)
    {
      if (h == null) {
        h = new dmi(getApplicationContext());
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.EsSyncAdapterService
 * JD-Core Version:    0.7.0.1
 */