package com.google.android.libraries.social.squares.impl.edit;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import aw;
import bk;
import bp;
import bu;
import bv;
import bw;
import cl;
import dl;
import efj;
import ev;
import gjp;
import gpm;
import gpq;
import gpr;
import gxj;
import gxl;
import kuw;
import lax;
import lay;
import lut;
import lzw;
import mbb;
import mbp;
import pjo;
import tp;
import uo;
import uq;

public final class EditCategoriesActivity
  extends mbp
  implements gpq, lay
{
  private lax d;
  
  public EditCategoriesActivity()
  {
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxj(this.n);
    new gjp(this, this.n).a(this.m);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.WW).a(this.m).a(this));
    new gxl(new kuw(pjo.ad, getIntent().getStringExtra("square_id"))).a(this.m);
    this.m.a(lay.class, this);
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final void f()
  {
    finish();
  }
  
  public final void onBackPressed()
  {
    lax locallax = this.d;
    if (locallax.a)
    {
      int i = ev.G;
      String str1 = locallax.g().getString(i);
      int j = ev.F;
      String str2 = locallax.g().getString(j);
      int k = ev.c;
      String str3 = locallax.g().getString(k);
      int m = ev.a;
      lut locallut = lut.b(str1, str2, str3, locallax.g().getString(m));
      locallut.n = locallax;
      locallut.p = 0;
      locallut.a(locallax.h(), "leave_edit_categories_alert");
      return;
    }
    ((lay)locallax.bo.a(lay.class)).f();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aw.ed);
    e().a();
    e().a().c(false);
    if (paramBundle == null)
    {
      cl localcl = this.b.a.d.a();
      String str = getIntent().getStringExtra("square_id");
      lax locallax = new lax();
      Bundle localBundle = new Bundle();
      localBundle.putString("square_id", str);
      locallax.f(localBundle);
      this.d = ((lax)locallax);
      localcl.b(dl.U, this.d, "edit_categories_fragment");
      localcl.b();
      return;
    }
    this.d = ((lax)this.b.a.d.a("edit_categories_fragment"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.edit.EditCategoriesActivity
 * JD-Core Version:    0.7.0.1
 */