import android.content.Context;

public final class kwl
{
  public static final String a = kvq.class.getName();
  public static final String b = iwx.class.getName();
  public static final String c = hyf.class.getName();
  private static kwk d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new kwk();
    }
    parammbb.a(kvq.class, new kwn(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new kwk();
    }
    parammbb.a(iwx.class, new kwm());
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new kwk();
    }
    hyf[] arrayOfhyf = new hyf[2];
    arrayOfhyf[0] = kwi.a;
    arrayOfhyf[1] = kwi.b;
    parammbb.a(hyf.class, arrayOfhyf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwl
 * JD-Core Version:    0.7.0.1
 */