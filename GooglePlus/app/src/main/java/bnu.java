import android.content.Context;

public final class bnu
  extends gzf
{
  private final int a;
  private final int b;
  private final int c;
  private final kcg d;
  
  public bnu(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramContext, "PostSurveyResultTask");
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = new kcg(paramContext, this.a);
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    blb localblb = new blb(this.e, this.d, this.b, this.c);
    localblb.i();
    return new hae(localblb.o, localblb.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnu
 * JD-Core Version:    0.7.0.1
 */