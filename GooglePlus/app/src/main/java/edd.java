import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

public final class edd
{
  private static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
  
  public static double a(long paramLong)
  {
    return paramLong / 1000.0D;
  }
  
  public static long a(double paramDouble)
  {
    return (1000.0D * paramDouble);
  }
  
  public static String a(Locale paramLocale)
  {
    StringBuilder localStringBuilder = new StringBuilder(20);
    localStringBuilder.append(paramLocale.getLanguage());
    String str1 = paramLocale.getCountry();
    if (!TextUtils.isEmpty(str1)) {
      localStringBuilder.append('-').append(str1);
    }
    String str2 = paramLocale.getVariant();
    if (!TextUtils.isEmpty(str2)) {
      localStringBuilder.append('-').append(str2);
    }
    return localStringBuilder.toString();
  }
  
  public static void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Namespace cannot be null or empty");
    }
    if (paramString.length() > 128) {
      throw new IllegalArgumentException("Invalid namespace length");
    }
    if (!paramString.startsWith("urn:x-cast:")) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
    }
    if (paramString.length() == 11) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
    }
  }
  
  public static <T> boolean a(T paramT1, T paramT2)
  {
    return ((paramT1 == null) && (paramT2 == null)) || ((paramT1 != null) && (paramT2 != null) && (paramT1.equals(paramT2)));
  }
  
  public static String b(String paramString)
  {
    return "urn:x-cast:" + paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edd
 * JD-Core Version:    0.7.0.1
 */