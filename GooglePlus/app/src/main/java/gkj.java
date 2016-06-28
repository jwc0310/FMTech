import android.content.Context;
import android.os.Build.VERSION;

public final class gkj
{
  private static final mcq a = new mcq(".login.accountsource");
  
  public static giz a(Context paramContext)
  {
    return new gjt(paramContext);
  }
  
  static gjr a(giz paramgiz)
  {
    return new gjr(paramgiz);
  }
  
  public static gjl[] a(Context paramContext, fpw paramfpw)
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      gjl[] arrayOfgjl2 = new gjl[1];
      arrayOfgjl2[0] = new gkp(paramfpw);
      return arrayOfgjl2;
    }
    gjl[] arrayOfgjl1 = new gjl[1];
    arrayOfgjl1[0] = new gkq(paramContext);
    return arrayOfgjl1;
  }
  
  public static mcn[] a(gjr paramgjr)
  {
    return new mcn[0];
  }
  
  public static gjm b(Context paramContext)
  {
    return new gkl(paramContext);
  }
  
  public static hta[] b(gjr paramgjr)
  {
    return new hta[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkj
 * JD-Core Version:    0.7.0.1
 */