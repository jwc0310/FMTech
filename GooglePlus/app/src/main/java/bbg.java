import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;

final class bbg
  implements TextWatcher
{
  bbg(bbf parambbf) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.aa != null)
    {
      if (paramCharSequence.length() <= 0) {
        break label32;
      }
      this.a.aa.setVisibility(8);
    }
    for (;;)
    {
      return;
      label32:
      if (3 == this.a.ad) {}
      for (int i = 1; i != 0; i = 0)
      {
        this.a.aa.setVisibility(0);
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbg
 * JD-Core Version:    0.7.0.1
 */