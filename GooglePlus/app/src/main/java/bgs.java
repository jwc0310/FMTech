import android.content.Context;
import android.support.v7.app.MediaRouteButton;
import android.view.Menu;
import android.view.MenuItem;

public final class bgs
  implements gpi
{
  public int a = -1;
  private final Context b;
  private final int c;
  
  public bgs(Context paramContext, int paramInt)
  {
    this.b = paramContext;
    this.c = paramInt;
  }
  
  public final void a()
  {
    this.a = -1;
  }
  
  public final void a(Menu paramMenu)
  {
    Context localContext = this.b;
    if (this.a == -1) {
      return;
    }
    MenuItem localMenuItem = paramMenu.findItem(this.c);
    jqb localjqb = (jqb)mbb.a(localContext, jqb.class);
    localjqb.a((MediaRouteButton)mm.a(localMenuItem));
    localMenuItem.setVisible(localjqb.a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgs
 * JD-Core Version:    0.7.0.1
 */