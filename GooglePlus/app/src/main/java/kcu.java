import android.content.Context;

public class kcu<RQ extends qat, RS extends qat>
  extends kct<RS>
{
  private boolean a;
  public final RQ y;
  
  public kcu(Context paramContext, kcg paramkcg, String paramString1, RQ paramRQ, RS paramRS, String paramString2, String paramString3)
  {
    super(paramContext, paramkcg, "POST", paramString1, paramRS, paramString2, paramString3);
    this.y = paramRQ;
  }
  
  private final void h()
  {
    if (this.a) {
      return;
    }
    c(this.y);
    b(this.y);
    this.a = true;
  }
  
  public void b(RQ paramRQ) {}
  
  public void c(RQ paramRQ) {}
  
  public byte[] e()
  {
    h();
    return qat.a(this.y);
  }
  
  public final String m()
  {
    h();
    return efj.a(this.y);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcu
 * JD-Core Version:    0.7.0.1
 */