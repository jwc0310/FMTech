import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class imz
  extends mca
  implements iks
{
  private ikz a;
  private giz b;
  private ilb c;
  
  public final void a(ilf paramilf)
  {
    Bundle localBundle = this.m;
    if (localBundle != null) {}
    ArrayList localArrayList;
    for (ikl localikl = (ikl)localBundle.getParcelable("account_filter");; localikl = null)
    {
      localArrayList = new ArrayList();
      Iterator localIterator1 = this.b.a().iterator();
      while (localIterator1.hasNext())
      {
        int m = ((Integer)localIterator1.next()).intValue();
        gjb localgjb3 = this.b.a(m);
        if ((this.c.a(paramilf, m)) && ((localikl == null) || (localikl.a(localgjb3)))) {
          localArrayList.add(Integer.valueOf(m));
        }
      }
    }
    if (localArrayList.isEmpty())
    {
      Iterator localIterator2 = this.b.a().iterator();
      while (localIterator2.hasNext())
      {
        int k = ((Integer)localIterator2.next()).intValue();
        gjb localgjb2 = this.b.a(k);
        if (((localikl == null) || (localikl.a(localgjb2))) && (!localgjb2.c("is_managed_account"))) {
          localArrayList.add(Integer.valueOf(k));
        }
      }
    }
    if (localArrayList.isEmpty())
    {
      int j;
      if (localBundle != null)
      {
        boolean bool3 = localBundle.getBoolean("add_account");
        j = 0;
        if (!bool3) {}
      }
      else
      {
        j = 1;
      }
      if (j != 0)
      {
        this.a.d();
        return;
      }
      this.a.e();
      return;
    }
    if (localArrayList.size() == 1)
    {
      Integer localInteger = (Integer)localArrayList.get(0);
      gjb localgjb1 = this.b.a(localInteger.intValue());
      if ((!localgjb1.c("logged_out")) || (localBundle == null) || (localBundle.getBoolean("auto_select_single_logged_out_account")))
      {
        this.a.a(localgjb1.b("account_name"), localgjb1.b("effective_gaia_id"));
        return;
      }
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++) {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
    }
    String str;
    boolean bool1;
    bw localbw;
    if (localBundle != null)
    {
      str = localBundle.getString("dialog_title");
      bool1 = false;
      if (localBundle != null)
      {
        boolean bool2 = localBundle.getBoolean("add_account_button_shown");
        bool1 = false;
        if (bool2) {
          bool1 = true;
        }
      }
      localbw = h();
      if (str == null) {
        break label510;
      }
    }
    for (;;)
    {
      ilw.a(localbw, str, arrayOfInt, bool1);
      return;
      str = null;
      break;
      label510:
      str = this.bn.getString(efj.Ov);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((ikz)this.bo.a(ikz.class));
    this.b = ((giz)this.bo.a(giz.class));
    this.c = ((ilb)this.bo.a(ilb.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imz
 * JD-Core Version:    0.7.0.1
 */