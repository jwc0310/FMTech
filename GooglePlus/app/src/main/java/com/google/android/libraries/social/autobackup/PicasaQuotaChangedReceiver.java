package com.google.android.libraries.social.autobackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import hbv;

public final class PicasaQuotaChangedReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("account_id", -1);
    int j = paramIntent.getIntExtra("quota_limit", -1);
    int k = paramIntent.getIntExtra("quota_used", -1);
    boolean bool1 = paramIntent.getBooleanExtra("quota_unlimited", false);
    boolean bool2 = paramIntent.getBooleanExtra("full_size_disabled", false);
    if (i == -1) {
      return;
    }
    PowerManager.WakeLock localWakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "Quota Changed");
    localWakeLock.acquire();
    new Thread(new hbv(this, paramContext, i, j, k, bool1, bool2, localWakeLock)).start();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.PicasaQuotaChangedReceiver
 * JD-Core Version:    0.7.0.1
 */