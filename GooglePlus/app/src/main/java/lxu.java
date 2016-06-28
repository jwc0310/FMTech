import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

public final class lxu
  extends SuperscriptSpan
{
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.baselineShift += (int)(paramTextPaint.ascent() / 4.0F);
  }
  
  public final void updateMeasureState(TextPaint paramTextPaint)
  {
    paramTextPaint.baselineShift += (int)(paramTextPaint.ascent() / 4.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxu
 * JD-Core Version:    0.7.0.1
 */