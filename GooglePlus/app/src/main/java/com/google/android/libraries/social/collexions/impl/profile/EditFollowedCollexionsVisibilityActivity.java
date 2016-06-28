package com.google.android.libraries.social.collexions.impl.profile;

import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import da;
import efj;
import gjp;
import hne;
import jyj;
import lzw;
import mbb;
import mbp;

public final class EditFollowedCollexionsVisibilityActivity
  extends mbp
{
  public EditFollowedCollexionsVisibilityActivity()
  {
    new gjp(this, this.n).a(this.m);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.ID);
    bz localbz = this.b.a.d;
    if (localbz.a(da.e) == null)
    {
      hne localhne = new hne();
      localbz.a().a(da.e, localhne).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.profile.EditFollowedCollexionsVisibilityActivity
 * JD-Core Version:    0.7.0.1
 */