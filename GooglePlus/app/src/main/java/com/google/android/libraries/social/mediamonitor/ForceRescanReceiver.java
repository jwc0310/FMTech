package com.google.android.libraries.social.mediamonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import irf;
import mbb;

public final class ForceRescanReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    ((irf)mbb.a(paramContext, irf.class)).a(paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediamonitor.ForceRescanReceiver
 * JD-Core Version:    0.7.0.1
 */