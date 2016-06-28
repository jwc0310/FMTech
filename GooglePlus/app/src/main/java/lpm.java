import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class lpm
  extends View
  implements loi, lxj
{
  public static final int a = aw.ee;
  static final Interpolator b = new DecelerateInterpolator();
  public final int c;
  public heq d;
  public StaticLayout e;
  public x f;
  public int g;
  public boolean h = true;
  public boolean i = false;
  public int j = -1;
  private final jr k;
  private final lwj l;
  private Runnable m = new lpn(this);
  
  public lpm(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.l = ((lwj)mbb.a(localContext, lwj.class));
    this.k = jr.a();
    this.c = localResources.getDimensionPixelOffset(ehr.eP);
  }
  
  public final void D_()
  {
    d();
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = 0;
    this.j = -1;
    this.i = false;
  }
  
  public final void aw_()
  {
    this.h = true;
    c();
  }
  
  public final void ax_()
  {
    this.h = false;
    d();
  }
  
  final void b()
  {
    if ((this.d == null) || (this.d.a() == 0)) {
      return;
    }
    TextPaint localTextPaint = efj.B(getContext(), a);
    SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder();
    String str1 = this.d.c(this.g);
    boolean bool1;
    Spanned localSpanned;
    if (!TextUtils.isEmpty(str1))
    {
      localSpannableStringBuilder1.append(str1);
      localSpannableStringBuilder1.setSpan(new StyleSpan(1), 0, str1.length(), 17);
      bool1 = this.k.e.a(str1, 0, str1.length());
      localSpanned = this.d.d(this.g);
      if (!TextUtils.isEmpty(localSpanned))
      {
        jr localjr = this.k;
        String str2 = localSpanned.toString();
        boolean bool3 = localjr.e.a(str2, 0, str2.length());
        if (localSpannableStringBuilder1.length() > 0)
        {
          if (bool1 != bool3) {
            break label296;
          }
          localSpannableStringBuilder1.append(' ');
        }
      }
    }
    lwj locallwj;
    Layout.Alignment localAlignment;
    TextUtils.TruncateAt localTruncateAt;
    int i2;
    StaticLayout localStaticLayout;
    for (;;)
    {
      localSpannableStringBuilder1.append(localSpanned);
      int i1 = getMeasuredWidth() - 2 * this.c;
      locallwj = this.l;
      localAlignment = Layout.Alignment.ALIGN_NORMAL;
      localTruncateAt = TextUtils.TruncateAt.END;
      i2 = Math.max(i1, 0);
      localStaticLayout = new StaticLayout(localSpannableStringBuilder1, localTextPaint, i2, localAlignment, 1.0F, 0.0F, false);
      if (localStaticLayout.getLineCount() > 2) {
        break label306;
      }
      this.e = localStaticLayout;
      return;
      int n = this.g;
      Log.e("StreamCommentsView", 53 + "Received empty name for comment at index: " + n);
      bool1 = false;
      break;
      label296:
      localSpannableStringBuilder1.append('\n');
    }
    label306:
    int i3 = localStaticLayout.getLineEnd(0);
    SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(localSpannableStringBuilder1.subSequence(0, i3));
    boolean bool2 = localSpannableStringBuilder1 instanceof Spanned;
    if (bool2) {
      efj.k();
    }
    for (lwm locallwm = locallwj.b;; locallwm = null)
    {
      localSpannableStringBuilder2.append(locallwj.a(localSpannableStringBuilder1.subSequence(i3, localSpannableStringBuilder1.length()), localTextPaint, i2, localTruncateAt, locallwm));
      if (bool2) {
        lwj.a((Spanned)localSpannableStringBuilder1, i3, localSpannableStringBuilder2, locallwm);
      }
      localStaticLayout = new StaticLayout(localSpannableStringBuilder2, localTextPaint, i2, localAlignment, 1.0F, 0.0F, false);
      break;
    }
  }
  
  public final void c()
  {
    if ((this.i) && (this.j == -1)) {
      if (Build.VERSION.SDK_INT < 14) {
        break label65;
      }
    }
    label65:
    for (int n = 1;; n = 0)
    {
      if ((n != 0) && (lwo.a(this)) && (this.d != null) && (this.d.a() > 1)) {
        efj.a(this.m, true);
      }
      return;
    }
  }
  
  public final void d()
  {
    if (this.j != -1)
    {
      Runnable localRunnable = this.m;
      efj.m().removeCallbacks(localRunnable);
      clearAnimation();
      if (Build.VERSION.SDK_INT < 14) {
        break label53;
      }
    }
    label53:
    for (int n = 1;; n = 0)
    {
      if (n != 0)
      {
        lwo.h(this);
        setAlpha(1.0F);
      }
      this.j = -1;
      return;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    c();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    d();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.d != null) && (this.d.a() > 0) && (this.e != null))
    {
      int n = (getHeight() - this.e.getHeight()) / 2;
      paramCanvas.translate(this.c, n);
      this.e.draw(paramCanvas);
      paramCanvas.translate(this.c, -n);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int n = View.MeasureSpec.getSize(paramInt1);
    heq localheq = this.d;
    int i1 = 0;
    if (localheq != null)
    {
      int i2 = this.d.a();
      i1 = 0;
      if (i2 > 0) {
        i1 = 2 * lwj.a(efj.B(getContext(), a)) + 2 * this.c;
      }
    }
    setMeasuredDimension(n, i1);
    b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpm
 * JD-Core Version:    0.7.0.1
 */