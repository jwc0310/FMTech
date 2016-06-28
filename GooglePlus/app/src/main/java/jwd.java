import android.content.Context;

final class jwd
  extends gzf
{
  private static final String a = String.valueOf(jwd.class.getName()).concat("UpdateVote");
  private final Context b;
  private final int c;
  private final String d;
  private final lly l;
  
  public jwd(Context paramContext, int paramInt, String paramString, lly paramlly)
  {
    super(paramContext, a);
    this.b = paramContext;
    this.c = paramInt;
    this.d = paramString;
    this.l = paramlly;
  }
  
  protected final hae a()
  {
    try
    {
      ((jtm)mbb.a(this.b, jtm.class)).a(this.c, this.d, this.l);
      hae localhae = new hae(true);
      return localhae;
    }
    catch (Exception localException)
    {
      return new hae(0, localException, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwd
 * JD-Core Version:    0.7.0.1
 */