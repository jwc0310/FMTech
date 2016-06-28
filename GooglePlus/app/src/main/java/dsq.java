import android.content.Context;

public final class dsq
  extends gzf
{
  private final int a;
  private final obl b;
  
  public dsq(Context paramContext, int paramInt, obl paramobl)
  {
    super(paramContext, "SetProfileSettingsTask");
    this.a = paramInt;
    this.b = paramobl;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    dsp localdsp = new dsp(this.e, this.a, this.b);
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    ((kbu)mbb.a(this.e, kbu.class)).a(localdsp);
    int i = localdsp.o;
    Exception localException = localdsp.q;
    if (localdsp.n()) {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    }
    for (String str = this.e.getString(aau.ro);; str = null) {
      return new hae(i, localException, str);
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.rj);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsq
 * JD-Core Version:    0.7.0.1
 */