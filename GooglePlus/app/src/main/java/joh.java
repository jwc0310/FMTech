import android.content.Context;

public final class joh
{
  public static final String a = hrh.class.getName();
  public static final String b = jol.class.getName();
  private static jod c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new jod();
    }
    jod localjod = c;
    hrh[] arrayOfhrh = new hrh[3];
    arrayOfhrh[0] = new joe(localjod, "CirclesAndPeople.search");
    arrayOfhrh[1] = new jof(localjod, "Circles.search");
    arrayOfhrh[2] = new jog(localjod, "People.search");
    parammbb.a(hrh.class, arrayOfhrh);
  }
  
  public static void a(mbb parammbb)
  {
    if (c == null) {
      c = new jod();
    }
    parammbb.a(jol.class, new jol());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     joh
 * JD-Core Version:    0.7.0.1
 */