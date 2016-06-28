package com.google.android.libraries.social.people.ui;

import aau;
import aaw;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.avatargroupview.AvatarGroupView;
import efj;
import ehr;
import java.util.List;
import jgw;
import jjg;
import joo;
import lve;

public final class CircleWithAvatarsViewGroup
  extends ViewGroup
{
  public String a;
  public String b;
  private int c;
  private int d;
  private int e;
  private AvatarGroupView f;
  private joo g;
  private TextView h;
  private TextView i;
  private lve j;
  private int k;
  
  public CircleWithAvatarsViewGroup(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = getResources();
    this.c = localResources.getDimensionPixelSize(efj.SO);
    this.e = localResources.getDimensionPixelSize(efj.SP);
    this.d = localResources.getDimensionPixelSize(efj.SN);
    this.j = new lve(this);
    this.h = new TextView(localContext);
    this.h.setMaxLines(1);
    this.h.setEllipsize(TextUtils.TruncateAt.END);
    this.h.setTextAppearance(localContext, ehr.dn);
    addView(this.h);
    this.i = new TextView(localContext);
    this.i.setMaxLines(1);
    this.i.setEllipsize(TextUtils.TruncateAt.END);
    this.i.setTextAppearance(localContext, ehr.dl);
    addView(this.i);
    this.f = new AvatarGroupView(localContext);
    this.f.setTag("avatar_group_view");
    addView(this.f);
    this.g = new joo(localContext);
    this.g.setTag("circle_icon_view");
    addView(this.g);
    this.k = localResources.getColor(ehr.dg);
  }
  
  public CircleWithAvatarsViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    Resources localResources = getResources();
    this.c = localResources.getDimensionPixelSize(efj.SO);
    this.e = localResources.getDimensionPixelSize(efj.SP);
    this.d = localResources.getDimensionPixelSize(efj.SN);
    this.j = new lve(this);
    this.h = new TextView(localContext);
    this.h.setMaxLines(1);
    this.h.setEllipsize(TextUtils.TruncateAt.END);
    this.h.setTextAppearance(localContext, ehr.dn);
    addView(this.h);
    this.i = new TextView(localContext);
    this.i.setMaxLines(1);
    this.i.setEllipsize(TextUtils.TruncateAt.END);
    this.i.setTextAppearance(localContext, ehr.dl);
    addView(this.i);
    this.f = new AvatarGroupView(localContext);
    this.f.setTag("avatar_group_view");
    addView(this.f);
    this.g = new joo(localContext);
    this.g.setTag("circle_icon_view");
    addView(this.g);
    this.k = localResources.getColor(ehr.dg);
  }
  
  public CircleWithAvatarsViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    Resources localResources = getResources();
    this.c = localResources.getDimensionPixelSize(efj.SO);
    this.e = localResources.getDimensionPixelSize(efj.SP);
    this.d = localResources.getDimensionPixelSize(efj.SN);
    this.j = new lve(this);
    this.h = new TextView(localContext);
    this.h.setMaxLines(1);
    this.h.setEllipsize(TextUtils.TruncateAt.END);
    this.h.setTextAppearance(localContext, ehr.dn);
    addView(this.h);
    this.i = new TextView(localContext);
    this.i.setMaxLines(1);
    this.i.setEllipsize(TextUtils.TruncateAt.END);
    this.i.setTextAppearance(localContext, ehr.dl);
    addView(this.i);
    this.f = new AvatarGroupView(localContext);
    this.f.setTag("avatar_group_view");
    addView(this.f);
    this.g = new joo(localContext);
    this.g.setTag("circle_icon_view");
    addView(this.g);
    this.k = localResources.getColor(ehr.dg);
  }
  
  @TargetApi(21)
  public CircleWithAvatarsViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    Context localContext = getContext();
    Resources localResources = getResources();
    this.c = localResources.getDimensionPixelSize(efj.SO);
    this.e = localResources.getDimensionPixelSize(efj.SP);
    this.d = localResources.getDimensionPixelSize(efj.SN);
    this.j = new lve(this);
    this.h = new TextView(localContext);
    this.h.setMaxLines(1);
    this.h.setEllipsize(TextUtils.TruncateAt.END);
    this.h.setTextAppearance(localContext, ehr.dn);
    addView(this.h);
    this.i = new TextView(localContext);
    this.i.setMaxLines(1);
    this.i.setEllipsize(TextUtils.TruncateAt.END);
    this.i.setTextAppearance(localContext, ehr.dl);
    addView(this.i);
    this.f = new AvatarGroupView(localContext);
    this.f.setTag("avatar_group_view");
    addView(this.f);
    this.g = new joo(localContext);
    this.g.setTag("circle_icon_view");
    addView(this.g);
    this.k = localResources.getColor(ehr.dg);
  }
  
  public final void a(jgw paramjgw, List<jjg> paramList)
  {
    Resources localResources = getResources();
    if (!paramList.isEmpty())
    {
      this.f.removeAllViews();
      int i2 = paramList.size();
      if (i2 == 1) {}
      for (int i3 = 2;; i3 = 1) {
        for (int i4 = 0; i4 < i2; i4++)
        {
          jjg localjjg = (jjg)paramList.get(i4);
          this.f.a(localjjg.c(), localjjg.e(), i3, false, true);
        }
      }
      this.f.setVisibility(0);
      this.g.setVisibility(8);
      this.a = paramjgw.c();
      this.h.setText(this.a);
      int n = paramjgw.f();
      int i1 = efj.Te;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(n);
      String str1 = localResources.getQuantityString(i1, n, arrayOfObject);
      if (paramjgw.h())
      {
        String str2 = String.valueOf(str1);
        String str3 = String.valueOf(localResources.getString(aau.AI));
        str1 = 3 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + " - " + str3;
      }
      this.i.setText(str1);
      this.b = paramjgw.b();
      return;
    }
    int m;
    switch (paramjgw.e())
    {
    case 6: 
    default: 
      m = aaw.pZ;
    }
    for (;;)
    {
      this.g.a(this.k, getResources().getDrawable(m));
      this.f.setVisibility(8);
      this.g.setVisibility(0);
      break;
      m = aaw.pY;
      continue;
      m = aaw.pZ;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.j.a(paramInt1, paramInt2, paramInt3, paramInt4);
    int m = getMeasuredHeight();
    if (this.f.getVisibility() == 0)
    {
      int i5 = (m - this.f.getMeasuredHeight()) / 2;
      this.j.a(this.f, this.e, i5);
    }
    for (;;)
    {
      int i1 = this.i.getMeasuredHeight();
      int i2 = (m - this.h.getMeasuredHeight() - i1) / 2;
      int i3 = this.f.getMeasuredWidth() + 2 * this.e;
      this.j.a(this.h, i3, i2);
      int i4 = m - i1 - i2;
      this.j.a(this.i, i3, i4);
      return;
      int n = (m - this.g.getMeasuredHeight()) / 2;
      this.j.a(this.g, this.e, n);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    this.f.measure(n, n);
    this.g.measure(n, n);
    int i1 = View.MeasureSpec.makeMeasureSpec(m - this.f.getMeasuredWidth() - 3 * this.e, -2147483648);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.h.measure(i1, i2);
    this.i.measure(i1, i2);
    setMeasuredDimension(m, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.ui.CircleWithAvatarsViewGroup
 * JD-Core Version:    0.7.0.1
 */