import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public final class gqb
  implements gpi
{
  final Activity a;
  private final int b;
  
  public gqb(Activity paramActivity, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramInt;
  }
  
  public final void a() {}
  
  public final void a(Menu paramMenu)
  {
    MenuItem localMenuItem = paramMenu.findItem(this.b);
    if (localMenuItem == null) {}
    View localView;
    do
    {
      do
      {
        return;
      } while (!localMenuItem.isVisible());
      localView = mm.a(localMenuItem);
    } while (localView == null);
    localView.setOnClickListener(new gqc(this, localMenuItem));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqb
 * JD-Core Version:    0.7.0.1
 */