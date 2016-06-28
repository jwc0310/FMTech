package com.google.android.libraries.social.mediamonitor;

import android.app.IntentService;
import android.content.Intent;
import ird;
import irf;
import java.util.Iterator;
import java.util.List;
import mbb;

public final class MediaMonitorIntentService
  extends IntentService
{
  public MediaMonitorIntentService()
  {
    super("MediaMonitorIntentService");
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      Iterator localIterator = mbb.c(getApplicationContext(), ird.class).iterator();
      while (localIterator.hasNext()) {
        ((ird)localIterator.next()).a();
      }
      MediaMonitor.a(paramIntent);
    }
    finally
    {
      MediaMonitor.a(paramIntent);
      ((irf)mbb.a(getApplicationContext(), irf.class)).a = false;
    }
    ((irf)mbb.a(getApplicationContext(), irf.class)).a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediamonitor.MediaMonitorIntentService
 * JD-Core Version:    0.7.0.1
 */