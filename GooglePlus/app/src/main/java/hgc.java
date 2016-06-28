import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

public final class hgc
  implements hge
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qop paramqop)
  {
    paramSpannableStringBuilder.append("+");
    int i = paramInt + 1;
    paramSpannableStringBuilder.append(paramqop.b);
    int j = paramSpannableStringBuilder.length();
    String str1;
    if ((paramqop.e != null) && (paramqop.e.a != null))
    {
      str1 = String.valueOf(paramqop.e.a);
      if (str1.length() == 0) {
        break label93;
      }
    }
    label93:
    for (String str2 = "https://plus.google.com/".concat(str1);; str2 = new String("https://plus.google.com/"))
    {
      paramSpannableStringBuilder.setSpan(new URLSpan(str2), i, j, 33);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hgc
 * JD-Core Version:    0.7.0.1
 */