import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class edm
{
  private static boolean b = false;
  String a;
  private String c;
  private final boolean d;
  private boolean e;
  private boolean f;
  
  public edm(String paramString)
  {
    this(paramString, false);
  }
  
  private edm(String paramString, boolean paramBoolean)
  {
    efj.a(paramString, "The log tag cannot be null or empty.");
    this.c = paramString;
    if (paramString.length() <= 23) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      this.e = paramBoolean;
      this.f = false;
      return;
    }
  }
  
  private boolean a()
  {
    return (this.e) || ((this.d) && (Log.isLoggable(this.c, 3)));
  }
  
  public final void a(String paramString, Object... paramVarArgs)
  {
    if (a()) {
      b(paramString, paramVarArgs);
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (a()) {
      b(paramString, paramVarArgs);
    }
  }
  
  public final String b(String paramString, Object... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {}
    for (;;)
    {
      if (!TextUtils.isEmpty(this.a)) {
        paramString = this.a + paramString;
      }
      return paramString;
      paramString = String.format(Locale.ROOT, paramString, paramVarArgs);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edm
 * JD-Core Version:    0.7.0.1
 */