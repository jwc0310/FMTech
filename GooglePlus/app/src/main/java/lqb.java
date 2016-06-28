import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;

public final class lqb
  extends View
  implements lxj
{
  private final loj a;
  private StaticLayout b;
  private int c;
  private boolean d;
  private final int e;
  private final lwj f;
  private final TextPaint g;
  
  public lqb(Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    super(paramContext);
    this.a = loj.a(paramContext);
    this.g = efj.B(paramContext, aw.eo);
    this.f = ((lwj)mbb.a(paramContext, lwj.class));
    this.c = paramInt1;
    this.d = paramBoolean;
    this.e = paramInt2;
  }
  
  public final void D_()
  {
    this.b = null;
    this.c = 0;
    this.d = false;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.d)
    {
      int i = (getHeight() - this.b.getHeight()) / 2;
      paramCanvas.translate(this.a.m, i);
      this.b.draw(paramCanvas);
      paramCanvas.translate(-this.a.m, -i);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    lwj locallwj;
    TextPaint localTextPaint;
    String str;
    int j;
    Layout.Alignment localAlignment;
    TextUtils.TruncateAt localTruncateAt;
    int k;
    Object localObject;
    label96:
    StaticLayout localStaticLayout;
    if (this.d)
    {
      locallwj = this.f;
      localTextPaint = this.g;
      str = localContext.getString(this.e);
      int i = View.MeasureSpec.getSize(paramInt1) - 2 * this.a.m;
      if (lwj.a(this.g) << 1 <= this.c) {
        break label135;
      }
      j = 1;
      localAlignment = Layout.Alignment.ALIGN_NORMAL;
      localTruncateAt = TextUtils.TruncateAt.END;
      k = Math.max(i, 0);
      if (j != 0) {
        break label141;
      }
      localObject = "";
      localStaticLayout = new StaticLayout((CharSequence)localObject, localTextPaint, k, localAlignment, 1.0F, 0.0F, false);
    }
    label135:
    label141:
    do
    {
      this.b = localStaticLayout;
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.c);
      return;
      j = 2;
      break;
      if (j == 1)
      {
        localObject = locallwj.a(str, localTextPaint, k, localTruncateAt, null);
        break label96;
      }
      localStaticLayout = new StaticLayout(str, localTextPaint, k, localAlignment, 1.0F, 0.0F, false);
    } while (localStaticLayout.getLineCount() <= j);
    int m = localStaticLayout.getLineEnd(j - 2);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str.subSequence(0, m));
    boolean bool = str instanceof Spanned;
    if (bool) {
      efj.k();
    }
    for (lwm locallwm = locallwj.b;; locallwm = null)
    {
      localSpannableStringBuilder.append(locallwj.a(str.subSequence(m, str.length()), localTextPaint, k, localTruncateAt, locallwm));
      if (bool) {
        lwj.a((Spanned)str, m, localSpannableStringBuilder, locallwm);
      }
      localObject = localSpannableStringBuilder;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqb
 * JD-Core Version:    0.7.0.1
 */