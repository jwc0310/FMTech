package com.google.android.apps.plus.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dkh;

public class PackagesMediaMonitor
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    dkh.a(paramContext);
    paramIntent.setClass(paramContext, PackagesMediaMonitor.AsyncService.class);
    paramContext.startService(paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PackagesMediaMonitor
 * JD-Core Version:    0.7.0.1
 */