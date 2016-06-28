import android.content.Context;

public final class bos
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  
  public bos(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    super(paramContext, "WritePlaceOwnerResponseTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  protected final hae a()
  {
    int i = this.a;
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    bmu localbmu = new bmu(this.e, i, this.b, this.c, this.d);
    localbmu.i();
    int j = localbmu.o;
    Exception localException = localbmu.q;
    if (localbmu.n()) {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    }
    for (String str = this.e.getString(aau.mm);; str = null) {
      return new hae(j, localException, str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bos
 * JD-Core Version:    0.7.0.1
 */