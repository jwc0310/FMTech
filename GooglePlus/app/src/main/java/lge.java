import android.content.Context;
import android.os.Bundle;

public final class lge
  extends gzf
{
  private final kcg a;
  private final String b;
  private final int[] c;
  
  public lge(Context paramContext, int paramInt, String paramString1, int[] paramArrayOfInt, String paramString2)
  {
    super(paramContext, paramString1);
    this.a = new kcg(paramContext, paramInt);
    this.c = paramArrayOfInt;
    this.b = paramString2;
  }
  
  protected final hae a()
  {
    lgd locallgd = new lgd(g(), this.a, this.c, this.b);
    locallgd.i();
    hae localhae = new hae(locallgd.o, locallgd.q, null);
    if (!locallgd.n())
    {
      boolean bool = locallgd.x;
      qat localqat = null;
      if (bool) {
        localqat = locallgd.w;
      }
      ofh localofh = ((muw)localqat).a;
      localhae.a().putInt("squares_promo_type", localofh.a);
    }
    localhae.a().putString("square_id_key", this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lge
 * JD-Core Version:    0.7.0.1
 */