import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class aew
  extends agh
{
  private afa a;
  int b;
  afs c;
  boolean d = false;
  afb e = null;
  private boolean k;
  private boolean l = false;
  private boolean m = false;
  private boolean n = true;
  private int o = -1;
  private int p = -2147483648;
  private aey q = new aey(this);
  
  private aew(int paramInt, boolean paramBoolean)
  {
    a(1);
    if (this.e == null) {
      super.a(null);
    }
    if (this.l)
    {
      this.l = false;
      if (this.g != null) {
        this.g.requestLayout();
      }
    }
  }
  
  public aew(Context paramContext)
  {
    this(1, false);
  }
  
  private final int a(int paramInt, agl paramagl, agr paramagr, boolean paramBoolean)
  {
    int i = this.c.c() - paramInt;
    if (i > 0)
    {
      int j = -d(-i, paramagl, paramagr);
      int i1 = paramInt + j;
      if (paramBoolean)
      {
        int i2 = this.c.c() - i1;
        if (i2 > 0)
        {
          this.c.a(i2);
          j += i2;
        }
      }
      return j;
    }
    return 0;
  }
  
  private int a(agl paramagl, afa paramafa, agr paramagr, boolean paramBoolean)
  {
    int i = paramafa.c;
    if (paramafa.g != -2147483648)
    {
      if (paramafa.c < 0) {
        paramafa.g += paramafa.c;
      }
      a(paramagl, paramafa);
    }
    int j = paramafa.c + paramafa.h;
    aez localaez = new aez();
    do
    {
      if ((j <= 0) || (!paramafa.a(paramagr))) {
        break;
      }
      localaez.a = 0;
      localaez.b = false;
      localaez.c = false;
      localaez.d = false;
      a(paramagl, paramagr, paramafa, localaez);
      if (localaez.b) {
        break;
      }
      paramafa.b += localaez.a * paramafa.f;
      if ((!localaez.c) || (this.a.j != null) || (!paramagr.j))
      {
        paramafa.c -= localaez.a;
        j -= localaez.a;
      }
      if (paramafa.g != -2147483648)
      {
        paramafa.g += localaez.a;
        if (paramafa.c < 0) {
          paramafa.g += paramafa.c;
        }
        a(paramagl, paramafa);
      }
    } while ((!paramBoolean) || (!localaez.d));
    return i - paramafa.c;
  }
  
  private View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    h();
    int i = this.c.b();
    int j = this.c.c();
    if (paramInt2 > paramInt1) {}
    Object localObject1;
    Object localObject2;
    for (int i1 = 1;; i1 = -1)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label130;
      }
      localObject2 = d(paramInt1);
      int i2 = this.c.a((View)localObject2);
      int i3 = this.c.b((View)localObject2);
      if ((i2 >= j) || (i3 <= i)) {
        break label133;
      }
      if ((paramBoolean1) && ((i2 < i) || (i3 > j))) {
        break;
      }
      return localObject2;
    }
    if ((paramBoolean2) && (localObject1 == null)) {}
    for (;;)
    {
      paramInt1 += i1;
      localObject1 = localObject2;
      break;
      label130:
      return localObject1;
      label133:
      localObject2 = localObject1;
    }
  }
  
  private final View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.d) {
      return a(-1 + l(), -1, paramBoolean1, true);
    }
    return a(0, l(), paramBoolean1, true);
  }
  
  private final void a(int paramInt1, int paramInt2, boolean paramBoolean, agr paramagr)
  {
    int i = -1;
    int j = 1;
    this.a.h = g(paramagr);
    this.a.f = paramInt1;
    int i1;
    if (paramInt1 == j)
    {
      afa localafa4 = this.a;
      localafa4.h += this.c.f();
      View localView2 = u();
      afa localafa5 = this.a;
      if (this.d) {}
      for (;;)
      {
        localafa5.e = i;
        this.a.d = (((agi)localView2.getLayoutParams()).c.c() + this.a.e);
        this.a.b = this.c.b(localView2);
        i1 = this.c.b(localView2) - this.c.c();
        this.a.c = paramInt2;
        if (paramBoolean)
        {
          afa localafa3 = this.a;
          localafa3.c -= i1;
        }
        this.a.g = i1;
        return;
        i = j;
      }
    }
    View localView1 = t();
    afa localafa1 = this.a;
    localafa1.h += this.c.b();
    afa localafa2 = this.a;
    if (this.d) {}
    for (;;)
    {
      localafa2.e = j;
      this.a.d = (((agi)localView1.getLayoutParams()).c.c() + this.a.e);
      this.a.b = this.c.a(localView1);
      i1 = -this.c.a(localView1) + this.c.b();
      break;
      j = i;
    }
  }
  
  private final void a(agl paramagl, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      if (paramInt2 > paramInt1) {
        for (int i = paramInt2 - 1; i >= paramInt1; i--) {
          a(i, paramagl);
        }
      } else {
        while (paramInt1 > paramInt2)
        {
          a(paramInt1, paramagl);
          paramInt1--;
        }
      }
    }
  }
  
  private final void a(agl paramagl, afa paramafa)
  {
    if (!paramafa.a) {}
    for (;;)
    {
      return;
      if (paramafa.f == -1)
      {
        int i3 = paramafa.g;
        int i4 = l();
        if (i3 >= 0)
        {
          int i5 = this.c.d() - i3;
          if (this.d) {
            for (int i7 = 0; i7 < i4; i7++)
            {
              View localView4 = d(i7);
              if (this.c.a(localView4) < i5)
              {
                a(paramagl, 0, i7);
                return;
              }
            }
          } else {
            for (int i6 = i4 - 1; i6 >= 0; i6--)
            {
              View localView3 = d(i6);
              if (this.c.a(localView3) < i5)
              {
                a(paramagl, i4 - 1, i6);
                return;
              }
            }
          }
        }
      }
      else
      {
        int i = paramafa.g;
        if (i >= 0)
        {
          int j = l();
          if (this.d) {
            for (int i2 = j - 1; i2 >= 0; i2--)
            {
              View localView2 = d(i2);
              if (this.c.b(localView2) > i)
              {
                a(paramagl, j - 1, i2);
                return;
              }
            }
          } else {
            for (int i1 = 0; i1 < j; i1++)
            {
              View localView1 = d(i1);
              if (this.c.b(localView1) > i)
              {
                a(paramagl, 0, i1);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  private final int b(int paramInt, agl paramagl, agr paramagr, boolean paramBoolean)
  {
    int i = paramInt - this.c.b();
    if (i > 0)
    {
      int j = -d(i, paramagl, paramagr);
      int i1 = paramInt + j;
      if (paramBoolean)
      {
        int i2 = i1 - this.c.b();
        if (i2 > 0)
        {
          this.c.a(-i2);
          j -= i2;
        }
      }
      return j;
    }
    return 0;
  }
  
  private final View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.d) {
      return a(0, l(), paramBoolean1, true);
    }
    return a(-1 + l(), -1, paramBoolean1, true);
  }
  
  private int d(int paramInt, agl paramagl, agr paramagr)
  {
    if ((l() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.a.a = true;
    h();
    if (paramInt > 0) {}
    int j;
    int i1;
    for (int i = 1;; i = -1)
    {
      j = Math.abs(paramInt);
      a(i, j, true, paramagr);
      i1 = this.a.g + a(paramagl, this.a, paramagr, false);
      if (i1 >= 0) {
        break;
      }
      return 0;
    }
    if (j > i1) {
      paramInt = i * i1;
    }
    this.c.a(-paramInt);
    this.a.i = paramInt;
    return paramInt;
  }
  
  private final View d(agl paramagl, agr paramagr)
  {
    if (this.d) {
      return a(paramagl, paramagr, 0, l(), paramagr.a());
    }
    return f(paramagl, paramagr);
  }
  
  private final void d(int paramInt1, int paramInt2)
  {
    this.a.c = (this.c.c() - paramInt2);
    afa localafa = this.a;
    if (this.d) {}
    for (int i = -1;; i = 1)
    {
      localafa.e = i;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }
  
  private final View e(agl paramagl, agr paramagr)
  {
    if (this.d) {
      return f(paramagl, paramagr);
    }
    return a(paramagl, paramagr, 0, l(), paramagr.a());
  }
  
  private final void e(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.c.b());
    this.a.d = paramInt1;
    afa localafa = this.a;
    if (this.d) {}
    for (int i = 1;; i = -1)
    {
      localafa.e = i;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }
  
  private final View f(agl paramagl, agr paramagr)
  {
    return a(paramagl, paramagr, -1 + l(), -1, paramagr.a());
  }
  
  private int g(agr paramagr)
  {
    if (paramagr.a != -1) {}
    for (int i = 1;; i = 0)
    {
      int j = 0;
      if (i != 0) {
        j = this.c.e();
      }
      return j;
    }
  }
  
  private final int h(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    h();
    afs localafs = this.c;
    if (!this.n) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.n;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.a(paramagr, localafs, localView, b(bool3, true), this, this.n, this.d);
    }
  }
  
  private final int i(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    h();
    afs localafs = this.c;
    if (!this.n) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.n;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.a(paramagr, localafs, localView, b(bool3, true), this, this.n);
    }
  }
  
  private final int j(agr paramagr)
  {
    if (l() == 0) {
      return 0;
    }
    h();
    afs localafs = this.c;
    if (!this.n) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      boolean bool2 = this.n;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return efj.b(paramagr, localafs, localView, b(bool3, true), this, this.n);
    }
  }
  
  private final void s()
  {
    int i = 1;
    int j;
    boolean bool;
    if (this.b != i)
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
      bool = this.l;
    }
    for (;;)
    {
      this.d = bool;
      return;
      j = 0;
      break;
      label48:
      if (this.l) {
        bool = false;
      }
    }
  }
  
  private final View t()
  {
    if (this.d) {}
    for (int i = -1 + l();; i = 0) {
      return d(i);
    }
  }
  
  private final View u()
  {
    if (this.d) {}
    for (int i = 0;; i = -1 + l()) {
      return d(i);
    }
  }
  
  public final int a(int paramInt, agl paramagl, agr paramagr)
  {
    if (this.b == 1) {
      return 0;
    }
    return d(paramInt, paramagl, paramagr);
  }
  
  public final int a(agr paramagr)
  {
    return h(paramagr);
  }
  
  View a(agl paramagl, agr paramagr, int paramInt1, int paramInt2, int paramInt3)
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
    label101:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2) {
        break label187;
      }
      localObject3 = d(paramInt1);
      int i2 = ((agi)((View)localObject3).getLayoutParams()).c.c();
      if ((i2 < 0) || (i2 >= paramInt3)) {
        break label202;
      }
      if ((0x8 & ((agi)((View)localObject3).getLayoutParams()).c.i) == 0) {
        break label137;
      }
      i3 = 1;
      if (i3 == 0) {
        break label143;
      }
      if (localObject2 != null) {
        break label202;
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
      label137:
      i3 = 0;
      break label101;
      label143:
      if ((this.c.a((View)localObject3) >= j) || (this.c.b((View)localObject3) < i))
      {
        if (localObject1 != null) {
          break label202;
        }
        localObject4 = localObject3;
        localObject3 = localObject2;
        continue;
        label187:
        if (localObject1 != null) {
          localObject3 = localObject1;
        }
      }
      else
      {
        return localObject3;
      }
      return localObject2;
      label202:
      localObject4 = localObject1;
      localObject3 = localObject2;
    }
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    if (this.e == null) {
      super.a(null);
    }
    if (paramInt == this.b) {}
    do
    {
      return;
      this.b = paramInt;
      this.c = null;
    } while (this.g == null);
    this.g.requestLayout();
  }
  
  void a(agl paramagl, agr paramagr, aey paramaey) {}
  
  void a(agl paramagl, agr paramagr, afa paramafa, aez paramaez)
  {
    View localView = paramafa.a(paramagl);
    if (localView == null)
    {
      paramaez.b = true;
      return;
    }
    agi localagi1 = (agi)localView.getLayoutParams();
    boolean bool4;
    label68:
    int i8;
    int i7;
    label258:
    int i1;
    int i3;
    int i4;
    int i2;
    label296:
    int i5;
    if (paramafa.j == null)
    {
      boolean bool3 = this.d;
      if (paramafa.f == -1)
      {
        bool4 = true;
        if (bool3 != bool4) {
          break label400;
        }
        super.a(localView, -1, false);
        agi localagi2 = (agi)localView.getLayoutParams();
        Rect localRect = this.g.e(localView);
        int i = 0 + (localRect.left + localRect.right);
        int j = 0 + (localRect.top + localRect.bottom);
        localView.measure(agh.a(m(), i + (o() + q() + localagi2.leftMargin + localagi2.rightMargin), localagi2.width, e()), agh.a(n(), j + (p() + r() + localagi2.topMargin + localagi2.bottomMargin), localagi2.height, f()));
        paramaez.a = this.c.c(localView);
        if (this.b != 1) {
          break label523;
        }
        if (!g()) {
          break label463;
        }
        i8 = m() - q();
        i7 = i8 - this.c.d(localView);
        if (paramafa.f != -1) {
          break label486;
        }
        int i11 = paramafa.b;
        i1 = paramafa.b - paramaez.a;
        i3 = i7;
        i4 = i8;
        i2 = i11;
        a(localView, i3 + localagi1.leftMargin, i1 + localagi1.topMargin, i4 - localagi1.rightMargin, i2 - localagi1.bottomMargin);
        if ((0x8 & localagi1.c.i) == 0) {
          break label593;
        }
        i5 = 1;
        label350:
        if (i5 == 0) {
          if ((0x40 & localagi1.c.i) == 0) {
            break label599;
          }
        }
      }
    }
    label400:
    label452:
    label463:
    label593:
    label599:
    for (int i6 = 1;; i6 = 0)
    {
      if (i6 != 0) {
        paramaez.c = true;
      }
      paramaez.d = localView.isFocusable();
      return;
      bool4 = false;
      break;
      super.a(localView, 0, false);
      break label68;
      boolean bool1 = this.d;
      if (paramafa.f == -1) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        if (bool1 != bool2) {
          break label452;
        }
        super.a(localView, -1, true);
        break;
      }
      super.a(localView, 0, true);
      break label68;
      i7 = o();
      i8 = i7 + this.c.d(localView);
      break label258;
      label486:
      int i9 = paramafa.b;
      int i10 = paramafa.b + paramaez.a;
      i1 = i9;
      i3 = i7;
      i4 = i8;
      i2 = i10;
      break label296;
      i1 = p();
      i2 = i1 + this.c.d(localView);
      if (paramafa.f == -1)
      {
        i4 = paramafa.b;
        i3 = paramafa.b - paramaez.a;
        break label296;
      }
      i3 = paramafa.b;
      i4 = paramafa.b + paramaez.a;
      break label296;
      i5 = 0;
      break label350;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof afb))
    {
      this.e = ((afb)paramParcelable);
      if (this.g != null) {
        this.g.requestLayout();
      }
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    aex localaex = new aex(this, paramRecyclerView.getContext());
    localaex.a = paramInt;
    a(localaex);
  }
  
  public final void a(RecyclerView paramRecyclerView, agl paramagl)
  {
    super.a(paramRecyclerView, paramagl);
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = -1;
    super.a(paramAccessibilityEvent);
    qj localqj;
    View localView;
    if (l() > 0)
    {
      localqj = pl.a(paramAccessibilityEvent);
      int j = i();
      qj.a.a(localqj.b, j);
      localView = a(-1 + l(), i, false, true);
      if (localView != null) {
        break label69;
      }
    }
    for (;;)
    {
      qj.a.c(localqj.b, i);
      return;
      label69:
      i = ((agi)localView.getLayoutParams()).c.c();
    }
  }
  
  public final void a(String paramString)
  {
    if (this.e == null) {
      super.a(paramString);
    }
  }
  
  public final int b(int paramInt, agl paramagl, agr paramagr)
  {
    if (this.b == 0) {
      return 0;
    }
    return d(paramInt, paramagl, paramagr);
  }
  
  public final int b(agr paramagr)
  {
    return h(paramagr);
  }
  
  public agi b()
  {
    return new agi(-2, -2);
  }
  
  public final View b(int paramInt)
  {
    int i = l();
    if (i == 0) {
      return null;
    }
    int j = paramInt - ((agi)d(0).getLayoutParams()).c.c();
    if ((j >= 0) && (j < i))
    {
      View localView = d(j);
      if (((agi)localView.getLayoutParams()).c.c() == paramInt) {
        return localView;
      }
    }
    return super.b(paramInt);
  }
  
  public final int c(agr paramagr)
  {
    return i(paramagr);
  }
  
  public final View c(int paramInt, agl paramagl, agr paramagr)
  {
    s();
    if (l() == 0) {}
    int i;
    label76:
    View localView1;
    label101:
    do
    {
      do
      {
        return null;
        switch (paramInt)
        {
        default: 
          i = -2147483648;
        }
      } while (i == -2147483648);
      h();
      if (i != -1) {
        break;
      }
      localView1 = e(paramagl, paramagr);
    } while (localView1 == null);
    h();
    a(i, (int)(0.33F * this.c.e()), false, paramagr);
    this.a.g = -2147483648;
    this.a.a = false;
    a(paramagl, this.a, paramagr, true);
    if (i == -1) {}
    for (View localView2 = t(); (localView2 != localView1) && (localView2.isFocusable()); localView2 = u())
    {
      return localView2;
      i = -1;
      break label76;
      i = 1;
      break label76;
      if (this.b == 1)
      {
        i = -1;
        break label76;
      }
      i = -2147483648;
      break label76;
      if (this.b == 1)
      {
        i = 1;
        break label76;
      }
      i = -2147483648;
      break label76;
      if (this.b == 0)
      {
        i = -1;
        break label76;
      }
      i = -2147483648;
      break label76;
      if (this.b == 0)
      {
        i = 1;
        break label76;
      }
      i = -2147483648;
      break label76;
      localView1 = d(paramagl, paramagr);
      break label101;
    }
  }
  
  public final void c(int paramInt)
  {
    this.o = paramInt;
    this.p = -2147483648;
    if (this.e != null) {
      this.e.a = -1;
    }
    if (this.g != null) {
      this.g.requestLayout();
    }
  }
  
  public void c(agl paramagl, agr paramagr)
  {
    if (((this.e != null) || (this.o != -1)) && (paramagr.a() == 0))
    {
      c(paramagl);
      return;
    }
    int i59;
    if (this.e != null)
    {
      if (this.e.a < 0) {
        break label789;
      }
      i59 = 1;
      if (i59 != 0) {
        this.o = this.e.a;
      }
    }
    h();
    this.a.a = false;
    s();
    aey localaey1 = this.q;
    localaey1.a = -1;
    localaey1.b = -2147483648;
    localaey1.c = false;
    this.q.c = this.d;
    aey localaey2 = this.q;
    int i;
    label136:
    Object localObject;
    label158:
    int i42;
    label190:
    int i43;
    label224:
    int i44;
    label254:
    int i39;
    label257:
    int j;
    int i1;
    label293:
    int i2;
    int i3;
    View localView1;
    int i38;
    label387:
    label399:
    int i32;
    int i34;
    if ((paramagr.j) || (this.o == -1))
    {
      i = 0;
      if (i == 0)
      {
        if (l() == 0) {
          break label1640;
        }
        if (this.g != null) {
          break label1262;
        }
        localObject = null;
        if (localObject == null) {
          break label1633;
        }
        agi localagi = (agi)((View)localObject).getLayoutParams();
        if ((0x8 & localagi.c.i) == 0) {
          break label1306;
        }
        i42 = 1;
        if ((i42 != 0) || (localagi.c.c() < 0) || (localagi.c.c() >= paramagr.a())) {
          break label1312;
        }
        i43 = 1;
        if (i43 == 0) {
          break label1633;
        }
        i44 = localaey2.d.c.a();
        if (i44 < 0) {
          break label1318;
        }
        localaey2.a((View)localObject);
        i39 = 1;
        if (i39 == 0)
        {
          localaey2.a();
          localaey2.a = 0;
        }
      }
      j = g(paramagr);
      if (this.a.i < 0) {
        break label1793;
      }
      i1 = 0;
      i2 = i1 + this.c.b();
      i3 = j + this.c.f();
      if ((paramagr.j) && (this.o != -1) && (this.p != -2147483648))
      {
        localView1 = b(this.o);
        if (localView1 != null)
        {
          if (!this.d) {
            break label1803;
          }
          i38 = this.c.c() - this.c.b(localView1) - this.p;
          if (i38 <= 0) {
            break label1834;
          }
          i2 += i38;
        }
      }
      a(paramagl, paramagr, this.q);
      a(paramagl);
      if (!this.q.c) {
        break label1844;
      }
      aey localaey5 = this.q;
      e(localaey5.a, localaey5.b);
      this.a.h = i2;
      a(paramagl, this.a, paramagr, false);
      i32 = this.a.b;
      int i33 = this.a.d;
      if (this.a.c > 0) {
        i3 += this.a.c;
      }
      aey localaey6 = this.q;
      d(localaey6.a, localaey6.b);
      this.a.h = i3;
      afa localafa2 = this.a;
      localafa2.d += this.a.e;
      a(paramagl, this.a, paramagr, false);
      i34 = this.a.b;
      if (this.a.c <= 0) {
        break label2481;
      }
      int i36 = this.a.c;
      e(i33, i32);
      this.a.h = i36;
      a(paramagl, this.a, paramagr, false);
    }
    label644:
    label789:
    label939:
    label1200:
    label2481:
    for (int i35 = this.a.b;; i35 = i32)
    {
      int i6 = i35;
      int i4 = i34;
      int i8;
      int i9;
      if (l() > 0) {
        if (this.d)
        {
          int i26 = a(i4, paramagl, paramagr, true);
          int i27 = i6 + i26;
          int i28 = i4 + i26;
          int i29 = b(i27, paramagl, paramagr, false);
          int i30 = i27 + i29;
          int i31 = i28 + i29;
          i8 = i30;
          i9 = i31;
        }
      }
      for (;;)
      {
        if ((!paramagr.l) || (l() == 0) || (paramagr.j) || (!c()))
        {
          if (!paramagr.j)
          {
            this.o = -1;
            this.p = -2147483648;
            afs localafs = this.c;
            localafs.b = localafs.e();
          }
          this.k = false;
          this.e = null;
          return;
          i59 = 0;
          break;
          if ((this.o < 0) || (this.o >= paramagr.a()))
          {
            this.o = -1;
            this.p = -2147483648;
            i = 0;
            break label136;
          }
          localaey2.a = this.o;
          if (this.e != null)
          {
            int i58;
            if (this.e.a >= 0)
            {
              i58 = 1;
              label859:
              if (i58 == 0) {
                break label939;
              }
              localaey2.c = this.e.c;
              if (!localaey2.c) {
                break label916;
              }
            }
            for (localaey2.b = (this.c.c() - this.e.b);; localaey2.b = (this.c.b() + this.e.b))
            {
              i = 1;
              break;
              i58 = 0;
              break label859;
            }
          }
          View localView4;
          if (this.p == -2147483648)
          {
            localView4 = b(this.o);
            if (localView4 != null) {
              if (this.c.c(localView4) > this.c.e()) {
                localaey2.a();
              }
            }
          }
          for (;;)
          {
            i = 1;
            break;
            if (this.c.a(localView4) - this.c.b() < 0)
            {
              localaey2.b = this.c.b();
              localaey2.c = false;
            }
            else if (this.c.c() - this.c.b(localView4) < 0)
            {
              localaey2.b = this.c.c();
              localaey2.c = true;
            }
            else
            {
              if (localaey2.c) {}
              for (int i57 = this.c.b(localView4) + this.c.a();; i57 = this.c.a(localView4))
              {
                localaey2.b = i57;
                i = 1;
                break;
              }
              int i56;
              if (l() > 0)
              {
                int i55 = ((agi)d(0).getLayoutParams()).c.c();
                if (this.o >= i55) {
                  break label1194;
                }
                i56 = 1;
                if (i56 != this.d) {
                  break label1200;
                }
              }
              for (boolean bool = true;; bool = false)
              {
                localaey2.c = bool;
                localaey2.a();
                break;
                i56 = 0;
                break label1167;
              }
              localaey2.c = this.d;
              if (this.d) {
                localaey2.b = (this.c.c() - this.p);
              } else {
                localaey2.b = (this.c.b() + this.p);
              }
            }
          }
          label1262:
          View localView2 = this.g.getFocusedChild();
          if ((localView2 == null) || (this.f.c.contains(localView2)))
          {
            localObject = null;
            break label158;
          }
          localObject = localView2;
          break label158;
          i42 = 0;
          break label190;
          i43 = 0;
          break label224;
          localaey2.a = ((agi)((View)localObject).getLayoutParams()).c.c();
          if (localaey2.c)
          {
            int i50 = localaey2.d.c.c() - i44 - localaey2.d.c.b((View)localObject);
            localaey2.b = (localaey2.d.c.c() - i50);
            if (i50 <= 0) {
              break label254;
            }
            int i51 = localaey2.d.c.c((View)localObject);
            int i52 = localaey2.b - i51;
            int i53 = localaey2.d.c.b();
            int i54 = i52 - (i53 + Math.min(localaey2.d.c.a((View)localObject) - i53, 0));
            if (i54 >= 0) {
              break label254;
            }
            localaey2.b += Math.min(i50, -i54);
            break label254;
          }
          int i45 = localaey2.d.c.a((View)localObject);
          int i46 = i45 - localaey2.d.c.b();
          localaey2.b = i45;
          if (i46 <= 0) {
            break label254;
          }
          int i47 = i45 + localaey2.d.c.c((View)localObject);
          int i48 = localaey2.d.c.c() - i44 - localaey2.d.c.b((View)localObject);
          int i49 = localaey2.d.c.c() - Math.min(0, i48) - i47;
          if (i49 >= 0) {
            break label254;
          }
          localaey2.b -= Math.min(i46, -i49);
          break label254;
          label1633:
          if (this.k)
          {
            label1640:
            i39 = 0;
            break label257;
          }
          View localView3;
          label1662:
          int i40;
          if (localaey2.c)
          {
            localView3 = d(paramagl, paramagr);
            if (localView3 == null) {
              break label1773;
            }
            localaey2.a(localView3);
            if ((!paramagr.j) && (c()))
            {
              if ((this.c.a(localView3) < this.c.c()) && (this.c.b(localView3) >= this.c.b())) {
                break label1775;
              }
              i40 = 1;
              label1729:
              if (i40 != 0) {
                if (!localaey2.c) {
                  break label1781;
                }
              }
            }
          }
          label1773:
          label1775:
          label1781:
          for (int i41 = this.c.c();; i41 = this.c.b())
          {
            localaey2.b = i41;
            i39 = 1;
            break;
            localView3 = e(paramagl, paramagr);
            break label1662;
            break label1640;
            i40 = 0;
            break label1729;
          }
          i1 = j;
          j = 0;
          break label293;
          int i37 = this.c.a(localView1) - this.c.b();
          i38 = this.p - i37;
          break label387;
          i3 -= i38;
          break label399;
          label1844:
          aey localaey3 = this.q;
          d(localaey3.a, localaey3.b);
          this.a.h = i3;
          a(paramagl, this.a, paramagr, false);
          i4 = this.a.b;
          int i5 = this.a.d;
          if (this.a.c > 0) {
            i2 += this.a.c;
          }
          aey localaey4 = this.q;
          e(localaey4.a, localaey4.b);
          this.a.h = i2;
          afa localafa1 = this.a;
          localafa1.d += this.a.e;
          a(paramagl, this.a, paramagr, false);
          i6 = this.a.b;
          if (this.a.c <= 0) {
            break label644;
          }
          int i7 = this.a.c;
          d(i5, i4);
          this.a.h = i7;
          a(paramagl, this.a, paramagr, false);
          i4 = this.a.b;
          break label644;
          int i20 = b(i6, paramagl, paramagr, true);
          int i21 = i6 + i20;
          int i22 = i4 + i20;
          int i23 = a(i22, paramagl, paramagr, false);
          int i24 = i21 + i23;
          int i25 = i22 + i23;
          i8 = i24;
          i9 = i25;
          continue;
        }
        int i10 = 0;
        int i11 = 0;
        List localList = paramagl.d;
        int i12 = localList.size();
        int i13 = ((agi)d(0).getLayoutParams()).c.c();
        int i14 = 0;
        label2163:
        agt localagt;
        int i15;
        int i18;
        int i19;
        label2228:
        int i17;
        int i16;
        if (i14 < i12)
        {
          localagt = (agt)localList.get(i14);
          if ((0x8 & localagt.i) != 0)
          {
            i15 = 1;
            if (i15 != 0) {
              break label2459;
            }
            if (localagt.c() >= i13) {
              break label2275;
            }
            i18 = 1;
            if (i18 == this.d) {
              break label2281;
            }
            i19 = -1;
            if (i19 != -1) {
              break label2287;
            }
            i17 = i10 + this.c.c(localagt.a);
            i16 = i11;
          }
        }
        for (;;)
        {
          i14++;
          i10 = i17;
          i11 = i16;
          break label2163;
          i15 = 0;
          break label2198;
          label2275:
          i18 = 0;
          break label2216;
          label2281:
          i19 = 1;
          break label2228;
          label2287:
          i16 = i11 + this.c.c(localagt.a);
          i17 = i10;
          continue;
          this.a.j = localList;
          if (i10 > 0)
          {
            e(((agi)t().getLayoutParams()).c.c(), i8);
            this.a.h = i10;
            this.a.c = 0;
            this.a.a(null);
            a(paramagl, this.a, paramagr, false);
          }
          if (i11 > 0)
          {
            d(((agi)u().getLayoutParams()).c.c(), i9);
            this.a.h = i11;
            this.a.c = 0;
            this.a.a(null);
            a(paramagl, this.a, paramagr, false);
          }
          this.a.j = null;
          break;
          i16 = i11;
          i17 = i10;
        }
        i8 = i6;
        i9 = i4;
      }
    }
  }
  
  public boolean c()
  {
    return (this.e == null) && (!this.k);
  }
  
  public final int d(agr paramagr)
  {
    return i(paramagr);
  }
  
  public final Parcelable d()
  {
    if (this.e != null) {
      return new afb(this.e);
    }
    afb localafb = new afb();
    if (l() > 0)
    {
      h();
      boolean bool = this.k ^ this.d;
      localafb.c = bool;
      if (bool)
      {
        View localView2 = u();
        localafb.b = (this.c.c() - this.c.b(localView2));
        localafb.a = ((agi)localView2.getLayoutParams()).c.c();
      }
    }
    for (;;)
    {
      return localafb;
      View localView1 = t();
      localafb.a = ((agi)localView1.getLayoutParams()).c.c();
      localafb.b = (this.c.a(localView1) - this.c.b());
      continue;
      localafb.a = -1;
    }
  }
  
  public final int e(agr paramagr)
  {
    return j(paramagr);
  }
  
  public final boolean e()
  {
    return this.b == 0;
  }
  
  public final int f(agr paramagr)
  {
    return j(paramagr);
  }
  
  public final boolean f()
  {
    return this.b == 1;
  }
  
  protected final boolean g()
  {
    RecyclerView localRecyclerView = this.g;
    return nj.a.t(localRecyclerView) == 1;
  }
  
  final void h()
  {
    if (this.a == null) {
      this.a = new afa();
    }
    if (this.c == null) {
      this.c = afs.a(this, this.b);
    }
  }
  
  public final int i()
  {
    View localView = a(0, l(), false, true);
    if (localView == null) {
      return -1;
    }
    return ((agi)localView.getLayoutParams()).c.c();
  }
  
  public final int j()
  {
    View localView = a(-1 + l(), -1, true, false);
    if (localView == null) {
      return -1;
    }
    return ((agi)localView.getLayoutParams()).c.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aew
 * JD-Core Version:    0.7.0.1
 */