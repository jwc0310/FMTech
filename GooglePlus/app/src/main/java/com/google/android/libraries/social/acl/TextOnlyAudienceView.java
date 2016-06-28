package com.google.android.libraries.social.acl;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import aw;
import efj;
import gnb;
import gnf;
import gnw;
import hhk;
import hps;
import java.util.ArrayList;
import jgs;
import jjd;
import lhp;
import mbb;

public final class TextOnlyAudienceView
  extends gnf
{
  public ImageView a;
  public ViewGroup b;
  public View i;
  public boolean j = false;
  private ImageView k;
  private TextView l;
  private boolean m = false;
  private boolean n = false;
  private float o = 3.4028235E+38F;
  private float p = 3.4028235E+38F;
  private int q = 2147483647;
  private float r = 3.4028235E+38F;
  private float s = 3.4028235E+38F;
  private float t = 3.4028235E+38F;
  private float u = 3.4028235E+38F;
  private float v = 3.4028235E+38F;
  private float w = 3.4028235E+38F;
  
  public TextOnlyAudienceView(Context paramContext)
  {
    this(paramContext, null);
    b();
  }
  
  public TextOnlyAudienceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    a(paramAttributeSet);
    b();
  }
  
  public TextOnlyAudienceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, false);
    a(paramAttributeSet);
    b();
  }
  
  public TextOnlyAudienceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt, paramBoolean);
    a(paramAttributeSet);
    b();
  }
  
  private final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, gnw.a);
    this.j = localTypedArray.getBoolean(gnw.c, false);
    this.m = localTypedArray.getBoolean(gnw.d, false);
    this.n = localTypedArray.getBoolean(gnw.b, false);
    this.p = localTypedArray.getDimension(gnw.n, 3.4028235E+38F);
    this.q = localTypedArray.getColor(gnw.m, 2147483647);
    this.r = localTypedArray.getDimension(gnw.k, 3.4028235E+38F);
    this.s = localTypedArray.getDimension(gnw.l, 3.4028235E+38F);
    this.t = localTypedArray.getDimension(gnw.h, 3.4028235E+38F);
    this.u = localTypedArray.getDimension(gnw.i, 3.4028235E+38F);
    this.v = localTypedArray.getDimension(gnw.j, 3.4028235E+38F);
    this.w = localTypedArray.getDimension(gnw.g, 3.4028235E+38F);
    this.o = localTypedArray.getDimension(gnw.f, 3.4028235E+38F);
    if (this.b.getChildCount() == 0) {
      LayoutInflater.from(getContext()).inflate(localTypedArray.getResourceId(gnw.e, efj.DI), this.b);
    }
    localTypedArray.recycle();
  }
  
  protected final void a()
  {
    int i1 = efj.DK;
    addView(LayoutInflater.from(getContext()).inflate(i1, this, false));
    this.l = ((TextView)findViewById(aau.xF));
    this.k = ((ImageView)findViewById(aau.xG));
    this.a = ((ImageView)findViewById(aau.xH));
    this.b = ((ViewGroup)findViewById(aau.xE));
    this.i = findViewById(aau.xK);
  }
  
  protected final void a(int paramInt) {}
  
  protected final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, Object paramObject, boolean paramBoolean) {}
  
  protected final void b()
  {
    int i1 = this.c.size();
    Resources localResources = getResources();
    String str1 = localResources.getString(aw.ao);
    String str2 = localResources.getString(17039374);
    String str3 = localResources.getString(aw.ar);
    String str4 = localResources.getString(aw.at);
    StringBuilder localStringBuilder = new StringBuilder();
    int i12;
    int i13;
    int i14;
    label160:
    int i15;
    label184:
    float f5;
    int i20;
    label272:
    float f6;
    int i22;
    label304:
    float f1;
    int i16;
    label413:
    float f2;
    int i17;
    label436:
    float f3;
    int i18;
    label459:
    float f4;
    int i19;
    label482:
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    gnb localgnb;
    jgs localjgs;
    int i37;
    int i39;
    int i40;
    int i41;
    int i42;
    int i38;
    if (i1 == 0)
    {
      i12 = 0;
      i13 = 8;
      String str5 = localStringBuilder.toString();
      this.l.setText(str5);
      this.l.invalidate();
      setContentDescription(localResources.getString(aw.ak, new Object[] { str5 }));
      ImageView localImageView1 = this.k;
      if (this.j) {
        i13 = 8;
      }
      localImageView1.setVisibility(i13);
      this.b.setVisibility(i12);
      View localView = this.i;
      if (this.m)
      {
        i14 = 8;
        localView.setVisibility(i14);
        ImageView localImageView2 = this.a;
        if (!this.n) {
          break label1326;
        }
        i15 = 8;
        localImageView2.setVisibility(i15);
        if (this.p != 3.4028235E+38F) {
          this.l.setTextSize(0, this.p);
        }
        if (this.q != 2147483647) {
          this.l.setTextColor(this.q);
        }
        if (this.r != 3.4028235E+38F)
        {
          TextView localTextView = this.l;
          f5 = this.r;
          i20 = this.l.getPaddingLeft();
          if (f5 != 3.4028235E+38F) {
            break label1332;
          }
          int i21 = this.l.getPaddingTop();
          f6 = this.s;
          i22 = this.l.getPaddingRight();
          if (f6 != 3.4028235E+38F) {
            break label1340;
          }
          localTextView.setPadding(i20, i21, i22, this.l.getPaddingBottom());
        }
        if (this.o != 3.4028235E+38F) {
          this.k.setMinimumWidth((int)this.o);
        }
        if ((this.t != 3.4028235E+38F) || (this.u != 3.4028235E+38F) || (this.v != 3.4028235E+38F) || (this.w != 3.4028235E+38F))
        {
          ImageView localImageView3 = this.k;
          f1 = this.t;
          i16 = this.k.getPaddingLeft();
          if (f1 != 3.4028235E+38F) {
            break label1348;
          }
          f2 = this.v;
          i17 = this.k.getPaddingTop();
          if (f2 != 3.4028235E+38F) {
            break label1356;
          }
          f3 = this.u;
          i18 = this.k.getPaddingRight();
          if (f3 != 3.4028235E+38F) {
            break label1364;
          }
          f4 = this.w;
          i19 = this.k.getPaddingBottom();
          if (f4 != 3.4028235E+38F) {
            break label1372;
          }
          localImageView3.setPadding(i16, i17, i18, i19);
        }
        if (this.f != null) {
          this.f.run();
        }
      }
    }
    else
    {
      i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      i9 = 0;
      i10 = 0;
      if (i10 < i1)
      {
        localgnb = (gnb)this.c.get(i10);
        if (localgnb.c.length == 1)
        {
          localjgs = localgnb.c[0];
          i37 = localjgs.c;
          if (i37 == 9)
          {
            int i45 = i9;
            i39 = i8;
            i40 = i7;
            i41 = i3;
            i42 = 1;
            i38 = i45;
          }
        }
      }
    }
    for (;;)
    {
      label615:
      String str8 = localjgs.b;
      label630:
      int i27;
      Object localObject;
      int i24;
      int i23;
      int i26;
      int i25;
      if (!TextUtils.isEmpty(str8))
      {
        i27 = i4;
        int i43 = i38;
        localObject = str8;
        i24 = i5;
        i23 = i42;
        i26 = i6;
        i25 = i41;
        i7 = i40;
        i8 = i39;
        i9 = i43;
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        int i28 = i1 - 1;
        if (i10 < i28) {
          localStringBuilder.append(str1);
        }
        i10++;
        i4 = i27;
        int i29 = i24;
        i2 = i23;
        i5 = i29;
        int i30 = i25;
        i6 = i26;
        i3 = i30;
        break;
        if (i37 == 8)
        {
          i42 = i2;
          int i44 = i8;
          i40 = i7;
          i41 = 1;
          i38 = i9;
          i39 = i44;
          break label615;
        }
        if (i37 == 7)
        {
          i41 = i3;
          i42 = i2;
          i38 = i9;
          i39 = i8;
          i40 = 1;
          break label615;
        }
        if (i37 == 5)
        {
          i40 = i7;
          i41 = i3;
          i42 = i2;
          i38 = i9;
          i39 = 1;
          break label615;
        }
        if (i37 != 101) {
          break label1380;
        }
        i38 = 1;
        i39 = i8;
        i40 = i7;
        i41 = i3;
        i42 = i2;
        break label615;
        str8 = str3;
        break label630;
        if (localgnb.b.length == 1)
        {
          jjd localjjd = localgnb.b[0];
          localObject = localjjd.b;
          String str7 = localjjd.c;
          if (!TextUtils.isEmpty((CharSequence)localObject)) {}
          for (;;)
          {
            i27 = i4;
            int i35 = i5;
            i23 = i2;
            i24 = i35;
            int i36 = i3;
            i26 = i6;
            i25 = i36;
            break;
            if (!TextUtils.isEmpty(str7)) {
              localObject = str7;
            } else {
              localObject = str2;
            }
          }
        }
        if (localgnb.d.length == 1)
        {
          lhp locallhp = localgnb.d[0];
          localObject = locallhp.b;
          String str6 = locallhp.d;
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            localObject = str4;
          }
          i27 = 1;
          if (TextUtils.isEmpty(str6))
          {
            int i33 = i6;
            i25 = i3;
            i26 = i33;
            int i34 = i5;
            i23 = i2;
            i24 = i34;
          }
          else
          {
            localObject = localResources.getString(aw.as, new Object[] { localObject, str6 });
            int i31 = i6;
            i25 = i3;
            i26 = i31;
            int i32 = i5;
            i23 = i2;
            i24 = i32;
          }
        }
        else
        {
          if (localgnb.e.length != 1) {
            break label1167;
          }
          hps localhps = localgnb.e[0];
          localObject = localhps.b;
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            localObject = ((hhk)mbb.a(getContext(), hhk.class)).a();
          }
          boolean bool = localhps.c;
          i23 = i2;
          i24 = 1;
          i25 = i3;
          i26 = bool;
          i27 = i4;
        }
      }
      label1167:
      throw new IllegalArgumentException();
      int i11;
      if (this.h) {
        i11 = efj.DC;
      }
      for (;;)
      {
        this.k.setImageResource(i11);
        i12 = 8;
        i13 = 0;
        break;
        if (i2 != 0) {}
        for (i11 = efj.DG;; i11 = efj.DF)
        {
          if (i4 == 0) {
            break label1237;
          }
          i11 = efj.DB;
          break;
        }
        label1237:
        if (i5 != 0)
        {
          if (i6 != 0) {
            i11 = efj.DC;
          } else {
            i11 = efj.DD;
          }
        }
        else if (i1 == 1) {
          if (i3 != 0) {
            i11 = efj.DC;
          } else if (i7 != 0) {
            i11 = efj.Dz;
          } else if (i8 != 0) {
            i11 = efj.DA;
          } else if (i9 != 0) {
            i11 = efj.DE;
          }
        }
      }
      i14 = 0;
      break label160;
      label1326:
      i15 = 0;
      break label184;
      label1332:
      i20 = (int)f5;
      break label272;
      label1340:
      i22 = (int)f6;
      break label304;
      label1348:
      i16 = (int)f1;
      break label413;
      label1356:
      i17 = (int)f2;
      break label436;
      label1364:
      i18 = (int)f3;
      break label459;
      label1372:
      i19 = (int)f4;
      break label482;
      label1380:
      i38 = i9;
      i39 = i8;
      i40 = i7;
      i41 = i3;
      i42 = i2;
    }
  }
  
  protected final int d()
  {
    return 0;
  }
  
  protected final void e() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl.TextOnlyAudienceView
 * JD-Core Version:    0.7.0.1
 */