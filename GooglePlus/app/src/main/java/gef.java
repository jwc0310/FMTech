import android.app.Application;
import android.content.Context;

public final class gef
{
  public static final String a = gdp.class.getName();
  public static final String b = gei.class.getName();
  private static gee c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new gee();
    }
    gdw localgdw = (gdw)mbb.b(paramContext, gdw.class);
    gdx localgdx = (gdx)mbb.b(paramContext, gdx.class);
    gdv localgdv = (gdv)mbb.b(paramContext, gdv.class);
    gdu localgdu = new gdu();
    if (localgdw != null) {
      localgdu.a = localgdw;
    }
    if (localgdx != null) {
      localgdu.b = localgdx;
    }
    if (localgdv != null) {
      localgdu.c = localgdv;
    }
    parammbb.a(gdp.class, gdp.a((geh)mbb.a(paramContext, gei.class), (Application)paramContext.getApplicationContext(), new gdt(localgdu.a, localgdu.b, localgdu.c)));
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new gee();
    }
    String str = mbb.a(paramContext, "com.google.android.libraries.performance.primes.modules.clearcutlogsource", null);
    if (str == null) {
      throw new NullPointerException();
    }
    parammbb.a(gei.class, new gei((frj)mbb.a(paramContext, frj.class), str));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gef
 * JD-Core Version:    0.7.0.1
 */