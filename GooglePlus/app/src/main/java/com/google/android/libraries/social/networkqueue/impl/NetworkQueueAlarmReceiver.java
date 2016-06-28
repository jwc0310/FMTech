package com.google.android.libraries.social.networkqueue.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

public final class NetworkQueueAlarmReceiver
  extends BroadcastReceiver
{
  public static void a(Context paramContext, int paramInt)
  {
    ((AlarmManager)paramContext.getSystemService("alarm")).cancel(b(paramContext, paramInt));
  }
  
  public static void a(Context paramContext, int paramInt, long paramLong)
  {
    long l = Math.max(5000L, paramLong);
    if (Log.isLoggable("NetworkQueueAlarm", 4)) {
      new StringBuilder(47).append("Setting process alarm in ").append(l).append("ms");
    }
    PendingIntent localPendingIntent = b(paramContext, paramInt);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    localAlarmManager.cancel(localPendingIntent);
    localAlarmManager.set(2, l + SystemClock.elapsedRealtime(), localPendingIntent);
  }
  
  private static PendingIntent b(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent("com.google.android.apps.plus.networkqueueprocess");
    localIntent.putExtra("network_queue_scheduler", 1);
    localIntent.putExtra("account_id", paramInt);
    return PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 268435456);
  }
  
  public static PendingIntent b(Context paramContext, int paramInt, long paramLong)
  {
    Intent localIntent = new Intent("com.google.android.apps.plus.networkqueueprocess");
    localIntent.putExtra("network_queue_scheduler", 3);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("item_id", paramLong);
    return PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 268435456);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Context localContext = paramContext.getApplicationContext();
    paramIntent.setClass(localContext, NetworkQueueService.class);
    localContext.startService(paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.NetworkQueueAlarmReceiver
 * JD-Core Version:    0.7.0.1
 */