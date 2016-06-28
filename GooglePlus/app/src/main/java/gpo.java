import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

final class gpo
  implements gpr
{
  Menu a;
  SparseArray<List<gqh>> b = new SparseArray();
  
  gpo(gpm paramgpm, Menu paramMenu)
  {
    this.a = paramMenu;
  }
  
  public final MenuItem a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.a.add(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final MenuItem a(int paramInt, gqh paramgqh)
  {
    MenuItem localMenuItem = b(paramInt);
    if (localMenuItem != null)
    {
      Object localObject = (List)this.b.get(paramInt);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.b.put(paramInt, localObject);
      }
      ((List)localObject).add(paramgqh);
    }
    return localMenuItem;
  }
  
  public final gpi a(int paramInt)
  {
    return (gpi)this.c.d.get(paramInt);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.a.setGroupVisible(paramInt, false);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.c.a.e().a().a(paramCharSequence);
  }
  
  public final MenuItem b(int paramInt)
  {
    MenuItem localMenuItem = this.a.findItem(paramInt);
    localMenuItem.setVisible(true);
    return localMenuItem;
  }
  
  public final MenuItem c(int paramInt)
  {
    return this.a.findItem(paramInt);
  }
  
  public final void d(int paramInt)
  {
    this.c.a.e().a().b(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpo
 * JD-Core Version:    0.7.0.1
 */