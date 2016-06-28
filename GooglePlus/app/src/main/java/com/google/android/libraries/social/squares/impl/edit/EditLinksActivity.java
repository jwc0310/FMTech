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
import laz;
import lba;
import lut;
import lzw;
import mbb;
import mbp;
import pjo;
import tp;

public final class EditLinksActivity
  extends mbp
  implements gpq, lba
{
  private laz d;
  
  public EditLinksActivity()
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
    new gxl(new kuw(pjo.ap, getIntent().getStringExtra("square_id"))).a(this.m);
    this.m.a(lba.class, this);
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
    laz locallaz = this.d;
    if (locallaz.a)
    {
      int i = ev.G;
      String str1 = locallaz.g().getString(i);
      int j = ev.F;
      String str2 = locallaz.g().getString(j);
      int k = ev.c;
      String str3 = locallaz.g().getString(k);
      int m = ev.a;
      lut locallut = lut.b(str1, str2, str3, locallaz.g().getString(m));
      locallut.n = locallaz;
      locallut.p = 0;
      locallut.a(locallaz.h(), "leave_edit_links_alert");
      return;
    }
    ((lba)locallaz.bo.a(lba.class)).f();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aw.ed);
    if (paramBundle == null)
    {
      cl localcl = this.b.a.d.a();
      String str = getIntent().getStringExtra("square_id");
      laz locallaz = new laz();
      Bundle localBundle = new Bundle();
      localBundle.putString("square_id", str);
      locallaz.f(localBundle);
      this.d = ((laz)locallaz);
      localcl.b(dl.U, this.d, "edit_links_fragment");
      localcl.b();
      return;
    }
    this.d = ((laz)this.b.a.d.a("edit_links_fragment"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.edit.EditLinksActivity
 * JD-Core Version:    0.7.0.1
 */