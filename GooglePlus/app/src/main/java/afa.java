import android.os.Build.VERSION;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class afa
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  int i;
  List<agt> j = null;
  
  final View a(agl paramagl)
  {
    int k = 1;
    if (this.j != null)
    {
      int i16 = this.j.size();
      for (int i17 = 0; i17 < i16; i17++)
      {
        View localView3 = ((agt)this.j.get(i17)).a;
        agi localagi2 = (agi)localView3.getLayoutParams();
        if ((0x8 & localagi2.c.i) != 0) {}
        for (int i18 = k; (i18 == 0) && (this.d == localagi2.c.c()); i18 = 0)
        {
          a(localView3);
          return localView3;
        }
      }
      return null;
    }
    int m = this.d;
    if ((m < 0) || (m >= paramagl.e.y.a())) {
      throw new IndexOutOfBoundsException("Invalid item position " + m + "(" + m + "). Item count:" + paramagl.e.y.a());
    }
    int i15;
    int n;
    Object localObject1;
    if (paramagl.e.y.j)
    {
      agt localagt3 = paramagl.c(m);
      if (localagt3 != null)
      {
        i15 = k;
        n = i15;
        localObject1 = localagt3;
      }
    }
    for (;;)
    {
      int i12;
      int i13;
      if (localObject1 == null)
      {
        localObject1 = paramagl.a(m, -1, false);
        if (localObject1 != null)
        {
          int i11;
          if ((0x8 & ((agt)localObject1).i) != 0) {
            i11 = k;
          }
          for (;;)
          {
            if (i11 == 0)
            {
              if ((((agt)localObject1).b < 0) || (((agt)localObject1).b >= paramagl.e.g.a()))
              {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject1);
                i15 = 0;
                break;
                i11 = 0;
                continue;
              }
              if ((!paramagl.e.y.j) && (paramagl.e.g.a(((agt)localObject1).b) != ((agt)localObject1).e))
              {
                i12 = 0;
                if (i12 != 0) {
                  break label626;
                }
                ((agt)localObject1).i = (0x4 | ((agt)localObject1).i);
                if (((agt)localObject1).m == null) {
                  break label579;
                }
                i13 = k;
                label397:
                if (i13 == 0) {
                  break label585;
                }
                paramagl.e.removeDetachedView(((agt)localObject1).a, false);
                ((agt)localObject1).m.b((agt)localObject1);
                label425:
                paramagl.a((agt)localObject1);
                localObject1 = null;
              }
            }
          }
        }
      }
      label579:
      label585:
      label624:
      label626:
      int i1;
      agt localagt2;
      Object localObject2;
      for (;;)
      {
        if (localObject1 == null)
        {
          int i8 = paramagl.e.c.b(m);
          if ((i8 < 0) || (i8 >= paramagl.e.g.a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + m + "(offset:" + i8 + ").state:" + paramagl.e.y.a());
            if (paramagl.e.g.b)
            {
              if (((agt)localObject1).d == paramagl.e.g.b(((agt)localObject1).b))
              {
                i12 = k;
                break;
              }
              i12 = 0;
              break;
            }
            i12 = k;
            break;
            i13 = 0;
            break label397;
            if ((0x20 & ((agt)localObject1).i) != 0) {}
            for (int i14 = k;; i14 = 0)
            {
              if (i14 == 0) {
                break label624;
              }
              ((agt)localObject1).i = (0xFFFFFFDF & ((agt)localObject1).i);
              break;
            }
            break label425;
            n = k;
            continue;
          }
          int i9 = paramagl.e.g.a(i8);
          if (paramagl.e.g.b)
          {
            localObject1 = paramagl.a(paramagl.e.g.b(i8), i9, false);
            if (localObject1 != null)
            {
              ((agt)localObject1).b = i8;
              i1 = k;
              if (localObject1 == null)
              {
                ArrayList localArrayList = (ArrayList)paramagl.b().a.get(i9);
                if ((localArrayList != null) && (!localArrayList.isEmpty()))
                {
                  int i10 = -1 + localArrayList.size();
                  localagt2 = (agt)localArrayList.get(i10);
                  localArrayList.remove(i10);
                  if (localagt2 != null)
                  {
                    localagt2.g();
                    if ((RecyclerView.a) && ((localagt2.a instanceof ViewGroup))) {
                      paramagl.a((ViewGroup)localagt2.a, false);
                    }
                  }
                  localObject1 = localagt2;
                }
              }
              else
              {
                if (localObject1 != null) {
                  break label1267;
                }
                aga localaga = paramagl.e.g;
                RecyclerView localRecyclerView = paramagl.e;
                if (Build.VERSION.SDK_INT >= 18) {
                  Trace.beginSection("RV CreateView");
                }
                agt localagt1 = localaga.a(localRecyclerView, i9);
                localagt1.e = i9;
                if (Build.VERSION.SDK_INT >= 18) {
                  Trace.endSection();
                }
                localObject2 = localagt1;
              }
            }
          }
        }
      }
      for (;;)
      {
        int i7;
        label895:
        int i4;
        if (paramagl.e.y.j) {
          if ((0x1 & ((agt)localObject2).i) != 0)
          {
            i7 = k;
            if (i7 == 0) {
              break label1004;
            }
            ((agt)localObject2).f = m;
            i4 = 0;
          }
        }
        for (;;)
        {
          ViewGroup.LayoutParams localLayoutParams = ((agt)localObject2).a.getLayoutParams();
          agi localagi1;
          if (localLayoutParams == null)
          {
            localagi1 = (agi)paramagl.e.generateDefaultLayoutParams();
            ((agt)localObject2).a.setLayoutParams(localagi1);
            label946:
            localagi1.c = ((agt)localObject2);
            if ((i1 == 0) || (i4 == 0)) {
              break label1256;
            }
          }
          for (;;)
          {
            localagi1.f = k;
            View localView2 = ((agt)localObject2).a;
            this.d += this.e;
            return localView2;
            localagt2 = null;
            break;
            i7 = 0;
            break label895;
            label1004:
            int i2;
            label1017:
            int i5;
            if ((0x1 & ((agt)localObject2).i) != 0)
            {
              i2 = k;
              if (i2 != 0)
              {
                if ((0x2 & ((agt)localObject2).i) == 0) {
                  break label1195;
                }
                i5 = k;
                label1035:
                if (i5 == 0) {
                  if ((0x4 & ((agt)localObject2).i) == 0) {
                    break label1201;
                  }
                }
              }
            }
            label1195:
            label1201:
            for (int i6 = k;; i6 = 0)
            {
              if (i6 == 0) {
                break label1261;
              }
              int i3 = paramagl.e.c.b(m);
              ((agt)localObject2).o = paramagl.e;
              paramagl.e.g.b((agt)localObject2, i3);
              View localView1 = ((agt)localObject2).a;
              if (paramagl.e.g())
              {
                if (nj.a.m(localView1) == 0) {
                  nj.a.c(localView1, k);
                }
                if (!nj.a.i(localView1))
                {
                  ld localld = paramagl.e.E.e;
                  nj.a.a(localView1, localld);
                }
              }
              if (paramagl.e.y.j) {
                ((agt)localObject2).f = m;
              }
              i4 = k;
              break;
              i2 = 0;
              break label1017;
              i5 = 0;
              break label1035;
            }
            if (!paramagl.e.checkLayoutParams(localLayoutParams))
            {
              localagi1 = (agi)paramagl.e.generateLayoutParams(localLayoutParams);
              ((agt)localObject2).a.setLayoutParams(localagi1);
              break label946;
            }
            localagi1 = (agi)localLayoutParams;
            break label946;
            label1256:
            k = 0;
          }
          label1261:
          i4 = 0;
        }
        label1267:
        localObject2 = localObject1;
        continue;
        i1 = n;
        break;
        i1 = n;
        localObject2 = localObject1;
      }
      localObject1 = null;
      n = 0;
    }
  }
  
  public final void a(View paramView)
  {
    int k = this.j.size();
    Object localObject1 = null;
    int m = 2147483647;
    int n = 0;
    Object localObject2;
    int i2;
    label78:
    int i1;
    if (n < k)
    {
      localObject2 = ((agt)this.j.get(n)).a;
      agi localagi = (agi)((View)localObject2).getLayoutParams();
      if (localObject2 == paramView) {
        break label176;
      }
      if ((0x8 & localagi.c.i) != 0)
      {
        i2 = 1;
        if (i2 != 0) {
          break label176;
        }
        i1 = (localagi.c.c() - this.d) * this.e;
        if ((i1 < 0) || (i1 >= m)) {
          break label176;
        }
        if (i1 == 0) {
          break label146;
        }
      }
    }
    for (Object localObject3 = localObject2;; localObject3 = localObject1)
    {
      n++;
      localObject1 = localObject3;
      m = i1;
      break;
      i2 = 0;
      break label78;
      localObject2 = localObject1;
      label146:
      if (localObject2 == null)
      {
        this.d = -1;
        return;
      }
      this.d = ((agi)((View)localObject2).getLayoutParams()).c.c();
      return;
      label176:
      i1 = m;
    }
  }
  
  final boolean a(agr paramagr)
  {
    return (this.d >= 0) && (this.d < paramagr.a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afa
 * JD-Core Version:    0.7.0.1
 */