package com.google.android.apps.plus.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dmm;

public class LocaleChangeReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = EsService.e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 5);
    EsService.a(paramContext, localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.LocaleChangeReceiver
 * JD-Core Version:    0.7.0.1
 */