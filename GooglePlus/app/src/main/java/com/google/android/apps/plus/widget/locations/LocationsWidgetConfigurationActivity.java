package com.google.android.apps.plus.widget.locations;

import aau;
import aaw;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import bng;
import bp;
import bu;
import bv;
import bw;
import csl;
import cv;
import cw;
import eas;
import eat;
import eau;
import eba;
import efj;
import fu;
import giu;
import giv;
import gjb;
import gxz;
import gzi;
import gzj;
import haa;
import hae;
import hqg;
import hqy;
import ikt;
import ilf;
import ilm;
import ine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jma;
import lut;
import luu;
import mbb;
import mcc;
import nve;

public class LocationsWidgetConfigurationActivity
  extends mcc
  implements AdapterView.OnItemClickListener, cw<Cursor>, giv, gzi, luu
{
  private static String[] n = { "gaia_id", "avatar_url", "display_name" };
  public ikt d;
  public HashMap<String, Integer> e;
  private ListView f;
  private eau g;
  private final Object h = new Object();
  private int i;
  private nve[] l;
  private final gzj m;
  private ContextThemeWrapper o;
  
  public LocationsWidgetConfigurationActivity()
  {
    ikt localikt = new ikt(this, this.k);
    localikt.g.add(this);
    this.d = ((ikt)localikt);
    gzj localgzj = new gzj(this, this.k);
    localgzj.a.add(this);
    this.m = localgzj;
  }
  
  private final void f()
  {
    MatrixCursor localMatrixCursor = new MatrixCursor(n, this.l.length);
    for (nve localnve : this.l)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localnve.a;
      arrayOfObject[1] = localnve.d;
      arrayOfObject[2] = localnve.c;
      localMatrixCursor.addRow(arrayOfObject);
    }
    this.g.a(1, localMatrixCursor);
  }
  
  private void g()
  {
    if ((this.g != null) && (this.g.getCount() != 0))
    {
      this.f.setVisibility(0);
      findViewById(16908292).setVisibility(8);
      return;
    }
    this.f.setVisibility(4);
    findViewById(16908292).setVisibility(0);
    findViewById(aaw.eA).setVisibility(0);
    findViewById(aaw.ez).setVisibility(0);
    findViewById(aaw.jf).setVisibility(8);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        return null;
      } while ((!this.d.e()) || (this.l == null));
      ikt localikt2 = this.d;
      efj.k();
      return new csl(this, localikt2.e, this.l);
    } while (!this.d.e());
    ikt localikt1 = this.d;
    efj.k();
    return new jma(this, localikt1.e, 17, new eat(this));
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a(gzj.class, this.m);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    ikt localikt = this.d;
    efj.k();
    startActivity(efj.g(this, localikt.e, this.d.f().b("gaia_id")));
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (hae.a(paramhae))
    {
      findViewById(aaw.jf).setVisibility(0);
      findViewById(16908292).setVisibility(8);
    }
    do
    {
      return;
      if (paramhae == null)
      {
        e();
        return;
      }
      nve[] arrayOfnve = bng.a(paramhae);
      if ((arrayOfnve != null) && (arrayOfnve.length > 0))
      {
        this.l = arrayOfnve;
        f();
        c().b(0, null, this);
        return;
      }
    } while (this.b.a.d.a("lwca_no_shares") != null);
    findViewById(16908292).setVisibility(8);
    lut.b(null, getResources().getString(aau.jz), getResources().getString(aau.jA), getResources().getString(aau.cM)).a(this.b.a.d, "lwca_no_shares");
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      if (paramBoolean)
      {
        setContentView(efj.ux);
        this.f = ((ListView)findViewById(16908298));
        this.f.setOnItemClickListener(this);
        g();
        this.f.setAdapter(this.g);
        ((Button)findViewById(aaw.je)).setOnClickListener(new eas(this));
        if (this.l == null) {
          e();
        }
        return;
      }
      f();
      c().b(0, null, this);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("appWidgetId", this.i);
    setResult(0, localIntent);
    finish();
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    finish();
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    finish();
  }
  
  public final void e()
  {
    g();
    gzj localgzj = this.m;
    ikt localikt = this.d;
    efj.k();
    localgzj.b(new bng(this, localikt.e, null, 0, false));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {}
    for (this.i = localBundle.getInt("appWidgetId", 0); this.i == 0; this.i = 0)
    {
      finish();
      return;
    }
    this.o = new ContextThemeWrapper(this, efj.yV);
    this.g = new eau(this, this.o);
    hqy localhqy;
    if (paramBundle != null)
    {
      localhqy = (hqy)paramBundle.getParcelable("user_locations");
      if (localhqy != null) {
        break label159;
      }
    }
    label159:
    for (nve[] arrayOfnve = null;; arrayOfnve = (nve[])localhqy.a(new nve[0]))
    {
      this.l = arrayOfnve;
      ikt localikt = this.d;
      ilf localilf = new ilf();
      localilf.u.add(ine.class);
      localilf.s = ilm.class;
      localilf.t = null;
      localikt.a(localilf);
      return;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int j = this.g.e(paramInt);
    int k = this.g.f(paramInt);
    for (;;)
    {
      boolean bool1;
      synchronized (this.h)
      {
        if ((this.g != null) && (this.g.aN[j].c != null))
        {
          Cursor localCursor = this.g.aN[j].c;
          if ((localCursor.isClosed()) || (localCursor.getCount() <= k)) {
            return;
          }
          localCursor.moveToPosition(k);
          String str1;
          if (j == 0)
          {
            str1 = localCursor.getString(1);
            if (((Integer)this.e.get(str1)).intValue() > 1)
            {
              bool1 = true;
              break label339;
              String str3 = this.d.f().b("gaia_id");
              efj.a(this, this.i, str3, str1, str2, bool2);
              int i1 = this.i;
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = Integer.valueOf(i1);
              if (Log.isLoggable("LWProvider", 3)) {
                String.format("[%d] configureWidget", arrayOfObject);
              }
              LocationsWidgetProvider.a(this, i1);
              eba localeba = efj.o(this, i1);
              int i2 = localeba.a;
              if (localeba.d)
              {
                localgxz = gxz.cl;
                LocationsWidgetProvider.a(this, i2, localgxz);
                Intent localIntent = new Intent();
                localIntent.putExtra("appWidgetId", this.i);
                setResult(-1, localIntent);
                finish();
              }
            }
            else
            {
              bool1 = false;
              break label339;
            }
          }
          else
          {
            str2 = localCursor.getString(0);
            str1 = null;
            bool2 = false;
            continue;
          }
        }
        else
        {
          return;
        }
      }
      gxz localgxz = gxz.ck;
      continue;
      label339:
      boolean bool2 = bool1;
      String str2 = null;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.d.e()) && (this.l == null) && (!this.m.a("GetFriendLocationsTask"))) {
      e();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.l != null) {
      paramBundle.putParcelable("user_locations", new hqy(this.l));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.locations.LocationsWidgetConfigurationActivity
 * JD-Core Version:    0.7.0.1
 */