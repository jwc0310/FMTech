package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import bwb;
import com.google.android.apps.plus.views.ClientOobActionBar;
import efj;
import git;
import gjp;
import gxn;
import gxq;
import gxs;
import gxv;
import gxw;
import gxx;
import gxz;
import gya;
import hyi;
import jyj;
import mbb;
import mbp;
import pju;

public class AddProfilePhotoSpringboardActivity
  extends mbp
  implements View.OnClickListener, gxs, gxv
{
  private git d;
  private ClientOobActionBar e;
  
  public AddProfilePhotoSpringboardActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    new jyj(this, this.n);
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    boolean bool;
    if (!((hyi)mbb.a(paramContext, hyi.class)).b(bwb.l, paramInt)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.plus.NOTIFICATIONS", 0);
      String str1 = String.valueOf("add_profile_photo_prompt_count");
      int i = localSharedPreferences.getInt(11 + String.valueOf(str1).length() + paramInt + str1, 0);
      String str2 = String.valueOf("add_profile_photo_prompt_short_timestamp");
      long l1 = localSharedPreferences.getLong(11 + String.valueOf(str2).length() + paramInt + str2, 0L);
      long l2 = System.currentTimeMillis();
      if (l1 == 0L) {
        bool = true;
      }
      while (bool)
      {
        int j = i + 1;
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        String str3 = String.valueOf("add_profile_photo_prompt_count");
        localEditor.putInt(11 + String.valueOf(str3).length() + paramInt + str3, j);
        String str4 = String.valueOf("add_profile_photo_prompt_short_timestamp");
        localEditor.putLong(11 + String.valueOf(str4).length() + paramInt + str4, l2);
        localEditor.commit();
        return bool;
        if ((l2 - l1 > ((hyi)mbb.a(paramContext, hyi.class)).c(bwb.m, paramInt).longValue()) && (i <= 1)) {
          bool = true;
        } else if ((l2 - l1 > ((hyi)mbb.a(paramContext, hyi.class)).c(bwb.n, paramInt).longValue()) && (i <= 2)) {
          bool = true;
        } else {
          bool = false;
        }
      }
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
    this.m.a(gxs.class, this);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 16908313: 
      onBackPressed();
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int j;
    int k;
    if (paramBundle == null)
    {
      j = getIntent().getIntExtra("springboard_launcher", 0);
      k = this.d.c();
    }
    gxz localgxz;
    TextView localTextView;
    Resources localResources;
    int i;
    switch (j)
    {
    default: 
      localgxz = gxz.I;
      gxx localgxx = (gxx)mbb.a(this, gxx.class);
      gxw localgxw = new gxw(this, k);
      localgxw.c = localgxz;
      localgxw.d = gya.u;
      localgxx.a(localgxw);
      setContentView(efj.sx);
      localTextView = (TextView)findViewById(aaw.en);
      localResources = getResources();
      switch (getIntent().getIntExtra("springboard_launcher", 0))
      {
      default: 
        i = aau.tS;
      }
      break;
    }
    for (;;)
    {
      localTextView.setText(localResources.getString(i));
      return;
      localgxz = gxz.H;
      break;
      localgxz = gxz.G;
      break;
      i = aau.tR;
      continue;
      i = aau.tS;
    }
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.e = ((ClientOobActionBar)findViewById(aaw.gL));
    if (this.e != null)
    {
      ClientOobActionBar localClientOobActionBar1 = this.e;
      int i = aau.tT;
      gxn localgxn = new gxn(this);
      ClientOobActionBar.a(localClientOobActionBar1.a, i, true, localgxn);
      ClientOobActionBar.a(localClientOobActionBar1.b, i, false, localgxn);
      ClientOobActionBar localClientOobActionBar2 = this.e;
      gxq localgxq = new gxq(pju.b);
      efj.a(localClientOobActionBar2.a, localgxq);
      efj.a(localClientOobActionBar2.b, localgxq);
    }
  }
  
  public final gya r_()
  {
    return gya.H;
  }
  
  public final gxq v()
  {
    return new gxq(pju.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AddProfilePhotoSpringboardActivity
 * JD-Core Version:    0.7.0.1
 */