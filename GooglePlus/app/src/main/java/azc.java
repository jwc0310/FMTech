import android.content.Context;

public final class azc
  extends gzf
{
  private final kbu a;
  private final int b;
  private final int c;
  private final long d;
  private final String l;
  
  public azc(Context paramContext, int paramInt1, int paramInt2, Long paramLong, String paramString)
  {
    super(paramContext, "ReportAbuseTask");
    this.a = ((kbu)mbb.a(paramContext, kbu.class));
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramLong.longValue();
    this.l = paramString;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    blj localblj = new blj(this.e, this.b, this.l, this.d, this.c);
    this.a.a(localblj);
    int i = localblj.o;
    Exception localException = localblj.q;
    if (localblj.n()) {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    }
    for (String str = this.e.getString(aau.sh);; str = null) {
      return new hae(i, localException, str);
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.sk);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azc
 * JD-Core Version:    0.7.0.1
 */