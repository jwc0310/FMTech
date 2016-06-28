package com.google.android.libraries.social.notifications.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import gk;
import jaj;
import jdr;

public final class AppUpgradeReceiver
  extends gk
{
  private static final String a = jdr.a(AppUpgradeReceiver.class);
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.MY_PACKAGE_REPLACED".equals(paramIntent.getAction()))
    {
      jdr.a(a, "App upgrade intent received.");
      Intent localIntent = new Intent(paramContext, GunsService.class);
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.SYNC_REGISTRATION_STATUS");
      localIntent.putExtra("force_gcm_registration", true);
      localIntent.putExtra("registration_reason", jaj.e);
      a(paramContext, localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.impl.AppUpgradeReceiver
 * JD-Core Version:    0.7.0.1
 */