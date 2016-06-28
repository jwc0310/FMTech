package com.google.android.apps.plus.locations;

import aau;
import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import bk;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import mbb;
import mbp;

public class FriendLocationsCircleFilterActivity
  extends mbp
  implements View.OnClickListener, gxv
{
  private FriendLocationsCircleFilterFragment d;
  
  public FriendLocationsCircleFilterActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof FriendLocationsCircleFilterFragment)) {
      this.d = ((FriendLocationsCircleFilterFragment)parambk);
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == aaw.gC)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("circle_ids", this.d.a);
      setResult(-1, localIntent);
      finish();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tM);
    setTitle(aau.ju);
    findViewById(aaw.gC).setOnClickListener(this);
    findViewById(aaw.aT).setVisibility(8);
  }
  
  public final gya r_()
  {
    return gya.O;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.locations.FriendLocationsCircleFilterActivity
 * JD-Core Version:    0.7.0.1
 */