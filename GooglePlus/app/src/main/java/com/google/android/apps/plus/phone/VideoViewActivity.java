package com.google.android.apps.plus.phone;

import aaw;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import bhp;
import cqc;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import lwo;
import mbb;
import mbp;

public class VideoViewActivity
  extends mbp
  implements gxv
{
  private final bhp d;
  
  public VideoViewActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    this.d = new bhp(this, aaw.dM);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      cqc localcqc = new cqc();
      this.d.a(localcqc);
    }
    if (Build.VERSION.SDK_INT <= 14) {
      getWindow().setFlags(1024, 1024);
    }
    for (;;)
    {
      setContentView(efj.wH);
      return;
      lwo.a(this, false);
    }
  }
  
  public final gya r_()
  {
    return gya.ag;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.VideoViewActivity
 * JD-Core Version:    0.7.0.1
 */