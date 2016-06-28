import android.text.SpannableStringBuilder;

public final class ide
  implements icx
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qpa paramqpa)
  {
    paramSpannableStringBuilder.append(paramqpa.a);
    int i = paramSpannableStringBuilder.length();
    String str1 = String.valueOf(paramqpa.s().a);
    if (str1.length() != 0) {}
    for (String str2 = "https://plus.google.com/s/%23".concat(str1);; str2 = new String("https://plus.google.com/s/%23"))
    {
      paramSpannableStringBuilder.setSpan(new lxw(str2), paramInt, i, 33);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ide
 * JD-Core Version:    0.7.0.1
 */