import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Html.TagHandler;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.URLSpan;
import android.text.util.Linkify;

public final class lww
  extends lxi
  implements lwu
{
  private final Spanned b;
  private final lxx c;
  private lxw d;
  private CharSequence e;
  
  public lww(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, lxx paramlxx)
  {
    super(paramCharSequence, paramTextPaint, paramInt, paramAlignment, paramFloat1, 0.0F, false);
    this.c = paramlxx;
    this.e = paramCharSequence;
    if ((paramCharSequence instanceof Spanned))
    {
      this.b = ((Spanned)paramCharSequence);
      return;
    }
    this.b = null;
  }
  
  public static SpannableStringBuilder a(SpannableStringBuilder paramSpannableStringBuilder, lxx paramlxx)
  {
    int i = 0;
    URLSpan[] arrayOfURLSpan = (URLSpan[])paramSpannableStringBuilder.getSpans(0, paramSpannableStringBuilder.length(), URLSpan.class);
    while (i < arrayOfURLSpan.length)
    {
      URLSpan localURLSpan = arrayOfURLSpan[i];
      paramSpannableStringBuilder.setSpan(new lxw(localURLSpan.getURL(), paramlxx), paramSpannableStringBuilder.getSpanStart(localURLSpan), paramSpannableStringBuilder.getSpanEnd(localURLSpan), paramSpannableStringBuilder.getSpanFlags(localURLSpan));
      paramSpannableStringBuilder.removeSpan(localURLSpan);
      i++;
    }
    return paramSpannableStringBuilder;
  }
  
  public static SpannableStringBuilder a(Spanned paramSpanned)
  {
    return a(new SpannableStringBuilder(paramSpanned), null);
  }
  
  public static SpannableStringBuilder a(String paramString)
  {
    return a(paramString, null);
  }
  
  public static SpannableStringBuilder a(String paramString, Html.TagHandler paramTagHandler)
  {
    if (paramString == null) {
      return new SpannableStringBuilder();
    }
    if (paramTagHandler == null) {}
    for (Spanned localSpanned = efj.y(paramString);; localSpanned = Html.fromHtml(paramString, null, paramTagHandler)) {
      return a(new SpannableStringBuilder(localSpanned), null);
    }
  }
  
  public static lww a(Context paramContext, TextPaint paramTextPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, lxx paramlxx)
  {
    lwj locallwj = (lwj)mbb.a(paramContext, lwj.class);
    int k;
    Object localObject;
    lww locallww;
    if (paramInt2 == 0)
    {
      k = 0;
      localObject = "";
      locallww = new lww((CharSequence)localObject, paramTextPaint, k, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false, paramlxx);
    }
    do
    {
      return locallww;
      if (paramInt2 == 1)
      {
        int m = lwj.a(paramTextPaint, paramCharSequence.toString());
        k = Math.min(Math.max(paramInt1, 0), m);
        if (k == m)
        {
          localObject = paramCharSequence;
          break;
        }
        localObject = locallwj.a(paramCharSequence, paramTextPaint, k, TextUtils.TruncateAt.END, null);
        break;
      }
      locallww = new lww(paramCharSequence, paramTextPaint, paramInt1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false, paramlxx);
    } while (locallww.getLineCount() <= paramInt2);
    int i = Math.min(Math.max(paramInt1, 0), locallww.getWidth());
    int j = locallww.getLineEnd(paramInt2 - 2);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence.subSequence(0, j));
    boolean bool = paramCharSequence instanceof Spanned;
    if (bool) {
      efj.k();
    }
    for (lwm locallwm = locallwj.b;; locallwm = null)
    {
      localSpannableStringBuilder.append(locallwj.a(paramCharSequence.subSequence(j, paramCharSequence.length()), paramTextPaint, paramInt1, TextUtils.TruncateAt.END, locallwm));
      if (bool) {
        lwj.a((Spanned)paramCharSequence, j, localSpannableStringBuilder, locallwm);
      }
      localObject = localSpannableStringBuilder;
      k = i;
      break;
    }
  }
  
  public static SpannableStringBuilder b(String paramString)
  {
    if (paramString == null) {
      return new SpannableStringBuilder();
    }
    if (0 == 0) {}
    for (Spanned localSpanned = efj.y(paramString);; localSpanned = Html.fromHtml(paramString, null, null))
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localSpanned);
      Linkify.addLinks(localSpannableStringBuilder, 1);
      return a(localSpannableStringBuilder, null);
    }
  }
  
  public final Rect a()
  {
    return this.a;
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 3)
    {
      if (this.d != null)
      {
        this.d.a = false;
        this.d = null;
      }
      return true;
    }
    if (this.b == null) {
      return false;
    }
    if (!this.a.contains(paramInt1, paramInt2))
    {
      if ((paramInt3 == 1) && (this.d != null))
      {
        this.d.a = false;
        this.d = null;
      }
      return false;
    }
    float f1 = Math.max(0.0F, paramInt2 - this.a.top);
    int i = getLineForVertical((int)Math.min(-1 + getHeight(), f1));
    float f2 = Math.max(0.0F, paramInt1 - this.a.left);
    float f3 = Math.min(-1 + getWidth(), f2);
    int j = getOffsetForHorizontal(i, f3);
    if (j < 0) {
      return false;
    }
    if (f3 > getLineWidth(i)) {
      return false;
    }
    lxw[] arrayOflxw = (lxw[])this.b.getSpans(j, j, lxw.class);
    if (arrayOflxw.length == 0) {
      return false;
    }
    switch (paramInt3)
    {
    }
    for (;;)
    {
      return true;
      this.d = arrayOflxw[0];
      this.d.a = true;
      continue;
      if ((this.d == arrayOflxw[0]) && (this.c != null)) {
        this.c.a(arrayOflxw[0]);
      }
      if (this.d != null)
      {
        this.d.a = false;
        this.d = null;
      }
    }
  }
  
  public final CharSequence ay_()
  {
    return this.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lww
 * JD-Core Version:    0.7.0.1
 */