package com.google.android.libraries.social.ingest;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.mtp.MtpDevice;
import android.mtp.MtpDeviceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import dk;
import efj;
import iha;
import ihb;
import ihj;
import ihk;
import ihm;
import iho;
import ihp;
import ihq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@TargetApi(12)
public final class IngestService
  extends Service
  implements ihj, iho, ihq
{
  MtpDevice a;
  String b;
  public ihp c;
  dk d;
  private ihm e;
  private final IBinder f = new iha(this);
  private ihb g;
  private IngestActivity h;
  private boolean i = false;
  private int j = 0;
  private Collection<ihk> k;
  private boolean l = false;
  private boolean m;
  private NotificationManager n;
  private long o = 0L;
  private boolean p = false;
  
  private final void c(MtpDevice paramMtpDevice)
  {
    MtpDeviceInfo localMtpDeviceInfo;
    for (;;)
    {
      if (this.a == paramMtpDevice) {
        return;
      }
      this.i = false;
      this.m = false;
      this.k = null;
      this.l = false;
      this.a = paramMtpDevice;
      this.c.a(this.a);
      if (this.a == null) {
        break label128;
      }
      localMtpDeviceInfo = this.a.getDeviceInfo();
      if (localMtpDeviceInfo != null) {
        break;
      }
      paramMtpDevice = null;
    }
    this.b = localMtpDeviceInfo.getModel();
    this.d.b = dk.a(this.b);
    new Thread(this.c.c()).start();
    while (this.h != null)
    {
      this.h.h.sendEmptyMessage(2);
      return;
      label128:
      this.b = null;
    }
    this.l = true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString)
  {
    ihb localihb;
    if (paramString != null) {
      localihb = this.g;
    }
    synchronized (localihb.d)
    {
      if (localihb.c)
      {
        localihb.b.scanFile(paramString, null);
        this.p = false;
        if (this.h != null) {
          this.h.a(paramInt1, paramInt2, paramString);
        }
        this.d.a(paramInt2, paramInt1, false).c = dk.a(getResources().getText(efj.NC));
        this.n.notify(efj.Nn, this.d.b());
        return;
      }
      localihb.a.add(paramString);
      localihb.b.connect();
    }
  }
  
  public final void a(MtpDevice paramMtpDevice)
  {
    if (this.a == null) {
      c(paramMtpDevice);
    }
  }
  
  public final void a(IngestActivity paramIngestActivity)
  {
    if (this.h == paramIngestActivity) {}
    do
    {
      return;
      this.h = paramIngestActivity;
      if (this.h != null) {
        break;
      }
    } while (!this.p);
    this.d.a(0, 0, false).c = dk.a(getResources().getText(efj.NF));
    this.n.notify(efj.No, this.d.b());
    return;
    this.n.cancel(efj.Nn);
    this.n.cancel(efj.No);
    if (this.i)
    {
      this.h.a(this.k, this.j);
      this.i = false;
      this.k = null;
    }
    if (this.l)
    {
      this.h.h.sendEmptyMessage(2);
      this.l = false;
    }
    ihp localihp = this.c;
    if ((localihp.c != null) && (localihp.e != null)) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        this.h.h();
      }
      if (this.m)
      {
        this.h.i();
        this.m = false;
      }
      if (this.a == null) {
        break;
      }
      this.p = true;
      return;
    }
  }
  
  public final void a(ihk paramihk, int paramInt)
  {
    this.p = false;
    if (this.h != null) {
      this.h.a(paramihk, paramInt);
    }
    long l1;
    do
    {
      return;
      l1 = SystemClock.uptimeMillis();
    } while (l1 <= 180L + this.o);
    this.o = l1;
    this.d.a(0, paramInt, true).c = dk.a(getResources().getText(efj.NE));
    this.n.notify(efj.No, this.d.b());
  }
  
  public final void a(Collection<ihk> paramCollection, int paramInt)
  {
    stopForeground(true);
    this.p = true;
    if (this.h != null)
    {
      this.h.a(paramCollection, paramInt);
      return;
    }
    this.i = true;
    this.k = paramCollection;
    this.j = paramInt;
    this.d.a(0, 0, false).c = dk.a(getResources().getText(efj.NB));
    this.n.notify(efj.Nn, this.d.b());
  }
  
  public final void b(MtpDevice paramMtpDevice)
  {
    if (paramMtpDevice == this.a)
    {
      this.n.cancel(efj.No);
      this.n.cancel(efj.Nn);
      c(null);
      this.p = false;
    }
  }
  
  public final void g()
  {
    if (this.h != null) {
      this.h.g();
    }
  }
  
  public final void h()
  {
    this.p = true;
    if (this.h != null)
    {
      this.h.h();
      return;
    }
    this.d.a(0, 0, false).c = dk.a(getResources().getText(efj.NF));
    this.n.notify(efj.No, this.d.b());
  }
  
  public final void i()
  {
    if (this.h != null)
    {
      this.h.i();
      return;
    }
    this.m = true;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return this.f;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    this.g = new ihb(this);
    this.n = ((NotificationManager)getSystemService("notification"));
    this.d = new dk(this);
    dk localdk = this.d;
    localdk.x.icon = 17301628;
    localdk.d = PendingIntent.getActivity(this, 0, new Intent(this, IngestActivity.class), 0);
    this.c = ihp.f;
    this.c.a(this);
    this.e = new ihm(getApplicationContext());
    List localList = this.e.a();
    if (!localList.isEmpty()) {
      c((MtpDevice)localList.get(0));
    }
    ihm localihm = this.e;
    synchronized (localihm.c)
    {
      if (!localihm.b.contains(this)) {
        localihm.b.add(this);
      }
      return;
    }
  }
  
  public final void onDestroy()
  {
    ihm localihm = this.e;
    localihm.a.unregisterReceiver(localihm.f);
    this.c.b(this);
    super.onDestroy();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.IngestService
 * JD-Core Version:    0.7.0.1
 */