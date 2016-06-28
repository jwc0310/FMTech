import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

public final class hgb
  implements hge
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qop paramqop)
  {
    paramSpannableStringBuilder.append(paramqop.b);
    int i = paramSpannableStringBuilder.length();
    String str1 = String.valueOf(paramqop.f.a);
    if (str1.length() != 0) {}
    for (String str2 = "https://plus.google.com/s/%23".concat(str1);; str2 = new String("https://plus.google.com/s/%23"))
    {
      paramSpannableStringBuilder.setSpan(new URLSpan(str2), paramInt, i, 33);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hgb
 * JD-Core Version:    0.7.0.1
 */