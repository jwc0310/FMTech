import android.content.Context;

public final class boi
  extends gzf
{
  private final kbu a;
  private final Context b;
  private final int c;
  private final int d;
  private final String l;
  private final int m;
  private final boolean n;
  
  public boi(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean)
  {
    super(paramContext, "SetVolumeControlTask");
    this.b = paramContext;
    this.c = paramInt1;
    this.d = paramInt2;
    this.l = paramString;
    this.m = paramInt3;
    this.n = paramBoolean;
    this.a = ((kbu)mbb.a(paramContext, kbu.class));
  }
  
  protected final hae a()
  {
    omv localomv = new omv();
    localomv.a = this.m;
    if (this.n) {}
    for (int i = 2;; i = 1)
    {
      localomv.b = i;
      bly localbly = new bly(this.b, this.c, this.d, this.l, localomv);
      this.a.a(localbly);
      return new hae(localbly.o, localbly.q, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boi
 * JD-Core Version:    0.7.0.1
 */