package com.google.android.apps.plus.service;

import android.app.IntentService;
import android.content.Intent;
import duj;

public final class PhotosAppTransitionService
  extends IntentService
{
  public PhotosAppTransitionService()
  {
    super("PhotosAppTransitionService");
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    try
    {
      duj.d(this);
      duj.e(this);
      return;
    }
    finally
    {
      PhotosAppTransitionMonitor.a(paramIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PhotosAppTransitionService
 * JD-Core Version:    0.7.0.1
 */