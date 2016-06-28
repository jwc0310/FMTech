import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

final class ado
  implements AdapterView.OnItemClickListener
{
  ado(adn paramadn, adk paramadk) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.d.setSelection(paramInt);
    if (this.a.d.getOnItemClickListener() != null) {
      this.a.d.performItemClick(paramView, paramInt, this.a.b.getItemId(paramInt));
    }
    this.a.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ado
 * JD-Core Version:    0.7.0.1
 */