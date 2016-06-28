import android.text.TextPaint;
import android.text.style.UnderlineSpan;

public final class lwn
  extends UnderlineSpan
{
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwn
 * JD-Core Version:    0.7.0.1
 */