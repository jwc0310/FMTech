import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.plus.views.TypeableAudienceView;
import com.google.android.apps.plus.views.TypeableAudienceView.AudienceTextView;

public final class dzt
  implements View.OnKeyListener
{
  public dzt(TypeableAudienceView paramTypeableAudienceView) {}
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    InputMethodManager localInputMethodManager;
    boolean bool;
    if (paramKeyEvent.getAction() == 0)
    {
      localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
      bool = localInputMethodManager.isFullscreenMode();
      switch (paramInt)
      {
      }
    }
    do
    {
      do
      {
        return false;
      } while ((this.a.a.getSelectionStart() > 0) || (this.a.a.getSelectionEnd() > 0) || (bool));
      this.a.e();
      return true;
    } while (!bool);
    localInputMethodManager.toggleSoftInput(0, 0);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzt
 * JD-Core Version:    0.7.0.1
 */