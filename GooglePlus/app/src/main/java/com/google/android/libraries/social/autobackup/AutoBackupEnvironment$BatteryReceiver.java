package com.google.android.libraries.social.autobackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import hau;
import hbj;
import mbb;

public final class AutoBackupEnvironment$BatteryReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (hbj.b(paramContext)) {}
    AutoBackupEnvironment localAutoBackupEnvironment;
    do
    {
      do
      {
        return;
        localAutoBackupEnvironment = (AutoBackupEnvironment)mbb.a(paramContext, AutoBackupEnvironment.class);
      } while (!AutoBackupEnvironment.a(localAutoBackupEnvironment, paramContext, paramIntent));
      hau localhau = (hau)mbb.b(paramContext, hau.class);
      if (localhau != null) {
        localhau.c.sendEmptyMessageDelayed(1, 0L);
      }
    } while (!localAutoBackupEnvironment.a);
    FingerprintScannerIntentService.a(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupEnvironment.BatteryReceiver
 * JD-Core Version:    0.7.0.1
 */