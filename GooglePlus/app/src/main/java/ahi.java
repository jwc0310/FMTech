import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnClickListener;

public final class ahi
  implements View.OnClickListener
{
  public ahi(SearchView paramSearchView) {}
  
  public final void onClick(View paramView)
  {
    if (paramView == this.a.b) {
      SearchView.c(this.a);
    }
    do
    {
      return;
      if (paramView == this.a.d)
      {
        SearchView.d(this.a);
        return;
      }
      if (paramView == this.a.c)
      {
        this.a.e();
        return;
      }
      if (paramView == this.a.e) {
        return;
      }
    } while (paramView != this.a.a);
    this.a.g();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahi
 * JD-Core Version:    0.7.0.1
 */