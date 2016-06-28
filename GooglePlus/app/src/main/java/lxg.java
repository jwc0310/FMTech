import android.view.View;
import android.widget.GridView;

public class lxg
{
  public lxg(klg paramklg) {}
  
  public void a(GridView paramGridView)
  {
    klg localklg = this.a;
    if (paramGridView.getChildCount() > 0)
    {
      int i = paramGridView.getChildAt(-1 + paramGridView.getChildCount()).getBottom();
      if (localklg.K != i)
      {
        localklg.K = i;
        if (localklg.J == 1) {
          localklg.b(i);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxg
 * JD-Core Version:    0.7.0.1
 */