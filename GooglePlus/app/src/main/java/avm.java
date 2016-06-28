import android.os.Bundle;

public class avm
  extends mca
{
  static final aip a = new bfc(aaw.jd);
  static final aip b = new bfc(aaw.hm);
  bdk Z;
  jov aa;
  jpd ab;
  private final jpe ac = new avn(this);
  private jpe ad = new avo(this);
  bfd c;
  avi d;
  
  public avm()
  {
    new bez(this, this.bp, bfi.d, new avp(this));
    new bez(this, this.bp, a, new avq(this));
    new bez(this, this.bp, b, new avr(this));
    new jeq(this.bp, new avs(this), '\000');
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aa.a(aaw.iH, this.ac).a(aaw.iP, this.ad);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((bfd)this.bo.a(bfd.class));
    this.d = ((avi)this.bo.a(avi.class));
    this.Z = ((bdk)this.bo.a(bdk.class));
    this.aa = ((jov)this.bo.a(jov.class));
    this.ab = ((jpd)this.bo.a(jpd.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avm
 * JD-Core Version:    0.7.0.1
 */