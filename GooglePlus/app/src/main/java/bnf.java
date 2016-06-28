import android.content.Context;

public final class bnf
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  
  public bnf(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, "GetActivityTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  protected final hae a()
  {
    int i = this.a;
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    biu localbiu = new biu(this.e, i, this.b, this.c, this.d);
    localbiu.i();
    return new hae(localbiu.o, localbiu.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnf
 * JD-Core Version:    0.7.0.1
 */