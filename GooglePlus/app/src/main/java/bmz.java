import android.content.Context;

public final class bmz
  extends gzf
{
  private final int a;
  
  public bmz(Context paramContext, int paramInt)
  {
    super(paramContext, "DismissAllNotificationsTask");
    this.a = paramInt;
  }
  
  public final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    brg.a(localContext, this.a);
    long l = brg.g(localContext, this.a);
    bjz localbjz = new bjz(localContext, this.a, l);
    localbjz.i();
    hae localhae = new hae(localbjz.o, localbjz.q, null);
    new bir(localContext, this.a, null).i();
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmz
 * JD-Core Version:    0.7.0.1
 */