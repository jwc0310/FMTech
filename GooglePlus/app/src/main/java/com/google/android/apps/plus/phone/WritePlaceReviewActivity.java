package com.google.android.apps.plus.phone;

import android.os.Bundle;
import bhp;
import bk;
import cqh;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import mbb;
import mbp;

public class WritePlaceReviewActivity
  extends mbp
  implements gxv
{
  private final bhp d;
  private cqh e;
  
  public WritePlaceReviewActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, 16908290);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof cqh)) {
      this.e = ((cqh)parambk);
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    if (this.e != null) {
      this.e.v();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      cqh localcqh = new cqh();
      this.d.a(localcqh);
    }
  }
  
  public final gya r_()
  {
    return gya.m;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.WritePlaceReviewActivity
 * JD-Core Version:    0.7.0.1
 */