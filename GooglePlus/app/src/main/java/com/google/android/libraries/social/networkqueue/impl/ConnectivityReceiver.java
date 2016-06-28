package com.google.android.libraries.social.networkqueue.impl;

import android.content.Context;
import android.content.Intent;
import gk;
import ixf;
import mbb;

public final class ConnectivityReceiver
  extends gk
{
  static void a(Context paramContext)
  {
    if (((ixf)mbb.a(paramContext, ixf.class)).a())
    {
      Intent localIntent = new Intent(paramContext, NetworkQueueService.class);
      localIntent.putExtra("network_queue_scheduler", 4);
      localIntent.putExtra("extra_start_from_receiver", true);
      a(paramContext, localIntent);
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    a(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.ConnectivityReceiver
 * JD-Core Version:    0.7.0.1
 */