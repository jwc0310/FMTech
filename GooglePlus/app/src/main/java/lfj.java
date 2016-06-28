import android.content.Context;

public final class lfj
  extends gzf
{
  private final int a;
  private final String b;
  private final kcg c;
  private final kyn d;
  
  public lfj(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, "DeclineSquareInvitationTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = new kcg(paramContext, this.a);
    this.d = ((kyn)mbb.a(paramContext, kyn.class));
  }
  
  protected final hae a()
  {
    this.d.a(this.a, this.b);
    lfo locallfo = new lfo(g(), this.c, this.b, 21);
    locallfo.i();
    if (!locallfo.n()) {
      this.d.a(this.a, this.b, 21);
    }
    int i = locallfo.o;
    Exception localException = locallfo.q;
    if (locallfo.n()) {}
    for (String str = g().getString(fa.u);; str = null) {
      return new hae(i, localException, str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfj
 * JD-Core Version:    0.7.0.1
 */