import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;

final class byx
  extends ckb
{
  ArrayList<odg> a;
  ArrayList<odg> b;
  private LayoutInflater c = this.d.a_(null);
  
  byx(byv parambyv)
  {
    super(parambyv);
  }
  
  private final int a(int paramInt)
  {
    if (paramInt <= b()) {}
    for (int i = 0; i == 0; i = 1) {
      return paramInt - 1;
    }
    return -1 + (paramInt - b());
  }
  
  private final Object a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return this.a.get(paramInt2);
    }
    return this.b.get(paramInt2);
  }
  
  private final int b()
  {
    if (this.a != null) {
      return this.a.size();
    }
    return 0;
  }
  
  public final void a()
  {
    if (this.a != null) {
      cll.a(this.a);
    }
    if (this.b != null) {
      cll.a(this.b);
    }
    notifyDataSetChanged();
    byv localbyv = this.d;
    localbyv.J();
  }
  
  public final int getCount()
  {
    int i = b();
    if (this.b != null) {}
    for (int j = this.b.size();; j = 0)
    {
      int k = j + i;
      int m = 0;
      if (k != 0) {
        m = k + 1;
      }
      return m;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    if (paramInt == 0) {
      return "SUGGESTIONS_FOR_YOU_HEADER";
    }
    if (paramInt <= b()) {}
    for (int i = 0;; i = 1) {
      return a(i, a(paramInt));
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    return 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0)
    {
      if (paramView == null)
      {
        Resources localResources = this.d.g();
        paramView = new TextView(this.d.bn);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, localResources.getDimensionPixelSize(efj.nG)));
        paramView.setGravity(16);
        int n = localResources.getDimensionPixelSize(efj.nH);
        paramView.setPadding(n, 0, n, 0);
        paramView.setText(aau.uG);
        paramView.setTextAppearance(this.d.bn, efj.yq);
      }
      return paramView;
    }
    int i;
    FrameLayout localFrameLayout;
    PeopleListRowView localPeopleListRowView1;
    label182:
    int k;
    label270:
    gxt localgxt;
    label315:
    View localView;
    int m;
    if (paramInt <= b())
    {
      i = 0;
      int j = a(paramInt);
      if (paramView != null) {
        break label400;
      }
      PeopleListRowView localPeopleListRowView2 = (PeopleListRowView)this.c.inflate(efj.th, null);
      localFrameLayout = new FrameLayout(this.d.bn);
      localFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-2, -2));
      localFrameLayout.addView(localPeopleListRowView2);
      localPeopleListRowView1 = localPeopleListRowView2;
      Object localObject = a(i, j);
      localPeopleListRowView1.a(this.d, null, true);
      localPeopleListRowView1.a = true;
      localPeopleListRowView1.k = true;
      localPeopleListRowView1.a(true);
      localPeopleListRowView1.a(localObject, this.d.ai, this.d.ak);
      localPeopleListRowView1.setOnClickListener(this.d);
      odg localodg = (odg)localObject;
      if (localodg.f != 0) {
        break label422;
      }
      k = 12;
      localPeopleListRowView1.g = k;
      localPeopleListRowView1.h = null;
      switch (k)
      {
      default: 
        localgxt = null;
        if (localgxt != null) {
          efj.a(localFrameLayout, new gxq(localgxt));
        }
        efj.a(localPeopleListRowView1, new kuo(pkf.z, localodg.d, Integer.valueOf(j)));
        efj.f(localPeopleListRowView1);
        localView = localPeopleListRowView1.findViewById(aaw.cD);
        m = 0;
        if (paramInt == 1) {
          break;
        }
      }
    }
    for (;;)
    {
      localView.setVisibility(m);
      return localFrameLayout;
      i = 1;
      break;
      label400:
      localFrameLayout = (FrameLayout)paramView;
      localPeopleListRowView1 = (PeopleListRowView)localFrameLayout.findViewById(aaw.bG);
      break label182;
      label422:
      if (i == 0)
      {
        k = 13;
        break label270;
      }
      k = 14;
      break label270;
      localgxt = pkf.x;
      break label315;
      localgxt = pkf.y;
      break label315;
      m = 8;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byx
 * JD-Core Version:    0.7.0.1
 */