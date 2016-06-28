package com.google.android.libraries.social.silentfeedback.impl;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import fsc;
import fsd;
import ftj;
import ftk;
import kpj;
import kpl;
import mbb;

public final class SilentFeedbackService
  extends Service
{
  private final Object a = new Object();
  private int b = 0;
  private int c = 0;
  
  private final boolean b()
  {
    try
    {
      i = getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
      boolean bool = false;
      if (i >= 6577000) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i = 0;
      }
    }
  }
  
  public final void a()
  {
    synchronized (this.a)
    {
      int i = -1 + this.b;
      this.b = i;
      Integer localInteger = null;
      if (i == 0) {
        localInteger = Integer.valueOf(this.c);
      }
      if (localInteger != null) {
        stopSelf(localInteger.intValue());
      }
      return;
    }
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (this.a)
    {
      this.b = (1 + this.b);
      this.c = paramInt2;
      if (!b())
      {
        a();
        return 2;
      }
    }
    fsc localfsc = ((fsd)mbb.a(getApplication(), fsd.class)).a(((ftk)mbb.a(getApplication(), ftk.class)).a()).a();
    localfsc.a(new kpj(this, ((ftj)mbb.a(getApplication(), ftj.class)).a(localfsc), paramIntent, localfsc));
    localfsc.a(new kpl(this));
    localfsc.b();
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService
 * JD-Core Version:    0.7.0.1
 */