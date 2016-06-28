import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import java.util.Iterator;
import java.util.List;

final class amr
  implements View.OnClickListener
{
  amr(amq paramamq) {}
  
  public final void onClick(View paramView)
  {
    ggg localggg = this.a.a;
    Object localObject;
    ggk localggk;
    if (localggg.e != null)
    {
      localObject = localggg.e.a;
      Iterator localIterator = localggg.d.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localggk = (ggk)localIterator.next();
      } while (localggk.a != localObject);
    }
    for (;;)
    {
      localggg.d.remove(localggk);
      if (localggg.c != null) {
        localggg.c.a(localObject);
      }
      if (localggk == localggg.e)
      {
        localggg.e = null;
        if (localggg.c != null) {
          localggg.c.a(localObject, null);
        }
      }
      localggg.n.invalidate();
      this.a.O();
      return;
      localggk = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amr
 * JD-Core Version:    0.7.0.1
 */