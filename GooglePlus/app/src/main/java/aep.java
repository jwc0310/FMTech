import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public final class aep
  extends aew
{
  private static int k = View.MeasureSpec.makeMeasureSpec(0, 0);
  public aes a = new aeq();
  private boolean l = false;
  private int m = -1;
  private int[] n;
  private View[] o;
  private SparseIntArray p = new SparseIntArray();
  private SparseIntArray q = new SparseIntArray();
  private Rect r = new Rect();
  
  public aep(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (paramInt != this.m)
    {
      this.l = true;
      if (paramInt <= 0) {
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
      }
      this.m = paramInt;
      this.a.a.clear();
    }
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
  
  private final int a(agl paramagl, agr paramagr, int paramInt)
  {
    if (!paramagr.j) {
      return this.a.b(paramInt, this.m);
    }
    int i = paramagl.a(paramInt);
    if (i == -1)
    {
      new StringBuilder("Cannot find span size for pre layout position. ").append(paramInt);
      return 0;
    }
    return this.a.b(i, this.m);
  }
  
  private final void a(agl paramagl, agr paramagr, int paramInt, boolean paramBoolean)
  {
    int j;
    int i;
    int i6;
    label40:
    int i2;
    int i1;
    label56:
    int i3;
    int i4;
    label64:
    aer localaer;
    if (paramBoolean)
    {
      j = 1;
      i = 0;
      if (this.b != 1) {
        break label190;
      }
      RecyclerView localRecyclerView = this.g;
      if (nj.a.t(localRecyclerView) != 1) {
        break label184;
      }
      i6 = 1;
      if (i6 == 0) {
        break label190;
      }
      i2 = -1 + this.m;
      i1 = -1;
      i3 = i;
      i4 = i2;
      if (i3 == paramInt) {
        return;
      }
      View localView = this.o[i3];
      localaer = (aer)localView.getLayoutParams();
      localaer.b = c(paramagl, paramagr, ((agi)localView.getLayoutParams()).c.c());
      if ((i1 != -1) || (localaer.b <= 1)) {
        break label199;
      }
    }
    label184:
    label190:
    label199:
    for (localaer.a = (i4 - (-1 + localaer.b));; localaer.a = i4)
    {
      int i5 = i4 + i1 * localaer.b;
      i3 += j;
      i4 = i5;
      break label64;
      i = paramInt - 1;
      j = -1;
      paramInt = -1;
      break;
      i6 = 0;
      break label40;
      i1 = 1;
      i2 = 0;
      break label56;
    }
  }
  
  private final void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.r);
    agi localagi = (agi)paramView.getLayoutParams();
    if ((paramBoolean) || (this.b == 1)) {
      paramInt1 = a(paramInt1, localagi.leftMargin + this.r.left, localagi.rightMargin + this.r.right);
    }
    if ((paramBoolean) || (this.b == 0)) {
      paramInt2 = a(paramInt2, localagi.topMargin + this.r.top, localagi.bottomMargin + this.r.bottom);
    }
    paramView.measure(paramInt1, paramInt2);
  }
  
  private final int b(agl paramagl, agr paramagr, int paramInt)
  {
    int i;
    if (!paramagr.j) {
      i = this.a.a(paramInt, this.m);
    }
    do
    {
      return i;
      i = this.q.get(paramInt, -1);
    } while (i != -1);
    int j = paramagl.a(paramInt);
    if (j == -1)
    {
      new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(paramInt);
      return 0;
    }
    return this.a.a(j, this.m);
  }
  
  private final int c(agl paramagl, agr paramagr, int paramInt)
  {
    int i;
    if (!paramagr.j) {
      i = this.a.a(paramInt);
    }
    do
    {
      return i;
      i = this.p.get(paramInt, -1);
    } while (i != -1);
    int j = paramagl.a(paramInt);
    if (j == -1)
    {
      new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(paramInt);
      return 1;
    }
    return this.a.a(j);
  }
  
  public final int a(agl paramagl, agr paramagr)
  {
    if (this.b == 0) {
      return this.m;
    }
    if (paramagr.a() <= 0) {
      return 0;
    }
    return a(paramagl, paramagr, -1 + paramagr.a());
  }
  
  public final agi a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new aer(paramContext, paramAttributeSet);
  }
  
  public final agi a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new aer((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new aer(paramLayoutParams);
  }
  
  final View a(agl paramagl, agr paramagr, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    h();
    int i = this.c.b();
    int j = this.c.c();
    int i1;
    Object localObject2;
    label37:
    Object localObject3;
    int i3;
    label112:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2) {
        break label198;
      }
      localObject3 = d(paramInt1);
      int i2 = ((agi)((View)localObject3).getLayoutParams()).c.c();
      if ((i2 < 0) || (i2 >= paramInt3) || (b(paramagl, paramagr, i2) != 0)) {
        break label213;
      }
      if ((0x8 & ((agi)((View)localObject3).getLayoutParams()).c.i) == 0) {
        break label148;
      }
      i3 = 1;
      if (i3 == 0) {
        break label154;
      }
      if (localObject2 != null) {
        break label213;
      }
      localObject4 = localObject1;
    }
    for (;;)
    {
      paramInt1 += i1;
      localObject1 = localObject4;
      localObject2 = localObject3;
      break label37;
      i1 = -1;
      break;
      label148:
      i3 = 0;
      break label112;
      label154:
      if ((this.c.a((View)localObject3) >= j) || (this.c.b((View)localObject3) < i))
      {
        if (localObject1 != null) {
          break label213;
        }
        localObject4 = localObject3;
        localObject3 = localObject2;
        continue;
        label198:
        if (localObject1 != null) {
          localObject3 = localObject1;
        }
      }
      else
      {
        return localObject3;
      }
      return localObject2;
      label213:
      localObject4 = localObject1;
      localObject3 = localObject2;
    }
  }
  
  public final void a()
  {
    this.a.a.clear();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a.clear();
  }
  
  final void a(agl paramagl, agr paramagr, aey paramaey)
  {
    int i = 0;
    super.a(paramagl, paramagr, paramaey);
    int j;
    int i1;
    int i3;
    int i4;
    label115:
    int i6;
    int i8;
    if (this.b == 1)
    {
      j = m() - q() - o();
      if ((this.n == null) || (this.n.length != 1 + this.m) || (this.n[(-1 + this.n.length)] != j)) {
        this.n = new int[1 + this.m];
      }
      this.n[0] = 0;
      i1 = j / this.m;
      int i2 = j % this.m;
      i3 = 1;
      i4 = 0;
      if (i3 > this.m) {
        break label208;
      }
      i6 = i4 + i2;
      if ((i6 <= 0) || (this.m - i6 >= i2)) {
        break label302;
      }
      i8 = i1 + 1;
      i4 = i6 - this.m;
    }
    for (int i7 = i8;; i7 = i1)
    {
      i += i7;
      this.n[i3] = i;
      i3++;
      break label115;
      j = n() - r() - p();
      break;
      label208:
      if ((paramagr.a() > 0) && (!paramagr.j)) {
        for (int i5 = b(paramagl, paramagr, paramaey.a); (i5 > 0) && (paramaey.a > 0); i5 = b(paramagl, paramagr, paramaey.a)) {
          paramaey.a = (-1 + paramaey.a);
        }
      }
      if ((this.o == null) || (this.o.length != this.m)) {
        this.o = new View[this.m];
      }
      return;
      label302:
      i4 = i6;
    }
  }
  
  final void a(agl paramagl, agr paramagr, afa paramafa, aez paramaez)
  {
    boolean bool;
    int i;
    int j;
    if (paramafa.e == 1)
    {
      bool = true;
      i = this.m;
      j = 0;
      if (!bool) {
        i = b(paramagl, paramagr, paramafa.d) + c(paramagl, paramagr, paramafa.d);
      }
    }
    for (;;)
    {
      if ((j >= this.m) || (!paramafa.a(paramagr)) || (i <= 0)) {
        break label196;
      }
      int i24 = paramafa.d;
      int i25 = c(paramagl, paramagr, i24);
      if (i25 > this.m)
      {
        throw new IllegalArgumentException("Item at position " + i24 + " requires " + i25 + " spans but GridLayoutManager has only " + this.m + " spans.");
        bool = false;
        break;
      }
      i -= i25;
      if (i < 0) {
        break label196;
      }
      View localView4 = paramafa.a(paramagl);
      if (localView4 == null) {
        break label196;
      }
      this.o[j] = localView4;
      j++;
    }
    label196:
    if (j == 0)
    {
      paramaez.b = true;
      return;
    }
    int i1 = 0;
    a(paramagl, paramagr, j, bool);
    int i2 = 0;
    View localView3;
    label260:
    aer localaer3;
    int i18;
    int i22;
    int i23;
    label329:
    int i21;
    if (i2 < j)
    {
      localView3 = this.o[i2];
      if (paramafa.j == null) {
        if (bool)
        {
          super.a(localView3, -1, false);
          localaer3 = (aer)localView3.getLayoutParams();
          i18 = View.MeasureSpec.makeMeasureSpec(this.n[(localaer3.a + localaer3.b)] - this.n[localaer3.a], 1073741824);
          if (this.b != 1) {
            break label418;
          }
          i22 = localaer3.height;
          if (i22 >= 0) {
            break label406;
          }
          i23 = k;
          a(localView3, i18, i23, false);
          i21 = this.c.c(localView3);
          if (i21 <= i1) {
            break label967;
          }
        }
      }
    }
    for (;;)
    {
      i2++;
      i1 = i21;
      break;
      super.a(localView3, 0, false);
      break label260;
      if (bool)
      {
        super.a(localView3, -1, true);
        break label260;
      }
      super.a(localView3, 0, true);
      break label260;
      label406:
      i23 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
      break label329;
      label418:
      int i19 = localaer3.width;
      if (i19 < 0) {}
      for (int i20 = k;; i20 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824))
      {
        a(localView3, i20, i18, false);
        break;
      }
      int i3;
      int i4;
      label474:
      View localView2;
      int i17;
      if (i1 < 0)
      {
        i3 = k;
        i4 = 0;
        if (i4 >= j) {
          break label599;
        }
        localView2 = this.o[i4];
        if (this.c.c(localView2) != i1)
        {
          aer localaer2 = (aer)localView2.getLayoutParams();
          i17 = View.MeasureSpec.makeMeasureSpec(this.n[(localaer2.a + localaer2.b)] - this.n[localaer2.a], 1073741824);
          if (this.b != 1) {
            break label585;
          }
          a(localView2, i17, i3, true);
        }
      }
      for (;;)
      {
        i4++;
        break label474;
        i3 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
        break;
        label585:
        a(localView2, i3, i17, true);
      }
      label599:
      paramaez.a = i1;
      int i7;
      int i8;
      int i6;
      int i5;
      int i9;
      int i12;
      int i13;
      label660:
      View localView1;
      aer localaer1;
      label725:
      int i14;
      if (this.b == 1) {
        if (paramafa.f == -1)
        {
          i7 = paramafa.b;
          i8 = i7 - i1;
          i6 = 0;
          i5 = 0;
          i9 = 0;
          int i10 = i5;
          int i11 = i6;
          i12 = i8;
          i13 = i7;
          if (i9 >= j) {
            break label958;
          }
          localView1 = this.o[i9];
          localaer1 = (aer)localView1.getLayoutParams();
          if (this.b != 1) {
            break label912;
          }
          i10 = o() + this.n[localaer1.a];
          i11 = i10 + this.c.d(localView1);
          a(localView1, i10 + localaer1.leftMargin, i12 + localaer1.topMargin, i11 - localaer1.rightMargin, i13 - localaer1.bottomMargin);
          if ((0x8 & localaer1.c.i) == 0) {
            break label946;
          }
          i14 = 1;
          label779:
          if (i14 == 0) {
            if ((0x40 & localaer1.c.i) == 0) {
              break label952;
            }
          }
        }
      }
      label912:
      label946:
      label952:
      for (int i15 = 1;; i15 = 0)
      {
        if (i15 != 0) {
          paramaez.c = true;
        }
        paramaez.d |= localView1.isFocusable();
        i9++;
        break label660;
        i8 = paramafa.b;
        i7 = i8 + i1;
        i6 = 0;
        i5 = 0;
        break;
        if (paramafa.f == -1)
        {
          int i16 = paramafa.b;
          i5 = i16 - i1;
          i6 = i16;
          i7 = 0;
          i8 = 0;
          break;
        }
        i5 = paramafa.b;
        i6 = i1 + i5;
        i7 = 0;
        i8 = 0;
        break;
        i12 = p() + this.n[localaer1.a];
        i13 = i12 + this.c.d(localView1);
        break label725;
        i14 = 0;
        break label779;
      }
      label958:
      Arrays.fill(this.o, null);
      return;
      label967:
      i21 = i1;
    }
  }
  
  public final void a(agl paramagl, agr paramagr, View paramView, pr parampr)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof aer))
    {
      super.a(paramView, parampr);
      return;
    }
    aer localaer = (aer)localLayoutParams;
    int i = a(paramagl, paramagr, localaer.c.c());
    if (this.b == 0)
    {
      int i2 = localaer.a;
      int i3 = localaer.b;
      if ((this.m > 1) && (localaer.b == this.m)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        parampr.a(qa.a(i2, i3, i, 1, bool2, false));
        return;
      }
    }
    int j = localaer.a;
    int i1 = localaer.b;
    if ((this.m > 1) && (localaer.b == this.m)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      parampr.a(qa.a(i, 1, j, i1, bool1, false));
      return;
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.a.a.clear();
  }
  
  public final boolean a(agi paramagi)
  {
    return paramagi instanceof aer;
  }
  
  public final int b(agl paramagl, agr paramagr)
  {
    if (this.b == 1) {
      return this.m;
    }
    if (paramagr.a() <= 0) {
      return 0;
    }
    return a(paramagl, paramagr, -1 + paramagr.a());
  }
  
  public final agi b()
  {
    return new aer(-2, -2);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a.clear();
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    this.a.a.clear();
  }
  
  public final void c(agl paramagl, agr paramagr)
  {
    if (paramagr.j)
    {
      int i = l();
      for (int j = 0; j < i; j++)
      {
        aer localaer = (aer)d(j).getLayoutParams();
        int i1 = localaer.c.c();
        this.p.put(i1, localaer.b);
        this.q.put(i1, localaer.a);
      }
    }
    super.c(paramagl, paramagr);
    this.p.clear();
    this.q.clear();
    if (!paramagr.j) {
      this.l = false;
    }
  }
  
  public final boolean c()
  {
    return (this.e == null) && (!this.l);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aep
 * JD-Core Version:    0.7.0.1
 */