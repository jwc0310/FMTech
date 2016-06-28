package com.google.android.apps.plus.views;

import aau;
import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bot;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.tabbar.TabBar;
import djw;
import dzw;
import dzx;
import dzy;
import dzz;
import eaa;
import efj;
import hdo;
import ipf;
import ipm;
import java.util.ArrayList;
import lxj;
import mbb;

public class UnifiedSearchHeader
  extends LinearLayout
  implements lxj
{
  public static int a;
  public static int b;
  public static Drawable c;
  public LinearLayout d;
  public View e;
  public LinearLayout f;
  public View g;
  public LinearLayout h;
  public TabBar i;
  public djw j;
  public SpannableStringBuilder k;
  public ArrayList<String> l;
  public ArrayList<String> m;
  public ArrayList<String> n;
  public int o;
  public int p;
  public int q;
  private View r;
  private TextView s;
  private View t;
  private View u;
  private View v;
  private View w;
  private Runnable x;
  private bot y;
  
  public UnifiedSearchHeader(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    if (a == 0)
    {
      a = localResources.getDimensionPixelSize(efj.ok);
      b = localResources.getDimensionPixelSize(efj.oj);
      c = localResources.getDrawable(efj.rx);
    }
    this.x = new dzw(this);
    this.y = ((bot)mbb.a(localContext, bot.class));
  }
  
  public UnifiedSearchHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    if (a == 0)
    {
      a = localResources.getDimensionPixelSize(efj.ok);
      b = localResources.getDimensionPixelSize(efj.oj);
      c = localResources.getDrawable(efj.rx);
    }
    this.x = new dzw(this);
    this.y = ((bot)mbb.a(localContext, bot.class));
  }
  
  public UnifiedSearchHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    if (a == 0)
    {
      a = localResources.getDimensionPixelSize(efj.ok);
      b = localResources.getDimensionPixelSize(efj.oj);
      c = localResources.getDrawable(efj.rx);
    }
    this.x = new dzw(this);
    this.y = ((bot)mbb.a(localContext, bot.class));
  }
  
  private final void d()
  {
    int i1 = 1;
    int i2;
    int i3;
    label26:
    int i4;
    label39:
    label49:
    int i5;
    label75:
    int i6;
    label104:
    View localView3;
    int i7;
    if (this.r.getVisibility() == 0)
    {
      i2 = i1;
      if (this.u.getVisibility() != 0) {
        break label142;
      }
      i3 = i1;
      if (this.e.getVisibility() != 0) {
        break label147;
      }
      i4 = i1;
      if (this.g.getVisibility() != 0) {
        break label153;
      }
      View localView1 = this.t;
      if ((i2 == 0) || ((i3 == 0) && (i4 == 0) && (i1 == 0))) {
        break label158;
      }
      i5 = 0;
      localView1.setVisibility(i5);
      View localView2 = this.v;
      if ((i3 == 0) || ((i4 == 0) && (i1 == 0))) {
        break label165;
      }
      i6 = 0;
      localView2.setVisibility(i6);
      localView3 = this.w;
      if (i4 == 0) {
        break label172;
      }
      i7 = 0;
      if (i1 == 0) {
        break label172;
      }
    }
    for (;;)
    {
      localView3.setVisibility(i7);
      return;
      i2 = 0;
      break;
      label142:
      i3 = 0;
      break label26;
      label147:
      i4 = 0;
      break label39;
      label153:
      i1 = 0;
      break label49;
      label158:
      i5 = 8;
      break label75;
      label165:
      i6 = 8;
      break label104;
      label172:
      i7 = 8;
    }
  }
  
  public final void D_()
  {
    int i1 = 0;
    int i2 = this.d.getChildCount();
    for (int i3 = 0; i3 < i2; i3++) {
      ((AvatarView)this.d.getChildAt(i3)).a(null, null);
    }
    int i4 = this.f.getChildCount();
    for (int i5 = 0; i5 < i4; i5++) {
      ((MediaView)this.f.getChildAt(i5)).a(null);
    }
    int i6 = this.h.getChildCount();
    while (i1 < i6)
    {
      ((MediaView)this.h.getChildAt(i1)).a(null);
      i1++;
    }
  }
  
  public final void a(ArrayList<String> paramArrayList)
  {
    this.m = paramArrayList;
    a(this.m, this.e, this.f);
  }
  
  public final void a(ArrayList<String> paramArrayList, View paramView, LinearLayout paramLinearLayout)
  {
    int i1;
    if (paramArrayList == null)
    {
      i1 = 0;
      if (i1 != 0) {
        break label124;
      }
      paramView.setVisibility(8);
    }
    int i2;
    int i3;
    int i4;
    for (;;)
    {
      i2 = paramLinearLayout.getChildCount();
      if (Log.isLoggable("UnifiedSearchHeader", 3)) {
        new StringBuilder(74).append("bindAvatarsToMediaView(): availableCount=").append(i1).append("; maxCount=").append(i2);
      }
      i3 = i2 - Math.min(i2, i1);
      for (i4 = 0; i4 < i3; i4++)
      {
        MediaView localMediaView2 = (MediaView)paramLinearLayout.getChildAt(i4);
        localMediaView2.a(null);
        localMediaView2.setVisibility(8);
      }
      i1 = paramArrayList.size();
      break;
      label124:
      paramView.setVisibility(0);
    }
    for (;;)
    {
      if (i5 < i2)
      {
        MediaView localMediaView1 = (MediaView)paramLinearLayout.getChildAt(i5);
        String str = (String)paramArrayList.get(i5 - i3);
        if (TextUtils.isEmpty(str)) {
          localMediaView1.a(null);
        }
        for (;;)
        {
          localMediaView1.setVisibility(0);
          i5++;
          break;
          localMediaView1.a(ipf.a(getContext(), str, ipm.a));
        }
      }
      d();
      return;
      int i5 = i4;
    }
  }
  
  public final void b()
  {
    this.s.setText(this.k);
    if (TextUtils.isEmpty(this.k))
    {
      this.r.setVisibility(8);
      this.s.setVisibility(8);
    }
    for (;;)
    {
      d();
      return;
      this.r.setVisibility(0);
      this.s.setVisibility(0);
      this.s.setMovementMethod(LinkMovementMethod.getInstance());
    }
  }
  
  public final void b(ArrayList<String> paramArrayList)
  {
    this.n = paramArrayList;
    a(this.n, this.g, this.h);
  }
  
  public final void c()
  {
    int i1;
    if (this.l == null)
    {
      i1 = 0;
      if (i1 != 0) {
        break label129;
      }
      this.u.setVisibility(8);
    }
    int i2;
    int i3;
    int i4;
    for (;;)
    {
      i2 = this.d.getChildCount();
      if (Log.isLoggable("UnifiedSearchHeader", 3)) {
        new StringBuilder(62).append("bindPeople(): availableCount=").append(i1).append("; maxCount=").append(i2);
      }
      i3 = i2 - Math.min(i2, i1);
      for (i4 = 0; i4 < i3; i4++)
      {
        AvatarView localAvatarView2 = (AvatarView)this.d.getChildAt(i4);
        localAvatarView2.a(null, null);
        localAvatarView2.setVisibility(8);
      }
      i1 = this.l.size();
      break;
      label129:
      this.u.setVisibility(0);
    }
    for (;;)
    {
      int i5;
      if (i5 < i2)
      {
        AvatarView localAvatarView1 = (AvatarView)this.d.getChildAt(i5);
        localAvatarView1.a(null, hdo.b((String)this.l.get(i5 - i3)));
        localAvatarView1.setVisibility(0);
        i5++;
      }
      else
      {
        d();
        return;
        i5 = i4;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.r = findViewById(aaw.gJ);
    this.s = ((TextView)findViewById(aaw.gK));
    this.t = findViewById(aaw.cE);
    this.u = findViewById(aaw.he);
    this.d = ((LinearLayout)findViewById(aaw.hd));
    this.v = findViewById(aaw.cF);
    this.e = findViewById(aaw.bz);
    ((TextView)this.e.findViewById(aaw.ba)).setText(this.y.f());
    this.f = ((LinearLayout)findViewById(aaw.by));
    this.w = findViewById(aaw.cG);
    this.g = findViewById(aaw.bF);
    this.h = ((LinearLayout)findViewById(aaw.bE));
    this.i = ((TabBar)findViewById(aaw.kO));
    this.i.b = new dzx(this);
    this.u.setOnClickListener(new dzy(this));
    this.e.setOnClickListener(new dzz(this));
    this.g.setOnClickListener(new eaa(this));
    Resources localResources = getResources();
    this.i.a(efj.tR, localResources.getString(aau.sO).toUpperCase(), 0, null, null);
    this.i.a(efj.tR, localResources.getString(aau.sR).toUpperCase(), 1, null, null);
    this.i.a(0);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.o = (1 + (this.d.getMeasuredWidth() - a) / (a + b));
    this.p = (1 + (this.f.getMeasuredWidth() - a) / (a + b));
    this.q = (1 + (this.h.getMeasuredWidth() - a) / (a + b));
    if ((this.o != this.d.getChildCount()) || (this.p != this.f.getChildCount()) || (this.q != this.h.getChildCount()))
    {
      Runnable localRunnable = this.x;
      efj.m().post(localRunnable);
      if (Log.isLoggable("UnifiedSearchHeader", 3))
      {
        String str = String.valueOf("onMeasure(): layout update requested; mMaxPeopleAvatarCount=");
        int i1 = this.o;
        int i2 = this.p;
        int i3 = this.q;
        new StringBuilder(89 + String.valueOf(str).length()).append(str).append(i1).append("; mMaxCollexionAvatarCount=").append(i2).append("; mMaxCommunitiesAvatarCount=").append(i3);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.UnifiedSearchHeader
 * JD-Core Version:    0.7.0.1
 */