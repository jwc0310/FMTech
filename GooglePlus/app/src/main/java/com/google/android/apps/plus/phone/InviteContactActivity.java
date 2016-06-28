package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import cv;
import cw;
import dby;
import efj;
import fu;
import git;
import gjp;
import gxv;
import gxx;
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
import jjd;
import mbb;
import mcc;

public class InviteContactActivity
  extends mcc
  implements cw<Cursor>, gxv, gzi, hgh
{
  private static final String[] i = { "display_name", "mimetype", "data1" };
  public gjp d;
  public String e;
  public String f;
  public hvj g;
  public final gzj h;
  private boolean l;
  private final hue m;
  
  public InviteContactActivity()
  {
    gjp localgjp = new gjp(this, this.k);
    this.j.a(git.class, localgjp);
    this.d = localgjp;
    gzj localgzj = new gzj(this, this.k);
    localgzj.a.add(this);
    this.h = localgzj;
    this.m = new hue(this.k);
    new icf(this, this.k);
  }
  
  private void e()
  {
    gjp localgjp = this.d;
    efj.k();
    startActivityForResult(efj.a(this, localgjp.a, this.e, this.f, null, null, null, false), 0);
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
    return new hqj(this, Uri.withAppendedPath((Uri)paramBundle.getParcelable("data_uri"), "entities"), i, "mimetype IN ('vnd.android.cursor.item/name','vnd.android.cursor.item/email_v2')", null, null);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.j;
    localmbb.a(gxv.class, this);
    localmbb.a(gzj.class, this.h);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "e:".concat(str1);; str2 = new String("e:"))
    {
      this.e = str2;
      e();
      return;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ModifyCircleMembershipsTask".equals(paramString)) {
      if (this.g != null)
      {
        if (hae.a(paramhae)) {
          break label58;
        }
        hvj localhvj = this.g;
        gjp localgjp = this.d;
        efj.k();
        localhvj.a(localgjp.a);
      }
    }
    for (;;)
    {
      this.g = null;
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
        this.e = paramIntent.getStringExtra("person_id");
        String str = this.e;
        j = 0;
        if (str != null)
        {
          this.f = ((jjd)paramIntent.getParcelableExtra("person_data")).b;
          e();
          j = 1;
          continue;
          j = 0;
          if (paramInt2 == -1)
          {
            ArrayList localArrayList = paramIntent.getStringArrayListExtra("selected_circle_ids");
            this.m.a(new dby(this, localArrayList));
            j = 1;
          }
        }
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.e = paramBundle.getString("person_id");
      this.f = paramBundle.getString("person_name");
      this.l = paramBundle.getBoolean("redirected");
      this.g = hvj.a(this, (gxx)this.j.a(gxx.class), paramBundle);
    }
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
    paramBundle.putString("person_id", this.e);
    paramBundle.putString("person_name", this.f);
    paramBundle.putBoolean("redirected", this.l);
    if (this.g != null) {
      this.g.a(paramBundle);
    }
  }
  
  public final gya r_()
  {
    return gya.L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.InviteContactActivity
 * JD-Core Version:    0.7.0.1
 */