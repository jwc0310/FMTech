package com.google.android.apps.plus.service;

import android.app.IntentService;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import brd;
import hba;
import java.util.List;
import kbx;
import kcc;
import mbb;

public class PicasaNetworkService
  extends IntentService
{
  public PicasaNetworkService()
  {
    super("PicasaNetworkService");
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("op_name");
    long l1 = paramIntent.getLongExtra("total_time", 0L);
    long l2 = paramIntent.getLongExtra("net_duration", 0L);
    paramIntent.getLongExtra("sent_bytes", 0L);
    long l3 = paramIntent.getLongExtra("received_bytes", 0L);
    int i = paramIntent.getIntExtra("transaction_count", 1);
    kbx localkbx = new kbx();
    kcc localkcc = new kcc();
    localkcc.a = l3;
    localkcc.b = l3;
    for (int j = 0; j < i; j++) {
      localkcc.c = (1 + localkcc.c);
    }
    localkbx.a(str, new String[] { str });
    localkbx.a(localkcc);
    long l4 = l1 - l2;
    localkbx.a.b = l1;
    localkbx.a.c = l4;
    hba localhba = (hba)mbb.a(this, hba.class);
    if (localhba.e().size() > 0) {}
    try
    {
      brd.a(this, ((Integer)localhba.e().get(0)).intValue(), localkbx, null);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.e("PicasaNetworkService", "Error logging network data.", localSQLiteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PicasaNetworkService
 * JD-Core Version:    0.7.0.1
 */