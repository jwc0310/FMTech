import android.database.DataSetObserver;

final class hqu
  extends DataSetObserver
{
  hqu(hqt paramhqt) {}
  
  public final void onChanged()
  {
    this.a.e = false;
    this.a.notifyDataSetChanged();
  }
  
  public final void onInvalidated()
  {
    this.a.e = false;
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqu
 * JD-Core Version:    0.7.0.1
 */