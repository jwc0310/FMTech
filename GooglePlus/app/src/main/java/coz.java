import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.plus.views.FastScrollContainer;
import java.util.ArrayList;
import java.util.HashMap;

public class coz
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener a;
  private HashMap<AbsListView, ArrayList<AbsListView.OnScrollListener>> b;
  
  public coz(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.a = paramOnScrollListener;
    this.b = new HashMap();
  }
  
  public final void a(AbsListView paramAbsListView, AbsListView.OnScrollListener paramOnScrollListener, FastScrollContainer paramFastScrollContainer)
  {
    ArrayList localArrayList = (ArrayList)this.b.get(paramAbsListView);
    if (!this.b.containsKey(paramAbsListView))
    {
      localArrayList = new ArrayList();
      this.b.put(paramAbsListView, localArrayList);
      localArrayList.add(this.a);
    }
    if (!localArrayList.contains(paramOnScrollListener)) {
      localArrayList.add(paramOnScrollListener);
    }
    if (paramFastScrollContainer != null)
    {
      paramFastScrollContainer.b = this;
      return;
    }
    paramAbsListView.setOnScrollListener(this);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    ArrayList localArrayList = (ArrayList)this.b.get(paramAbsListView);
    for (int i = -1 + localArrayList.size(); i >= 0; i--) {
      ((AbsListView.OnScrollListener)localArrayList.get(i)).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.b.get(paramAbsListView);
    for (int i = -1 + localArrayList.size(); i >= 0; i--) {
      ((AbsListView.OnScrollListener)localArrayList.get(i)).onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     coz
 * JD-Core Version:    0.7.0.1
 */