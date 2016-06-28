package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bk;
import bzi;
import com.google.android.apps.plus.fragments.EditEventFragment;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import czl;
import czm;
import efj;
import git;
import gjp;
import gxv;
import gya;
import hxj;
import jyj;
import mbb;
import mbp;

public class EditEventActivity
  extends mbp
  implements bzi, gxv
{
  public EditEventFragment d;
  private String e;
  private String f;
  private String g;
  
  public EditEventActivity()
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
    if ((parambk instanceof EditEventFragment))
    {
      this.d = ((EditEventFragment)parambk);
      EditEventFragment localEditEventFragment = this.d;
      String str1 = this.e;
      String str2 = this.f;
      String str3 = this.g;
      localEditEventFragment.c = str1;
      localEditEventFragment.d = str2;
      localEditEventFragment.Z = str3;
      localEditEventFragment.ad = -1;
      localEditEventFragment.aa = false;
      this.d.ae = this;
    }
  }
  
  public final void a(hxj paramhxj)
  {
    finish();
  }
  
  public final void ak_()
  {
    finish();
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    if (this.d != null) {
      this.d.C();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.e = getIntent().getStringExtra("event_id");
    this.f = getIntent().getStringExtra("owner_id");
    this.g = getIntent().getStringExtra("auth_key");
    setContentView(efj.uN);
    View localView = findViewById(aaw.aU);
    if (localView != null) {
      localView.setOnClickListener(new czl(this));
    }
    ImageTextButton localImageTextButton = (ImageTextButton)findViewById(aaw.jM);
    if (localImageTextButton != null)
    {
      String str = getResources().getString(aau.sC);
      localImageTextButton.a.setText(str);
      localImageTextButton.setOnClickListener(new czm(this));
    }
  }
  
  public final gya r_()
  {
    return gya.A;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.EditEventActivity
 * JD-Core Version:    0.7.0.1
 */