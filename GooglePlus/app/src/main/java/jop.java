import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.Locale;

public final class jop
  extends lws
  implements View.OnClickListener, AbsListView.SelectionBoundsAdjuster, kbb, lxj
{
  private static hdg B;
  private static Drawable an;
  private static Drawable ao;
  private static Bitmap ap;
  private static Drawable aq;
  private static Drawable ar;
  private static int as;
  private static int at;
  private final int C;
  private final int D;
  private final int E;
  private final int F;
  private final int G;
  private final int H;
  private final int I;
  private final int J;
  private final int K;
  private final int L;
  private final int M;
  private kaz N;
  private int O;
  private boolean P;
  private final SpannableStringBuilder Q = new SpannableStringBuilder();
  private final Drawable R;
  private final int S;
  private int T;
  private Bitmap U;
  private final Paint V;
  private final Rect W = new Rect();
  public jly a;
  private final Rect aa = new Rect();
  private TextView ab;
  private boolean ac;
  private final int ad;
  private boolean ae;
  private TextView af;
  private ImageView ag;
  private final int ah;
  private int ai;
  private boolean aj;
  private Bitmap ak;
  private ImageView al;
  private boolean am;
  public String b;
  public String c;
  public String d;
  public String e;
  public boolean f = true;
  public String g;
  public boolean h = true;
  public String i;
  public boolean j;
  public String k;
  public String l;
  public final TextView m;
  public final SpannableStringBuilder n = new SpannableStringBuilder();
  public final TextView o;
  public TextView p;
  public boolean q;
  public boolean r;
  public boolean s;
  public joq t;
  public boolean u;
  
  public jop(Context paramContext)
  {
    super(paramContext, null);
    if (B == null) {
      B = (hdg)mbb.a(paramContext, hdg.class);
    }
    Resources localResources = getResources();
    this.D = localResources.getDimensionPixelOffset(efj.SY);
    this.C = (efj.i(paramContext) + 2 * this.D);
    this.E = localResources.getDimensionPixelOffset(efj.SV);
    this.R = localResources.getDrawable(aaw.pS);
    this.S = localResources.getDimensionPixelSize(efj.SR);
    this.ak = a(getResources(), da.aW);
    this.F = localResources.getDimensionPixelOffset(efj.SW);
    this.G = localResources.getDimensionPixelOffset(efj.SU);
    this.H = localResources.getDimensionPixelOffset(efj.SX);
    this.ad = aaw.pR;
    this.ah = localResources.getDimensionPixelSize(efj.SQ);
    this.K = localResources.getDimensionPixelSize(efj.Ta);
    this.J = localResources.getDimensionPixelOffset(efj.SZ);
    this.L = localResources.getDimensionPixelOffset(efj.ST);
    this.M = localResources.getDimensionPixelOffset(efj.SS);
    this.m = new TextView(paramContext);
    this.m.setSingleLine(true);
    this.m.setEllipsize(TextUtils.TruncateAt.END);
    this.m.setGravity(16);
    this.m.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.m.setTextAppearance(paramContext, ehr.dp);
    addView(this.m);
    this.o = new TextView(paramContext);
    this.o.setSingleLine(true);
    this.o.setEllipsize(TextUtils.TruncateAt.END);
    this.o.setGravity(16);
    this.o.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.o.setTextAppearance(paramContext, ehr.do);
    addView(this.o);
    this.V = new Paint();
    if (ap == null) {
      ap = efj.s(paramContext, 1);
    }
    this.U = ap;
    if (ao == null) {
      ao = paramContext.getApplicationContext().getResources().getDrawable(da.aV);
    }
    if (aq == null) {
      aq = paramContext.getApplicationContext().getResources().getDrawable(aaw.pW);
    }
    if (ar == null) {
      ar = paramContext.getApplicationContext().getResources().getDrawable(aaw.pX);
    }
    if (as == 0)
    {
      as = efj.i(paramContext);
      at = efj.g(paramContext);
    }
    this.I = Math.min(ap.getWidth(), as);
    if (this.I > as)
    {
      this.O = 1;
      this.V.setFilterBitmap(true);
      return;
    }
    if (this.I == as)
    {
      this.O = 1;
      return;
    }
    if (this.I > at)
    {
      this.O = 1;
      this.V.setFilterBitmap(true);
      return;
    }
    if (this.I == at)
    {
      this.O = 0;
      return;
    }
    this.O = 0;
    this.V.setFilterBitmap(true);
  }
  
  private static Bitmap a(Resources paramResources, int paramInt)
  {
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(paramResources, paramInt);
      return localBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      Log.e("PeopleListItemView", "ImageUtils#decodeResource(Resources, int) threw an OOME", localOutOfMemoryError);
    }
    return null;
  }
  
  private final void f()
  {
    if ((this.ab != null) && (this.ab.getParent() == null)) {
      addView(this.ab);
    }
    if ((this.al != null) && (this.al.getParent() == null)) {
      addView(this.al);
    }
  }
  
  private final void g()
  {
    removeView(this.ab);
    removeView(this.al);
  }
  
  public final void D_()
  {
    ap_();
    g();
    this.b = null;
    this.c = null;
    this.e = null;
    this.f = true;
    this.g = null;
    this.h = true;
    this.P = false;
    this.i = null;
    this.j = false;
    this.k = null;
    this.l = null;
    this.o.setText(null);
    this.aj = false;
    this.o.setTextAppearance(getContext(), ehr.do);
    if (Build.VERSION.SDK_INT >= 11)
    {
      setAlpha(1.0F);
      return;
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 1.0F);
    localAlphaAnimation.setDuration(0L);
    localAlphaAnimation.setFillAfter(true);
    startAnimation(localAlphaAnimation);
  }
  
  public final void a(int paramInt)
  {
    if (this.af == null)
    {
      this.af = new TextView(getContext());
      this.af.setBackgroundResource(this.ad);
      this.af.setGravity(17);
      this.af.setPadding(this.J, 0, this.J, 0);
      this.af.setOnClickListener(this);
      addView(this.af);
    }
    String str = getResources().getString(paramInt);
    this.af.setText(str.toUpperCase(Locale.getDefault()));
  }
  
  protected final void a(Canvas paramCanvas, Drawable paramDrawable)
  {
    paramDrawable.setBounds(0, 0, getWidth(), getHeight());
    paramDrawable.draw(paramCanvas);
  }
  
  public final void a(String paramString)
  {
    this.q = true;
    this.r = false;
    this.o.setText(paramString);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((!TextUtils.equals(this.c, paramString1)) && (this.f))
    {
      ap_();
      this.c = paramString1;
      this.d = paramString2;
      b();
    }
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.ac == paramBoolean) {}
    do
    {
      return;
      this.ac = paramBoolean;
      if (this.ac)
      {
        if (this.ag == null)
        {
          this.ag = new ImageView(getContext());
          this.ag.setBackgroundResource(this.ad);
          this.ag.setOnClickListener(this);
          this.ag.setFocusable(false);
          ImageView localImageView = this.ag;
          if (an == null) {
            an = getContext().getApplicationContext().getResources().getDrawable(aaw.pT);
          }
          localImageView.setImageDrawable(an);
          this.ag.setScaleType(ImageView.ScaleType.CENTER);
          this.ag.setContentDescription(getResources().getString(aau.AH));
          addView(this.ag);
        }
        this.ag.setVisibility(0);
        return;
      }
    } while (this.ag == null);
    this.ag.setVisibility(8);
  }
  
  public final void a(boolean paramBoolean, String paramString)
  {
    this.aj = paramBoolean;
    if (this.aj)
    {
      f();
      if (this.ab == null)
      {
        Context localContext = getContext();
        this.ab = new TextView(localContext);
        this.ab.setSingleLine(true);
        this.ab.setTextAppearance(localContext, ehr.dh);
        this.ab.setGravity(16);
        this.al = new ImageView(localContext, null, 0);
        this.al.setId(efj.Tc);
        this.al.setImageBitmap(this.ak);
        this.al.setScaleType(ImageView.ScaleType.CENTER);
        this.al.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        f();
      }
      this.ab.setText(paramString);
      return;
    }
    g();
  }
  
  public final void adjustListItemSelectionBounds(Rect paramRect) {}
  
  public final void ap_()
  {
    if (this.N != null)
    {
      this.N.b(this);
      this.N = null;
    }
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.d != null)) {
      this.N = B.a(getContext(), this.d, this.O, 1, this);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.ae == paramBoolean) {}
    do
    {
      return;
      this.ae = paramBoolean;
      if (this.ae)
      {
        if (this.af == null) {
          a(aau.AH);
        }
        this.af.setVisibility(0);
        return;
      }
    } while (this.af == null);
    this.af.setVisibility(8);
  }
  
  public final void d()
  {
    if (this.g != null)
    {
      efj.a(this.m, this.g, this.Q, this.l, A, this.w);
      return;
    }
    this.P = true;
    this.m.setText(this.i);
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    if (this.P)
    {
      int i10 = aq.getIntrinsicWidth();
      int i11 = aq.getIntrinsicHeight();
      int i12 = this.aa.left + (this.I - i10) / 2;
      int i13 = this.aa.top + (this.I - i11) / 2;
      aq.setBounds(i12, i13, i10 + i12, i11 + i13);
      aq.draw(paramCanvas);
    }
    for (;;)
    {
      if ((this.ae) || (this.ac))
      {
        int i5 = this.J;
        ao.setBounds(this.ai, i5, this.ai + this.K, getHeight() - this.J);
        ao.draw(paramCanvas);
      }
      super.dispatchDraw(paramCanvas);
      return;
      if (this.j)
      {
        int i6 = ar.getIntrinsicWidth();
        int i7 = ar.getIntrinsicHeight();
        int i8 = this.aa.left + (this.I - i6) / 2;
        int i9 = this.aa.top + (this.I - i7) / 2;
        ar.setBounds(i8, i9, i6 + i8, i7 + i9);
        ar.draw(paramCanvas);
      }
      else if (this.h)
      {
        if (this.r) {
          this.R.draw(paramCanvas);
        }
        if (this.f)
        {
          Bitmap localBitmap = this.U;
          if ((this.N != null) && (this.N.q == 1)) {
            localBitmap = (Bitmap)this.N.p;
          }
          this.W.set(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
          paramCanvas.drawBitmap(localBitmap, this.W, this.aa, this.V);
        }
        if (this.e != null)
        {
          int i1 = aq.getIntrinsicWidth();
          int i2 = aq.getIntrinsicHeight();
          int i3 = this.m.getLeft() - i1 - this.M;
          int i4 = this.L;
          aq.setBounds(i3, i4, i1 + i3, i2 + i4);
          aq.draw(paramCanvas);
        }
      }
    }
  }
  
  public final void e()
  {
    Resources localResources = getResources();
    CharSequence localCharSequence = this.o.getText();
    if ((this.q) && (localCharSequence != null) && (localCharSequence.length() > 0))
    {
      int i3 = aau.AL;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = this.g;
      arrayOfObject3[1] = localCharSequence;
      setContentDescription(localResources.getString(i3, arrayOfObject3));
    }
    do
    {
      return;
      if (this.g != null)
      {
        int i2 = aau.AJ;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.g;
        setContentDescription(localResources.getString(i2, arrayOfObject2));
        return;
      }
    } while (this.i == null);
    int i1 = aau.AK;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.i;
    setContentDescription(localResources.getString(i1, arrayOfObject1));
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  public final void onClick(View paramView)
  {
    if (this.t != null)
    {
      if (paramView != this.ag) {
        break label27;
      }
      this.t.a(this, 0);
    }
    label27:
    do
    {
      return;
      if (paramView == null)
      {
        this.t.a(this, 1);
        return;
      }
      if (paramView == null)
      {
        this.t.a(this, 2);
        return;
      }
    } while (paramView != this.af);
    this.t.a(this, 3);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt4 - paramInt2;
    int i2 = this.D;
    if (this.f)
    {
      this.aa.left = i2;
      this.aa.top = (0 + (i1 - this.I) / 2);
      this.aa.right = (this.aa.left + this.I);
      this.aa.bottom = (this.aa.top + this.I);
      i2 += this.I + this.E;
    }
    int i3 = paramInt3 - paramInt1 - this.D;
    if (this.ae)
    {
      int i29 = this.af.getMeasuredWidth();
      int i30 = i3 - i29;
      this.ai = (i30 - this.K);
      this.af.layout(i30, 0, i30 + i29, i1);
      i3 -= i29;
    }
    if (this.ac)
    {
      int i27 = this.ag.getMeasuredWidth();
      this.ai = (i3 - i27);
      int i28 = this.ai + this.K;
      this.ag.layout(i28, 0, i28 + i27, i1);
      i3 -= i27;
    }
    if (this.x)
    {
      int i24 = this.y.getMeasuredWidth();
      int i25 = this.y.getMeasuredHeight();
      int i26 = 0 + (i1 - i25) / 2;
      this.y.layout(i3 - i24 - this.v, i26, i3 - this.v, i25 + i26);
      i3 -= i24;
    }
    if ((this.ae) || (this.ac) || (this.x)) {
      i3 -= this.H;
    }
    int i4;
    int i5;
    int i6;
    int i7;
    int i21;
    label383:
    int i22;
    if (this.s)
    {
      i4 = this.p.getMeasuredWidth();
      boolean bool = this.aj;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      if (bool)
      {
        if (!this.am) {
          break label521;
        }
        i21 = this.ab.getMeasuredWidth();
        i22 = this.ak.getWidth();
        if (!this.aj) {
          break label527;
        }
      }
    }
    label521:
    label527:
    for (int i23 = i21 + (i22 + this.G);; i23 = 0)
    {
      i7 = i23;
      i6 = i21;
      i5 = i22;
      if (this.h) {
        break label533;
      }
      int i19 = this.o.getMeasuredHeight();
      int i20 = 0 + (i1 - i19) / 2;
      if (this.s)
      {
        this.p.layout(i3 - i4 - i7, i20, i3, i20 + i19);
        i3 -= i4 + i7 + this.G;
      }
      this.o.layout(i2, i20, i3, i19 + i20);
      return;
      i4 = 0;
      break;
      i21 = 0;
      break label383;
    }
    label533:
    int i8;
    int i9;
    if ((this.q) || (this.aj))
    {
      i8 = this.m.getMeasuredHeight();
      if (this.q)
      {
        i9 = this.o.getMeasuredHeight();
        label572:
        if (!this.r) {
          break label973;
        }
      }
    }
    label973:
    for (int i10 = Math.max(this.S, i9);; i10 = i9)
    {
      int i11 = i10 + i8;
      int i12 = 0 + (this.C - i11) / 2;
      if (this.e != null) {}
      for (int i13 = i2 + (aq.getIntrinsicWidth() + this.M);; i13 = i2)
      {
        this.m.layout(i13, i12, i13 + this.m.getMeasuredWidth(), i12 + i8);
        int i14 = i12 + (i8 + this.F);
        if ((this.q) && (this.r))
        {
          int i16 = i14 + (this.T - this.S) / 2;
          this.R.setBounds(i2, i16, i2 + this.S, i16 + this.S);
          i2 += this.S + this.G;
        }
        int i15 = i14 + (this.T - i9) / 2;
        if (this.aj)
        {
          if (this.am)
          {
            this.ab.layout(i3 - i6, i15, i3, i15 + i9);
            i3 -= i6 + this.G;
          }
          this.al.layout(i3 - i5, i15, i3, i15 + i9);
          i3 -= i5 + this.G;
        }
        if ((this.q) && (this.s))
        {
          this.p.layout(i3 - i4, i15, i3, i15 + i9);
          i3 -= i4 + this.G;
        }
        if (!this.q) {
          break;
        }
        this.o.layout(i2, i15, i3, i15 + i9);
        return;
        i9 = this.ab.getMeasuredHeight();
        break label572;
        int i17 = this.m.getMeasuredHeight();
        int i18 = 0 + (i1 - i17) / 2;
        this.m.layout(i2, i18, i2 + this.m.getMeasuredWidth(), i17 + i18);
        return;
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i5;
    int i3;
    int i4;
    if (View.MeasureSpec.getMode(paramInt1) == 0)
    {
      i1 = 0;
      i2 = i1 - 2 * this.D;
      if (this.f) {
        i2 -= this.I + this.E;
      }
      if (!this.ae) {
        break label669;
      }
      this.af.measure(0, paramInt2);
      int i12 = this.af.getMeasuredWidth();
      i5 = Math.max(0, this.af.getMeasuredHeight());
      i3 = i2 - (i12 + this.K);
      i4 = i12;
    }
    for (;;)
    {
      if (this.ac)
      {
        this.ag.measure(View.MeasureSpec.makeMeasureSpec(this.ah, 1073741824), paramInt2);
        i5 = Math.max(i5, this.ag.getMeasuredHeight());
        i3 -= this.ah + this.K;
      }
      if (this.x)
      {
        this.y.measure(0, paramInt2);
        Math.max(i5, this.y.getMeasuredHeight());
        i3 -= this.y.getMeasuredWidth();
      }
      if ((this.ae) || (this.ac) || (this.x)) {
        i3 -= this.H;
      }
      if (this.e != null) {}
      for (int i6 = i3 - (aq.getIntrinsicWidth() + this.G);; i6 = i3)
      {
        label272:
        int i7;
        int i10;
        if (this.u)
        {
          this.m.setCompoundDrawablesWithIntrinsicBounds(0, 0, aaw.pV, 0);
          this.m.setCompoundDrawablePadding(this.G);
          this.m.measure(View.MeasureSpec.makeMeasureSpec(i6, -2147483648), paramInt2);
          i7 = this.I;
          if (this.r) {
            i3 -= this.S + this.G;
          }
          if (!this.aj) {
            break label626;
          }
          this.ab.measure(0, 0);
          i10 = this.ak.getWidth() + this.G;
          int i11 = Math.min(i10 + this.ab.getMeasuredWidth() + this.G, i3 - i10);
          if (i11 >= i3 / 2) {
            break label611;
          }
          i3 -= i11;
          this.am = true;
          label391:
          this.T = Math.max(this.ak.getHeight(), this.ab.getMeasuredHeight());
          i7 = Math.max(i7, this.m.getMeasuredHeight() + this.F + this.T);
        }
        for (;;)
        {
          if (this.q)
          {
            this.o.measure(0, 0);
            int i9 = Math.min(this.o.getMeasuredWidth(), i3);
            this.T = Math.max(this.S, this.o.getMeasuredHeight());
            this.o.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(this.T, 1073741824));
            i7 = Math.max(i7, this.m.getMeasuredHeight() + this.F + this.T);
          }
          int i8 = Math.max(i7 + 2 * this.D, this.C);
          if (this.ae) {
            this.af.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
          }
          setMeasuredDimension(i1, i8);
          return;
          i1 = View.MeasureSpec.getSize(paramInt1);
          break;
          this.m.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          break label272;
          label611:
          i3 -= i10;
          this.am = false;
          break label391;
          label626:
          if (this.s)
          {
            this.p.measure(0, 0);
            i3 -= this.p.getMeasuredWidth() + this.G;
          }
        }
      }
      label669:
      i3 = i2;
      i4 = 0;
      i5 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jop
 * JD-Core Version:    0.7.0.1
 */