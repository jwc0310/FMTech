import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class afn
  implements AbsListView.OnScrollListener
{
  afn(afe paramafe) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.e()) && (this.a.e.getContentView() != null))
    {
      this.a.q.removeCallbacks(this.a.p);
      this.a.p.run();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afn
 * JD-Core Version:    0.7.0.1
 */