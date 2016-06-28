package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw;
import efj;
import eyg;
import jgd;
import jgf;
import jgg;
import jgh;
import nvl;
import nvt;
import nvz;
import nwa;
import nxl;
import nxn;
import nxv;

public final class OneProfileAboutWorkView
  extends jgd
{
  private ViewGroup A;
  private View B;
  private TextView C;
  private View D;
  private ViewGroup E;
  private ViewGroup a;
  private View b;
  private TextView c;
  private TextView v;
  private ViewGroup w;
  private View x;
  private TextView y;
  private TextView z;
  
  public OneProfileAboutWorkView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutWorkView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutWorkView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    super.D_();
    this.a.setOnClickListener(null);
    this.a.setBackgroundDrawable(null);
    this.w.setOnClickListener(null);
    this.w.setBackgroundDrawable(null);
    this.A.setOnClickListener(null);
    this.A.setBackgroundDrawable(null);
  }
  
  public final void a(nxl paramnxl)
  {
    String str3;
    String str1;
    label50:
    String str2;
    nvz[] arrayOfnvz1;
    if (paramnxl != null)
    {
      nxv localnxv = paramnxl.e;
      if (localnxv != null) {
        if (localnxv.f != null)
        {
          str3 = localnxv.f.b;
          if (localnxv.o != null)
          {
            str1 = localnxv.o.b;
            if (localnxv.g != null)
            {
              nvz[] arrayOfnvz2 = localnxv.g.b;
              str2 = str3;
              arrayOfnvz1 = arrayOfnvz2;
            }
          }
        }
      }
    }
    for (;;)
    {
      int i;
      int j;
      label101:
      int k;
      label168:
      label202:
      label210:
      int m;
      label220:
      int n;
      label235:
      int i1;
      label302:
      label335:
      label364:
      int i2;
      label393:
      int i3;
      label417:
      label478:
      int i5;
      boolean bool1;
      label510:
      nvz localnvz;
      Context localContext;
      LinearLayout localLinearLayout;
      Integer localInteger3;
      label652:
      Integer localInteger1;
      label681:
      Integer localInteger2;
      boolean bool2;
      if (!TextUtils.isEmpty(str2))
      {
        i = 1;
        if ((!this.p) && (i == 0)) {
          break label921;
        }
        j = 1;
        if (j == 0) {
          break label990;
        }
        this.a.setVisibility(0);
        if (!this.p) {
          break label927;
        }
        this.a.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        a(this.a);
        this.a.setOnClickListener(new jgf(this));
        this.b.setVisibility(0);
        if (i == 0) {
          break label939;
        }
        this.v.setText(str2);
        a(this.c, jgd.g, true);
        b(this.v);
        if (j != 0) {
          break label1002;
        }
        k = 1;
        if (TextUtils.isEmpty(str1)) {
          break label1008;
        }
        m = 1;
        if ((!this.p) && (m == 0)) {
          break label1014;
        }
        n = 1;
        if (n == 0) {
          break label1083;
        }
        this.w.setVisibility(0);
        if (!this.p) {
          break label1020;
        }
        this.w.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        a(this.w);
        this.w.setOnClickListener(new jgg(this));
        this.x.setVisibility(0);
        if (m == 0) {
          break label1032;
        }
        this.z.setText(str1);
        a(this.y, jgd.g, true);
        b(this.z);
        if ((k != 0) && (m == 0)) {}
        this.E.removeAllViews();
        if ((arrayOfnvz1 == null) || (arrayOfnvz1.length <= 0)) {
          break label1095;
        }
        i1 = 1;
        if ((i1 == 0) && (!this.p)) {
          break label1183;
        }
        ViewGroup localViewGroup = this.A;
        if (!this.q) {
          break label1101;
        }
        i2 = 8;
        localViewGroup.setVisibility(i2);
        View localView = this.D;
        if (!this.q) {
          break label1107;
        }
        i3 = 8;
        localView.setVisibility(i3);
        if (!this.p) {
          break label1113;
        }
        this.A.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        a(this.A);
        this.A.setOnClickListener(new jgh(this));
        this.B.setVisibility(0);
        if (i1 == 0) {
          break label1157;
        }
        this.C.setVisibility(8);
        this.E.setVisibility(0);
        int i4 = arrayOfnvz1.length;
        i5 = 0;
        bool1 = true;
        if (i5 >= i4) {
          break label1182;
        }
        localnvz = arrayOfnvz1[i5];
        localContext = getContext();
        localLinearLayout = new LinearLayout(localContext);
        localLinearLayout.setFocusable(true);
        localLinearLayout.setOrientation(1);
        this.E.addView(localLinearLayout);
        if (!TextUtils.isEmpty(localnvz.a))
        {
          TextView localTextView1 = new TextView(localContext);
          localTextView1.setText(localnvz.a);
          a(localTextView1, jgd.g, bool1);
          localLinearLayout.addView(localTextView1);
        }
        nvt localnvt = localnvz.c;
        if (localnvt == null) {
          break label1233;
        }
        if ((localnvt.a == null) || (localnvt.a.a == null)) {
          break label1227;
        }
        localInteger3 = localnvt.a.a;
        if ((localnvt.b == null) || (localnvt.b.a == null)) {
          break label1221;
        }
        localInteger1 = localnvt.b.a;
        if (localnvt.c == null) {
          break label1211;
        }
        boolean bool3 = localnvt.c.booleanValue();
        localInteger2 = localInteger3;
        bool2 = bool3;
      }
      for (;;)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        if (localInteger2 != null) {
          localStringBuilder1.append(localInteger2);
        }
        if (bool2)
        {
          if (localStringBuilder1.length() > 0) {
            localStringBuilder1.append(" - ");
          }
          localStringBuilder1.append(o);
        }
        for (;;)
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          if (localnvz.b != null) {
            localStringBuilder2.append(localnvz.b);
          }
          if (localStringBuilder1.length() > 0)
          {
            if (localStringBuilder2.length() > 0) {
              localStringBuilder2.append(", ");
            }
            localStringBuilder2.append(localStringBuilder1);
          }
          if (localStringBuilder2.length() > 0)
          {
            TextView localTextView2 = new TextView(localContext);
            localTextView2.setText(localStringBuilder2.toString());
            a(localTextView2);
            localLinearLayout.addView(localTextView2);
          }
          if (!TextUtils.isEmpty(localnvz.d))
          {
            TextView localTextView3 = new TextView(localContext);
            localTextView3.setText(localnvz.d);
            b(localTextView3);
            localLinearLayout.addView(localTextView3);
          }
          i5++;
          bool1 = false;
          break label510;
          i = 0;
          break;
          label921:
          j = 0;
          break label101;
          label927:
          this.b.setVisibility(8);
          break label168;
          label939:
          TextView localTextView5 = this.v;
          int i7 = efj.RB;
          localTextView5.setText(getContext().getResources().getString(i7));
          a(this.c, jgd.j, true);
          c(this.v);
          break label202;
          label990:
          this.a.setVisibility(8);
          break label202;
          label1002:
          k = 0;
          break label210;
          label1008:
          m = 0;
          break label220;
          label1014:
          n = 0;
          break label235;
          label1020:
          this.x.setVisibility(8);
          break label302;
          label1032:
          TextView localTextView4 = this.z;
          int i6 = efj.RC;
          localTextView4.setText(getContext().getResources().getString(i6));
          a(this.y, jgd.j, true);
          c(this.z);
          break label335;
          label1083:
          this.w.setVisibility(8);
          break label335;
          label1095:
          i1 = 0;
          break label364;
          label1101:
          i2 = 0;
          break label393;
          label1107:
          i3 = 0;
          break label417;
          label1113:
          this.B.setVisibility(8);
          break label478;
          if (localInteger1 != null)
          {
            if (localStringBuilder1.length() > 0) {
              localStringBuilder1.append(" - ");
            }
            localStringBuilder1.append(localInteger1);
          }
        }
        label1157:
        this.C.setVisibility(0);
        c(this.C);
        this.E.setVisibility(8);
        label1182:
        return;
        label1183:
        this.A.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        return;
        label1211:
        localInteger2 = localInteger3;
        bool2 = false;
        continue;
        label1221:
        localInteger1 = null;
        break label681;
        label1227:
        localInteger3 = null;
        break label652;
        label1233:
        bool2 = false;
        localInteger1 = null;
        localInteger2 = null;
      }
      str2 = str3;
      arrayOfnvz1 = null;
      continue;
      str1 = null;
      break label50;
      str3 = null;
      break;
      arrayOfnvz1 = null;
      str1 = null;
      str2 = null;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ViewGroup)findViewById(aw.bJ));
    this.b = findViewById(aw.bI);
    this.c = ((TextView)findViewById(aw.cz));
    this.v = ((TextView)findViewById(aw.cy));
    this.w = ((ViewGroup)findViewById(aw.bN));
    this.x = findViewById(aw.bM);
    this.y = ((TextView)findViewById(aw.cV));
    this.z = ((TextView)findViewById(aw.cU));
    this.A = ((ViewGroup)findViewById(aw.bC));
    this.B = findViewById(aw.bB);
    this.C = ((TextView)findViewById(aw.bS));
    this.D = findViewById(aw.bR);
    this.E = ((ViewGroup)findViewById(aw.bQ));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutWorkView
 * JD-Core Version:    0.7.0.1
 */