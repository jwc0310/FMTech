import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
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
import android.view.ViewDebug.ExportedProperty;
import java.text.NumberFormat;

public final class lox
  extends View
  implements kbb, lxj
{
  public final loj a;
  public llw b;
  public ipf c;
  public ipf d;
  public int e;
  private StaticLayout f;
  private StaticLayout g;
  private StaticLayout h;
  private StaticLayout i;
  private ife j;
  private ife k;
  private Rect l;
  private Rect m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private final lwj u;
  
  public lox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = loj.a(paramContext);
    this.m = new Rect();
    this.l = new Rect();
    this.u = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public final void D_()
  {
    ap_();
    this.b = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.c = null;
    this.j = null;
    this.d = null;
    this.k = null;
    this.m.setEmpty();
    this.l.setEmpty();
    this.n = 0;
    this.o = 0;
    this.e = 0;
    this.p = 0;
    this.q = 0;
    this.r = 0;
    this.s = 0;
    this.t = 0;
  }
  
  public final void a(kaz paramkaz)
  {
    if ((paramkaz == this.j) && (this.j.q == 1)) {
      invalidate();
    }
    if ((paramkaz == this.k) && (this.k.q == 1)) {
      invalidate();
    }
  }
  
  public final void ap_()
  {
    if (this.j != null)
    {
      this.j.b(this);
      this.j = null;
    }
    if (this.k != null)
    {
      this.k.b(this);
      this.k = null;
    }
  }
  
  public final void b()
  {
    if (lwo.a(this))
    {
      if (this.c != null) {
        this.j = this.a.d.a(this.c, 3, this);
      }
      if (this.d != null) {
        this.k = this.a.d.a(this.d, this.e, this.e, this);
      }
    }
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    if (this.b == null) {
      return "";
    }
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.b.a;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.b.b;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = Float.toString(this.b.f);
      efj.a(localStringBuilder, arrayOfCharSequence3);
      int i1 = this.b.e;
      CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
      Resources localResources = getResources();
      int i2 = aau.Dj;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i1);
      arrayOfCharSequence4[0] = localResources.getQuantityString(i2, i1, arrayOfObject);
      efj.a(localStringBuilder, arrayOfCharSequence4);
      return mfx.b(localStringBuilder);
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i9;
    int i10;
    float f4;
    if (this.j != null)
    {
      Bitmap localBitmap2 = this.j.j();
      if (localBitmap2 != null)
      {
        if ((this.l.isEmpty()) || (this.m.isEmpty()))
        {
          this.l.set(0, 0, 0 + this.o, 0 + this.n);
          Rect localRect = this.l;
          i9 = localBitmap2.getWidth();
          i10 = localBitmap2.getHeight();
          float f3 = i9 / i10;
          f4 = localRect.width() / localRect.height();
          if (f3 <= f4) {
            break label585;
          }
          int i12 = (i9 - (int)(f4 * i10)) / 2;
          this.m.set(i12, 0, i9 - i12, i10);
        }
        paramCanvas.drawBitmap(localBitmap2, this.m, this.l, this.a.F);
      }
    }
    int i1 = 0 + this.r;
    int i2 = 0 + this.p;
    int i3;
    if (this.k != null)
    {
      Bitmap localBitmap1 = this.k.j();
      if (localBitmap1 != null)
      {
        paramCanvas.drawBitmap(localBitmap1, i1, i2, this.a.F);
        i3 = i1 + this.e;
      }
    }
    for (;;)
    {
      label231:
      paramCanvas.drawRect(i3, i2, i3 + this.s, i2 + this.t, this.a.s);
      int i4 = i3 + this.a.m;
      int i5 = 0 + this.q;
      if (this.f != null)
      {
        paramCanvas.translate(i4, i5);
        this.f.draw(paramCanvas);
        paramCanvas.translate(-i4, -i5);
        i5 += this.f.getHeight() + this.a.l;
      }
      if (this.g != null)
      {
        paramCanvas.translate(i4, i5);
        this.g.draw(paramCanvas);
        paramCanvas.translate(-i4, -i5);
        i5 += this.g.getHeight() + this.a.l;
      }
      if (this.h != null)
      {
        paramCanvas.translate(i4, i5);
        this.h.draw(paramCanvas);
        paramCanvas.translate(-i4, -i5);
        i4 += this.a.m + this.a.k;
      }
      float f1 = this.b.f;
      if (f1 > 0.0F) {
        if (this.h == null) {
          break label756;
        }
      }
      label528:
      label585:
      label756:
      for (int i6 = i5 + (this.h.getHeight() - this.a.aC.getHeight()) / 2;; i6 = i5)
      {
        int i7 = this.a.aJ + this.a.aC.getWidth();
        int i8 = i4;
        float f2 = 1.0F;
        if (f2 <= 5.0F)
        {
          if (f1 > f2) {
            paramCanvas.drawBitmap(this.a.aC, i8, i6, this.a.F);
          }
          for (;;)
          {
            i8 += i7;
            f2 += 1.0F;
            break label528;
            int i11 = (i10 - (int)(i9 / f4)) / 2;
            this.m.set(0, i11, i9, i10 - i11);
            break;
            i3 = i1 + this.e / 2;
            break label231;
            if (f1 > f2 - 0.5F) {
              paramCanvas.drawBitmap(this.a.aD, i8, i6, this.a.F);
            } else {
              paramCanvas.drawBitmap(this.a.aE, i8, i6, this.a.F);
            }
          }
        }
        i4 = i8 + this.a.aJ;
        if (this.i != null)
        {
          paramCanvas.translate(i4, i5);
          this.i.draw(paramCanvas);
          paramCanvas.translate(-i4, -i5);
          this.i.getHeight();
        }
        return;
      }
      i3 = i1;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    Context localContext = getContext();
    Resources localResources = getResources();
    String str1 = this.b.a;
    String str2 = this.b.b;
    int i2 = this.b.e;
    float f1 = this.b.f;
    int i3 = i1 - 2 * this.a.aK;
    if (this.d != null) {
      i3 -= this.e;
    }
    this.s = Math.min(i3, this.a.aN);
    this.t = this.e;
    int i4 = this.s - 2 * this.a.m;
    lwj locallwj4;
    TextPaint localTextPaint2;
    int i20;
    Layout.Alignment localAlignment4;
    TextUtils.TruncateAt localTruncateAt4;
    int i21;
    Object localObject4;
    StaticLayout localStaticLayout4;
    if (!TextUtils.isEmpty(str1))
    {
      locallwj4 = this.u;
      localTextPaint2 = efj.B(localContext, aw.et);
      i20 = this.a.aF;
      localAlignment4 = Layout.Alignment.ALIGN_NORMAL;
      localTruncateAt4 = TextUtils.TruncateAt.END;
      i21 = Math.max(i4, 0);
      if (i20 == 0)
      {
        localObject4 = "";
        localStaticLayout4 = new StaticLayout((CharSequence)localObject4, localTextPaint2, i21, localAlignment4, 1.0F, 0.0F, false);
        label202:
        this.f = localStaticLayout4;
      }
    }
    for (int i5 = 0 + (this.f.getHeight() + this.a.l);; i5 = 0)
    {
      TextPaint localTextPaint1 = efj.B(localContext, aw.ee);
      lwj locallwj3;
      int i17;
      Layout.Alignment localAlignment3;
      TextUtils.TruncateAt localTruncateAt3;
      int i18;
      Object localObject3;
      label287:
      StaticLayout localStaticLayout3;
      if (!TextUtils.isEmpty(str2))
      {
        locallwj3 = this.u;
        i17 = this.a.aG;
        localAlignment3 = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt3 = TextUtils.TruncateAt.END;
        i18 = Math.max(i4, 0);
        if (i17 == 0)
        {
          localObject3 = "";
          localStaticLayout3 = new StaticLayout((CharSequence)localObject3, localTextPaint1, i18, localAlignment3, 1.0F, 0.0F, false);
          label307:
          this.g = localStaticLayout3;
        }
      }
      for (int i6 = i5 + (this.g.getHeight() + this.a.l);; i6 = i5)
      {
        lwj locallwj2;
        String str4;
        int i14;
        Layout.Alignment localAlignment2;
        TextUtils.TruncateAt localTruncateAt2;
        int i15;
        Object localObject2;
        label393:
        StaticLayout localStaticLayout2;
        label413:
        lwj locallwj1;
        String str3;
        int i11;
        Layout.Alignment localAlignment1;
        TextUtils.TruncateAt localTruncateAt1;
        int i12;
        Object localObject1;
        label529:
        StaticLayout localStaticLayout1;
        label549:
        int i8;
        if (f1 > 0.0F)
        {
          locallwj2 = this.u;
          str4 = NumberFormat.getInstance().format(f1);
          i14 = this.a.aI;
          localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
          localTruncateAt2 = TextUtils.TruncateAt.END;
          i15 = Math.max(i4, 0);
          if (i14 == 0)
          {
            localObject2 = "";
            localStaticLayout2 = new StaticLayout((CharSequence)localObject2, localTextPaint1, i15, localAlignment2, 1.0F, 0.0F, false);
            this.h = localStaticLayout2;
          }
        }
        else
        {
          int i7 = i4 - 5 * (this.a.aJ + this.a.aC.getWidth());
          if ((i2 <= 0) || (i7 <= 0)) {
            break label1399;
          }
          locallwj1 = this.u;
          int i10 = aau.Dj;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i2);
          str3 = localResources.getQuantityString(i10, i2, arrayOfObject);
          i11 = this.a.aH;
          localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
          localTruncateAt1 = TextUtils.TruncateAt.END;
          i12 = Math.max(i7, 0);
          if (i11 != 0) {
            break label1210;
          }
          localObject1 = "";
          localStaticLayout1 = new StaticLayout((CharSequence)localObject1, localTextPaint1, i12, localAlignment1, 1.0F, 0.0F, false);
          this.i = localStaticLayout1;
          if (this.h == null) {
            break label1384;
          }
          i8 = i6 + Math.max(this.h.getHeight(), this.i.getHeight());
        }
        for (;;)
        {
          this.n = Math.max(this.e + this.a.aL + this.a.aM, i8);
          this.o = i1;
          this.p = ((this.n - this.e) / 2);
          this.q = ((this.n - i8) / 2);
          int i9 = i1 - this.s;
          if (this.d != null) {
            i9 -= this.e;
          }
          this.r = (i9 / 2);
          setMeasuredDimension(i1, this.n);
          return;
          if (i20 == 1)
          {
            localObject4 = locallwj4.a(str1, localTextPaint2, i21, localTruncateAt4, null);
            break;
          }
          localStaticLayout4 = new StaticLayout(str1, localTextPaint2, i21, localAlignment4, 1.0F, 0.0F, false);
          if (localStaticLayout4.getLineCount() <= i20) {
            break label202;
          }
          int i22 = localStaticLayout4.getLineEnd(i20 - 2);
          SpannableStringBuilder localSpannableStringBuilder4 = new SpannableStringBuilder(str1.subSequence(0, i22));
          boolean bool4 = str1 instanceof Spanned;
          if (bool4) {
            efj.k();
          }
          for (lwm locallwm4 = locallwj4.b;; locallwm4 = null)
          {
            localSpannableStringBuilder4.append(locallwj4.a(str1.subSequence(i22, str1.length()), localTextPaint2, i21, localTruncateAt4, locallwm4));
            if (bool4) {
              lwj.a((Spanned)str1, i22, localSpannableStringBuilder4, locallwm4);
            }
            localObject4 = localSpannableStringBuilder4;
            break;
          }
          if (i17 == 1)
          {
            localObject3 = locallwj3.a(str2, localTextPaint1, i18, localTruncateAt3, null);
            break label287;
          }
          localStaticLayout3 = new StaticLayout(str2, localTextPaint1, i18, localAlignment3, 1.0F, 0.0F, false);
          if (localStaticLayout3.getLineCount() <= i17) {
            break label307;
          }
          int i19 = localStaticLayout3.getLineEnd(i17 - 2);
          SpannableStringBuilder localSpannableStringBuilder3 = new SpannableStringBuilder(str2.subSequence(0, i19));
          boolean bool3 = str2 instanceof Spanned;
          if (bool3) {
            efj.k();
          }
          for (lwm locallwm3 = locallwj3.b;; locallwm3 = null)
          {
            localSpannableStringBuilder3.append(locallwj3.a(str2.subSequence(i19, str2.length()), localTextPaint1, i18, localTruncateAt3, locallwm3));
            if (bool3) {
              lwj.a((Spanned)str2, i19, localSpannableStringBuilder3, locallwm3);
            }
            localObject3 = localSpannableStringBuilder3;
            break;
          }
          if (i14 == 1)
          {
            localObject2 = locallwj2.a(str4, localTextPaint1, i15, localTruncateAt2, null);
            break label393;
          }
          localStaticLayout2 = new StaticLayout(str4, localTextPaint1, i15, localAlignment2, 1.0F, 0.0F, false);
          if (localStaticLayout2.getLineCount() <= i14) {
            break label413;
          }
          int i16 = localStaticLayout2.getLineEnd(i14 - 2);
          SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(str4.subSequence(0, i16));
          boolean bool2 = str4 instanceof Spanned;
          if (bool2) {
            efj.k();
          }
          for (lwm locallwm2 = locallwj2.b;; locallwm2 = null)
          {
            localSpannableStringBuilder2.append(locallwj2.a(str4.subSequence(i16, str4.length()), localTextPaint1, i15, localTruncateAt2, locallwm2));
            if (bool2) {
              lwj.a((Spanned)str4, i16, localSpannableStringBuilder2, locallwm2);
            }
            localObject2 = localSpannableStringBuilder2;
            break;
          }
          label1210:
          if (i11 == 1)
          {
            localObject1 = locallwj1.a(str3, localTextPaint1, i12, localTruncateAt1, null);
            break label529;
          }
          localStaticLayout1 = new StaticLayout(str3, localTextPaint1, i12, localAlignment1, 1.0F, 0.0F, false);
          if (localStaticLayout1.getLineCount() <= i11) {
            break label549;
          }
          int i13 = localStaticLayout1.getLineEnd(i11 - 2);
          SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str3.subSequence(0, i13));
          boolean bool1 = str3 instanceof Spanned;
          if (bool1) {
            efj.k();
          }
          for (lwm locallwm1 = locallwj1.b;; locallwm1 = null)
          {
            localSpannableStringBuilder1.append(locallwj1.a(str3.subSequence(i13, str3.length()), localTextPaint1, i12, localTruncateAt1, locallwm1));
            if (bool1) {
              lwj.a((Spanned)str3, i13, localSpannableStringBuilder1, locallwm1);
            }
            localObject1 = localSpannableStringBuilder1;
            break;
          }
          label1384:
          i8 = i6 + this.i.getHeight();
          continue;
          label1399:
          if (this.h != null)
          {
            this.i = null;
            i8 = i6 + this.h.getHeight();
          }
          else
          {
            i8 = i6;
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lox
 * JD-Core Version:    0.7.0.1
 */