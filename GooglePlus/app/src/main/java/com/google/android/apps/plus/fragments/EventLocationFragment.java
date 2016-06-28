package com.google.android.apps.plus.fragments;

import aau;
import aaw;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import bk;
import bnh;
import bp;
import bzq;
import caa;
import cab;
import cac;
import cad;
import com.google.android.apps.plus.content.EsProvider;
import cv;
import cw;
import dfn;
import efj;
import frx;
import fu;
import fvt;
import gya;
import gzj;
import hqi;
import hqj;
import hqr;
import ijs;
import java.util.Arrays;
import jov;
import jpd;
import jpe;
import lmg;
import mbb;
import onv;
import qbe;
import qdd;
import qdq;
import qea;

public final class EventLocationFragment
  extends bzq<ListView, hqi>
  implements TextWatcher, AdapterView.OnItemClickListener, cw<Cursor>
{
  private static final String[] ad = { "_id", "type", "title", "description", "location" };
  public String Z;
  public double aa;
  public double ab;
  public cad ac;
  private EditText ae;
  private String af;
  private ijs ag;
  private frx ah;
  private dfn ai;
  private fvt aj = new caa(this);
  private jov ak;
  private jpd al;
  private jpe am = new cab(this);
  
  private final void a(Cursor paramCursor)
  {
    hqr localhqr = new hqr(ad);
    if (TextUtils.isEmpty(this.af))
    {
      Object[] arrayOfObject4 = new Object[5];
      arrayOfObject4[0] = Integer.valueOf(1);
      arrayOfObject4[1] = Integer.valueOf(0);
      int m = aau.gA;
      arrayOfObject4[2] = g().getString(m);
      int n = aau.gz;
      arrayOfObject4[3] = g().getString(n);
      arrayOfObject4[4] = null;
      localhqr.a(arrayOfObject4);
    }
    label282:
    for (;;)
    {
      this.b.b(localhqr);
      return;
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = Integer.valueOf(1);
      arrayOfObject1[1] = Integer.valueOf(1);
      int i = aau.gy;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.af;
      arrayOfObject1[2] = g().getString(i, arrayOfObject2);
      arrayOfObject1[3] = null;
      arrayOfObject1[4] = null;
      localhqr.a(arrayOfObject1);
      if ((paramCursor != null) && (paramCursor.moveToFirst()))
      {
        int j = 2;
        byte[] arrayOfByte = paramCursor.getBlob(0);
        lmg locallmg = lmg.a(arrayOfByte);
        int k;
        if (locallmg != null)
        {
          Object[] arrayOfObject3 = new Object[5];
          k = j + 1;
          arrayOfObject3[0] = Integer.valueOf(j);
          arrayOfObject3[1] = Integer.valueOf(2);
          arrayOfObject3[2] = locallmg.c;
          arrayOfObject3[3] = locallmg.b;
          arrayOfObject3[4] = arrayOfByte;
          localhqr.a(arrayOfObject3);
        }
        for (;;)
        {
          if (!paramCursor.moveToNext()) {
            break label282;
          }
          j = k;
          break;
          k = j;
        }
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.tB);
    this.b = new cac(f());
    ((ListView)this.a).setAdapter(this.b);
    ((ListView)this.a).setOnItemClickListener(this);
    this.ae = ((EditText)localView.findViewById(aaw.eM));
    this.ae.addTextChangedListener(this);
    this.ae.setText(this.Z);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (this.ag == null) {}
    for (String str = "no_location_stream_key";; str = this.ag.c)
    {
      Uri localUri = EsProvider.a(this.bn, f().getIntent().getIntExtra("account_id", -1), str);
      return new hqj(f(), localUri, new String[] { "location" }, null, null, null);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!v())
    {
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f());
      if (localSharedPreferences.contains("event.current.latitude"))
      {
        this.aa = Double.parseDouble(localSharedPreferences.getString("event.current.latitude", "0"));
        this.ab = Double.parseDouble(localSharedPreferences.getString("event.current.longitude", "0"));
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ak.a(aaw.iM, this.am);
    if (paramBundle != null)
    {
      this.af = paramBundle.getString("query");
      this.aa = paramBundle.getDouble("latitude");
      this.ab = paramBundle.getDouble("longitude");
      w();
    }
    for (;;)
    {
      k().a(0, null, this);
      return;
      this.ak.a(this.al, aaw.iM, Arrays.asList(new String[] { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" }));
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ak = ((jov)this.bo.a(jov.class));
    this.al = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("query", this.af);
    paramBundle.putDouble("latitude", this.aa);
    paramBundle.putDouble("longitude", this.ab);
  }
  
  public final void m()
  {
    int i = 1;
    super.m();
    int j;
    if (this.al.a(this.bn, "android.permission.ACCESS_COARSE_LOCATION") == 0)
    {
      j = i;
      if (this.al.a(this.bn, "android.permission.ACCESS_FINE_LOCATION") != 0) {
        break label64;
      }
    }
    for (;;)
    {
      if ((j != 0) || (i != 0)) {
        y();
      }
      return;
      j = 0;
      break;
      label64:
      i = 0;
    }
  }
  
  public final void n()
  {
    super.n();
    z();
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Cursor localCursor = (Cursor)this.b.getItem(paramInt);
    int i = localCursor.getInt(1);
    Object localObject = null;
    onv localonv;
    qdq localqdq;
    switch (i)
    {
    default: 
      byte[] arrayOfByte = localCursor.getBlob(4);
      localObject = null;
      if (arrayOfByte != null)
      {
        localonv = lmg.a(arrayOfByte).a();
        if (localonv != null) {
          break label139;
        }
        localqdq = null;
      }
      break;
    }
    label139:
    label368:
    for (;;)
    {
      localObject = localqdq;
      for (;;)
      {
        efj.k(this.N);
        if (this.ac != null) {
          this.ac.a((qdq)localObject);
        }
        return;
        localObject = new qdq();
        ((qdq)localObject).b = this.af;
      }
      localqdq = new qdq();
      if ((localonv.a != null) && (localonv.b != null))
      {
        qdd localqdd = new qdd();
        localqdd.c = Double.valueOf(localonv.a.intValue() / 10000000.0D);
        localqdd.d = Double.valueOf(localonv.b.intValue() / 10000000.0D);
        localqdq.e = new qbe();
        localqdq.e.a = new int[] { 343 };
        localqdq.e.a(qdd.a, localqdd);
      }
      if (!TextUtils.isEmpty(localonv.e)) {}
      for (String str = localonv.e;; str = localonv.f)
      {
        if (str == null) {
          break label368;
        }
        localqdq.b = str;
        localqdq.c = str;
        qea localqea = new qea();
        localqea.c = localonv.f;
        localqdq.d = new qbe();
        localqdq.d.a = new int[] { 342 };
        localqdq.d.a(qea.a, localqea);
        break;
      }
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = this.ae.getText().toString().trim();
    if (!TextUtils.equals(this.af, str))
    {
      this.af = str;
      if (i())
      {
        a(null);
        w();
        x();
      }
    }
  }
  
  public final gya r_()
  {
    return gya.D;
  }
  
  public final boolean v()
  {
    return (this.aa != 0.0D) && (this.ab != 0.0D);
  }
  
  public final void w()
  {
    if ((!TextUtils.isEmpty(this.af)) && (v()))
    {
      Location localLocation = new Location(null);
      localLocation.setLatitude(this.aa);
      localLocation.setLongitude(this.ab);
      this.ag = new ijs(localLocation, this.af);
      return;
    }
    this.ag = null;
  }
  
  public final void x()
  {
    if (this.ag != null)
    {
      k().b(0, null, this);
      gzj.a(f(), new bnh(f(), f().getIntent().getIntExtra("account_id", -1), this.ag, null));
    }
  }
  
  public final void y()
  {
    if (this.ai == null)
    {
      this.ai = new dfn(this.bn, f().getIntent().getIntExtra("account_id", -1), this.aj);
      this.ah = new frx(this.bn, 3000L, null, this.ai);
      this.ah.b();
    }
  }
  
  public final void z()
  {
    if (this.ai != null)
    {
      this.ai.f = true;
      this.ai = null;
      this.ah.c();
      this.ah = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.EventLocationFragment
 * JD-Core Version:    0.7.0.1
 */