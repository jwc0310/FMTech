import android.content.Context;

public final class djr
{
  public static final String a = djp.class.getName();
  public static final String b = hyf.class.getName();
  private static djq c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new djq();
    }
    parammbb.a(djp.class, new djs(paramContext));
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new djq();
    }
    hyf[] arrayOfhyf = new hyf[3];
    arrayOfhyf[0] = djo.a;
    arrayOfhyf[1] = djo.b;
    arrayOfhyf[2] = djo.c;
    parammbb.a(hyf.class, arrayOfhyf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djr
 * JD-Core Version:    0.7.0.1
 */