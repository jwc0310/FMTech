import android.content.Context;

public final class koa
  extends fj<knq>
{
  private final knz d;
  private final int e;
  private final kbo f;
  private final String g;
  private final knw h;
  private knq r;
  
  public koa(Context paramContext, int paramInt, kbo paramkbo, String paramString, knw paramknw)
  {
    super(paramContext);
    this.e = paramInt;
    this.f = paramkbo;
    this.g = paramString;
    this.h = paramknw;
    this.d = ((knz)mbb.a(paramContext, knz.class));
  }
  
  private void a(knq paramknq)
  {
    this.r = paramknq;
    if (this.m) {
      super.b(paramknq);
    }
  }
  
  protected final void g()
  {
    if (this.r != null)
    {
      a(this.r);
      return;
    }
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koa
 * JD-Core Version:    0.7.0.1
 */