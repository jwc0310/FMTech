package com.google.android.libraries.social.autobackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import hau;
import hbj;
import mbb;

public final class AutoBackupEnvironment$ConnectivityReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (hbj.b(paramContext)) {}
    hau localhau;
    do
    {
      do
      {
        return;
      } while (!AutoBackupEnvironment.a((AutoBackupEnvironment)mbb.a(paramContext, AutoBackupEnvironment.class), paramContext));
      localhau = (hau)mbb.b(paramContext, hau.class);
    } while (localhau == null);
    localhau.c.sendEmptyMessageDelayed(1, 0L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupEnvironment.ConnectivityReceiver
 * JD-Core Version:    0.7.0.1
 */