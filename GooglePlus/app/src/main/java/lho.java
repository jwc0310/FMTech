import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class lho
  extends View
  implements kbb
{
  private static Paint j = new Paint(2);
  private static Paint k;
  private static Interpolator l;
  private static boolean m;
  private static int n;
  private static int o;
  private static int p;
  private static Bitmap q;
  private static Drawable r;
  private static int s;
  public lmb a;
  public ipf b;
  private kaz c;
  private Rect d;
  private Rect e;
  private StaticLayout f;
  private StaticLayout g;
  private int h;
  private boolean i;
  
  public lho(Context paramContext)
  {
    super(paramContext);
    if (!m)
    {
      m = true;
      Resources localResources = paramContext.getResources();
      n = localResources.getDimensionPixelOffset(efj.Yq);
      o = localResources.getDimensionPixelOffset(efj.Yo);
      p = localResources.getDimensionPixelOffset(efj.Yp);
      q = BitmapFactory.decodeResource(localResources, aau.CD);
      r = new ColorDrawable(localResources.getColor(eyg.bL));
      s = (int)localResources.getDimension(efj.Yn);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setColor(localResources.getColor(eyg.bK));
    }
    this.d = new Rect();
    this.e = new Rect();
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.c != null)
    {
      this.c.b(this);
      this.c = null;
    }
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.b != null)) {
      this.c = ((ipb)mbb.a(getContext(), ipb.class)).a(this.b, 3, this);
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
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    if (this.c == null) {}
    for (Bitmap localBitmap = null; localBitmap == null; localBitmap = (Bitmap)this.c.p)
    {
      r.setBounds(this.e);
      r.draw(paramCanvas);
      paramCanvas.drawRect(this.e, k);
      int i2 = this.h;
      StaticLayout localStaticLayout1 = this.f;
      StaticLayout localStaticLayout2 = this.g;
      int i3 = q.getHeight() + s;
      if (localStaticLayout1 != null) {
        i3 += localStaticLayout1.getHeight() + s;
      }
      if (localStaticLayout2 != null) {
        i3 += localStaticLayout2.getHeight() + s;
      }
      int i4 = (i2 - i3) / 2;
      paramCanvas.drawBitmap(q, (i1 - q.getWidth()) / 2, i4, null);
      int i5 = i4 + (q.getHeight() + s);
      if (localStaticLayout1 != null)
      {
        paramCanvas.translate(0.0F, i5);
        localStaticLayout1.draw(paramCanvas);
        paramCanvas.translate(0.0F, -i5);
        i5 += localStaticLayout1.getHeight() + s;
      }
      if (localStaticLayout2 != null)
      {
        paramCanvas.translate(0.0F, i5);
        localStaticLayout2.draw(paramCanvas);
        paramCanvas.translate(0.0F, -i5);
        localStaticLayout2.getHeight();
      }
      return;
    }
    int i10;
    label274:
    Rect localRect2;
    int i6;
    int i7;
    float f2;
    if (!this.i)
    {
      if (Build.VERSION.SDK_INT >= 14)
      {
        i10 = 1;
        if (i10 != 0)
        {
          if (l == null) {
            l = new DecelerateInterpolator();
          }
          animate().alpha(1.0F).setDuration(500L).setInterpolator(l);
        }
        this.i = true;
      }
    }
    else if (this.d.isEmpty())
    {
      Rect localRect1 = this.e;
      localRect2 = this.d;
      i6 = localBitmap.getWidth();
      i7 = localBitmap.getHeight();
      float f1 = i6 / i7;
      f2 = localRect1.width() / localRect1.height();
      if (f1 <= f2) {
        break label441;
      }
      int i9 = (i6 - (int)(f2 * i7)) / 2;
      localRect2.set(i9, 0, i6 - i9, i7);
    }
    for (;;)
    {
      paramCanvas.drawBitmap(localBitmap, this.d, this.e, j);
      break;
      i10 = 0;
      break label274;
      label441:
      int i8 = (i7 - (int)(i6 / f2)) / 2;
      localRect2.set(0, i8, i6, i7 - i8);
    }
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    lwj locallwj1;
    TextPaint localTextPaint1;
    int i7;
    String str2;
    Layout.Alignment localAlignment2;
    TextUtils.TruncateAt localTruncateAt2;
    int i8;
    Object localObject2;
    label154:
    StaticLayout localStaticLayout1;
    label174:
    lwj locallwj2;
    TextPaint localTextPaint2;
    int i4;
    String str1;
    Layout.Alignment localAlignment1;
    TextUtils.TruncateAt localTruncateAt1;
    int i5;
    Object localObject1;
    label289:
    StaticLayout localStaticLayout2;
    if (i1 <= n)
    {
      this.h = i2;
      int i3 = this.h - q.getHeight() - 3 * s;
      Context localContext = getContext();
      lmb locallmb = this.a;
      locallwj1 = (lwj)mbb.a(localContext, lwj.class);
      localTextPaint1 = efj.B(localContext, aau.CG);
      if (TextUtils.isEmpty(locallmb.b)) {
        break label565;
      }
      i7 = (i3 - paramInt2) / lwj.a(localTextPaint1);
      if (i7 <= 0) {
        break label565;
      }
      str2 = locallmb.b;
      localAlignment2 = Layout.Alignment.ALIGN_CENTER;
      localTruncateAt2 = TextUtils.TruncateAt.END;
      i8 = Math.max(i1, 0);
      if (i7 != 0) {
        break label391;
      }
      localObject2 = "";
      localStaticLayout1 = new StaticLayout((CharSequence)localObject2, localTextPaint1, i8, localAlignment2, 1.0F, 0.0F, false);
      this.g = localStaticLayout1;
      if (this.g != null) {
        paramInt2 += this.g.getHeight() + s;
      }
      if (this.a.d)
      {
        locallwj2 = (lwj)mbb.a(localContext, lwj.class);
        localTextPaint2 = efj.B(localContext, aau.CF);
        i4 = (i3 - paramInt2) / lwj.a(localTextPaint2);
        if (i4 <= 0) {
          break label745;
        }
        str1 = localContext.getString(aau.CE);
        localAlignment1 = Layout.Alignment.ALIGN_CENTER;
        localTruncateAt1 = TextUtils.TruncateAt.END;
        i5 = Math.max(i1, 0);
        if (i4 != 0) {
          break label571;
        }
        localObject1 = "";
        localStaticLayout2 = new StaticLayout((CharSequence)localObject1, localTextPaint2, i5, localAlignment1, 1.0F, 0.0F, false);
      }
    }
    for (;;)
    {
      this.f = localStaticLayout2;
      if (this.f != null) {
        this.f.getHeight();
      }
      this.d.setEmpty();
      this.e.set(0, 0, i1, i2);
      return;
      if (getResources().getConfiguration().orientation == 2)
      {
        this.h = (i2 - o);
        break;
      }
      this.h = (i2 - p);
      break;
      label391:
      if (i7 == 1)
      {
        localObject2 = locallwj1.a(str2, localTextPaint1, i8, localTruncateAt2, null);
        break label154;
      }
      localStaticLayout1 = new StaticLayout(str2, localTextPaint1, i8, localAlignment2, 1.0F, 0.0F, false);
      if (localStaticLayout1.getLineCount() <= i7) {
        break label174;
      }
      int i9 = localStaticLayout1.getLineEnd(i7 - 2);
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(str2.subSequence(0, i9));
      boolean bool2 = str2 instanceof Spanned;
      if (bool2) {
        efj.k();
      }
      for (lwm locallwm2 = locallwj1.b;; locallwm2 = null)
      {
        localSpannableStringBuilder2.append(locallwj1.a(str2.subSequence(i9, str2.length()), localTextPaint1, i8, localTruncateAt2, locallwm2));
        if (bool2) {
          lwj.a((Spanned)str2, i9, localSpannableStringBuilder2, locallwm2);
        }
        localObject2 = localSpannableStringBuilder2;
        break;
      }
      label565:
      localStaticLayout1 = null;
      break label174;
      label571:
      if (i4 == 1)
      {
        localObject1 = locallwj2.a(str1, localTextPaint2, i5, localTruncateAt1, null);
        break label289;
      }
      localStaticLayout2 = new StaticLayout(str1, localTextPaint2, i5, localAlignment1, 1.0F, 0.0F, false);
      if (localStaticLayout2.getLineCount() > i4)
      {
        int i6 = localStaticLayout2.getLineEnd(i4 - 2);
        SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str1.subSequence(0, i6));
        boolean bool1 = str1 instanceof Spanned;
        if (bool1) {
          efj.k();
        }
        for (lwm locallwm1 = locallwj2.b;; locallwm1 = null)
        {
          localSpannableStringBuilder1.append(locallwj2.a(str1.subSequence(i6, str1.length()), localTextPaint2, i5, localTruncateAt1, locallwm1));
          if (bool1) {
            lwj.a((Spanned)str1, i6, localSpannableStringBuilder1, locallwm1);
          }
          localObject1 = localSpannableStringBuilder1;
          break;
        }
        label745:
        localStaticLayout2 = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lho
 * JD-Core Version:    0.7.0.1
 */