package com.google.android.libraries.social.async;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class BackgroundTaskService
  extends Service
{
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.async.BackgroundTaskService
 * JD-Core Version:    0.7.0.1
 */