import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

final class cvx
  implements View.OnClickListener
{
  cvx(cvu paramcvu) {}
  
  public final void onClick(View paramView)
  {
    String str = paramView.getTag(aau.wL).toString();
    Iterator localIterator = this.a.c.iterator();
    while (localIterator.hasNext()) {
      ((cvy)localIterator.next()).c(str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvx
 * JD-Core Version:    0.7.0.1
 */