import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

final class cvw
  implements View.OnClickListener
{
  cvw(cvu paramcvu) {}
  
  public final void onClick(View paramView)
  {
    String str = paramView.getTag(aau.wL).toString();
    Iterator localIterator = this.a.c.iterator();
    while (localIterator.hasNext()) {
      ((cvy)localIterator.next()).b(str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvw
 * JD-Core Version:    0.7.0.1
 */