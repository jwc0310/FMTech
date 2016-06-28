import android.content.Context;

public final class izw
  extends gzf
{
  private final Context a;
  private final long b;
  private final int c;
  
  public izw(Context paramContext, int paramInt, long paramLong)
  {
    super(paramContext, "RemoveItemTask");
    this.a = paramContext;
    this.c = paramInt;
    this.b = paramLong;
  }
  
  protected final hae a()
  {
    hae localhae = new hae(true);
    ((iyl)mbb.a(this.a, iyl.class)).a(this.c).a(this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izw
 * JD-Core Version:    0.7.0.1
 */