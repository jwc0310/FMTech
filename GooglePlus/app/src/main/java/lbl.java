import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class lbl
  implements TextWatcher
{
  lbl(lbi paramlbi) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.a.setError(null);
    this.a.a.removeTextChangedListener(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbl
 * JD-Core Version:    0.7.0.1
 */