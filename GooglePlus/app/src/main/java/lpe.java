import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
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

public final class lpe
  extends View
  implements lxj
{
  public String a;
  public String b;
  public Rect c;
  private loj d;
  private StaticLayout e;
  private StaticLayout f;
  private boolean g;
  private final lwj h;
  
  public lpe(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lpe(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lpe(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.d = loj.a(paramContext);
    this.h = ((lwj)mbb.a(paramContext, lwj.class));
    this.c = new Rect();
    this.g = true;
  }
  
  public final void D_()
  {
    this.a = null;
    this.b = null;
    this.e = null;
    this.f = null;
    this.g = true;
    this.c.setEmpty();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      this.g = paramBoolean;
      invalidate();
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.g)
    {
      this.d.E.set(0, 0, getWidth(), getHeight());
      this.d.Z.setBounds(this.d.E);
      this.d.Z.draw(paramCanvas);
    }
    int i = this.d.m;
    int j = 2 * this.d.m;
    if (this.e != null)
    {
      paramCanvas.translate(i, j);
      this.e.draw(paramCanvas);
      paramCanvas.translate(-i, -j);
      j += this.e.getHeight();
    }
    if (this.f != null)
    {
      paramCanvas.translate(i, j);
      this.f.draw(paramCanvas);
      paramCanvas.translate(-i, -j);
      this.f.getHeight();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = 2 * this.d.m;
    int k = i - 2 * this.d.m;
    this.c.top = this.d.m;
    this.c.left = 0;
    Context localContext = getContext();
    TextPaint localTextPaint1 = efj.B(localContext, aw.ev);
    TextPaint localTextPaint2 = efj.B(localContext, aw.em);
    boolean bool1 = TextUtils.isEmpty(this.a);
    int m = 0;
    lwj locallwj2;
    String str2;
    int i4;
    Layout.Alignment localAlignment2;
    TextUtils.TruncateAt localTruncateAt2;
    int i5;
    Object localObject2;
    StaticLayout localStaticLayout2;
    if (!bool1)
    {
      locallwj2 = this.h;
      str2 = this.a;
      i4 = this.d.V;
      localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
      localTruncateAt2 = TextUtils.TruncateAt.END;
      i5 = Math.max(k, 0);
      if (i4 != 0) {
        break label373;
      }
      localObject2 = "";
      localStaticLayout2 = new StaticLayout((CharSequence)localObject2, localTextPaint1, i5, localAlignment2, 1.0F, 0.0F, false);
      label162:
      this.e = localStaticLayout2;
      if (this.e.getWidth() <= 0) {
        break label721;
      }
    }
    label259:
    label547:
    label721:
    for (int i7 = i;; i7 = 0)
    {
      int i8 = j + this.e.getHeight();
      m = i7;
      j = i8;
      lwj locallwj1;
      String str1;
      int i1;
      Layout.Alignment localAlignment1;
      TextUtils.TruncateAt localTruncateAt1;
      int i2;
      Object localObject1;
      StaticLayout localStaticLayout1;
      if (!TextUtils.isEmpty(this.b))
      {
        locallwj1 = this.h;
        str1 = this.b;
        i1 = this.d.W;
        localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt1 = TextUtils.TruncateAt.END;
        i2 = Math.max(k, 0);
        if (i1 != 0) {
          break label547;
        }
        localObject1 = "";
        localStaticLayout1 = new StaticLayout((CharSequence)localObject1, localTextPaint2, i2, localAlignment1, 1.0F, 0.0F, false);
      }
      label373:
      do
      {
        this.f = localStaticLayout1;
        if (this.f.getWidth() > m) {
          m = i;
        }
        j += this.f.getHeight();
        this.c.right = (this.c.left + Math.min(m, k) + 2 * this.d.m);
        int n = j + this.d.m;
        this.c.bottom = n;
        setMeasuredDimension(i, n);
        return;
        if (i4 == 1)
        {
          localObject2 = locallwj2.a(str2, localTextPaint1, i5, localTruncateAt2, null);
          break;
        }
        localStaticLayout2 = new StaticLayout(str2, localTextPaint1, i5, localAlignment2, 1.0F, 0.0F, false);
        if (localStaticLayout2.getLineCount() <= i4) {
          break label162;
        }
        int i6 = localStaticLayout2.getLineEnd(i4 - 2);
        SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(str2.subSequence(0, i6));
        boolean bool3 = str2 instanceof Spanned;
        if (bool3) {
          efj.k();
        }
        for (lwm locallwm2 = locallwj2.b;; locallwm2 = null)
        {
          localSpannableStringBuilder2.append(locallwj2.a(str2.subSequence(i6, str2.length()), localTextPaint1, i5, localTruncateAt2, locallwm2));
          if (bool3) {
            lwj.a((Spanned)str2, i6, localSpannableStringBuilder2, locallwm2);
          }
          localObject2 = localSpannableStringBuilder2;
          break;
        }
        if (i1 == 1)
        {
          localObject1 = locallwj1.a(str1, localTextPaint2, i2, localTruncateAt1, null);
          break label259;
        }
        localStaticLayout1 = new StaticLayout(str1, localTextPaint2, i2, localAlignment1, 1.0F, 0.0F, false);
      } while (localStaticLayout1.getLineCount() <= i1);
      int i3 = localStaticLayout1.getLineEnd(i1 - 2);
      SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str1.subSequence(0, i3));
      boolean bool2 = str1 instanceof Spanned;
      if (bool2) {
        efj.k();
      }
      for (lwm locallwm1 = locallwj1.b;; locallwm1 = null)
      {
        localSpannableStringBuilder1.append(locallwj1.a(str1.subSequence(i3, str1.length()), localTextPaint2, i2, localTruncateAt1, locallwm1));
        if (bool2) {
          lwj.a((Spanned)str1, i3, localSpannableStringBuilder1, locallwm1);
        }
        localObject1 = localSpannableStringBuilder1;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpe
 * JD-Core Version:    0.7.0.1
 */