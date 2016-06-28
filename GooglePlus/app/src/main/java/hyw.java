import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.experiments.debug.ExperimentsBrowserFragment;

public final class hyw
  implements View.OnClickListener
{
  public hyw(ExperimentsBrowserFragment paramExperimentsBrowserFragment) {}
  
  public final void onClick(View paramView)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.bn).setTitle(dl.e).setMessage(dl.f);
    localBuilder.setPositiveButton(dl.k, new hyx(this));
    localBuilder.setNegativeButton(dl.b, new hyy(this));
    localBuilder.show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyw
 * JD-Core Version:    0.7.0.1
 */