package com.google.android.libraries.social.albumupload.impl;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import efj;
import giz;
import gjb;
import gvp;
import gvq;
import gvv;
import gwb;
import gwc;
import gwg;
import gwi;
import gwj;
import gwn;
import gwp;
import gwr;
import gws;
import gwt;
import hsb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jpn;
import jpp;
import jrv;
import mbb;

public class UploadSchedulerService
  extends IntentService
{
  private static final long a = TimeUnit.SECONDS.toMillis(10L);
  private final BroadcastReceiver b = new gwt(this);
  private final SparseArray<gwn> c = new SparseArray();
  private gvp d;
  private giz e;
  private gwi f;
  private gwp g;
  
  public UploadSchedulerService()
  {
    super("AlbumUploadService");
  }
  
  private gwn a(int paramInt)
  {
    if (this.c.get(paramInt) == null) {
      this.c.put(paramInt, new gwn(getApplicationContext(), paramInt));
    }
    return (gwn)this.c.get(paramInt);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    paramContext.startService(b(paramContext, paramInt));
  }
  
  private static Intent b(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, UploadSchedulerService.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public void onCreate()
  {
    super.onCreate();
    Context localContext = getApplicationContext();
    this.d = ((gvp)mbb.b(localContext, gvp.class));
    if (this.d == null) {
      this.d = gwj.a;
    }
    this.e = ((giz)mbb.a(localContext, giz.class));
    this.f = ((gwi)mbb.a(localContext, gwi.class));
    this.g = ((gwp)mbb.a(localContext, gwp.class));
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    int i;
    if (paramIntent != null) {
      i = paramIntent.getIntExtra("account_id", -1);
    }
    label80:
    int j;
    label139:
    label195:
    label203:
    gwn localgwn1;
    long l1;
    int k;
    label239:
    long l3;
    for (;;)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.e.a(new String[] { "logged_in" }));
      if (i != -1)
      {
        localArrayList.remove(Integer.valueOf(i));
        localArrayList.add(0, Integer.valueOf(i));
      }
      Iterator localIterator = localArrayList.iterator();
      int m;
      if (localIterator.hasNext())
      {
        j = ((Integer)localIterator.next()).intValue();
        gwn localgwn2 = a(j);
        if (gwg.a(hsb.b(localgwn2.a, localgwn2.b)) == -1L)
        {
          m = 1;
          if (m != 0) {
            break label195;
          }
        }
      }
      for (;;)
      {
        if (j != -1)
        {
          if (efj.J(getApplicationContext())) {
            break label203;
          }
          IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
          getApplicationContext().registerReceiver(this.b, localIntentFilter);
        }
        return;
        i = -1;
        break;
        m = 0;
        break label139;
        break label80;
        j = -1;
      }
      localgwn1 = a(j);
      l1 = localgwn1.a(this.g.c);
      if (l1 != -1L) {
        break;
      }
      k = gws.d;
      if (k != gws.c) {
        break label502;
      }
      l3 = this.d.b();
      if (l3 >= a) {
        break label780;
      }
      try
      {
        Thread.sleep(l3);
      }
      catch (InterruptedException localInterruptedException) {}
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(localgwn1.a, localgwn1.b);
    gvv localgvv = localgwn1.c.a(localSQLiteDatabase, l1);
    long l2 = localgvv.b;
    gwb localgwb = gwc.a(hsb.b(localgwn1.a, localgwn1.b), l2);
    String str1;
    label344:
    String str2;
    gvq localgvq;
    gwp localgwp;
    String str3;
    String str4;
    gwr localgwr;
    if (localgwb == null)
    {
      str1 = null;
      str2 = localgvv.a;
      localgvq = gvq.a(j, str1, l2);
      this.f.a(localgvq);
      localgwp = this.g;
      str3 = localgwp.a(str2);
      str4 = localgwp.b.a(j).b("gaia_id");
      if (!TextUtils.isEmpty(str3)) {
        break label514;
      }
      localgwr = gwr.a(gws.d);
      label424:
      if ((localgwr.a != gws.a) && (localgwr.a != gws.d) && (localgwr.a != gws.e)) {
        break label698;
      }
      label457:
      if (localgwr.a != gws.a) {
        break label716;
      }
      localgwn1.a(l1, localgwr.b, localgwr.c);
    }
    for (;;)
    {
      this.f.a(localgvq);
      k = localgwr.a;
      break label239;
      label502:
      break;
      str1 = localgwb.a;
      break label344;
      label514:
      jrv localjrv = new jrv(localgwp.a, j, str4, Arrays.asList(new String[] { str3 }));
      localjrv.i();
      if ((!localjrv.n()) && (localjrv.a.containsKey(str3)))
      {
        long l4 = localjrv.b(str3);
        if (!"instant".equals(str1))
        {
          Context localContext2 = localgwp.a;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = Long.toString(l4);
          jpp localjpp = new jpp(localContext2, j, str1, null, Arrays.asList(arrayOfString), jpn.a);
          localjpp.i();
          if (!localjpp.n())
          {
            localgwr = gwr.a((String)localjpp.c.get(0), (String)localjpp.d.get(0));
            break label424;
          }
        }
      }
      localgwr = gwr.a(gws.c);
      break label424;
      label698:
      localgwr = this.g.a(j, str1, str2);
      break label457;
      label716:
      if (localgwr.a == gws.d) {
        localgwn1.a(l1, 0);
      } else if (localgwr.a == gws.e) {
        localgwn1.a(l1);
      } else {
        localgwn1.a(l1, this.d.a());
      }
    }
    label780:
    Context localContext1 = getApplicationContext();
    Intent localIntent = b(localContext1, j);
    ((AlarmManager)localContext1.getSystemService("alarm")).set(3, l3 + SystemClock.elapsedRealtime(), PendingIntent.getService(localContext1, 0, localIntent, 0));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.albumupload.impl.UploadSchedulerService
 * JD-Core Version:    0.7.0.1
 */