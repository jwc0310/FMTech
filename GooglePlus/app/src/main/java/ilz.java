import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ilz
  extends mca
  implements iks
{
  private ikz a;
  private giz b;
  
  public final void a(ilf paramilf)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      gjb localgjb = this.b.a(j);
      if ((!localgjb.c("logged_in")) && (!localgjb.c("is_managed_account"))) {
        localArrayList.add(Integer.valueOf(j));
      }
    }
    if (localArrayList.isEmpty())
    {
      this.a.d();
      return;
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++) {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
    }
    Bundle localBundle = this.m;
    String str;
    bw localbw;
    if (localBundle != null)
    {
      str = localBundle.getString("dialog_title");
      localbw = h();
      if (str == null) {
        break label214;
      }
    }
    for (;;)
    {
      ilw.a(localbw, str, arrayOfInt, true);
      return;
      str = null;
      break;
      label214:
      str = this.bn.getString(efj.Ov);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((ikz)this.bo.a(ikz.class));
    this.b = ((giz)this.bo.a(giz.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ilz
 * JD-Core Version:    0.7.0.1
 */