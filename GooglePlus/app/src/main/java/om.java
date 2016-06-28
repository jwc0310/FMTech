import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class om
  extends DataSetObserver
{
  public om(ViewPager paramViewPager) {}
  
  public final void onChanged()
  {
    this.a.a();
  }
  
  public final void onInvalidated()
  {
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     om
 * JD-Core Version:    0.7.0.1
 */