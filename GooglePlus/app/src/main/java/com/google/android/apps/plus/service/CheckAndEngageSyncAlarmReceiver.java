package com.google.android.apps.plus.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CheckAndEngageSyncAlarmReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    EsSyncAdapterService.d(paramContext, paramIntent.getStringExtra("account"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.CheckAndEngageSyncAlarmReceiver
 * JD-Core Version:    0.7.0.1
 */