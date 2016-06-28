import android.os.CountDownTimer;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class lca
  implements View.OnDragListener, ViewGroup.OnHierarchyChangeListener
{
  ListView a;
  lcf b;
  int c;
  int d;
  View.OnDragListener e = this;
  boolean f;
  private lcg g;
  private boolean h = false;
  private int i;
  
  public lca(ListView paramListView, lcf paramlcf, int paramInt, boolean paramBoolean)
  {
    this.a = paramListView;
    this.b = paramlcf;
    this.g = new lcg(this.a, 50L, 5);
    this.i = paramInt;
    this.f = false;
    this.a.setOnHierarchyChangeListener(this);
  }
  
  private final int a(View paramView)
  {
    for (;;)
    {
      View localView = (View)paramView.getParent();
      if (localView == this.a) {
        return this.a.indexOfChild(paramView) + this.a.getFirstVisiblePosition();
      }
      if (localView == null) {
        return -1;
      }
      paramView = localView;
    }
  }
  
  private final void a(View.OnDragListener paramOnDragListener)
  {
    this.a.setOnDragListener(paramOnDragListener);
    for (int j = 0; j < this.a.getChildCount(); j++) {
      a(this.a.getChildAt(j), paramOnDragListener);
    }
  }
  
  private final void a(View paramView, View.OnDragListener paramOnDragListener)
  {
    if ((paramView instanceof ViewGroup)) {
      for (int j = 0; j < ((ViewGroup)paramView).getChildCount(); j++) {
        a(((ViewGroup)paramView).getChildAt(j), paramOnDragListener);
      }
    }
    if ((paramView instanceof EditText)) {
      paramView.setOnDragListener(paramOnDragListener);
    }
  }
  
  private final int b(View paramView)
  {
    View localView = (View)paramView.getParent();
    if ((paramView == this.a) || (localView == null)) {
      return 0;
    }
    return (int)paramView.getY() + b(localView);
  }
  
  public final void onChildViewAdded(View paramView1, View paramView2)
  {
    if (this.h) {
      a(paramView2, this.e);
    }
    paramView2.findViewById(this.i).setOnLongClickListener(new lcd(this, paramView2));
  }
  
  public final void onChildViewRemoved(View paramView1, View paramView2) {}
  
  public final boolean onDrag(View paramView, DragEvent paramDragEvent)
  {
    int j = 1;
    switch (paramDragEvent.getAction())
    {
    default: 
      j = 0;
    }
    label104:
    do
    {
      return j;
      this.h = j;
      return j;
      int k = (int)paramDragEvent.getY() + b(paramView);
      if (k >= 0.8D * this.a.getHeight())
      {
        lcg locallcg2 = this.g;
        locallcg2.e = j;
        locallcg2.d.start();
        if (paramView != this.a) {
          break label272;
        }
      }
      for (int m = this.a.pointToPosition((int)(paramView.getX() + paramDragEvent.getX()), (int)(paramView.getY() + paramDragEvent.getY())); (m != -1) && (m != this.d) && ((m < -1 + this.a.getAdapter().getCount()) || (this.f)); m = a(paramView))
      {
        int n = this.d;
        this.a.post(new lcb(this, m, n));
        this.d = m;
        return j;
        if (k <= 0.2D * this.a.getHeight())
        {
          lcg locallcg1 = this.g;
          locallcg1.e = -1;
          locallcg1.d.start();
          break label104;
        }
        this.g.d.cancel();
        break label104;
      }
    } while (!this.h);
    label272:
    View localView = this.a.getChildAt(this.d - this.a.getFirstVisiblePosition());
    if (localView != null) {
      localView.post(new lcc(this, localView));
    }
    this.g.d.cancel();
    this.h = false;
    a(null);
    this.b.v();
    return j;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lca
 * JD-Core Version:    0.7.0.1
 */