package com.google.android.libraries.social.collexions.impl;

import android.content.Intent;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import cl;
import efj;
import ehr;
import gjp;
import gpm;
import hhv;
import jyj;
import lzw;
import mbb;
import mbp;

public final class CollexionEditHeaderActivity
  extends mbp
{
  public CollexionEditHeaderActivity()
  {
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gpm(this, this.n, efj.Hu).a(this.m);
    new gjp(this, this.n).a(this.m);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(ehr.aY);
    Bundle localBundle = getIntent().getExtras();
    if ((hhv)this.b.a.d.a("edit_header_fragment") == null)
    {
      hhv localhhv = hhv.a(localBundle.getString("clx_id"));
      this.b.a.d.a().b(ehr.aG, localhhv, "edit_header_fragment").b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.CollexionEditHeaderActivity
 * JD-Core Version:    0.7.0.1
 */