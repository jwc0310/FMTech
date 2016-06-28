package com.google.android.apps.plus.phone;

import aau;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import bj;
import bp;
import bu;
import bv;
import bw;
import bz;
import com.google.android.apps.plus.content.EsProvider;
import ddu;
import ddv;
import frz;
import fyd;
import fye;
import git;
import gjp;
import gxv;
import gya;
import ipb;
import ipf;
import java.util.Map;
import jrn;
import jyj;
import kaz;
import kbb;
import mbb;
import mbp;
import mfq;

public class PanoramaViewerActivity
  extends mbp
  implements fye, gxv, kbb
{
  public kaz d;
  private ipf e;
  private Handler f;
  
  public PanoramaViewerActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
  }
  
  private final void h()
  {
    bj localbj = (bj)this.b.a.d.a("progress");
    if (localbj != null) {
      localbj.a(true);
    }
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if (paramIntent != null) {
      startActivity(paramIntent);
    }
    for (;;)
    {
      finish();
      return;
      Toast.makeText(this, aau.uS, 0).show();
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz != null) {}
    Object localObject1;
    switch (paramkaz.q)
    {
    case 2: 
    default: 
      return;
    case 1: 
      h();
      Uri localUri1 = this.e.d;
      int i = 0;
      if (localUri1 != null) {
        i = 1;
      }
      localObject1 = null;
      if (i != 0)
      {
        Uri localUri2 = this.e.d;
        if (!mfq.b(localUri2))
        {
          boolean bool = mfq.a(localUri2);
          localObject1 = null;
          if (!bool) {}
        }
        else
        {
          localObject1 = localUri2;
        }
      }
      if (localObject1 != null) {
        break;
      }
    }
    for (Object localObject2 = EsProvider.a(this, paramkaz.g());; localObject2 = localObject1)
    {
      ((fyd)mbb.a(this, fyd.class)).a((Uri)localObject2, this);
      return;
      h();
      Toast.makeText(this, aau.uS, 0).show();
      finish();
      return;
    }
  }
  
  public final void ap_()
  {
    if (this.d != null) {
      this.d.b(this);
    }
  }
  
  public final void b()
  {
    this.d = ((ipb)this.m.a(ipb.class)).a(this.e, 1, null, 139298, this);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void g()
  {
    Toast.makeText(this, aau.uS, 0).show();
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = ((frz)mbb.a(this, frz.class)).a(this);
    if (i != 0)
    {
      jrn.a(this).b.clear();
      bz localbz = this.b.a.d;
      if (localbz.a("GMS_error") == null) {
        new ddv(i).a(localbz, "GMS_error");
      }
      return;
    }
    this.e = ((ipf)getIntent().getParcelableExtra("photo_ref"));
    b();
    this.f = new Handler();
    this.f.postDelayed(new ddu(this), 200L);
  }
  
  protected void onDestroy()
  {
    if (this.d != null) {
      this.d.b(this);
    }
    super.onDestroy();
  }
  
  public final gya r_()
  {
    return gya.ad;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PanoramaViewerActivity
 * JD-Core Version:    0.7.0.1
 */