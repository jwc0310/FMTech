import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public final class hfu
  extends TextView
{
  private final TextPaint a = new TextPaint();
  private SpannableStringBuilder b = new SpannableStringBuilder();
  private int c;
  private lwj d = (lwj)mbb.a(getContext(), lwj.class);
  private boolean e;
  private int f;
  private boolean g;
  private CharSequence h;
  
  public hfu(Context paramContext)
  {
    super(paramContext);
    if (!this.e) {
      this.f = 2147483647;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!hasOnClickListeners()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Cannot have both a click listener and setClickThroughForNonSpan(true)");
      this.g = true;
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int m;
    if (Build.VERSION.SDK_INT >= 16)
    {
      i = getMaxLines();
      if ((i < 2147483647) && (getMovementMethod() != null))
      {
        this.a.setTypeface(getTypeface());
        this.a.setTextSize(getTextSize());
        j = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
        if (j != this.c)
        {
          StaticLayout localStaticLayout = new StaticLayout(this.h, this.a, j, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          if (localStaticLayout.getLineCount() > i)
          {
            this.b.clear();
            if (i <= 1) {
              break label319;
            }
            m = localStaticLayout.getLineEnd(i - 2);
            this.b = this.b.append(this.h.subSequence(0, m));
          }
        }
      }
    }
    label319:
    for (int k = m;; k = 0)
    {
      boolean bool = this.h instanceof Spanned;
      lwj locallwj;
      if (bool)
      {
        locallwj = this.d;
        efj.k();
      }
      for (lwm locallwm = locallwj.b;; locallwm = null)
      {
        this.b.append(this.d.a(this.h.subSequence(k, this.h.length()), this.a, j, TextUtils.TruncateAt.END, locallwm));
        if (bool) {
          lwj.a((Spanned)this.h, k, this.b, locallwm);
        }
        SpannableStringBuilder localSpannableStringBuilder = this.b;
        TextView.BufferType localBufferType = TextView.BufferType.SPANNABLE;
        CharSequence localCharSequence = this.h;
        setText(localSpannableStringBuilder, localBufferType);
        this.h = localCharSequence;
        this.c = 0;
        this.c = j;
        super.onMeasure(paramInt1, paramInt2);
        return;
        i = this.f;
        break;
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    CharSequence localCharSequence = getText();
    boolean bool = super.onTouchEvent(paramMotionEvent);
    if ((this.g) && (paramMotionEvent.getAction() == 0) && ((localCharSequence instanceof Spannable)))
    {
      Spannable localSpannable = (Spannable)localCharSequence;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      Layout localLayout = getLayout();
      int k = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(j), i);
      if (((ClickableSpan[])localSpannable.getSpans(k, k, ClickableSpan.class)).length == 0) {
        return false;
      }
    }
    return bool;
  }
  
  public final void setLines(int paramInt)
  {
    super.setLines(paramInt);
    this.f = paramInt;
    this.e = true;
    this.c = 0;
  }
  
  public final void setMaxLines(int paramInt)
  {
    super.setMaxLines(paramInt);
    this.f = paramInt;
    this.e = true;
    this.c = 0;
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if ((!this.g) || (paramOnClickListener == null)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Cannot have both a click listener and setClickThroughForNonSpan(true)");
      super.setOnClickListener(paramOnClickListener);
      return;
    }
  }
  
  public final void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    super.setText(paramCharSequence, paramBufferType);
    this.h = paramCharSequence;
    this.c = 0;
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
    this.c = 0;
  }
  
  public final void setTypeface(Typeface paramTypeface)
  {
    super.setTypeface(paramTypeface);
    this.c = 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfu
 * JD-Core Version:    0.7.0.1
 */