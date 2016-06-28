package com.google.android.apps.plus.service;

import android.app.IntentService;
import android.content.Intent;

public class AndroidContactsNotificationService
  extends IntentService
{
  public AndroidContactsNotificationService()
  {
    super("ContactsNotificationSvc");
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName("com.google.android.gms", "com.google.android.gms.people.pub.PeopleSyncRawContactService");
    localIntent.setData(paramIntent.getData());
    startService(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.AndroidContactsNotificationService
 * JD-Core Version:    0.7.0.1
 */