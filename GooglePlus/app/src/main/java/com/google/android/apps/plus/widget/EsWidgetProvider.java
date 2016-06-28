package com.google.android.apps.plus.widget;

import aau;
import aaw;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import eaq;
import efj;
import gwz;
import gxq;
import gxr;
import ill;
import ine;
import java.util.List;
import pkh;

public class EsWidgetProvider
  extends AppWidgetProvider
{
  public static Intent a(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Intent localIntent = new Intent(paramContext, EsWidgetService.class);
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("activity_id", paramString);
    }
    if (paramBoolean1) {
      localIntent.putExtra("refresh", true);
    }
    if (paramBoolean2) {
      localIntent.putExtra("user_event", true);
    }
    a(localIntent, paramInt);
    return localIntent;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    if (Log.isLoggable("EsWidget", 3)) {
      new StringBuilder(32).append("[").append(paramInt).append("] showTapToConfigure");
    }
    AppWidgetManager localAppWidgetManager = eaq.b(paramContext);
    if (localAppWidgetManager == null) {
      return;
    }
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), efj.wM);
    a(paramContext, -1, paramInt, localRemoteViews, null, false);
    localRemoteViews.setViewVisibility(aaw.mA, 8);
    localRemoteViews.setViewVisibility(aaw.mC, 8);
    localRemoteViews.setViewVisibility(aaw.mz, 0);
    localRemoteViews.setTextViewText(aaw.db, paramContext.getString(aau.vO));
    Intent localIntent = new Intent(paramContext, EsWidgetConfigurationActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("appWidgetId", paramInt);
    PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
    localRemoteViews.setOnClickPendingIntent(aaw.mB, localPendingIntent);
    localAppWidgetManager.updateAppWidget(paramInt, localRemoteViews);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, RemoteViews paramRemoteViews, String paramString, boolean paramBoolean)
  {
    int i = 8;
    Intent localIntent1 = efj.b(paramContext, paramInt1);
    a(localIntent1, paramInt2);
    PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, 0, localIntent1, 134217728);
    paramRemoteViews.setOnClickPendingIntent(aaw.ei, localPendingIntent1);
    int j;
    int k;
    label56:
    int n;
    label87:
    int i2;
    label108:
    int i4;
    label129:
    int i5;
    if (paramInt1 != -1)
    {
      j = 1;
      if (TextUtils.isEmpty(paramString)) {
        break label366;
      }
      k = 1;
      paramRemoteViews.setViewVisibility(aaw.is, i);
      paramRemoteViews.setViewVisibility(aaw.fP, i);
      int m = aaw.hO;
      if (j == 0) {
        break label372;
      }
      n = 0;
      paramRemoteViews.setViewVisibility(m, n);
      int i1 = aaw.ir;
      if (!paramBoolean) {
        break label379;
      }
      i2 = 0;
      paramRemoteViews.setViewVisibility(i1, i2);
      int i3 = aaw.fN;
      if (k == 0) {
        break label386;
      }
      i4 = 0;
      paramRemoteViews.setViewVisibility(i3, i4);
      i5 = aaw.cE;
      if ((j == 0) || ((!paramBoolean) && (k == 0))) {
        break label393;
      }
    }
    label386:
    label393:
    for (int i6 = 0;; i6 = i)
    {
      paramRemoteViews.setViewVisibility(i5, i6);
      int i7 = aaw.cF;
      if ((paramBoolean) && (k != 0)) {
        i = 0;
      }
      paramRemoteViews.setViewVisibility(i7, i);
      if (j != 0)
      {
        Intent localIntent2 = efj.k(paramContext, paramInt1);
        localIntent2.setAction("android.intent.action.SEND");
        localIntent2.putExtra("is_internal", true);
        localIntent2.setAction("com.google.android.apps.plus.widget.POST_ACTION");
        a(localIntent2, paramInt2);
        ill localill = new ill(paramContext, paramInt1);
        localill.a.add(ine.class);
        if (!localill.a()) {
          localIntent2 = localill.b();
        }
        PendingIntent localPendingIntent4 = PendingIntent.getActivity(paramContext, 0, localIntent2, 134217728);
        paramRemoteViews.setOnClickPendingIntent(aaw.hO, localPendingIntent4);
      }
      if (paramBoolean)
      {
        PendingIntent localPendingIntent3 = PendingIntent.getService(paramContext, 0, a(paramContext, paramInt2, null, true, true), 134217728);
        paramRemoteViews.setOnClickPendingIntent(aaw.ir, localPendingIntent3);
      }
      if (k != 0)
      {
        PendingIntent localPendingIntent2 = PendingIntent.getService(paramContext, 0, a(paramContext, paramInt2, paramString, false, true), 134217728);
        paramRemoteViews.setOnClickPendingIntent(aaw.fN, localPendingIntent2);
      }
      return;
      j = 0;
      break;
      label366:
      k = 0;
      break label56;
      label372:
      n = i;
      break label87;
      label379:
      i2 = i;
      break label108;
      i4 = i;
      break label129;
    }
  }
  
  static void a(Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("appWidgetId", paramInt);
    paramIntent.putExtra("show_account_banner", true);
    paramIntent.setData(Uri.parse(paramIntent.toUri(1)));
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    AppWidgetManager localAppWidgetManager = eaq.b(paramContext);
    if (localAppWidgetManager == null) {
      return;
    }
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), efj.wM);
    a(paramContext, -1, paramInt, localRemoteViews, null, false);
    localRemoteViews.setViewVisibility(aaw.fP, 0);
    localRemoteViews.setViewVisibility(aaw.mA, 8);
    localRemoteViews.setViewVisibility(aaw.mC, 8);
    localRemoteViews.setViewVisibility(aaw.mz, 0);
    localRemoteViews.setTextViewText(aaw.db, paramContext.getString(aau.jn));
    localAppWidgetManager.updateAppWidget(paramInt, localRemoteViews);
  }
  
  public void onDeleted(Context paramContext, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      if (Log.isLoggable("EsWidget", 3)) {
        new StringBuilder(23).append("[").append(k).append("] onDeleted");
      }
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.apps.plus.widget.EsWidgetUtils", 0).edit();
      String str1 = String.valueOf("gaiaId_");
      localEditor.remove(11 + String.valueOf(str1).length() + str1 + k);
      String str2 = String.valueOf("circleId_");
      localEditor.remove(11 + String.valueOf(str2).length() + str2 + k);
      String str3 = String.valueOf("circleName_");
      localEditor.remove(11 + String.valueOf(str3).length() + str3 + k);
      localEditor.apply();
    }
  }
  
  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      if (Log.isLoggable("EsWidget", 3)) {
        new StringBuilder(22).append("[").append(k).append("] onUpdate");
      }
      b(paramContext, k);
      paramContext.startService(a(paramContext, k, null, false, false));
    }
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pkh.a);
    localgxr.b.add(localgxq);
    new gwz(-1, localgxr).b(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.EsWidgetProvider
 * JD-Core Version:    0.7.0.1
 */