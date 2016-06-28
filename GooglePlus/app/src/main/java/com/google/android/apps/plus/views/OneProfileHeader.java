package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.oneprofile.about.LocalStarRating;
import com.google.android.libraries.social.ui.tabbar.TabBar;
import com.google.android.libraries.social.ui.views.HorizontalPreferredLinearLayout;
import da;
import dxp;
import dxq;
import efj;
import gcc;
import git;
import hgs;
import hul;
import ied;
import iee;
import ief;
import iek;
import ipb;
import java.util.ArrayList;
import java.util.List;
import lvi;
import lvj;
import lwb;
import lxe;
import lxj;
import lym;
import mbb;
import nxh;

public class OneProfileHeader
  extends RelativeLayout
  implements View.OnClickListener, View.OnLongClickListener, dxp, iek, lxj
{
  private static nxh A;
  private static int B;
  private static int C;
  private static int D;
  private static int E;
  private static int F;
  private static int G;
  private static ipb I;
  private static int J;
  public static Drawable a;
  public static Drawable b;
  public static Drawable c;
  public static ColorStateList d;
  public static int e;
  private TooltipView H;
  private View K;
  private TextView L;
  private TextView M;
  private int N = 0;
  private boolean O;
  private gcc P;
  public int f;
  public lxe g = new lxe(this);
  public dxq h;
  public CoverPhotoImageView i;
  public String j;
  public String k;
  public OneProfileAvatarView l;
  public TextView m;
  public TextView n;
  public LocalStarRating o;
  public HorizontalPreferredLinearLayout p;
  public TextView q;
  public TextView r;
  public TextView s;
  public boolean t;
  public TextView u;
  public CirclesButton v;
  public TextView w;
  public TextView x;
  public ImageView y;
  public TabBar z;
  
  public OneProfileHeader(Context paramContext)
  {
    super(paramContext);
    if (I == null)
    {
      I = (ipb)mbb.a(getContext(), ipb.class);
      Resources localResources = getContext().getResources();
      C = localResources.getDimensionPixelSize(efj.nm);
      D = localResources.getDimensionPixelSize(efj.nn);
      E = localResources.getDimensionPixelSize(efj.ns);
      J = localResources.getDimensionPixelSize(efj.nl);
      d = localResources.getColorStateList(efj.jT);
      B = localResources.getDimensionPixelSize(efj.np);
      F = localResources.getDimensionPixelSize(efj.nv);
      G = localResources.getDimensionPixelSize(efj.nu);
      e = localResources.getColor(efj.kp);
      a = localResources.getDrawable(efj.qh);
      b = localResources.getDrawable(efj.pJ);
      c = localResources.getDrawable(efj.pw);
      nxh localnxh = new nxh();
      A = localnxh;
      localnxh.b = Float.valueOf(0.0F);
      A.a = Float.valueOf(0.0F);
      A.d = Float.valueOf(1.0F);
      A.c = Float.valueOf(1.0F);
    }
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.O = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public OneProfileHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (I == null)
    {
      I = (ipb)mbb.a(getContext(), ipb.class);
      Resources localResources = getContext().getResources();
      C = localResources.getDimensionPixelSize(efj.nm);
      D = localResources.getDimensionPixelSize(efj.nn);
      E = localResources.getDimensionPixelSize(efj.ns);
      J = localResources.getDimensionPixelSize(efj.nl);
      d = localResources.getColorStateList(efj.jT);
      B = localResources.getDimensionPixelSize(efj.np);
      F = localResources.getDimensionPixelSize(efj.nv);
      G = localResources.getDimensionPixelSize(efj.nu);
      e = localResources.getColor(efj.kp);
      a = localResources.getDrawable(efj.qh);
      b = localResources.getDrawable(efj.pJ);
      c = localResources.getDrawable(efj.pw);
      nxh localnxh = new nxh();
      A = localnxh;
      localnxh.b = Float.valueOf(0.0F);
      A.a = Float.valueOf(0.0F);
      A.d = Float.valueOf(1.0F);
      A.c = Float.valueOf(1.0F);
    }
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.O = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public OneProfileHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (I == null)
    {
      I = (ipb)mbb.a(getContext(), ipb.class);
      Resources localResources = getContext().getResources();
      C = localResources.getDimensionPixelSize(efj.nm);
      D = localResources.getDimensionPixelSize(efj.nn);
      E = localResources.getDimensionPixelSize(efj.ns);
      J = localResources.getDimensionPixelSize(efj.nl);
      d = localResources.getColorStateList(efj.jT);
      B = localResources.getDimensionPixelSize(efj.np);
      F = localResources.getDimensionPixelSize(efj.nv);
      G = localResources.getDimensionPixelSize(efj.nu);
      e = localResources.getColor(efj.kp);
      a = localResources.getDrawable(efj.qh);
      b = localResources.getDrawable(efj.pJ);
      c = localResources.getDrawable(efj.pw);
      nxh localnxh = new nxh();
      A = localnxh;
      localnxh.b = Float.valueOf(0.0F);
      A.a = Float.valueOf(0.0F);
      A.d = Float.valueOf(1.0F);
      A.c = Float.valueOf(1.0F);
    }
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.O = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public final void D_()
  {
    if (this.H != null) {
      this.H.setVisibility(8);
    }
    this.H = null;
    this.i.f(0);
    this.i.a(null);
    this.l.D_();
    this.j = null;
    this.h = null;
    this.z.D_();
    if (this.P != null) {
      this.P.a();
    }
  }
  
  public final void a()
  {
    iee localiee = (iee)mbb.a(getContext(), iee.class);
    TabBar localTabBar = this.z;
    int i1 = this.f;
    lwb locallwb = (lwb)localTabBar.c.get(i1);
    Object localObject;
    ied localied;
    if (locallwb != null)
    {
      int i3 = efj.aak;
      if (locallwb.b != null)
      {
        localObject = locallwb.b.getTag(i3);
        localied = (ied)localObject;
        if ((this.H == null) && (localiee.a(localied))) {
          break label103;
        }
      }
    }
    for (;;)
    {
      return;
      localObject = null;
      break;
      localObject = null;
      break;
      label103:
      this.H = new TooltipView(getContext());
      this.H.a(localied);
      this.H.e.add(this);
      this.H.a(1);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      addView(this.H, localLayoutParams);
      TooltipView localTooltipView = this.H;
      efj.e(localTooltipView, "Attempted to register null TooltipView");
      localTooltipView.e.add(localiee);
      int i2;
      if (localTooltipView.getTag(efj.MH) != null) {
        i2 = 1;
      }
      while ((i2 == 0) && (localTooltipView.getTag(efj.MI) == null))
      {
        localTooltipView.setTag(efj.MI, Long.valueOf(localiee.a.a()));
        return;
        lvj locallvj = (lvj)mbb.b(localTooltipView.getContext(), lvj.class);
        if (locallvj != null)
        {
          ief localief = new ief(localiee, localTooltipView);
          locallvj.a.a.add(localief);
          localTooltipView.setTag(efj.MH, localief);
          i2 = 1;
        }
        else
        {
          i2 = 0;
        }
      }
    }
  }
  
  public final void a(View.OnClickListener paramOnClickListener)
  {
    this.i.setOnClickListener(paramOnClickListener);
    CoverPhotoImageView localCoverPhotoImageView = this.i;
    if (paramOnClickListener == null) {}
    for (Drawable localDrawable = null;; localDrawable = getResources().getDrawable(da.aY))
    {
      localCoverPhotoImageView.a(localDrawable);
      return;
    }
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    if (this.H != null)
    {
      this.H.setVisibility(8);
      this.H = null;
    }
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    if (this.H != null)
    {
      removeView(this.H);
      this.H.setVisibility(8);
      this.H = null;
    }
  }
  
  public final void a(String paramString, nxh paramnxh, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (TextUtils.equals(paramString, this.j)) {
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      b();
      return;
    }
    this.j = paramString;
    this.i.b = lym.a;
    this.i.a(paramString, paramnxh, paramInt, paramBoolean1);
    if (paramBoolean2) {}
    for (Object localObject = null;; localObject = this)
    {
      a((View.OnClickListener)localObject);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    OneProfileAvatarView localOneProfileAvatarView = this.l;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 4)
    {
      localOneProfileAvatarView.setVisibility(i1);
      return;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    if (paramBoolean1)
    {
      this.K.setVisibility(0);
      this.L.setText(paramString);
      TextView localTextView = this.M;
      int i1 = 0;
      if (paramBoolean2) {}
      for (;;)
      {
        localTextView.setVisibility(i1);
        return;
        i1 = 8;
      }
    }
    this.K.setVisibility(8);
  }
  
  public final void b()
  {
    if (this.k == null) {
      this.k = "https://lh6.googleusercontent.com/-5vG8ole8nAI/UYFKqb0Y7YI/AAAAAAAABiA/YQzKopOzN1g/w0-h0/default_cover_1_c07bbaef481e775be41b71cecbb5cd60.jpg";
    }
    a(this.k, A, 0, false, true);
  }
  
  public void onClick(View paramView)
  {
    if (this.h == null) {}
    int i1;
    do
    {
      return;
      i1 = paramView.getId();
      if (aaw.cd == i1)
      {
        this.h.M();
        return;
      }
      if (aaw.as == i1)
      {
        this.h.L();
        return;
      }
      if (aaw.cx == i1)
      {
        this.h.P();
        return;
      }
    } while (aaw.br != i1);
    this.h.N();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((CoverPhotoImageView)findViewById(aaw.cd));
    this.i.e(4);
    this.i.E = 2;
    this.l = ((OneProfileAvatarView)findViewById(aaw.as));
    this.m = ((TextView)findViewById(aaw.fv));
    this.n = ((TextView)findViewById(aaw.cH));
    this.o = ((LocalStarRating)findViewById(aaw.kp));
    this.p = ((HorizontalPreferredLinearLayout)findViewById(aaw.cy));
    this.p.c = B;
    this.q = ((TextView)this.p.findViewById(aaw.cv));
    this.r = ((TextView)this.p.findViewById(aaw.cw));
    this.s = ((TextView)this.p.findViewById(aaw.cx));
    this.u = ((TextView)findViewById(aaw.aG));
    this.v = ((CirclesButton)findViewById(aaw.br));
    this.v.b(this.O);
    this.v.setOnClickListener(this);
    this.v.setOnLongClickListener(this);
    this.w = ((TextView)findViewById(aaw.dF));
    this.x = ((TextView)findViewById(aaw.mo));
    this.y = ((ImageView)findViewById(aaw.gB));
    this.z = ((TabBar)findViewById(aaw.kO));
    this.K = findViewById(aaw.fU);
    this.L = ((TextView)findViewById(aaw.fT));
    this.M = ((TextView)findViewById(aaw.fV));
    this.l.a(false);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = paramInt3 - paramInt1;
    int i2;
    View localView1;
    int i8;
    int i9;
    if (this.H != null)
    {
      i2 = this.z.getTop() - this.H.getMeasuredHeight();
      localView1 = this.z.b(this.f);
      if (!this.H.a()) {
        break label252;
      }
      i8 = localView1.getRight();
      View localView2 = this.z.b(0);
      i9 = this.z.getRight() - localView2.getRight();
      if (i9 < 0) {
        i8 += i9;
      }
      if (i1 <= i8 + G) {
        break label245;
      }
    }
    int i7;
    label245:
    for (int i10 = i8 + G;; i10 = i1)
    {
      int i11 = i10 - this.H.getMeasuredWidth();
      if (i11 < 0)
      {
        i10 = 0 + this.H.getMeasuredWidth();
        i11 = 0;
      }
      int i12 = i10 - localView1.getRight() + localView1.getMeasuredWidth() / 2;
      if (i9 < 0) {
        i12 -= i9;
      }
      int i13 = this.H.getMeasuredWidth() - i12;
      i5 = i11;
      i1 = i10;
      i7 = i13;
      this.H.b(i7);
      this.H.layout(i5, i2, i1, i2 + this.H.getMeasuredHeight());
      return;
    }
    label252:
    int i3 = localView1.getLeft();
    int i4 = i3 - G;
    int i5 = 0;
    if (i4 > 0) {
      i5 = i3 - G;
    }
    int i6 = i5 + this.H.getMeasuredWidth();
    if (i6 > i1) {
      i5 = i1 - this.H.getMeasuredWidth();
    }
    for (;;)
    {
      i7 = localView1.getLeft() - i5 + localView1.getMeasuredWidth() / 2;
      break;
      i1 = i6;
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    if ((this.h != null) && (aaw.br == paramView.getId())) {
      return this.h.O();
    }
    return false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    super.onMeasure(paramInt1, paramInt2);
    int i2;
    if (this.i.c > J) {
      if (this.N == i1)
      {
        i2 = 0;
        if (this.H != null) {
          if (F <= getMeasuredWidth()) {
            break label188;
          }
        }
      }
    }
    label188:
    for (int i3 = getMeasuredWidth();; i3 = F)
    {
      this.H.measure(View.MeasureSpec.makeMeasureSpec(i3, -2147483648), 0);
      if (i2 != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)this.l.getLayoutParams();
      localLayoutParams2.addRule(3, aaw.cd);
      localLayoutParams2.setMargins(E, C, E, 0);
      this.N = i1;
      i2 = i1;
      break;
      if (this.N == 2) {
        i1 = 0;
      }
      for (;;)
      {
        i2 = i1;
        break;
        RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.l.getLayoutParams();
        localLayoutParams1.addRule(10);
        localLayoutParams1.setMargins(E, D, E, 0);
        this.N = 2;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.OneProfileHeader
 * JD-Core Version:    0.7.0.1
 */