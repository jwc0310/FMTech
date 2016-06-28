import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Iterator;

final class luf
  implements View.OnClickListener
{
  luf(lud paramlud, luj paramluj) {}
  
  public final void onClick(View paramView)
  {
    this.a.c.onClick(paramView);
    lud locallud = this.b;
    ((Button)paramView);
    Iterator localIterator = locallud.d.iterator();
    while (localIterator.hasNext()) {
      ((lui)localIterator.next()).a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     luf
 * JD-Core Version:    0.7.0.1
 */