import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class mcc
  extends mfj
  implements mbe
{
  private mep d;
  public final mbb j = new mbb();
  
  public void a(Bundle paramBundle)
  {
    this.j.a(new mbt(this, this.k));
  }
  
  public final mbb aE_()
  {
    return this.j;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mbb localmbb = mbb.b(getApplicationContext());
    this.j.a(this);
    this.j.b = localmbb;
    a(paramBundle);
    Iterator localIterator = this.j.c(mbx.class).iterator();
    while (localIterator.hasNext()) {
      ((mbx)localIterator.next()).a(this, this.k, this.j);
    }
    this.j.a();
    this.d = this.k.a(new mcd(this, paramBundle));
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    mdt localmdt = this.k;
    mep localmep = this.d;
    localmdt.b.remove(localmep);
    super.onDestroy();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mcc
 * JD-Core Version:    0.7.0.1
 */