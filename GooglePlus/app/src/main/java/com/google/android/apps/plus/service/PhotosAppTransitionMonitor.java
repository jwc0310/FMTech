package com.google.android.apps.plus.service;

import android.content.Context;
import android.content.Intent;
import gk;

public final class PhotosAppTransitionMonitor
  extends gk
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    a(paramContext, new Intent(paramContext, PhotosAppTransitionService.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PhotosAppTransitionMonitor
 * JD-Core Version:    0.7.0.1
 */