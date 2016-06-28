import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class cmz
  implements AdapterView.OnItemSelectedListener
{
  private final int a;
  
  cmz(cmo paramcmo, int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == this.a)
    {
      this.b.a(paramAdapterView);
      return;
    }
    this.b.b(paramAdapterView);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmz
 * JD-Core Version:    0.7.0.1
 */