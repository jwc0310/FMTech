package com.google.android.apps.photos.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import arh;
import atq;
import atu;
import bfr;
import bfs;
import bfu;
import bfv;
import bfw;
import bfx;
import efj;
import hba;
import hbh;
import jeo;
import jer;
import jrf;
import mbb;

public class CollectionListHeaderView
  extends LinearLayout
{
  public bfx a;
  public arh b;
  public atq c;
  private final atu d = (atu)mbb.a(getContext(), atu.class);
  private final jer<atu> e = new bfr(this);
  private final hbh f = (hbh)mbb.a(getContext(), hbh.class);
  private final jer<hbh> g = new bfs(this);
  
  public CollectionListHeaderView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CollectionListHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CollectionListHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    int i = 1;
    ImageView localImageView1 = (ImageView)findViewById(aaw.jO);
    ImageView localImageView2 = (ImageView)findViewById(aaw.jr);
    ImageView localImageView3 = (ImageView)findViewById(aaw.ar);
    int j = this.d.b;
    if (this.b == null) {}
    label106:
    label119:
    do
    {
      return;
      boolean bool1 = jrf.m(this.b.c);
      boolean bool2 = "PLUS_EVENT".equals(jrf.g(this.b.c));
      int n;
      String str1;
      int i1;
      if (((0x200 & this.b.h) != 0L) && (!bool2))
      {
        int k = i;
        if (this.b.l == null) {
          break label343;
        }
        n = i;
        if (j == i) {
          break label392;
        }
        if ((j != 0) || ((n == 0) && (k == 0)) || (bool1)) {
          break label349;
        }
        localImageView1.setOnClickListener(new bfu(this, k));
        localImageView1.setVisibility(0);
        localImageView2.setVisibility(8);
        if (!bool1) {
          break label405;
        }
        str1 = jrf.j(this.b.c);
        if ((j == 0) || (j == 5)) {
          break label407;
        }
        i1 = i;
        boolean bool3 = ((hba)mbb.a(getContext(), hba.class)).c();
        if ((i1 != 0) || (!bool3)) {
          break label452;
        }
        String str2 = (String)localImageView3.getTag(aaw.kU);
        if ((str2 != null) && (str2.equals(str1))) {
          break label413;
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          TextView localTextView = (TextView)findViewById(aaw.ak);
          localTextView.clearAnimation();
          localTextView.setVisibility(8);
        }
        localImageView3.setVisibility(0);
        localImageView3.setTag(aaw.kU, str1);
        localImageView3.setOnClickListener(new bfw(this, str1));
        if (!jrf.l(this.b.c)) {
          break label418;
        }
        localImageView3.setImageResource(efj.os);
        return;
        int m = 0;
        break label106;
        n = 0;
        break label119;
        if (((j == 2) || (j == 4)) && (n != 0))
        {
          localImageView2.setOnClickListener(new bfv(this));
          localImageView2.setVisibility(0);
          localImageView1.setVisibility(8);
          break label170;
        }
        localImageView2.setVisibility(8);
        localImageView1.setVisibility(8);
        break label170;
        break;
        i1 = 0;
        break label201;
        i = 0;
      }
      if (!this.f.a(str1)) {
        break;
      }
    } while (i == 0);
    label170:
    label201:
    label343:
    label349:
    localImageView3.setImageResource(efj.os);
    label392:
    label405:
    label407:
    label413:
    label418:
    return;
    localImageView3.setImageResource(efj.or);
    return;
    label452:
    localImageView3.setVisibility(8);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.d.a.a(this.e, true);
    this.f.a.a(this.g, true);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.d.a.a(this.e);
    this.f.a.a(this.g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.views.CollectionListHeaderView
 * JD-Core Version:    0.7.0.1
 */