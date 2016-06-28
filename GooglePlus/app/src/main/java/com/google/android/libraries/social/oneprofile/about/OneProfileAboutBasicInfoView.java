package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import efj;
import eyg;
import jfd;
import jfe;
import jff;
import jfg;
import jgd;
import nvg;
import nwb;
import nwr;
import nws;
import nxb;
import nxc;
import nxd;
import nxl;
import nxv;

public final class OneProfileAboutBasicInfoView
  extends jgd
{
  private View A;
  private ViewGroup B;
  private TextView C;
  private TextView D;
  private ViewGroup E;
  private TextView F;
  private TextView G;
  private View H;
  private ViewGroup I;
  private TextView J;
  private TextView K;
  private View L;
  public TextView a;
  public boolean b;
  private ViewGroup c;
  private TextView v;
  private View w;
  private ViewGroup x;
  private TextView y;
  private TextView z;
  
  public OneProfileAboutBasicInfoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutBasicInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutBasicInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(nwr[] paramArrayOfnwr)
  {
    int i;
    int j;
    if ((paramArrayOfnwr != null) && (paramArrayOfnwr.length > 0))
    {
      i = 1;
      if ((!this.p) && (i == 0)) {
        break label161;
      }
      j = 1;
      label24:
      if (j == 0) {
        break label305;
      }
      this.I.setVisibility(0);
      if (!this.p) {
        break label166;
      }
      this.I.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      a(this.I);
      this.I.setOnClickListener(new jfg(this));
      this.L.setVisibility(0);
    }
    label161:
    label166:
    for (;;)
    {
      label90:
      if (i != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        int k = paramArrayOfnwr.length;
        int m = 0;
        for (;;)
        {
          if (m < k)
          {
            nwr localnwr = paramArrayOfnwr[m];
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(", ");
            }
            localStringBuilder.append(localnwr.a);
            m++;
            continue;
            i = 0;
            break;
            j = 0;
            break label24;
            this.L.setVisibility(8);
            break label90;
          }
        }
        this.K.setText(localStringBuilder);
        a(this.J, jgd.g, true);
        TextView localTextView1 = this.K;
        int n = jgd.f;
        int i1 = jgd.i;
        localTextView1.setTextSize(0, n);
        localTextView1.setTextColor(i1);
        return;
      }
    }
    TextView localTextView2 = this.K;
    int i2 = efj.Rb;
    localTextView2.setText(getContext().getResources().getString(i2));
    a(this.J, jgd.j, true);
    TextView localTextView3 = this.K;
    int i3 = jgd.f;
    int i4 = jgd.j;
    localTextView3.setTextSize(0, i3);
    localTextView3.setTextColor(i4);
    return;
    label305:
    this.I.setVisibility(8);
  }
  
  public final void D_()
  {
    super.D_();
    this.c.setOnClickListener(null);
    this.c.setBackgroundDrawable(null);
    this.x.setOnClickListener(null);
    this.x.setBackgroundDrawable(null);
    this.E.setOnClickListener(null);
    this.E.setBackgroundDrawable(null);
    this.I.setOnClickListener(null);
    this.I.setBackgroundDrawable(null);
  }
  
  public final void a(nxl paramnxl)
  {
    this.b = false;
    nwb localnwb2;
    nxb[] arrayOfnxb2;
    String str4;
    label64:
    int i35;
    label83:
    nwr[] arrayOfnwr;
    String str1;
    nwb localnwb1;
    int i;
    nxb[] arrayOfnxb1;
    if (paramnxl != null)
    {
      nxv localnxv = paramnxl.e;
      if (localnxv != null)
      {
        localnwb2 = localnxv.e;
        nxc localnxc = localnxv.m;
        if (localnxc != null)
        {
          arrayOfnxb2 = localnxc.b;
          if (localnxv.j != null)
          {
            str4 = localnxv.j.a;
            nxd localnxd = localnxv.l;
            if (localnxd != null)
            {
              i35 = localnxd.b;
              nws localnws = localnxv.b;
              if (localnws != null)
              {
                arrayOfnwr = localnws.b;
                str1 = str4;
                localnwb1 = localnwb2;
                i = i35;
                arrayOfnxb1 = arrayOfnxb2;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      Object localObject2;
      int i28;
      label178:
      int i29;
      label193:
      boolean bool;
      label260:
      label283:
      label342:
      StringBuilder localStringBuilder;
      int k;
      label362:
      String str3;
      if (localnwb1 != null) {
        if (TextUtils.isEmpty(localnwb1.c)) {
          switch (localnwb1.b)
          {
          default: 
            localObject2 = null;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              i28 = 1;
              if ((!this.p) && (i28 == 0)) {
                break label528;
              }
              i29 = 1;
              if (i29 == 0) {
                break label552;
              }
              this.c.setVisibility(0);
              if (!this.p) {
                break label534;
              }
              this.c.setBackgroundDrawable(getResources().getDrawable(eyg.as));
              a(this.c);
              this.c.setOnClickListener(new jfd(this));
              this.w.setVisibility(0);
              if ((!TextUtils.isEmpty(localnwb1.c)) || (localnwb1.b != 3)) {
                break label546;
              }
              bool = true;
              this.b = bool;
              this.a.setText((CharSequence)localObject2);
              a(this.v, jgd.g, true);
              TextView localTextView8 = this.a;
              int i30 = jgd.f;
              int i31 = jgd.i;
              localTextView8.setTextSize(0, i30);
              localTextView8.setTextColor(i31);
              if (arrayOfnxb1 == null) {
                break label1101;
              }
              localStringBuilder = new StringBuilder();
              int j = arrayOfnxb1.length;
              k = 0;
              if (k >= j) {
                break label652;
              }
              switch (arrayOfnxb1[k].a)
              {
              default: 
                str3 = null;
              }
            }
            break;
          }
        }
      }
      for (;;)
      {
        if (str3 != null)
        {
          if (localStringBuilder.length() > 0) {
            localStringBuilder.append(", ");
          }
          localStringBuilder.append(str3);
        }
        k++;
        break label362;
        int i34 = efj.QU;
        localObject2 = getContext().getResources().getString(i34);
        break;
        int i33 = efj.QT;
        localObject2 = getContext().getResources().getString(i33);
        break;
        int i32 = efj.QV;
        localObject2 = getContext().getResources().getString(i32);
        break;
        localObject2 = localnwb1.c;
        break;
        i28 = 0;
        break label178;
        label528:
        i29 = 0;
        break label193;
        label534:
        this.w.setVisibility(8);
        break label260;
        label546:
        bool = false;
        break label283;
        label552:
        this.c.setVisibility(8);
        break label342;
        int i27 = efj.QY;
        str3 = getContext().getResources().getString(i27);
        continue;
        int i26 = efj.QW;
        str3 = getContext().getResources().getString(i26);
        continue;
        int i25 = efj.Ra;
        str3 = getContext().getResources().getString(i25);
        continue;
        int i24 = efj.QZ;
        str3 = getContext().getResources().getString(i24);
      }
      label652:
      String str2 = localStringBuilder.toString();
      int m;
      label670:
      int n;
      label685:
      label752:
      label887:
      Object localObject1;
      label810:
      label944:
      int i2;
      label955:
      int i3;
      if (!TextUtils.isEmpty(str2))
      {
        m = 1;
        if ((!this.p) && (m == 0)) {
          break label1113;
        }
        n = 1;
        if (n == 0) {
          break label1206;
        }
        this.x.setVisibility(0);
        if (!this.p) {
          break label1119;
        }
        this.x.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        a(this.x);
        this.x.setOnClickListener(new jfe(this));
        this.A.setVisibility(0);
        if (m == 0) {
          break label1131;
        }
        this.z.setText(str2);
        a(this.y, jgd.g, true);
        TextView localTextView7 = this.z;
        int i22 = jgd.f;
        int i23 = jgd.i;
        localTextView7.setTextSize(0, i22);
        localTextView7.setTextColor(i23);
        if (TextUtils.isEmpty(str1)) {
          break label1218;
        }
        this.B.setVisibility(0);
        a(this.C, jgd.g, true);
        this.D.setVisibility(0);
        this.D.setText(str1);
        TextView localTextView4 = this.D;
        int i17 = jgd.f;
        int i18 = jgd.i;
        localTextView4.setTextSize(0, i17);
        localTextView4.setTextColor(i18);
        localObject1 = null;
        switch (i)
        {
        default: 
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            i2 = 1;
            if ((!this.p) && (i2 == 0)) {
              break label1434;
            }
            i3 = 1;
            label970:
            if (i3 == 0) {
              break label1527;
            }
            this.E.setVisibility(0);
            if (!this.p) {
              break label1440;
            }
            this.E.setBackgroundDrawable(getResources().getDrawable(eyg.as));
            a(this.E);
            this.E.setOnClickListener(new jff(this));
            this.H.setVisibility(0);
            label1037:
            if (i2 == 0) {
              break label1452;
            }
            this.G.setText((CharSequence)localObject1);
            a(this.F, jgd.g, true);
            TextView localTextView3 = this.G;
            int i7 = jgd.f;
            int i8 = jgd.i;
            localTextView3.setTextSize(0, i7);
            localTextView3.setTextColor(i8);
          }
          break;
        }
      }
      for (;;)
      {
        a(arrayOfnwr);
        return;
        label1101:
        str2 = null;
        break;
        m = 0;
        break label670;
        label1113:
        n = 0;
        break label685;
        label1119:
        this.A.setVisibility(8);
        break label752;
        label1131:
        TextView localTextView5 = this.z;
        int i19 = efj.QX;
        localTextView5.setText(getContext().getResources().getString(i19));
        a(this.y, jgd.j, true);
        TextView localTextView6 = this.z;
        int i20 = jgd.f;
        int i21 = jgd.j;
        localTextView6.setTextSize(0, i20);
        localTextView6.setTextColor(i21);
        break label810;
        label1206:
        this.x.setVisibility(8);
        break label810;
        label1218:
        this.B.setVisibility(8);
        break label887;
        int i16 = efj.Rk;
        localObject1 = getContext().getResources().getString(i16);
        break label944;
        int i15 = efj.Rh;
        localObject1 = getContext().getResources().getString(i15);
        break label944;
        int i14 = efj.Rg;
        localObject1 = getContext().getResources().getString(i14);
        break label944;
        int i13 = efj.Ri;
        localObject1 = getContext().getResources().getString(i13);
        break label944;
        int i12 = efj.Rd;
        localObject1 = getContext().getResources().getString(i12);
        break label944;
        int i11 = efj.Rj;
        localObject1 = getContext().getResources().getString(i11);
        break label944;
        int i10 = efj.Rl;
        localObject1 = getContext().getResources().getString(i10);
        break label944;
        int i9 = efj.Rf;
        localObject1 = getContext().getResources().getString(i9);
        break label944;
        int i1 = efj.Rc;
        localObject1 = getContext().getResources().getString(i1);
        break label944;
        i2 = 0;
        break label955;
        label1434:
        i3 = 0;
        break label970;
        label1440:
        this.H.setVisibility(8);
        break label1037;
        label1452:
        TextView localTextView1 = this.G;
        int i4 = efj.Re;
        localTextView1.setText(getContext().getResources().getString(i4));
        a(this.F, jgd.j, true);
        TextView localTextView2 = this.G;
        int i5 = jgd.f;
        int i6 = jgd.j;
        localTextView2.setTextSize(0, i5);
        localTextView2.setTextColor(i6);
        continue;
        label1527:
        this.E.setVisibility(8);
      }
      str1 = str4;
      localnwb1 = localnwb2;
      i = i35;
      arrayOfnxb1 = arrayOfnxb2;
      arrayOfnwr = null;
      continue;
      i35 = 0;
      break label83;
      str4 = null;
      break label64;
      arrayOfnxb2 = null;
      break;
      arrayOfnxb1 = null;
      arrayOfnwr = null;
      i = 0;
      str1 = null;
      localnwb1 = null;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ViewGroup)findViewById(aw.bX));
    this.v = ((TextView)findViewById(aw.bW));
    this.a = ((TextView)findViewById(aw.bV));
    this.w = findViewById(aw.bD);
    this.x = ((ViewGroup)findViewById(aw.cr));
    this.y = ((TextView)findViewById(aw.cq));
    this.z = ((TextView)findViewById(aw.cp));
    this.A = findViewById(aw.bH);
    this.B = ((ViewGroup)findViewById(aw.bi));
    this.C = ((TextView)findViewById(aw.bh));
    this.D = ((TextView)findViewById(aw.bg));
    this.E = ((ViewGroup)findViewById(aw.cP));
    this.F = ((TextView)findViewById(aw.cO));
    this.G = ((TextView)findViewById(aw.cN));
    this.H = findViewById(aw.bL);
    this.I = ((ViewGroup)findViewById(aw.cG));
    this.J = ((TextView)findViewById(aw.cF));
    this.K = ((TextView)findViewById(aw.cE));
    this.L = findViewById(aw.bK);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutBasicInfoView
 * JD-Core Version:    0.7.0.1
 */