import android.content.Context;

public final class cim
  extends gzf
{
  private final int a;
  
  public cim(Context paramContext, int paramInt)
  {
    super(paramContext, "ClearNetworkStatisticsTask");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    brd.b(this.e, this.a);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cim
 * JD-Core Version:    0.7.0.1
 */