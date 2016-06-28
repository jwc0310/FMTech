import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.URLSpan;

final class cot
  extends URLSpan
{
  cot(cos paramcos, String paramString)
  {
    super(paramString);
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.setColor(this.a.g.getResources().getColor(efj.kn));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cot
 * JD-Core Version:    0.7.0.1
 */