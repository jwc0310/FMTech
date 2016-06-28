import java.util.concurrent.TimeUnit;

public class fsg<GR extends fsh>
{
  public final efk<R> a;
  public final ftb<GR, R> b;
  
  public fsg(efk<R> paramefk, ftb<GR, R> paramftb)
  {
    this.a = paramefk;
    this.b = paramftb;
  }
  
  public GR a()
  {
    return this.b.a(this.a.a());
  }
  
  public GR a(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.b.a(this.a.a(10L, paramTimeUnit));
  }
  
  public void a(fsi<GR> paramfsi)
  {
    this.a.a(new fsu(paramfsi, this.b));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fsg
 * JD-Core Version:    0.7.0.1
 */