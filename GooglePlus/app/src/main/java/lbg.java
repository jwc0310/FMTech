import android.content.Context;

public final class lbg
{
  final kcy a;
  kcy<qya, qyb> b;
  private kcy<qyf, Object> c;
  private kcy<qyc, Object> d;
  
  public lbg(Context paramContext, kcg paramkcg, String paramString, qxt paramqxt, int paramInt)
  {
    if (paramInt == 0)
    {
      qya localqya = new qya();
      localqya.b = paramString;
      localqya.c = paramqxt.b;
      this.b = new kcy(paramContext, paramkcg, qya.a, localqya);
      this.a = this.b;
      return;
    }
    if (paramInt == 1)
    {
      qyf localqyf = new qyf();
      localqyf.b = paramString;
      localqyf.c = paramqxt;
      this.c = new kcy(paramContext, paramkcg, qyf.a, localqyf);
      this.a = this.c;
      return;
    }
    qyc localqyc = new qyc();
    localqyc.b = paramString;
    localqyc.c = paramqxt.a;
    this.d = new kcy(paramContext, paramkcg, qyc.a, localqyc);
    this.a = this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbg
 * JD-Core Version:    0.7.0.1
 */