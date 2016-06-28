import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.widget.Toast;
import com.google.android.libraries.social.experiments.debug.ExperimentsBrowserFragment;

final class hyx
  implements DialogInterface.OnClickListener
{
  hyx(hyw paramhyw) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hza localhza = this.a.a.b;
    boolean bool = localhza.a.a();
    localhza.a();
    if (!bool)
    {
      Toast.makeText(this.a.a.bn, dl.h, 0).show();
      Log.e("ExperimentsBrowser", "Could not clear experiment overrides");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyx
 * JD-Core Version:    0.7.0.1
 */