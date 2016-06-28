import android.os.Build.VERSION;
import android.os.Bundle;

public final class eq
  extends ew
{
  public static final es a;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 20) {
      a = new et();
    }
    for (;;)
    {
      new ex();
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        a = new ev();
      } else {
        a = new eu();
      }
    }
  }
  
  public eq(String paramString, CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence, boolean paramBoolean, Bundle paramBundle)
  {
    this.b = paramString;
    this.c = paramCharSequence;
    this.d = paramArrayOfCharSequence;
    this.e = paramBoolean;
    this.f = paramBundle;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final CharSequence b()
  {
    return this.c;
  }
  
  public final CharSequence[] c()
  {
    return this.d;
  }
  
  public final boolean d()
  {
    return this.e;
  }
  
  public final Bundle e()
  {
    return this.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eq
 * JD-Core Version:    0.7.0.1
 */