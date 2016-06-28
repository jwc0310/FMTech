import android.database.Cursor;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public final class ahb
  implements AdapterView.OnItemSelectedListener
{
  public ahb(SearchView paramSearchView) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SearchView localSearchView = this.a;
    Editable localEditable = localSearchView.a.getText();
    Cursor localCursor = null.c;
    if (localCursor != null)
    {
      if (!localCursor.moveToPosition(paramInt)) {
        break label67;
      }
      CharSequence localCharSequence = null.c(localCursor);
      if (localCharSequence != null) {
        localSearchView.a(localCharSequence);
      }
    }
    else
    {
      return;
    }
    localSearchView.a(localEditable);
    return;
    label67:
    localSearchView.a(localEditable);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahb
 * JD-Core Version:    0.7.0.1
 */