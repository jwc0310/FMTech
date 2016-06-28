package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import efj;
import eyg;
import jfi;
import jfj;
import jfk;
import jfl;
import jfm;
import jgd;
import lxj;
import nvn;
import nvr;
import nxl;
import nxp;
import nxq;
import nxr;
import nxs;

public final class OneProfileAboutContactInfoView
  extends jgd
  implements lxj
{
  private TextView A;
  private View B;
  private TextView C;
  private ViewGroup D;
  private View E;
  private View F;
  private View G;
  private LayoutInflater H = (LayoutInflater)getContext().getSystemService("layout_inflater");
  public jfm a;
  private View b;
  private View c;
  private TextView v;
  private View w;
  private TextView x;
  private ViewGroup y;
  private View z;
  
  public OneProfileAboutContactInfoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutContactInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutContactInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final OneProfileAboutContactInfoRowView a(int paramInt, ViewGroup paramViewGroup)
  {
    OneProfileAboutContactInfoRowView localOneProfileAboutContactInfoRowView = (OneProfileAboutContactInfoRowView)this.H.inflate(efj.QP, paramViewGroup, false);
    localOneProfileAboutContactInfoRowView.findViewById(aw.br).setVisibility(0);
    jfm localjfm = this.a;
    localOneProfileAboutContactInfoRowView.a = paramInt;
    if (paramInt != 0) {
      localOneProfileAboutContactInfoRowView.b = localjfm;
    }
    paramViewGroup.addView(localOneProfileAboutContactInfoRowView);
    return localOneProfileAboutContactInfoRowView;
  }
  
  private final void a(nvr paramnvr, int paramInt, ViewGroup paramViewGroup)
  {
    jfl localjfl = new jfl(paramnvr, paramInt);
    Object localObject1 = null;
    int i = 0;
    while (localjfl.hasNext())
    {
      Object localObject2 = localjfl.next();
      nxs localnxs;
      int j;
      label112:
      Object localObject3;
      if ((localObject2 instanceof nxs))
      {
        localnxs = (nxs)localObject2;
        OneProfileAboutContactInfoRowView localOneProfileAboutContactInfoRowView4 = a(1000, paramViewGroup);
        if (paramInt == 1) {
          switch (localnxs.d)
          {
          case 3: 
          case 4: 
          case 6: 
          default: 
            j = i;
            localOneProfileAboutContactInfoRowView4.a(localnxs.c);
            localObject3 = localOneProfileAboutContactInfoRowView4;
          }
        }
      }
      for (;;)
      {
        if (j == i) {
          break label568;
        }
        String str = ((OneProfileAboutContactInfoRowView)localObject3).getResources().getString(j);
        ((OneProfileAboutContactInfoRowView)localObject3).c.setText(str);
        i = j;
        localObject1 = localObject3;
        break;
        j = efj.RQ;
        break label112;
        j = efj.RS;
        break label112;
        j = efj.RR;
        break label112;
        j = efj.RT;
        break label112;
        switch (localnxs.d)
        {
        default: 
          j = i;
          break;
        case 3: 
          j = efj.RQ;
          break;
        case 18: 
          j = efj.RS;
          break;
        case 6: 
          j = efj.RR;
          break;
        case 19: 
          j = efj.RT;
          break;
          if ((localObject2 instanceof nxq))
          {
            nxq localnxq = (nxq)localObject2;
            OneProfileAboutContactInfoRowView localOneProfileAboutContactInfoRowView3 = a(1001, paramViewGroup);
            int m = efj.RF;
            localOneProfileAboutContactInfoRowView3.a(localnxq.c);
            localObject3 = localOneProfileAboutContactInfoRowView3;
            j = m;
          }
          else
          {
            if ((localObject2 instanceof nxr))
            {
              nxr localnxr = (nxr)localObject2;
              OneProfileAboutContactInfoRowView localOneProfileAboutContactInfoRowView2 = a(0, paramViewGroup);
              switch (localnxr.d)
              {
              default: 
                j = efj.RG;
              }
              for (;;)
              {
                localOneProfileAboutContactInfoRowView2.a(localnxr.c);
                localObject3 = localOneProfileAboutContactInfoRowView2;
                break;
                j = efj.RH;
                continue;
                j = efj.RI;
                continue;
                j = efj.RJ;
                continue;
                j = efj.RK;
                continue;
                j = efj.RL;
                continue;
                j = efj.RM;
                continue;
                j = efj.RN;
                continue;
                j = efj.RO;
                continue;
                j = efj.RP;
              }
            }
            if ((localObject2 instanceof nxp))
            {
              nxp localnxp = (nxp)localObject2;
              OneProfileAboutContactInfoRowView localOneProfileAboutContactInfoRowView1 = a(1002, paramViewGroup);
              int k = efj.RE;
              localOneProfileAboutContactInfoRowView1.a(localnxp.c);
              localObject3 = localOneProfileAboutContactInfoRowView1;
              j = k;
            }
            else
            {
              localObject3 = localObject1;
              j = i;
            }
          }
          break;
        }
      }
      label568:
      ((OneProfileAboutContactInfoRowView)localObject3).c.setText(null);
      localObject1 = localObject3;
    }
  }
  
  public final void D_()
  {
    int i = 0;
    int j = this.y.getChildCount();
    for (int k = 0; k < j; k++) {
      ((OneProfileAboutContactInfoRowView)this.y.getChildAt(k)).D_();
    }
    this.c.setBackgroundDrawable(null);
    this.c.setOnClickListener(null);
    int m = this.D.getChildCount();
    while (i < m)
    {
      ((OneProfileAboutContactInfoRowView)this.D.getChildAt(i)).D_();
      i++;
    }
    this.z.setBackgroundDrawable(null);
    this.z.setOnClickListener(null);
    this.b.setBackgroundDrawable(null);
    this.b.setOnClickListener(null);
  }
  
  public final void a(nxl paramnxl)
  {
    int i = 1;
    this.y.removeAllViews();
    this.D.removeAllViews();
    if ((paramnxl != null) && (paramnxl.d != null) && (paramnxl.d.c != null))
    {
      a(paramnxl.d.c, i, this.y);
      a(paramnxl.d.c, 2, this.D);
    }
    this.b.setPadding(l, l, l, m);
    int j;
    int k;
    label128:
    int m;
    label152:
    label241:
    int i3;
    label262:
    label272:
    label300:
    int i4;
    if (this.y.getChildCount() > 0)
    {
      j = i;
      if ((j == 0) && (!this.p)) {
        break label596;
      }
      View localView1 = this.c;
      if (!this.q) {
        break label419;
      }
      k = 8;
      localView1.setVisibility(k);
      View localView2 = this.w;
      if (!this.q) {
        break label425;
      }
      m = 8;
      localView2.setVisibility(m);
      if (!this.p) {
        break label490;
      }
      if (!this.q) {
        break label431;
      }
      this.b.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      this.b.setOnClickListener(new jfi(this));
      this.b.setPadding(l, l, l, l);
      this.E.setVisibility(8);
      this.G.setVisibility(0);
      if (j == 0) {
        break label511;
      }
      this.x.setVisibility(8);
      this.y.setVisibility(0);
      if (this.D.getChildCount() <= 0) {
        break label644;
      }
      if ((i == 0) && (!this.p)) {
        break label749;
      }
      View localView3 = this.z;
      if (!this.q) {
        break label649;
      }
      i3 = 8;
      localView3.setVisibility(i3);
      View localView4 = this.B;
      if (!this.q) {
        break label655;
      }
      i4 = 8;
      label324:
      localView4.setVisibility(i4);
      if ((!this.p) || (this.q)) {
        break label661;
      }
      this.z.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      a(this.z);
      this.z.setOnClickListener(new jfk(this));
      this.F.setVisibility(0);
    }
    for (;;)
    {
      if (i == 0) {
        break label673;
      }
      this.C.setVisibility(8);
      this.D.setVisibility(0);
      return;
      j = 0;
      break;
      label419:
      k = 0;
      break label128;
      label425:
      m = 0;
      break label152;
      label431:
      this.c.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      a(this.c);
      this.c.setOnClickListener(new jfj(this));
      this.E.setVisibility(0);
      this.G.setVisibility(8);
      break label241;
      label490:
      this.E.setVisibility(8);
      this.G.setVisibility(8);
      break label241;
      label511:
      TextView localTextView1 = this.x;
      if (this.q) {}
      for (int n = efj.Rn;; n = efj.Rm)
      {
        localTextView1.setText(n);
        this.x.setVisibility(0);
        TextView localTextView2 = this.x;
        int i1 = jgd.f;
        int i2 = jgd.j;
        localTextView2.setTextSize(0, i1);
        localTextView2.setTextColor(i2);
        this.y.setVisibility(8);
        break;
      }
      label596:
      this.c.setVisibility(8);
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      this.y.setVisibility(8);
      this.G.setVisibility(8);
      break label262;
      label644:
      i = 0;
      break label272;
      label649:
      i3 = 0;
      break label300;
      label655:
      i4 = 0;
      break label324;
      label661:
      this.F.setVisibility(8);
    }
    label673:
    if (!this.q)
    {
      this.C.setVisibility(0);
      TextView localTextView3 = this.C;
      int i5 = jgd.f;
      int i6 = jgd.j;
      localTextView3.setTextSize(0, i5);
      localTextView3.setTextColor(i6);
      this.D.setVisibility(8);
      return;
    }
    this.C.setVisibility(8);
    this.D.setVisibility(8);
    return;
    label749:
    this.z.setVisibility(8);
    this.B.setVisibility(8);
    this.C.setVisibility(8);
    this.D.setVisibility(8);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = findViewById(aw.dd);
    this.c = findViewById(aw.cb);
    this.v = ((TextView)findViewById(aw.ca));
    a(this.v, jgd.g, true);
    this.w = findViewById(aw.bZ);
    this.x = ((TextView)findViewById(aw.cc));
    this.y = ((ViewGroup)findViewById(aw.cd));
    this.z = findViewById(aw.dn);
    this.A = ((TextView)findViewById(aw.dm));
    a(this.A, jgd.g, true);
    this.B = findViewById(aw.dl);
    this.C = ((TextView)findViewById(aw.do));
    this.D = ((ViewGroup)findViewById(aw.dp));
    this.E = findViewById(aw.bE);
    this.F = findViewById(aw.bP);
    this.G = findViewById(aw.bF);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutContactInfoView
 * JD-Core Version:    0.7.0.1
 */