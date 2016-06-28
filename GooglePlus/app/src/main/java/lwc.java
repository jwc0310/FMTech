import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public final class lwc
  implements TextWatcher
{
  private final EditText a;
  private final TextView b;
  private final int c;
  
  public lwc(EditText paramEditText, TextView paramTextView, int paramInt)
  {
    this.a = paramEditText;
    this.b = paramTextView;
    this.c = paramInt;
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(paramInt);
    paramEditText.setFilters(arrayOfInputFilter);
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence == null) || (this.c < 0)) {
      return;
    }
    int i = paramCharSequence.length();
    if (i > this.c) {}
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        this.a.setText(mfx.a(paramCharSequence.toString(), 0, this.c));
      }
      TextView localTextView = this.b;
      Context localContext = this.b.getContext();
      int k = efj.aal;
      Object[] arrayOfObject = new Object[2];
      if (j != 0) {
        i = this.c;
      }
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Integer.valueOf(this.c);
      localTextView.setText(localContext.getString(k, arrayOfObject));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwc
 * JD-Core Version:    0.7.0.1
 */