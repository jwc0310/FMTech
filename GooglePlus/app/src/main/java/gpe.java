import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.Collection;
import java.util.List;

public class gpe
  extends mca
  implements gpd, hru
{
  private gpc Z;
  public ListView a;
  private List<hrh> aa;
  public hrs b;
  BaseAdapter c;
  BaseAdapter d;
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(v(), null);
    if (localView != null) {
      this.a = ((ListView)localView.findViewById(16908298));
    }
    return localView;
  }
  
  public hrg a(hrh paramhrh)
  {
    return paramhrh.c();
  }
  
  public void a(int paramInt, Parcelable paramParcelable)
  {
    if (this.c != null) {
      this.c.notifyDataSetChanged();
    }
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    a(0, null);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    String str1 = this.m.getString("ShareouselSlide.ARG_ENSEMBLE_NAME");
    if (TextUtils.isEmpty(str1)) {
      throw new IllegalStateException("Must specify an ensemble name for this slide.");
    }
    String str2 = String.format("%s.search", new Object[] { str1 });
    int i = this.aa.size();
    int j = 0;
    if (j < i)
    {
      hrh localhrh = (hrh)this.aa.get(j);
      if (str1.equals(localhrh.a())) {
        new hri(a(localhrh), localhrh.a(), new gpf(this), h(), this.bp, new gop(this.bn), null);
      }
      for (;;)
      {
        j++;
        break;
        if (str2.equals(localhrh.a())) {
          new hri(localhrh.c(), localhrh.a(), new gpg(this), h(), this.bp, new hrm());
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    ListView localListView;
    if (this.a != null)
    {
      localListView = this.a;
      if (!paramBoolean) {
        break label27;
      }
    }
    label27:
    for (BaseAdapter localBaseAdapter = this.d;; localBaseAdapter = this.c)
    {
      localListView.setAdapter(localBaseAdapter);
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((hrs)this.bo.b(hrs.class));
    if ((this.b instanceof hrw)) {
      ((hrw)this.b).a(this);
    }
    this.Z = ((gpc)this.bo.b(gpc.class));
    if (this.Z != null) {
      this.Z.a(this);
    }
    this.aa = this.bo.c(hrh.class);
  }
  
  public int v()
  {
    return efj.En;
  }
  
  public final boolean w()
  {
    return (this.Z != null) && (this.Z.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpe
 * JD-Core Version:    0.7.0.1
 */