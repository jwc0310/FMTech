import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;

public final class idd
  implements icx
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qpa paramqpa)
  {
    boolean bool1 = paramqpa.p().a;
    boolean bool2 = paramqpa.p().b;
    boolean bool3 = paramqpa.p().c;
    int i = paramSpannableStringBuilder.length();
    if ((bool1) && (bool2)) {
      paramSpannableStringBuilder.setSpan(new StyleSpan(3), paramInt, i, 33);
    }
    for (;;)
    {
      if (bool3) {
        paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt, i, 33);
      }
      return;
      if (bool1) {
        paramSpannableStringBuilder.setSpan(new StyleSpan(1), paramInt, i, 33);
      } else if (bool2) {
        paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt, i, 33);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     idd
 * JD-Core Version:    0.7.0.1
 */