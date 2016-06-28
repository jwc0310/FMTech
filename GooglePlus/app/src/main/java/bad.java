import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

final class bad
  implements TextWatcher
{
  bad(baa parambaa) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    View localView = this.a.ad;
    if ((this.a.v()) && (TextUtils.getTrimmedLength(paramEditable) > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localView.setEnabled(bool);
      return;
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bad
 * JD-Core Version:    0.7.0.1
 */