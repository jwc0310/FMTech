import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class gpv
  implements SpinnerAdapter
{
  public int a = -1;
  private SpinnerAdapter b;
  
  public gpv(ActionBarSpinner paramActionBarSpinner, SpinnerAdapter paramSpinnerAdapter)
  {
    this.b = paramSpinnerAdapter;
  }
  
  public final int getCount()
  {
    return this.b.getCount();
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.b.getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final Object getItem(int paramInt)
  {
    if (this.a != -1) {
      paramInt = this.a;
    }
    return this.b.getItem(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    if (this.a != -1) {
      paramInt = this.a;
    }
    return this.b.getItemId(paramInt);
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (this.a != -1) {
      paramInt = this.a;
    }
    return this.b.getItemViewType(paramInt);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a != -1) {
      paramInt = this.a;
    }
    return this.b.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return this.b.getViewTypeCount();
  }
  
  public final boolean hasStableIds()
  {
    return this.b.hasStableIds();
  }
  
  public final boolean isEmpty()
  {
    return this.b.isEmpty();
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.b.registerDataSetObserver(paramDataSetObserver);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.b.unregisterDataSetObserver(paramDataSetObserver);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpv
 * JD-Core Version:    0.7.0.1
 */