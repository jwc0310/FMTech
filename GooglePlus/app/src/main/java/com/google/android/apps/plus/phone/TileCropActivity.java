package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import bhp;
import bk;
import chp;
import com.google.android.apps.plus.views.PhotoCropOverlay;
import com.google.android.apps.plus.views.PhotoView;
import dpq;
import efj;
import gir;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gya;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbf;
import mbp;
import tp;

public class TileCropActivity
  extends mbp
  implements gir, gpq, gxv
{
  private final bhp d;
  private chp e;
  
  public TileCropActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, aaw.dM);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wT);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(gir.class, this);
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof chp)) {
      this.e = ((chp)parambk);
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(String paramString, int paramInt)
  {
    chp localchp = this.e;
    if (paramString.equals("xPosition")) {
      localchp.ab = paramInt;
    }
    for (;;)
    {
      Rect localRect = new Rect();
      PhotoCropOverlay localPhotoCropOverlay = localchp.d;
      localRect.set(localPhotoCropOverlay.g.left, localPhotoCropOverlay.g.top, localPhotoCropOverlay.g.right, localPhotoCropOverlay.g.bottom);
      int i = localchp.c.b.getIntrinsicWidth();
      int j = localchp.c.b.getIntrinsicHeight();
      PhotoView localPhotoView = localchp.c;
      localPhotoView.h.set(localPhotoView.i);
      localPhotoView.a();
      localchp.c.a(true, i / 2, j / 2, false);
      int k = (int)Math.floor(localchp.ab / 100.0F * i);
      int m = (int)Math.floor(localchp.ac / 100.0F * j);
      localchp.c.a(localchp.ad, k, m);
      localchp.c.a(true, -k * localchp.ad, -m * localchp.ad, false);
      localchp.v();
      localchp.c.a(localchp.af);
      int n = (int)(100.0F * localchp.af.width());
      int i1 = (int)(100.0F * localchp.af.height());
      mbf localmbf = localchp.bn;
      Resources localResources = localchp.g();
      int i2 = aau.bb;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(localchp.ab);
      arrayOfObject[1] = Integer.valueOf(n + localchp.ab);
      arrayOfObject[2] = Integer.valueOf(localchp.ac);
      arrayOfObject[3] = Integer.valueOf(i1 + localchp.ac);
      Toast.makeText(localmbf, localResources.getString(i2, arrayOfObject), 0).show();
      return;
      if (paramString.equals("yPosition")) {
        localchp.ac = paramInt;
      } else if (paramString.equals("zoomPercent")) {
        localchp.ad = (Float.valueOf(localchp.ae[paramInt]).floatValue() / 100.0F);
      }
    }
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      this.e = new chp();
      this.d.a(this.e);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.TileCropActivity
 * JD-Core Version:    0.7.0.1
 */