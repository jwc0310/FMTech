package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bhp;
import bk;
import bxp;
import cak;
import cqg;
import gxv;
import gya;
import jiw;
import jkz;
import mbb;
import mbp;

public final class CircleSettingsActivity
  extends mbp
  implements gxv
{
  private final bhp d = new bhp(this, 16908290);
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a(jiw.class, new jkz(this, this.n));
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    boolean bool;
    Object localObject;
    if (paramBundle == null)
    {
      Bundle localBundle = getIntent().getExtras();
      String str = localBundle.getString("circle_id");
      bool = localBundle.getBoolean("is_following_circle");
      if (!TextUtils.equals(str, "v.whatshot")) {
        break label60;
      }
      localObject = new cqg();
    }
    for (;;)
    {
      this.d.a((bk)localObject);
      return;
      label60:
      if (bool) {
        localObject = new cak();
      } else {
        localObject = new bxp();
      }
    }
  }
  
  public final gya r_()
  {
    return gya.o;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.CircleSettingsActivity
 * JD-Core Version:    0.7.0.1
 */