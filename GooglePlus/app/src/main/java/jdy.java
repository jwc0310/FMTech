import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.notifications.ui.GunsMenuView;
import java.util.ArrayList;
import java.util.Iterator;

public final class jdy
  implements View.OnClickListener
{
  public jdy(GunsMenuView paramGunsMenuView) {}
  
  public final void onClick(View paramView)
  {
    if (!this.a.a)
    {
      Iterator localIterator = this.a.b.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdy
 * JD-Core Version:    0.7.0.1
 */