import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class lbf
  implements TextWatcher
{
  private EditText a;
  private int b;
  
  public lbf(lbb paramlbb, EditText paramEditText, int paramInt)
  {
    this.a = paramEditText;
    this.b = paramInt;
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a != null) {
      this.a.setError(null);
    }
    if (paramInt3 > this.b) {
      this.a.setText(mfx.a(paramCharSequence.toString(), 0, this.b));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbf
 * JD-Core Version:    0.7.0.1
 */