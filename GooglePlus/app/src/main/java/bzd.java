import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.plus.fragments.EditEventFragment;
import com.google.android.apps.plus.views.EventThemeView;

public final class bzd
  implements Runnable
{
  public bzd(EditEventFragment paramEditEventFragment) {}
  
  public final void run()
  {
    this.a.ak.setVisibility(0);
    this.a.ag.setVisibility(0);
    this.a.ah.setVisibility(8);
    this.a.ak.setLayoutParams(new FrameLayout.LayoutParams(this.a.af.getMeasuredWidth(), this.a.af.getMeasuredHeight()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzd
 * JD-Core Version:    0.7.0.1
 */