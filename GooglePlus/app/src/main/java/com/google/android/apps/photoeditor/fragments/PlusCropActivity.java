package com.google.android.apps.photoeditor.fragments;

import ajp;
import ajs;
import alv;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import bp;
import bu;
import bv;
import bvx;
import bvy;
import bvz;
import bw;
import bwa;
import cl;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.ui.views.CropImageView;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import efj;
import gek;
import gel;
import git;
import gjp;
import gxj;
import gxq;
import gxs;
import mbb;
import mcc;
import oih;
import pjw;
import qat;

public class PlusCropActivity
  extends mcc
  implements ajs, bvy, gxs
{
  private Bitmap d;
  private boolean e;
  private bvz f;
  
  public PlusCropActivity()
  {
    gjp localgjp = new gjp(this, this.k);
    this.j.a(git.class, localgjp);
    localgjp.b = false;
    new gxj(this.k);
  }
  
  private final void e()
  {
    if (this.e)
    {
      Display localDisplay = getWindowManager().getDefaultDisplay();
      Point localPoint = new Point();
      localDisplay.getSize(localPoint);
      Bitmap localBitmap = BitmapHelper.a(this.d, localPoint.x, localPoint.y);
      ((ajp)this.b.a.d.a("CropExternalFragment")).a(localBitmap);
      return;
    }
    this.e = true;
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    ((ajp)this.b.a.d.a("CropExternalFragment")).a.setVisibility(4);
    if (paramIntent != null) {
      setResult(paramInt, paramIntent);
    }
    for (;;)
    {
      finish();
      return;
      setResult(paramInt);
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a(gxs.class, this);
    this.j.a("com.google.android.libraries.social.appid", Integer.valueOf(13));
    this.j.a(gel.class, new gek());
  }
  
  public final void a(bvx parambvx)
  {
    if (parambvx == null)
    {
      alv localalv = new alv(this);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setTitle(efj.hs);
      localBuilder.setMessage(efj.hr);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(efj.gT, localalv);
      localBuilder.create().show();
      return;
    }
    this.d = parambvx.a;
    e();
  }
  
  public final boolean a(byte[] paramArrayOfByte)
  {
    return true;
  }
  
  public final bvx f()
  {
    RectF localRectF = ((ajp)this.b.a.d.a("CropExternalFragment")).b.a();
    Bitmap localBitmap = Bitmap.createBitmap(this.d, (int)Math.floor(localRectF.left * this.d.getWidth()), (int)Math.floor(localRectF.top * this.d.getHeight()), (int)Math.floor(localRectF.width() * this.d.getWidth()), (int)Math.floor(localRectF.height() * this.d.getHeight()));
    FilterChain localFilterChain = new FilterChain();
    oih localoih = new oih();
    efj.a(localFilterChain, localoih);
    return new bvx(localBitmap, qat.a(localoih));
  }
  
  public final void k_()
  {
    if (this.f == null) {}
    while (this.d == null) {
      return;
    }
    ((ajp)this.b.a.d.a("CropExternalFragment")).a.setVisibility(0);
    this.f.a(f());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    efj.Cv = NativeCore.a;
    FilterFactory.a((gel)this.j.a(gel.class));
    setContentView(efj.gm);
    ActionBar localActionBar = getActionBar();
    if (localActionBar == null) {
      throw new IllegalStateException("Failed to get action bar reference");
    }
    localActionBar.setBackgroundDrawable(null);
    localActionBar.setDisplayShowHomeEnabled(false);
    localActionBar.setDisplayShowTitleEnabled(false);
    localActionBar.setDisplayShowCustomEnabled(true);
    localActionBar.setCustomView(efj.gg);
    ajp localajp = (ajp)this.b.a.d.a("CropExternalFragment");
    if (localajp == null)
    {
      localajp = new ajp();
      cl localcl = this.b.a.d.a();
      localcl.a(efj.fB, localajp, "CropExternalFragment");
      localcl.b();
    }
    localajp.c = this;
    bwa localbwa = (bwa)this.j.b(bwa.class);
    if (localbwa != null)
    {
      this.f = localbwa.a(getTaskId());
      this.f.a(paramBundle, this, getIntent(), this);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.f != null)
    {
      this.f.e();
      ((bwa)this.j.b(bwa.class)).c(getTaskId());
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.f != null) {
      this.f.a();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.f != null) {
      this.f.d();
    }
    e();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.f != null) {
      this.f.a(paramBundle);
    }
  }
  
  public final gxq v()
  {
    return new gxq(pjw.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photoeditor.fragments.PlusCropActivity
 * JD-Core Version:    0.7.0.1
 */