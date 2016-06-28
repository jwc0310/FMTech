package com.google.android.libraries.social.mediamonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import irf;
import mbb;

public final class AlarmReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!TextUtils.equals("com.google.android.libraries.social.mediamonitor.FIRE_ALARM", paramIntent.getAction())) {
      return;
    }
    ((irf)mbb.a(paramContext, irf.class)).a(paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediamonitor.AlarmReceiver
 * JD-Core Version:    0.7.0.1
 */