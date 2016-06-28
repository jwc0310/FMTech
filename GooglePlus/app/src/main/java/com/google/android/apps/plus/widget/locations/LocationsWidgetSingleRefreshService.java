package com.google.android.apps.plus.widget.locations;

import aaw;
import android.app.IntentService;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import eaq;
import eav;
import eaz;
import eba;
import efj;
import hdg;
import ijb;
import ipb;
import ipc;
import ipf;
import ipm;
import java.util.HashMap;
import jiw;
import jmd;
import kbc;
import kbm;
import mbb;
import nve;
import nvv;

public class LocationsWidgetSingleRefreshService
  extends IntentService
{
  private final HashMap<String, nve> a = new HashMap();
  
  public LocationsWidgetSingleRefreshService()
  {
    this("LocationsWidgetSingleRefreshService");
  }
  
  public LocationsWidgetSingleRefreshService(String paramString)
  {
    super(paramString);
  }
  
  private final Bitmap a(eaz parameaz)
  {
    try
    {
      ipf localipf = ipf.a(this, parameaz.d.g, ipm.a);
      Bitmap localBitmap = (Bitmap)new ipc((ipb)mbb.a(this, ipb.class), null, localipf, 0, 290, 210, 0).a();
      return localBitmap;
    }
    catch (kbm localkbm)
    {
      return null;
    }
    catch (kbc localkbc) {}
    return null;
  }
  
  private final eaz a(eba parameba, HashMap<String, nve> paramHashMap)
  {
    if (!TextUtils.isEmpty(parameba.c))
    {
      if (paramHashMap.containsKey(parameba.c)) {
        return a(parameba.c, (nve)paramHashMap.get(parameba.c));
      }
    }
    else if (!TextUtils.isEmpty(parameba.b))
    {
      Context localContext = getApplicationContext();
      int i = parameba.a;
      jmd localjmd = new jmd(((jiw)mbb.a(localContext, jiw.class)).a(i, 0, new eav(this, paramHashMap)));
      Object localObject1 = null;
      try
      {
        do
        {
          if (!localjmd.moveToNext()) {
            break;
          }
          String str = localjmd.getString(11);
          eaz localeaz = a(str, (nve)paramHashMap.get(str));
          localObject1 = localeaz;
        } while (localObject1 == null);
        return localObject1;
      }
      finally
      {
        localjmd.close();
      }
    }
    return null;
  }
  
  private static eaz a(String paramString, nve paramnve)
  {
    if ((paramString == null) || (paramnve == null)) {}
    eaz localeaz;
    do
    {
      return null;
      localeaz = new eaz();
      localeaz.d = efj.a(paramnve.b);
    } while (localeaz.d == null);
    localeaz.a = paramString;
    localeaz.b = paramnve.c;
    localeaz.c = efj.E(paramnve.d);
    return localeaz;
  }
  
  private final Bitmap b(eaz parameaz)
  {
    try
    {
      Bitmap localBitmap = (Bitmap)((hdg)mbb.a(this, hdg.class)).b(parameaz.c, 2, 2);
      return localBitmap;
    }
    catch (kbm localkbm)
    {
      return null;
    }
    catch (kbc localkbc) {}
    return null;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    Context localContext = getApplicationContext();
    AppWidgetManager localAppWidgetManager = eaq.b(localContext);
    if (localAppWidgetManager == null) {
      return;
    }
    int i = paramIntent.getIntExtra("appWidgetId", 0);
    eba localeba = efj.o(localContext, i);
    if (localeba == null) {
      stopSelf();
    }
    if (localeba.a == -1)
    {
      efj.a(localContext, i, null, null, null, true);
      return;
    }
    int j = localeba.a;
    ijb localijb = new ijb(getApplicationContext(), j, 0, false);
    localijb.i();
    if (localijb.n()) {}
    for (int n = 0;; n = 1)
    {
      if (n != 0)
      {
        eaz localeaz = a(localeba, this.a);
        if (localeaz != null)
        {
          RemoteViews localRemoteViews = new RemoteViews(getApplicationContext().getPackageName(), efj.uA);
          localRemoteViews.setTextViewText(aaw.bK, localeaz.b);
          localRemoteViews.setTextViewText(aaw.bJ, localeaz.d.f);
          localRemoteViews.setTextViewText(aaw.bI, efj.a(getApplicationContext(), localeaz.d.d.longValue()));
          Bitmap localBitmap1 = a(localeaz);
          Bitmap localBitmap2 = b(localeaz);
          localRemoteViews.setImageViewBitmap(aaw.at, localBitmap2);
          localRemoteViews.setImageViewBitmap(aaw.eU, localBitmap1);
          Intent localIntent = new Intent(getApplicationContext(), LocationsWidgetProvider.class).setAction("com.google.android.apps.plus.widget.locations.LAUNCH").putExtra("appWidgetId", i).putExtra("gaia_id", localeaz.a);
          localIntent.setData(Uri.parse(localIntent.toUri(1)));
          PendingIntent localPendingIntent = PendingIntent.getBroadcast(getApplicationContext(), i, localIntent, 134217728);
          localRemoteViews.setOnClickPendingIntent(aaw.eU, localPendingIntent);
          localRemoteViews.setViewVisibility(aaw.eN, 0);
          localRemoteViews.setViewVisibility(aaw.db, 8);
          localAppWidgetManager.updateAppWidget(i, localRemoteViews);
        }
      }
      LocationsWidgetProvider.a(localContext, i, true);
      return;
      nve[] arrayOfnve = localijb.a;
      this.a.clear();
      int k = arrayOfnve.length;
      for (int m = 0; m < k; m++)
      {
        nve localnve = arrayOfnve[m];
        this.a.put(localnve.a, localnve);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.locations.LocationsWidgetSingleRefreshService
 * JD-Core Version:    0.7.0.1
 */