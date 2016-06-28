package com.google.android.apps.plus.phone;

import aaw;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.widget.ListView;
import com.google.android.apps.plus.content.EsProvider;
import cv;
import cw;
import cxm;
import efj;
import fu;
import git;
import gjp;
import gxv;
import gya;
import hqj;
import java.util.ArrayList;
import jyj;
import lwd;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public class AccountStatusActivity
  extends mbp
  implements cw<Cursor>, gxv
{
  private final git d;
  private ListView e;
  private ArrayList<Pair<String, String>> f;
  private cxm g;
  
  public AccountStatusActivity()
  {
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
  }
  
  private final String a(Cursor paramCursor, int paramInt, String paramString)
  {
    int i = 1;
    if (Build.VERSION.SDK_INT < 11) {
      try
      {
        String str2 = paramCursor.getString(paramInt);
        return str2;
      }
      catch (SQLiteException localSQLiteException)
      {
        return "BLOB";
      }
    }
    switch (paramCursor.getType(paramInt))
    {
    case 2: 
    case 3: 
    default: 
      return paramCursor.getString(paramInt);
    case 4: 
      byte[] arrayOfByte = paramCursor.getBlob(paramInt);
      if (arrayOfByte == null) {
        return null;
      }
      int k = arrayOfByte.length;
      return 24 + "BLOB " + k + " byte(s)";
    }
    long l = paramCursor.getLong(paramInt);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(l);
    if (l >= 1000L)
    {
      localStringBuilder.append(" [");
      if (TextUtils.isEmpty(paramString)) {
        break label244;
      }
      String str1 = paramString.toLowerCase();
      if ((!str1.contains("interval")) && (!str1.contains("duration")) && (!str1.contains("threshold"))) {
        break label244;
      }
    }
    label244:
    for (int j = i; j != 0; j = 0)
    {
      localStringBuilder.append(lwd.a(Long.valueOf(l)));
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains("version"))) {}
    for (;;)
    {
      if (i != 0) {
        l /= 1000L;
      }
      localStringBuilder.append(DateUtils.formatDateTime(this, l, 17));
      break;
      i = 0;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.d.e()) {
      return null;
    }
    return new hqj(this, EsProvider.a(EsProvider.c(this), this.d.c()), null, null, null, null);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void b(Bundle paramBundle) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.ss);
    e().a().c(true);
    this.e = ((ListView)findViewById(aaw.u));
    this.f = new ArrayList();
    this.g = new cxm(this, this.f);
    this.e.setAdapter(this.g);
    c().a(0, null, this);
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AccountStatusActivity
 * JD-Core Version:    0.7.0.1
 */