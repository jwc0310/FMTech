import android.content.Context;

public final class jyt
{
  public static final String a = jyl.class.getName();
  public static final String b = jyk.class.getName();
  public static final String c = inj.class.getName();
  public static final String d = gjg.class.getName();
  private static jys e;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (e == null) {
      e = new jys();
    }
    inj[] arrayOfinj = new inj[1];
    arrayOfinj[0] = new jyu(paramContext);
    parammbb.a(inj.class, arrayOfinj);
  }
  
  public static void a(mbb parammbb)
  {
    if (e == null) {
      e = new jys();
    }
    parammbb.a(jyl.class, new jyl());
  }
  
  public static void b(mbb parammbb)
  {
    if (e == null) {
      e = new jys();
    }
    parammbb.a(jyk.class, new jyp());
  }
  
  public static void c(mbb parammbb)
  {
    if (e == null) {
      e = new jys();
    }
    parammbb.a(gjg.class, new gjg[] { (jyl)parammbb.a(jyl.class) });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyt
 * JD-Core Version:    0.7.0.1
 */