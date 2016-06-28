import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public abstract class dgi
  implements ListAdapter
{
  private ListAdapter a;
  
  public dgi(ListAdapter paramListAdapter)
  {
    this.a = paramListAdapter;
  }
  
  protected abstract int a(int paramInt);
  
  public boolean areAllItemsEnabled()
  {
    return this.a.areAllItemsEnabled();
  }
  
  public int getCount()
  {
    return this.a.getCount();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.getItem(a(paramInt));
  }
  
  public long getItemId(int paramInt)
  {
    return this.a.getItemId(a(paramInt));
  }
  
  public int getItemViewType(int paramInt)
  {
    return this.a.getItemViewType(a(paramInt));
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.a.getView(a(paramInt), paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    return this.a.getViewTypeCount();
  }
  
  public boolean hasStableIds()
  {
    return this.a.hasStableIds();
  }
  
  public boolean isEmpty()
  {
    return this.a.isEmpty();
  }
  
  public boolean isEnabled(int paramInt)
  {
    return this.a.isEnabled(a(paramInt));
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.a.registerDataSetObserver(paramDataSetObserver);
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterDataSetObserver(paramDataSetObserver);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgi
 * JD-Core Version:    0.7.0.1
 */