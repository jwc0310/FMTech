import android.view.View;
import android.view.View.OnFocusChangeListener;

public final class div
  implements View.OnFocusChangeListener
{
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      gwz.a(paramView, 10);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     div
 * JD-Core Version:    0.7.0.1
 */