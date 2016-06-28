import android.content.Context;

final class jzz
{
  private static final int b = qxe.a.b >>> 3;
  final kcx a;
  
  jzz(Context paramContext, kcg paramkcg, String paramString)
  {
    this.a = new kcx(paramContext, paramkcg);
    qxe localqxe = new qxe();
    localqxe.b = paramString;
    this.a.a(qxe.a, localqxe, b);
  }
  
  public final boolean a()
  {
    if (!this.a.n()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Response contains error.");
      return ((qxf)this.a.a(this.a.a(b), qxf.a)).b.booleanValue();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzz
 * JD-Core Version:    0.7.0.1
 */