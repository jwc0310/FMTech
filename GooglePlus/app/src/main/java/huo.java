import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class huo
  implements AbsListView.OnScrollListener
{
  private int a = -1;
  private int b = -1;
  
  huo(hun paramhun) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.a != paramInt1) || (this.b != paramInt2))
    {
      this.a = paramInt1;
      this.b = paramInt2;
      hun.a(this.c, paramAbsListView);
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    hun.a(this.c, paramAbsListView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     huo
 * JD-Core Version:    0.7.0.1
 */