import android.database.DataSetObserver;
import android.widget.Adapter;

public final class hrm
  extends DataSetObserver
{
  hrl a;
  hrn b;
  
  public final void onChanged()
  {
    if (this.b == null) {
      throw new NullPointerException();
    }
    hrl localhrl = this.a;
    if (localhrl.a == null) {
      throw new NullPointerException();
    }
    if (localhrl.getCount() - localhrl.a.getCount() == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.b.a(true);
      return;
    }
    this.b.a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hrm
 * JD-Core Version:    0.7.0.1
 */