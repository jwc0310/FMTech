package com.google.android.apps.plus.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bhp;
import bk;
import cmj;
import cmo;
import cna;
import cni;
import cnj;
import cnq;
import cnv;
import cnz;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jgm;
import mbb;
import mbp;

public class ProfileEditActivity
  extends mbp
  implements gxv
{
  private gjp d;
  private final bhp e;
  private cmo f;
  
  public ProfileEditActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    this.e = new bhp(this, 16908290);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof cmo)) {
      this.f = ((cmo)parambk);
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    if (this.f != null) {
      this.f.H();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null) {}
    jgm localjgm;
    Context localContext;
    gjp localgjp;
    switch (getIntent().getIntExtra("profile_edit_view_type", -1))
    {
    default: 
      throw new IllegalStateException("No View Type provided!");
    case 0: 
      this.f = new cna();
    case 12: 
    case 13: 
    case 15: 
    case 38: 
    case 1: 
      for (;;)
      {
        this.e.a(this.f);
        return;
        this.f = new cnz();
        continue;
        this.f = new cnj();
      }
    case 10: 
      localjgm = (jgm)this.m.b(jgm.class);
      if (localjgm != null)
      {
        localContext = getApplicationContext();
        localgjp = this.d;
        efj.k();
      }
      break;
    }
    for (boolean bool = localjgm.a(localContext, localgjp.a);; bool = false)
    {
      if (bool)
      {
        this.f = new cmj();
        break;
      }
      this.f = new cni();
      break;
      this.f = new cni();
      break;
      this.f = new cnq();
      break;
      this.f = new cnv();
      break;
    }
  }
  
  public final gya r_()
  {
    return gya.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.ProfileEditActivity
 * JD-Core Version:    0.7.0.1
 */