import android.text.TextUtils;

public final class lhi
{
  final String a;
  public final String b;
  public final hqr c;
  final Exception d;
  public final String e;
  
  public lhi()
  {
    this(null);
  }
  
  public lhi(hqr paramhqr, String paramString1, String paramString2, String paramString3)
  {
    this.d = null;
    this.c = paramhqr;
    this.a = paramString1;
    this.e = paramString3;
    if (TextUtils.equals(paramString1, paramString2)) {
      paramString2 = null;
    }
    this.b = paramString2;
  }
  
  public lhi(Exception paramException)
  {
    this.c = new hqr(new String[0]);
    this.a = null;
    this.b = null;
    this.d = paramException;
    this.e = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhi
 * JD-Core Version:    0.7.0.1
 */