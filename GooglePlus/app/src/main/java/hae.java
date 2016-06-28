import android.os.Bundle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class hae
{
  static final long a = TimeUnit.DAYS.toMillis(1L);
  public final int b;
  public final Exception c;
  public final String d;
  final long e;
  int f = haf.b;
  byte[] g;
  pdz h;
  private Bundle i;
  
  public hae(int paramInt, Exception paramException, String paramString)
  {
    this.b = paramInt;
    this.c = paramException;
    this.d = paramString;
    this.e = System.currentTimeMillis();
  }
  
  hae(int paramInt, Exception paramException, String paramString, byte[] paramArrayOfByte, long paramLong)
  {
    this.b = paramInt;
    this.c = paramException;
    this.d = paramString;
    this.g = paramArrayOfByte;
    this.e = paramLong;
  }
  
  public hae(boolean paramBoolean) {}
  
  public static boolean a(hae paramhae)
  {
    if (paramhae != null)
    {
      if (paramhae.b != 200) {}
      for (int j = 1; j != 0; j = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final Bundle a()
  {
    if (this.g != null)
    {
      ClassLoader localClassLoader = getClass().getClassLoader();
      this.i = ((Bundle)efj.a(this.g, localClassLoader));
      this.i.setClassLoader(localClassLoader);
      this.g = null;
    }
    if (this.i == null) {
      this.i = new Bundle();
    }
    return this.i;
  }
  
  final void b()
  {
    if (this.i == null) {
      return;
    }
    this.g = efj.a(this.i);
    this.i = null;
  }
  
  public final String toString()
  {
    if (this.b != 200) {}
    for (int j = 1; j != 0; j = 0)
    {
      Locale localLocale2 = Locale.getDefault();
      Object[] arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = this.d;
      long l2 = this.e;
      arrayOfObject2[1] = efj.a(System.currentTimeMillis() - l2);
      arrayOfObject2[2] = Integer.valueOf(this.b);
      arrayOfObject2[3] = this.c;
      return String.format(localLocale2, "TaskResult(message=%s, age=%s, errorCode=%d, exception=%s)", arrayOfObject2);
    }
    String str;
    if (this.i != null)
    {
      int m = this.i.size();
      str = 19 + "Bundle(" + m + ")";
    }
    for (;;)
    {
      Locale localLocale1 = Locale.getDefault();
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.d;
      long l1 = this.e;
      arrayOfObject1[1] = efj.a(System.currentTimeMillis() - l1);
      arrayOfObject1[2] = str;
      return String.format(localLocale1, "TaskResult(message=%s, age=%s, extras=%s)", arrayOfObject1);
      if (this.g != null)
      {
        int k = this.g.length;
        str = 17 + "byte[" + k + "]";
      }
      else
      {
        str = "null";
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hae
 * JD-Core Version:    0.7.0.1
 */