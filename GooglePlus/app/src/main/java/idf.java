import android.text.SpannableStringBuilder;

public final class idf
  implements icx
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qpa paramqpa)
  {
    paramSpannableStringBuilder.append("+");
    int i = paramInt + 1;
    paramSpannableStringBuilder.append(paramqpa.a);
    int j = paramSpannableStringBuilder.length();
    qpi localqpi = paramqpa.r();
    String str1;
    if ((localqpi != null) && (localqpi.a != null))
    {
      str1 = String.valueOf(localqpi.a);
      if (str1.length() == 0) {
        break label93;
      }
    }
    label93:
    for (String str2 = "https://plus.google.com/".concat(str1);; str2 = new String("https://plus.google.com/"))
    {
      paramSpannableStringBuilder.setSpan(new lxw(str2), i, j, 33);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     idf
 * JD-Core Version:    0.7.0.1
 */