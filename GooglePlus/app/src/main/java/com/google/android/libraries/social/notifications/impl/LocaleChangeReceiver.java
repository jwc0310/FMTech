package com.google.android.libraries.social.notifications.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import gk;
import jaj;
import jan;
import jdr;

public final class LocaleChangeReceiver
  extends gk
{
  private static final String a = jdr.a(LocaleChangeReceiver.class);
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.LOCALE_CHANGED".equals(paramIntent.getAction()))
    {
      jdr.a(a, "Device locale changed");
      Intent localIntent = new Intent(paramContext, GunsService.class);
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.SYNC_REGISTRATION_STATUS");
      localIntent.putExtra("force_gcm_registration", false);
      localIntent.putExtra("force_clean_slate", true);
      localIntent.putExtra("trigger", jan.e);
      localIntent.putExtra("registration_reason", jaj.c);
      a(paramContext, localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.impl.LocaleChangeReceiver
 * JD-Core Version:    0.7.0.1
 */