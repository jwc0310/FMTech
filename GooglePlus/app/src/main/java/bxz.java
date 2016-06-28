import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.people.ui.CircleWithAvatarsViewGroup;
import java.util.ArrayList;
import java.util.List;

final class bxz
  extends BaseAdapter
{
  List<Pair<jgw, List<jjg>>> a;
  jgw b;
  private final LayoutInflater d;
  private List<jjg> e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public bxz(bxu parambxu)
  {
    this.d = LayoutInflater.from(parambxu.bn);
    Resources localResources = parambxu.g();
    this.f = localResources.getDimensionPixelSize(efj.ld);
    this.g = localResources.getDimensionPixelSize(efj.lc);
    this.h = localResources.getDimensionPixelSize(efj.le);
    this.i = localResources.getDimensionPixelSize(efj.lf);
  }
  
  private final int a()
  {
    if ((this.e != null) && (!this.e.isEmpty())) {
      return this.e.size();
    }
    return 1;
  }
  
  private final int a(int paramInt)
  {
    if (this.b != null) {}
    for (int j = 1 + a();; j = 0) {
      return -1 + (paramInt - j);
    }
  }
  
  public final void a(jjr paramjjr)
  {
    List localList = paramjjr.a();
    ArrayList localArrayList;
    int k;
    label55:
    Pair localPair;
    if (localList != null)
    {
      localArrayList = new ArrayList(localList.size());
      this.a = localArrayList;
      this.b = null;
      this.e = null;
      if (localList == null) {
        break label151;
      }
      int j = localList.size();
      k = 0;
      if (k >= j) {
        break label151;
      }
      localPair = (Pair)localList.get(k);
      if (!((jgw)localPair.first).b().equals(this.c.ab)) {
        break label136;
      }
      this.b = ((jgw)localPair.first);
      this.e = ((List)localPair.second);
    }
    for (;;)
    {
      k++;
      break label55;
      localArrayList = null;
      break;
      label136:
      this.a.add(localPair);
    }
    label151:
    notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    if (this.b != null) {}
    for (int j = 1 + a();; j = 0)
    {
      List localList = this.a;
      int k = 0;
      if (localList != null) {
        k = this.a.size();
      }
      return 2 + (j + k);
    }
  }
  
  public final Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    case 2: 
    case 3: 
    default: 
      return null;
    case 1: 
      return this.e.get(paramInt - 1);
    }
    return this.a.get(a(paramInt));
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    int j;
    if (this.b != null)
    {
      int m;
      if (this.e != null)
      {
        m = this.e.size();
        if (m <= 0) {
          break label51;
        }
      }
      label51:
      for (int n = m;; n = 1)
      {
        j = n + 1;
        if (paramInt != 0) {
          break label57;
        }
        return 0;
        m = 0;
        break;
      }
      label57:
      if ((paramInt == 1) && (m == 0)) {
        return 2;
      }
      if (paramInt < j) {
        return 1;
      }
    }
    else
    {
      j = 0;
    }
    List localList = this.a;
    int k = 0;
    if (localList != null) {
      k = this.a.size();
    }
    if (paramInt == j) {
      return 3;
    }
    if (paramInt == 1 + (j + k)) {
      return 5;
    }
    return 4;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView != null) {
      localObject = paramView;
    }
    for (;;)
    {
      switch (getItemViewType(paramInt))
      {
      case 2: 
      default: 
        return localObject;
        switch (getItemViewType(paramInt))
        {
        default: 
          localObject = null;
          break;
        case 0: 
          localObject = this.d.inflate(efj.sZ, paramViewGroup, false);
          break;
        case 1: 
          localObject = this.d.inflate(efj.th, paramViewGroup, false);
          break;
        case 2: 
          localObject = new TextView(this.c.bn);
          ((TextView)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, -2));
          ((TextView)localObject).setGravity(17);
          ((TextView)localObject).setTextAppearance(this.c.bn, efj.yq);
          bxu localbxu = this.c;
          int i6 = aau.dU;
          ((TextView)localObject).setText(localbxu.g().getString(i6));
          break;
        case 3: 
          localObject = new TextView(this.c.bn);
          ((TextView)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, -2));
          ((TextView)localObject).setTextAppearance(this.c.bn, efj.yq);
          ((TextView)localObject).setText(this.c.g().getString(aau.dR));
          break;
        case 4: 
          localObject = this.d.inflate(efj.td, paramViewGroup, false);
          break;
        case 5: 
          localObject = this.d.inflate(efj.ta, paramViewGroup, false);
          efj.a((View)localObject, new gxq(pkf.o));
          ((View)localObject).setOnClickListener(new gxn(new byc(this)));
        }
        break;
      }
    }
    TextView localTextView1 = (TextView)((View)localObject).findViewById(aaw.bt);
    String str6 = String.valueOf(this.b.c());
    int i4 = this.b.f();
    localTextView1.setText(12 + String.valueOf(str6).length() + str6 + " " + i4);
    TextView localTextView2 = (TextView)((View)localObject).findViewById(aaw.bs);
    if ((this.e != null) && (!this.e.isEmpty())) {}
    for (int i5 = 0;; i5 = 8)
    {
      localTextView2.setVisibility(i5);
      efj.a(localTextView2, new gxq(pkf.A));
      localTextView2.setOnClickListener(new gxn(new bya(this)));
      return localObject;
    }
    int i2 = paramInt - 1;
    jjg localjjg = (jjg)this.e.get(i2);
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)localObject;
    boolean bool1;
    boolean bool2;
    label634:
    View localView3;
    if (localjjg.h() == 1)
    {
      bool1 = true;
      localPeopleListRowView.a(this.c, this.c.ag, bool1);
      localPeopleListRowView.a(true);
      String str1 = localjjg.a();
      String str2 = localjjg.c();
      String str3 = localjjg.d();
      if (localjjg.k() != 2) {
        break label752;
      }
      bool2 = true;
      boolean bool3 = localjjg.m();
      String str4 = localjjg.e();
      String str5 = bxu.a(localjjg.i());
      localPeopleListRowView.a(str1, str2, str4, str3, this.c.ag.a(str5).toString(), false, str5, null, bool2, bool3, this.c.ak);
      localPeopleListRowView.setOnClickListener(this.c);
      localView3 = localPeopleListRowView.findViewById(aaw.cD);
      if (i2 == 0) {
        break label758;
      }
    }
    label752:
    label758:
    for (int i3 = 0;; i3 = 8)
    {
      localView3.setVisibility(i3);
      return localObject;
      bool1 = false;
      break;
      bool2 = false;
      break label634;
    }
    int n = this.f;
    if (this.b != null) {}
    for (int i1 = this.i;; i1 = this.h)
    {
      ((View)localObject).setPadding(n, i1, this.f, this.g);
      return localObject;
    }
    int k = a(paramInt);
    Pair localPair = (Pair)this.a.get(k);
    CircleWithAvatarsViewGroup localCircleWithAvatarsViewGroup = (CircleWithAvatarsViewGroup)((View)localObject).findViewById(aaw.bq);
    localCircleWithAvatarsViewGroup.a((jgw)localPair.first, (List)localPair.second);
    gxt localgxt = pkf.h;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = localCircleWithAvatarsViewGroup.b;
    efj.a((View)localObject, new kut(localgxt, arrayOfString));
    ((View)localObject).setOnClickListener(new gxn(new byb(this, this.c.d.a(this.c.bn, this.c.a.c(), localCircleWithAvatarsViewGroup.b, localCircleWithAvatarsViewGroup.a))));
    View localView2 = ((View)localObject).findViewById(aaw.cD);
    if (k != 0) {}
    for (int m = 0;; m = 8)
    {
      localView2.setVisibility(m);
      return localObject;
    }
    View localView1 = ((View)localObject).findViewById(aaw.cD);
    if ((this.a != null) && (!this.a.isEmpty())) {}
    for (int j = 0;; j = 8)
    {
      localView1.setVisibility(j);
      return localObject;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 6;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    int j = getItemViewType(paramInt);
    return (j == 1) || (j == 4) || (j == 5);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxz
 * JD-Core Version:    0.7.0.1
 */