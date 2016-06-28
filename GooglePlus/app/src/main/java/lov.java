import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public abstract class lov
  extends View
  implements kbb, lxj
{
  private ife a;
  public final loj b;
  public ipf c;
  public Rect d;
  public int e;
  public int f;
  public final Paint g = new Paint(2);
  public long h;
  private Rect i;
  private Rect j;
  private float k = 1.0F;
  private Runnable l;
  private boolean m = true;
  private StaticLayout n;
  private StaticLayout o;
  private StaticLayout p;
  private final lwj q;
  
  public lov(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lov(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  public lov(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = loj.a(paramContext);
    this.i = new Rect();
    this.j = new Rect();
    this.d = new Rect();
    this.g.setAlpha(255);
    this.h = 0L;
    this.q = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    if (g())
    {
      Rect localRect2 = this.d;
      localRect2.top -= paramInt2;
      return paramInt1;
    }
    Rect localRect1 = this.d;
    localRect1.bottom = (paramInt2 + localRect1.bottom);
    return paramInt1 + paramInt2;
  }
  
  private static int a(Canvas paramCanvas, StaticLayout paramStaticLayout, int paramInt1, int paramInt2)
  {
    if (paramStaticLayout != null)
    {
      paramCanvas.translate(paramInt1, paramInt2);
      paramStaticLayout.draw(paramCanvas);
      paramCanvas.translate(-paramInt1, -paramInt2);
      paramInt2 += paramStaticLayout.getHeight();
    }
    return paramInt2;
  }
  
  public void D_()
  {
    this.n = null;
    this.o = null;
    this.p = null;
    this.c = null;
    this.i.setEmpty();
    this.j.setEmpty();
    this.d.setEmpty();
    this.e = 0;
    this.f = 0;
    this.k = 1.0F;
    if (this.l != null)
    {
      efj.m().removeCallbacks(this.l);
      this.l = null;
    }
    this.g.setAlpha(255);
    this.h = 0L;
    this.m = true;
  }
  
  public int a(Context paramContext, int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  public int a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    return paramInt2;
  }
  
  public void a(Canvas paramCanvas)
  {
    if (g())
    {
      this.b.Z.setBounds(this.d.left, this.d.top - this.b.m, this.d.right, this.d.bottom);
      this.b.Z.draw(paramCanvas);
      return;
    }
    paramCanvas.drawRect(this.d, this.b.r);
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.a != null)
    {
      this.a.b(this);
      this.a = null;
    }
  }
  
  public final void b()
  {
    if (this.c != null)
    {
      this.a = this.b.d.a(this.c, 3, null, 64, this);
      if (this.a.p != null) {
        break label48;
      }
    }
    label48:
    for (boolean bool = true;; bool = false)
    {
      this.m = bool;
      return;
    }
  }
  
  public abstract String d();
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  public abstract String e();
  
  public abstract String f();
  
  public final boolean g()
  {
    return this.f >= this.b.B;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.onDraw(paramCanvas);
    int i2 = getMeasuredWidth();
    Bitmap localBitmap3;
    int i4;
    int i3;
    if (this.a != null)
    {
      localBitmap3 = this.a.j();
      i4 = ife.b(this.a.p);
      ife localife = this.a;
      i3 = localife.k();
    }
    for (Bitmap localBitmap1 = localBitmap3;; localBitmap1 = null)
    {
      float f1;
      int i13;
      label187:
      int i14;
      label276:
      label292:
      int i15;
      label305:
      int i16;
      label350:
      int i17;
      label363:
      int i9;
      label417:
      int i10;
      if (localBitmap1 != null) {
        if ((this.m) && (this.m))
        {
          this.g.setAlpha(0);
          this.h = (250L + System.currentTimeMillis());
          this.m = false;
          if (this.l != null)
          {
            efj.m().removeCallbacks(this.l);
            efj.m().post(this.l);
          }
        }
        else
        {
          f1 = 1.0F * i3 / i4;
          if (this.i.isEmpty()) {
            this.i.set(0, 0, i4, i3);
          }
          if (Math.abs(this.k - f1) >= 0.01F) {
            break label656;
          }
          i13 = i1;
          if (this.j.isEmpty())
          {
            if (i13 == 0) {
              break label662;
            }
            int i26 = (i2 - this.e) / 2;
            this.j.set(i26, 0, i2 - i26, this.f);
          }
          paramCanvas.save();
          paramCanvas.clipRect(0, 0, i2 + 0, 0 + this.f);
          paramCanvas.translate(0.0F, 0.0F);
          if (i13 == 0)
          {
            if (this.j.height() >= this.f) {
              break label767;
            }
            Rect localRect1 = this.b.E;
            if (i1 == 0) {
              break label772;
            }
            i14 = i2;
            if (i1 == 0) {
              break label784;
            }
            i15 = this.j.top;
            localRect1.set(0, 0, i14, i15);
            paramCanvas.drawRect(this.b.E, this.b.r);
            Rect localRect2 = this.b.E;
            if (i1 == 0) {
              break label793;
            }
            i16 = 0;
            if (i1 == 0) {
              break label805;
            }
            i17 = this.j.bottom;
            localRect2.set(i16, i17, i2, this.f);
            paramCanvas.drawRect(this.b.E, this.b.r);
          }
          paramCanvas.drawBitmap(localBitmap1, this.i, this.j, this.g);
          paramCanvas.restore();
          int i6 = 0 + this.f;
          if (g()) {
            i6 -= this.d.height();
          }
          a(paramCanvas);
          int i7 = 0 + this.b.m;
          if (this.n != null)
          {
            int i12 = i6 + this.b.m;
            i6 = a(paramCanvas, this.n, i7, i12);
          }
          if ((this.o != null) || (this.p != null)) {
            i6 += this.b.m;
          }
          int i8 = a(paramCanvas, this.o, i7, i6);
          i9 = a(paramCanvas, this.p, i7, i8);
          i10 = i7 - this.b.m;
          if ((this.o == null) && (this.p == null)) {
            break label885;
          }
        }
      }
      label656:
      label662:
      label793:
      label805:
      label885:
      for (int i11 = this.b.o;; i11 = this.b.m)
      {
        a(paramCanvas, i10, i11 + i9);
        if ((isPressed()) || (isFocused()))
        {
          this.b.x.setBounds(0, 0, getWidth(), getHeight());
          this.b.x.draw(paramCanvas);
        }
        return;
        this.l = new low(this);
        break;
        i13 = 0;
        break label187;
        int i18 = (int)(f1 * i2);
        int i25;
        int i23;
        int i22;
        int i24;
        if (i18 <= this.f)
        {
          i25 = (this.f - i18) / 2;
          i23 = i18;
          i22 = i2;
          i24 = 0;
        }
        for (;;)
        {
          this.j.set(i24, i25, i22 + i24, i23 + i25);
          break;
          int i19 = this.f;
          int i20 = (int)(this.f / f1);
          int i21 = (i2 - i20) / 2;
          i22 = i20;
          i23 = i19;
          i24 = i21;
          i25 = 0;
        }
        label767:
        i1 = 0;
        break label276;
        i14 = this.j.left;
        break label292;
        i15 = this.f;
        break label305;
        i16 = this.j.right;
        break label350;
        i17 = 0;
        break label363;
        if (this.a == null) {
          break label417;
        }
        int i5 = this.a.q;
        Bitmap localBitmap2 = this.b.aS;
        if ((i5 != 5) && (i5 != 3)) {
          break label417;
        }
        paramCanvas.drawBitmap(localBitmap2, 0 + (i2 - localBitmap2.getWidth()) / 2, 0 + (this.f - localBitmap2.getHeight()) / 2, null);
        break label417;
      }
      label772:
      label784:
      i3 = 0;
      i4 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = this.f;
    int i2 = View.MeasureSpec.getSize(paramInt1);
    this.d.set(0, i1, i2, i1);
    int i3 = i2 - 2 * this.b.m;
    int i4;
    int i5;
    label69:
    int i6;
    label82:
    int i20;
    String str3;
    TextPaint localTextPaint3;
    lwj locallwj3;
    int i22;
    Layout.Alignment localAlignment3;
    TextUtils.TruncateAt localTruncateAt3;
    int i23;
    Object localObject3;
    label174:
    StaticLayout localStaticLayout3;
    label194:
    int i25;
    int i21;
    if (!TextUtils.isEmpty(d()))
    {
      i4 = 1;
      if (TextUtils.isEmpty(e())) {
        break label626;
      }
      i5 = 1;
      if (TextUtils.isEmpty(f())) {
        break label632;
      }
      i6 = 1;
      if (i4 != 0)
      {
        int i19 = this.b.m;
        i20 = a(i1, i19);
        str3 = d();
        if (TextUtils.isEmpty(str3)) {
          break label1284;
        }
        localTextPaint3 = efj.B(getContext(), az.ab);
        locallwj3 = this.q;
        i22 = this.b.V;
        localAlignment3 = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt3 = TextUtils.TruncateAt.END;
        i23 = Math.max(i3, 0);
        if (i22 != 0) {
          break label638;
        }
        localObject3 = "";
        localStaticLayout3 = new StaticLayout((CharSequence)localObject3, localTextPaint3, i23, localAlignment3, 1.0F, 0.0F, false);
        this.n = localStaticLayout3;
        i25 = this.n.getHeight();
        if (!g()) {
          break label812;
        }
        Rect localRect8 = this.d;
        localRect8.top -= i25;
        i21 = i20;
      }
    }
    for (;;)
    {
      label239:
      i1 = i21;
      String str1;
      TextPaint localTextPaint2;
      lwj locallwj2;
      int i15;
      Layout.Alignment localAlignment2;
      TextUtils.TruncateAt localTruncateAt2;
      int i16;
      Object localObject2;
      label338:
      StaticLayout localStaticLayout2;
      label358:
      int i18;
      label399:
      String str2;
      TextPaint localTextPaint1;
      lwj locallwj1;
      int i11;
      Layout.Alignment localAlignment1;
      TextUtils.TruncateAt localTruncateAt1;
      int i12;
      Object localObject1;
      label468:
      StaticLayout localStaticLayout1;
      label488:
      int i14;
      if ((i6 != 0) || (i5 != 0))
      {
        int i7 = this.b.m;
        i1 = a(i1, i7);
        str1 = f();
        if (!TextUtils.isEmpty(str1))
        {
          localTextPaint2 = efj.B(getContext(), az.Z);
          locallwj2 = this.q;
          i15 = this.b.W;
          localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
          localTruncateAt2 = TextUtils.TruncateAt.END;
          i16 = Math.max(i3, 0);
          if (i15 != 0) {
            break label841;
          }
          localObject2 = "";
          localStaticLayout2 = new StaticLayout((CharSequence)localObject2, localTextPaint2, i16, localAlignment2, 1.0F, 0.0F, false);
          this.o = localStaticLayout2;
          i18 = this.o.getHeight();
          if (!g()) {
            break label1015;
          }
          Rect localRect6 = this.d;
          localRect6.top -= i18;
        }
        str2 = e();
        if (!TextUtils.isEmpty(str2))
        {
          localTextPaint1 = efj.B(getContext(), az.Y);
          locallwj1 = this.q;
          i11 = this.b.W;
          localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
          localTruncateAt1 = TextUtils.TruncateAt.END;
          i12 = Math.max(i3, 0);
          if (i11 != 0) {
            break label1042;
          }
          localObject1 = "";
          localStaticLayout1 = new StaticLayout((CharSequence)localObject1, localTextPaint1, i12, localAlignment1, 1.0F, 0.0F, false);
          this.p = localStaticLayout1;
          i14 = this.p.getHeight();
          if (!g()) {
            break label1216;
          }
          Rect localRect4 = this.d;
          localRect4.top -= i14;
        }
      }
      label529:
      int i8;
      label548:
      int i9;
      int i10;
      if ((i6 != 0) || (i5 != 0))
      {
        i8 = this.b.o;
        i9 = a(i1, i8);
        i10 = a(getContext(), i9, i2) - i9;
        if (!g()) {
          break label1255;
        }
        Rect localRect2 = this.d;
        localRect2.top -= i10;
      }
      for (;;)
      {
        setMeasuredDimension(i2, a(i9, this.b.m));
        return;
        i4 = 0;
        break;
        label626:
        i5 = 0;
        break label69;
        label632:
        i6 = 0;
        break label82;
        label638:
        if (i22 == 1)
        {
          localObject3 = locallwj3.a(str3, localTextPaint3, i23, localTruncateAt3, null);
          break label174;
        }
        localStaticLayout3 = new StaticLayout(str3, localTextPaint3, i23, localAlignment3, 1.0F, 0.0F, false);
        if (localStaticLayout3.getLineCount() <= i22) {
          break label194;
        }
        int i24 = localStaticLayout3.getLineEnd(i22 - 2);
        SpannableStringBuilder localSpannableStringBuilder3 = new SpannableStringBuilder(str3.subSequence(0, i24));
        boolean bool3 = str3 instanceof Spanned;
        if (bool3) {
          efj.k();
        }
        for (lwm locallwm3 = locallwj3.b;; locallwm3 = null)
        {
          localSpannableStringBuilder3.append(locallwj3.a(str3.subSequence(i24, str3.length()), localTextPaint3, i23, localTruncateAt3, locallwm3));
          if (bool3) {
            lwj.a((Spanned)str3, i24, localSpannableStringBuilder3, locallwm3);
          }
          localObject3 = localSpannableStringBuilder3;
          break;
        }
        label812:
        Rect localRect7 = this.d;
        localRect7.bottom = (i25 + localRect7.bottom);
        i21 = i25 + i20;
        break label239;
        label841:
        if (i15 == 1)
        {
          localObject2 = locallwj2.a(str1, localTextPaint2, i16, localTruncateAt2, null);
          break label338;
        }
        localStaticLayout2 = new StaticLayout(str1, localTextPaint2, i16, localAlignment2, 1.0F, 0.0F, false);
        if (localStaticLayout2.getLineCount() <= i15) {
          break label358;
        }
        int i17 = localStaticLayout2.getLineEnd(i15 - 2);
        SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(str1.subSequence(0, i17));
        boolean bool2 = str1 instanceof Spanned;
        if (bool2) {
          efj.k();
        }
        for (lwm locallwm2 = locallwj2.b;; locallwm2 = null)
        {
          localSpannableStringBuilder2.append(locallwj2.a(str1.subSequence(i17, str1.length()), localTextPaint2, i16, localTruncateAt2, locallwm2));
          if (bool2) {
            lwj.a((Spanned)str1, i17, localSpannableStringBuilder2, locallwm2);
          }
          localObject2 = localSpannableStringBuilder2;
          break;
        }
        label1015:
        Rect localRect5 = this.d;
        localRect5.bottom = (i18 + localRect5.bottom);
        i1 = i18 + i1;
        break label399;
        label1042:
        if (i11 == 1)
        {
          localObject1 = locallwj1.a(str2, localTextPaint1, i12, localTruncateAt1, null);
          break label468;
        }
        localStaticLayout1 = new StaticLayout(str2, localTextPaint1, i12, localAlignment1, 1.0F, 0.0F, false);
        if (localStaticLayout1.getLineCount() <= i11) {
          break label488;
        }
        int i13 = localStaticLayout1.getLineEnd(i11 - 2);
        SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str2.subSequence(0, i13));
        boolean bool1 = str2 instanceof Spanned;
        if (bool1) {
          efj.k();
        }
        for (lwm locallwm1 = locallwj1.b;; locallwm1 = null)
        {
          localSpannableStringBuilder1.append(locallwj1.a(str2.subSequence(i13, str2.length()), localTextPaint1, i12, localTruncateAt1, locallwm1));
          if (bool1) {
            lwj.a((Spanned)str2, i13, localSpannableStringBuilder1, locallwm1);
          }
          localObject1 = localSpannableStringBuilder1;
          break;
        }
        label1216:
        Rect localRect3 = this.d;
        localRect3.bottom = (i14 + localRect3.bottom);
        i1 += i14;
        break label529;
        i8 = this.b.m;
        break label548;
        label1255:
        Rect localRect1 = this.d;
        localRect1.bottom = (i10 + localRect1.bottom);
        i9 += i10;
      }
      label1284:
      i21 = i20;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lov
 * JD-Core Version:    0.7.0.1
 */