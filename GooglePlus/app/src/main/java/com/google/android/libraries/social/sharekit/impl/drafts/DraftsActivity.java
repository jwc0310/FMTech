package com.google.android.libraries.social.sharekit.impl.drafts;

import aau;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import bk;
import bp;
import bu;
import bv;
import cv;
import efj;
import fu;
import gzi;
import gzj;
import haa;
import hae;
import java.util.ArrayList;
import kmr;
import kms;
import kmz;
import kni;
import lut;
import luu;
import mbb;
import mbp;

public final class DraftsActivity
  extends mbp
  implements gzi, kni, luu
{
  public int d;
  public int e;
  private final gzj f;
  private final kmz g;
  private DraftsFragment h;
  
  public DraftsActivity()
  {
    gzj localgzj = new gzj(this, this.n);
    localgzj.a.add(this);
    this.f = localgzj;
    this.g = new kmz(this);
  }
  
  private final void f()
  {
    g();
    if (this.h != null)
    {
      DraftsFragment localDraftsFragment = this.h;
      localDraftsFragment.k().b(1000, null, localDraftsFragment.b);
      return;
    }
    Log.e("DraftsActivity", "Failed to reset ListView. DraftsFragment is not attached to the activity.");
  }
  
  private final void g()
  {
    c().a(2001, null, this.g).a();
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(long paramLong)
  {
    this.f.b(new kms("DeleteDraftsTask", paramLong, this.d));
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gzj.class, this.f);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("delete_draft_confirmation".equals(paramString))
    {
      kmr localkmr = new kmr("DeleteAllDraftsTask", this.d);
      this.f.b(localkmr);
    }
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if (parambk.B == aau.BS) {
      this.h = ((DraftsFragment)parambk);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (paramString.equals("DeleteAllDraftsTask"))
    {
      i = paramhae.a().getInt("count_of_drafts_deleted");
      if (i != this.e)
      {
        k = this.e;
        new StringBuilder(113).append("Number of drafts deleted (").append(i).append(") does not match the total number of drafts prior to deletion (").append(k).append(").");
      }
      localResources = getResources();
      j = efj.Vc;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      Toast.makeText(this, localResources.getQuantityString(j, i, arrayOfObject), 0).show();
      f();
    }
    while (!paramString.equals("DeleteDraftsTask"))
    {
      int i;
      int k;
      Resources localResources;
      int j;
      Object[] arrayOfObject;
      return;
    }
    Toast.makeText(this, getString(efj.Vn), 0).show();
    f();
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitle(getString(efj.Ve));
    setContentView(efj.Va);
    this.d = getIntent().getIntExtra("account_id", -1);
    g();
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.e > 0) {
      paramMenu.add(0, 1001, 0, getString(efj.Vi));
    }
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 1001)
    {
      lut.b(getString(efj.Vh), null, getString(efj.Vg), getString(efj.Vf)).a(this.b.a.d, "delete_draft_confirmation");
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.drafts.DraftsActivity
 * JD-Core Version:    0.7.0.1
 */