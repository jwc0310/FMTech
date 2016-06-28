package com.google.android.libraries.social.notifications.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import jaj;
import jan;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jdr;
import jdw;
import mbb;
import mga;

public final class GunsService
  extends Service
{
  private ExecutorService a;
  private boolean b;
  
  static
  {
    jdr.a(GunsService.class);
  }
  
  public static int a(Intent paramIntent)
  {
    return paramIntent.getIntExtra("account_id", -1);
  }
  
  public static jan b(Intent paramIntent)
  {
    Serializable localSerializable = paramIntent.getSerializableExtra("trigger");
    if (localSerializable != null) {
      return (jan)localSerializable;
    }
    return jan.a;
  }
  
  public static jaj c(Intent paramIntent)
  {
    Serializable localSerializable = paramIntent.getSerializableExtra("registration_reason");
    if (localSerializable != null) {
      return (jaj)localSerializable;
    }
    return jaj.a;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    this.a = ((ExecutorService)mbb.b(getApplicationContext(), ExecutorService.class));
    if (this.a != null)
    {
      this.b = true;
      return;
    }
    this.b = false;
    this.a = Executors.newFixedThreadPool(mga.a("debug.nots.service_thread_cnt", 1));
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (!this.b) {
      this.a.shutdown();
    }
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    jdw localjdw = new jdw(this, paramInt2, paramIntent);
    this.a.execute(localjdw);
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.service.GunsService
 * JD-Core Version:    0.7.0.1
 */