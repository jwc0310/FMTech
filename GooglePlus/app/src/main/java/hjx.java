import android.content.Context;

public final class hjx
{
  private static final int b = rci.a.b >>> 3;
  public final kcx a;
  
  public hjx(Context paramContext, kcg paramkcg, String paramString1, String paramString2)
  {
    this.a = new kcx(paramContext, paramkcg);
    rch localrch = new rch();
    localrch.c = Boolean.valueOf(false);
    localrch.b = paramString1;
    localrch.d = new rcg();
    localrch.d.a = Integer.valueOf(48);
    localrch.d.b = paramString2;
    this.a.a(rch.a, localrch, b);
  }
  
  public final rci a()
  {
    if (!this.a.n()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Response contains error.");
      return (rci)this.a.a(this.a.a(b), rci.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjx
 * JD-Core Version:    0.7.0.1
 */