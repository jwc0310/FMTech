package com.google.android.libraries.social.notifications.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import gk;
import jaj;
import jdr;

public final class TimezoneChangeReceiver
  extends gk
{
  private static final String a = jdr.a(TimezoneChangeReceiver.class);
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.TIMEZONE_CHANGED".equals(paramIntent.getAction()))
    {
      jdr.a(a, "Device timezone changed.");
      Intent localIntent = new Intent(paramContext, GunsService.class);
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.SYNC_REGISTRATION_STATUS");
      localIntent.putExtra("force_gcm_registration", false);
      localIntent.putExtra("registration_reason", jaj.d);
      a(paramContext, localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.impl.TimezoneChangeReceiver
 * JD-Core Version:    0.7.0.1
 */