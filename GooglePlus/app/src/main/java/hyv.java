import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Filter;
import com.google.android.libraries.social.experiments.debug.ExperimentsBrowserFragment;
import java.util.Locale;

public final class hyv
  implements TextWatcher
{
  public hyv(ExperimentsBrowserFragment paramExperimentsBrowserFragment, EditText paramEditText) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    String str = this.a.getText().toString().toLowerCase(Locale.getDefault());
    this.b.a.getFilter().filter(str);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyv
 * JD-Core Version:    0.7.0.1
 */