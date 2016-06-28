import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class mby
  extends mfh
  implements mbe
{
  private mep Z;
  public final mbf ad = new mbf();
  public final mbb ae = this.ad.a;
  
  public void a(Activity paramActivity)
  {
    mbb localmbb = mbb.a(paramActivity, this.A);
    this.ad.a(paramActivity);
    this.ad.a.b = localmbb;
    this.ae.c = getClass().getName();
    super.a(paramActivity);
  }
  
  public void a(Bundle paramBundle)
  {
    h(paramBundle);
    Iterator localIterator = this.ae.c(mch.class).iterator();
    while (localIterator.hasNext()) {
      ((mch)localIterator.next()).a(this, this.af, this.ae);
    }
    this.ae.a();
    this.Z = this.af.a(new mbz(this, paramBundle));
    super.a(paramBundle);
  }
  
  public final mbb aE_()
  {
    return this.ae;
  }
  
  public final Context aI_()
  {
    return this.ad;
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return LayoutInflater.from(this.ad);
  }
  
  public void h(Bundle paramBundle)
  {
    this.ae.a(new mcg(this, this.af));
  }
  
  public final void o()
  {
    med localmed = this.af;
    mep localmep = this.Z;
    localmed.b.remove(localmep);
    super.o();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mby
 * JD-Core Version:    0.7.0.1
 */