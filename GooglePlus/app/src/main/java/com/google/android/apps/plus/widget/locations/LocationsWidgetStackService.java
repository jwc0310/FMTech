package com.google.android.apps.plus.widget.locations;

import android.content.Intent;
import android.widget.RemoteViewsService;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import eaw;

public class LocationsWidgetStackService
  extends RemoteViewsService
{
  public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent paramIntent)
  {
    return new eaw(getApplicationContext(), paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.locations.LocationsWidgetStackService
 * JD-Core Version:    0.7.0.1
 */