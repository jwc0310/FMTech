import android.content.Context;

final class glg
  extends gzf
{
  private final int a;
  private final ilb b;
  
  public glg(glf paramglf, Context paramContext, int paramInt)
  {
    super(paramContext, "RemoveAccountTask");
    this.a = paramInt;
    this.b = ((ilb)mbb.a(paramContext, ilb.class));
  }
  
  protected final hae a()
  {
    this.b.b(this.a);
    return new hae(true);
  }
  
  public final String b()
  {
    return this.c.a.getString(efj.Dd);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glg
 * JD-Core Version:    0.7.0.1
 */