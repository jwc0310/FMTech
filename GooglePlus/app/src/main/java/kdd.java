import android.text.TextUtils;

public final class kdd
  extends kce
{
  private static final long serialVersionUID = -6479734361667965512L;
  public final String a;
  public final String b;
  public final int c;
  
  public kdd(kdb paramkdb, String paramString)
  {
    super(2 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + ": " + str2);
    this.b = paramkdb.a();
    if ((paramkdb.a != null) && (paramkdb.a.a != null)) {}
    for (int i = paramkdb.a.a.intValue();; i = 0)
    {
      this.c = i;
      this.a = paramString;
      return;
    }
  }
  
  public static boolean a(Exception paramException, String paramString)
  {
    if ((paramException instanceof kdd)) {
      return TextUtils.equals(((kdd)paramException).b, paramString);
    }
    if ((paramException != null) && ((paramException.getCause() instanceof kdd))) {
      return TextUtils.equals(((kdd)paramException.getCause()).b, paramString);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdd
 * JD-Core Version:    0.7.0.1
 */