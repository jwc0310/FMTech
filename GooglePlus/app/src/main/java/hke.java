import android.content.Context;

public final class hke
{
  private static final int b = rcc.a.b >>> 3;
  public final kcx a;
  
  public hke(Context paramContext, kcg paramkcg, String paramString, String[] paramArrayOfString)
  {
    this.a = new kcx(paramContext, paramkcg);
    rcb localrcb = new rcb();
    localrcb.b = new rcd();
    localrcb.b.a = paramString;
    localrcb.b.b = paramArrayOfString;
    this.a.a(rcb.a, localrcb, b);
  }
  
  public final rcc a()
  {
    if (!this.a.n()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Response contains error.");
      return (rcc)this.a.a(this.a.a(b), rcc.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hke
 * JD-Core Version:    0.7.0.1
 */