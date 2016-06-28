package com.google.android.apps.plus.service;

import aau;
import aaw;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.RemoteViews;
import bdo;
import com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity;
import com.google.android.apps.plus.phone.HostStreamPhotoPagerActivity;
import dk;
import dkn;
import efj;
import fe;
import fy;
import ipb;
import ipf;
import iph;
import ipm;
import java.util.ArrayList;
import jqb;
import jqg;
import kaz;
import kbb;
import mbb;

public class CastService
  extends jqg
  implements kbb
{
  public boolean a;
  private BroadcastReceiver b;
  private iph c;
  private Bundle d;
  private String e;
  private int f;
  private boolean g;
  
  private static void a(Context paramContext, iph paramiph, RemoteViews paramRemoteViews)
  {
    int i = aau.lQ;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ((jqb)mbb.a(paramContext, jqb.class)).e();
    String str = paramContext.getString(i, arrayOfObject);
    paramRemoteViews.setImageViewBitmap(aaw.gk, paramiph.j());
    paramRemoteViews.setTextViewText(aaw.gp, paramContext.getText(aau.lR));
    paramRemoteViews.setTextViewText(aaw.gl, str);
    Intent localIntent = new Intent(paramContext, SlideshowService.class);
    localIntent.setAction("com.google.android.apps.photos.STOP_CASTING");
    paramRemoteViews.setOnClickPendingIntent(aaw.go, PendingIntent.getService(paramContext, 1, localIntent, 134217728));
  }
  
  @TargetApi(16)
  public final Notification a()
  {
    Context localContext = getApplicationContext();
    dk localdk = new dk(localContext);
    bdo localbdo = new bdo(localContext, this.d.getInt("account_id", -1));
    if (this.d.containsKey("view_id")) {
      localbdo.e = this.d.getString("view_id");
    }
    if (this.d.containsKey("tile_id")) {
      localbdo.b = this.d.getString("tile_id");
    }
    if (this.d.containsKey("all_photos_row_id")) {
      localbdo.f = Long.valueOf(this.d.getLong("all_photos_row_id"));
    }
    if (this.d.containsKey("photo_ref")) {
      localbdo.c = ((ipf)this.d.getParcelable("photo_ref"));
    }
    if (this.d.containsKey("all_photos_offset")) {
      localbdo.s = Integer.valueOf(this.d.getInt("all_photos_offset"));
    }
    fe localfe = new fe(localContext);
    if (this.d.getBoolean("show_oob_tile", false))
    {
      localfe.a(HostStreamPhotoPagerActivity.class);
      localbdo.v = Boolean.valueOf(true);
    }
    RemoteViews localRemoteViews2;
    for (;;)
    {
      Intent localIntent = localbdo.a();
      localIntent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
      localfe.a.add(localIntent);
      PendingIntent localPendingIntent1 = localfe.a(0, 134217728, null);
      iph localiph1 = this.c;
      RemoteViews localRemoteViews1 = new RemoteViews(localContext.getPackageName(), efj.vH);
      a(localContext, localiph1, localRemoteViews1);
      int i = efj.pB;
      localdk.x.icon = i;
      localdk.x.contentView = localRemoteViews1;
      localdk.d = localPendingIntent1;
      localdk.v = 1;
      Notification localNotification = localdk.b();
      if (Build.VERSION.SDK_INT >= 16)
      {
        iph localiph2 = this.c;
        localRemoteViews2 = new RemoteViews(localContext.getPackageName(), efj.vG);
        a(localContext, localiph2, localRemoteViews2);
        if (!this.a) {
          break;
        }
        localRemoteViews2.setViewVisibility(aaw.gn, 8);
        localRemoteViews2.setViewVisibility(aaw.gm, 0);
        PendingIntent localPendingIntent3 = PendingIntent.getService(localContext, 0, SlideshowService.a(localContext), 134217728);
        localRemoteViews2.setOnClickPendingIntent(aaw.gm, localPendingIntent3);
        localNotification.bigContentView = localRemoteViews2;
      }
      return localNotification;
      localfe.a(HostPhotoPagerActivity.class);
      localbdo.a.setClass(localContext, HostPhotoPagerActivity.class);
    }
    localRemoteViews2.setViewVisibility(aaw.gm, 8);
    int j = aaw.gn;
    if (!this.g) {}
    for (int k = 0;; k = 8)
    {
      localRemoteViews2.setViewVisibility(j, k);
      PendingIntent localPendingIntent2 = PendingIntent.getService(localContext, 0, SlideshowService.a(localContext, this.d, this.f), 134217728);
      localRemoteViews2.setOnClickPendingIntent(aaw.gn, localPendingIntent2);
      break;
    }
  }
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz.q == 2) {
      return;
    }
    this.c = ((iph)paramkaz);
    Notification localNotification = a();
    startForeground(aaw.aX, localNotification);
  }
  
  public final void ap_()
  {
    if (this.c != null)
    {
      this.c.b(this);
      this.c = null;
    }
  }
  
  public final void b()
  {
    ap_();
    ipf localipf = ipf.a(getApplicationContext(), this.e, ipm.a);
    this.c = ((ipb)mbb.a(getApplicationContext(), ipb.class)).a(localipf, 2, null, 0, this);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    this.b = new dkn(this);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.apps.photos.SLIDESHOW_STATE");
    fy.a(getApplicationContext()).a(this.b, localIntentFilter);
  }
  
  public void onDestroy()
  {
    fy.a(getApplicationContext()).a(this.b);
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (com.google.android.libraries.social.socialcast.impl.CastService.G)
    {
      stopSelf();
      return 2;
    }
    if (paramIntent.hasExtra("notification_bundle"))
    {
      this.d = ((Bundle)paramIntent.getParcelableExtra("notification_bundle"));
      this.e = paramIntent.getStringExtra("notification_media");
      this.f = paramIntent.getIntExtra("notification_index", 0);
    }
    if (paramIntent.hasExtra("notification_video_playing")) {
      this.g = paramIntent.getBooleanExtra("notification_video_playing", false);
    }
    if (this.e != null) {
      b();
    }
    mbb.a(getApplicationContext(), jqb.class);
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.CastService
 * JD-Core Version:    0.7.0.1
 */