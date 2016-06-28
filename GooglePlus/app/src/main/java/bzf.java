import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.apps.plus.fragments.EditEventFragment;

public final class bzf
  implements TextWatcher
{
  public bzf(EditEventFragment paramEditEventFragment) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = this.a.ai.getText().toString().trim();
    hxj localhxj;
    if (!TextUtils.equals(this.a.ac.b(), str))
    {
      localhxj = this.a.ac;
      if (localhxj.a == null) {
        break label90;
      }
      localhxj.a.b = str;
    }
    for (;;)
    {
      this.a.ab = true;
      if (this.a.ae != null) {}
      return;
      label90:
      localhxj.b.b = str;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzf
 * JD-Core Version:    0.7.0.1
 */