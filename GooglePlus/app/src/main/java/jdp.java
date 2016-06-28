import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class jdp
{
  private static final String a = jdr.a(jdp.class);
  private static int b = -1;
  private static int[] c = { 3, 4 };
  private static int[] d = { 2 };
  private static jdp e;
  private final Context f;
  
  private jdp(Context paramContext)
  {
    this.f = paramContext;
  }
  
  public static int a(jan paramjan)
  {
    switch (jdq.b[paramjan.ordinal()])
    {
    default: 
      return 0;
    case 1: 
      return 2;
    case 2: 
      return 3;
    case 3: 
      return 1;
    }
    return 8;
  }
  
  public static jdp a(Context paramContext)
  {
    try
    {
      if (e == null) {
        e = new jdp(paramContext);
      }
      jdp localjdp = e;
      return localjdp;
    }
    finally {}
  }
  
  public static int[] a(izx paramizx)
  {
    switch (jdq.a[paramizx.ordinal()])
    {
    default: 
      String str1 = a;
      String str2 = String.valueOf(paramizx);
      jdr.c(str1, 24 + String.valueOf(str2).length() + "Unknown fetch category: " + str2);
      return c;
    case 1: 
      return c;
    }
    return d;
  }
  
  public final nnx a()
  {
    nnx localnnx = new nnx();
    nnm localnnm = new nnm();
    if (b < 0) {
      b = this.f.getResources().getDisplayMetrics().densityDpi;
    }
    int i;
    switch (b)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      localnnm.a = i;
      localnnm.b = this.f.getResources().getConfiguration().locale.toString();
      localnnx.b = localnnm;
      localnnx.a = ((jaq)mbb.a(this.f, jaq.class)).b();
      return localnnx;
      i = 3;
      continue;
      i = 4;
      continue;
      i = 5;
      continue;
      i = 9;
    }
  }
  
  public final String b()
  {
    return ((jaq)mbb.a(this.f, jaq.class)).a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdp
 * JD-Core Version:    0.7.0.1
 */