package com.google.android.apps.photoeditor.fragments;

import aiq;
import ais;
import ait;
import ake;
import akj;
import akl;
import aks;
import alo;
import alp;
import alq;
import alr;
import als;
import alt;
import alu;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import bp;
import bu;
import bv;
import bvx;
import bvy;
import bvz;
import bw;
import bwa;
import bz;
import cl;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.FilterChainNode;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import efj;
import gek;
import gel;
import gem;
import gfj;
import ghk;
import ghn;
import gid;
import git;
import gjp;
import gwz;
import gxq;
import gxr;
import gxs;
import hvu;
import java.util.List;
import java.util.Locale;
import mbb;
import mbf;
import mcc;
import oih;
import pjw;
import qat;
import qmg;
import qmh;
import qnb;

public class PhotoEditorActivity
  extends mcc
  implements akj, aks, alu, bvy, gxs
{
  public alt d;
  private final git e;
  private Handler f;
  private ghn g;
  private bvx h;
  private bvz i;
  private boolean l;
  private boolean m;
  
  public PhotoEditorActivity()
  {
    gjp localgjp = new gjp(this, this.k);
    localgjp.b = false;
    this.e = localgjp;
  }
  
  private final void a(int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setMessage(paramInt1);
    localBuilder.setCancelable(false);
    localBuilder.setPositiveButton(paramInt2, paramOnClickListener);
    localBuilder.create().show();
  }
  
  private final void b(bvx parambvx)
  {
    oih localoih;
    FilterChain localFilterChain;
    byte[] arrayOfByte;
    if (parambvx.b != null)
    {
      localoih = efj.a(parambvx.b);
      if (localoih != null)
      {
        localFilterChain = efj.a(localoih, parambvx.a);
        if (localFilterChain == null) {
          localFilterChain = new FilterChain();
        }
        boolean bool = gfj.a(localoih);
        int j = 0;
        if (!bool)
        {
          qmh localqmh = localoih.a.e;
          j = 0;
          if (localqmh != null)
          {
            qnb localqnb = localoih.a.e.a;
            j = 0;
            if (localqnb != null)
            {
              j = localoih.a.e.a.a;
              if ((j <= 0) || (j > 2)) {
                j = 1;
              }
            }
          }
        }
        qmg localqmg = localoih.a;
        arrayOfByte = null;
        if (localqmg == null) {
          switch (j)
          {
          default: 
            label168:
            localFilterChain.g.setParameterInteger(12, j);
          }
        }
      }
    }
    for (;;)
    {
      alt localalt = this.d;
      Bitmap localBitmap = parambvx.a;
      ais localais = new ais(this);
      localalt.a.a(localBitmap, localFilterChain, localais);
      return;
      arrayOfByte = qat.a(localoih.a);
      break;
      localFilterChain.g.setParameterBuffer(201, arrayOfByte);
      break label168;
      localFilterChain.g.setParameterBuffer(202, arrayOfByte);
      break label168;
      localFilterChain = null;
    }
  }
  
  public final void a(int paramInt)
  {
    if (!this.l) {}
    bz localbz;
    do
    {
      return;
      localbz = this.b.a.d;
    } while (localbz.e() > 0);
    if (paramInt == 18)
    {
      aiq localaiq = this.d.a;
      boolean bool;
      if (localaiq.h == null) {
        bool = false;
      }
      while (bool)
      {
        alo localalo = new alo(this, localbz);
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
        localBuilder.setTitle(efj.il);
        localBuilder.setMessage(efj.ij);
        localBuilder.setCancelable(false);
        localBuilder.setPositiveButton(efj.ik, localalo);
        localBuilder.setNegativeButton(17039360, localalo);
        localBuilder.create().show();
        return;
        if (localaiq.h.size() != 0)
        {
          FilterChain localFilterChain = localaiq.h;
          if (localFilterChain.h.size() > 0) {}
          for (FilterParameter localFilterParameter = ((FilterChainNode)localFilterChain.h.get(-1 + localFilterChain.h.size())).getFilterParameter();; localFilterParameter = null)
          {
            if (localFilterParameter.getFilterType() == 18) {
              break label214;
            }
            bool = true;
            break;
          }
        }
        label214:
        bool = localaiq.h.c();
      }
    }
    b(paramInt);
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    a(false, false);
    if (paramIntent != null) {
      setResult(paramInt, paramIntent);
    }
    for (;;)
    {
      g();
      return;
      setResult(paramInt);
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a(git.class, this.e);
    this.j.a(gxs.class, this);
    this.j.a(gel.class, new gek());
  }
  
  public final void a(bvx parambvx)
  {
    if (parambvx == null)
    {
      als localals = new als(this);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setTitle(efj.hs);
      localBuilder.setMessage(efj.hr);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(efj.it, localals);
      localBuilder.create().show();
      return;
    }
    Bitmap localBitmap = parambvx.a;
    if ((localBitmap == null) || (Math.min(localBitmap.getWidth(), localBitmap.getHeight()) < 32)) {
      g();
    }
    if (this.h == null)
    {
      this.h = parambvx;
      return;
    }
    b(parambvx);
  }
  
  public final void a(FilterParameter paramFilterParameter, Bitmap paramBitmap)
  {
    aiq localaiq = this.d.a;
    if (localaiq == null) {
      Log.e("PhotoEditorActivity", "Cannot apply filter: edit session is not ready!");
    }
    while (!this.l)
    {
      return;
      if ((paramFilterParameter.getFilterType() != 1) && (paramBitmap == null))
      {
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.toString(paramFilterParameter.getFilterType());
        Log.e("PhotoEditorActivity", String.format(localLocale, "Failed to apply \"%s\" filter!", arrayOfObject));
      }
      else
      {
        int j = paramFilterParameter.getFilterType();
        if (j != 1)
        {
          localaiq.j = true;
          if ((j == 20) || (aiq.a(j)))
          {
            localaiq.e = null;
            localaiq.a(true);
          }
          localaiq.a();
          localaiq.f = paramBitmap;
          FilterChain localFilterChain1 = localaiq.h;
          int k = localaiq.d.getWidth();
          if (k < 0) {
            throw new IllegalArgumentException("ImageWidth must be larger than 0.");
          }
          localFilterChain1.e = k;
          FilterChain localFilterChain2 = localaiq.h;
          int n = localaiq.d.getHeight();
          if (n < 0) {
            throw new IllegalArgumentException("ImageHeight must be larger than 0.");
          }
          localFilterChain2.f = n;
          NativeCore.transformFilterParameterToImageSpace(localaiq.h, paramFilterParameter);
          if (!aiq.a(j))
          {
            localaiq.h.b(paramFilterParameter);
            localaiq.h.a(paramFilterParameter);
          }
          localaiq.b();
        }
      }
    }
    bz localbz = this.b.a.d;
    akl localakl = (akl)localbz.a("root");
    if (localakl != null) {
      localakl.v();
    }
    ake localake = (ake)localbz.a("FilterFragment");
    if (localake != null)
    {
      localake.ab = null;
      localbz.c();
    }
    invalidateOptionsMenu();
  }
  
  public final void a(ghn paramghn)
  {
    this.g = paramghn;
  }
  
  public final void a(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return;
    }
    this.f.removeCallbacks(paramRunnable);
  }
  
  public final void a(Runnable paramRunnable, int paramInt)
  {
    if (paramRunnable == null) {
      return;
    }
    this.f.postDelayed(paramRunnable, paramInt);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    akl localakl = (akl)this.b.a.d.a("root");
    if (localakl == null) {
      return;
    }
    if (paramBoolean1)
    {
      localakl.a(paramBoolean2);
      return;
    }
    localakl.w();
  }
  
  public final boolean a(byte[] paramArrayOfByte)
  {
    return efj.a(efj.a(paramArrayOfByte), Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888)) != null;
  }
  
  public final void b(int paramInt)
  {
    bz localbz = this.b.a.d;
    ake localake = ait.a(paramInt);
    if (localake == null) {
      return;
    }
    localake.ab = this;
    cl localcl = localbz.a();
    localcl.a(efj.fB, localake, "FilterFragment");
    localcl.a(null);
    if (Build.VERSION.SDK_INT > 15) {
      localcl.a(4097);
    }
    localcl.b();
  }
  
  public final boolean d()
  {
    return this.m;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return ((this.g != null) && (this.g.a(paramMotionEvent))) || (super.dispatchTouchEvent(paramMotionEvent));
  }
  
  public final aiq e()
  {
    return this.d.a;
  }
  
  public final bvx f()
  {
    FilterChain localFilterChain = this.d.a.h;
    oih localoih = new oih();
    Bitmap localBitmap = this.d.a.c();
    efj.a(localFilterChain, localoih);
    return new bvx(localBitmap, qat.a(localoih));
  }
  
  public final void g()
  {
    this.d = ((alt)this.b.a.d.a("EditSessionFragment"));
    if (this.d != null) {
      this.d.c(false);
    }
    if (this.i != null)
    {
      ((bwa)this.j.b(bwa.class)).c(getTaskId());
      this.i = null;
    }
    finish();
  }
  
  public final void h()
  {
    invalidateOptionsMenu();
    akl localakl = (akl)this.b.a.d.a("root");
    if (localakl != null) {
      localakl.v();
    }
    a(false, false);
  }
  
  public final void h_()
  {
    if ((this.i == null) || (!this.d.a.j))
    {
      g();
      return;
    }
    a(true, true);
    aiq localaiq = this.d.a;
    if ((localaiq.h == null) || (localaiq.h.getPostRotation() == 0)) {}
    for (;;)
    {
      this.i.a(f());
      return;
      if (localaiq.f != null) {
        localaiq.f = efj.Cv.rotateImage(localaiq.f, localaiq.h.getPostRotation(), true);
      } else if (localaiq.d != null) {
        localaiq.d = efj.Cv.rotateImage(localaiq.d, localaiq.h.getPostRotation(), true);
      }
    }
  }
  
  public void onBackPressed()
  {
    boolean bool = true;
    bz localbz = this.b.a.d;
    ake localake = (ake)localbz.a("FilterFragment");
    if (localake != null)
    {
      if (localake.ae) {
        localake.h(bool);
      }
      for (;;)
      {
        if (!bool)
        {
          mbf localmbf = localake.bn;
          gxr localgxr2 = new gxr();
          gxq localgxq2 = new gxq(pjw.d);
          localgxr2.b.add(localgxq2);
          new gwz(4, localgxr2.a(localake.bn)).b(localmbf);
          super.onBackPressed();
        }
        return;
        bool = false;
      }
    }
    if ((this.d.a.j) && (localbz.e() == 0))
    {
      alp localalp = new alp(this);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setTitle(efj.iv);
      localBuilder.setMessage(efj.iu);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(efj.it, localalp);
      localBuilder.setNegativeButton(efj.is, localalp);
      localBuilder.create().show();
      return;
    }
    gxr localgxr1 = new gxr();
    gxq localgxq1 = new gxq(pjw.l);
    localgxr1.b.add(localgxq1);
    new gwz(4, localgxr1.a(this)).b(this);
    g();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    super.onCreate(paramBundle);
    bwa localbwa = (bwa)this.j.b(bwa.class);
    if (localbwa != null) {
      this.i = localbwa.a(getTaskId());
    }
    efj.Cv = NativeCore.a;
    FilterFactory.a((gel)this.j.a(gel.class));
    Window localWindow = getWindow();
    localWindow.requestFeature(9);
    setContentView(efj.gm);
    ActionBar localActionBar = getActionBar();
    if (localActionBar == null) {
      throw new IllegalStateException("Failed to get action bar reference");
    }
    localActionBar.setBackgroundDrawable(null);
    localActionBar.setDisplayShowHomeEnabled(false);
    localActionBar.setDisplayShowTitleEnabled(false);
    localActionBar.setDisplayShowCustomEnabled(bool1);
    localWindow.setBackgroundDrawable(null);
    this.f = new Handler(getMainLooper());
    bz localbz1 = this.b.a.d;
    this.d = ((alt)localbz1.a("EditSessionFragment"));
    Bitmap localBitmap;
    if (this.d == null)
    {
      this.d = new alt();
      this.d.c(bool1);
      cl localcl2 = localbz1.a();
      localcl2.a(this.d, "EditSessionFragment");
      localcl2.b();
      if (this.i == null)
      {
        alt localalt = this.d;
        Uri localUri = ghk.a();
        if (localUri == null) {
          break label585;
        }
        localBitmap = BitmapHelper.a(new gid(getContentResolver(), localUri), 2147483647, null);
        if (localBitmap == null) {
          break label591;
        }
        label278:
        localalt.a.a(localBitmap, null, null);
      }
    }
    Display localDisplay = getWindowManager().getDefaultDisplay();
    Point localPoint = new Point();
    localDisplay.getSize(localPoint);
    aiq localaiq = this.d.a;
    int j = localPoint.x;
    int k = localPoint.y;
    if ((localaiq.a != j) || (localaiq.b != k))
    {
      localaiq.a = Math.min(j, 2048);
      localaiq.b = Math.min(k, 2048);
      localaiq.g = null;
    }
    bz localbz2 = this.b.a.d;
    akl localakl = (akl)localbz2.a("root");
    if (localakl == null)
    {
      localakl = new akl();
      cl localcl1 = localbz2.a();
      localcl1.a(efj.fB, localakl, "root");
      localcl1.b();
    }
    localakl.a = this;
    boolean bool2;
    label485:
    int n;
    if (paramBundle == null) {
      if ((this.i == null) || (hvu.b(this)))
      {
        bool2 = bool1;
        this.m = bool2;
        if (!this.m)
        {
          if (!getIntent().hasExtra("edit_info")) {
            break label619;
          }
          alq localalq = new alq(this);
          if (!hvu.c(this)) {
            break label611;
          }
          n = efj.hu;
          label533:
          a(n, efj.gT, localalq);
        }
        label544:
        if (this.i != null) {
          if (this.d.a.d == null) {
            break label678;
          }
        }
      }
    }
    for (;;)
    {
      if (!bool1) {
        this.i.a(paramBundle, this, getIntent(), this);
      }
      return;
      label585:
      localBitmap = null;
      break;
      label591:
      localBitmap = ghk.a(1920, 1080);
      break label278;
      bool2 = false;
      break label485;
      label611:
      n = efj.hv;
      break label533;
      label619:
      alr localalr = new alr(this);
      if (hvu.c(this)) {}
      for (int i1 = efj.hw;; i1 = efj.hx)
      {
        a(i1, 17039370, localalr);
        break;
      }
      this.m = paramBundle.getBoolean("editorAssetsAreAvailable", false);
      break label544;
      label678:
      bool1 = false;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.i != null) {
      this.i.e();
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == efj.fr)
    {
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pjw.n);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this)).b(this);
      if (this.i != null) {
        this.i.a(0);
      }
    }
    do
    {
      return true;
      if (paramMenuItem.getItemId() != efj.fs) {
        break;
      }
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pjw.q);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this)).b(this);
    } while (this.i == null);
    this.i.a(1);
    return true;
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.l = false;
    if (this.i != null) {
      this.i.a();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    this.l = true;
    efj.Cv.setUpContext(this);
    bz localbz = this.b.a.d;
    akl localakl = (akl)localbz.a("root");
    if (localakl != null) {
      localakl.a = this;
    }
    ake localake = (ake)localbz.a("FilterFragment");
    if (localake != null) {
      localake.ab = this;
    }
    if (this.i != null) {
      this.i.d();
    }
    if (this.d.a.d != null) {}
    for (int j = 1; j != 0; j = 0)
    {
      h();
      return;
    }
    if ((this.h != null) && (this.h.a != null))
    {
      b(this.h);
      return;
    }
    this.h = new bvx();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("editorAssetsAreAvailable", this.m);
    if (this.i != null) {
      this.i.a(paramBundle);
    }
  }
  
  public final gxq v()
  {
    return new gxq(pjw.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photoeditor.fragments.PhotoEditorActivity
 * JD-Core Version:    0.7.0.1
 */