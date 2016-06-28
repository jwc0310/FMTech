package com.google.android.libraries.social.spaces;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.autoresizetextview.AutoResizeTextView;
import com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView;
import com.google.android.libraries.social.ui.views.linearavatarpileview.LinearAvatarPileView;
import do;
import efj;
import gvj;
import gwz;
import gxq;
import ipf;
import java.text.NumberFormat;
import java.util.List;
import kwz;
import kxa;
import kxb;
import kxd;
import kxg;
import kxk;
import kxl;
import kxn;
import kxo;
import kxp;
import luc;
import lwo;
import lxj;
import mbb;
import mfx;
import mfz;
import pkg;

public final class SpaceHeaderView
  extends LinearLayout
  implements View.OnClickListener, kxa, lxj
{
  public CoverPhotoImageView a;
  public AutoResizeTextView b;
  public TextView c;
  public TextView d;
  public View e;
  public View f;
  public SpaceFollowButton g;
  public SpaceFollowButton h;
  public kxd i;
  public kxo j;
  public boolean k;
  public boolean l;
  public int m;
  public int n;
  private final kxd o;
  private final Animator.AnimatorListener p;
  private final Animator.AnimatorListener q;
  private TextView r;
  private LinearAvatarPileView s;
  private kxp t;
  private ViewGroup u;
  private ViewGroup.LayoutParams v;
  private int w;
  private ImageView x;
  private final kwz y;
  private final StringBuilder z;
  
  public SpaceHeaderView(Context paramContext)
  {
    super(paramContext);
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = kxg.b.ordinal();
    arrayOfInt[1] = kxg.d.ordinal();
    arrayOfInt[2] = kxg.f.ordinal();
    arrayOfInt[3] = kxg.e.ordinal();
    this.o = new kxd(kxd.a(arrayOfInt), efj.Wh, 0, efj.Wg, -1);
    this.p = new kxk(this);
    this.q = new kxl(this);
    this.k = true;
    this.l = false;
    this.z = new StringBuilder();
    this.y = ((kwz)mbb.b(getContext(), kwz.class));
  }
  
  public SpaceHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = kxg.b.ordinal();
    arrayOfInt[1] = kxg.d.ordinal();
    arrayOfInt[2] = kxg.f.ordinal();
    arrayOfInt[3] = kxg.e.ordinal();
    this.o = new kxd(kxd.a(arrayOfInt), efj.Wh, 0, efj.Wg, -1);
    this.p = new kxk(this);
    this.q = new kxl(this);
    this.k = true;
    this.l = false;
    this.z = new StringBuilder();
    this.y = ((kwz)mbb.b(getContext(), kwz.class));
  }
  
  public SpaceHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = kxg.b.ordinal();
    arrayOfInt[1] = kxg.d.ordinal();
    arrayOfInt[2] = kxg.f.ordinal();
    arrayOfInt[3] = kxg.e.ordinal();
    this.o = new kxd(kxd.a(arrayOfInt), efj.Wh, 0, efj.Wg, -1);
    this.p = new kxk(this);
    this.q = new kxl(this);
    this.k = true;
    this.l = false;
    this.z = new StringBuilder();
    this.y = ((kwz)mbb.b(getContext(), kwz.class));
  }
  
  private void a(View paramView)
  {
    if (this.e != null) {
      this.u.removeViewAt(this.w);
    }
    this.e = paramView;
    if (this.e != null) {
      this.u.addView(this.e, this.w, this.v);
    }
  }
  
  public final void D_()
  {
    this.a.D_();
    this.s.ap_();
    setContentDescription(null);
    this.n = 0;
    this.m = 0;
    lwo.f(this.e);
  }
  
  public final void a(int paramInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.s.getLayoutParams();
    switch (kxm.a[(paramInt - 1)])
    {
    default: 
      localMarginLayoutParams.height = getResources().getDimensionPixelSize(efj.VV);
      return;
    case 1: 
      localMarginLayoutParams.height = getResources().getDimensionPixelSize(efj.VX);
      return;
    case 2: 
      localMarginLayoutParams.height = getResources().getDimensionPixelSize(efj.VW);
      return;
    }
    localMarginLayoutParams.height = getResources().getDimensionPixelSize(efj.VU);
  }
  
  public final void a(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i1;
    int i2;
    if (paramInt1 > 0)
    {
      i1 = 1;
      if (paramInt2 <= 0) {
        break label242;
      }
      i2 = 1;
      label23:
      if (TextUtils.isEmpty(paramCharSequence)) {
        break label248;
      }
    }
    label242:
    label248:
    for (int i3 = 1;; i3 = 0)
    {
      NumberFormat localNumberFormat = NumberFormat.getIntegerInstance();
      Resources localResources = getResources();
      if (i1 != 0)
      {
        int i6 = efj.Wi;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localNumberFormat.format(paramInt1);
        localStringBuilder.append(localResources.getQuantityString(i6, paramInt1, arrayOfObject2));
      }
      if ((i1 != 0) && (i2 != 0)) {
        localStringBuilder.append(" - ");
      }
      if (i2 != 0)
      {
        int i5 = efj.Wj;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localNumberFormat.format(paramInt2);
        localStringBuilder.append(localResources.getQuantityString(i5, paramInt2, arrayOfObject1));
      }
      if (((i1 != 0) || (i2 != 0)) && (i3 != 0)) {
        localStringBuilder.append(" - ");
      }
      if (i3 != 0) {
        localStringBuilder.append(paramCharSequence);
      }
      String str = localStringBuilder.toString();
      this.r.setText(str);
      TextView localTextView = this.r;
      boolean bool = TextUtils.isEmpty(str);
      int i4 = 0;
      if (bool) {
        i4 = 8;
      }
      localTextView.setVisibility(i4);
      c();
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label23;
    }
  }
  
  public final void a(ipf paramipf)
  {
    if (paramipf != null)
    {
      this.a.E = 2;
      this.a.a(paramipf);
      this.a.setVisibility(0);
      return;
    }
    this.a.setVisibility(8);
    this.a.D_();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
    c();
    if ((Build.VERSION.SDK_INT >= 18) && (Build.VERSION.SDK_INT < 21))
    {
      this.b.setVisibility(8);
      this.b.setVisibility(0);
    }
  }
  
  public final void a(String paramString)
  {
    this.c.setText(paramString);
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    TextView localTextView;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      CharSequence[] arrayOfCharSequence = new CharSequence[2];
      arrayOfCharSequence[0] = getContext().getString(efj.Wt);
      arrayOfCharSequence[1] = paramString;
      efj.a(localStringBuilder, arrayOfCharSequence);
      this.c.setContentDescription(localStringBuilder);
      boolean bool = TextUtils.isEmpty(paramString);
      localTextView = this.c;
      if (!bool) {
        break label123;
      }
    }
    label123:
    for (int i1 = 8;; i1 = 0)
    {
      localTextView.setVisibility(i1);
      return;
      localStringBuilder = new StringBuilder(256);
      break;
    }
  }
  
  public final void a(kxb paramkxb)
  {
    setBackgroundColor(paramkxb.a);
    this.a.setBackgroundColor(paramkxb.a);
    this.b.setTextColor(paramkxb.d);
    if (this.n == 0) {
      this.c.setTextColor(paramkxb.d);
    }
    if (this.m == 0) {
      this.d.setTextColor(paramkxb.d);
    }
    this.r.setTextColor(paramkxb.e);
    SpaceFollowButton localSpaceFollowButton1 = this.g;
    kxd localkxd1;
    SpaceFollowButton localSpaceFollowButton2;
    if (this.i == null)
    {
      localkxd1 = this.o;
      int i1 = paramkxb.b;
      localSpaceFollowButton1.d = localkxd1;
      localSpaceFollowButton1.c = i1;
      localSpaceFollowButton1.a();
      if (this.h != null)
      {
        localSpaceFollowButton2 = this.h;
        if (this.i != null) {
          break label189;
        }
      }
    }
    label189:
    for (kxd localkxd2 = this.o;; localkxd2 = this.i)
    {
      int i2 = paramkxb.a;
      localSpaceFollowButton2.d = localkxd2;
      localSpaceFollowButton2.c = i2;
      localSpaceFollowButton2.a();
      this.x.setColorFilter(paramkxb.d, PorterDuff.Mode.MULTIPLY);
      return;
      localkxd1 = this.i;
      break;
    }
  }
  
  public final void a(kxp paramkxp)
  {
    this.t = paramkxp;
    if (this.t != null)
    {
      this.s.setOnClickListener(this);
      LinearAvatarPileView localLinearAvatarPileView = this.s;
      if (luc.a == null) {
        luc.a = new luc();
      }
      localLinearAvatarPileView.setAccessibilityDelegate(luc.a);
      this.d.setOnClickListener(this);
      return;
    }
    this.s.setOnClickListener(null);
    this.s.setAccessibilityDelegate(null);
    this.d.setOnClickListener(null);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = 1.0F;
    if ((paramBoolean1 == this.l) || (this.f == null)) {}
    while ((paramBoolean1) && (!this.k)) {
      return;
    }
    this.l = paramBoolean1;
    b();
    if (paramBoolean2)
    {
      int i2;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i2 = 1;
        if (i2 == 0) {
          break label127;
        }
        if (!paramBoolean1) {
          break label105;
        }
        this.f.animate().alpha(f1).setListener(this.q);
      }
      for (;;)
      {
        label81:
        if (this.j == null) {
          break label164;
        }
        this.j.b(paramBoolean1);
        return;
        i2 = 0;
        break;
        label105:
        this.f.animate().alpha(0.0F).setListener(this.p);
      }
    }
    label127:
    View localView1 = this.f;
    label137:
    View localView2;
    if (paramBoolean1)
    {
      localView1.setAlpha(f1);
      localView2 = this.f;
      if (!paramBoolean1) {
        break label171;
      }
    }
    label164:
    label171:
    for (int i1 = 0;; i1 = 8)
    {
      localView2.setVisibility(i1);
      break label81;
      break;
      f1 = 0.0F;
      break label137;
    }
  }
  
  public final void a(String[] paramArrayOfString, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    int i1 = 8;
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.s.getLayoutParams();
    ((ViewGroup.MarginLayoutParams)this.a.getLayoutParams()).bottomMargin = (-localMarginLayoutParams.height / 2 - localMarginLayoutParams.topMargin);
    this.s.a(paramArrayOfString);
    LinearAvatarPileView localLinearAvatarPileView = this.s;
    int i2;
    TextView localTextView;
    if (paramArrayOfString == null)
    {
      i2 = i1;
      localLinearAvatarPileView.setVisibility(i2);
      this.s.setContentDescription(paramCharSequence2);
      this.d.setText(paramCharSequence1);
      localTextView = this.d;
      if (!TextUtils.isEmpty(paramCharSequence1)) {
        break label119;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i1);
      c();
      return;
      i2 = 0;
      break;
      label119:
      i1 = 0;
    }
  }
  
  public final void b()
  {
    if ((this.k) && (this.f != null))
    {
      int i1;
      if (this.l)
      {
        i1 = efj.We;
        if (!this.l) {
          break label83;
        }
      }
      label83:
      for (int i2 = efj.Wq;; i2 = efj.Wr)
      {
        this.x.setImageResource(i1);
        this.x.setContentDescription(getResources().getString(i2));
        this.x.setOnClickListener(this);
        this.x.setVisibility(0);
        return;
        i1 = efj.Wf;
        break;
      }
    }
    this.x.setImageResource(0);
    this.x.setContentDescription(null);
    this.x.setOnClickListener(null);
    this.x.setVisibility(8);
  }
  
  public final void b(int paramInt)
  {
    a(LayoutInflater.from(getContext()).inflate(paramInt, this.u, false));
  }
  
  public final void c()
  {
    this.z.setLength(0);
    StringBuilder localStringBuilder = this.z;
    CharSequence[] arrayOfCharSequence = new CharSequence[3];
    if (this.b.getContentDescription() == null) {}
    for (CharSequence localCharSequence = this.b.getText();; localCharSequence = this.b.getContentDescription())
    {
      arrayOfCharSequence[0] = localCharSequence;
      arrayOfCharSequence[1] = this.d.getText();
      arrayOfCharSequence[2] = this.r.getText();
      efj.a(localStringBuilder, arrayOfCharSequence);
      setContentDescription(this.z);
      return;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.y != null) {
      this.y.a(this);
    }
  }
  
  public final void onClick(View paramView)
  {
    gwz.a(paramView, 4);
    if (paramView == this.x) {
      if (!this.l)
      {
        bool = true;
        a(bool, true);
      }
    }
    while ((paramView != this.s) && (paramView != this.d)) {
      for (;;)
      {
        return;
        boolean bool = false;
      }
    }
    gvj localgvj;
    if (this.s.a != null)
    {
      localgvj = (gvj)mbb.a(getContext(), gvj.class);
      if (this.s.a.length != 1) {
        break label108;
      }
      localgvj.a(this.s);
    }
    for (;;)
    {
      this.t.K_();
      return;
      label108:
      if (this.s.a.length > 1) {
        localgvj.b(this.s);
      }
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.y != null) {
      this.y.c.remove(this);
    }
    D_();
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((CoverPhotoImageView)findViewById(do.g));
    this.s = ((LinearAvatarPileView)findViewById(do.m));
    this.d = ((TextView)findViewById(do.l));
    this.b = ((AutoResizeTextView)findViewById(do.q));
    this.r = ((TextView)findViewById(do.v));
    this.c = ((TextView)findViewById(do.w));
    this.x = ((ImageView)findViewById(do.o));
    this.g = ((SpaceFollowButton)findViewById(do.p));
    this.e = findViewById(do.k);
    this.u = ((ViewGroup)this.e.getParent());
    this.v = this.e.getLayoutParams();
    this.w = this.u.indexOfChild(this.e);
    AutoResizeTextView localAutoResizeTextView = this.b;
    if (localAutoResizeTextView.a != 24.0F)
    {
      localAutoResizeTextView.a = 24.0F;
      localAutoResizeTextView.requestLayout();
    }
    this.a.n = true;
    this.a.a = false;
    a(kxn.d);
    a(null);
    efj.a(this.s, new gxq(pkg.a));
    efj.a(this.d, new gxq(pkg.b));
    efj.a(this.x, new gxq(pkg.c));
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    this.a.getLayoutParams().height = ((int)(0.5625F * i1));
    super.onMeasure(paramInt1, paramInt2);
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824)
    {
      int i2 = View.MeasureSpec.getSize(paramInt2);
      if (getMeasuredHeight() > i2)
      {
        this.a.getLayoutParams().height = (this.a.getMeasuredHeight() - (getMeasuredHeight() - i2));
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.spaces.SpaceHeaderView
 * JD-Core Version:    0.7.0.1
 */