package com.google.android.apps.plus.views;

import aau;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import aq;
import at;
import dvj;
import dyi;
import dyj;
import dyk;
import dyl;
import dyo;
import dyp;
import dyq;
import dyr;
import dys;
import dyt;
import efj;
import ick;
import icm;
import iey;
import ifb;
import ife;
import ifj;
import ipb;
import ipf;
import iph;
import ipm;
import iqw;
import java.io.File;
import java.util.Arrays;
import jpt;
import kaz;
import kbb;
import lwo;
import mbb;
import oih;
import qat;

public class PhotoView
  extends ViewGroup
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, at, kbb
{
  public static ipb B;
  private static boolean C;
  private static int D;
  private static int E;
  private static Bitmap F;
  private static Bitmap G;
  private static Bitmap H;
  private static boolean I;
  private static String J;
  private static String K;
  private static String L;
  private static TextPaint M;
  private static TextPaint N;
  private static Paint O;
  private static TextPaint P;
  public static int a;
  public boolean A;
  private dyo Q;
  private Drawable R;
  private ProgressBar S;
  private iph T;
  private dyp U;
  private boolean V;
  private boolean W;
  private boolean aa;
  private boolean ab;
  private GestureDetector ac;
  private ScaleGestureDetector ad;
  private View.OnClickListener ae;
  private boolean af;
  private boolean ag;
  private boolean ah;
  private dyr ai;
  private float aj;
  private float ak;
  private boolean al;
  private float am;
  private long an;
  private dyt ao;
  private dys ap;
  private RectF aq = new RectF();
  private RectF ar = new RectF();
  private RectF as = new RectF();
  private final RectF at = new RectF();
  private boolean au;
  private boolean av;
  private boolean aw;
  private long ax;
  private boolean ay = true;
  public Drawable b;
  public ipf c;
  public oih d;
  public iph e;
  public iph f;
  public Matrix g;
  public Matrix h = new Matrix();
  public Matrix i = new Matrix();
  public boolean j;
  public boolean k = true;
  public boolean l;
  public boolean m;
  public dyq n;
  public float o;
  public float p;
  public RectF q = new RectF();
  public float[] r = new float[9];
  public RectF s = new RectF();
  public boolean t;
  public final RectF u = new RectF();
  public dyl v;
  public float w;
  public float x;
  public float y = 1.0F;
  public dyk z;
  
  public PhotoView(Context paramContext)
  {
    super(paramContext);
    if (B == null) {
      B = (ipb)mbb.a(getContext(), ipb.class);
    }
    h();
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (B == null) {
      B = (ipb)mbb.a(getContext(), ipb.class);
    }
    h();
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (B == null) {
      B = (ipb)mbb.a(getContext(), ipb.class);
    }
    h();
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    if (paramFloat4 - paramFloat3 < paramFloat2 - paramFloat1) {
      return paramFloat1 + (paramFloat2 - paramFloat1 - (paramFloat4 + paramFloat3)) / 2.0F;
    }
    return Math.max(paramFloat2 - paramFloat4, Math.min(paramFloat1 - paramFloat3, paramFloat5));
  }
  
  private final void b(RectF paramRectF)
  {
    if (this.t)
    {
      paramRectF.set(this.s);
      return;
    }
    paramRectF.set(this.as);
  }
  
  private final void e()
  {
    if (this.b != null) {
      this.b.setCallback(null);
    }
    this.b = null;
    if (this.R != null) {
      this.R.setCallback(null);
    }
    this.R = null;
  }
  
  private boolean f()
  {
    return (this.c != null) && (ipm.b.equals(this.c.e));
  }
  
  private boolean g()
  {
    return (this.j) && (this.k);
  }
  
  private final void h()
  {
    setWillNotDraw(false);
    setFocusable(true);
    setClickable(true);
    Context localContext = getContext();
    if (!C)
    {
      C = true;
      Resources localResources = localContext.getApplicationContext().getResources();
      F = efj.a(localResources, efj.rb);
      G = efj.a(localResources, efj.qX);
      H = efj.a(localResources, efj.qV);
      a = localResources.getDimensionPixelSize(efj.nx);
      TextPaint localTextPaint1 = new TextPaint();
      M = localTextPaint1;
      localTextPaint1.setColor(localResources.getColor(efj.kq));
      M.setTextSize(localResources.getDimension(efj.nM));
      M.setAntiAlias(true);
      M.setFakeBoldText(true);
      M.setStyle(Paint.Style.FILL);
      M.setTextAlign(Paint.Align.CENTER);
      TextPaint localTextPaint2 = new TextPaint();
      N = localTextPaint2;
      localTextPaint2.setColor(localResources.getColor(efj.kq));
      N.setTextSize(localResources.getDimension(efj.nJ));
      N.setAntiAlias(true);
      N.setFakeBoldText(true);
      N.setTextAlign(Paint.Align.CENTER);
      Paint localPaint = new Paint();
      O = localPaint;
      localPaint.setColor(localResources.getColor(efj.jK));
      J = localResources.getString(aau.jI);
      K = localResources.getString(aau.jJ);
      D = (int)localResources.getDimension(efj.mO);
      E = (int)localResources.getDimension(efj.mN);
      L = localResources.getString(aau.jH);
      TextPaint localTextPaint3 = new TextPaint();
      P = localTextPaint3;
      localTextPaint3.setColor(localResources.getColor(efj.kq));
      P.setTextSize(localResources.getDimension(efj.nM));
      P.setAntiAlias(true);
      P.setFakeBoldText(true);
      P.setTextAlign(Paint.Align.CENTER);
      I = localContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
    boolean bool1 = I;
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    this.ac = new GestureDetector(localContext, this, null, bool2);
    this.ad = new ScaleGestureDetector(localContext, this);
    if (Build.VERSION.SDK_INT >= 19) {
      this.ad.setQuickScaleEnabled(true);
    }
    this.ai = new dyr(this, this);
    this.ao = new dyt(this);
    this.ap = new dys(this);
    this.v = new dyl(this);
    this.S = new ProgressBar(localContext);
  }
  
  public final Bitmap a(int paramInt1, int paramInt2)
  {
    return B.a.b(paramInt1, paramInt2);
  }
  
  public final void a()
  {
    if (this.U != null) {
      this.U.ad_();
    }
    dyl localdyl = this.v;
    if ((localdyl.c != null) && (localdyl.b != null) && (localdyl.g.b != null)) {
      localdyl.a();
    }
    for (boolean bool = localdyl.d();; bool = false)
    {
      if (!bool) {
        invalidate();
      }
      return;
      localdyl.e();
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.y = paramFloat1;
    this.w = paramFloat2;
    this.x = paramFloat3;
    float f1 = Math.min(Math.max(paramFloat1, this.aj), this.ak);
    float f2 = d();
    float f3 = f1 / f2;
    this.h.postScale(f3, f3, paramFloat2, paramFloat3);
    a();
    if (f1 > this.p)
    {
      this.ai.a(f2, this.p, 600L);
      a(this.h);
    }
    while (f1 >= this.o) {
      return;
    }
    this.ai.a(f2, this.o, 600L);
    a(this.h);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    B.a.a(paramBitmap);
  }
  
  public final void a(Matrix paramMatrix)
  {
    this.ar.set(this.q);
    paramMatrix.mapRect(this.ar);
    b(this.at);
    float f1 = a(this.at.left, this.at.right, this.ar.left, this.ar.right, 0.0F);
    float f2 = a(this.at.top, this.at.bottom, this.ar.top, this.ar.bottom, 0.0F);
    if ((Math.abs(f1) > 20.0F) || (Math.abs(f2) > 20.0F))
    {
      localdys = this.ap;
      localdys.d = f1;
      localdys.e = f2;
      l1 = 250L - (System.currentTimeMillis() - localdys.f);
      if ((localdys.g) && (l1 > 0L))
      {
        localdys.a = (localdys.d / (float)l1);
        localdys.b = (localdys.e / (float)l1);
      }
    }
    while (this.ap.g)
    {
      dys localdys;
      long l1;
      return;
      localdys.f = -1L;
      localdys.a = (f1 / 250.0F);
      localdys.b = (f2 / 250.0F);
      localdys.h = false;
      localdys.g = true;
      localdys.c.post(localdys);
      return;
    }
    this.h.postTranslate(f1, f2);
    a();
  }
  
  public final void a(RectF paramRectF)
  {
    this.g.getValues(this.r);
    int i1 = Math.round(this.r[2]);
    int i2 = Math.round(this.r[5]);
    float f1 = this.r[4];
    int i3 = this.b.getIntrinsicWidth();
    int i4 = this.b.getIntrinsicHeight();
    float f2 = f1 * i3;
    float f3 = f1 * i4;
    b(this.at);
    paramRectF.left = Math.max(0.0F, (this.at.left - i1) / f2);
    paramRectF.top = Math.max(0.0F, (this.at.top - i2) / f3);
    paramRectF.right = Math.min(1.0F, (this.at.right - i1) / f2);
    paramRectF.bottom = Math.min(1.0F, (this.at.bottom - i2) / f3);
  }
  
  public final void a(ipf paramipf, oih paramoih)
  {
    if (((this.c != null) && (this.c.a(paramipf))) || (this.c == paramipf))
    {
      oih localoih = this.d;
      boolean bool;
      if (localoih == paramoih) {
        bool = true;
      }
      while (bool)
      {
        return;
        bool = false;
        if (localoih != null)
        {
          bool = false;
          if (paramoih != null)
          {
            Class localClass1 = localoih.getClass();
            Class localClass2 = paramoih.getClass();
            bool = false;
            if (localClass1 == localClass2)
            {
              int i1 = localoih.a();
              localoih.ak = i1;
              int i2 = paramoih.a();
              paramoih.ak = i2;
              bool = false;
              if (i2 == i1)
              {
                byte[] arrayOfByte1 = new byte[i1];
                byte[] arrayOfByte2 = new byte[i1];
                qat.a(localoih, arrayOfByte1, 0, i1);
                qat.a(paramoih, arrayOfByte2, 0, i1);
                bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
              }
            }
          }
        }
      }
    }
    ap_();
    this.c = paramipf;
    this.d = paramoih;
    b();
  }
  
  public final void a(ipf paramipf, oih paramoih, dyo paramdyo, dyp paramdyp)
  {
    this.Q = paramdyo;
    this.U = paramdyp;
    oih localoih;
    boolean bool;
    if (((this.c != null) && (this.c.a(paramipf))) || (this.c == paramipf))
    {
      localoih = this.d;
      if (localoih != paramoih) {
        break label76;
      }
      bool = true;
    }
    for (;;)
    {
      if (!bool)
      {
        ap_();
        this.c = paramipf;
        this.d = paramoih;
        b();
      }
      return;
      label76:
      bool = false;
      if (localoih != null)
      {
        bool = false;
        if (paramoih != null)
        {
          Class localClass1 = localoih.getClass();
          Class localClass2 = paramoih.getClass();
          bool = false;
          if (localClass1 == localClass2)
          {
            int i1 = localoih.a();
            localoih.ak = i1;
            int i2 = paramoih.a();
            paramoih.ak = i2;
            bool = false;
            if (i2 == i1)
            {
              byte[] arrayOfByte1 = new byte[i1];
              byte[] arrayOfByte2 = new byte[i1];
              qat.a(localoih, arrayOfByte1, 0, i1);
              qat.a(paramoih, arrayOfByte2, 0, i1);
              bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
            }
          }
        }
      }
    }
  }
  
  public final void a(kaz paramkaz)
  {
    int i1;
    ife localife;
    int i3;
    label190:
    label212:
    Object localObject;
    iey localiey;
    switch (paramkaz.q)
    {
    case 2: 
    case 4: 
    default: 
      i1 = 0;
      if (i1 != 0)
      {
        if (this.U != null) {
          this.U.a(this, paramkaz);
        }
        if ((g()) && (!this.ab))
        {
          removeView(this.S);
          addView(this.S);
        }
      }
      invalidate();
      return;
    case 1: 
      if ((paramkaz != this.e) && (!this.aa))
      {
        e();
        iph localiph = this.e;
        if (localiph != null) {
          localiph.b(this);
        }
        this.e = null;
        this.e = ((iph)paramkaz);
        if (this.T == this.e) {
          this.T = null;
        }
      }
      localife = (ife)paramkaz;
      int i2 = localife.s;
      if ((i2 == 4) || (i2 == 3))
      {
        i3 = 1;
        if (i3 == 0) {
          break label366;
        }
        if (this.av != true)
        {
          this.av = true;
          invalidate();
        }
        localObject = paramkaz.p;
        if (!(localObject instanceof Bitmap)) {
          break label382;
        }
        Bitmap localBitmap = (Bitmap)localObject;
        localiey = new iey(localBitmap, localBitmap.getWidth(), localBitmap.getHeight());
      }
      break;
    }
    for (;;)
    {
      label254:
      if (localiey != null)
      {
        this.o = 0.0F;
        this.aj = 0.0F;
        if (localiey != null)
        {
          this.b = new dvj(localiey);
          this.b.setCallback(this);
        }
        e(true);
        invalidate();
        if (g())
        {
          if (!this.aa)
          {
            this.aa = true;
            post(new dyj(this));
          }
          this.l = false;
          if (!this.l) {
            break label628;
          }
          setContentDescription(L);
        }
      }
      for (;;)
      {
        label336:
        label341:
        i1 = 1;
        break;
        i3 = 0;
        break label190;
        label366:
        if (localife.s != 2) {
          break label212;
        }
        this.j = true;
        break label212;
        label382:
        if ((localObject instanceof iey))
        {
          localiey = (iey)localObject;
          break label254;
        }
        if (!(localObject instanceof File)) {
          break label819;
        }
        new Thread(new dyi(this, (File)localObject, paramkaz)).start();
        return;
        if (this.j) {
          break label336;
        }
        this.v.e();
        break label336;
        if ((localObject instanceof icm))
        {
          this.j = true;
          this.ab = true;
          removeView(this.S);
          this.R = new ick((icm)localObject, B.a.j());
          this.R.setCallback(this);
          ((ick)this.R).a(this.W);
          invalidate();
          this.l = false;
          break label341;
        }
        if ((localObject instanceof ifb))
        {
          this.j = true;
          this.ab = true;
          removeView(this.S);
          this.R = new aq(((ifb)localObject).a, this);
          this.R.setCallback(this);
          if (this.W) {
            ((aq)this.R).start();
          }
          invalidate();
          this.l = false;
          break label341;
        }
        this.l = true;
        break label341;
        label628:
        if (f())
        {
          Resources localResources3 = getResources();
          int i6 = efj.yd;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(1);
          setContentDescription(localResources3.getQuantityString(i6, 1, arrayOfObject3));
        }
        else if ((this.j) && (this.k))
        {
          Resources localResources2 = getResources();
          int i5 = efj.xd;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(1);
          setContentDescription(localResources2.getQuantityString(i5, 1, arrayOfObject2));
        }
        else
        {
          Resources localResources1 = getResources();
          int i4 = efj.yc;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(1);
          setContentDescription(localResources1.getQuantityString(i4, 1, arrayOfObject1));
        }
      }
      this.l = true;
      if (this.j)
      {
        Toast.makeText(getContext(), "Animated Image could not be loaded.", 0).show();
        removeView(this.S);
        this.ab = true;
      }
      i1 = 1;
      break;
      label819:
      localiey = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.ay != paramBoolean)
    {
      this.ay = paramBoolean;
      if (!paramBoolean)
      {
        this.ai.a(true);
        dyt localdyt = this.ao;
        localdyt.e = false;
        localdyt.f = true;
        this.ap.a();
        this.h.set(this.i);
        a();
      }
    }
  }
  
  public final boolean a(boolean paramBoolean1, float paramFloat1, float paramFloat2, boolean paramBoolean2)
  {
    this.ar.set(this.q);
    this.h.mapRect(this.ar);
    b(this.at);
    float f2;
    float f1;
    if (!paramBoolean2)
    {
      f2 = a(this.at.left, this.at.right, this.ar.left, this.ar.right, paramFloat1);
      f1 = a(this.at.top, this.at.bottom, this.ar.top, this.ar.bottom, paramFloat2);
    }
    for (;;)
    {
      if ((paramBoolean1) && (this.n != null) && ((f2 != paramFloat1) || (f1 != paramFloat2)))
      {
        float f3 = (f2 - paramFloat1) / getWidth();
        float f4 = (f1 - paramFloat2) / getHeight();
        this.n.a(f3, f4);
      }
      this.h.postTranslate(f2, f1);
      this.w = (f2 + this.w);
      this.x = (f1 + this.x);
      a();
      if ((f2 != paramFloat1) || (f1 != paramFloat2)) {
        break;
      }
      return true;
      f1 = paramFloat2;
      f2 = paramFloat1;
    }
    return false;
  }
  
  public final void ap_()
  {
    iph localiph = this.f;
    if (localiph != null) {
      localiph.b(this);
    }
    this.f = null;
    this.j = false;
    this.aa = false;
    this.v.ap_();
  }
  
  public final void b()
  {
    boolean bool1;
    boolean bool2;
    if ((lwo.a(this)) && (this.c != null))
    {
      if ((!iqw.a(this.c.c)) || (!ipm.d.equals(this.c.e))) {
        break label163;
      }
      bool1 = true;
      this.j = bool1;
      if ((this.j) || (!this.k)) {
        break label168;
      }
      bool2 = true;
      label66:
      this.ab = bool2;
      iph localiph = this.T;
      if (localiph != null) {
        localiph.b(this);
      }
      this.T = null;
      if (this.Q.c == 0) {
        break label173;
      }
      this.T = B.a(this.c, 0, this.Q.a, this.Q.b, null, this.Q.c, this);
    }
    label266:
    label274:
    for (;;)
    {
      if (this.T.q == 1) {
        this.T = null;
      }
      removeView(this.S);
      return;
      label163:
      bool1 = false;
      break;
      label168:
      bool2 = false;
      break label66;
      label173:
      if (this.d != null)
      {
        this.T = B.a(this.c, 3, new jpt(this.d), 64, this);
      }
      else
      {
        int i1;
        label232:
        DisplayMetrics localDisplayMetrics;
        int i2;
        int i3;
        if (mbb.a(getContext(), "com.google.android.libraries.social.appid", 300) == 1)
        {
          i1 = 1;
          if (i1 == 0) {
            break label343;
          }
          localDisplayMetrics = efj.K(getContext());
          if (getContext().getResources().getConfiguration().orientation != 2) {
            break label321;
          }
          i2 = 1;
          if (i2 == 0) {
            break label327;
          }
          i3 = 0;
          if (i2 == 0) {
            break label337;
          }
        }
        label321:
        label327:
        label337:
        for (int i4 = localDisplayMetrics.heightPixels;; i4 = 0)
        {
          this.T = B.a(this.c, 0, i3, i4, 3, null, null, 576, this);
          break;
          i1 = 0;
          break label232;
          i2 = 0;
          break label266;
          i3 = localDisplayMetrics.widthPixels;
          break label274;
        }
        label343:
        this.T = B.a(this.c, 5, getWidth(), getHeight(), null, 4160, this);
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.au != paramBoolean)
    {
      this.au = paramBoolean;
      invalidate();
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (this.W != paramBoolean)
    {
      this.W = paramBoolean;
      if ((this.b instanceof ick)) {
        ((ick)this.b).a(this.W);
      }
      if (this.R != null)
      {
        if (!(this.R instanceof ick)) {
          break label73;
        }
        ((ick)this.R).a(this.W);
      }
    }
    for (;;)
    {
      invalidate();
      return;
      label73:
      if (paramBoolean) {
        ((aq)this.R).start();
      } else {
        ((aq)this.R).stop();
      }
    }
  }
  
  public final float d()
  {
    this.h.getValues(this.r);
    return this.r[0];
  }
  
  public final void d(boolean paramBoolean)
  {
    this.af = true;
    if (!this.af)
    {
      this.h.set(this.i);
      a();
    }
  }
  
  public final void e(boolean paramBoolean)
  {
    if ((this.b == null) || (!this.V)) {
      return;
    }
    int i1 = this.b.getIntrinsicWidth();
    int i2 = this.b.getIntrinsicHeight();
    this.b.setBounds(0, 0, i1, i2);
    float f1;
    label221:
    float f3;
    if ((paramBoolean) || ((this.o == 0.0F) && (this.b != null) && (this.V)))
    {
      int i3 = this.b.getIntrinsicWidth();
      int i4 = this.b.getIntrinsicHeight();
      this.q.set(0.0F, 0.0F, i3, i4);
      b(this.at);
      f1 = i4 / i3;
      float f2 = this.at.height() / this.at.width();
      if (!this.t) {
        break label487;
      }
      if (f1 <= f2) {
        break label414;
      }
      int i7 = (int)(this.at.top + this.at.bottom) / 2;
      int i8 = Math.round(f1 * this.at.width()) / 2;
      this.aq.set(this.at.left, i7 - i8, this.at.right, i8 + i7);
      this.h.setRectToRect(this.q, this.aq, Matrix.ScaleToFit.CENTER);
      this.i.set(this.h);
      this.o = d();
      if (!this.m) {
        break label509;
      }
      f3 = 0.8F * this.o;
      label276:
      this.aj = f3;
      this.p = Math.max(2.0F * this.o, Math.min(12.0F * this.o, 12.0F));
      if (!this.m) {
        break label518;
      }
    }
    label518:
    for (float f4 = 1.5F * this.p;; f4 = this.p)
    {
      this.ak = f4;
      this.g = this.h;
      if (this.z != null)
      {
        this.ar.set(this.q);
        this.g.mapRect(this.ar);
        this.z.a(this, this.b, this.ar);
      }
      if (this.U == null) {
        break;
      }
      this.U.ad_();
      this.U.b();
      return;
      label414:
      int i5 = (int)(this.at.right + this.at.left) / 2;
      int i6 = Math.round(this.at.height() / f1) / 2;
      this.aq.set(i5 - i6, this.at.top, i6 + i5, this.at.bottom);
      break label221;
      label487:
      this.aq.set(0.0F, 0.0F, getWidth(), getHeight());
      break label221;
      label509:
      f3 = this.o;
      break label276;
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    removeView(this.S);
    if (paramBoolean) {
      addView(this.S);
    }
  }
  
  public void invalidate()
  {
    super.invalidate();
    dyl localdyl;
    if (this.v != null)
    {
      localdyl = this.v;
      if ((!this.au) || (this.j) || (f())) {
        break label64;
      }
    }
    label64:
    for (boolean bool = true;; bool = false)
    {
      if (bool != localdyl.d)
      {
        localdyl.d = bool;
        if (!localdyl.d) {
          break;
        }
        localdyl.e();
      }
      return;
    }
    localdyl.f();
    localdyl.g.invalidate();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if ((paramDrawable == this.b) || (paramDrawable == this.R))
    {
      invalidate();
      return;
    }
    super.invalidateDrawable(paramDrawable);
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.b != null) {
      this.b.jumpToCurrentState();
    }
    if (this.R != null) {
      this.R.jumpToCurrentState();
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
    Drawable localDrawable;
    if (this.b != null)
    {
      localDrawable = this.b;
      if (getVisibility() != 0) {
        break label37;
      }
    }
    label37:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    e();
    iph localiph1 = this.f;
    if (localiph1 != null) {
      localiph1.b(this);
    }
    this.f = null;
    this.j = false;
    this.aa = false;
    this.v.ap_();
    if (this.T != this.e)
    {
      iph localiph3 = this.T;
      if (localiph3 != null) {
        localiph3.b(this);
      }
      this.T = null;
    }
    iph localiph2 = this.e;
    if (localiph2 != null) {
      localiph2.b(this);
    }
    this.e = null;
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    if (this.af)
    {
      dyt localdyt = this.ao;
      localdyt.e = false;
      localdyt.f = true;
    }
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.Q.d)
    {
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), O);
      paramCanvas.drawText(J, getWidth() / 2, D, M);
      paramCanvas.drawText(K, getWidth() / 2, E, N);
    }
    label337:
    do
    {
      return;
      if (this.b != null)
      {
        if (!this.v.d())
        {
          int i6 = paramCanvas.getSaveCount();
          paramCanvas.save();
          if (this.z != null) {
            this.z.a(paramCanvas);
          }
          if (this.g != null) {
            paramCanvas.concat(this.g);
          }
          this.b.draw(paramCanvas);
          paramCanvas.restoreToCount(i6);
        }
        int i1;
        if (!this.A)
        {
          i1 = paramCanvas.getSaveCount();
          if (this.z != null)
          {
            paramCanvas.save();
            this.z.a(paramCanvas);
          }
          if (!f()) {
            break label337;
          }
          int i4 = (getWidth() - F.getWidth()) / 2;
          int i5 = (getHeight() - F.getHeight()) / 2;
          paramCanvas.drawBitmap(F, i4, i5, null);
        }
        for (;;)
        {
          if (this.z != null) {
            paramCanvas.restoreToCount(i1);
          }
          if ((this.R == null) || (!this.k) || (((!(this.R instanceof ick)) || (!((ick)this.R).a())) && (!(this.R instanceof aq)))) {
            break;
          }
          this.b = this.R;
          iph localiph = this.e;
          if (localiph != null) {
            localiph.b(this);
          }
          this.e = null;
          this.R = null;
          e(true);
          invalidate();
          return;
          if (this.av)
          {
            int i2 = (getWidth() - G.getWidth()) / 2;
            int i3 = (getHeight() - G.getHeight()) / 2;
            paramCanvas.drawBitmap(G, i2, i3, null);
          }
        }
      }
    } while (!this.l);
    paramCanvas.drawText(L, getWidth() / 2, getHeight() / 2, P);
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    dyt localdyt;
    if (this.af) {
      if (!this.al)
      {
        localdyt = this.ao;
        if (!localdyt.e) {
          break label35;
        }
      }
    }
    for (;;)
    {
      this.al = false;
      return true;
      label35:
      localdyt.d = -1L;
      localdyt.b = paramFloat1;
      localdyt.c = paramFloat2;
      localdyt.f = false;
      localdyt.e = true;
      localdyt.a.post(localdyt);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.as.set(0.0F, 0.0F, getWidth(), getHeight());
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++) {
      getChildAt(i2).layout(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    this.V = true;
    int i3 = getWidth();
    int i4 = getHeight();
    if (indexOfChild(this.S) != -1)
    {
      int i5 = H.getWidth() << 1;
      int i6 = H.getHeight() << 1;
      int i7 = (i3 - i5) / 2;
      int i8 = (i4 - i6) / 2;
      this.S.layout(i7, i8, i5 + i7, i6 + i8);
    }
    e(paramBoolean);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++) {
      getChildAt(i2).measure(paramInt1, paramInt2);
    }
  }
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = paramScaleGestureDetector.getScaleFactor() - 1.0F;
    if (((this.am == 0.0F) || ((this.am > 1.0F) && (f1 + this.am < 1.0F)) || ((this.am < 1.0F) && (f1 + this.am > 1.0F))) && (f1 > 0.1D)) {
      return true;
    }
    this.am = (f1 + this.am);
    this.ah = false;
    a(d() * paramScaleGestureDetector.getScaleFactor(), paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    return true;
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    if (this.af)
    {
      this.ai.a(false);
      this.ah = true;
      this.am = 0.0F;
    }
    return true;
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    if ((this.af) && (this.ah))
    {
      this.ag = true;
      this.h.set(this.i);
      a();
    }
    this.al = true;
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((Math.abs(paramMotionEvent2.getEventTime() - this.an) > 200L) && (this.af))
    {
      this.w = (paramMotionEvent1.getX() - paramFloat1);
      this.x = (paramMotionEvent1.getY() - paramFloat2);
      a(true, -paramFloat1, -paramFloat2, false);
    }
    return true;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if ((this.ae != null) && (!this.ah)) {
      this.ae.onClick(this);
    }
    this.ah = false;
    return true;
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.ay) {
      return true;
    }
    this.ad.onTouchEvent(paramMotionEvent);
    this.ac.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    }
    long l1;
    for (;;)
    {
      l1 = System.currentTimeMillis();
      switch (paramMotionEvent.getAction())
      {
      case 2: 
      default: 
        return true;
      case 0: 
        if (l1 - this.ax < ViewConfiguration.getDoubleTapTimeout()) {
          this.aw = true;
        }
        this.ax = l1;
        return true;
        if (paramMotionEvent.getPointerCount() == 2) {
          this.an = paramMotionEvent.getEventTime();
        } else if (paramMotionEvent.getPointerCount() == 1) {
          this.an = 0L;
        }
        break;
      }
    }
    float f1;
    float f2;
    if ((this.aw) && (l1 - this.ax < ViewConfiguration.getTapTimeout())) {
      if ((!this.ag) && (this.af))
      {
        f1 = d();
        if (this.o == 0.0F) {
          break label353;
        }
        f2 = f1 / this.o;
        label213:
        if (f2 <= 1.04F) {
          break label359;
        }
      }
    }
    label353:
    label359:
    for (float f3 = this.o;; f3 = 2.5F * f1)
    {
      float f4 = Math.max(this.o, f3);
      float f5 = Math.min(this.p, f4);
      this.w = paramMotionEvent.getX();
      this.x = paramMotionEvent.getY();
      this.ai.a(f1, f5, 0L);
      Matrix localMatrix = new Matrix(this.h);
      float f6 = f5 / f1;
      localMatrix.postScale(f6, f6, this.w, this.x);
      a(localMatrix);
      this.ag = false;
      this.aw = false;
      if (this.ao.e) {
        break;
      }
      a(this.h);
      return true;
      f2 = 1.0F;
      break label213;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.ae = paramOnClickListener;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    Drawable localDrawable;
    if (this.b != null)
    {
      localDrawable = this.b;
      if (paramInt != 0) {
        break label31;
      }
    }
    label31:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (this.b == paramDrawable) || (this.R == paramDrawable) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoView
 * JD-Core Version:    0.7.0.1
 */