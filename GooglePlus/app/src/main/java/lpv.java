import android.view.View;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import java.util.ArrayList;

public final class lpv
{
  public lpw a;
  public ArrayList<View>[] b;
  public int c;
  private int d;
  
  public lpv(StreamGridView paramStreamGridView) {}
  
  public final void a(View paramView)
  {
    lpt locallpt = (lpt)paramView.getLayoutParams();
    if (locallpt.c == -1) {}
    do
    {
      return;
      int i = this.e.getChildCount();
      if (i > this.d) {
        this.d = i;
      }
      ArrayList localArrayList = this.b[locallpt.c];
      if (localArrayList.size() < this.d) {
        localArrayList.add(paramView);
      }
    } while (this.a == null);
    this.a.a(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpv
 * JD-Core Version:    0.7.0.1
 */