import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import com.google.android.apps.plus.views.FastScrollContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public final class aol
  extends BaseAdapter
  implements SectionIndexer, ase<atq>, cmi<Long>
{
  final Context a;
  public final int b;
  final ipb c;
  public int d = -1;
  public int e;
  public cmh<Long, Future> f = new aoo(this);
  public cmh<Long, iph> g = new aor(this);
  public arv<atq> h;
  public aos i;
  private final int j;
  private boolean k;
  private boolean l;
  private aow m;
  private final det n;
  private List<atq> o = new ArrayList();
  private atq p;
  private atq q;
  private atq r;
  private boolean s;
  private apc t;
  
  public aol(Context paramContext, int paramInt, FastScrollContainer paramFastScrollContainer)
  {
    this.a = paramContext;
    this.j = paramInt;
    this.b = new jrh(paramContext).a;
    this.c = ((ipb)mbb.a(paramContext, ipb.class));
    this.n = new det(new aom(this));
    this.n.a = paramFastScrollContainer;
  }
  
  private final int a()
  {
    if (this.p != null) {
      return 1 + this.o.indexOf(this.p);
    }
    return 0;
  }
  
  private final atq a(aow paramaow, int paramInt)
  {
    if (paramaow == aow.d) {
      return new aoy(paramInt);
    }
    return new aox(this.a, aow.e.ordinal(), this.h);
  }
  
  private final atq b()
  {
    if (this.l) {
      return new apf();
    }
    return new aoz();
  }
  
  public final int a(aou paramaou)
  {
    int i1;
    int i2;
    int i3;
    float f1;
    label27:
    float f2;
    int i4;
    if (this.o == null)
    {
      i1 = 0;
      aoq localaoq = new aoq(paramaou);
      i2 = 0;
      i3 = 0;
      f1 = 0.0F;
      if (i2 >= i1) {
        break label138;
      }
      localaoq.a = 0.0F;
      ((atq)this.o.get(i2)).a(localaoq);
      if (localaoq.a < f1) {
        break label138;
      }
      if (localaoq.a < f1) {
        break label141;
      }
      float f3 = localaoq.a;
      if (Math.abs(1.0F - localaoq.a) < 1.0E-007F) {
        break label134;
      }
      f2 = f3;
      i4 = i2;
    }
    for (;;)
    {
      i2++;
      f1 = f2;
      i3 = i4;
      break label27;
      i1 = this.o.size();
      break;
      label134:
      i3 = i2;
      label138:
      return i3;
      label141:
      i4 = i3;
      f2 = f1;
    }
  }
  
  public final aou a(int paramInt)
  {
    if ((this.o == null) || (this.o.size() <= paramInt)) {
      return null;
    }
    aop localaop = new aop();
    ((atq)this.o.get(paramInt)).a(localaop);
    return localaop.a;
  }
  
  public final List<Long> a(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    aon localaon = new aon();
    while (paramInt1 < paramInt2)
    {
      ((atq)this.o.get(paramInt1)).a(localaon);
      if (localaon.a != null)
      {
        List localList = localaon.a.a;
        if (localList != null) {
          localArrayList.addAll(localList);
        }
      }
      paramInt1++;
    }
    return localArrayList;
  }
  
  public final void a(View paramView)
  {
    aph localaph1 = new aph(paramView, aow.h.ordinal());
    int i1;
    if (this.o.size() > 0)
    {
      if (this.r == null) {
        break label142;
      }
      i1 = this.o.indexOf(this.r);
      if (paramView == null) {
        break label122;
      }
      if (i1 < 0) {
        i1 = a();
      }
      if (i1 < this.o.size()) {
        this.o.set(i1, localaph1);
      }
    }
    else
    {
      if (paramView == null) {
        break label163;
      }
    }
    label142:
    label163:
    for (aph localaph2 = localaph1;; localaph2 = null)
    {
      this.r = localaph2;
      notifyDataSetChanged();
      return;
      this.o.add(i1, localaph1);
      break;
      label122:
      if (i1 < 0) {
        break;
      }
      this.o.remove(i1);
      break;
      if (paramView == null) {
        break;
      }
      this.o.add(a(), localaph1);
      break;
    }
  }
  
  public final void a(aow paramaow)
  {
    if ((paramaow != null) && (!aow.e.equals(paramaow)) && (!aow.d.equals(paramaow))) {}
    int i1;
    do
    {
      do
      {
        do
        {
          return;
          this.m = paramaow;
        } while (this.o.isEmpty());
        if ((this.p == null) && (this.m != null))
        {
          this.p = a(this.m, dux.a);
          this.o.add(0, this.p);
          notifyDataSetChanged();
          return;
        }
      } while (this.p == null);
      i1 = this.o.indexOf(this.p);
      if ((this.m == null) && (i1 >= 0))
      {
        this.o.remove(i1);
        this.p = null;
        notifyDataSetChanged();
        return;
      }
    } while (this.p.a() == this.m.ordinal());
    this.p = a(this.m, dux.a);
    List localList = this.o;
    int i2 = 0;
    if (i1 < 0) {}
    for (;;)
    {
      localList.set(i2, this.p);
      notifyDataSetChanged();
      return;
      i2 = i1;
    }
  }
  
  public final void a(aqc paramaqc, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.s = paramBoolean2;
    this.k = paramBoolean1;
    this.o = new ArrayList();
    this.p = a(this.m, paramInt);
    this.o.add(this.p);
    if ((paramaqc == null) || (paramaqc.a.size() == 0))
    {
      this.e = 0;
      this.q = null;
      this.t = null;
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      this.e = paramaqc.c.a.length;
      if (this.r != null) {
        this.o.add(this.r);
      }
      if (this.s)
      {
        this.t = new apc();
        this.o.add(this.t);
      }
      int i1 = this.o.size();
      this.o.addAll(paramaqc.a);
      SparseArray localSparseArray = new SparseArray();
      for (int i2 = -1 + paramaqc.b.size(); i2 >= 0; i2--) {
        localSparseArray.put(i1 + paramaqc.b.keyAt(i2), paramaqc.b.valueAt(i2));
      }
      this.n.a(localSparseArray);
      if (this.k)
      {
        this.q = b();
        this.o.add(this.q);
      }
      if (paramaqc.d != null) {
        this.d = paramaqc.d.intValue();
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
    if (this.o.size() == 0) {
      return;
    }
    if (this.t != null) {
      this.t.a = paramBoolean;
    }
    int i1 = -1 + this.o.size();
    atq localatq1 = (atq)this.o.get(i1);
    if (this.k)
    {
      atq localatq2 = this.q;
      this.q = b();
      if (localatq1 == localatq2) {
        this.o.set(i1, this.q);
      }
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      this.o.add(this.q);
      continue;
      if (localatq1 == this.q)
      {
        this.o.remove(i1);
        this.q = null;
      }
    }
  }
  
  public final int getCount()
  {
    return this.o.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((atq)this.o.get(paramInt)).a();
  }
  
  public final int getPositionForSection(int paramInt)
  {
    return this.n.getPositionForSection(paramInt);
  }
  
  public final int getSectionForPosition(int paramInt)
  {
    return this.n.getSectionForPosition(paramInt);
  }
  
  public final Object[] getSections()
  {
    return this.n.getSections();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return ((atq)this.o.get(paramInt)).a(paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return aow.values().length;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aol
 * JD-Core Version:    0.7.0.1
 */