package com.google.android.apps.plus.phone;

import aaw;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import bk;
import bzi;
import com.google.android.apps.plus.fragments.EditEventFragment;
import ddj;
import ddk;
import efj;
import git;
import gjp;
import gxv;
import gxw;
import gxx;
import gxz;
import gya;
import hxj;
import hxk;
import hxm;
import java.util.TimeZone;
import jyj;
import mbb;
import mbp;
import mfx;
import qbe;
import qbz;
import qdc;
import qdt;
import qdu;

public class NewEventActivity
  extends mbp
  implements bzi, gxv
{
  public EditEventFragment d;
  
  public NewEventActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof EditEventFragment))
    {
      this.d = ((EditEventFragment)parambk);
      EditEventFragment localEditEventFragment = this.d;
      if (localEditEventFragment.ac == null)
      {
        qdt localqdt = new qdt();
        localqdt.l = new qdu();
        localqdt.l.a = new qbz();
        localqdt.l.a.a = Boolean.valueOf(true);
        localqdt.l.a.b = Boolean.valueOf(true);
        qdc localqdc = new qdc();
        localqdc.b = Long.valueOf(EditEventFragment.v());
        localqdc.c = localEditEventFragment.an.a().a.getID();
        localqdt.h = new qbe();
        localqdt.h.a = new int[] { 406 };
        localqdt.h.a(qdc.a, localqdc);
        localEditEventFragment.ac = new hxj(localqdt);
        long l = System.currentTimeMillis();
        String str = String.valueOf(mfx.a(32));
        localEditEventFragment.aj = (21 + String.valueOf(str).length() + l + "." + str);
        localEditEventFragment.ad = -1;
      }
      this.d.ae = this;
    }
  }
  
  public final void a(hxj paramhxj)
  {
    Boolean localBoolean;
    if (paramhxj != null)
    {
      if (!TextUtils.isEmpty(paramhxj.m()))
      {
        gxx localgxx4 = (gxx)this.m.a(gxx.class);
        gxw localgxw4 = new gxw(this);
        localgxw4.c = gxz.aN;
        localgxx4.a(localgxw4);
      }
      if (paramhxj.j() != null)
      {
        gxx localgxx3 = (gxx)this.m.a(gxx.class);
        gxw localgxw3 = new gxw(this);
        localgxw3.c = gxz.aL;
        localgxx3.a(localgxw3);
      }
      qdu localqdu = paramhxj.f();
      if (localqdu.a != null)
      {
        localBoolean = localqdu.a.d;
        if (localBoolean != null) {
          break label222;
        }
      }
    }
    label222:
    for (boolean bool = false;; bool = localBoolean.booleanValue())
    {
      if (bool)
      {
        gxx localgxx2 = (gxx)this.m.a(gxx.class);
        gxw localgxw2 = new gxw(this);
        localgxw2.c = gxz.aO;
        localgxx2.a(localgxw2);
      }
      gxx localgxx1 = (gxx)this.m.a(gxx.class);
      gxw localgxw1 = new gxw(this);
      localgxw1.c = gxz.aM;
      localgxx1.a(localgxw1);
      finish();
      return;
    }
  }
  
  public final void ak_()
  {
    finish();
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    if (this.d != null) {
      this.d.C();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.uN);
    View localView1 = findViewById(aaw.aU);
    if (localView1 != null) {
      localView1.setOnClickListener(new ddj(this));
    }
    View localView2 = findViewById(aaw.jM);
    if (localView2 != null) {
      localView2.setOnClickListener(new ddk(this));
    }
  }
  
  public final gya r_()
  {
    return gya.A;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.NewEventActivity
 * JD-Core Version:    0.7.0.1
 */