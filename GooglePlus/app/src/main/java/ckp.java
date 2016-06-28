import android.database.DataSetObserver;

final class ckp
  extends DataSetObserver
{
  ckp(ckm paramckm) {}
  
  public final void onChanged()
  {
    this.a.notifyDataSetChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckp
 * JD-Core Version:    0.7.0.1
 */