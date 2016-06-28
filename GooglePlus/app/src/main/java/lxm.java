import android.view.View;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.util.ArrayList;

public final class lxm
{
  public lpw a;
  public ArrayList<View>[] b;
  public int c;
  private int d;
  
  public lxm(RecyclingViewGroup paramRecyclingViewGroup) {}
  
  public final void a(View paramView)
  {
    lxk locallxk = (lxk)paramView.getLayoutParams();
    if (locallxk.b == -1) {}
    do
    {
      return;
      int i = this.e.getChildCount();
      if (i > this.d) {
        this.d = i;
      }
      ArrayList localArrayList = this.b[locallxk.b];
      if (localArrayList.size() < this.d) {
        localArrayList.add(paramView);
      }
    } while (this.a == null);
    this.a.a(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxm
 * JD-Core Version:    0.7.0.1
 */