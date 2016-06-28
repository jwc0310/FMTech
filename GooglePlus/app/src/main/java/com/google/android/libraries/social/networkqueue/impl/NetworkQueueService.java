package com.google.android.libraries.social.networkqueue.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import gzj;
import iyk;
import iyl;
import izi;
import izj;
import izm;
import izn;
import mbb;

public final class NetworkQueueService
  extends Service
  implements izn
{
  public final Object a = new Object();
  public SparseArray<izi> b;
  public izn c;
  private izj d;
  private izm e;
  
  public final void a()
  {
    stopSelf();
  }
  
  public final boolean a(int paramInt, long paramLong, boolean paramBoolean)
  {
    if (Log.isLoggable("NetworkQueueService", 4))
    {
      long l = paramLong / 1000L;
      new StringBuilder(74).append("Schedule processing: accountId=").append(paramInt).append(", delay=").append(l).append(" sec");
    }
    synchronized (this.a)
    {
      izi localizi = (izi)this.b.get(paramInt);
      if (localizi == null)
      {
        iyk localiyk = ((iyl)mbb.a(this, iyl.class)).a(paramInt);
        if (localiyk == null) {
          return false;
        }
        localizi = new izi(getApplicationContext(), localiyk, this.d);
        if (!localizi.a()) {
          return false;
        }
        this.b.put(paramInt, localizi);
      }
      localizi.a(paramLong, paramBoolean);
      return true;
    }
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    this.c = ((izn)mbb.b(this, izn.class));
    if (this.c == null) {
      this.c = this;
    }
    this.e = new izm(this);
    this.b = new SparseArray();
    this.d = new izj(this);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("NetworkQueueService", 4)) {
      new StringBuilder(54).append("onStartCommand with id: ").append(paramInt2).append(" flags: ").append(paramInt1);
    }
    if ((paramInt1 & 0x1) != 0)
    {
      gzj.a(this, this.e);
      if (paramIntent.hasExtra("extra_start_from_receiver")) {
        ConnectivityReceiver.a(paramIntent);
      }
      return 3;
    }
    int i = paramIntent.getIntExtra("network_queue_scheduler", -1);
    int j = paramIntent.getIntExtra("account_id", -1);
    switch (i)
    {
    case 0: 
    default: 
      Log.e("NetworkQueueService", 30 + "Unhandled command: " + i);
      this.c.a();
    }
    while (paramIntent.hasExtra("extra_start_from_receiver"))
    {
      ConnectivityReceiver.a(paramIntent);
      return 3;
      gzj.a(this, this.e);
      continue;
      if (j == -1) {
        Log.e("NetworkQueueService", "Invalid account id for process.");
      }
      a(j, paramIntent.getLongExtra("extra_delay_millis", 0L), paramIntent.getBooleanExtra("extra_retry_ioexceptions", true));
      continue;
      if (j == -1) {
        Log.e("NetworkQueueService", "Invalid account id for cancel.");
      }
      iyk localiyk = ((iyl)mbb.a(this, iyl.class)).a(j);
      synchronized (this.a)
      {
        izi localizi = (izi)this.b.get(j);
        if (localizi != null)
        {
          localizi.a(getApplicationContext());
          this.d.a(localizi, localiyk);
        }
      }
      long l = paramIntent.getLongExtra("item_id", -1L);
      if (l != -1L)
      {
        Log.e("NetworkQueueService", 72 + "Queue item timed out for account " + j + " itemId:" + l);
      }
      else if (Log.isLoggable("NetworkQueueService", 4))
      {
        continue;
        Log.e("NetworkQueueService", "No command specified in intent.");
        this.c.a();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.NetworkQueueService
 * JD-Core Version:    0.7.0.1
 */