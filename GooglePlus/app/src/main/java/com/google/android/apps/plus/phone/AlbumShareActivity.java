package com.google.android.apps.plus.phone;

import android.os.Bundle;
import bhp;
import cat;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import mbb;
import mbp;

public class AlbumShareActivity
  extends mbp
  implements gxv
{
  private final bhp d;
  
  public AlbumShareActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, 16908290);
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
      cat localcat = new cat();
      this.d.a(localcat);
    }
  }
  
  public final gya r_()
  {
    return gya.Y;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AlbumShareActivity
 * JD-Core Version:    0.7.0.1
 */