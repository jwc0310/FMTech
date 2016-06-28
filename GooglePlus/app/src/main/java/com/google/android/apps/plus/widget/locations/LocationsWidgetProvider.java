package com.google.android.apps.plus.widget.locations;

import aaw;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.apps.plus.locations.HostFriendLocationsActivity;
import eaq;
import eba;
import efj;
import gxw;
import gxx;
import gxz;
import gya;
import mbb;

public class LocationsWidgetProvider
  extends AppWidgetProvider
{
  private static PendingIntent a(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, LocationsWidgetProvider.class);
    localIntent.putExtra("appWidgetId", paramInt);
    localIntent.setAction(paramString);
    localIntent.setData(Uri.parse(22 + "appWidgetId" + paramInt));
    return PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 134217728);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    if (Log.isLoggable("LWProvider", 3)) {
      String.format("[%d] updateWidget", arrayOfObject);
    }
    eba localeba = efj.o(paramContext, paramInt);
    if ((localeba != null) && (localeba.a != -1))
    {
      if (!localeba.d) {
        break label202;
      }
      AppWidgetManager localAppWidgetManager2 = eaq.b(paramContext);
      if (localAppWidgetManager2 != null)
      {
        Intent localIntent2 = new Intent(paramContext, LocationsWidgetStackService.class);
        localIntent2.putExtra("appWidgetId", paramInt);
        localIntent2.setData(Uri.parse(localIntent2.toUri(1)));
        RemoteViews localRemoteViews2 = new RemoteViews(paramContext.getPackageName(), efj.uz);
        localRemoteViews2.setRemoteAdapter(aaw.kj, localIntent2);
        localRemoteViews2.setEmptyView(aaw.kj, aaw.db);
        Intent localIntent3 = new Intent(paramContext, LocationsWidgetProvider.class);
        localIntent3.setAction("com.google.android.apps.plus.widget.locations.LAUNCH");
        PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, localIntent3, 134217730);
        localRemoteViews2.setPendingIntentTemplate(aaw.kj, localPendingIntent);
        localRemoteViews2.setOnClickPendingIntent(aaw.eO, a(paramContext, paramInt, "com.google.android.apps.plus.widget.locations.REFRESH"));
        localAppWidgetManager2.updateAppWidget(paramInt, localRemoteViews2);
      }
    }
    label202:
    AppWidgetManager localAppWidgetManager1;
    do
    {
      return;
      localAppWidgetManager1 = eaq.b(paramContext);
    } while (localAppWidgetManager1 == null);
    RemoteViews localRemoteViews1 = new RemoteViews(paramContext.getPackageName(), efj.uA);
    localRemoteViews1.setOnClickPendingIntent(aaw.eO, a(paramContext, paramInt, "com.google.android.apps.plus.widget.locations.REFRESH"));
    localAppWidgetManager1.updateAppWidget(paramInt, localRemoteViews1);
    Intent localIntent1 = new Intent(paramContext, LocationsWidgetSingleRefreshService.class);
    localIntent1.putExtra("appWidgetId", paramInt);
    paramContext.startService(localIntent1);
  }
  
  static void a(Context paramContext, int paramInt, gxz paramgxz)
  {
    gxx localgxx = (gxx)mbb.a(paramContext, gxx.class);
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = paramgxz;
    localgxw.d = gya.Q;
    localgxx.a(localgxw);
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    if (Log.isLoggable("LWProvider", 3)) {
      String.format("updateRefreshButton(%d)", arrayOfObject);
    }
    AppWidgetManager localAppWidgetManager = eaq.b(paramContext);
    if (localAppWidgetManager == null) {
      return;
    }
    int i;
    RemoteViews localRemoteViews;
    if (efj.o(paramContext, paramInt).d)
    {
      i = efj.uz;
      localRemoteViews = new RemoteViews(paramContext.getPackageName(), i);
      if (!paramBoolean) {
        break label125;
      }
      localRemoteViews.setViewVisibility(aaw.eP, 0);
      localRemoteViews.setViewVisibility(aaw.eQ, 4);
    }
    for (;;)
    {
      localRemoteViews.setOnClickPendingIntent(aaw.eO, a(paramContext, paramInt, "com.google.android.apps.plus.widget.locations.REFRESH"));
      localAppWidgetManager.partiallyUpdateAppWidget(paramInt, localRemoteViews);
      return;
      i = efj.uA;
      break;
      label125:
      localRemoteViews.setViewVisibility(aaw.eP, 4);
      localRemoteViews.setViewVisibility(aaw.eQ, 0);
    }
  }
  
  public void onDeleted(Context paramContext, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(k);
      if (Log.isLoggable("LWProvider", 3)) {
        String.format("[%d] onDeleted", arrayOfObject);
      }
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.apps.plus.widget.LocationsWidgetUtils", 0).edit();
      String str1 = String.valueOf("accountGaiaId_");
      localEditor.remove(11 + String.valueOf(str1).length() + str1 + k);
      String str2 = String.valueOf("circleId_");
      localEditor.remove(11 + String.valueOf(str2).length() + str2 + k);
      String str3 = String.valueOf("gaiaId_");
      localEditor.remove(11 + String.valueOf(str3).length() + str3 + k);
      localEditor.apply();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null)) {}
    AppWidgetManager localAppWidgetManager;
    int k;
    do
    {
      do
      {
        return;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = paramIntent.getAction();
        if (Log.isLoggable("LWProvider", 3)) {
          String.format("onReceive action: %s", arrayOfObject1);
        }
        if (!"com.google.android.apps.plus.widget.locations.REFRESH".equals(paramIntent.getAction())) {
          break;
        }
        localAppWidgetManager = eaq.b(paramContext);
      } while (localAppWidgetManager == null);
      k = paramIntent.getIntExtra("appWidgetId", 0);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(k);
      if (Log.isLoggable("LWProvider", 3)) {
        String.format("onRefresh (%d)", arrayOfObject2);
      }
    } while (k == 0);
    eba localeba2 = efj.o(paramContext, k);
    a(paramContext, localeba2.a, gxz.cm);
    a(paramContext, k, false);
    if (localeba2.d)
    {
      localAppWidgetManager.notifyAppWidgetViewDataChanged(k, aaw.kj);
      return;
    }
    paramContext.startService(new Intent(paramContext, LocationsWidgetSingleRefreshService.class).putExtras(paramIntent.getExtras()));
    return;
    if ("com.google.android.apps.plus.widget.locations.LAUNCH".equals(paramIntent.getAction()))
    {
      int i = paramIntent.getIntExtra("appWidgetId", 0);
      eba localeba1 = efj.o(paramContext, i);
      if ((localeba1 == null) || (localeba1.a == -1))
      {
        paramContext.startActivity(new Intent(paramContext, LocationsWidgetConfigurationActivity.class).setAction("android.appwidget.action.APPWIDGET_CONFIGURE").putExtra("appWidgetId", i).setFlags(268435456));
        return;
      }
      int j = localeba1.a;
      a(paramContext, j, gxz.co);
      Intent localIntent = new Intent(paramContext, HostFriendLocationsActivity.class);
      localIntent.putExtra("account_id", j);
      localIntent.putExtra("gaia_id", paramIntent.getStringExtra("gaia_id"));
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      return;
    }
    super.onReceive(paramContext, paramIntent);
  }
  
  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(k);
      if (Log.isLoggable("LWProvider", 3)) {
        String.format("[%d] on Update", arrayOfObject);
      }
      eba localeba = efj.o(paramContext, k);
      if ((localeba != null) && (localeba.a != -1)) {
        a(paramContext, localeba.a, gxz.cn);
      }
      a(paramContext, k);
    }
    super.onUpdate(paramContext, paramAppWidgetManager, paramArrayOfInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.locations.LocationsWidgetProvider
 * JD-Core Version:    0.7.0.1
 */