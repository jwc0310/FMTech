import android.database.DataSetObserver;

final class hqq
  extends DataSetObserver
{
  hqq(hqo paramhqo) {}
  
  public final void onChanged()
  {
    this.a.e = true;
    this.a.d();
  }
  
  public final void onInvalidated()
  {
    this.a.e = false;
    this.a.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqq
 * JD-Core Version:    0.7.0.1
 */