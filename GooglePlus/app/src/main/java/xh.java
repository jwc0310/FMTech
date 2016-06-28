import android.content.Context;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class xh<T>
  extends xi<T>
{
  final Context a;
  Map<hc, MenuItem> b;
  Map<hd, SubMenu> c;
  
  xh(Context paramContext, T paramT)
  {
    super(paramT);
    this.a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof hc))
    {
      hc localhc = (hc)paramMenuItem;
      if (this.b == null) {
        this.b = new kl();
      }
      MenuItem localMenuItem = (MenuItem)this.b.get(paramMenuItem);
      if (localMenuItem == null)
      {
        localMenuItem = efj.a(this.a, localhc);
        this.b.put(localhc, localMenuItem);
      }
      return localMenuItem;
    }
    return paramMenuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof hd))
    {
      hd localhd = (hd)paramSubMenu;
      if (this.c == null) {
        this.c = new kl();
      }
      Object localObject = (SubMenu)this.c.get(localhd);
      if (localObject == null)
      {
        Context localContext = this.a;
        if (Build.VERSION.SDK_INT >= 14)
        {
          localObject = new yf(localContext, localhd);
          this.c.put(localhd, localObject);
        }
      }
      else
      {
        return localObject;
      }
      throw new UnsupportedOperationException();
    }
    return paramSubMenu;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xh
 * JD-Core Version:    0.7.0.1
 */