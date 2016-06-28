import android.content.Context;

public final class cbo
  extends gzf
{
  private final int a;
  private final String b;
  private final aqr c;
  
  public cbo(cbj paramcbj, Context paramContext, int paramInt, String paramString, aqr paramaqr)
  {
    super(paramContext, "ListBestPhotosTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramaqr;
  }
  
  protected final hae a()
  {
    bjq localbjq = new bjq(this.d.bn, this.a, null, this.b);
    localbjq.i();
    return new hae(localbjq.o, localbjq.q, null);
  }
  
  protected final void a_(hae paramhae)
  {
    if (paramhae.b != 200) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.c.h = null;
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbo
 * JD-Core Version:    0.7.0.1
 */