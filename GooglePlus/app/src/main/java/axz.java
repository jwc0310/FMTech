import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class axz
  extends mca
{
  bdk Z;
  dxl a;
  boolean aa;
  private hue ab = new hue(this.bp);
  private final guf ac = new aya(this);
  private final guf ad = new ayb(this);
  private final bfg ae;
  beu b;
  bfd c;
  final gug d;
  
  public axz()
  {
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.d = localgug.a(aaw.iE, this.ac).a(aaw.iC, this.ad);
    this.ae = new ayc(this);
    new bez(this, this.bp, bfi.aa, this.ae);
    new jeq(this.bp, new aye(this), '\000');
  }
  
  static oih b(Intent paramIntent)
  {
    byte[] arrayOfByte = paramIntent.getByteArrayExtra("edit_info");
    if (arrayOfByte != null) {
      try
      {
        oih localoih = (oih)qat.b(new oih(), arrayOfByte, 0, arrayOfByte.length);
        return localoih;
      }
      catch (qas localqas)
      {
        Log.e("PhotoEditingFragment", "Failed to deserialize EditInfo.", localqas);
      }
    }
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((dxl)this.bo.a(dxl.class));
    this.b = ((beu)this.bo.a(beu.class));
    this.c = ((bfd)this.bo.a(bfd.class));
    this.Z = ((bdk)this.bo.a(bdk.class));
  }
  
  public final void m()
  {
    super.m();
    if (this.aa)
    {
      this.aa = false;
      this.ab.a(new ayf(this));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axz
 * JD-Core Version:    0.7.0.1
 */