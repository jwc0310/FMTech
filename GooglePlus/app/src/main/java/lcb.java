import android.view.View;
import android.widget.ListView;

final class lcb
  implements Runnable
{
  lcb(lca paramlca, int paramInt1, int paramInt2) {}
  
  public final void run()
  {
    this.c.a.getChildAt(this.a - this.c.a.getFirstVisiblePosition()).setVisibility(4);
    this.c.b.a(this.b, this.a);
    this.c.a.getChildAt(this.b - this.c.a.getFirstVisiblePosition()).setVisibility(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcb
 * JD-Core Version:    0.7.0.1
 */