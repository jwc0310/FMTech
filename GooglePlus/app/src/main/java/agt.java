import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class agt
{
  static final List<Object> j = Collections.EMPTY_LIST;
  public final View a;
  public int b = -1;
  public int c = -1;
  public long d = -1L;
  public int e = -1;
  public int f = -1;
  public agt g = null;
  public agt h = null;
  public int i;
  List<Object> k = null;
  List<Object> l = null;
  agl m = null;
  int n = 0;
  RecyclerView o;
  private int p = 0;
  
  public agt(View paramView)
  {
    if (paramView == null) {
      throw new IllegalArgumentException("itemView may not be null");
    }
    this.a = paramView;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    this.i = (this.i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (this.c == -1) {
      this.c = this.b;
    }
    if (this.f == -1) {
      this.f = this.b;
    }
    if (paramBoolean) {
      this.f = (paramInt + this.f);
    }
    this.b = (paramInt + this.b);
    if (this.a.getLayoutParams() != null) {
      ((agi)this.a.getLayoutParams()).e = true;
    }
  }
  
  public final void a(Object paramObject)
  {
    if (paramObject == null) {
      this.i = (0x400 | this.i);
    }
    while ((0x400 & this.i) != 0) {
      return;
    }
    if (this.k == null)
    {
      this.k = new ArrayList();
      this.l = Collections.unmodifiableList(this.k);
    }
    this.k.add(paramObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = -1 + this.p;
      this.p = i1;
      if (this.p >= 0) {
        break label61;
      }
      this.p = 0;
      Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }
    label61:
    do
    {
      return;
      i1 = 1 + this.p;
      break;
      if ((!paramBoolean) && (this.p == 1))
      {
        this.i = (0x10 | this.i);
        return;
      }
    } while ((!paramBoolean) || (this.p != 0));
    this.i = (0xFFFFFFEF & this.i);
  }
  
  public final boolean a()
  {
    return (0x80 & this.i) != 0;
  }
  
  @Deprecated
  public final int b()
  {
    if (this.f == -1) {
      return this.b;
    }
    return this.f;
  }
  
  public final int c()
  {
    if (this.f == -1) {
      return this.b;
    }
    return this.f;
  }
  
  public final int d()
  {
    int i1 = 1;
    if (this.o == null) {}
    label29:
    label61:
    label63:
    label66:
    for (;;)
    {
      return -1;
      RecyclerView localRecyclerView = this.o;
      int i2;
      if ((0x20C & this.i) != 0)
      {
        i2 = i1;
        if (i2 != 0) {
          break label61;
        }
        if ((0x1 & this.i) == 0) {
          break label63;
        }
      }
      for (;;)
      {
        if (i1 == 0) {
          break label66;
        }
        return localRecyclerView.c.c(this.b);
        i2 = 0;
        break label29;
        break;
        i1 = 0;
      }
    }
  }
  
  public final boolean e()
  {
    return (0x100 & this.i) != 0;
  }
  
  final void f()
  {
    if (this.k != null) {
      this.k.clear();
    }
    this.i = (0xFFFFFBFF & this.i);
  }
  
  final void g()
  {
    this.i = 0;
    this.b = -1;
    this.c = -1;
    this.d = -1L;
    this.f = -1;
    this.p = 0;
    this.g = null;
    this.h = null;
    f();
    this.n = 0;
  }
  
  public final boolean h()
  {
    if ((0x10 & this.i) == 0)
    {
      View localView = this.a;
      if (!nj.a.k(localView)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
    int i1;
    int i2;
    label109:
    int i3;
    label132:
    int i4;
    label156:
    int i5;
    label181:
    int i6;
    if (this.m != null)
    {
      i1 = 1;
      if (i1 != 0) {
        localStringBuilder.append(" scrap");
      }
      if ((0x4 & this.i) == 0) {
        break label362;
      }
      i2 = 1;
      if (i2 != 0) {
        localStringBuilder.append(" invalid");
      }
      if ((0x1 & this.i) == 0) {
        break label367;
      }
      i3 = 1;
      if (i3 == 0) {
        localStringBuilder.append(" unbound");
      }
      if ((0x2 & this.i) == 0) {
        break label373;
      }
      i4 = 1;
      if (i4 != 0) {
        localStringBuilder.append(" update");
      }
      if ((0x8 & this.i) == 0) {
        break label379;
      }
      i5 = 1;
      if (i5 != 0) {
        localStringBuilder.append(" removed");
      }
      if (a()) {
        localStringBuilder.append(" ignored");
      }
      if ((0x40 & this.i) == 0) {
        break label385;
      }
      i6 = 1;
      label220:
      if (i6 != 0) {
        localStringBuilder.append(" changed");
      }
      if (e()) {
        localStringBuilder.append(" tmpDetached");
      }
      if (!h()) {
        localStringBuilder.append(" not recyclable(" + this.p + ")");
      }
      if ((0x200 & this.i) == 0) {
        if ((0x4 & this.i) == 0) {
          break label391;
        }
      }
    }
    label385:
    label391:
    for (int i8 = 1;; i8 = 0)
    {
      int i7 = 0;
      if (i8 != 0) {
        i7 = 1;
      }
      if (i7 != 0) {
        localStringBuilder.append("undefined adapter position");
      }
      if (this.a.getParent() == null) {
        localStringBuilder.append(" no parent");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      i1 = 0;
      break;
      label362:
      i2 = 0;
      break label109;
      label367:
      i3 = 0;
      break label132;
      label373:
      i4 = 0;
      break label156;
      label379:
      i5 = 0;
      break label181;
      i6 = 0;
      break label220;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agt
 * JD-Core Version:    0.7.0.1
 */