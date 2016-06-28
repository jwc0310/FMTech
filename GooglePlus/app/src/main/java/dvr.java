import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

public final class dvr
  implements lwu
{
  private static boolean b;
  private static int c;
  private static int d;
  private static int e;
  public Rect a;
  private boolean f;
  private Bitmap g;
  private NinePatchDrawable h;
  private NinePatchDrawable i;
  private dvs j;
  private CharSequence k;
  private int l;
  private StaticLayout m;
  
  public dvr(Context paramContext, Bitmap paramBitmap, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2, CharSequence paramCharSequence, boolean paramBoolean)
  {
    this(paramContext, paramBitmap, null, null, paramNinePatchDrawable1, paramNinePatchDrawable2, paramdvs, paramInt1, paramInt2, paramCharSequence, paramBoolean, false, -1, 0, 0);
  }
  
  public dvr(Context paramContext, Bitmap paramBitmap, CharSequence paramCharSequence, TextPaint paramTextPaint, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2)
  {
    this(paramContext, null, paramCharSequence, paramTextPaint, paramNinePatchDrawable1, paramNinePatchDrawable2, null, paramInt1, paramInt2, paramCharSequence, false, 0);
  }
  
  public dvr(Context paramContext, Bitmap paramBitmap, CharSequence paramCharSequence1, TextPaint paramTextPaint, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2, CharSequence paramCharSequence2, boolean paramBoolean, int paramInt3)
  {
    this(paramContext, paramBitmap, paramCharSequence1, paramTextPaint, paramNinePatchDrawable1, paramNinePatchDrawable2, paramdvs, paramInt1, paramInt2, paramCharSequence2, true, false, -1, 0, 0);
  }
  
  public dvr(Context paramContext, Bitmap paramBitmap, CharSequence paramCharSequence1, TextPaint paramTextPaint, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2, CharSequence paramCharSequence2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    this(paramContext, paramBitmap, paramCharSequence1, paramTextPaint, paramNinePatchDrawable1, paramNinePatchDrawable2, paramdvs, paramInt1, paramInt2, paramCharSequence2, true, true, 0, 0, 0);
  }
  
  public dvr(Context paramContext, Bitmap paramBitmap, CharSequence paramCharSequence1, TextPaint paramTextPaint, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2, CharSequence paramCharSequence2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (!b)
    {
      b = true;
      Resources localResources = paramContext.getResources();
      c = (int)localResources.getDimension(efj.li);
      d = (int)localResources.getDimension(efj.lh);
      e = (int)localResources.getDimension(efj.lg);
    }
    lwj locallwj;
    int n;
    label119:
    int i1;
    label131:
    int i2;
    label148:
    int i7;
    int i4;
    int i8;
    label165:
    int i9;
    label172:
    int i12;
    if (paramInt3 >= 0)
    {
      this.l = paramInt3;
      this.g = paramBitmap;
      this.h = paramNinePatchDrawable1;
      this.i = paramNinePatchDrawable2;
      this.j = paramdvs;
      this.k = paramCharSequence2;
      locallwj = (lwj)mbb.a(paramContext, lwj.class);
      if (paramNinePatchDrawable1 == null) {
        break label255;
      }
      n = paramNinePatchDrawable1.getMinimumWidth();
      if (paramNinePatchDrawable1 == null) {
        break label261;
      }
      i1 = paramNinePatchDrawable1.getMinimumHeight();
      if ((this.g == null) || (paramCharSequence1 == null)) {
        break label267;
      }
      i2 = this.l;
      if (paramCharSequence1 != null) {
        break label273;
      }
      i7 = 0;
      i4 = 0;
      if (paramBitmap != null) {
        break label500;
      }
      i8 = 0;
      if (paramBitmap != null) {
        break label509;
      }
      i9 = 0;
      if (!paramBoolean1) {
        break label526;
      }
      if (!paramBoolean2) {
        break label518;
      }
      i12 = d;
    }
    label187:
    for (int i10 = i12 * 2;; i10 = 0)
    {
      int i11 = i2 + (i8 + i4);
      this.a = new Rect(paramInt1, paramInt2, i10 + (paramInt1 + Math.max(n, i11)), paramInt2 + Math.max(i1, Math.max(i7, i9)));
      return;
      paramInt3 = e;
      break;
      label255:
      n = 0;
      break label119;
      i1 = 0;
      break label131;
      i2 = 0;
      break label148;
      int i3 = lwj.a(paramTextPaint, paramCharSequence1.toString());
      if (paramInt4 == 0) {}
      Layout.Alignment localAlignment;
      TextUtils.TruncateAt localTruncateAt;
      int i5;
      StaticLayout localStaticLayout;
      for (i4 = i3;; i4 = Math.min(paramInt4, i3))
      {
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt = TextUtils.TruncateAt.END;
        i5 = Math.max(i4, 0);
        localStaticLayout = new StaticLayout(paramCharSequence1, paramTextPaint, i5, localAlignment, 1.0F, 0.0F, false);
        if (localStaticLayout.getLineCount() > 2147483647) {
          break label372;
        }
        this.m = localStaticLayout;
        i7 = this.m.getHeight();
        break;
      }
      label372:
      int i6 = localStaticLayout.getLineEnd(2147483645);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence1.subSequence(0, i6));
      boolean bool = paramCharSequence1 instanceof Spanned;
      if (bool) {
        efj.k();
      }
      for (lwm locallwm = locallwj.b;; locallwm = null)
      {
        localSpannableStringBuilder.append(locallwj.a(paramCharSequence1.subSequence(i6, paramCharSequence1.length()), paramTextPaint, i5, localTruncateAt, locallwm));
        if (bool) {
          lwj.a((Spanned)paramCharSequence1, i6, localSpannableStringBuilder, locallwm);
        }
        localStaticLayout = new StaticLayout(localSpannableStringBuilder, paramTextPaint, i5, localAlignment, 1.0F, 0.0F, false);
        break;
      }
      label500:
      i8 = paramBitmap.getWidth();
      break label165;
      label509:
      i9 = paramBitmap.getHeight();
      break label172;
      i12 = c;
      break label187;
    }
  }
  
  public dvr(Context paramContext, CharSequence paramCharSequence, TextPaint paramTextPaint, NinePatchDrawable paramNinePatchDrawable1, NinePatchDrawable paramNinePatchDrawable2, dvs paramdvs, int paramInt1, int paramInt2)
  {
    this(paramContext, null, paramCharSequence, paramTextPaint, paramNinePatchDrawable1, paramNinePatchDrawable2, paramdvs, paramInt1, paramInt2, paramCharSequence, false, 0);
  }
  
  public final Rect a()
  {
    return this.a;
  }
  
  public final void a(int paramInt)
  {
    if (this.a != null) {
      this.a.right = (paramInt + this.a.left);
    }
  }
  
  public final void a(Canvas paramCanvas)
  {
    NinePatchDrawable localNinePatchDrawable;
    int n;
    label38:
    int i1;
    label55:
    int i2;
    label69:
    int i3;
    if (this.f)
    {
      localNinePatchDrawable = this.i;
      if (localNinePatchDrawable != null)
      {
        localNinePatchDrawable.setBounds(this.a);
        localNinePatchDrawable.draw(paramCanvas);
      }
      if (this.g != null) {
        break label227;
      }
      n = 0;
      if ((this.g != null) && (this.m != null)) {
        break label238;
      }
      i1 = 0;
      StaticLayout localStaticLayout = this.m;
      i2 = 0;
      if (localStaticLayout != null) {
        break label247;
      }
      i3 = this.a.left + (this.a.width() - n - i1 - i2) / 2;
      if (this.g == null) {
        break label259;
      }
      int i6 = this.a.top + (this.a.height() - this.g.getHeight()) / 2;
      paramCanvas.drawBitmap(this.g, i3, i6, null);
    }
    label259:
    for (int i4 = i3 + (n + i1);; i4 = i3)
    {
      if (this.m != null)
      {
        int i5 = this.a.top + (this.a.height() - this.m.getHeight()) / 2;
        paramCanvas.translate(i4, i5);
        this.m.draw(paramCanvas);
        paramCanvas.translate(-i4, -i5);
      }
      return;
      localNinePatchDrawable = this.h;
      break;
      label227:
      n = this.g.getWidth();
      break label38;
      label238:
      i1 = this.l;
      break label55;
      label247:
      i2 = this.m.getWidth();
      break label69;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.j == null) {}
    do
    {
      return false;
      if (paramInt3 == 3)
      {
        this.f = false;
        return true;
      }
      if (this.a.contains(paramInt1, paramInt2)) {
        break;
      }
    } while (paramInt3 != 1);
    this.f = false;
    return false;
    switch (paramInt3)
    {
    }
    for (;;)
    {
      return true;
      this.f = true;
      continue;
      if (this.f) {
        this.j.a(this);
      }
      this.f = false;
    }
  }
  
  public final CharSequence ay_()
  {
    return this.k;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvr
 * JD-Core Version:    0.7.0.1
 */