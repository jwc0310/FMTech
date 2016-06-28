import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bfn
  extends mca
  implements gpq
{
  gpk a = new gpk(this, this.bp, this);
  bfd b;
  List<bfc> c = new ArrayList();
  private beu d;
  
  public final void a(gpr paramgpr)
  {
    if (!this.d.a()) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        bfc localbfc = (bfc)localIterator.next();
        if (this.b.e.contains(localbfc)) {
          paramgpr.b(localbfc.a);
        }
      }
    }
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (!this.d.a()) {
      return false;
    }
    int i = paramMenuItem.getItemId();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      bfc localbfc = (bfc)localIterator.next();
      if (localbfc.a == i)
      {
        this.b.a(localbfc);
        return true;
      }
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((beu)this.bo.a(beu.class));
    this.b = ((bfd)this.bo.a(bfd.class));
    bfd localbfd = this.b;
    bfo localbfo = new bfo(this);
    localbfd.c.add(localbfo);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfn
 * JD-Core Version:    0.7.0.1
 */