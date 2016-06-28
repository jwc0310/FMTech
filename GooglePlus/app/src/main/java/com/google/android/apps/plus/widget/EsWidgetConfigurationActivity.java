package com.google.android.apps.plus.widget;

import aau;
import aaw;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import cv;
import cw;
import ean;
import efj;
import fu;
import giu;
import giv;
import giz;
import gjb;
import ikt;
import ilf;
import ilm;
import java.util.List;
import jma;
import mbb;
import mcc;
import ra;

public class EsWidgetConfigurationActivity
  extends mcc
  implements AdapterView.OnItemClickListener, cw<Cursor>, giv
{
  private boolean d;
  private int e;
  private ListView f;
  private ean g;
  private final Object h = new Object();
  private ikt i;
  
  public EsWidgetConfigurationActivity()
  {
    ikt localikt = new ikt(this, this.k);
    localikt.g.add(this);
    this.i = ((ikt)localikt);
  }
  
  private void e()
  {
    if (this.d)
    {
      this.f.setVisibility(4);
      findViewById(16908292).setVisibility(0);
      findViewById(aaw.eA).setVisibility(8);
      findViewById(aaw.ez).setVisibility(0);
      return;
    }
    this.f.setVisibility(0);
    findViewById(16908292).setVisibility(8);
    findViewById(aaw.eA).setVisibility(8);
    findViewById(aaw.ez).setVisibility(8);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    }
    do
    {
      return null;
    } while (!this.i.e());
    ikt localikt = this.i;
    efj.k();
    return new jma(this, localikt.e, 4);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      setContentView(efj.wK);
      this.d = true;
      this.f = ((ListView)findViewById(16908298));
      this.f.setOnItemClickListener(this);
      View localView = LayoutInflater.from(this).inflate(efj.wL, null);
      localView.findViewById(aaw.bl).setVisibility(8);
      ((TextView)localView.findViewById(aaw.bn)).setText(aau.vN);
      localView.findViewById(aaw.bm).setVisibility(8);
      this.f.addHeaderView(localView, null, true);
      this.g = new ean(this, this);
      this.f.setAdapter(this.g);
      e();
      c().a(0, null, this);
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      this.e = localBundle.getInt("appWidgetId", 0);
      if (this.e != 0) {
        break label48;
      }
      finish();
    }
    label48:
    while (paramBundle != null)
    {
      return;
      this.e = 0;
      break;
    }
    ikt localikt = this.i;
    ilf localilf = new ilf();
    localilf.s = ilm.class;
    localilf.t = null;
    localikt.a(localilf);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - this.f.getHeaderViewsCount();
    Object localObject3;
    Object localObject4;
    int k;
    giz localgiz;
    String str5;
    label132:
    int n;
    if (j < 0)
    {
      String str10 = getString(aau.tY);
      localObject3 = "v.all.circles";
      localObject4 = str10;
      ikt localikt = this.i;
      efj.k();
      k = localikt.e;
      int m = this.e;
      localgiz = (giz)mbb.a(this, giz.class);
      SharedPreferences.Editor localEditor = getSharedPreferences("com.google.android.apps.plus.widget.EsWidgetUtils", 0).edit();
      String str3 = String.valueOf("gaiaId_");
      String str4 = 11 + String.valueOf(str3).length() + str3 + m;
      if (k != -1) {
        break label482;
      }
      str5 = "";
      localEditor.putString(str4, str5);
      String str6 = String.valueOf("circleId_");
      String str7 = 11 + String.valueOf(str6).length() + str6 + m;
      if (localObject3 == null) {
        localObject3 = "";
      }
      localEditor.putString(str7, (String)localObject3);
      String str8 = String.valueOf("circleName_");
      String str9 = 11 + String.valueOf(str8).length() + str8 + m;
      if (localObject4 == null) {
        localObject4 = "";
      }
      localEditor.putString(str9, (String)localObject4);
      localEditor.apply();
      n = this.e;
      if (Log.isLoggable("EsWidget", 3)) {
        new StringBuilder(29).append("[").append(n).append("] configureWidget");
      }
      if (k != -1) {
        break label504;
      }
      EsWidgetProvider.a(this, n);
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("appWidgetId", this.e);
      setResult(-1, localIntent);
      finish();
      return;
      Cursor localCursor;
      synchronized (this.h)
      {
        if ((this.g == null) || (this.g.c == null)) {
          break label478;
        }
        localCursor = this.g.c;
        if ((localCursor.isClosed()) || (localCursor.getCount() <= j)) {
          return;
        }
      }
      localCursor.moveToPosition(j);
      String str1 = localCursor.getString(1);
      String str2 = localCursor.getString(2);
      localObject3 = str1;
      localObject4 = str2;
      break;
      label478:
      return;
      label482:
      str5 = localgiz.a(k).b("gaia_id");
      break label132;
      label504:
      EsWidgetProvider.b(this, n);
      startService(EsWidgetProvider.a(this, n, null, false, false));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.EsWidgetConfigurationActivity
 * JD-Core Version:    0.7.0.1
 */