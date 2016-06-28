import android.content.Context;

public final class jyg
{
  public static final String a = iuu.class.getName();
  public static final String b = lrl.class.getName();
  private static jyf c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new jyf();
    }
    lrl[] arrayOflrl = new lrl[1];
    arrayOflrl[0] = new jyi(paramContext);
    parammbb.a(lrl.class, arrayOflrl);
  }
  
  public static void a(mbb parammbb)
  {
    if (c == null) {
      c = new jyf();
    }
    iuu[] arrayOfiuu = new iuu[1];
    arrayOfiuu[0] = new jyh();
    parammbb.a(iuu.class, arrayOfiuu);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyg
 * JD-Core Version:    0.7.0.1
 */