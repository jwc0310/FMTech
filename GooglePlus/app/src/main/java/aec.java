import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class aec
{
  public aec(RecyclerView paramRecyclerView) {}
  
  public int a()
  {
    return this.a.getChildCount();
  }
  
  public int a(View paramView)
  {
    return this.a.indexOfChild(paramView);
  }
  
  public void a(int paramInt)
  {
    View localView = this.a.getChildAt(paramInt);
    if (localView != null) {
      RecyclerView.b(localView);
    }
    this.a.removeViewAt(paramInt);
  }
  
  public void a(View paramView, int paramInt)
  {
    this.a.addView(paramView, paramInt);
    RecyclerView.b(paramView);
  }
  
  public void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    agt localagt = RecyclerView.b(paramView);
    if (localagt != null)
    {
      if ((!localagt.e()) && (!localagt.a())) {
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localagt);
      }
      localagt.i = (0xFFFFFEFF & localagt.i);
    }
    RecyclerView.a(this.a, paramView, paramInt, paramLayoutParams);
  }
  
  public agt b(View paramView)
  {
    return RecyclerView.b(paramView);
  }
  
  public View b(int paramInt)
  {
    return this.a.getChildAt(paramInt);
  }
  
  public void b()
  {
    int i = a();
    for (int j = 0; j < i; j++) {
      RecyclerView.b(b(j));
    }
    this.a.removeAllViews();
  }
  
  public void c(int paramInt)
  {
    View localView = b(paramInt);
    if (localView != null)
    {
      agt localagt = RecyclerView.b(localView);
      if (localagt != null)
      {
        if ((localagt.e()) && (!localagt.a())) {
          throw new IllegalArgumentException("called detach on an already detached child " + localagt);
        }
        localagt.i = (0x100 | localagt.i);
      }
    }
    RecyclerView.a(this.a, paramInt);
  }
  
  public void c(View paramView)
  {
    agt localagt = RecyclerView.b(paramView);
    if (localagt != null)
    {
      View localView1 = localagt.a;
      localagt.n = nj.a.m(localView1);
      View localView2 = localagt.a;
      nj.a.c(localView2, 4);
    }
  }
  
  public void d(View paramView)
  {
    agt localagt = RecyclerView.b(paramView);
    if (localagt != null)
    {
      View localView = localagt.a;
      int i = localagt.n;
      nj.a.c(localView, i);
      localagt.n = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aec
 * JD-Core Version:    0.7.0.1
 */