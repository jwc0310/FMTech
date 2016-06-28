package com.google.android.apps.photos.backuppromo;

import aaw;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import aqp;
import duj;
import dun;
import efj;
import git;
import gjp;
import gxj;
import gxl;
import gxn;
import gxq;
import gxs;
import jyj;
import mbb;
import mbp;
import pjm;
import pjx;

public final class BackupPromoActivity
  extends mbp
  implements View.OnClickListener
{
  private git d;
  
  public BackupPromoActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    gxl localgxl = new gxl(pjm.n);
    this.m.a(gxs.class, localgxl);
    new gxj(this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    this.d = ((git)this.m.a(git.class));
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == aaw.hA) {
      if (duj.b(this))
      {
        startActivity(duj.f(this));
        finish();
      }
    }
    while (paramView.getId() != aaw.hB)
    {
      return;
      startActivity(duj.a(this, "utm_source=googleplus_photos&utm_medium=android&utm_campaign=photos_backup_promo"));
      finish();
      return;
    }
    startActivity(efj.b(this, this.d.c()));
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.vU);
    View localView1 = findViewById(aaw.hA);
    efj.a(localView1, new gxq(pjx.d));
    localView1.setOnClickListener(new gxn(this));
    View localView2 = findViewById(aaw.hB);
    efj.a(localView2, new gxq(pjx.c));
    localView2.setOnClickListener(new gxn(this));
    ((TextView)findViewById(aaw.hD)).setMovementMethod(LinkMovementMethod.getInstance());
    View localView3 = findViewById(aaw.hC);
    if (localView3 != null)
    {
      ScrollView localScrollView = (ScrollView)localView3;
      localScrollView.post(new aqp(this, localScrollView));
    }
  }
  
  protected final void onResume()
  {
    super.onResume();
    if ("TRUE".equalsIgnoreCase(dun.d.a())) {
      finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.backuppromo.BackupPromoActivity
 * JD-Core Version:    0.7.0.1
 */