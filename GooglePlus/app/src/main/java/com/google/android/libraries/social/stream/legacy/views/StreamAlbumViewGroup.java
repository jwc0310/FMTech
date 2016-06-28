package com.google.android.libraries.social.stream.legacy.views;

import aau;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.BaseAdapter;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import da;
import do;
import efj;
import gik;
import git;
import gxt;
import hed;
import heh;
import hei;
import heo;
import hwn;
import ieb;
import ied;
import iee;
import iek;
import ipf;
import ipm;
import ipn;
import iqe;
import iqp;
import iqs;
import ixf;
import java.util.List;
import llt;
import llx;
import lma;
import loi;
import loj;
import lpe;
import lpf;
import lpg;
import lph;
import lwo;
import lxj;
import lxl;
import mbb;
import mfx;
import mfz;
import pkh;
import qgd;
import qgm;
import qgo;
import qgp;
import qhe;

public final class StreamAlbumViewGroup
  extends ViewGroup
  implements View.OnClickListener, iek, iqp, loi, lxj, lxl
{
  private int A;
  private Animator.AnimatorListener B;
  public final loj a;
  public llt b;
  public qgo[] c;
  public llx d;
  public hwn e;
  public int f;
  public int g;
  public final View h;
  public final BaseAdapter i;
  public ipf[] j;
  public int[] k;
  public int l;
  public int m;
  public boolean n = false;
  public boolean o = false;
  public boolean p = false;
  public String q;
  public boolean r;
  public boolean s = false;
  public gik t;
  public MediaView u;
  public TooltipView v;
  private lma w;
  private lpe x;
  private RecyclingViewGroup y;
  private int z;
  
  public StreamAlbumViewGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StreamAlbumViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StreamAlbumViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = loj.a(paramContext);
    this.z = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        this.B = new lpf(this);
      }
      this.i = new lpg(this);
      this.y = new RecyclingViewGroup(paramContext);
      lwo.g(this.y);
      RecyclingViewGroup localRecyclingViewGroup1 = this.y;
      localRecyclingViewGroup1.b = this;
      localRecyclingViewGroup1.b(0);
      this.y.a(0);
      this.y.h = true;
      this.y.setBackgroundResource(da.an);
      RecyclingViewGroup localRecyclingViewGroup2 = this.y;
      lph locallph = new lph(this);
      localRecyclingViewGroup2.c.a = locallph;
      this.h = new View(paramContext);
      this.h.setBackgroundResource(da.aY);
      this.h.setOnClickListener(this);
      this.x = new lpe(paramContext);
      return;
    }
  }
  
  public static String a(String paramString1, String paramString2)
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      efj.a(localStringBuilder, new CharSequence[] { paramString1 });
      efj.a(localStringBuilder, new CharSequence[] { paramString2 });
      return mfx.b(localStringBuilder);
    }
  }
  
  private final boolean c()
  {
    int i1 = this.y.getChildCount();
    boolean bool = false;
    if (i1 > 0)
    {
      int i2 = this.y.e;
      bool = false;
      if (i2 == 0)
      {
        int i3 = this.y.getChildAt(0).getLeft();
        bool = false;
        if (i3 == 0) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  public final void D_()
  {
    removeAllViews();
    this.b = null;
    this.d = null;
    this.e = null;
    this.w = null;
    this.f = 0;
    this.o = false;
    this.p = false;
    this.s = false;
    lwo.h(this.x);
    this.x.D_();
    this.y.a(null, 0, 0);
    this.y.a(0);
    this.y.setBackgroundResource(da.an);
    this.j = null;
    this.k = null;
    this.c = null;
    this.l = 0;
    this.m = 0;
    if (this.u != null)
    {
      this.u.D_();
      this.u = null;
    }
    this.v = null;
    this.A = 0;
    this.n = false;
    this.t = null;
  }
  
  @TargetApi(16)
  public final void a(int paramInt)
  {
    boolean bool1 = true;
    if ((this.m == paramInt) || (this.b == null)) {
      return;
    }
    this.m = paramInt;
    if (Build.VERSION.SDK_INT >= 14) {}
    for (boolean bool2 = bool1;; bool2 = false) {
      switch (this.m)
      {
      default: 
        return;
      case 0: 
        this.x.setVisibility(0);
        this.h.setVisibility(0);
        this.h.setClickable(bool1);
        return;
      }
    }
    boolean bool3;
    if (bool2) {
      if (this.x.getAlpha() < 0.999F)
      {
        this.x.setVisibility(0);
        lwo.h(this.x);
        ViewPropertyAnimator localViewPropertyAnimator2 = this.x.animate();
        localViewPropertyAnimator2.setInterpolator(this.a.c).alpha(1.0F).setDuration(150L).setListener(this.B);
        if (Build.VERSION.SDK_INT < 16) {
          break label215;
        }
        bool3 = bool1;
        if (bool3) {
          localViewPropertyAnimator2.withLayer();
        }
        localViewPropertyAnimator2.start();
      }
    }
    for (;;)
    {
      this.h.setVisibility(0);
      this.h.setClickable(bool1);
      return;
      label215:
      bool3 = false;
      break;
      this.m = 0;
      this.x.setVisibility(0);
    }
    this.x.setVisibility(4);
    for (;;)
    {
      this.h.setVisibility(4);
      this.h.setClickable(false);
      return;
      if (bool2)
      {
        if (this.x.getAlpha() > 0.001F)
        {
          lwo.h(this.x);
          this.x.setVisibility(0);
          ViewPropertyAnimator localViewPropertyAnimator1 = this.x.animate();
          localViewPropertyAnimator1.setInterpolator(this.a.c).alpha(0.0F).setDuration(150L).setListener(this.B);
          if (Build.VERSION.SDK_INT >= 16) {}
          for (;;)
          {
            if (bool1) {
              localViewPropertyAnimator1.withLayer();
            }
            localViewPropertyAnimator1.start();
            break;
            bool1 = false;
          }
        }
      }
      else
      {
        this.m = 2;
        this.x.setVisibility(4);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.j = new ipf[this.f];
    this.k = new int[this.f];
    if (this.f > 1) {
      paramInt1 = (int)(0.9F * paramInt1);
    }
    int i15;
    Uri localUri3;
    if (this.d != null)
    {
      ipf[] arrayOfipf2 = this.j;
      Context localContext2 = getContext();
      String str7 = this.d.f;
      long l2 = this.d.h;
      String str8 = this.d.e;
      if (this.d.m == ipm.b)
      {
        i15 = 1;
        if (i15 == 0) {
          break label848;
        }
        localUri3 = Uri.parse(this.d.a());
        label116:
        arrayOfipf2[0] = ipf.a(localContext2, str7, l2, str8, localUri3, this.d.m);
        if (this.d.m != ipm.d) {
          break label1729;
        }
      }
    }
    label406:
    label670:
    label1076:
    label1729:
    for (int i16 = 1;; i16 = 0)
    {
      this.k[0] = paramInt1;
      int i17 = this.d.i;
      int i18 = this.d.j;
      int i5;
      label217:
      lpe locallpe;
      StringBuilder localStringBuilder;
      String str3;
      label494:
      boolean bool;
      label583:
      String str1;
      if ((i17 == 0) || (i18 == 0))
      {
        this.l = paramInt1;
        this.y.a((paramInt1 - this.k[0]) / 2);
        i5 = i16;
        removeView(this.y);
        this.y.a(this.i, 0, 0);
        addView(this.y);
        removeView(this.x);
        removeView(this.h);
        if ((this.b == null) && ((this.d == null) || (TextUtils.isEmpty(this.d.a)))) {
          break label1677;
        }
        if (this.b == null) {
          break label1660;
        }
        addView(this.h);
        this.h.setContentDescription(a(this.b.e, getResources().getString(do.aZ)));
        locallpe = this.x;
        llt localllt = this.b;
        locallpe.a = localllt.e;
        int i8 = localllt.b;
        Resources localResources = locallpe.getResources();
        mfz localmfz = (mfz)mfx.a.get();
        localmfz.b = (1 + localmfz.b);
        if (localmfz.b != 1) {
          break label1635;
        }
        localStringBuilder = localmfz.a;
        if (i8 > 1)
        {
          int i9 = aau.Dg;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i8);
          localStringBuilder.append(localResources.getQuantityString(i9, i8, arrayOfObject)).append(" - ");
        }
        localStringBuilder.append(localResources.getString(do.aZ));
        str3 = mfx.b(localStringBuilder);
        if (!TextUtils.isEmpty(locallpe.a)) {
          break label1650;
        }
        locallpe.a = str3;
        this.x.a(false);
        addView(this.x);
        this.m = 0;
        iqe localiqe = (iqe)mbb.a(getContext(), iqe.class);
        int i6 = ((ixf)mbb.a(getContext(), ixf.class)).l();
        if ((!localiqe.a.getBoolean("com.google.android.libraries.social.media.settings.MediaSettings.low_bandwidth_key", false)) && (i6 != -1) && (i6 != -2)) {
          break label1688;
        }
        bool = true;
        this.s = bool;
        if ((this.s) && (i5 != 0))
        {
          iee localiee = (iee)mbb.a(getContext(), iee.class);
          int i7 = ((git)mbb.a(getContext(), git.class)).c();
          gxt localgxt = pkh.f;
          if (!localiqe.a.getBoolean("com.google.android.libraries.social.media.settings.MediaSettings.low_bandwidth_key", false)) {
            break label1694;
          }
          str1 = getResources().getString(do.Y);
          ied localied = new ied(i7, localgxt, str1, getResources().getString(do.aw), 3);
          Uri localUri1 = ((ieb)mbb.a(getContext(), ieb.class)).a("conservebandwidth");
          String str2 = getResources().getString(do.au);
          Intent localIntent = new Intent("android.intent.action.VIEW", localUri1);
          localied.f = str2;
          localied.g = localIntent;
          if (localiee.a(localied))
          {
            this.v = new TooltipView(getContext());
            this.v.a(localied);
            this.v.e.add(this);
            this.v.a(0);
            localiee.c(this.v);
            this.v.setVisibility(8);
            addView(this.v);
          }
        }
        return;
        i15 = 0;
        break;
        label848:
        localUri3 = null;
        break label116;
      }
      float f5 = 1.0F * i18 / i17;
      int i19 = (int)(f5 * paramInt1);
      if (i19 > paramInt2) {
        this.k[0] = ((int)(paramInt2 / f5));
      }
      for (;;)
      {
        this.l = paramInt2;
        break;
        if (this.c != null)
        {
          int i12 = 0;
          int i13 = this.f;
          i5 = 0;
          if (i12 >= i13) {
            break label217;
          }
          qgo localqgo = this.c[i12];
          qhe localqhe = localqgo.a;
          qgp[] arrayOfqgp = localqgo.b;
          String str6 = null;
          if (arrayOfqgp != null)
          {
            int i14 = localqgo.b.length;
            str6 = null;
            if (i14 != 0) {
              str6 = localqgo.b[0].a;
            }
          }
          this.j[i12] = ipf.a(getContext(), localqhe.b.c, efj.D(localqhe.a), str6, null, ipm.a);
          if (this.f == 1) {
            this.k[i12] = paramInt1;
          }
          for (this.l = paramInt1;; this.l = paramInt2)
          {
            i12++;
            break;
            this.k[i12] = paramInt2;
          }
        }
        int[] arrayOfInt1 = new int[this.f];
        int i1 = 0;
        int i2 = 0;
        int i10;
        label1250:
        Uri localUri2;
        if (i2 < this.f)
        {
          llx localllx = this.b.f[i2];
          ipm localipm = localllx.m;
          this.k[i2] = localllx.i;
          arrayOfInt1[i2] = localllx.j;
          float f4 = 1.0F * arrayOfInt1[i2] / this.k[i2];
          if (((f4 >= 0.5F) && (this.k[i2] > paramInt1)) || (this.f == 1) || (localipm == ipm.c)) {
            this.k[i2] = paramInt1;
          }
          arrayOfInt1[i2] = ((int)(f4 * this.k[i2]));
          ipf[] arrayOfipf1 = this.j;
          Context localContext1 = getContext();
          String str4 = localllx.f;
          long l1 = localllx.h;
          String str5 = localllx.e;
          if (localllx.m == ipm.b)
          {
            i10 = 1;
            if (i10 == 0) {
              break label1318;
            }
            localUri2 = Uri.parse(localllx.a());
            label1265:
            arrayOfipf1[i2] = ipf.a(localContext1, str4, l1, str5, localUri2, localllx.m);
            if (localllx.m != ipm.d) {
              break label1716;
            }
          }
        }
        for (int i11 = 1;; i11 = i1)
        {
          i2++;
          i1 = i11;
          break label1076;
          i10 = 0;
          break label1250;
          localUri2 = null;
          break label1265;
          this.l = 2147483647;
          for (int i3 = 0; i3 < this.f; i3++) {
            if ((arrayOfInt1[i3] > 0) && (this.k[i3] > 0))
            {
              if (this.k[i3] < this.a.Y)
              {
                float f3 = 1.0F * this.a.Y / this.k[i3];
                int[] arrayOfInt4 = this.k;
                arrayOfInt4[i3] = ((int)(f3 * arrayOfInt4[i3]));
                arrayOfInt1[i3] = ((int)(f3 * arrayOfInt1[i3]));
              }
              if (arrayOfInt1[i3] < this.a.Y)
              {
                float f2 = 1.0F * this.a.Y / arrayOfInt1[i3];
                int[] arrayOfInt3 = this.k;
                arrayOfInt3[i3] = ((int)(f2 * arrayOfInt3[i3]));
                arrayOfInt1[i3] = ((int)(f2 * arrayOfInt1[i3]));
              }
              if (arrayOfInt1[i3] < this.l) {
                this.l = arrayOfInt1[i3];
              }
            }
          }
          int i4 = 0;
          if (i4 < this.f)
          {
            if (arrayOfInt1[i4] > this.l)
            {
              float f1 = 1.0F * this.l / arrayOfInt1[i4];
              int[] arrayOfInt2 = this.k;
              arrayOfInt2[i4] = ((int)(f1 * arrayOfInt2[i4]));
              arrayOfInt1[i4] = this.l;
            }
            for (;;)
            {
              i4++;
              break;
              if ((arrayOfInt1[i4] <= 0) || (this.k[i4] <= 0))
              {
                this.k[i4] = this.l;
                arrayOfInt1[i4] = this.l;
              }
            }
            label1635:
            localStringBuilder = new StringBuilder(256);
            break label406;
            label1650:
            locallpe.b = str3;
            break label494;
            label1660:
            this.x.a = this.d.a;
            break label494;
            this.y.setBackgroundDrawable(null);
            break label515;
            bool = false;
            break label583;
            str1 = getResources().getString(do.X);
            break label670;
          }
          i5 = i1;
          break;
        }
        paramInt2 = i19;
      }
    }
  }
  
  public final void a(View paramView)
  {
    if (paramView == null) {}
    int i1;
    ipf localipf;
    do
    {
      do
      {
        qgo localqgo;
        do
        {
          do
          {
            MediaView localMediaView;
            do
            {
              do
              {
                return;
                if (paramView != this.h) {
                  break;
                }
              } while (this.b == null);
              llx localllx2 = this.b.f[0];
              ((hed)mbb.a(getContext(), hed.class)).a(localllx2.g, localllx2.f, this.q);
              return;
              localMediaView = (MediaView)paramView;
              if ((!localMediaView.p()) || (localMediaView.O) || (efj.B(getContext()))) {
                break;
              }
              localMediaView.c(false);
            } while (this.v == null);
            this.v.a(true);
            return;
            i1 = ((Integer)localMediaView.getTag()).intValue();
            if (this.c == null) {
              break;
            }
          } while (i1 >= this.c.length);
          localqgo = this.c[i1];
        } while ((localqgo.b == null) || (localqgo.b.length == 0) || (localqgo.b[0].b == null));
        ((hei)mbb.a(getContext(), hei.class)).a(localqgo.b[0].b.a);
        return;
      } while (i1 >= this.j.length);
      localipf = this.j[i1];
    } while (localipf == null);
    llx localllx1;
    if ((this.b != null) && (this.b.a > i1))
    {
      localllx1 = this.b.f[i1];
      label262:
      if (localllx1 == null) {
        break label353;
      }
      if (localllx1.m != ipm.b) {
        break label355;
      }
    }
    label353:
    label355:
    for (int i2 = 1;; i2 = 0)
    {
      if ((i2 == 0) || ((!TextUtils.isEmpty(localllx1.g)) && (!TextUtils.isEmpty(localllx1.f)) && (localipf.b.a != 0L))) {
        break label361;
      }
      ((heo)mbb.a(getContext(), heo.class)).a(localipf, this.q);
      return;
      localllx1 = this.d;
      break label262;
      break;
    }
    label361:
    ((heh)mbb.a(getContext(), heh.class)).a(localipf, localllx1.g, localllx1.f, this.r);
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    if (paramTooltipView == this.v) {
      this.v = null;
    }
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    if (paramTooltipView != null) {
      removeView(paramTooltipView);
    }
  }
  
  public final void a(MediaView paramMediaView)
  {
    this.x.a(true);
    if ((this.v != null) && (paramMediaView.p()))
    {
      if (!paramMediaView.O) {
        break label43;
      }
      this.v.setVisibility(8);
    }
    for (;;)
    {
      invalidate();
      return;
      label43:
      this.v.setVisibility(0);
    }
  }
  
  public final void a(RecyclingViewGroup paramRecyclingViewGroup, int paramInt)
  {
    int i1 = 1;
    if (paramInt != 2)
    {
      this.A = 0;
      if ((c()) && ((this.m == 2) || (this.m == 3))) {
        a(i1);
      }
    }
    if (paramInt != 2) {}
    for (;;)
    {
      this.n = i1;
      if (!this.n) {
        a(b(), this.o);
      }
      return;
      i1 = 0;
    }
  }
  
  public final void a(RecyclingViewGroup paramRecyclingViewGroup, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == 0) {}
    label80:
    label93:
    do
    {
      return;
      if (this.A != 0) {
        if (this.A < 0)
        {
          if (paramInt2 < 0) {
            break label80;
          }
          this.A = paramInt2;
        }
      }
      for (;;)
      {
        if ((this.A <= this.z) && (!c())) {
          break label93;
        }
        if ((this.m != 2) && (this.m != 3)) {
          break;
        }
        a(1);
        return;
        if (paramInt2 < 0) {
          this.A = paramInt2;
        } else {
          this.A = (paramInt2 + this.A);
        }
      }
    } while ((this.A >= -this.z) || ((this.m != 0) && (this.m != 1)));
    a(3);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.y != null)
    {
      int i1 = this.y.getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = this.y.getChildAt(i2);
        if ((localView instanceof MediaView))
        {
          MediaView localMediaView = (MediaView)localView;
          localMediaView.a(4, paramBoolean1);
          localMediaView.n = paramBoolean2;
        }
      }
    }
  }
  
  public final void aw_()
  {
    a(b(), this.o);
  }
  
  public final void ax_()
  {
    a(false, false);
  }
  
  public final boolean b()
  {
    return (this.o) && (this.p);
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.t != null) && (this.t.f())) {
      this.t.E_();
    }
    while (this.j == null) {
      return;
    }
    a(paramView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3;
    int i4;
    if (this.y != null)
    {
      int i1 = getMeasuredWidth();
      int i2 = getMeasuredHeight();
      this.y.layout(0, 0, i1, i2);
      if (this.x.getParent() == this)
      {
        int i11 = i2 - this.x.getMeasuredHeight();
        this.x.layout(0, i11, i1, i2);
        if (this.h.getParent() == this)
        {
          Rect localRect = this.x.c;
          this.h.layout(localRect.left, i11 + localRect.top, localRect.right, i11 + localRect.bottom);
        }
      }
      if ((this.v != null) && (this.u != null))
      {
        i3 = this.v.getMeasuredHeight();
        i4 = this.v.getMeasuredWidth();
        if (i3 >= (this.u.getMeasuredHeight() - ((Bitmap)MediaView.k.b()).getHeight()) / 2) {
          break label292;
        }
      }
    }
    label292:
    for (int i5 = 1;; i5 = 0)
    {
      if (i5 != 0)
      {
        MediaView localMediaView1 = this.u;
        int i6 = (i4 - ((Bitmap)MediaView.k.b()).getWidth()) / 2;
        int i7 = localMediaView1.getLeft() + localMediaView1.L - i6;
        int i8 = i4 + i7;
        MediaView localMediaView2 = this.u;
        int i9 = localMediaView2.getTop() + localMediaView2.M + ((Bitmap)MediaView.k.b()).getHeight();
        int i10 = i3 + i9;
        this.v.layout(i7, i9, i8, i10);
      }
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    this.y.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    if (this.x.getParent() == this)
    {
      this.x.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      if (this.h.getParent() == this)
      {
        Rect localRect = this.x.c;
        this.h.measure(View.MeasureSpec.makeMeasureSpec(localRect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(localRect.height(), 1073741824));
      }
    }
    if (this.v != null)
    {
      this.v.measure(View.MeasureSpec.makeMeasureSpec((int)(0.5F * this.y.getMeasuredWidth()), -2147483648), View.MeasureSpec.makeMeasureSpec(this.y.getMeasuredHeight() / 2, -2147483648));
      this.v.b = 0;
    }
    setMeasuredDimension(i1, i2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.views.StreamAlbumViewGroup
 * JD-Core Version:    0.7.0.1
 */