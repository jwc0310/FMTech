package com.google.android.apps.plus.service;

import aaw;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import cv;
import cw;
import dks;
import dkt;
import dku;
import dkz;
import dla;
import efj;
import giz;
import guf;
import gug;
import java.util.Arrays;
import jov;
import jpd;
import jpe;
import mbb;
import mcc;

public class DreamSettingsActivity
  extends mcc
{
  public static final String[] d = { "0 AS row_type", "cluster_id", "title", "1 AS media_type" };
  public static final String[] e = { "0 AS row_type", "cluster_id", "title", "0 AS media_type" };
  public static final String[] f = { "2 AS row_type", "account_id", "account_display_name" };
  public final cw<Cursor> g = new dla(this);
  public giz h;
  public gug i;
  private ListView l;
  private dku m;
  private final cw<Cursor> n = new dkz(this);
  private jov o;
  private jpd p;
  private final jpe q = new dks(this);
  private final guf r = new dkt(this);
  
  public static Cursor a(Context paramContext, int paramInt)
  {
    MatrixCursor localMatrixCursor = new MatrixCursor(e);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(1);
    arrayOfObject[1] = null;
    arrayOfObject[2] = paramContext.getString(paramInt);
    arrayOfObject[3] = null;
    localMatrixCursor.addRow(arrayOfObject);
    return localMatrixCursor;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.h = ((giz)this.j.a(giz.class));
    this.o = ((jov)this.j.a(jov.class));
    this.p = ((jpd)this.j.a(jpd.class));
    this.i = ((gug)this.j.a(gug.class));
  }
  
  public final void e()
  {
    jov localjov = this.o;
    jpd localjpd = this.p;
    int j = aaw.iK;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    localjov.a(localjpd, j, Arrays.asList(arrayOfString));
  }
  
  public final void f()
  {
    cv localcv = c();
    localcv.a(1, null, this.g);
    localcv.a(0, null, this.n);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.to);
    View localView = findViewById(aaw.eI);
    this.l = ((ListView)findViewById(aaw.jI));
    this.l.setEmptyView(localView);
    this.o.a(aaw.iK, this.q);
    this.i.a(aaw.iD, this.r);
    if (paramBundle == null) {
      e();
    }
    jpd localjpd;
    do
    {
      return;
      localjpd = this.p;
    } while (localjpd.a(this, "android.permission.READ_EXTERNAL_STORAGE") != 0);
    f();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.DreamSettingsActivity
 * JD-Core Version:    0.7.0.1
 */