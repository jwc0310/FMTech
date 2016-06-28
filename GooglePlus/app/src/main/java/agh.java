import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class agh
{
  public aea f;
  public RecyclerView g;
  public agp h;
  public boolean i = false;
  public boolean j = false;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int k = 1073741824;
    int m = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean) {
      if (paramInt3 < 0) {}
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, k);
      k = 0;
      paramInt3 = 0;
      continue;
      if (paramInt3 < 0) {
        if (paramInt3 == -1)
        {
          paramInt3 = m;
        }
        else if (paramInt3 == -2)
        {
          k = -2147483648;
          paramInt3 = m;
        }
        else
        {
          k = 0;
          paramInt3 = 0;
        }
      }
    }
  }
  
  public static int a(View paramView)
  {
    Rect localRect = ((agi)paramView.getLayoutParams()).d;
    return paramView.getMeasuredWidth() + localRect.left + localRect.right;
  }
  
  private void a(int paramInt)
  {
    if (d(paramInt) != null)
    {
      aea localaea = this.f;
      int k = localaea.a(paramInt);
      View localView = localaea.a.b(k);
      if (localView != null)
      {
        if (localaea.b.c(k)) {
          localaea.b(localView);
        }
        localaea.a.a(k);
      }
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((agi)paramView.getLayoutParams()).d;
    paramView.layout(paramInt1 + localRect.left, paramInt2 + localRect.top, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }
  
  public static int b(View paramView)
  {
    Rect localRect = ((agi)paramView.getLayoutParams()).d;
    return paramView.getMeasuredHeight() + localRect.top + localRect.bottom;
  }
  
  private void h(int paramInt)
  {
    d(paramInt);
    aea localaea = this.f;
    int k = localaea.a(paramInt);
    localaea.b.c(k);
    localaea.a.c(k);
  }
  
  public int a(int paramInt, agl paramagl, agr paramagr)
  {
    return 0;
  }
  
  public int a(agl paramagl, agr paramagr)
  {
    if ((this.g == null) || (this.g.g == null)) {}
    while (!f()) {
      return 1;
    }
    return this.g.g.a();
  }
  
  public int a(agr paramagr)
  {
    return 0;
  }
  
  public agi a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new agi(paramContext, paramAttributeSet);
  }
  
  public agi a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof agi)) {
      return new agi((agi)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new agi((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new agi(paramLayoutParams);
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public final void a(int paramInt, agl paramagl)
  {
    View localView = d(paramInt);
    a(paramInt);
    paramagl.a(localView);
  }
  
  public final void a(agl paramagl)
  {
    int k = -1 + l();
    if (k >= 0)
    {
      View localView = d(k);
      agt localagt1 = RecyclerView.b(localView);
      int m;
      label44:
      int i3;
      label63:
      int i4;
      if (!localagt1.a())
      {
        if ((0x4 & localagt1.i) == 0) {
          break label117;
        }
        m = 1;
        if (m == 0) {
          break label135;
        }
        if ((0x8 & localagt1.i) == 0) {
          break label123;
        }
        i3 = 1;
        if (i3 != 0) {
          break label135;
        }
        if ((0x40 & localagt1.i) == 0) {
          break label129;
        }
        i4 = 1;
        label82:
        if ((i4 != 0) || (this.g.g.b)) {
          break label135;
        }
        a(k);
        paramagl.a(localagt1);
      }
      for (;;)
      {
        k--;
        break;
        label117:
        m = 0;
        break label44;
        label123:
        i3 = 0;
        break label63;
        label129:
        i4 = 0;
        break label82;
        label135:
        h(k);
        agt localagt2 = RecyclerView.b(localView);
        localagt2.m = paramagl;
        int n;
        int i1;
        if ((0x40 & localagt2.i) != 0)
        {
          n = 1;
          if ((n != 0) && (paramagl.e.h())) {
            break label272;
          }
          if ((0x4 & localagt2.i) == 0) {
            break label247;
          }
          i1 = 1;
          label194:
          if (i1 == 0) {
            break label259;
          }
          if ((0x8 & localagt2.i) == 0) {
            break label253;
          }
        }
        label247:
        label253:
        for (int i2 = 1;; i2 = 0)
        {
          if ((i2 != 0) || (paramagl.e.g.b)) {
            break label259;
          }
          throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          n = 0;
          break;
          i1 = 0;
          break label194;
        }
        label259:
        paramagl.a.add(localagt2);
        continue;
        label272:
        if (paramagl.b == null) {
          paramagl.b = new ArrayList();
        }
        paramagl.b.add(localagt2);
      }
    }
  }
  
  public void a(agl paramagl, agr paramagr, View paramView, pr parampr)
  {
    int k;
    if (f())
    {
      k = ((agi)paramView.getLayoutParams()).c.c();
      if (!e()) {
        break label67;
      }
    }
    label67:
    for (int m = ((agi)paramView.getLayoutParams()).c.c();; m = 0)
    {
      parampr.a(qa.a(k, 1, m, 1, false, false));
      return;
      k = 0;
      break;
    }
  }
  
  public final void a(agp paramagp)
  {
    if ((this.h != null) && (paramagp != this.h) && (this.h.e)) {
      this.h.b();
    }
    this.h = paramagp;
    agp localagp = this.h;
    localagp.b = this.g;
    localagp.c = this;
    if (localagp.a == -1) {
      throw new IllegalArgumentException("Invalid target position");
    }
    localagp.b.y.a = localagp.a;
    localagp.e = true;
    localagp.d = true;
    int k = localagp.a;
    localagp.f = localagp.b.h.b(k);
    localagp.b.x.a();
  }
  
  public void a(Parcelable paramParcelable) {}
  
  public final void a(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.g = null;
      this.f = null;
      return;
    }
    this.g = paramRecyclerView;
    this.f = paramRecyclerView.d;
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt)
  {
    Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void a(RecyclerView paramRecyclerView, agl paramagl) {}
  
  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    agt localagt1 = RecyclerView.b(paramView);
    boolean bool5;
    label44:
    agi localagi1;
    boolean bool2;
    label68:
    boolean bool3;
    if (!paramBoolean)
    {
      if ((0x8 & localagt1.i) != 0)
      {
        bool5 = bool1;
        if (!bool5) {
          break label156;
        }
      }
    }
    else
    {
      this.g.y.a(paramView);
      localagi1 = (agi)paramView.getLayoutParams();
      if ((0x20 & localagt1.i) == 0) {
        break label176;
      }
      bool2 = bool1;
      if (!bool2)
      {
        if (localagt1.m == null) {
          break label182;
        }
        bool3 = bool1;
        label85:
        if (!bool3) {
          break label210;
        }
      }
      if (localagt1.m == null) {
        break label188;
      }
      label98:
      if (!bool1) {
        break label194;
      }
      localagt1.m.b(localagt1);
      label113:
      this.f.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    label156:
    label176:
    label182:
    label188:
    label194:
    label458:
    for (;;)
    {
      if (localagi1.f)
      {
        localagt1.a.invalidate();
        localagi1.f = false;
      }
      return;
      bool5 = false;
      break;
      this.g.y.e.remove(paramView);
      break label44;
      bool2 = false;
      break label68;
      bool3 = false;
      break label85;
      bool1 = false;
      break label98;
      localagt1.i = (0xFFFFFFDF & localagt1.i);
      break label113;
      label210:
      if (paramView.getParent() == this.g)
      {
        aea localaea1 = this.f;
        int k = localaea1.a.a(paramView);
        int m;
        if (k == -1) {
          m = -1;
        }
        for (;;)
        {
          if (paramInt == -1) {
            paramInt = this.f.a();
          }
          if (m != -1) {
            break;
          }
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.g.indexOfChild(paramView));
          if (localaea1.b.b(k)) {
            m = -1;
          } else {
            m = k - localaea1.b.d(k);
          }
        }
        if (m != paramInt)
        {
          agh localagh = this.g.h;
          View localView = localagh.d(m);
          if (localView == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + m);
          }
          localagh.d(m);
          localagh.f.c(m);
          agi localagi2 = (agi)localView.getLayoutParams();
          agt localagt2 = RecyclerView.b(localView);
          boolean bool4;
          aea localaea2;
          if ((0x8 & localagt2.i) != 0)
          {
            bool4 = bool1;
            if (!bool4) {
              break label497;
            }
            localagh.g.y.a(localView);
            localaea2 = localagh.f;
            if ((0x8 & localagt2.i) == 0) {
              break label519;
            }
          }
          for (;;)
          {
            localaea2.a(localView, paramInt, localagi2, bool1);
            break;
            bool4 = false;
            break label440;
            label497:
            localagh.g.y.e.remove(localView);
            break label458;
            bool1 = false;
          }
        }
      }
      else
      {
        this.f.a(paramView, paramInt, false);
        localagi1.e = bool1;
        if ((this.h != null) && (this.h.e))
        {
          agp localagp = this.h;
          if (RecyclerView.d(paramView) == localagp.a) {
            localagp.f = paramView;
          }
        }
      }
    }
  }
  
  public final void a(View paramView, agl paramagl)
  {
    aea localaea = this.f;
    int k = localaea.a.a(paramView);
    if (k >= 0)
    {
      if (localaea.b.c(k)) {
        localaea.b(paramView);
      }
      localaea.a.a(k);
    }
    paramagl.a(paramView);
  }
  
  public final void a(View paramView, Rect paramRect)
  {
    if (this.g == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(this.g.e(paramView));
  }
  
  final void a(View paramView, pr parampr)
  {
    agt localagt = RecyclerView.b(paramView);
    if (localagt != null) {
      if ((0x8 & localagt.i) == 0) {
        break label75;
      }
    }
    label75:
    for (int k = 1;; k = 0)
    {
      if (k == 0)
      {
        aea localaea = this.f;
        View localView = localagt.a;
        if (!localaea.c.contains(localView)) {
          a(this.g.b, this.g.y, paramView, parampr);
        }
      }
      return;
    }
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int k = 1;
    qj localqj = pl.a(paramAccessibilityEvent);
    if (this.g == null) {
      return;
    }
    RecyclerView localRecyclerView1 = this.g;
    if (!nj.a.b(localRecyclerView1, k))
    {
      RecyclerView localRecyclerView2 = this.g;
      if (!nj.a.b(localRecyclerView2, -1))
      {
        RecyclerView localRecyclerView3 = this.g;
        if (!nj.a.a(localRecyclerView3, -1))
        {
          RecyclerView localRecyclerView4 = this.g;
          if (!nj.a.a(localRecyclerView4, k)) {
            break label152;
          }
        }
      }
    }
    for (;;)
    {
      qj.a.a(localqj.b, k);
      if (this.g.g == null) {
        break;
      }
      int n = this.g.g.a();
      qj.a.b(localqj.b, n);
      return;
      label152:
      int m = 0;
    }
  }
  
  public void a(String paramString)
  {
    if (this.g != null) {
      this.g.a(paramString);
    }
  }
  
  public boolean a(agi paramagi)
  {
    return paramagi != null;
  }
  
  public final boolean a(Runnable paramRunnable)
  {
    if (this.g != null) {
      return this.g.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public int b(int paramInt, agl paramagl, agr paramagr)
  {
    return 0;
  }
  
  public int b(agl paramagl, agr paramagr)
  {
    if ((this.g == null) || (this.g.g == null)) {}
    while (!e()) {
      return 1;
    }
    return this.g.g.a();
  }
  
  public int b(agr paramagr)
  {
    return 0;
  }
  
  public abstract agi b();
  
  public View b(int paramInt)
  {
    int k = l();
    for (int m = 0; m < k; m++)
    {
      View localView = d(m);
      agt localagt = RecyclerView.b(localView);
      if ((localagt != null) && (localagt.c() == paramInt) && (!localagt.a()))
      {
        if (!this.g.y.j) {
          if ((0x8 & localagt.i) == 0) {
            break label83;
          }
        }
        label83:
        for (int n = 1; n == 0; n = 0) {
          return localView;
        }
      }
    }
    return null;
  }
  
  public void b(int paramInt1, int paramInt2) {}
  
  public final void b(agl paramagl)
  {
    int k = paramagl.a.size();
    for (int m = k - 1; m >= 0; m--)
    {
      View localView = ((agt)paramagl.a.get(m)).a;
      agt localagt = RecyclerView.b(localView);
      if (!localagt.a())
      {
        localagt.a(false);
        if (localagt.e()) {
          this.g.removeDetachedView(localView, false);
        }
        if (this.g.w != null) {
          this.g.w.c(localagt);
        }
        localagt.a(true);
        paramagl.b(localView);
      }
    }
    paramagl.a.clear();
    if (k > 0) {
      this.g.invalidate();
    }
  }
  
  public int c(agr paramagr)
  {
    return 0;
  }
  
  public final int c(View paramView)
  {
    return paramView.getTop() - ((agi)paramView.getLayoutParams()).d.top;
  }
  
  public View c(int paramInt, agl paramagl, agr paramagr)
  {
    return null;
  }
  
  public void c(int paramInt) {}
  
  public void c(int paramInt1, int paramInt2) {}
  
  public final void c(agl paramagl)
  {
    for (int k = -1 + l(); k >= 0; k--) {
      if (!RecyclerView.b(d(k)).a()) {
        a(k, paramagl);
      }
    }
  }
  
  public void c(agl paramagl, agr paramagr)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int d(agr paramagr)
  {
    return 0;
  }
  
  public final int d(View paramView)
  {
    return paramView.getBottom() + ((agi)paramView.getLayoutParams()).d.bottom;
  }
  
  public Parcelable d()
  {
    return null;
  }
  
  public final View d(int paramInt)
  {
    if (this.f != null) {
      return this.f.b(paramInt);
    }
    return null;
  }
  
  public int e(agr paramagr)
  {
    return 0;
  }
  
  public void e(int paramInt)
  {
    if (this.g != null)
    {
      RecyclerView localRecyclerView = this.g;
      int k = localRecyclerView.d.a();
      for (int m = 0; m < k; m++) {
        localRecyclerView.d.b(m).offsetLeftAndRight(paramInt);
      }
    }
  }
  
  public boolean e()
  {
    return false;
  }
  
  public int f(agr paramagr)
  {
    return 0;
  }
  
  public void f(int paramInt)
  {
    if (this.g != null)
    {
      RecyclerView localRecyclerView = this.g;
      int k = localRecyclerView.d.a();
      for (int m = 0; m < k; m++) {
        localRecyclerView.d.b(m).offsetTopAndBottom(paramInt);
      }
    }
  }
  
  public boolean f()
  {
    return false;
  }
  
  public void g(int paramInt) {}
  
  public final boolean k()
  {
    return (this.h != null) && (this.h.e);
  }
  
  public final int l()
  {
    if (this.f != null) {
      return this.f.a();
    }
    return 0;
  }
  
  public final int m()
  {
    if (this.g != null) {
      return this.g.getWidth();
    }
    return 0;
  }
  
  public final int n()
  {
    if (this.g != null) {
      return this.g.getHeight();
    }
    return 0;
  }
  
  public final int o()
  {
    if (this.g != null) {
      return this.g.getPaddingLeft();
    }
    return 0;
  }
  
  public final int p()
  {
    if (this.g != null) {
      return this.g.getPaddingTop();
    }
    return 0;
  }
  
  public final int q()
  {
    if (this.g != null) {
      return this.g.getPaddingRight();
    }
    return 0;
  }
  
  public final int r()
  {
    if (this.g != null) {
      return this.g.getPaddingBottom();
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agh
 * JD-Core Version:    0.7.0.1
 */