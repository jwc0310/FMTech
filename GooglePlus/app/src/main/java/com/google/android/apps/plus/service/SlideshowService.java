package com.google.android.apps.plus.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import bgp;
import dnj;
import fy;
import jqb;
import jrf;
import mbb;

public class SlideshowService
  extends Service
{
  public Handler a;
  public Bundle b;
  public int c = -1;
  public boolean d;
  public boolean e;
  public boolean f;
  private PowerManager.WakeLock g;
  private WifiManager.WifiLock h;
  
  public static Intent a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, SlideshowService.class);
    localIntent.setAction("com.google.android.apps.photos.STOP_SLIDESHOW");
    return localIntent;
  }
  
  public static Intent a(Context paramContext, Bundle paramBundle, int paramInt)
  {
    int i = bgp.b(paramContext);
    if ((i != -1) && (!paramBundle.containsKey("account_id"))) {
      paramBundle.putInt("account_id", i);
    }
    Intent localIntent = new Intent(paramContext, SlideshowService.class);
    localIntent.setAction("com.google.android.apps.photos.START_SLIDESHOW");
    localIntent.putExtra("slideshow_arguments", paramBundle);
    localIntent.putExtra("slideshow_position", paramInt);
    return localIntent;
  }
  
  private final void c()
  {
    try
    {
      if (((jqb)mbb.a(getApplicationContext(), jqb.class)).b()) {
        this.h.acquire();
      }
      this.g.acquire();
      return;
    }
    finally {}
  }
  
  private final void d()
  {
    try
    {
      if (this.h.isHeld()) {
        this.h.release();
      }
      if (this.g.isHeld()) {
        this.g.release();
      }
      return;
    }
    finally {}
  }
  
  public final void a()
  {
    try
    {
      this.a.removeCallbacksAndMessages(null);
      this.d = false;
      b();
      return;
    }
    finally
    {
      d();
    }
  }
  
  public final void b()
  {
    Intent localIntent = new Intent("com.google.android.apps.photos.SLIDESHOW_STATE");
    localIntent.putExtra("slideshow_playing", this.d);
    localIntent.putExtra("slideshow_position", this.c);
    fy.a(getApplicationContext()).a(localIntent);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    this.a = new Handler(new dnj(this));
    this.g = ((PowerManager)getSystemService("power")).newWakeLock(1, "SLIDE_SHOW_WAKE_LOCK");
    this.h = ((WifiManager)getSystemService("wifi")).createWifiLock(1, "SLIDE_SHOW_WIFI_LOCK");
  }
  
  public void onDestroy()
  {
    if (this.d) {
      a();
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ("com.google.android.apps.photos.START_SLIDESHOW".equals(paramIntent.getAction()))
    {
      c();
      if (this.d) {
        a();
      }
      this.b = paramIntent.getBundleExtra("slideshow_arguments");
      String str = this.b.getString("view_id");
      if ((str != null) && (jrf.m(str)))
      {
        bool = true;
        this.e = bool;
        this.f = this.b.containsKey("all_photos_row_id");
        this.c = paramIntent.getIntExtra("slideshow_position", 0);
        this.d = true;
        this.a.sendEmptyMessageDelayed(1, 0);
      }
    }
    for (;;)
    {
      return 2;
      bool = false;
      break;
      if ("com.google.android.apps.photos.STOP_SLIDESHOW".equals(paramIntent.getAction()))
      {
        a();
        stopSelfResult(paramInt2);
      }
      else if ("com.google.android.apps.photos.QUERY_STATE".equals(paramIntent.getAction()))
      {
        b();
        if (!this.d) {
          stopSelfResult(paramInt2);
        }
      }
      else if ("com.google.android.apps.photos.STOP_CASTING".equals(paramIntent.getAction()))
      {
        a();
        stopSelfResult(paramInt2);
        ((jqb)mbb.a(getApplicationContext(), jqb.class)).c();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.SlideshowService
 * JD-Core Version:    0.7.0.1
 */