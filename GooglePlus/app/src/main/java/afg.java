import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class afg
  implements AdapterView.OnItemSelectedListener
{
  afg(afe paramafe) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      afh localafh = this.a.f;
      if (localafh != null) {
        localafh.b = false;
      }
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afg
 * JD-Core Version:    0.7.0.1
 */