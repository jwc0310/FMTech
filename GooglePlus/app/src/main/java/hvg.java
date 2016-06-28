import android.content.Context;

public final class hvg
  extends gzf
{
  private final String a;
  private final int b;
  private final hgg c;
  
  public hvg(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, "RemovePeopleSuggestionsBackgroundOp");
    this.b = paramInt;
    this.a = paramString;
    this.c = ((hgg)mbb.a(paramContext, hgg.class));
  }
  
  protected final hae a()
  {
    try
    {
      this.c.a(g(), this.b, this.a);
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
 * Qualified Name:     hvg
 * JD-Core Version:    0.7.0.1
 */