package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import cv;
import cw;
import dfc;
import efj;
import fu;
import git;
import gjp;
import gxv;
import gya;
import gzi;
import gzj;
import haa;
import hae;
import hgh;
import hqj;
import hue;
import hvj;
import icf;
import java.util.ArrayList;
import mbb;
import mcc;

public class ProfileActionGatewayActivity
  extends mcc
  implements cw<Cursor>, gxv, gzi, hgh
{
  private static final String[] i = { "sourceid", "data5", "display_name" };
  public final gzj d;
  public gjp e;
  public String f;
  public String g;
  public hvj h;
  private final hue l;
  private boolean m;
  
  public ProfileActionGatewayActivity()
  {
    gzj localgzj = new gzj(this, this.k);
    localgzj.a.add(this);
    this.d = localgzj;
    this.l = new hue(this.k);
    new icf(this, this.k);
    gjp localgjp = new gjp(this, this.k);
    this.j.a(git.class, localgjp);
    this.e = localgjp;
  }
  
  public final Integer B()
  {
    return null;
  }
  
  public final Integer C()
  {
    return null;
  }
  
  public final int R_()
  {
    return 66;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new hqj(this, (Uri)paramBundle.getParcelable("data_uri"), i, null, null, null);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.j;
    localmbb.a(gxv.class, this);
    localmbb.a(gzj.class, this.d);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ModifyCircleMembershipsTask".equals(paramString)) {
      if (this.h != null)
      {
        if (hae.a(paramhae)) {
          break label58;
        }
        hvj localhvj = this.h;
        gjp localgjp = this.e;
        efj.k();
        localhvj.a(localgjp.a);
      }
    }
    for (;;)
    {
      this.h = null;
      finish();
      return;
      label58:
      Toast.makeText(this, paramhae.d, 0).show();
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int j = 0;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      if (j == 0) {
        finish();
      }
      return;
      j = 0;
      if (paramInt2 == -1)
      {
        ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("original_circle_ids");
        ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("selected_circle_ids");
        this.l.a(new dfc(this, localArrayList1, localArrayList2));
        j = 1;
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (isFinishing()) {
      return;
    }
    Uri localUri = getIntent().getData();
    if (localUri == null)
    {
      finish();
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("data_uri", localUri);
    c().a(0, localBundle, this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("person_id", this.f);
    paramBundle.putString("person_name", this.g);
    paramBundle.putBoolean("redirected", this.m);
    if (this.h != null) {
      this.h.a(paramBundle);
    }
  }
  
  public final gya r_()
  {
    return gya.L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.ProfileActionGatewayActivity
 * JD-Core Version:    0.7.0.1
 */