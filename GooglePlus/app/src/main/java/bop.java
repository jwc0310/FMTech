import android.content.Context;

public final class bop
  extends gzf
{
  private Context a;
  private int b;
  
  public bop(Context paramContext, int paramInt)
  {
    super(paramContext, "UpdateTrendingTopicsTask");
    this.a = paramContext;
    this.b = paramInt;
  }
  
  protected final hae a()
  {
    kbu localkbu = (kbu)mbb.a(this.a, kbu.class);
    bmk localbmk = new bmk(this.a, this.b);
    localkbu.a(localbmk);
    return new hae(localbmk.o, localbmk.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bop
 * JD-Core Version:    0.7.0.1
 */