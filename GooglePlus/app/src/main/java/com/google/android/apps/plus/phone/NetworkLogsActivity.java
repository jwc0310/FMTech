package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import bqj;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import mbb;
import mbp;

public class NetworkLogsActivity
  extends mbp
  implements gxv
{
  private final git d;
  
  public NetworkLogsActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.uH);
    String str1 = getIntent().getStringExtra("id");
    SQLiteDatabase localSQLiteDatabase = bqj.a(this, this.d.c()).getReadableDatabase();
    String str2 = String.valueOf(str1);
    String str3;
    Cursor localCursor;
    if (str2.length() != 0)
    {
      str3 = "SELECT * FROM network_data_transactions WHERE _id = ".concat(str2);
      localCursor = localSQLiteDatabase.rawQuery(str3, null);
      if (!localCursor.moveToFirst()) {
        break label138;
      }
    }
    label138:
    for (String str4 = localCursor.getString(9);; str4 = "Empty Logs, something went wrong.  Sorry!")
    {
      TextView localTextView = (TextView)findViewById(aaw.lt);
      localTextView.setText(str4);
      localTextView.setMovementMethod(new ScrollingMovementMethod());
      return;
      str3 = new String("SELECT * FROM network_data_transactions WHERE _id = ");
      break;
    }
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.NetworkLogsActivity
 * JD-Core Version:    0.7.0.1
 */