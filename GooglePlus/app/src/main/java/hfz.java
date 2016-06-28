import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

public final class hfz
  implements hge
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qop paramqop)
  {
    paramSpannableStringBuilder.append(paramqop.b);
    int i = paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.setSpan(new URLSpan(paramqop.d.a), paramInt, i, 33);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfz
 * JD-Core Version:    0.7.0.1
 */