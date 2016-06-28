import android.content.Context;

public final class boo
  extends gzf
{
  public gnb a;
  public gnb b;
  private final int c;
  private final String d;
  private final String l;
  private final boolean m;
  private final boolean n;
  
  public boo(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, "UpdateCollectionTask");
    this.c = paramInt;
    this.d = paramString1;
    this.l = paramString2;
    this.m = paramBoolean1;
    this.n = paramBoolean2;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    kbu localkbu = (kbu)mbb.a(localContext, kbu.class);
    kcp localkcp = kdg.a(localContext, this.c);
    bmm localbmm = new bmm(localContext, this.c, this.d, this.l);
    localbmm.a(this.m);
    localkcp.a(localbmm);
    localkcp.a(new bmn(localContext, this.c, this.d, this.l, this.n));
    if (((this.a != null) && (!this.a.b())) || ((this.b != null) && (!this.b.b()))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localkcp.a(new bml(localContext, this.c, this.d, this.l, this.a, this.b));
      }
      localkbu.a(localkcp);
      return new hae(localkcp.o, null, null);
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.sE);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boo
 * JD-Core Version:    0.7.0.1
 */