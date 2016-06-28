import android.graphics.Typeface;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public final class lxw
  extends URLSpan
{
  boolean a;
  public boolean b = false;
  public Typeface c;
  private final lxx d;
  private boolean e;
  private int f;
  
  public lxw(String paramString)
  {
    this(paramString, null);
  }
  
  public lxw(String paramString, lxx paramlxx)
  {
    super(paramString);
    this.d = paramlxx;
    this.e = true;
  }
  
  public static Spanned a(String paramString, lxx paramlxx)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(paramString));
    a(localSpannableStringBuilder, paramlxx);
    return localSpannableStringBuilder;
  }
  
  public static void a(Spannable paramSpannable, lxx paramlxx)
  {
    a(paramSpannable, paramlxx, false);
  }
  
  public static void a(Spannable paramSpannable, lxx paramlxx, boolean paramBoolean)
  {
    URLSpan[] arrayOfURLSpan = (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class);
    for (int i = 0; i < arrayOfURLSpan.length; i++)
    {
      URLSpan localURLSpan = arrayOfURLSpan[i];
      int j = paramSpannable.getSpanStart(localURLSpan);
      int k = paramSpannable.getSpanEnd(localURLSpan);
      paramSpannable.removeSpan(localURLSpan);
      lxw locallxw = new lxw(localURLSpan.getURL(), paramlxx);
      locallxw.b = paramBoolean;
      paramSpannable.setSpan(locallxw, j, k, 0);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.d != null)
    {
      this.d.a(this);
      return;
    }
    super.onClick(paramView);
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    if (this.e)
    {
      this.e = false;
      this.f = paramTextPaint.bgColor;
    }
    if (this.a) {}
    for (paramTextPaint.bgColor = -13388315;; paramTextPaint.bgColor = this.f)
    {
      if (!this.b) {
        paramTextPaint.setColor(paramTextPaint.linkColor);
      }
      if (this.c != null) {
        paramTextPaint.setTypeface(this.c);
      }
      paramTextPaint.setUnderlineText(false);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxw
 * JD-Core Version:    0.7.0.1
 */