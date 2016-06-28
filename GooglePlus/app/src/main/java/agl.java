import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class agl
{
  public final ArrayList<agt> a = new ArrayList();
  public ArrayList<agt> b = null;
  public final ArrayList<agt> c = new ArrayList();
  final List<agt> d = Collections.unmodifiableList(this.a);
  private int f = 2;
  private agk g;
  
  public agl(RecyclerView paramRecyclerView) {}
  
  private void c(agt paramagt)
  {
    View localView = paramagt.a;
    nj.a.a(localView, null);
    if (RecyclerView.c(this.e) != null) {
      RecyclerView.c(this.e);
    }
    if (this.e.g != null) {
      this.e.g.a(paramagt);
    }
    if (this.e.y != null) {
      this.e.y.a(paramagt);
    }
    paramagt.o = null;
    agk localagk = b();
    int i = paramagt.e;
    ArrayList localArrayList = (ArrayList)localagk.a.get(i);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      localagk.a.put(i, localArrayList);
      if (localagk.b.indexOfKey(i) < 0) {
        localagk.b.put(i, 5);
      }
    }
    if (localagk.b.get(i) > localArrayList.size())
    {
      paramagt.g();
      localArrayList.add(paramagt);
    }
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.e.y.a())) {
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + this.e.y.a());
    }
    if (!this.e.y.j) {
      return paramInt;
    }
    return this.e.c.b(paramInt);
  }
  
  final agt a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.a.size();
    agt localagt1;
    label133:
    label139:
    label145:
    for (int j = 0; j < i; j++)
    {
      localagt1 = (agt)this.a.get(j);
      int i4;
      int i5;
      if ((0x20 & localagt1.i) != 0)
      {
        i4 = 1;
        if ((i4 != 0) || (localagt1.c() != paramInt1)) {
          continue;
        }
        if ((0x4 & localagt1.i) == 0) {
          break label133;
        }
        i5 = 1;
        label74:
        if (i5 != 0) {
          continue;
        }
        if (!this.e.y.j) {
          if ((0x8 & localagt1.i) == 0) {
            break label139;
          }
        }
      }
      for (int i6 = 1;; i6 = 0)
      {
        if (i6 != 0) {
          break label145;
        }
        localagt1.i = (0x20 | localagt1.i);
        return localagt1;
        i4 = 0;
        break;
        i5 = 0;
        break label74;
      }
    }
    int i2;
    label179:
    View localView;
    int i3;
    if (!paramBoolean)
    {
      aea localaea = this.e.d;
      int i1 = localaea.c.size();
      i2 = 0;
      if (i2 >= i1) {
        break label355;
      }
      localView = (View)localaea.c.get(i2);
      agt localagt2 = localaea.a.b(localView);
      if (localagt2.c() != paramInt1) {
        break label349;
      }
      if ((0x4 & localagt2.i) == 0) {
        break label343;
      }
      i3 = 1;
      label237:
      if (i3 != 0) {
        break label349;
      }
      label242:
      if (localView != null) {
        this.e.w.c(this.e.a(localView));
      }
    }
    int k = this.c.size();
    label343:
    label349:
    label355:
    label367:
    for (int m = 0;; m++)
    {
      if (m >= k) {
        break label373;
      }
      localagt1 = (agt)this.c.get(m);
      if ((0x4 & localagt1.i) != 0) {}
      for (int n = 1;; n = 0)
      {
        if ((n != 0) || (localagt1.c() != paramInt1)) {
          break label367;
        }
        if (paramBoolean) {
          break;
        }
        this.c.remove(m);
        return localagt1;
        i3 = 0;
        break label237;
        i2++;
        break label179;
        localView = null;
        break label242;
      }
    }
    label373:
    return null;
  }
  
  final agt a(long paramLong, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    agt localagt;
    for (int j = -1 + this.a.size(); j >= 0; j--)
    {
      localagt = (agt)this.a.get(j);
      if (localagt.d == paramLong)
      {
        int m;
        if ((0x20 & localagt.i) != 0)
        {
          m = i;
          if (m != 0) {
            continue;
          }
          if (paramInt != localagt.e) {
            break label137;
          }
          localagt.i = (0x20 | localagt.i);
          if ((0x8 & localagt.i) == 0) {
            break label131;
          }
        }
        for (;;)
        {
          if ((i != 0) && (!this.e.y.j)) {
            localagt.a(2, 14);
          }
          return localagt;
          m = 0;
          break;
          label131:
          i = 0;
        }
        label137:
        if (!paramBoolean)
        {
          this.a.remove(j);
          this.e.removeDetachedView(localagt.a, false);
          b(localagt.a);
        }
      }
    }
    for (int k = -1 + this.c.size();; k--)
    {
      if (k < 0) {
        break label264;
      }
      localagt = (agt)this.c.get(k);
      if (localagt.d == paramLong)
      {
        if (paramInt == localagt.e)
        {
          if (paramBoolean) {
            break;
          }
          this.c.remove(k);
          return localagt;
        }
        if (!paramBoolean) {
          b(k);
        }
      }
    }
    label264:
    return null;
  }
  
  public final void a()
  {
    for (int i = -1 + this.c.size(); i >= 0; i--) {
      b(i);
    }
    this.c.clear();
  }
  
  public final void a(agt paramagt)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label46:
    StringBuilder localStringBuilder2;
    if (paramagt.m != null)
    {
      bool2 = bool1;
      if ((!bool2) && (paramagt.a.getParent() == null)) {
        break label103;
      }
      StringBuilder localStringBuilder1 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
      if (paramagt.m == null) {
        break label92;
      }
      bool3 = bool1;
      localStringBuilder2 = localStringBuilder1.append(bool3).append(" isAttached:");
      if (paramagt.a.getParent() == null) {
        break label98;
      }
    }
    for (;;)
    {
      throw new IllegalArgumentException(bool1);
      bool2 = false;
      break;
      label92:
      bool3 = false;
      break label46;
      label98:
      bool1 = false;
    }
    label103:
    if (paramagt.e()) {
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramagt);
    }
    if (paramagt.a()) {
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    }
    boolean bool4;
    boolean bool7;
    label224:
    boolean bool8;
    label278:
    boolean bool6;
    boolean bool5;
    if ((0x10 & paramagt.i) == 0)
    {
      View localView = paramagt.a;
      if (nj.a.k(localView))
      {
        bool4 = bool1;
        if (((this.e.g != null) && (bool4)) && (!paramagt.h())) {
          break label355;
        }
        if ((0x4E & paramagt.i) == 0) {
          break label333;
        }
        bool7 = bool1;
        if (bool7) {
          break label349;
        }
        int i = this.c.size();
        if ((i == this.f) && (i > 0)) {
          b(0);
        }
        if (i >= this.f) {
          break label349;
        }
        this.c.add(paramagt);
        bool8 = bool1;
        if (bool8) {
          break label339;
        }
        c(paramagt);
        bool6 = bool1;
        bool5 = bool8;
      }
    }
    for (;;)
    {
      this.e.y.a(paramagt);
      if ((!bool5) && (!bool6) && (bool4)) {
        paramagt.o = null;
      }
      return;
      bool4 = false;
      break;
      label333:
      bool7 = false;
      break label224;
      label339:
      bool5 = bool8;
      bool6 = false;
      continue;
      label349:
      bool8 = false;
      break label278;
      label355:
      bool5 = false;
      bool6 = false;
    }
  }
  
  public final void a(View paramView)
  {
    int i = 1;
    agt localagt = RecyclerView.b(paramView);
    if (localagt.e()) {
      this.e.removeDetachedView(paramView, false);
    }
    int j;
    if (localagt.m != null)
    {
      j = i;
      if (j == 0) {
        break label58;
      }
      localagt.m.b(localagt);
    }
    label58:
    label89:
    for (;;)
    {
      a(localagt);
      return;
      j = 0;
      break;
      if ((0x20 & localagt.i) != 0) {}
      for (;;)
      {
        if (i == 0) {
          break label89;
        }
        localagt.i = (0xFFFFFFDF & localagt.i);
        break;
        i = 0;
      }
    }
  }
  
  final void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = -1 + paramViewGroup.getChildCount(); i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, true);
      }
    }
    if (!paramBoolean) {
      return;
    }
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    int j = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(j);
  }
  
  public final agk b()
  {
    if (this.g == null) {
      this.g = new agk();
    }
    return this.g;
  }
  
  public final void b(int paramInt)
  {
    c((agt)this.c.get(paramInt));
    this.c.remove(paramInt);
  }
  
  public final void b(agt paramagt)
  {
    int i;
    if ((0x40 & paramagt.i) != 0)
    {
      i = 1;
      if ((i != 0) && (this.e.h()) && (this.b != null)) {
        break label64;
      }
      this.a.remove(paramagt);
    }
    for (;;)
    {
      paramagt.m = null;
      paramagt.i = (0xFFFFFFDF & paramagt.i);
      return;
      i = 0;
      break;
      label64:
      this.b.remove(paramagt);
    }
  }
  
  final void b(View paramView)
  {
    agt localagt = RecyclerView.b(paramView);
    localagt.m = null;
    localagt.i = (0xFFFFFFDF & localagt.i);
    a(localagt);
  }
  
  final agt c(int paramInt)
  {
    int i;
    if (this.b != null)
    {
      i = this.b.size();
      if (i != 0) {}
    }
    else
    {
      return null;
    }
    for (int j = 0; j < i; j++)
    {
      agt localagt2 = (agt)this.b.get(j);
      if ((0x20 & localagt2.i) != 0) {}
      for (int i1 = 1; (i1 == 0) && (localagt2.c() == paramInt); i1 = 0)
      {
        localagt2.i = (0x20 | localagt2.i);
        return localagt2;
      }
    }
    if (this.e.g.b)
    {
      int k = this.e.c.b(paramInt);
      if ((k > 0) && (k < this.e.g.a()))
      {
        long l = this.e.g.b(k);
        for (int m = 0; m < i; m++)
        {
          agt localagt1 = (agt)this.b.get(m);
          if ((0x20 & localagt1.i) != 0) {}
          for (int n = 1; (n == 0) && (localagt1.d == l); n = 0)
          {
            localagt1.i = (0x20 | localagt1.i);
            return localagt1;
          }
        }
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agl
 * JD-Core Version:    0.7.0.1
 */