import android.os.Bundle;

public class awc
  extends mca
{
  private static final bfc a = new bfc(aaw.ae);
  private static final bfc b = new bfc(aaw.jg);
  private bdk Z;
  private final gzj c = new gzj(this, this.bp);
  private bfd d;
  
  public awc()
  {
    new bez(this, this.bp, a, new awd(this));
    new bez(this, this.bp, b, new awe(this));
    new jeq(this.bp, new awf(this), '\000');
    new jeq(this.bp, new awg(this), '\000');
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((bfd)this.bo.a(bfd.class));
    this.Z = ((bdk)this.bo.a(bdk.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awc
 * JD-Core Version:    0.7.0.1
 */