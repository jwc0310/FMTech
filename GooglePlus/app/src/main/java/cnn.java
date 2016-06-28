import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.RadioButton;

final class cnn
  implements TextWatcher
{
  cnn(cnj paramcnj) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool1 = true;
    boolean bool2 = TextUtils.isEmpty(paramEditable);
    cnj localcnj2;
    if (bool2)
    {
      this.a.aD.setChecked(bool1);
      localcnj2 = this.a;
      if (bool2) {
        break label143;
      }
    }
    for (;;)
    {
      localcnj2.b(bool1);
      this.a.J();
      return;
      if (this.a.aA == this.a.K()) {
        break;
      }
      cnj localcnj1 = this.a;
      switch (this.a.aA)
      {
      default: 
        break;
      case 1: 
        localcnj1.aD.setChecked(bool1);
        break;
      case 2: 
        localcnj1.aE.setChecked(bool1);
        break;
      case 3: 
        localcnj1.aF.setChecked(bool1);
        break;
        label143:
        bool1 = false;
      }
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnn
 * JD-Core Version:    0.7.0.1
 */