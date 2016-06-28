import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.MultiAutoCompleteTextView.Tokenizer;

public final class kiu
  implements MultiAutoCompleteTextView.Tokenizer
{
  private final String a;
  
  public kiu(String paramString)
  {
    this.a = paramString;
  }
  
  private final int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramInt1 + 1 < paramInt2) && (a(paramCharSequence.charAt(paramInt1 + 1)))) {
      return paramInt1;
    }
    int i = paramCharSequence.length();
    int j = 0;
    for (;;)
    {
      if (paramInt1 >= paramInt2) {
        return paramInt2;
      }
      int k = paramCharSequence.charAt(paramInt1);
      if ((k == 8203) || (k == 10)) {
        break;
      }
      label127:
      char c1;
      if (a(k))
      {
        int m = j + 1;
        if (m >= 4) {
          break;
        }
        for (int n = paramInt1 + 1;; n++)
        {
          if (n >= i) {
            break label127;
          }
          char c2 = paramCharSequence.charAt(n);
          if (c2 == '\n') {
            break;
          }
          if (!a(c2)) {
            break label127;
          }
        }
        if (n == i) {
          break;
        }
        c1 = paramCharSequence.charAt(n);
        paramInt1 = n;
        j = m;
      }
      if ((paramInt1 > paramInt2) && (efj.a(c1)) && ((paramInt1 == 0) || (a(paramCharSequence.charAt(paramInt1 - 1))))) {
        break;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  private static boolean a(char paramChar)
  {
    return (paramChar == '​') || (Character.isWhitespace(paramChar));
  }
  
  public final int findTokenEnd(CharSequence paramCharSequence, int paramInt)
  {
    return a(paramCharSequence, paramInt, paramInt);
  }
  
  public final int findTokenStart(CharSequence paramCharSequence, int paramInt)
  {
    label26:
    label199:
    label213:
    for (int i = paramInt - 1;; i--)
    {
      char c;
      if (i >= 0)
      {
        c = paramCharSequence.charAt(i);
        if (c != '\n') {
          break label26;
        }
      }
      int k;
      for (;;)
      {
        return paramInt;
        if ((!efj.a(c)) || ((i != 0) && (!a(paramCharSequence.charAt(i - 1))))) {
          break label213;
        }
        int j;
        if ((paramCharSequence instanceof Spannable))
        {
          lxf[] arrayOflxf = (lxf[])((Spannable)paramCharSequence).getSpans(i, i, lxf.class);
          if ((arrayOflxf != null) && (arrayOflxf.length != 0)) {
            j = 1;
          }
        }
        while (j == 0)
        {
          for (k = a(paramCharSequence, i, paramInt); (k < paramInt) && (a(paramCharSequence.charAt(k))); k++) {}
          URLSpan[] arrayOfURLSpan = (URLSpan[])((Spannable)paramCharSequence).getSpans(i, i, URLSpan.class);
          if ((arrayOfURLSpan != null) && (arrayOfURLSpan.length != 0))
          {
            int m = arrayOfURLSpan.length;
            for (int n = 0;; n++)
            {
              if (n >= m) {
                break label199;
              }
              if (lxf.a(arrayOfURLSpan[n]))
              {
                j = 1;
                break;
              }
            }
          }
          j = 0;
        }
      }
      if (k == paramInt) {
        return i;
      }
    }
  }
  
  public final CharSequence terminateToken(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    if ((i == 0) || (a(paramCharSequence.charAt(i - 1)))) {
      return paramCharSequence;
    }
    if ((paramCharSequence instanceof Spanned))
    {
      String str3 = String.valueOf(paramCharSequence);
      String str4 = this.a;
      SpannableString localSpannableString = new SpannableString(0 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + str4);
      TextUtils.copySpansFrom((Spanned)paramCharSequence, 0, paramCharSequence.length(), Object.class, localSpannableString, 0);
      return localSpannableString;
    }
    String str1 = String.valueOf(paramCharSequence);
    String str2 = this.a;
    return 0 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kiu
 * JD-Core Version:    0.7.0.1
 */