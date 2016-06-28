import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

public final class ahp
  extends agh
{
  private final ahs A = new ahs(this);
  private boolean B = false;
  private boolean C = true;
  private final Runnable D = new ahq(this);
  public int a = -1;
  public ahz[] b;
  afs c;
  int d = 1;
  public boolean e = false;
  ahu k = new ahu();
  private afs l;
  private int m;
  private aet n;
  private boolean o = false;
  private BitSet p;
  private int q = -1;
  private int r = -2147483648;
  private int s = 2;
  private boolean t;
  private boolean u;
  private ahx v;
  private int w;
  private int x;
  private int y;
  private final Rect z = new Rect();
  
  public ahp(int paramInt1, int paramInt2)
  {
    h(paramInt1);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    } while ((i != -2147483648) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, i);
  }
  
  private final int a(agl paramagl, aet paramaet, agr paramagr)
  {
    this.p.set(0, this.a, true);
    int i;
    int j;
    label58:
    int i1;
    int i2;
    if (paramaet.d == 1)
    {
      i = paramaet.f + paramaet.a;
      d(paramaet.d, i);
      if (!this.o) {
        break label190;
      }
      j = this.c.c();
      i1 = 0;
      if ((paramaet.b < 0) || (paramaet.b >= paramagr.a())) {
        break label202;
      }
      i2 = 1;
    }
    int i5;
    label190:
    label202:
    Object localObject1;
    int i6;
    label351:
    label608:
    label614:
    int i7;
    label424:
    label452:
    label461:
    label724:
    agt localagt2;
    label653:
    label655:
    label788:
    Object localObject2;
    for (;;)
    {
      if ((i2 != 0) && (!this.p.isEmpty()))
      {
        i5 = paramaet.b;
        if ((i5 < 0) || (i5 >= paramagl.e.y.a()))
        {
          throw new IndexOutOfBoundsException("Invalid item position " + i5 + "(" + i5 + "). Item count:" + paramagl.e.y.a());
          i = paramaet.e - paramaet.a;
          break;
          j = this.c.b();
          break label58;
          i2 = 0;
          continue;
        }
        boolean bool1 = paramagl.e.y.j;
        localObject1 = null;
        i6 = 0;
        int i43;
        int i39;
        if (bool1)
        {
          agt localagt3 = paramagl.c(i5);
          if (localagt3 != null)
          {
            i43 = 1;
            i6 = i43;
            localObject1 = localagt3;
          }
        }
        else
        {
          if (localObject1 != null) {
            break label461;
          }
          localObject1 = paramagl.a(i5, -1, false);
          if (localObject1 == null) {
            break label461;
          }
          if ((0x8 & ((agt)localObject1).i) == 0) {
            break label351;
          }
          i39 = 1;
        }
        int i40;
        int i41;
        for (;;)
        {
          if (i39 == 0)
          {
            if ((((agt)localObject1).b < 0) || (((agt)localObject1).b >= paramagl.e.g.a()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject1);
              i43 = 0;
              break;
              i39 = 0;
              continue;
            }
            if ((!paramagl.e.y.j) && (paramagl.e.g.a(((agt)localObject1).b) != ((agt)localObject1).e))
            {
              i40 = 0;
              if (i40 != 0) {
                break label655;
              }
              ((agt)localObject1).i = (0x4 | ((agt)localObject1).i);
              if (((agt)localObject1).m == null) {
                break label608;
              }
              i41 = 1;
              if (i41 == 0) {
                break label614;
              }
              paramagl.e.removeDetachedView(((agt)localObject1).a, false);
              ((agt)localObject1).m.b((agt)localObject1);
              paramagl.a((agt)localObject1);
              localObject1 = null;
            }
          }
        }
        for (;;)
        {
          if (localObject1 == null)
          {
            int i36 = paramagl.e.c.b(i5);
            if ((i36 < 0) || (i36 >= paramagl.e.g.a()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i5 + "(offset:" + i36 + ").state:" + paramagl.e.y.a());
              if (paramagl.e.g.b)
              {
                if (((agt)localObject1).d == paramagl.e.g.b(((agt)localObject1).b))
                {
                  i40 = 1;
                  break;
                }
                i40 = 0;
                break;
              }
              i40 = 1;
              break;
              i41 = 0;
              break label424;
              if ((0x20 & ((agt)localObject1).i) != 0) {}
              for (int i42 = 1;; i42 = 0)
              {
                if (i42 == 0) {
                  break label653;
                }
                ((agt)localObject1).i = (0xFFFFFFDF & ((agt)localObject1).i);
                break;
              }
              break label452;
              i6 = 1;
              continue;
            }
            int i37 = paramagl.e.g.a(i36);
            if (paramagl.e.g.b)
            {
              localObject1 = paramagl.a(paramagl.e.g.b(i36), i37, false);
              if (localObject1 != null)
              {
                ((agt)localObject1).b = i36;
                i7 = 1;
                if (localObject1 == null)
                {
                  ArrayList localArrayList = (ArrayList)paramagl.b().a.get(i37);
                  if ((localArrayList != null) && (!localArrayList.isEmpty()))
                  {
                    int i38 = -1 + localArrayList.size();
                    localagt2 = (agt)localArrayList.get(i38);
                    localArrayList.remove(i38);
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
                    break label2294;
                  }
                  aga localaga = paramagl.e.g;
                  RecyclerView localRecyclerView = paramagl.e;
                  if (Build.VERSION.SDK_INT >= 18) {
                    Trace.beginSection("RV CreateView");
                  }
                  agt localagt1 = localaga.a(localRecyclerView, i37);
                  localagt1.e = i37;
                  if (Build.VERSION.SDK_INT >= 18) {
                    Trace.endSection();
                  }
                  localObject2 = localagt1;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      int i35;
      label925:
      int i11;
      ViewGroup.LayoutParams localLayoutParams;
      agi localagi;
      label977:
      boolean bool2;
      label997:
      View localView2;
      aht localaht;
      int i12;
      ahu localahu1;
      int i13;
      label1072:
      int i14;
      label1081:
      ahz localahz2;
      label1102:
      ahz localahz1;
      label1132:
      int i31;
      label1155:
      int i32;
      label1195:
      int i24;
      label1229:
      int i19;
      int i18;
      if (paramagl.e.y.j) {
        if ((0x1 & ((agt)localObject2).i) != 0)
        {
          i35 = 1;
          if (i35 == 0) {
            break label1484;
          }
          ((agt)localObject2).f = i5;
          i11 = 0;
          localLayoutParams = ((agt)localObject2).a.getLayoutParams();
          if (localLayoutParams != null) {
            break label1696;
          }
          localagi = (agi)paramagl.e.generateDefaultLayoutParams();
          ((agt)localObject2).a.setLayoutParams(localagi);
          localagi.c = ((agt)localObject2);
          if ((i7 == 0) || (i11 == 0)) {
            break label1745;
          }
          bool2 = true;
          localagi.f = bool2;
          localView2 = ((agt)localObject2).a;
          paramaet.b += paramaet.c;
          localaht = (aht)localView2.getLayoutParams();
          i12 = localaht.c.c();
          localahu1 = this.k;
          if ((localahu1.a != null) && (i12 < localahu1.a.length)) {
            break label1751;
          }
          i13 = -1;
          if (i13 != -1) {
            break label1764;
          }
          i14 = 1;
          if (i14 == 0) {
            break label1780;
          }
          if (!localaht.b) {
            break label1770;
          }
          localahz2 = this.b[0];
          ahu localahu2 = this.k;
          localahu2.c(i12);
          localahu2.a[i12] = localahz2.e;
          localahz1 = localahz2;
          localaht.a = localahz1;
          if (paramaet.d != 1) {
            break label1792;
          }
          super.a(localView2, -1, false);
          if (!localaht.b) {
            break label1860;
          }
          if (this.d != 1) {
            break label1815;
          }
          int i30 = this.w;
          i31 = localaht.height;
          i32 = this.y;
          if (i31 >= 0) {
            break label1803;
          }
          a(localView2, i30, i32);
          if (paramaet.d != 1) {
            break label1974;
          }
          if (!localaht.b) {
            break label1962;
          }
          i24 = m(j);
          i19 = i24 + this.c.c(localView2);
          if ((i14 == 0) || (!localaht.b)) {
            break label2287;
          }
          ahv localahv3 = j(i24);
          localahv3.b = -1;
          localahv3.a = i12;
          this.k.a(localahv3);
          i18 = i24;
        }
      }
      for (;;)
      {
        int i23;
        if ((localaht.b) && (paramaet.c == -1))
        {
          if (i14 == 0)
          {
            if (paramaet.d != 1) {
              break label2072;
            }
            if (t()) {
              break label2066;
            }
            i23 = 1;
            label1329:
            if (i23 == 0) {
              break label1361;
            }
            ahv localahv1 = this.k.d(i12);
            if (localahv1 != null) {
              localahv1.d = true;
            }
          }
          this.B = true;
        }
        label1361:
        label1383:
        int i20;
        label1400:
        int i21;
        if (paramaet.d == 1) {
          if (localaht.b)
          {
            e(localView2);
            if (!localaht.b) {
              break label2134;
            }
            i20 = this.l.b();
            i21 = i20 + this.l.c(localView2);
            if (this.d != 1) {
              break label2157;
            }
            b(localView2, i20, i18, i21, i19);
            label1436:
            if (!localaht.b) {
              break label2174;
            }
            d(this.n.d, i);
          }
        }
        for (;;)
        {
          a(paramagl, this.n);
          i1 = 1;
          break;
          localagt2 = null;
          break label788;
          i35 = 0;
          break label925;
          label1484:
          int i8;
          label1497:
          int i33;
          if ((0x1 & ((agt)localObject2).i) != 0)
          {
            i8 = 1;
            if (i8 != 0)
            {
              if ((0x2 & ((agt)localObject2).i) == 0) {
                break label1684;
              }
              i33 = 1;
              label1515:
              if (i33 == 0) {
                if ((0x4 & ((agt)localObject2).i) == 0) {
                  break label1690;
                }
              }
            }
          }
          label1684:
          label1690:
          for (int i34 = 1;; i34 = 0)
          {
            int i10 = 0;
            if (i34 != 0)
            {
              int i9 = paramagl.e.c.b(i5);
              ((agt)localObject2).o = paramagl.e;
              paramagl.e.g.b((agt)localObject2, i9);
              View localView1 = ((agt)localObject2).a;
              if (paramagl.e.g())
              {
                if (nj.a.m(localView1) == 0) {
                  nj.a.c(localView1, 1);
                }
                if (!nj.a.i(localView1))
                {
                  ld localld = paramagl.e.E.e;
                  nj.a.a(localView1, localld);
                }
              }
              i10 = 1;
              if (paramagl.e.y.j) {
                ((agt)localObject2).f = i5;
              }
            }
            i11 = i10;
            break;
            i8 = 0;
            break label1497;
            i33 = 0;
            break label1515;
          }
          label1696:
          if (!paramagl.e.checkLayoutParams(localLayoutParams))
          {
            localagi = (agi)paramagl.e.generateLayoutParams(localLayoutParams);
            ((agt)localObject2).a.setLayoutParams(localagi);
            break label977;
          }
          localagi = (agi)localLayoutParams;
          break label977;
          label1745:
          bool2 = false;
          break label997;
          label1751:
          i13 = localahu1.a[i12];
          break label1072;
          label1764:
          i14 = 0;
          break label1081;
          label1770:
          localahz2 = a(paramaet);
          break label1102;
          label1780:
          localahz1 = this.b[i13];
          break label1132;
          label1792:
          super.a(localView2, 0, false);
          break label1155;
          label1803:
          i32 = View.MeasureSpec.makeMeasureSpec(i31, 1073741824);
          break label1195;
          label1815:
          int i28 = localaht.width;
          int i29 = this.x;
          if (i28 < 0) {}
          for (;;)
          {
            a(localView2, i29, this.w);
            break;
            i29 = View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
          }
          label1860:
          if (this.d == 1)
          {
            int i25 = this.x;
            int i26 = localaht.height;
            int i27 = this.y;
            if (i26 < 0) {}
            for (;;)
            {
              a(localView2, i25, i27);
              break;
              i27 = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
            }
          }
          int i15 = localaht.width;
          int i16 = this.x;
          if (i15 < 0) {}
          for (;;)
          {
            a(localView2, i16, this.y);
            break;
            i16 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
          }
          label1962:
          i24 = localahz1.b(j);
          break label1229;
          label1974:
          if (localaht.b) {}
          for (int i17 = l(j);; i17 = localahz1.a(j))
          {
            i18 = i17 - this.c.c(localView2);
            if ((i14 != 0) && (localaht.b))
            {
              ahv localahv2 = k(i17);
              localahv2.b = 1;
              localahv2.a = i12;
              this.k.a(localahv2);
            }
            i19 = i17;
            break;
          }
          label2066:
          i23 = 0;
          break label1329;
          label2072:
          if (!u())
          {
            i23 = 1;
            break label1329;
          }
          i23 = 0;
          break label1329;
          localaht.a.b(localView2);
          break label1383;
          if (localaht.b)
          {
            f(localView2);
            break label1383;
          }
          localaht.a.a(localView2);
          break label1383;
          label2134:
          i20 = localahz1.e * this.m + this.l.b();
          break label1400;
          label2157:
          b(localView2, i18, i20, i19, i21);
          break label1436;
          label2174:
          int i22 = this.n.d;
          a(localahz1, i22, i);
        }
        if (i1 == 0) {
          a(paramagl, this.n);
        }
        int i4;
        if (this.n.d == -1) {
          i4 = l(this.c.b());
        }
        for (int i3 = this.c.b() - i4; i3 > 0; i3 = m(this.c.c()) - this.c.c()) {
          return Math.min(paramaet.a, i3);
        }
        return 0;
        label2287:
        i18 = i24;
      }
      label2294:
      localObject2 = localObject1;
      continue;
      i7 = i6;
      break label724;
      i7 = i6;
      localObject2 = localObject1;
    }
  }
  
  private final ahz a(aet paramaet)
  {
    Object localObject1 = null;
    int i = -1;
    int j = paramaet.d;
    int i14;
    int i3;
    label38:
    int i5;
    int i4;
    label54:
    int i11;
    int i12;
    label80:
    ahz localahz2;
    int i13;
    if (this.d == 0) {
      if (j == i)
      {
        i14 = 1;
        if (i14 == this.o) {
          break label138;
        }
        i3 = 1;
        if (i3 == 0) {
          break label198;
        }
        i5 = -1 + this.a;
        i4 = i;
        if (paramaet.d != 1) {
          break label212;
        }
        int i10 = this.c.b();
        i11 = i5;
        i12 = 2147483647;
        if (i11 == i) {
          break label281;
        }
        localahz2 = this.b[i11];
        i13 = localahz2.b(i10);
        if (i13 >= i12) {
          break label293;
        }
      }
    }
    for (Object localObject3 = localahz2;; localObject3 = localObject1)
    {
      i11 += i4;
      localObject1 = localObject3;
      i12 = i13;
      break label80;
      i14 = 0;
      break;
      label138:
      i3 = 0;
      break label38;
      int i1;
      if (j == i)
      {
        i1 = 1;
        label153:
        if (i1 != this.o) {
          break label186;
        }
      }
      label186:
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 != s()) {
          break label192;
        }
        i3 = 1;
        break;
        i1 = 0;
        break label153;
      }
      label192:
      i3 = 0;
      break label38;
      label198:
      i = this.a;
      i4 = 1;
      i5 = 0;
      break label54;
      label212:
      int i6 = this.c.c();
      int i7 = i5;
      int i8 = -2147483648;
      ahz localahz1;
      int i9;
      if (i7 != i)
      {
        localahz1 = this.b[i7];
        i9 = localahz1.a(i6);
        if (i9 <= i8) {
          break label283;
        }
      }
      for (Object localObject2 = localahz1;; localObject2 = localObject1)
      {
        i7 += i4;
        localObject1 = localObject2;
        i8 = i9;
        break;
        label281:
        return localObject1;
        label283:
        i9 = i8;
      }
      label293:
      i13 = i12;
    }
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    i();
    int i = this.c.b();
    int j = this.c.c();
    int i1 = l();
    Object localObject1 = null;
    int i2 = 0;
    Object localObject2;
    if (i2 < i1)
    {
      localObject2 = d(i2);
      int i3 = this.c.a((View)localObject2);
      if ((this.c.b((View)localObject2) <= i) || (i3 >= j)) {
        break label110;
      }
      if ((i3 >= i) || (!paramBoolean1)) {
        return localObject2;
      }
      if (localObject1 != null) {
        break label110;
      }
    }
    for (;;)
    {
      i2++;
      localObject1 = localObject2;
      break;
      return localObject1;
      label110:
      localObject2 = localObject1;
    }
  }
  
  private final void a(int paramInt, agr paramagr)
  {
    this.n.a = 0;
    this.n.b = paramInt;
    boolean bool3;
    int i;
    int j;
    if (k())
    {
      int i2 = paramagr.a;
      if (i2 != -1)
      {
        boolean bool2 = this.o;
        if (i2 < paramInt)
        {
          bool3 = true;
          if (bool2 != bool3) {
            break label147;
          }
          i = this.c.e();
          j = 0;
        }
      }
    }
    for (;;)
    {
      RecyclerView localRecyclerView = this.g;
      int i1 = 0;
      if (localRecyclerView != null)
      {
        boolean bool1 = this.g.e;
        i1 = 0;
        if (bool1) {
          i1 = 1;
        }
      }
      if (i1 != 0)
      {
        this.n.e = (this.c.b() - j);
        this.n.f = (i + this.c.c());
        return;
        bool3 = false;
        break;
        label147:
        j = this.c.e();
        i = 0;
        continue;
      }
      this.n.f = (i + this.c.d());
      this.n.e = (-j);
      return;
      i = 0;
      j = 0;
    }
  }
  
  private final void a(agl paramagl, int paramInt)
  {
    for (;;)
    {
      View localView;
      aht localaht;
      if (l() > 0)
      {
        localView = d(0);
        if (this.c.b(localView) <= paramInt)
        {
          localaht = (aht)localView.getLayoutParams();
          if (!localaht.b) {
            break label106;
          }
          i = 0;
          if (i >= this.a) {
            break label78;
          }
          if (this.b[i].a.size() != 1) {
            break label72;
          }
        }
      }
      label72:
      label78:
      label106:
      while (localaht.a.a.size() == 1)
      {
        for (;;)
        {
          int i;
          return;
          i++;
        }
        for (int j = 0; j < this.a; j++) {
          this.b[j].e();
        }
      }
      localaht.a.e();
      a(localView, paramagl);
    }
  }
  
  private final void a(agl paramagl, aet paramaet)
  {
    int i = 1;
    if (paramaet.a == 0)
    {
      if (paramaet.d == -1)
      {
        b(paramagl, paramaet.f);
        return;
      }
      a(paramagl, paramaet.e);
      return;
    }
    if (paramaet.d == -1)
    {
      int i5 = paramaet.e;
      int i6 = paramaet.e;
      int i7 = this.b[0].a(i6);
      while (i < this.a)
      {
        int i10 = this.b[i].a(i6);
        if (i10 > i7) {
          i7 = i10;
        }
        i++;
      }
      int i8 = i5 - i7;
      if (i8 < 0) {}
      for (int i9 = paramaet.f;; i9 = paramaet.f - Math.min(i8, paramaet.a))
      {
        b(paramagl, i9);
        return;
      }
    }
    int j = paramaet.f;
    int i1 = this.b[0].b(j);
    while (i < this.a)
    {
      int i4 = this.b[i].b(j);
      if (i4 < i1) {
        i1 = i4;
      }
      i++;
    }
    int i2 = i1 - paramaet.f;
    if (i2 < 0) {}
    for (int i3 = paramaet.e;; i3 = paramaet.e + Math.min(i2, paramaet.a))
    {
      a(paramagl, i3);
      return;
    }
  }
  
  private final void a(agl paramagl, agr paramagr, boolean paramBoolean)
  {
    int i = m(this.c.c());
    int j = this.c.c() - i;
    if (j > 0)
    {
      int i1 = j - -d(-j, paramagl, paramagr);
      if ((paramBoolean) && (i1 > 0)) {
        this.c.a(i1);
      }
    }
  }
  
  private final void a(ahz paramahz, int paramInt1, int paramInt2)
  {
    int i = paramahz.d;
    if (paramInt1 == -1) {
      if (i + paramahz.a() <= paramInt2) {
        this.p.set(paramahz.e, false);
      }
    }
    while (paramahz.b() - i < paramInt2) {
      return;
    }
    this.p.set(paramahz.e, false);
  }
  
  private final void a(View paramView, int paramInt1, int paramInt2)
  {
    a(paramView, this.z);
    aht localaht = (aht)paramView.getLayoutParams();
    paramView.measure(a(paramInt1, localaht.leftMargin + this.z.left, localaht.rightMargin + this.z.right), a(paramInt2, localaht.topMargin + this.z.top, localaht.bottomMargin + this.z.bottom));
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    i();
    int i = this.c.b();
    int j = this.c.c();
    Object localObject1 = null;
    int i1 = -1 + l();
    Object localObject2;
    if (i1 >= 0)
    {
      localObject2 = d(i1);
      int i2 = this.c.a((View)localObject2);
      int i3 = this.c.b((View)localObject2);
      if ((i3 <= i) || (i2 >= j)) {
        break label112;
      }
      if ((i3 <= j) || (!paramBoolean1)) {
        return localObject2;
      }
      if (localObject1 != null) {
        break label112;
      }
    }
    for (;;)
    {
      i1--;
      localObject1 = localObject2;
      break;
      return localObject1;
      label112:
      localObject2 = localObject1;
    }
  }
  
  private final void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    int j;
    int i1;
    if (this.o)
    {
      i = v();
      if (paramInt3 != 3) {
        break label100;
      }
      if (paramInt1 >= paramInt2) {
        break label89;
      }
      j = paramInt2 + 1;
      i1 = paramInt1;
      label31:
      this.k.b(i1);
      switch (paramInt3)
      {
      case 2: 
      default: 
        label72:
        if (j > i) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i = w();
      break;
      label89:
      j = paramInt1 + 1;
      i1 = paramInt2;
      break label31;
      label100:
      j = paramInt1 + paramInt2;
      i1 = paramInt1;
      break label31;
      this.k.b(paramInt1, paramInt2);
      break label72;
      this.k.a(paramInt1, paramInt2);
      break label72;
      this.k.a(paramInt1, 1);
      this.k.b(paramInt2, 1);
      break label72;
      if (this.o) {}
      for (int i2 = w(); (i1 <= i2) && (this.g != null); i2 = v())
      {
        this.g.requestLayout();
        return;
      }
    }
  }
  
  private final void b(agl paramagl, int paramInt)
  {
    for (int i = -1 + l();; i--)
    {
      View localView;
      aht localaht;
      if (i >= 0)
      {
        localView = d(i);
        if (this.c.a(localView) >= paramInt)
        {
          localaht = (aht)localView.getLayoutParams();
          if (!localaht.b) {
            break label113;
          }
          j = 0;
          if (j >= this.a) {
            break label85;
          }
          if (this.b[j].a.size() != 1) {
            break label79;
          }
        }
      }
      label79:
      label85:
      label113:
      while (localaht.a.a.size() == 1)
      {
        for (;;)
        {
          int j;
          return;
          j++;
        }
        for (int i1 = 0; i1 < this.a; i1++) {
          this.b[i1].d();
        }
      }
      localaht.a.d();
      a(localView, paramagl);
    }
  }
  
  private final void b(agl paramagl, agr paramagr, boolean paramBoolean)
  {
    int i = l(this.c.b()) - this.c.b();
    if (i > 0)
    {
      int j = i - d(i, paramagl, paramagr);
      if ((paramBoolean) && (j > 0)) {
        this.c.a(-j);
      }
    }
  }
  
  private final void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    aht localaht = (aht)paramView.getLayoutParams();
    a(paramView, paramInt1 + localaht.leftMargin, paramInt2 + localaht.topMargin, paramInt3 - localaht.rightMargin, paramInt4 - localaht.bottomMargin);
  }
  
  private int d(int paramInt, agl paramagl, agr paramagr)
  {
    i();
    int i;
    int j;
    int i2;
    if (paramInt > 0)
    {
      i = 1;
      j = v();
      a(j, paramagr);
      i(i);
      this.n.b = (j + this.n.c);
      int i1 = Math.abs(paramInt);
      this.n.a = i1;
      i2 = a(paramagl, this.n, paramagr);
      if (i1 >= i2) {
        break label112;
      }
    }
    for (;;)
    {
      this.c.a(-paramInt);
      this.t = this.o;
      return paramInt;
      i = -1;
      j = w();
      break;
      label112:
      if (paramInt < 0) {
        paramInt = -i2;
      } else {
        paramInt = i2;
      }
    }
  }
  
  private final void d(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.a; i++) {
      if (!this.b[i].a.isEmpty()) {
        a(this.b[i], paramInt1, paramInt2);
      }
    }
  }
  
  private final void e(View paramView)
  {
    for (int i = -1 + this.a; i >= 0; i--) {
      this.b[i].b(paramView);
    }
  }
  
  private final void f(View paramView)
  {
    for (int i = -1 + this.a; i >= 0; i--) {
      this.b[i].a(paramView);
    }
  }
  
  private final int g(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    i();
    afs localafs = this.c;
    if (!this.C) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.C;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.a(paramagr, localafs, localView, b(bool3, true), this, this.C, this.o);
    }
  }
  
  private final int h(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    i();
    afs localafs = this.c;
    if (!this.C) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.C;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.a(paramagr, localafs, localView, b(bool3, true), this, this.C);
    }
  }
  
  private View h()
  {
    int i = -1 + l();
    BitSet localBitSet = new BitSet(this.a);
    localBitSet.set(0, this.a, true);
    int i12;
    int j;
    label65:
    int i1;
    label75:
    int i2;
    label84:
    int i3;
    View localView1;
    aht localaht1;
    ahz localahz;
    int i11;
    if (this.d == 1)
    {
      RecyclerView localRecyclerView = this.g;
      if (nj.a.t(localRecyclerView) == 1)
      {
        i12 = 1;
        if (i12 == 0) {
          break label173;
        }
        j = 1;
        if (!this.o) {
          break label178;
        }
        i1 = -1;
        if (i >= i1) {
          break label188;
        }
        i2 = 1;
        i3 = i;
        if (i3 == i1) {
          break label433;
        }
        localView1 = d(i3);
        localaht1 = (aht)localView1.getLayoutParams();
        if (!localBitSet.get(localaht1.a.e)) {
          break label233;
        }
        localahz = localaht1.a;
        if (!this.o) {
          break label194;
        }
        if (localahz.b() >= this.c.c()) {
          break label215;
        }
        i11 = 1;
      }
    }
    for (;;)
    {
      if (i11 == 0) {
        break label221;
      }
      return localView1;
      i12 = 0;
      break;
      label173:
      j = -1;
      break label65;
      label178:
      i1 = i + 1;
      i = 0;
      break label75;
      label188:
      i2 = -1;
      break label84;
      label194:
      if (localahz.a() > this.c.b()) {
        i11 = 1;
      } else {
        label215:
        i11 = 0;
      }
    }
    label221:
    localBitSet.clear(localaht1.a.e);
    label233:
    View localView2;
    int i6;
    if ((!localaht1.b) && (i3 + i2 != i1))
    {
      localView2 = d(i3 + i2);
      if (this.o)
      {
        int i9 = this.c.b(localView1);
        int i10 = this.c.b(localView2);
        if (i9 < i10) {
          return localView1;
        }
        if (i9 != i10) {
          break label435;
        }
        i6 = 1;
      }
    }
    for (;;)
    {
      if (i6 != 0)
      {
        aht localaht2 = (aht)localView2.getLayoutParams();
        int i7;
        if (localaht1.a.e - localaht2.a.e < 0)
        {
          i7 = 1;
          label349:
          if (j >= 0) {
            break label417;
          }
        }
        label417:
        for (int i8 = 1;; i8 = 0)
        {
          if (i7 == i8) {
            break label423;
          }
          return localView1;
          int i4 = this.c.a(localView1);
          int i5 = this.c.a(localView2);
          if (i4 > i5) {
            return localView1;
          }
          if (i4 != i5) {
            break label435;
          }
          i6 = 1;
          break;
          i7 = 0;
          break label349;
        }
      }
      label423:
      i3 += i2;
      break;
      label433:
      return null;
      label435:
      i6 = 0;
    }
  }
  
  private void h(int paramInt)
  {
    if (this.v == null) {
      super.a(null);
    }
    if (paramInt != this.a)
    {
      this.k.a();
      if (this.g != null) {
        this.g.requestLayout();
      }
      this.a = paramInt;
      this.p = new BitSet(this.a);
      this.b = new ahz[this.a];
      for (int i = 0; i < this.a; i++) {
        this.b[i] = new ahz(this, i);
      }
      if (this.g != null) {
        this.g.requestLayout();
      }
    }
  }
  
  private final int i(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    i();
    afs localafs = this.c;
    if (!this.C) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.C;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.b(paramagr, localafs, localView, b(bool3, true), this, this.C);
    }
  }
  
  private final void i()
  {
    if (this.c == null)
    {
      this.c = afs.a(this, this.d);
      this.l = afs.a(this, 1 - this.d);
      this.n = new aet();
    }
  }
  
  private final void i(int paramInt)
  {
    int i = 1;
    this.n.d = paramInt;
    aet localaet = this.n;
    int j = this.o;
    if (paramInt == -1)
    {
      int i1 = i;
      if (j != i1) {
        break label48;
      }
    }
    for (;;)
    {
      localaet.c = i;
      return;
      int i2 = 0;
      break;
      label48:
      i = -1;
    }
  }
  
  private final ahv j(int paramInt)
  {
    ahv localahv = new ahv();
    localahv.c = new int[this.a];
    for (int i = 0; i < this.a; i++) {
      localahv.c[i] = (paramInt - this.b[i].b(paramInt));
    }
    return localahv;
  }
  
  private final void j()
  {
    int i = 1;
    int j;
    boolean bool;
    if (this.d != i)
    {
      RecyclerView localRecyclerView = this.g;
      if (nj.a.t(localRecyclerView) == i)
      {
        j = i;
        if (j != 0) {
          break label48;
        }
      }
    }
    else
    {
      bool = this.e;
    }
    for (;;)
    {
      this.o = bool;
      return;
      j = 0;
      break;
      label48:
      if (this.e) {
        bool = false;
      }
    }
  }
  
  private final ahv k(int paramInt)
  {
    ahv localahv = new ahv();
    localahv.c = new int[this.a];
    for (int i = 0; i < this.a; i++) {
      localahv.c[i] = (this.b[i].a(paramInt) - paramInt);
    }
    return localahv;
  }
  
  private final int l(int paramInt)
  {
    int i = this.b[0].a(paramInt);
    for (int j = 1; j < this.a; j++)
    {
      int i1 = this.b[j].a(paramInt);
      if (i1 < i) {
        i = i1;
      }
    }
    return i;
  }
  
  private final int m(int paramInt)
  {
    int i = this.b[0].b(paramInt);
    for (int j = 1; j < this.a; j++)
    {
      int i1 = this.b[j].b(paramInt);
      if (i1 > i) {
        i = i1;
      }
    }
    return i;
  }
  
  private boolean s()
  {
    RecyclerView localRecyclerView = this.g;
    return nj.a.t(localRecyclerView) == 1;
  }
  
  private boolean t()
  {
    int i = 1;
    int j = this.b[0].b(-2147483648);
    for (int i1 = i;; i1++) {
      if (i1 < this.a)
      {
        if (this.b[i1].b(-2147483648) != j) {
          i = 0;
        }
      }
      else {
        return i;
      }
    }
  }
  
  private boolean u()
  {
    int i = 1;
    int j = this.b[0].a(-2147483648);
    for (int i1 = i;; i1++) {
      if (i1 < this.a)
      {
        if (this.b[i1].a(-2147483648) != j) {
          i = 0;
        }
      }
      else {
        return i;
      }
    }
  }
  
  private final int v()
  {
    int i = l();
    if (i == 0) {
      return 0;
    }
    return ((agi)d(i - 1).getLayoutParams()).c.c();
  }
  
  private final int w()
  {
    if (l() == 0) {
      return 0;
    }
    return ((agi)d(0).getLayoutParams()).c.c();
  }
  
  final int a(int paramInt)
  {
    if (l() == 0) {
      if (!this.o) {}
    }
    for (;;)
    {
      return 1;
      return -1;
      if (paramInt < w()) {}
      for (int i = 1; i != this.o; i = 0) {
        return -1;
      }
    }
  }
  
  public final int a(int paramInt, agl paramagl, agr paramagr)
  {
    return d(paramInt, paramagl, paramagr);
  }
  
  public final int a(agl paramagl, agr paramagr)
  {
    if (this.d == 0) {
      return this.a;
    }
    return super.a(paramagl, paramagr);
  }
  
  public final int a(agr paramagr)
  {
    return g(paramagr);
  }
  
  public final agi a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new aht(paramContext, paramAttributeSet);
  }
  
  public final agi a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new aht((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new aht(paramLayoutParams);
  }
  
  public final void a()
  {
    this.k.a();
    if (this.g != null) {
      this.g.requestLayout();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 0);
  }
  
  public final void a(agl paramagl, agr paramagr, View paramView, pr parampr)
  {
    int i = -1;
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof aht))
    {
      super.a(paramView, parampr);
      return;
    }
    aht localaht = (aht)localLayoutParams;
    int i7;
    int i3;
    int i1;
    int j;
    if (this.d == 0)
    {
      int i6 = localaht.c();
      if (localaht.b)
      {
        i7 = this.a;
        i3 = i7;
        i1 = i6;
        j = i;
      }
    }
    for (;;)
    {
      parampr.a(qa.a(i1, i3, j, i, localaht.b, false));
      return;
      i7 = 1;
      break;
      j = localaht.c();
      if (localaht.b)
      {
        int i4 = this.a;
        i1 = i;
        int i5 = i;
        i = i4;
        i3 = i5;
      }
      else
      {
        i1 = i;
        int i2 = i;
        i = 1;
        i3 = i2;
      }
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ahx))
    {
      this.v = ((ahx)paramParcelable);
      if (this.g != null) {
        this.g.requestLayout();
      }
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    ahr localahr = new ahr(this, paramRecyclerView.getContext());
    localahr.a = paramInt;
    a(localahr);
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 2);
  }
  
  public final void a(RecyclerView paramRecyclerView, agl paramagl)
  {
    a(this.D);
    for (int i = 0; i < this.a; i++) {
      this.b[i].c();
    }
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    qj localqj;
    View localView1;
    View localView2;
    if (l() > 0)
    {
      localqj = pl.a(paramAccessibilityEvent);
      localView1 = a(false, true);
      localView2 = b(false, true);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i = ((agi)localView1.getLayoutParams()).c.c();
    int j = ((agi)localView2.getLayoutParams()).c.c();
    if (i < j)
    {
      qj.a.a(localqj.b, i);
      qj.a.c(localqj.b, j);
      return;
    }
    qj.a.a(localqj.b, j);
    qj.a.c(localqj.b, i);
  }
  
  public final void a(String paramString)
  {
    if (this.v == null) {
      super.a(paramString);
    }
  }
  
  public final boolean a(agi paramagi)
  {
    return paramagi instanceof aht;
  }
  
  public final int b(int paramInt, agl paramagl, agr paramagr)
  {
    return d(paramInt, paramagl, paramagr);
  }
  
  public final int b(agl paramagl, agr paramagr)
  {
    if (this.d == 1) {
      return this.a;
    }
    return super.b(paramagl, paramagr);
  }
  
  public final int b(agr paramagr)
  {
    return g(paramagr);
  }
  
  public final agi b()
  {
    return new aht(-2, -2);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 1);
  }
  
  public final int c(agr paramagr)
  {
    return h(paramagr);
  }
  
  public final void c(int paramInt)
  {
    if ((this.v != null) && (this.v.a != paramInt))
    {
      ahx localahx = this.v;
      localahx.d = null;
      localahx.c = 0;
      localahx.a = -1;
      localahx.b = -1;
    }
    this.q = paramInt;
    this.r = -2147483648;
    if (this.g != null) {
      this.g.requestLayout();
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 3);
  }
  
  public final void c(agl paramagl, agr paramagr)
  {
    int i = 1;
    i();
    ahs localahs = this.A;
    localahs.a = -1;
    localahs.b = -2147483648;
    localahs.c = false;
    localahs.d = false;
    if (((this.v != null) || (this.q != -1)) && (paramagr.a() == 0))
    {
      c(paramagl);
      return;
    }
    label188:
    int i1;
    label410:
    label428:
    int i12;
    label454:
    int i10;
    if (this.v != null)
    {
      if (this.v.c > 0) {
        if (this.v.c == this.a)
        {
          int i21 = 0;
          if (i21 < this.a)
          {
            this.b[i21].c();
            int i22 = this.v.d[i21];
            if (i22 != -2147483648)
            {
              if (!this.v.i) {
                break label188;
              }
              i22 += this.c.c();
            }
            for (;;)
            {
              ahz localahz3 = this.b[i21];
              localahz3.b = i22;
              localahz3.c = i22;
              i21++;
              break;
              i22 += this.c.b();
            }
          }
        }
        else
        {
          ahx localahx = this.v;
          localahx.d = null;
          localahx.c = 0;
          localahx.e = 0;
          localahx.f = null;
          localahx.g = null;
          this.v.a = this.v.b;
        }
      }
      this.u = this.v.j;
      boolean bool2 = this.v.h;
      if (this.v == null) {
        super.a(null);
      }
      if ((this.v != null) && (this.v.h != bool2)) {
        this.v.h = bool2;
      }
      this.e = bool2;
      if (this.g != null) {
        this.g.requestLayout();
      }
      j();
      if (this.v.a != -1)
      {
        this.q = this.v.a;
        localahs.c = this.v.i;
        if (this.v.e > i)
        {
          this.k.a = this.v.f;
          this.k.b = this.v.g;
        }
        if ((!paramagr.j) && (this.q != -1)) {
          break label676;
        }
        i1 = 0;
        if (i1 == 0)
        {
          if (!this.t) {
            break label1192;
          }
          int i11 = paramagr.a();
          i12 = -1 + l();
          if (i12 < 0) {
            break label1186;
          }
          i10 = ((agi)d(i12).getLayoutParams()).c.c();
          if ((i10 < 0) || (i10 >= i11)) {
            break label1180;
          }
        }
      }
    }
    for (;;)
    {
      localahs.a = i10;
      localahs.b = -2147483648;
      if ((this.v == null) && ((localahs.c != this.t) || (s() != this.u)))
      {
        this.k.a();
        localahs.d = i;
      }
      if ((l() <= 0) || ((this.v != null) && (this.v.c > 0))) {
        break label1409;
      }
      if (!localahs.d) {
        break label1258;
      }
      for (int i5 = 0; i5 < this.a; i5++)
      {
        this.b[i5].c();
        if (localahs.b != -2147483648)
        {
          ahz localahz2 = this.b[i5];
          int i6 = localahs.b;
          localahz2.b = i6;
          localahz2.c = i6;
        }
      }
      localahs.c = this.o;
      break;
      j();
      localahs.c = this.o;
      break label410;
      label676:
      if ((this.q < 0) || (this.q >= paramagr.a()))
      {
        this.q = -1;
        this.r = -2147483648;
        i1 = 0;
        break label428;
      }
      View localView;
      label767:
      int i20;
      if ((this.v == null) || (this.v.a == -1) || (this.v.c <= 0))
      {
        localView = b(this.q);
        label899:
        if (localView != null)
        {
          int i17;
          if (this.o)
          {
            i17 = v();
            localahs.a = i17;
            if (this.r == -2147483648) {
              break label863;
            }
            if (!localahs.c) {
              break label833;
            }
          }
          label833:
          for (localahs.b = (this.c.c() - this.r - this.c.b(localView));; localahs.b = (this.c.b() + this.r - this.c.a(localView)))
          {
            i1 = i;
            break;
            i17 = w();
            break label767;
          }
          label863:
          if (this.c.c(localView) > this.c.e()) {
            if (localahs.c)
            {
              i20 = this.c.c();
              localahs.b = i20;
            }
          }
        }
      }
      for (;;)
      {
        i1 = i;
        break;
        i20 = this.c.b();
        break label899;
        int i18 = this.c.a(localView) - this.c.b();
        if (i18 < 0)
        {
          localahs.b = (-i18);
        }
        else
        {
          int i19 = this.c.c() - this.c.b(localView);
          if (i19 < 0)
          {
            localahs.b = i19;
          }
          else
          {
            localahs.b = -2147483648;
            continue;
            localahs.a = this.q;
            label1037:
            int i16;
            if (this.r == -2147483648) {
              if (a(localahs.a) == i)
              {
                int i14 = i;
                localahs.c = i14;
                if (!localahs.c) {
                  break label1087;
                }
                i16 = localahs.e.c.c();
                label1065:
                localahs.b = i16;
              }
            }
            for (;;)
            {
              localahs.d = i;
              break;
              int i15 = 0;
              break label1037;
              label1087:
              i16 = localahs.e.c.b();
              break label1065;
              int i13 = this.r;
              if (localahs.c) {
                localahs.b = (localahs.e.c.c() - i13);
              } else {
                localahs.b = (i13 + localahs.e.c.b());
              }
            }
            localahs.b = -2147483648;
            localahs.a = this.q;
          }
        }
      }
      label1180:
      i12--;
      break label454;
      label1186:
      i10 = 0;
      continue;
      label1192:
      int i7 = paramagr.a();
      int i8 = l();
      for (int i9 = 0;; i9++)
      {
        if (i9 >= i8) {
          break label1252;
        }
        i10 = ((agi)d(i9).getLayoutParams()).c.c();
        if ((i10 >= 0) && (i10 < i7)) {
          break;
        }
      }
      label1252:
      i10 = 0;
    }
    label1258:
    int i2 = 0;
    if (i2 < this.a)
    {
      ahz localahz1 = this.b[i2];
      boolean bool1 = this.o;
      int i3 = localahs.b;
      int i4;
      if (bool1)
      {
        i4 = localahz1.b(-2147483648);
        label1306:
        localahz1.c();
        if ((i4 != -2147483648) && ((!bool1) || (i4 >= localahz1.f.c.c())) && ((bool1) || (i4 <= localahz1.f.c.b()))) {
          break label1378;
        }
      }
      for (;;)
      {
        i2++;
        break;
        i4 = localahz1.a(-2147483648);
        break label1306;
        label1378:
        if (i3 != -2147483648) {
          i4 += i3;
        }
        localahz1.c = i4;
        localahz1.b = i4;
      }
    }
    label1409:
    a(paramagl);
    this.B = false;
    this.m = (this.l.e() / this.a);
    this.w = View.MeasureSpec.makeMeasureSpec(this.l.e(), 1073741824);
    if (this.d == i)
    {
      this.x = View.MeasureSpec.makeMeasureSpec(this.m, 1073741824);
      this.y = View.MeasureSpec.makeMeasureSpec(0, 0);
      a(localahs.a, paramagr);
      if (!localahs.c) {
        break label1715;
      }
      i(-1);
      a(paramagl, this.n, paramagr);
      i(i);
      this.n.b = (localahs.a + this.n.c);
      a(paramagl, this.n, paramagr);
      label1551:
      if (l() > 0)
      {
        if (!this.o) {
          break label1770;
        }
        a(paramagl, paramagr, i);
        b(paramagl, paramagr, false);
      }
      label1579:
      if (!paramagr.j) {
        if ((this.s == 0) || (l() <= 0) || ((!this.B) && (h() == null))) {
          break label1787;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        a(this.D);
        Runnable localRunnable = this.D;
        if (this.g != null)
        {
          RecyclerView localRecyclerView = this.g;
          nj.a.a(localRecyclerView, localRunnable);
        }
      }
      this.q = -1;
      this.r = -2147483648;
      this.t = localahs.c;
      this.u = s();
      this.v = null;
      return;
      this.y = View.MeasureSpec.makeMeasureSpec(this.m, 1073741824);
      this.x = View.MeasureSpec.makeMeasureSpec(0, 0);
      break;
      label1715:
      i(i);
      a(paramagl, this.n, paramagr);
      i(-1);
      this.n.b = (localahs.a + this.n.c);
      a(paramagl, this.n, paramagr);
      break label1551;
      label1770:
      b(paramagl, paramagr, i);
      a(paramagl, paramagr, false);
      break label1579;
      label1787:
      int j = 0;
    }
  }
  
  public final boolean c()
  {
    return this.v == null;
  }
  
  public final int d(agr paramagr)
  {
    return h(paramagr);
  }
  
  public final Parcelable d()
  {
    if (this.v != null) {
      return new ahx(this.v);
    }
    ahx localahx = new ahx();
    localahx.h = this.e;
    localahx.i = this.t;
    localahx.j = this.u;
    int i;
    label122:
    View localView;
    label141:
    int j;
    label148:
    int i1;
    label175:
    int i2;
    if ((this.k != null) && (this.k.a != null))
    {
      localahx.f = this.k.a;
      localahx.e = localahx.f.length;
      localahx.g = this.k.b;
      if (l() <= 0) {
        break label319;
      }
      i();
      if (!this.t) {
        break label247;
      }
      i = v();
      localahx.a = i;
      if (!this.o) {
        break label255;
      }
      localView = b(true, true);
      if (localView != null) {
        break label265;
      }
      j = -1;
      localahx.b = j;
      localahx.c = this.a;
      localahx.d = new int[this.a];
      i1 = 0;
      if (i1 >= this.a) {
        return localahx;
      }
      if (!this.t) {
        break label283;
      }
      i2 = this.b[i1].b(-2147483648);
      if (i2 != -2147483648) {
        i2 -= this.c.c();
      }
    }
    for (;;)
    {
      localahx.d[i1] = i2;
      i1++;
      break label175;
      localahx.e = 0;
      break;
      label247:
      i = w();
      break label122;
      label255:
      localView = a(true, true);
      break label141;
      label265:
      j = ((agi)localView.getLayoutParams()).c.c();
      break label148;
      label283:
      i2 = this.b[i1].a(-2147483648);
      if (i2 != -2147483648) {
        i2 -= this.c.b();
      }
    }
    label319:
    localahx.a = -1;
    localahx.b = -1;
    localahx.c = 0;
    return localahx;
  }
  
  public final int e(agr paramagr)
  {
    return i(paramagr);
  }
  
  public final void e(int paramInt)
  {
    super.e(paramInt);
    for (int i = 0; i < this.a; i++) {
      this.b[i].c(paramInt);
    }
  }
  
  public final boolean e()
  {
    return this.d == 0;
  }
  
  public final int f(agr paramagr)
  {
    return i(paramagr);
  }
  
  public final void f(int paramInt)
  {
    super.f(paramInt);
    for (int i = 0; i < this.a; i++) {
      this.b[i].c(paramInt);
    }
  }
  
  public final boolean f()
  {
    return this.d == 1;
  }
  
  public final void g(int paramInt)
  {
    if (paramInt == 0) {
      g();
    }
  }
  
  final boolean g()
  {
    int i = 1;
    if ((l() == 0) || (this.s == 0) || (!this.j))
    {
      i = 0;
      return i;
    }
    int i6;
    int i2;
    if (this.o)
    {
      int i5 = v();
      i6 = w();
      i2 = i5;
    }
    int i1;
    for (int i3 = i6;; i3 = i1)
    {
      if ((i2 != 0) || (h() == null)) {
        break label113;
      }
      this.k.a();
      this.i = i;
      if (this.g == null) {
        break;
      }
      this.g.requestLayout();
      return i;
      int j = w();
      i1 = v();
      i2 = j;
    }
    label113:
    if (!this.B) {
      return false;
    }
    if (this.o) {}
    ahv localahv1;
    for (int i4 = -1;; i4 = i)
    {
      localahv1 = this.k.a(i2, i3 + 1, i4, i);
      if (localahv1 != null) {
        break;
      }
      this.B = false;
      this.k.a(i3 + 1);
      return false;
    }
    ahv localahv2 = this.k.a(i2, localahv1.a, -i4, i);
    if (localahv2 == null) {
      this.k.a(localahv1.a);
    }
    for (;;)
    {
      this.i = i;
      if (this.g == null) {
        break;
      }
      this.g.requestLayout();
      return i;
      this.k.a(1 + localahv2.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahp
 * JD-Core Version:    0.7.0.1
 */