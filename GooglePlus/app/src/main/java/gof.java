import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;

public final class gof
  implements TextWatcher
{
  public gof(AclPickerActionBarView paramAclPickerActionBarView, EditText paramEditText) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > 200) {
      this.a.setText(mfx.a(paramCharSequence.toString(), 0, 200));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gof
 * JD-Core Version:    0.7.0.1
 */