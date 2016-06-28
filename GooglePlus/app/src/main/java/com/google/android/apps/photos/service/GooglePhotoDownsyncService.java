package com.google.android.apps.photos.service;

import android.accounts.Account;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import aun;
import auq;
import bup;
import duj;
import giz;
import gjb;
import hyi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kl;
import mbb;

public class GooglePhotoDownsyncService
  extends Service
{
  private static final long a = TimeUnit.HOURS.toSeconds(2L);
  private static final Object b = new Object();
  private static auq c;
  private static final kl<String, bup> d = new kl();
  
  public static bup a(String paramString)
  {
    synchronized (d)
    {
      bup localbup = (bup)d.get(paramString);
      if (localbup == null)
      {
        localbup = new bup();
        localbup.o = "PhotoSyncService";
        d.put(paramString, localbup);
      }
      return localbup;
    }
  }
  
  public static void a(Context paramContext)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in", "is_google_plus" }).iterator();
    while (localIterator.hasNext())
    {
      gjb localgjb = localgiz.a(((Integer)localIterator.next()).intValue());
      if (!localgjb.c("is_managed_account")) {
        a(paramContext, new Account(localgjb.b("account_name"), "com.google"));
      }
    }
  }
  
  private static void a(Context paramContext, Account paramAccount)
  {
    String str = paramAccount.name;
    long l = Math.max(a, ((hyi)mbb.a(paramContext, hyi.class)).c(aun.b, str).longValue());
    Iterator localIterator = ContentResolver.getPeriodicSyncs(paramAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider").iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      PeriodicSync localPeriodicSync = (PeriodicSync)localIterator.next();
      if (localPeriodicSync.period == l) {}
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          ContentResolver.removePeriodicSync(paramAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", localPeriodicSync.extras);
        }
        i |= j;
        break;
      }
    }
    if (i == 0)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("sync_periodic", true);
      ContentResolver.addPeriodicSync(paramAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", localBundle, l);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    Account localAccount = new Account(paramString, "com.google");
    ContentResolver.setSyncAutomatically(localAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", true);
    a(paramContext, localAccount);
  }
  
  public static void b(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (localSharedPreferences.getBoolean("downsync_installed", false)) {
      return;
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in", "is_google_plus" }).iterator();
    while (localIterator.hasNext())
    {
      String str = localgiz.a(((Integer)localIterator.next()).intValue()).b("account_name");
      if ((ContentResolver.getSyncAutomatically(new Account(str, "com.google"), "com.google.android.apps.plus.iu.EsGoogleIuProvider")) && (!duj.a(paramContext))) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label139;
        }
        a(paramContext, str);
        break;
      }
      label139:
      b(paramContext, str);
    }
    localSharedPreferences.edit().putBoolean("downsync_installed", true).commit();
  }
  
  public static void b(Context paramContext, String paramString)
  {
    Account localAccount = new Account(paramString, "com.google");
    ContentResolver.setIsSyncable(localAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", 0);
    ContentResolver.cancelSync(localAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider");
  }
  
  public static void c(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (!localSharedPreferences.getBoolean("downsync_installed", false)) {
      return;
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in", "is_google_plus" }).iterator();
    while (localIterator.hasNext()) {
      b(paramContext, localgiz.a(((Integer)localIterator.next()).intValue()).b("account_name"));
    }
    localSharedPreferences.edit().putBoolean("downsync_installed", false).commit();
  }
  
  public static void c(Context paramContext, String paramString)
  {
    ContentResolver.setIsSyncable(new Account(paramString, "com.google"), "com.google.android.apps.photos.GooglePhotoDownsyncProvider", 1);
  }
  
  public static boolean d(Context paramContext, String paramString)
  {
    return ContentResolver.getSyncAutomatically(new Account(paramString, "com.google"), "com.google.android.apps.photos.GooglePhotoDownsyncProvider");
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return c.getSyncAdapterBinder();
  }
  
  public void onCreate()
  {
    synchronized (b)
    {
      if (c == null) {
        c = new auq(getApplicationContext());
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.service.GooglePhotoDownsyncService
 * JD-Core Version:    0.7.0.1
 */