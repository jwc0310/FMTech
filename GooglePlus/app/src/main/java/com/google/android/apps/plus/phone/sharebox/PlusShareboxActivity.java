package com.google.android.apps.plus.phone.sharebox;

import android.os.Bundle;
import cma;
import com.google.android.libraries.social.sharekit.impl.MediaPreviewFragment;
import efj;
import git;
import gjp;
import gxj;
import gxs;
import gxv;
import gya;
import iee;
import irp;
import kic;
import kij;
import kim;
import kji;
import kjr;
import kkb;
import klg;
import kym;
import mbb;
import mbp;

public final class PlusShareboxActivity
  extends mbp
  implements gxv
{
  private final git d;
  private final klg e;
  
  public PlusShareboxActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    klg localklg = new klg(this, this.n);
    mbb localmbb = this.m;
    localmbb.a(irp.class, localklg.E);
    localmbb.a(kkb.class, localklg.F);
    localmbb.a(kji.class, localklg.G);
    localmbb.a(kjr.class, localklg.H);
    localmbb.a(kic.class, localklg);
    localmbb.a(kij.class, localklg.e);
    localmbb.a(kim.class, localklg.P);
    localmbb.a(gxs.class, localklg);
    localmbb.a(kym.class, localklg);
    this.e = localklg;
    new gxj(this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(iee.class, new iee(this));
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cma localcma = new cma(this, null, ((irp)this.m.a(irp.class)).h, this.d.c(), null);
    localcma.f = MediaPreviewFragment.a(getWindowManager(), getResources(), true);
    this.e.ae = localcma;
    setContentView(efj.wp);
  }
  
  public final gya r_()
  {
    return gya.U;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.sharebox.PlusShareboxActivity
 * JD-Core Version:    0.7.0.1
 */