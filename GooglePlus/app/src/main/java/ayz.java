import android.os.Bundle;

public class ayz
  extends mca
  implements gii
{
  static final bfc a = new bfc(aaw.iy);
  bfd b;
  bdk c;
  private final gzj d = new gzj(this, this.bp);
  
  public ayz()
  {
    new bez(this, this.bp, a, new aza(this));
    new jeq(this.bp, new azb(this), '\000');
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((bfd)this.bo.a(bfd.class));
    this.c = ((bdk)this.bo.a(bdk.class));
    this.bo.a(gii.class, this);
  }
  
  public final void c_(int paramInt)
  {
    int i = this.m.getInt("account_id", -1);
    azc localazc = new azc(f(), i, paramInt, Long.valueOf(this.c.b.o()), this.c.b.j());
    gzj localgzj = this.d;
    localgzj.d.a(localazc, false);
    localgzj.b(localazc);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayz
 * JD-Core Version:    0.7.0.1
 */