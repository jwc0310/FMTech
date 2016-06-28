package com.google.android.libraries.social.datacleanup.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gzj;
import hst;

public final class LowStorageMonitor
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!"android.intent.action.DEVICE_STORAGE_LOW".equals(paramIntent.getAction())) {
      return;
    }
    hst localhst = new hst(paramContext);
    localhst.j = true;
    gzj.a(paramContext, localhst);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.datacleanup.impl.LowStorageMonitor
 * JD-Core Version:    0.7.0.1
 */