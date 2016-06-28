import android.content.Context;

public final class dnv
  extends gzf
{
  private final Context a;
  private final int b;
  private bui c;
  
  public dnv(Context paramContext, int paramInt, bui parambui)
  {
    super(paramContext, "ChangeNotificationSettingsTask");
    this.a = paramContext;
    this.b = paramInt;
    this.c = parambui;
  }
  
  protected final hae a()
  {
    blr localblr = new blr(this.a, this.b, this.c);
    localblr.i();
    int i = localblr.o;
    Exception localException = localblr.q;
    if (localblr.n()) {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    }
    for (String str = this.e.getString(aau.lU);; str = null) {
      return new hae(i, localException, str);
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.th);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnv
 * JD-Core Version:    0.7.0.1
 */