import java.util.ArrayList;

public final class gfj
{
  private final ArrayList<gfm> a = new ArrayList();
  
  static
  {
    new gfj();
  }
  
  private gfj()
  {
    this.a.add(new gfl(qkt.a));
    this.a.add(new gfk(qks.a));
    a(qkv.a);
    this.a.add(new gfo(qla.a));
    this.a.add(new gfp(qlc.a));
    this.a.add(new gfr(qll.a));
    a(qle.a);
    a(qkx.a);
    a(qlg.a);
    this.a.add(new gfq(qli.a));
    this.a.add(new gfs(qln.a));
  }
  
  private final <T extends qan> void a(qao<qml, T> paramqao)
  {
    this.a.add(new gfm(paramqao));
  }
  
  public static boolean a(oih paramoih)
  {
    int i;
    if ((paramoih == null) || (paramoih.a == null) || (paramoih.a.a == null) || (paramoih.a.a.length == 0))
    {
      i = 0;
      if (i != 0) {
        break label92;
      }
    }
    for (;;)
    {
      return true;
      qml[] arrayOfqml2 = paramoih.a.a;
      int m = arrayOfqml2.length;
      for (int n = 0;; n++)
      {
        if (n >= m) {
          break label87;
        }
        if (a(arrayOfqml2[n], 1))
        {
          i = 1;
          break;
        }
      }
      label87:
      i = 0;
      break;
      label92:
      for (qml localqml : paramoih.a.a) {
        if ((a(localqml, 1)) && (!a(localqml, 3))) {
          return false;
        }
      }
    }
  }
  
  public static boolean a(qml paramqml)
  {
    return a(paramqml, 1);
  }
  
  private static boolean a(qml paramqml, int paramInt)
  {
    if (paramqml.a == null) {}
    for (;;)
    {
      return false;
      if (paramqml.a.a != null)
      {
        int[] arrayOfInt = paramqml.a.a;
        int i = arrayOfInt.length;
        for (int j = 0; j < i; j++) {
          if (arrayOfInt[j] == paramInt) {
            return true;
          }
        }
      }
    }
  }
  
  public static boolean b(qml paramqml)
  {
    return a(paramqml, 3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfj
 * JD-Core Version:    0.7.0.1
 */