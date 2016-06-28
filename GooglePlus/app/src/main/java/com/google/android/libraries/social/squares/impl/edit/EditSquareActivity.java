package com.google.android.libraries.social.squares.impl.edit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import aw;
import bk;
import bp;
import bu;
import bv;
import bw;
import cl;
import cz;
import da;
import dl;
import efj;
import fe;
import gjp;
import gpm;
import gpq;
import gpr;
import gug;
import lbi;
import lbm;
import lzw;
import mbb;
import mbp;
import tp;

public final class EditSquareActivity
  extends mbp
  implements gpq, lbm
{
  private lbi d;
  private boolean e;
  
  public EditSquareActivity()
  {
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gjp(this, this.n).a(this.m);
    new gug(this.n).a(this.m);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.WW).a(this.m).a(this));
    this.m.a(lbm.class, this);
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString)
  {
    if (this.e)
    {
      Intent localIntent = cz.a.a(this);
      if (localIntent != null)
      {
        localIntent.putExtra("square_id", paramString);
        localIntent.putExtra("square_name", "");
        if (cz.a.a(this, localIntent)) {
          new fe(this).a(localIntent).a();
        }
      }
      else
      {
        return;
      }
      cz.a.b(this, localIntent);
      return;
    }
    finish();
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return false;
    }
    this.e = true;
    this.d.v();
    return true;
  }
  
  public final void b(tp paramtp) {}
  
  public final void onBackPressed()
  {
    this.e = false;
    this.d.v();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aw.ed);
    if (paramBundle == null)
    {
      cl localcl = this.b.a.d.a();
      String str = getIntent().getStringExtra("square_id");
      lbi locallbi = new lbi();
      Bundle localBundle = new Bundle();
      localBundle.putString("square_id", str);
      locallbi.f(localBundle);
      this.d = ((lbi)locallbi);
      localcl.b(dl.U, this.d, "edit_square_fragment");
      localcl.b();
      return;
    }
    this.d = ((lbi)this.b.a.d.a("edit_square_fragment"));
    this.e = paramBundle.getBoolean("home_pressed");
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("home_pressed", this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.edit.EditSquareActivity
 * JD-Core Version:    0.7.0.1
 */