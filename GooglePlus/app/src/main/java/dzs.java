import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.apps.plus.views.TypeableAudienceView;
import com.google.android.apps.plus.views.TypeableAudienceView.AudienceTextView;

public final class dzs
  implements AdapterView.OnItemClickListener
{
  public dzs(TypeableAudienceView paramTypeableAudienceView) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    clc localclc = (clc)this.a.a.getAdapter();
    if (localclc != null)
    {
      localclc.d_(paramInt);
      InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
      if (localInputMethodManager.isFullscreenMode()) {
        localInputMethodManager.toggleSoftInput(0, 0);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzs
 * JD-Core Version:    0.7.0.1
 */