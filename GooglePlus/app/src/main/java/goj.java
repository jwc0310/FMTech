import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;
import java.util.ArrayList;
import java.util.List;

public final class goj
  extends mca
  implements ok
{
  private List<String> Z = new ArrayList();
  private ViewPager a;
  private goa aa;
  private hrs ab;
  private List<hrh> b;
  private List<Boolean> c = new ArrayList();
  private List<String> d = new ArrayList();
  
  public goj()
  {
    gxl localgxl = new gxl(new gxq(pkd.r));
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
    new got(this, this.bp);
  }
  
  private final ArrayList<String> v()
  {
    ArrayList localArrayList = new ArrayList();
    int i = this.b.size();
    for (int j = 0; j < i; j++) {
      if (!((hrh)this.b.get(j)).a().endsWith(".search")) {
        localArrayList.add(((hrh)this.b.get(j)).a());
      }
    }
    return localArrayList;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Em, null);
    gph localgph = new gph(h());
    this.a = ((ViewPager)localView.findViewById(aau.xU));
    this.a.a(this);
    Bundle localBundle = this.m;
    ArrayList localArrayList2;
    if (localBundle != null)
    {
      localArrayList2 = localBundle.getStringArrayList("AclPickerFragment.SHAREOUSEL_ORDER");
      if (localArrayList2 != null) {
        break label438;
      }
    }
    label431:
    label438:
    for (ArrayList localArrayList1 = v();; localArrayList1 = localArrayList2)
    {
      int i = localArrayList1.size();
      int j = 0;
      int k = 0;
      if (k < i)
      {
        String str2 = (String)localArrayList1.get(k);
        int n = this.d.indexOf(str2);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(n);
        arrayOfObject[1] = str2;
        String.format("index %s detected for %s", arrayOfObject);
        if (n == -1) {
          break label431;
        }
        hrh localhrh = (hrh)this.b.get(n);
        bk localbk = localhrh.a(localArrayList1);
        if (localbk == null) {
          break label431;
        }
        String.format("Adding %s to Shareousel", new Object[] { str2 });
        this.c.add(Boolean.valueOf(localhrh.d()));
        List localList = this.Z;
        int i2 = localhrh.b();
        localList.add(g().getString(i2));
        String str3 = localhrh.a();
        localgph.b.add(new Pair(str3, localbk));
      }
      for (int i1 = j + 1;; i1 = j)
      {
        k++;
        j = i1;
        break;
        localgph.c = this.Z;
        SlidingTabLayout localSlidingTabLayout = (SlidingTabLayout)localView.findViewById(aau.xV);
        this.a.c(j - 1);
        this.a.a(localgph);
        localSlidingTabLayout.a(this.a);
        if (localBundle != null)
        {
          String str1 = localBundle.getString("AclPickerFragment.INITIAL_SELECTION_SLIDE");
          String.format("selecting slide: %s", new Object[] { str1 });
          if (!TextUtils.isEmpty(str1))
          {
            int m = localArrayList1.indexOf(str1);
            this.a.a(m, false);
            if (this.a.d == m) {
              a(m);
            }
          }
        }
        return localView;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    goa localgoa = this.aa;
    boolean bool = ((Boolean)this.c.get(paramInt)).booleanValue();
    localgoa.b = bool;
    if (localgoa.a != null) {
      localgoa.a.a(bool, true);
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null)
    {
      Bundle localBundle = this.m;
      if (localBundle != null)
      {
        ArrayList localArrayList = localBundle.getParcelableArrayList("AclPickerFragment.INITIAL_SELECTION");
        if (localArrayList != null) {
          this.ab.a(localArrayList);
        }
      }
    }
  }
  
  public final void b(int paramInt) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aa = ((goa)this.bo.a(goa.class));
    this.ab = ((hrs)this.bo.b(hrs.class));
    this.b = this.bo.c(hrh.class);
    int i = this.b.size();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    String.format("%s factories found.", arrayOfObject1);
    for (int j = 0; j < i; j++)
    {
      String str = ((hrh)this.b.get(j)).a();
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = str;
      arrayOfObject2[1] = Integer.valueOf(j);
      String.format("indexing %s as %s", arrayOfObject2);
      this.d.add(str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     goj
 * JD-Core Version:    0.7.0.1
 */