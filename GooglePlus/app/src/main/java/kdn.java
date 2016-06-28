import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class kdn
  extends kes
  implements mbe
{
  public final mbf a = new mbf();
  private mep aa;
  public final mbb b = this.a.a;
  
  public void a(Activity paramActivity)
  {
    mbb localmbb = mbb.a(paramActivity, this.A);
    this.a.a(paramActivity);
    this.a.a.b = localmbb;
    this.c.a(paramActivity);
    super.a(paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    c(paramBundle);
    Iterator localIterator = this.b.c(mch.class).iterator();
    while (localIterator.hasNext()) {
      ((mch)localIterator.next()).a(this, this.c, this.b);
    }
    this.b.a();
    this.aa = this.c.a(new kdo(this, paramBundle));
    super.a(paramBundle);
  }
  
  public final mbb aE_()
  {
    return this.b;
  }
  
  public final Context aI_()
  {
    return this.a;
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return LayoutInflater.from(this.a);
  }
  
  public void c(Bundle paramBundle)
  {
    this.b.a(new mcg(this, this.c));
  }
  
  public final void o()
  {
    med localmed = this.c;
    mep localmep = this.aa;
    localmed.b.remove(localmep);
    super.o();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdn
 * JD-Core Version:    0.7.0.1
 */