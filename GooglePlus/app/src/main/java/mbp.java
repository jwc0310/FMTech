import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class mbp
  extends mfg
  implements mbe
{
  private mep d;
  public final mbb m = new mbb();
  
  public void a(Bundle paramBundle)
  {
    this.m.a(new mbt(this, this.n));
  }
  
  public final mbb aE_()
  {
    return this.m;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mbb localmbb = mbb.b(getApplicationContext());
    this.m.a(this);
    this.m.b = localmbb;
    a(paramBundle);
    Iterator localIterator = this.m.c(mbx.class).iterator();
    while (localIterator.hasNext()) {
      ((mbx)localIterator.next()).a(this, this.n, this.m);
    }
    this.m.a();
    this.d = this.n.a(new mbq(this, paramBundle));
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    mdt localmdt = this.n;
    mep localmep = this.d;
    localmdt.b.remove(localmep);
    super.onDestroy();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbp
 * JD-Core Version:    0.7.0.1
 */