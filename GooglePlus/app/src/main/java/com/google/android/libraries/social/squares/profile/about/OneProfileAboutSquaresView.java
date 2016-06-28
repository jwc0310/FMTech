package com.google.android.libraries.social.squares.profile.about;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import az;
import com.google.android.libraries.social.squares.list.SquareListItemView;
import da;
import efj;
import gxn;
import gxq;
import gxs;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import jgd;
import lfr;
import lgn;
import mbb;
import nxl;
import ofk;
import pjo;

public final class OneProfileAboutSquaresView
  extends jgd
  implements gxs
{
  public ViewGroup a;
  public TextView b;
  public gxq c;
  private final ArrayList<SquareListItemView> v = new ArrayList(3);
  private final NumberFormat w = NumberFormat.getIntegerInstance();
  
  public OneProfileAboutSquaresView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutSquaresView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutSquaresView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    Iterator localIterator = this.v.iterator();
    while (localIterator.hasNext()) {
      ((SquareListItemView)localIterator.next()).D_();
    }
  }
  
  public final void a(nxl paramnxl) {}
  
  public final void a(ofk paramofk)
  {
    this.t.setVisibility(0);
    this.a.removeAllViews();
    this.b.setVisibility(8);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    lfr locallfr = (lfr)mbb.a(getContext(), lfr.class);
    for (int i = 0; (i < 3) && (i < paramofk.a.length); i++)
    {
      SquareListItemView localSquareListItemView = (SquareListItemView)localLayoutInflater.inflate(aau.CB, this.a, false);
      localSquareListItemView.setBackgroundColor(0);
      localSquareListItemView.a(paramofk.a[i]);
      if (localSquareListItemView.c != null) {
        locallfr.a(localSquareListItemView.c);
      }
      localSquareListItemView.setPadding(0, 0, 0, 0);
      localSquareListItemView.findViewById(aau.Cu).setPadding(l, m, l, m);
      View localView = localSquareListItemView.findViewById(aau.Cw);
      if (localView != null)
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
        localLayoutParams.leftMargin = l;
        localLayoutParams.rightMargin = l;
      }
      a((TextView)localSquareListItemView.findViewById(aau.Cy), jgd.g, true);
      this.a.addView(localSquareListItemView);
      this.v.add(localSquareListItemView);
      if (i < -1 + paramofk.a.length) {
        localLayoutInflater.inflate(aau.Cz, this.a).setPadding(0, n, 0, n);
      }
    }
    if (paramofk.a.length > 3)
    {
      int k = paramofk.a.length;
      ViewGroup localViewGroup = this.a;
      TextView localTextView = new TextView(getContext());
      b(localTextView);
      int m = efj.Yi;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.w.format(k);
      localTextView.setText(getContext().getResources().getString(m, arrayOfObject));
      localTextView.setTextColor(getContext().getResources().getColor(az.Q));
      localTextView.setIncludeFontPadding(false);
      localTextView.setPadding(n, 0, n, 0);
      if (Build.VERSION.SDK_INT >= 17) {
        localTextView.setTextAlignment(5);
      }
      localTextView.setBackgroundDrawable(getResources().getDrawable(da.aY));
      efj.a(localTextView, new gxq(pjo.aT));
      localTextView.setOnClickListener(new gxn(new lgn(this)));
      localTextView.setPadding(l, l, l, l);
      localViewGroup.addView(localTextView);
    }
    for (int j = 0;; j = m)
    {
      this.a.setPadding(0, 0, 0, j);
      this.c = new gxq(pjo.n);
      return;
    }
  }
  
  protected final int b()
  {
    return 17;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ViewGroup)findViewById(aau.Ct));
    this.b = ((TextView)findViewById(aau.Cx));
    c(this.b);
  }
  
  public final gxq v()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.profile.about.OneProfileAboutSquaresView
 * JD-Core Version:    0.7.0.1
 */