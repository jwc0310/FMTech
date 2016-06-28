import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class gpu
  implements AdapterView.OnItemSelectedListener
{
  public gpu(ActionBarSpinner paramActionBarSpinner, gpw paramgpw) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a_(paramInt);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpu
 * JD-Core Version:    0.7.0.1
 */