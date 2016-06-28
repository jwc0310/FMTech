import android.content.Context;

public final class bna
  extends gzf
{
  private final int a;
  
  public bna(Context paramContext, int paramInt)
  {
    super(paramContext, "EventHomePageTask");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    bim localbim = new bim(this.e, this.a);
    localbim.i();
    return new hae(localbim.o, localbim.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bna
 * JD-Core Version:    0.7.0.1
 */