import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class mca
  extends mfi
  implements mbe
{
  private mep a;
  public final mbf bn = new mbf();
  public final mbb bo = this.bn.a;
  
  public void a(Activity paramActivity)
  {
    mbb localmbb = mbb.a(paramActivity, this.A);
    this.bn.a(paramActivity);
    this.bn.a.b = localmbb;
    this.bo.c = getClass().getName();
    super.a(paramActivity);
  }
  
  public void a(Bundle paramBundle)
  {
    c(paramBundle);
    Iterator localIterator = this.bo.c(mch.class).iterator();
    while (localIterator.hasNext()) {
      ((mch)localIterator.next()).a(this, this.bp, this.bo);
    }
    this.bo.a();
    this.a = this.bp.a(new mcb(this, paramBundle));
    super.a(paramBundle);
  }
  
  public final mbb aE_()
  {
    return this.bo;
  }
  
  public Context aI_()
  {
    return this.bn;
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return LayoutInflater.from(this.bn);
  }
  
  public void c(Bundle paramBundle)
  {
    this.bo.a(new mcg(this, this.bp));
  }
  
  public void o()
  {
    med localmed = this.bp;
    mep localmep = this.a;
    localmed.b.remove(localmep);
    super.o();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mca
 * JD-Core Version:    0.7.0.1
 */