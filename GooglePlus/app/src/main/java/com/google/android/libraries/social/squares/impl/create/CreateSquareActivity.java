package com.google.android.libraries.social.squares.impl.create;

import android.os.Bundle;
import aw;
import bp;
import bu;
import bv;
import bw;
import cl;
import efj;
import eyg;
import git;
import gjp;
import gpm;
import kyp;
import laf;
import lai;
import lzw;
import mbb;
import mbp;

public final class CreateSquareActivity
  extends mbp
  implements lai
{
  private final git d;
  
  public CreateSquareActivity()
  {
    new gpm(this, this.n, efj.WE).a(this.m);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    this.d = new gjp(this, this.n).a(this.m);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(lai.class, this);
  }
  
  public final void a(String paramString)
  {
    startActivity(((kyp)this.m.a(kyp.class)).a(this.d.c(), paramString, null));
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(eyg.bG);
    if (paramBundle == null)
    {
      laf locallaf = (laf)new laf();
      cl localcl = this.b.a.d.a();
      localcl.b(aw.dS, locallaf);
      localcl.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.create.CreateSquareActivity
 * JD-Core Version:    0.7.0.1
 */