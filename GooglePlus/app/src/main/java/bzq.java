import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

public abstract class bzq<ListViewType extends AbsListView, AdapterType extends hqi>
  extends bzo
  implements AbsListView.OnScrollListener
{
  private int Z = -1;
  public ListViewType a;
  private int aa = -1;
  public AdapterType b;
  public int c;
  public int d;
  
  protected final boolean A()
  {
    return (this.b == null) || (this.b.c == null) || (this.b.getCount() == 0);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, int paramInt)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, paramInt);
    this.a = ((AbsListView)localView.findViewById(16908298));
    this.a.setOnScrollListener(this);
    return localView;
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.c = paramBundle.getInt("scroll_pos");
      this.d = paramBundle.getInt("scroll_off");
      return;
    }
    this.c = 0;
    this.d = 0;
  }
  
  public void d_()
  {
    super.d_();
    if (this.a != null)
    {
      this.a.setOnScrollListener(null);
      this.a = null;
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if ((!f().isFinishing()) && (this.a != null)) {
      if (this.a != null)
      {
        this.c = this.a.getFirstVisiblePosition();
        if (this.b == null) {
          break label97;
        }
        View localView = this.a.getChildAt(0);
        if (localView == null) {
          break label89;
        }
        this.d = localView.getTop();
      }
    }
    for (;;)
    {
      paramBundle.putInt("scroll_pos", this.c);
      paramBundle.putInt("scroll_off", this.d);
      return;
      label89:
      this.d = 0;
      continue;
      label97:
      this.d = 0;
    }
  }
  
  public void m()
  {
    super.m();
  }
  
  public void n()
  {
    super.n();
    if ((this.b != null) && (this.b.c != null)) {
      this.b.c();
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > 0)
    {
      this.Z = (paramInt1 + paramInt2);
      this.aa = paramInt3;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzq
 * JD-Core Version:    0.7.0.1
 */