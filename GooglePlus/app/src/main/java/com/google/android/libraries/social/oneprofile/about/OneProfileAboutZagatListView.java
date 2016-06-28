package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import aw;
import efj;
import ehr;
import eyg;
import jgd;
import jgi;
import jgj;
import jgk;
import nwj;
import nwt;
import nxl;
import qgi;
import qgm;
import qgn;
import qgv;
import qgw;
import qhg;
import qhh;

public final class OneProfileAboutZagatListView
  extends jgd
{
  private static int b;
  private static int c;
  private LinearLayout A;
  public jgk a;
  private LinearLayout v;
  private LinearLayout w;
  private FrameLayout x;
  private TextView y;
  private View z;
  
  public OneProfileAboutZagatListView(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getContext().getResources();
    b = localResources.getColor(ehr.db);
    c = localResources.getColor(ehr.cY);
  }
  
  public OneProfileAboutZagatListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getContext().getResources();
    b = localResources.getColor(ehr.db);
    c = localResources.getColor(ehr.cY);
  }
  
  public OneProfileAboutZagatListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getContext().getResources();
    b = localResources.getColor(ehr.db);
    c = localResources.getColor(ehr.cY);
  }
  
  public final void a(nxl paramnxl)
  {
    this.w.removeAllViews();
    this.A.removeAllViews();
    qhh localqhh = efj.e(paramnxl);
    label251:
    qgv[] arrayOfqgv;
    int j;
    int k;
    if (localqhh != null)
    {
      qhg[] arrayOfqhg = localqhh.a;
      int i2 = arrayOfqhg.length;
      int i3 = 0;
      int i4 = 1;
      if (i3 < i2)
      {
        qhg localqhg = arrayOfqhg[i3];
        TextView localTextView2 = new TextView(getContext());
        localTextView2.setText(localqhg.a);
        localTextView2.setTextColor(b);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i4 != 0) {
          localLayoutParams.setMargins(0, 0, m, 0);
        }
        for (;;)
        {
          localTextView2.setLayoutParams(localLayoutParams);
          TextView localTextView3 = new TextView(getContext());
          localTextView3.setText(localqhg.b);
          if (i4 != 0) {
            localTextView3.setTextColor(c);
          }
          this.w.addView(localTextView2);
          this.w.addView(localTextView3);
          i3++;
          i4 = 0;
          break;
          localLayoutParams.setMargins(l, 0, m, 0);
        }
      }
      this.x.setOnClickListener(new jgi(this));
      this.v.setVisibility(0);
      String str1 = efj.f(paramnxl);
      if (TextUtils.isEmpty(str1)) {
        break label479;
      }
      this.y.setText(str1);
      this.y.setVisibility(0);
      qgw localqgw = paramnxl.f.b.d.r;
      if (localqgw == null) {
        break label507;
      }
      arrayOfqgv = localqgw.a;
      j = arrayOfqgv.length;
      k = 0;
    }
    int i1;
    for (int i = 0;; i = i1)
    {
      if (k >= j) {
        break label510;
      }
      qgn[] arrayOfqgn = arrayOfqgv[k].a;
      int m = arrayOfqgn.length;
      int n = 0;
      i1 = i;
      label318:
      if (n < m)
      {
        qgn localqgn = arrayOfqgn[n];
        TextView localTextView1 = new TextView(getContext());
        localTextView1.setText(localqgn.a.b);
        localTextView1.setTextColor(k);
        localTextView1.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        localTextView1.setPadding(0, m, 0, m);
        localTextView1.setSingleLine(true);
        localTextView1.setEllipsize(TextUtils.TruncateAt.END);
        if (localqgn.a != null) {}
        for (String str2 = localqgn.a.a;; str2 = null)
        {
          if (!TextUtils.isEmpty(str2)) {
            localTextView1.setOnClickListener(new jgj(this, str2));
          }
          this.A.addView(localTextView1);
          n++;
          i1 = 1;
          break label318;
          this.v.setVisibility(8);
          break;
          label479:
          this.y.setVisibility(8);
          break label251;
        }
      }
      k++;
    }
    label507:
    i = 0;
    label510:
    if (i != 0)
    {
      this.A.setVisibility(0);
      this.z.setVisibility(0);
      return;
    }
    this.A.setVisibility(8);
    this.z.setVisibility(8);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.v = ((LinearLayout)findViewById(aw.dv));
    this.w = ((LinearLayout)this.v.findViewById(aw.du));
    this.x = ((FrameLayout)this.v.findViewById(aw.dq));
    this.y = ((TextView)findViewById(aw.dt));
    this.z = findViewById(aw.ds);
    this.A = ((LinearLayout)findViewById(aw.dr));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutZagatListView
 * JD-Core Version:    0.7.0.1
 */