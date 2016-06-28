package com.google.android.libraries.social.collexions.impl.providers.acl;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.media.ui.RoundedMediaView;
import efj;
import gow;
import ipf;
import ipm;
import iqm;
import lxj;

public final class CollexionAvatarView
  extends RelativeLayout
  implements lxj
{
  private static int e;
  public final RoundedMediaView a;
  public final ImageView b;
  public final gow c;
  public int d;
  
  public CollexionAvatarView(Context paramContext)
  {
    super(paramContext);
    b();
    setLayoutParams(new RelativeLayout.LayoutParams(e, e));
    this.a = new RoundedMediaView(getContext());
    this.a.a(null);
    this.b = new ImageView(getContext());
    this.d = aaw.oK;
    this.a.s = 2;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(e, e);
    localLayoutParams1.addRule(13, -1);
    this.a.setVisibility(8);
    addView(this.a, localLayoutParams1);
    this.b.setImageResource(this.d);
    this.b.setScaleType(ImageView.ScaleType.CENTER);
    this.b.setVisibility(8);
    addView(this.b, localLayoutParams1);
    this.c = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.c, localLayoutParams2);
  }
  
  public CollexionAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
    setLayoutParams(new RelativeLayout.LayoutParams(e, e));
    this.a = new RoundedMediaView(getContext());
    this.a.a(null);
    this.b = new ImageView(getContext());
    this.d = aaw.oK;
    this.a.s = 2;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(e, e);
    localLayoutParams1.addRule(13, -1);
    this.a.setVisibility(8);
    addView(this.a, localLayoutParams1);
    this.b.setImageResource(this.d);
    this.b.setScaleType(ImageView.ScaleType.CENTER);
    this.b.setVisibility(8);
    addView(this.b, localLayoutParams1);
    this.c = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.c, localLayoutParams2);
  }
  
  public CollexionAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
    setLayoutParams(new RelativeLayout.LayoutParams(e, e));
    this.a = new RoundedMediaView(getContext());
    this.a.a(null);
    this.b = new ImageView(getContext());
    this.d = aaw.oK;
    this.a.s = 2;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(e, e);
    localLayoutParams1.addRule(13, -1);
    this.a.setVisibility(8);
    addView(this.a, localLayoutParams1);
    this.b.setImageResource(this.d);
    this.b.setScaleType(ImageView.ScaleType.CENTER);
    this.b.setVisibility(8);
    addView(this.b, localLayoutParams1);
    this.c = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.c, localLayoutParams2);
  }
  
  private final void b()
  {
    if (e == 0) {
      e = getResources().getDimensionPixelSize(efj.Ji);
    }
  }
  
  public final void D_()
  {
    this.a.D_();
    RoundedMediaView localRoundedMediaView = this.a;
    int i = aaw.oK;
    Bitmap localBitmap = BitmapFactory.decodeResource(localRoundedMediaView.getContext().getResources(), i);
    if (localBitmap == null) {
      localBitmap = (Bitmap)MediaView.j.b();
    }
    localRoundedMediaView.C = localBitmap;
  }
  
  public final CollexionAvatarView a(String paramString)
  {
    if (paramString != null)
    {
      this.a.a(ipf.a(getContext(), paramString, ipm.a));
      this.a.setVisibility(0);
      this.b.setVisibility(8);
      return this;
    }
    this.a.a(null);
    this.b.setVisibility(0);
    this.a.setVisibility(8);
    return this;
  }
  
  public final void a(int paramInt)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.getPaint().setColor(paramInt);
    this.b.setBackgroundDrawable(localShapeDrawable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.providers.acl.CollexionAvatarView
 * JD-Core Version:    0.7.0.1
 */