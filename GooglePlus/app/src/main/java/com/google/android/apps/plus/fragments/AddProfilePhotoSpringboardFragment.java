package com.google.android.apps.plus.fragments;

import aau;
import aaw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import bp;
import bru;
import bwc;
import bwd;
import bwe;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import cv;
import cw;
import dme;
import dmx;
import efj;
import git;
import gxj;
import gxn;
import gxq;
import gxw;
import gxx;
import gxz;
import gya;
import java.util.HashSet;
import java.util.Map;
import jrf;
import luu;
import mbb;
import mca;
import pju;
import pka;

public class AddProfilePhotoSpringboardFragment
  extends mca
  implements View.OnClickListener, luu
{
  private final dme Z = new bwc(this);
  public git a;
  private final cw<bru> aa = new bwd(this);
  private Context ab;
  private TextView ac;
  private Button ad;
  private Button ae;
  private Integer af;
  public Boolean b;
  public AvatarView c;
  public Integer d;
  
  public AddProfilePhotoSpringboardFragment()
  {
    new gxj(this.bp, (byte)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.vo, paramViewGroup, false);
    this.c = ((AvatarView)localView.findViewById(aaw.aw));
    this.c.setOnClickListener(new gxn(this));
    efj.a(this.c, new gxq(pka.x));
    this.ad = ((Button)localView.findViewById(aaw.bd));
    this.ad.setOnClickListener(new gxn(this));
    efj.a(this.ad, new gxq(pju.f));
    this.ae = ((Button)localView.findViewById(aaw.L));
    this.ae.setOnClickListener(new gxn(this));
    efj.a(this.ae, new gxq(pju.a));
    this.ac = ((TextView)localView.findViewById(aaw.en));
    return localView;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    byte[] arrayOfByte;
    do
    {
      do
      {
        return;
      } while (paramIntent == null);
      arrayOfByte = paramIntent.getByteArrayExtra("data");
    } while (arrayOfByte == null);
    Boolean localBoolean = this.b;
    boolean bool;
    if (localBoolean == null)
    {
      bool = false;
      if (!bool) {
        break label100;
      }
    }
    label100:
    for (gxz localgxz = gxz.aq;; localgxz = gxz.ap)
    {
      bwe localbwe = new bwe(this, arrayOfByte, localgxz);
      efj.m().post(localbwe);
      return;
      bool = localBoolean.booleanValue();
      break;
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, dmx paramdmx)
  {
    if ((this.d == null) || (this.d.intValue() != paramInt)) {}
    int i;
    gxz localgxz1;
    Boolean localBoolean;
    boolean bool;
    label85:
    do
    {
      return;
      if (paramdmx != null)
      {
        if (paramdmx.c == 200) {
          break;
        }
        i = 1;
        if ((i == 0) && (paramdmx.d == null)) {}
      }
      else
      {
        Toast.makeText(this.ab, aau.uV, 0).show();
      }
      this.d = null;
      localgxz1 = gxz.P;
      localBoolean = this.b;
      if (localBoolean != null) {
        break label185;
      }
      bool = false;
    } while (!bool);
    gxz localgxz2;
    switch (f().getIntent().getIntExtra("springboard_launcher", 0))
    {
    default: 
      localgxz2 = localgxz1;
    }
    for (;;)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = localgxz2;
      localgxw.d = gya.u;
      localgxx.a(localgxw);
      return;
      i = 0;
      break;
      label185:
      bool = localBoolean.booleanValue();
      break label85;
      localgxz2 = gxz.O;
      continue;
      localgxz2 = gxz.N;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ab = paramActivity;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("profile_request_id")) {
        this.d = Integer.valueOf(paramBundle.getInt("profile_request_id"));
      }
      if (paramBundle.containsKey("photo_changed")) {
        this.b = Boolean.valueOf(paramBundle.getBoolean("photo_changed"));
      }
      if (paramBundle.containsKey("camera_request_id")) {
        this.af = Integer.valueOf(paramBundle.getInt("camera_request_id"));
      }
    }
    k().a(100, null, this.aa);
  }
  
  public final void a(Bundle paramBundle, String paramString) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.d != null) {
      paramBundle.putInt("profile_request_id", this.d.intValue());
    }
    if (this.b != null) {
      paramBundle.putBoolean("photo_changed", this.b.booleanValue());
    }
    if (this.af != null) {
      paramBundle.putInt("camera_request_id", this.af.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.Z);
    v();
    if (this.d != null)
    {
      int i = this.d.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.d.intValue());
        a(this.d.intValue(), localdmx);
        this.d = null;
      }
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.Z;
    EsService.d.remove(localdme);
  }
  
  public void onClick(View paramView)
  {
    int i = this.a.c();
    if ((paramView == this.c) || (paramView == this.ad) || (paramView == this.ae)) {
      a(efj.a(f(), i, jrf.a(1, new String[0]), 1, false, 1, null, true, 480, 270), 0);
    }
  }
  
  public final void v()
  {
    Boolean localBoolean = this.b;
    boolean bool;
    int i;
    label57:
    int j;
    label76:
    Button localButton2;
    int k;
    if (localBoolean == null)
    {
      bool = false;
      TextView localTextView = this.ac;
      switch (f().getIntent().getIntExtra("springboard_launcher", 0))
      {
      default: 
        i = aau.tQ;
        localTextView.setText(i);
        Button localButton1 = this.ad;
        if (bool)
        {
          j = 0;
          localButton1.setVisibility(j);
          localButton2 = this.ae;
          k = 0;
          if (bool) {
            break label135;
          }
        }
        break;
      }
    }
    for (;;)
    {
      localButton2.setVisibility(k);
      return;
      bool = localBoolean.booleanValue();
      break;
      i = aau.tO;
      break label57;
      i = aau.tP;
      break label57;
      j = 8;
      break label76;
      label135:
      k = 8;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.AddProfilePhotoSpringboardFragment
 * JD-Core Version:    0.7.0.1
 */