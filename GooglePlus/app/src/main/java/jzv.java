import android.content.Context;

final class jzv
{
  private static final int b = qts.a.b >>> 3;
  final kcx a;
  
  public jzv(Context paramContext, kcg paramkcg, String paramString)
  {
    this.a = new kcx(paramContext, paramkcg);
    qts localqts = new qts();
    localqts.b = paramString;
    this.a.a(qts.a, localqts, b);
  }
  
  public final qtt a()
  {
    if (!this.a.n()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Response contains error.");
      return (qtt)this.a.a(this.a.a(b), qtt.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzv
 * JD-Core Version:    0.7.0.1
 */