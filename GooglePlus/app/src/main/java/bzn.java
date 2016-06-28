import android.text.Editable;
import android.text.TextWatcher;

final class bzn
  implements TextWatcher
{
  bzn(bzl parambzl) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    czn localczn = (czn)this.a.f();
    if (localczn != null) {
      localczn.e().f();
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzn
 * JD-Core Version:    0.7.0.1
 */