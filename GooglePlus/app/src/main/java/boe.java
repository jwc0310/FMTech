import android.content.Context;

public final class boe
  extends gzf
{
  private final int a;
  
  public boe(Context paramContext, int paramInt)
  {
    super(paramContext, "ResetPeopleViewNotificationCountBackgroundOp");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    bgp.a(this.e, this.a, new odg[0], true);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boe
 * JD-Core Version:    0.7.0.1
 */