package com.google.android.apps.plus.widget;

import aau;
import aaw;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.apps.plus.phone.HomeActivity;
import dub;
import eao;
import eap;
import eaq;
import ear;
import efj;
import fe;
import gwz;
import gxq;
import gxr;
import gxt;
import hdg;
import hdo;
import ipb;
import ipc;
import ipf;
import ipm;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import jiw;
import kbc;
import kbm;
import kck;
import lln;
import llt;
import llx;
import lmp;
import lnc;
import lwh;
import mbb;
import mfo;
import pkh;

public class EsWidgetService
  extends IntentService
{
  public static ipb a;
  public static hdg b;
  private static final int[] c;
  private static boolean d;
  private static Bitmap e;
  private static int f;
  private static int g;
  private static int h;
  private lln i;
  private jiw j;
  
  static
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = aaw.lw;
    arrayOfInt[1] = aaw.lx;
    arrayOfInt[2] = aaw.ly;
    c = arrayOfInt;
  }
  
  public EsWidgetService()
  {
    super("EsWidgetService");
  }
  
  private final Cursor a(int paramInt, ear paramear)
  {
    if (Log.isLoggable("EsWidget", 3)) {
      new StringBuilder(24).append("[").append(paramInt).append("] loadCursor");
    }
    int k = paramear.a;
    String str1 = paramear.b;
    String str2;
    if ((TextUtils.isEmpty(str1)) || (TextUtils.equals(str1, "v.all.circles"))) {
      str2 = efj.a(null, null, true, null, null, 1, null);
    }
    for (;;)
    {
      return this.i.a(k, lnc.a, str2, true, true, Integer.toString(10));
      if (TextUtils.equals("v.whatshot", str1)) {
        str2 = efj.a(null, null, true, null, null, 2, null);
      } else {
        str2 = efj.a(null, str1, true, null, null, 1, null);
      }
    }
  }
  
  private final RemoteViews a(ear paramear, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    int k = paramear.a;
    if (Log.isLoggable("EsWidget", 3))
    {
      int i10 = paramCursor.getPosition();
      new StringBuilder(44).append("[").append(paramInt).append("] createRemoteViews: ").append(i10);
    }
    localRemoteViews = new RemoteViews(getPackageName(), efj.wM);
    localRemoteViews.setViewVisibility(aaw.mz, 8);
    localRemoteViews.setViewVisibility(aaw.S, 8);
    localRemoteViews.setViewVisibility(aaw.R, 8);
    localRemoteViews.setViewVisibility(aaw.P, 8);
    localRemoteViews.setViewVisibility(aaw.Q, 8);
    localRemoteViews.setViewVisibility(aaw.W, 8);
    localRemoteViews.setViewVisibility(aaw.U, 8);
    localRemoteViews.setViewVisibility(aaw.em, 8);
    localRemoteViews.setViewVisibility(aaw.el, 8);
    localRemoteViews.setViewVisibility(aaw.mj, 8);
    localRemoteViews.setViewVisibility(aaw.eu, 8);
    localRemoteViews.setViewVisibility(aaw.et, 8);
    localRemoteViews.setViewVisibility(aaw.ev, 8);
    String str1 = paramCursor.getString(2);
    if (str1 == null) {
      return localRemoteViews;
    }
    l = paramCursor.getLong(11);
    localeap = a(this, paramCursor);
    boolean bool1;
    label246:
    int m;
    label260:
    label276:
    int n;
    label286:
    int i1;
    label296:
    int i2;
    label306:
    int i4;
    label320:
    label353:
    int i5;
    if (!TextUtils.isEmpty(localeap.c))
    {
      bool1 = true;
      if (TextUtils.isEmpty(localeap.a)) {
        break label818;
      }
      bool2 = true;
      if ((bool1) || (localeap.d != null)) {
        break label824;
      }
      m = 1;
      if (m == 0) {
        break label830;
      }
      n = aaw.lA;
      if (m == 0) {
        break label838;
      }
      i1 = aaw.lB;
      if (m == 0) {
        break label846;
      }
      i2 = aaw.lz;
      int i3 = aaw.mA;
      if (m == 0) {
        break label854;
      }
      i4 = 8;
      localRemoteViews.setViewVisibility(i3, i4);
      if (!bool2) {
        break label860;
      }
      localRemoteViews.setViewVisibility(aaw.S, 0);
      localRemoteViews.setViewVisibility(aaw.em, 8);
      i5 = aaw.mC;
      if (m == 0) {
        break label882;
      }
    }
    label818:
    label824:
    label830:
    label838:
    label846:
    label854:
    label860:
    label882:
    for (int i6 = 0;; i6 = 8)
    {
      localRemoteViews.setViewVisibility(i5, i6);
      localRemoteViews.setImageViewBitmap(n, e);
      String str2 = paramCursor.getString(5);
      if (str2 != null) {}
      try
      {
        Bitmap localBitmap = (Bitmap)b.b(hdo.b(str2), 2, 1);
        if (localBitmap != null) {
          localRemoteViews.setImageViewBitmap(n, localBitmap);
        }
      }
      catch (kbm localkbm)
      {
        for (;;)
        {
          boolean bool3;
          String str3;
          String str4;
          boolean bool4;
          boolean bool5;
          Intent localIntent1;
          Intent localIntent2;
          fe localfe;
          PendingIntent localPendingIntent;
          Log.e("EsWidget", "Cannot download avatar", localkbm);
        }
      }
      catch (kbc localkbc)
      {
        for (;;)
        {
          byte[] arrayOfByte1;
          Object localObject1;
          byte[] arrayOfByte2;
          Object localObject2;
          String str5;
          Log.e("EsWidget", "Canceled", localkbc);
          continue;
          localRemoteViews.setViewVisibility(aaw.et, 0);
          continue;
          if ((bool2) && (!paramBoolean))
          {
            localRemoteViews.setViewVisibility(aaw.P, 0);
            localRemoteViews.setViewVisibility(aaw.Q, 0);
            localRemoteViews.setViewVisibility(aaw.W, 0);
            localRemoteViews.setTextViewText(aaw.W, localeap.a);
            localRemoteViews.setViewVisibility(aaw.U, 0);
            int i7 = aaw.U;
            Resources localResources = getResources();
            int i8 = efj.yf;
            int i9 = localeap.b;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(localeap.b);
            localRemoteViews.setTextViewText(i7, localResources.getQuantityString(i8, i9, arrayOfObject));
            continue;
            localObject1 = lwh.a(ByteBuffer.wrap(arrayOfByte1));
            continue;
            localObject2 = lwh.a(ByteBuffer.wrap(arrayOfByte2));
            continue;
            localRemoteViews.setViewVisibility(aaw.bU, 8);
            localRemoteViews.setViewVisibility(aaw.bV, 8);
            localRemoteViews.setViewVisibility(aaw.bW, 8);
            if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!TextUtils.isEmpty(str5)))
            {
              a(localRemoteViews, aaw.bU, (CharSequence)localObject1, f);
              a(localRemoteViews, aaw.bV, str5, f);
            }
            else if (!TextUtils.isEmpty(str5))
            {
              a(localRemoteViews, aaw.bU, str5, f);
              if (!TextUtils.isEmpty((CharSequence)localObject2)) {
                a(localRemoteViews, aaw.bV, (CharSequence)localObject2, f);
              }
            }
            else if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              a(localRemoteViews, aaw.bW, (CharSequence)localObject2, f);
            }
            else
            {
              String str6 = a(this, l);
              if (!TextUtils.isEmpty(str6)) {
                a(localRemoteViews, aaw.bW, str6, g);
              }
            }
          }
        }
      }
      bool3 = a(this, localRemoteViews, localeap, str1, bool1, bool2);
      if (!bool1) {
        break label933;
      }
      if (!paramBoolean)
      {
        localRemoteViews.setViewVisibility(aaw.ev, 0);
        localRemoteViews.setTextViewText(aaw.ev, localeap.c);
      }
      if (!bool3) {
        break label921;
      }
      localRemoteViews.setViewVisibility(aaw.eu, 0);
      localRemoteViews.setTextViewText(i1, paramCursor.getString(4));
      localRemoteViews.setTextViewText(i2, paramear.c);
      arrayOfByte1 = paramCursor.getBlob(13);
      if (arrayOfByte1 != null) {
        break label1054;
      }
      localObject1 = null;
      arrayOfByte2 = paramCursor.getBlob(14);
      if (arrayOfByte2 != null) {
        break label1067;
      }
      localObject2 = null;
      str3 = paramCursor.getString(15);
      str4 = paramCursor.getString(16);
      bool4 = TextUtils.isEmpty(str3);
      str5 = null;
      if (!bool4)
      {
        bool5 = TextUtils.isEmpty(str4);
        str5 = null;
        if (!bool5) {
          str5 = getString(aau.uA, new Object[] { str4 });
        }
      }
      if (m == 0) {
        break label1080;
      }
      a(this, localRemoteViews, (CharSequence)localObject1, str5, (CharSequence)localObject2, l);
      EsWidgetProvider.a(this, k, paramInt, localRemoteViews, str1, true);
      if ((k == -1) || (str1 == null)) {
        break;
      }
      localIntent1 = efj.b(this, k, str1);
      localIntent1.setAction("com.google.android.apps.plus.widget.ACTIVITY_ACTION");
      EsWidgetProvider.a(localIntent1, paramInt);
      localIntent2 = new Intent(this, HomeActivity.class);
      localIntent2.setAction("android.intent.action.VIEW");
      localIntent2.putExtra("account_id", k);
      localIntent2.addFlags(335544320);
      EsWidgetProvider.a(localIntent2, paramInt);
      if (Build.VERSION.SDK_INT < 16) {
        localIntent2.putExtras(localIntent1);
      }
      localfe = new fe(this);
      localfe.a.add(localIntent2);
      localfe.a.add(localIntent1);
      localPendingIntent = localfe.a(0, 134217728, null);
      localRemoteViews.setOnClickPendingIntent(aaw.mB, localPendingIntent);
      return localRemoteViews;
      bool1 = false;
      break label246;
      bool2 = false;
      break label260;
      m = 0;
      break label276;
      n = aaw.mg;
      break label286;
      i1 = aaw.mh;
      break label296;
      i2 = aaw.kv;
      break label306;
      i4 = 0;
      break label320;
      localRemoteViews.setViewVisibility(aaw.S, 8);
      localRemoteViews.setViewVisibility(aaw.em, 0);
      break label353;
    }
  }
  
  private static eap a(Context paramContext, Cursor paramCursor)
  {
    eap localeap = new eap();
    long l = paramCursor.getLong(11);
    llx localllx1;
    if (!paramCursor.isNull(26)) {
      if ((0x40 & l) != 0L)
      {
        llt localllt = llt.a(paramCursor.getBlob(26));
        llx localllx2 = null;
        if (localllt != null)
        {
          localeap.a = localllt.e;
          localeap.b = localllt.b;
          int m = localeap.b;
          localllx2 = null;
          if (m > 0) {
            localllx2 = localllt.f[0];
          }
        }
        localllx1 = localllx2;
      }
    }
    for (;;)
    {
      String str1;
      int k;
      if ((localllx1 != null) && (!TextUtils.isEmpty(localllx1.e)))
      {
        str1 = localllx1.e;
        if (localllx1.m != ipm.b) {
          break label246;
        }
        k = 1;
        label141:
        if (k == 0) {
          break label252;
        }
      }
      label246:
      label252:
      for (ipm localipm = ipm.b;; localipm = ipm.a)
      {
        localeap.d = ipf.a(paramContext, str1, localipm);
        localeap.e = h;
        localeap.f = h;
        if (!TextUtils.isEmpty(localllx1.a))
        {
          String str2 = localllx1.a;
          if (str2 != null) {
            localeap.c = str2.trim();
          }
        }
        return localeap;
        if ((l & 0x20) == 0L) {
          break label260;
        }
        byte[] arrayOfByte = paramCursor.getBlob(26);
        if (arrayOfByte == null) {
          break label260;
        }
        localllx1 = llx.a(arrayOfByte);
        break;
        k = 0;
        break label141;
      }
      label260:
      localllx1 = null;
    }
  }
  
  private static String a(Context paramContext, long paramLong)
  {
    int k = lmp.a(paramLong);
    if (k != 0) {
      return paramContext.getString(k);
    }
    return null;
  }
  
  private final void a(int paramInt, ear paramear, boolean paramBoolean)
  {
    if (Log.isLoggable("EsWidget", 3)) {
      new StringBuilder(28).append("[").append(paramInt).append("] loadActivities");
    }
    int k = 1;
    String str1;
    if (TextUtils.equals("v.whatshot", paramear.b))
    {
      k = 2;
      str1 = null;
    }
    for (;;)
    {
      localkck = new kck();
      localkck.n = paramBoolean;
      String str2 = String.valueOf(paramear);
      localkck.a(54 + String.valueOf(str2).length() + "Get activities for widget circleId: " + str2 + " view: " + k);
      localkck.b("Activities:SyncStream");
      try
      {
        lmp.a(this, paramear.a, k, str1, null, null, true, null, null, 20, null, null, localkck, false, false, 0L, null);
        return;
      }
      catch (Exception localException)
      {
        if (!Log.isLoggable("EsWidget", 5)) {
          break;
        }
        String str3 = String.valueOf(localException);
        new StringBuilder(37 + String.valueOf(str3).length()).append("[").append(paramInt).append("] loadActivities failed: ").append(str3);
        return;
      }
      finally
      {
        localkck.d();
        localkck.e();
      }
      if (TextUtils.equals("v.all.circles", paramear.b)) {
        str1 = null;
      } else {
        str1 = paramear.b;
      }
    }
  }
  
  private static void a(Context paramContext, RemoteViews paramRemoteViews, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, long paramLong)
  {
    int k = c.length;
    int m;
    if ((!TextUtils.isEmpty(paramCharSequence1)) && (k > 0))
    {
      int[] arrayOfInt5 = c;
      m = 1;
      a(paramRemoteViews, arrayOfInt5[0], paramCharSequence1, f);
    }
    for (;;)
    {
      if ((!TextUtils.isEmpty(paramCharSequence2)) && (m < k))
      {
        int[] arrayOfInt4 = c;
        int i3 = m + 1;
        a(paramRemoteViews, arrayOfInt4[m], paramCharSequence2, f);
        m = i3;
      }
      int n;
      if ((!TextUtils.isEmpty(paramCharSequence3)) && (m < k))
      {
        int[] arrayOfInt3 = c;
        n = m + 1;
        a(paramRemoteViews, arrayOfInt3[m], paramCharSequence3, f);
      }
      for (;;)
      {
        int i1;
        if (n == 0)
        {
          String str = a(paramContext, paramLong);
          if (!TextUtils.isEmpty(str))
          {
            int[] arrayOfInt2 = c;
            i1 = n + 1;
            a(paramRemoteViews, arrayOfInt2[n], str, g);
          }
        }
        for (;;)
        {
          if (i1 < k)
          {
            int[] arrayOfInt1 = c;
            int i2 = i1 + 1;
            paramRemoteViews.setViewVisibility(arrayOfInt1[i1], 8);
            i1 = i2;
          }
          else
          {
            return;
            i1 = n;
          }
        }
        n = m;
      }
      m = 0;
    }
  }
  
  private static void a(Cursor paramCursor, String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramCursor.moveToPosition(-1);
      while (paramCursor.moveToNext()) {
        if (TextUtils.equals(paramCursor.getString(2), paramString))
        {
          if (!paramCursor.moveToNext()) {
            paramCursor.moveToFirst();
          }
          return;
        }
      }
    }
    paramCursor.moveToFirst();
  }
  
  private static void a(RemoteViews paramRemoteViews, int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    paramRemoteViews.setViewVisibility(paramInt1, 0);
    paramRemoteViews.setTextViewText(paramInt1, paramCharSequence);
    paramRemoteViews.setTextColor(paramInt1, paramInt2);
  }
  
  private final void a(gxt paramgxt)
  {
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(paramgxt);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = new gxq(pkh.a);
    localgxr.b.add(localgxq2);
    new gwz(4, localgxr).b(this);
  }
  
  private final boolean a(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Cursor localCursor = this.j.a(paramInt, 0);
    try
    {
      while (localCursor.moveToNext())
      {
        boolean bool = TextUtils.equals(paramString, localCursor.getString(1));
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static boolean a(Context paramContext, RemoteViews paramRemoteViews, eap parameap, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (parameap.d != null) {}
    for (;;)
    {
      try
      {
        localBitmap = (Bitmap)new ipc(a, null, parameap.d, 0, parameap.e, parameap.f, 0).a();
        if ((localBitmap == null) && (!paramBoolean1))
        {
          localBitmap = Bitmap.createBitmap(h, h, Bitmap.Config.RGB_565);
          Canvas localCanvas = new Canvas(localBitmap);
          dub.a(paramContext);
          BitmapDrawable localBitmapDrawable = dub.a[(0x3 & paramString.hashCode())];
          localBitmapDrawable.setBounds(0, 0, h, h);
          localBitmapDrawable.draw(localCanvas);
        }
        if (localBitmap != null)
        {
          if ((localBitmap.getWidth() > h) || (localBitmap.getHeight() > h)) {
            localBitmap = mfo.a(localBitmap, h, h, null);
          }
          if (paramBoolean2)
          {
            paramRemoteViews.setViewVisibility(aaw.R, 0);
            paramRemoteViews.setImageViewBitmap(aaw.R, localBitmap);
          }
        }
        else
        {
          if (localBitmap == null) {
            break label327;
          }
          return true;
        }
      }
      catch (kbm localkbm)
      {
        String str = String.valueOf(parameap.d);
        Log.e("EsWidget", 26 + String.valueOf(str).length() + "Could not download image: " + str);
        localBitmap = null;
        continue;
      }
      catch (kbc localkbc)
      {
        Log.e("EsWidget", "Canceled", localkbc);
        localBitmap = null;
        continue;
        paramRemoteViews.setViewVisibility(aaw.el, 0);
        paramRemoteViews.setImageViewBitmap(aaw.el, localBitmap);
        if (ipm.b.equals(parameap.d.e))
        {
          paramRemoteViews.setViewVisibility(aaw.mj, 0);
          continue;
        }
        if (!ipm.d.equals(parameap.d.e)) {
          continue;
        }
        paramRemoteViews.setViewVisibility(aaw.ad, 0);
        continue;
      }
      label327:
      return false;
      Bitmap localBitmap = null;
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    a = (ipb)mbb.a(this, ipb.class);
    b = (hdg)mbb.a(this, hdg.class);
    this.i = ((lln)mbb.a(this, lln.class));
    this.j = ((jiw)mbb.a(this, jiw.class));
  }
  
  @SuppressLint({"InlinedApi"})
  @TargetApi(16)
  protected void onHandleIntent(Intent paramIntent)
  {
    int k = 1;
    if (!d)
    {
      Resources localResources = getResources();
      e = efj.s(this, k);
      f = localResources.getColor(efj.kp);
      g = localResources.getColor(efj.ko);
      h = Math.min(localResources.getInteger(efj.sm), (int)efj.a(efj.K(getApplicationContext())));
      d = k;
    }
    int n = paramIntent.getIntExtra("appWidgetId", 0);
    if (n == 0) {}
    ear localear;
    boolean bool1;
    boolean bool2;
    String str1;
    AppWidgetManager localAppWidgetManager1;
    do
    {
      return;
      localear = eaq.a(this, n);
      bool1 = paramIntent.getBooleanExtra("refresh", false);
      bool2 = paramIntent.getBooleanExtra("user_event", false);
      str1 = paramIntent.getStringExtra("activity_id");
      if (localear == null)
      {
        EsWidgetProvider.a(this, n);
        return;
      }
      localAppWidgetManager1 = eaq.b(this);
    } while (localAppWidgetManager1 == null);
    if (bool1)
    {
      if (bool2) {
        a(pkh.c);
      }
      a(n, localear, k);
    }
    Cursor localCursor1 = a(n, localear);
    if (localCursor1 != null) {}
    for (;;)
    {
      Cursor localCursor2;
      try
      {
        for (;;)
        {
          if ((localCursor1.getCount() != 0) || (bool1)) {
            break label727;
          }
          localCursor1.close();
          a(n, localear, false);
          Cursor localCursor4 = a(n, localear);
          localCursor2 = localCursor4;
          if (localCursor2 != null) {}
          try
          {
            if (localCursor2.getCount() != 0) {
              break label559;
            }
            if (a(localear.a, localear.b))
            {
              if (Log.isLoggable("EsWidget", 3)) {
                new StringBuilder(30).append("[").append(n).append("] showNoPostsFound");
              }
              AppWidgetManager localAppWidgetManager2 = eaq.b(this);
              if (localAppWidgetManager2 != null)
              {
                RemoteViews localRemoteViews = new RemoteViews(getPackageName(), efj.wM);
                int i1 = localear.a;
                EsWidgetProvider.a(this, i1, n, localRemoteViews, null, true);
                localRemoteViews.setViewVisibility(aaw.mA, 8);
                localRemoteViews.setViewVisibility(aaw.mC, 8);
                localRemoteViews.setViewVisibility(aaw.mz, 0);
                localRemoteViews.setTextViewText(aaw.db, getString(aau.lJ));
                String str2 = localear.b;
                Intent localIntent = new Intent(this, HomeActivity.class);
                localIntent.setAction("android.intent.action.VIEW");
                localIntent.putExtra("account_id", i1);
                localIntent.putExtra("destination", 0);
                localIntent.putExtra("circle_id", str2);
                String str3 = String.valueOf("com.google.android.apps.plus.widget.CIRCLE_ACTION");
                localIntent.setAction(11 + String.valueOf(str3).length() + str3 + n);
                PendingIntent localPendingIntent = PendingIntent.getActivity(this, 0, localIntent, 134217728);
                localRemoteViews.setOnClickPendingIntent(aaw.mB, localPendingIntent);
                localAppWidgetManager2.updateAppWidget(n, localRemoteViews);
              }
            }
            while (localCursor2 != null)
            {
              localCursor2.close();
              return;
              EsWidgetProvider.a(this, n);
            }
            if (localCursor3 == null) {
              break label556;
            }
          }
          finally
          {
            localCursor3 = localCursor2;
          }
        }
      }
      finally
      {
        int i2;
        eao localeao;
        Cursor localCursor3 = localCursor1;
        continue;
        int m = 0;
        continue;
      }
      localCursor3.close();
      label556:
      throw localObject1;
      label559:
      if ((bool2) && (!bool1)) {
        a(pkh.b);
      }
      a(localCursor2, str1);
      if (localCursor2.getCount() > k)
      {
        i2 = localCursor2.getPosition();
        if (!localCursor2.moveToNext()) {
          localCursor2.moveToFirst();
        }
        localeao = new eao(this, a(this, localCursor2), localCursor2.getString(5));
        efj.m().post(localeao);
        localCursor2.moveToPosition(i2);
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        if (localAppWidgetManager1.getAppWidgetOptions(n).getInt("appWidgetCategory", -1) == 2) {
          localAppWidgetManager1.updateAppWidget(n, a(localear, n, localCursor2, k));
        } else {
          m = 0;
        }
      }
      else {
        label727:
        localCursor2 = localCursor1;
      }
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    if (paramIntent == null) {}
    int k;
    boolean bool;
    AppWidgetManager localAppWidgetManager;
    do
    {
      do
      {
        return;
        super.onStart(paramIntent, paramInt);
        k = paramIntent.getIntExtra("appWidgetId", 0);
      } while (k == 0);
      if (eaq.a(this, k) == null)
      {
        EsWidgetProvider.a(this, k);
        return;
      }
      bool = paramIntent.getBooleanExtra("refresh", false);
      if (Log.isLoggable("EsWidget", 3)) {
        new StringBuilder(35).append("[").append(k).append("] showProgressIndicator");
      }
      localAppWidgetManager = eaq.b(this);
    } while (localAppWidgetManager == null);
    RemoteViews localRemoteViews = new RemoteViews(getPackageName(), efj.wM);
    localRemoteViews.setTextViewText(aaw.db, getString(aau.jn));
    if (bool)
    {
      localRemoteViews.setViewVisibility(aaw.ir, 8);
      localRemoteViews.setViewVisibility(aaw.is, 0);
      PendingIntent localPendingIntent = PendingIntent.getService(this, 0, new Intent(this, EsWidgetService.class), 0);
      localRemoteViews.setOnClickPendingIntent(aaw.fN, localPendingIntent);
      if (Build.VERSION.SDK_INT < 11) {
        break label223;
      }
    }
    label223:
    for (int m = 1;; m = 0)
    {
      if (m == 0) {
        break label229;
      }
      localAppWidgetManager.partiallyUpdateAppWidget(k, localRemoteViews);
      return;
      localRemoteViews.setViewVisibility(aaw.fN, 8);
      localRemoteViews.setViewVisibility(aaw.fP, 0);
      break;
    }
    label229:
    localRemoteViews.setViewVisibility(aaw.mz, 0);
    localRemoteViews.setViewVisibility(aaw.mA, 8);
    localRemoteViews.setViewVisibility(aaw.mC, 8);
    localAppWidgetManager.updateAppWidget(k, localRemoteViews);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.EsWidgetService
 * JD-Core Version:    0.7.0.1
 */