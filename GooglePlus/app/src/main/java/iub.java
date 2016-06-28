import android.content.Context;

public final class iub
{
  final Context a;
  String b;
  public String c;
  String d;
  public iud e = itz.d;
  public boolean f;
  public iun g = iun.d;
  public itg h = itg.a;
  
  public iub(Context paramContext)
  {
    efj.e(paramContext, "context must be non-null");
    this.a = paramContext;
  }
  
  public final itz a()
  {
    efj.a(this.b, "must specify an accountName");
    efj.a(this.c, "must specify an accountGaiaId");
    return new itz(this);
  }
  
  public final iub a(int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt);
    this.b = localgjb.b("account_name");
    this.c = localgjb.b("gaia_id");
    this.d = localgjb.b("effective_gaia_id");
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iub
 * JD-Core Version:    0.7.0.1
 */