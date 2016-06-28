import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

final class chh
  implements TextWatcher
{
  chh(cgr paramcgr) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool1 = true;
    boolean bool2;
    View localView;
    if (TextUtils.getTrimmedLength(paramEditable) > 0)
    {
      bool2 = bool1;
      localView = this.a.aM;
      if ((!this.a.aG) || (!bool2)) {
        break label67;
      }
    }
    for (;;)
    {
      localView.setEnabled(bool1);
      if ((this.a.I()) && (bool2)) {
        this.a.H();
      }
      return;
      bool2 = false;
      break;
      label67:
      bool1 = false;
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chh
 * JD-Core Version:    0.7.0.1
 */