import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

public final class ahc
  implements TextWatcher
{
  public ahc(SearchView paramSearchView) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SearchView.a(this.a, paramCharSequence);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahc
 * JD-Core Version:    0.7.0.1
 */