package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
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
import pjx;

public final class PhotosAppPromoActivity
  extends mbp
  implements View.OnClickListener
{
  public PhotosAppPromoActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    gxl localgxl = new gxl(pjx.e);
    this.m.a(gxs.class, localgxl);
    new gxj(this.n);
  }
  
  public static Intent a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, PhotosAppPromoActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    return localIntent;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void onClick(View paramView)
  {
    startActivity(duj.a(this, "utm_source=googleplus_photos&utm_medium=android&utm_campaign=photos_new_app_promo"));
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.vT);
    ((TextView)findViewById(aaw.hz)).setText(Html.fromHtml(getString(aau.oM)));
    View localView = findViewById(aaw.hy);
    efj.a(localView, new gxq(pjx.d));
    localView.setOnClickListener(new gxn(this));
  }
  
  protected final void onResume()
  {
    super.onResume();
    if ("TRUE".equalsIgnoreCase(dun.d.a())) {
      finish();
    }
    Intent localIntent;
    do
    {
      do
      {
        return;
      } while (!duj.b(this));
      localIntent = duj.f(this);
    } while (localIntent == null);
    startActivity(localIntent);
    finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PhotosAppPromoActivity
 * JD-Core Version:    0.7.0.1
 */