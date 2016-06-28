import android.text.TextPaint;
import android.text.style.URLSpan;

public final class lxf
  extends URLSpan
{
  public static final String a = "+";
  
  public lxf(URLSpan paramURLSpan)
  {
    super(paramURLSpan.getURL());
    if (!a(paramURLSpan)) {
      throw new IllegalArgumentException(paramURLSpan.getURL());
    }
  }
  
  public lxf(String paramString) {}
  
  public static boolean a(URLSpan paramURLSpan)
  {
    String str = paramURLSpan.getURL();
    return (str != null) && (str.startsWith(a));
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(-13408564);
    paramTextPaint.bgColor = 0;
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxf
 * JD-Core Version:    0.7.0.1
 */