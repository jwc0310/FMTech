package com.google.android.libraries.social.accountswitcher;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import glu;
import glv;
import glx;
import gxq;
import ipf;
import kva;
import pjl;

public final class AccountSwitcherView
  extends RelativeLayout
{
  public MediaView a;
  public AvatarView b;
  public LinearLayout c;
  public AvatarView d;
  public AvatarView e;
  public boolean f = true;
  public int g = 0;
  private MediaView h;
  private TextView i;
  private TextView j;
  
  public AccountSwitcherView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public AccountSwitcherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AccountSwitcherView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private static void a(View paramView, int paramInt)
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.setMargins(localLayoutParams.leftMargin, paramInt + localLayoutParams.topMargin, localLayoutParams.rightMargin, localLayoutParams.bottomMargin);
    paramView.setLayoutParams(localLayoutParams);
  }
  
  public static void a(AvatarView paramAvatarView)
  {
    paramAvatarView.setX(paramAvatarView.getLeft());
    paramAvatarView.setY(paramAvatarView.getTop());
    paramAvatarView.setPivotX(paramAvatarView.getWidth() / 2.0F);
    paramAvatarView.setPivotY(paramAvatarView.getHeight() / 2.0F);
    paramAvatarView.setScaleX(1.0F);
    paramAvatarView.setScaleY(1.0F);
  }
  
  public final void a(ipf paramipf, boolean paramBoolean)
  {
    this.a.a(4, paramBoolean);
    this.a.a(paramipf);
    this.a.setAlpha(1.0F);
    this.h.a(null);
  }
  
  public final void a(ipf paramipf, boolean paramBoolean, Runnable paramRunnable)
  {
    int k = 1 + this.g;
    this.g = k;
    a(false);
    glu localglu = new glu(this, k, paramRunnable);
    this.h.a(4, paramBoolean);
    this.h.F = new glv(this, localglu);
    this.h.a(paramipf);
    efj.m().postDelayed(localglu, 240L);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.i.setText(paramString1);
    this.i.setContentDescription(getContext().getString(efj.Db, new Object[] { paramString1 }));
    this.j.setText(paramString2);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    this.b.setClickable(paramBoolean);
    this.d.setClickable(paramBoolean);
    this.e.setClickable(paramBoolean);
  }
  
  protected final void onFinishInflate()
  {
    efj.a(this, new gxq(pjl.a));
    this.c = ((LinearLayout)findViewById(efj.CX));
    this.i = ((TextView)findViewById(efj.CW));
    this.j = ((TextView)findViewById(efj.CT));
    this.b = ((AvatarView)findViewById(efj.CN));
    this.b.g = false;
    this.d = ((AvatarView)findViewById(efj.CO));
    this.d.g = false;
    efj.a(this.d, new kva(pjl.d, 0));
    this.e = ((AvatarView)findViewById(efj.CP));
    this.e.g = false;
    efj.a(this.e, new kva(pjl.d, 1));
    this.a = ((MediaView)findViewById(efj.CQ));
    MediaView localMediaView1 = this.a;
    int k = efj.CH;
    Drawable localDrawable1;
    MediaView localMediaView4;
    int m;
    Drawable localDrawable2;
    if (k == 0)
    {
      localDrawable1 = null;
      localMediaView1.p = localDrawable1;
      MediaView localMediaView2 = this.a;
      localMediaView2.J = true;
      localMediaView2.invalidate();
      MediaView localMediaView3 = this.a;
      localMediaView3.K = 102;
      localMediaView3.invalidate();
      this.h = ((MediaView)findViewById(efj.CR));
      localMediaView4 = this.h;
      m = efj.CH;
      localDrawable2 = null;
      if (m != 0) {
        break label373;
      }
    }
    for (;;)
    {
      localMediaView4.p = localDrawable2;
      MediaView localMediaView5 = this.h;
      localMediaView5.J = true;
      localMediaView5.invalidate();
      MediaView localMediaView6 = this.h;
      localMediaView6.K = 102;
      localMediaView6.invalidate();
      if (efj.z(getContext()))
      {
        int n = efj.A(getContext());
        a(this.b, n);
        a(this.d, n);
        a(this.e, n);
      }
      return;
      localDrawable1 = localMediaView1.getResources().getDrawable(k);
      break;
      label373:
      localDrawable2 = localMediaView4.getResources().getDrawable(m);
    }
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec((int)(0.5625D * View.MeasureSpec.getSize(paramInt1)), 1073741824));
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof glx))
    {
      glx localglx = (glx)paramParcelable;
      super.onRestoreInstanceState(localglx.getSuperState());
      this.g = localglx.a;
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    glx localglx = new glx(super.onSaveInstanceState());
    localglx.a = this.g;
    return localglx;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.accountswitcher.AccountSwitcherView
 * JD-Core Version:    0.7.0.1
 */