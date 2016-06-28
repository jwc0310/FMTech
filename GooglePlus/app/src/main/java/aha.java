import android.database.Cursor;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public final class aha
  implements AdapterView.OnItemClickListener
{
  public aha(SearchView paramSearchView) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SearchView localSearchView = this.a;
    Cursor localCursor = null.c;
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt))) {
      localSearchView.a(localSearchView.a(localCursor, 0, null));
    }
    localSearchView.b(false);
    localSearchView.a.dismissDropDown();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aha
 * JD-Core Version:    0.7.0.1
 */