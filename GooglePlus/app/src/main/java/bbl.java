import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

final class bbl
  implements AdapterView.OnItemClickListener
{
  bbl(bbf parambbf) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    clc localclc = (clc)this.a.Z.getAdapter();
    if (localclc != null)
    {
      localclc.d_(paramInt);
      InputMethodManager localInputMethodManager = (InputMethodManager)this.a.f().getSystemService("input_method");
      if (localInputMethodManager.isFullscreenMode()) {
        localInputMethodManager.toggleSoftInput(0, 0);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbl
 * JD-Core Version:    0.7.0.1
 */