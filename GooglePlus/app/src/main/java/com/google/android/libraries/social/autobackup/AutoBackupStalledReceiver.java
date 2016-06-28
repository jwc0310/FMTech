package com.google.android.libraries.social.autobackup;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import dk;
import efj;
import giz;
import hal;
import hba;
import hbj;
import hcv;
import hcw;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mbb;

public final class AutoBackupStalledReceiver
  extends BroadcastReceiver
{
  private static final long a = TimeUnit.DAYS.toMillis(1L);
  
  private static int a(Context paramContext)
  {
    hba localhba = (hba)mbb.a(paramContext, hba.class);
    if (!localhba.e().isEmpty()) {
      return ((Integer)localhba.e().get(0)).intValue();
    }
    return -1;
  }
  
  public static PendingIntent a(Context paramContext, boolean paramBoolean, long paramLong)
  {
    Intent localIntent = new Intent(paramContext, AutoBackupStalledReceiver.class);
    localIntent.setAction("com.google.android.libraries.social.autobackup.backupstalled");
    localIntent.putExtra("com.google.android.libraries.social.autobackup.extra_last_attempt_time", paramLong);
    if (paramBoolean) {}
    for (int i = 1073741824;; i = 1610612736) {
      return PendingIntent.getBroadcast(paramContext, 0, localIntent, i);
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (hbj.e(paramContext))
    {
      long l = paramIntent.getLongExtra("com.google.android.libraries.social.autobackup.extra_last_attempt_time", System.currentTimeMillis());
      if (TextUtils.equals(paramIntent.getAction(), "com.google.android.libraries.social.autobackup.backupstalled")) {
        if ((!((giz)mbb.a(paramContext, giz.class)).a().isEmpty()) && (!hbj.b(paramContext)))
        {
          localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
          i = a(paramContext);
          localIntent1 = ((hcv)mbb.a(paramContext, hcv.class)).c(paramContext, i);
          localPendingIntent1 = PendingIntent.getActivity(paramContext, (int)System.currentTimeMillis(), localIntent1, 0);
          localdk = new dk(paramContext);
          j = efj.Fi;
          localdk.x.icon = j;
          localdk.a(16, true);
          localdk.r = true;
          localdk.b = dk.a(paramContext.getString(efj.FB));
          localIntent2 = new Intent(paramContext, AutoBackupStalledReceiver.class);
          localIntent2.setAction("com.google.android.libraries.social.autobackup.backupstalleddismissed");
          localIntent2.putExtra("com.google.android.libraries.social.autobackup.extra_last_attempt_time", l);
          localPendingIntent2 = PendingIntent.getBroadcast(paramContext, 0, localIntent2, 1073741824);
          localdk.x.deleteIntent = localPendingIntent2;
          k = (int)Math.round(Math.ceil((float)(System.currentTimeMillis() - l) / (float)a));
          localResources = paramContext.getResources();
          m = efj.Fp;
          arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(k);
          localdk.c = dk.a(localResources.getQuantityString(m, k, arrayOfObject));
          localdk.d = localPendingIntent1;
          localNotificationManager.notify(String.valueOf(paramContext.getPackageName()).concat(":notifications:backup_stalled"), efj.Fo, localdk.b());
          n = a(paramContext);
          ((hal)mbb.a(paramContext, hal.class)).c(paramContext, n);
        }
      }
      while (!TextUtils.equals(paramIntent.getAction(), "com.google.android.libraries.social.autobackup.backupstalleddismissed"))
      {
        NotificationManager localNotificationManager;
        int i;
        Intent localIntent1;
        PendingIntent localPendingIntent1;
        dk localdk;
        int j;
        Intent localIntent2;
        PendingIntent localPendingIntent2;
        int k;
        Resources localResources;
        int m;
        Object[] arrayOfObject;
        int n;
        return;
      }
      hcw.a(paramContext, l, true);
      return;
    }
    hcw.b(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupStalledReceiver
 * JD-Core Version:    0.7.0.1
 */