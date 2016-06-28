package com.google.android.libraries.social.oneprofile.about;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import aw;
import efj;
import java.text.NumberFormat;
import jgc;
import jgd;
import nwj;
import nwt;
import nxl;
import qfz;
import qgf;
import qgh;
import qgi;
import qgx;
import qgy;
import qhc;

public final class OneProfileAboutReviewSummaryView
  extends jgd
  implements View.OnClickListener
{
  public jgc a;
  private OneProfileAboutReviewSummaryHistogramView b;
  private View c;
  private TextView v;
  private LocalStarRating w;
  private TextView x;
  private TextView y;
  
  public OneProfileAboutReviewSummaryView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutReviewSummaryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutReviewSummaryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(nxl paramnxl)
  {
    qgi localqgi = paramnxl.f.b.d;
    qgx localqgx = localqgi.t;
    qgh localqgh = null;
    if (localqgx != null) {
      localqgh = localqgx.a;
    }
    qgy localqgy = localqgi.k;
    Integer localInteger1 = null;
    Integer localInteger2 = null;
    if (localqgy != null)
    {
      qfz localqfz = localqgy.a;
      localInteger1 = null;
      localInteger2 = null;
      if (localqfz != null)
      {
        localInteger2 = localqfz.a;
        localInteger1 = localqfz.b;
      }
    }
    ViewGroup.LayoutParams localLayoutParams;
    if (localqgh != null)
    {
      OneProfileAboutReviewSummaryHistogramView localOneProfileAboutReviewSummaryHistogramView = this.b;
      int k = localqgh.e.intValue();
      int m = localqgh.d.intValue();
      int n = localqgh.c.intValue();
      int i1 = localqgh.b.intValue();
      int i2 = localqgh.a.intValue();
      float f = Math.max(k, Math.max(m, Math.max(n, Math.max(i1, i2))));
      localOneProfileAboutReviewSummaryHistogramView.a[0] = (k / f);
      localOneProfileAboutReviewSummaryHistogramView.a[1] = (m / f);
      localOneProfileAboutReviewSummaryHistogramView.a[2] = (n / f);
      localOneProfileAboutReviewSummaryHistogramView.a[3] = (i1 / f);
      localOneProfileAboutReviewSummaryHistogramView.a[4] = (i2 / f);
      localOneProfileAboutReviewSummaryHistogramView.requestLayout();
      this.b.setVisibility(0);
      if ((localInteger2 == null) || (localInteger1 == null)) {
        break label553;
      }
      TextView localTextView1 = this.v;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Float.valueOf(localInteger2.intValue() / 1000.0F);
      localTextView1.setText(String.format("%.1f", arrayOfObject1));
      this.w.a(localInteger2.intValue());
      NumberFormat localNumberFormat = NumberFormat.getIntegerInstance();
      TextView localTextView2 = this.x;
      Resources localResources = getResources();
      int i = efj.QS;
      int j = localInteger1.intValue();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localNumberFormat.format(localInteger1);
      localTextView2.setText(localResources.getQuantityString(i, j, arrayOfObject2));
      this.x.setVisibility(0);
      this.v.setVisibility(0);
      this.w.setVisibility(0);
      localLayoutParams = this.c.getLayoutParams();
      if (localqgh == null) {
        break label544;
      }
      localLayoutParams.width = -2;
    }
    for (;;)
    {
      qgf localqgf = localqgi.s;
      qhc localqhc1 = null;
      if (localqgf != null)
      {
        qhc localqhc2 = localqgf.a;
        localqhc1 = null;
        if (localqhc2 != null) {
          localqhc1 = localqgf.a;
        }
      }
      if (localqhc1 == null) {
        break label583;
      }
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      efj.a(localSpannableStringBuilder, String.valueOf(localqhc1.a).concat(" – "), new TextAppearanceSpan(getContext(), aau.AA));
      efj.a(localSpannableStringBuilder, "Google", new TextAppearanceSpan(getContext(), aau.AB));
      this.y.setVisibility(0);
      this.y.setText(localSpannableStringBuilder);
      return;
      this.b.setVisibility(8);
      break;
      label544:
      localLayoutParams.width = -1;
      continue;
      label553:
      this.x.setVisibility(8);
      this.v.setVisibility(8);
      this.w.setVisibility(8);
    }
    label583:
    this.y.setVisibility(8);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == aw.aU) {
      this.a.f((String)paramView.getTag());
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((OneProfileAboutReviewSummaryHistogramView)findViewById(aw.bY));
    this.c = findViewById(aw.aR);
    this.v = ((TextView)findViewById(aw.cS));
    this.w = ((LocalStarRating)findViewById(aw.cX));
    this.x = ((TextView)findViewById(aw.bv));
    this.y = ((TextView)findViewById(aw.cY));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutReviewSummaryView
 * JD-Core Version:    0.7.0.1
 */