package com.google.android.libraries.social.networkqueue.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class MediaMountedReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    new ConnectivityReceiver();
    ConnectivityReceiver.a(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.MediaMountedReceiver
 * JD-Core Version:    0.7.0.1
 */