import android.content.Context;

public final class bpb
{
  public static final String a = lpo.class.getName();
  public static final String b = hhe.class.getName();
  public static final String c = hhc.class.getName();
  public static final String d = bot.class.getName();
  public static final String e = hpo.class.getName();
  public static final String f = hho.class.getName();
  private static bpa g;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    lpo[] arrayOflpo = new lpo[1];
    arrayOflpo[0] = new bpi(paramContext);
    parammbb.a(lpo.class, arrayOflpo);
  }
  
  public static void a(mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    parammbb.a(hhc.class, new box());
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    parammbb.a(hhe.class, new bow(paramContext));
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    parammbb.a(bot.class, new bpc(paramContext));
  }
  
  public static void d(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    parammbb.a(hpo.class, new bpp(paramContext));
  }
  
  public static void e(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new bpa();
    }
    parammbb.a(hho.class, new bpj(paramContext));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpb
 * JD-Core Version:    0.7.0.1
 */