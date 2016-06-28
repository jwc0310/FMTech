import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.plus.views.BarGraphListView;

public final class dvf
  extends BaseAdapter
{
  public dvf(BarGraphListView paramBarGraphListView) {}
  
  public final int getCount()
  {
    if (this.a.h == null) {
      return 0;
    }
    return this.a.h.length;
  }
  
  public final Object getItem(int paramInt)
  {
    if (this.a.h == null) {
      return null;
    }
    return this.a.h[paramInt];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((this.a.h == null) || (paramInt >= this.a.h.length)) {
      return null;
    }
    if ((paramView instanceof dvd)) {}
    for (dvd localdvd = (dvd)paramView;; localdvd = new dvd(this.a, this.a.getContext()))
    {
      localdvd.a = this.a.h[paramInt];
      localdvd.requestLayout();
      localdvd.invalidate();
      return localdvd;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvf
 * JD-Core Version:    0.7.0.1
 */