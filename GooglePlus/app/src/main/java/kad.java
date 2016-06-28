import android.content.Context;

final class kad
{
  private static final int b = qwv.a.b >>> 3;
  final kcx a;
  
  kad(Context paramContext, kcg paramkcg, String paramString)
  {
    this.a = new kcx(paramContext, paramkcg);
    qwv localqwv = new qwv();
    localqwv.b = paramString;
    this.a.a(qwv.a, localqwv, b);
  }
  
  public final boolean a()
  {
    boolean bool;
    mnz[] arrayOfmnz;
    int i;
    if (!this.a.n())
    {
      bool = true;
      efj.d(bool, "Response contains error.");
      arrayOfmnz = ((qww)this.a.a(this.a.a(b), qww.a)).b.i;
      i = arrayOfmnz.length;
    }
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label99;
      }
      mnz localmnz = arrayOfmnz[j];
      if ((localmnz.a == 1) && (!localmnz.b.booleanValue()))
      {
        return true;
        bool = false;
        break;
      }
    }
    label99:
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kad
 * JD-Core Version:    0.7.0.1
 */