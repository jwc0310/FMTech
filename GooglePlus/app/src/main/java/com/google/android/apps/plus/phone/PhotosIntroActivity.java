package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import cpf;
import efj;
import git;
import gjp;
import gxv;
import gya;
import ikx;
import ilf;
import ilm;
import ine;
import java.util.List;
import jyj;
import mbb;
import mbp;

public class PhotosIntroActivity
  extends mbp
  implements View.OnClickListener, gxv
{
  public PhotosIntroActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onClick(View paramView)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this).edit();
    localEditor.putBoolean("photos_intro_shown", true);
    localEditor.commit();
    cpf.a(this);
    if (paramView.getId() == aaw.ie)
    {
      ikx localikx = new ikx(this);
      ilf localilf = new ilf();
      localilf.s = ilm.class;
      localilf.t = null;
      localilf.u.add(ine.class);
      localikx.a = localilf;
      Intent localIntent1 = new Intent(this, PhotosHomeActivity.class);
      localIntent1.setAction("android.intent.action.VIEW");
      localIntent1.putExtra("tabs", 6);
      localIntent1.addFlags(335544320);
      localikx.b = localIntent1;
      startActivity(localikx.a());
    }
    for (;;)
    {
      finish();
      return;
      if (paramView.getId() == aaw.if)
      {
        Intent localIntent2 = new Intent(this, PhotosHomeActivity.class);
        localIntent2.setAction("android.intent.action.VIEW");
        localIntent2.putExtra("tabs", 6);
        localIntent2.addFlags(335544320);
        startActivity(localIntent2);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.vZ);
    ((Button)findViewById(aaw.ie)).setOnClickListener(this);
    ((Button)findViewById(aaw.if)).setOnClickListener(this);
  }
  
  public final gya r_()
  {
    return gya.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PhotosIntroActivity
 * JD-Core Version:    0.7.0.1
 */