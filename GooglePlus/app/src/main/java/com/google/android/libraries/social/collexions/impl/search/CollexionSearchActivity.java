package com.google.android.libraries.social.collexions.impl.search;

import android.content.Intent;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import ehr;
import gjp;
import gpm;
import gxj;
import gxq;
import gxs;
import hop;
import idy;
import jyj;
import lzw;
import mbb;
import mbp;
import pkb;

public final class CollexionSearchActivity
  extends mbp
  implements gxs
{
  public CollexionSearchActivity()
  {
    new idy(this, this.n, "android_collections_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxj(this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxs.class, this);
    new gpm(this, this.n, efj.Ju).a(this.m);
    new gjp(this, this.n).a(this.m);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Jr);
    bz localbz = this.b.a.d;
    if (localbz.a(ehr.bi) == null)
    {
      cl localcl = localbz.a();
      int i = ehr.bi;
      String str = getIntent().getExtras().getString("query");
      hop localhop = new hop();
      Bundle localBundle = new Bundle();
      localBundle.putString("query", str);
      localhop.f(localBundle);
      localcl.a(i, localhop).b();
    }
  }
  
  public final gxq v()
  {
    return new gxq(pkb.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.search.CollexionSearchActivity
 * JD-Core Version:    0.7.0.1
 */