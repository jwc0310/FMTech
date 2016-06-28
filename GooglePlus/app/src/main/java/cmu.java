import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public final class cmu
  implements TextWatcher
{
  private final TextView a;
  
  public cmu(cmo paramcmo, TextView paramTextView)
  {
    this.a = paramTextView;
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.getText().length() == 0)
    {
      this.b.d(this.a);
      return;
    }
    this.b.c(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmu
 * JD-Core Version:    0.7.0.1
 */