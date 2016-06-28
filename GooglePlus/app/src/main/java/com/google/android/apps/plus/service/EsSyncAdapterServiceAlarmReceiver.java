package com.google.android.apps.plus.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class EsSyncAdapterServiceAlarmReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    EsSyncAdapterService.a(paramContext, paramIntent.getStringExtra("synclet_name"), paramIntent.getStringExtra("account"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.EsSyncAdapterServiceAlarmReceiver
 * JD-Core Version:    0.7.0.1
 */