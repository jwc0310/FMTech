import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public final class are
  extends BaseAdapter
  implements cmi<ipf>
{
  public List<atq> a = new ArrayList();
  
  public final int a(float paramFloat)
  {
    int i = 0;
    int j = this.a.size();
    arg localarg = new arg();
    int k = 0;
    if (i < j)
    {
      ((atq)this.a.get(i)).a(localarg);
      if ((0.0F <= localarg.a) && (localarg.a <= paramFloat)) {}
      for (int m = i;; m = k)
      {
        i++;
        k = m;
        break;
        if (localarg.a > paramFloat) {
          break label99;
        }
      }
    }
    label99:
    return k;
  }
  
  public final int a(Uri paramUri)
  {
    if (this.a.isEmpty()) {
      return 0;
    }
    int i = this.a.size();
    arf localarf = new arf();
    for (int j = 0; j < i; j++)
    {
      ((atq)this.a.get(j)).a(localarf);
      ipf localipf = localarf.a;
      if (localipf != null)
      {
        if (localipf.d != null) {}
        for (int k = 1; (k != 0) && (localipf.d.equals(paramUri)); k = 0) {
          return j;
        }
      }
    }
    return 0;
  }
  
  public final List<ipf> a(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    arf localarf = new arf();
    while (paramInt1 < paramInt2)
    {
      ((atq)this.a.get(paramInt1)).a(localarf);
      if (localarf.a != null) {
        localArrayList.add(localarf.a);
      }
      paramInt1++;
    }
    return localArrayList;
  }
  
  public final int getCount()
  {
    return this.a.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((atq)this.a.get(paramInt)).a();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return ((atq)this.a.get(paramInt)).a(paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     are
 * JD-Core Version:    0.7.0.1
 */