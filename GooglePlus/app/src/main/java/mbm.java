import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class mbm
  extends mff
  implements mbe
{
  public final mbb a = new mbb();
  private mep c;
  
  public void a(Bundle paramBundle)
  {
    this.a.a(new mbt(this, this.b));
  }
  
  public final mbb aE_()
  {
    return this.a;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mbb localmbb = mbb.b(getApplicationContext());
    this.a.a(this);
    this.a.b = localmbb;
    a(paramBundle);
    Iterator localIterator = this.a.c(mbx.class).iterator();
    while (localIterator.hasNext()) {
      ((mbx)localIterator.next()).a(this, this.b, this.a);
    }
    this.a.a();
    this.c = this.b.a(new mbn(this, paramBundle));
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    mdt localmdt = this.b;
    mep localmep = this.c;
    localmdt.b.remove(localmep);
    super.onDestroy();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbm
 * JD-Core Version:    0.7.0.1
 */