import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class acz
{
  public acz(RecyclerView paramRecyclerView) {}
  
  public agt a(int paramInt)
  {
    RecyclerView localRecyclerView = this.a;
    int i = localRecyclerView.d.a.a();
    int j = 0;
    agt localagt;
    int k;
    if (j < i)
    {
      localagt = RecyclerView.b(localRecyclerView.d.a.b(j));
      if (localagt != null) {
        if ((0x8 & localagt.i) != 0)
        {
          k = 1;
          label61:
          if ((k != 0) || (localagt.b != paramInt)) {
            break label88;
          }
          label75:
          if (localagt != null) {
            break label100;
          }
        }
      }
    }
    label88:
    label100:
    aea localaea;
    View localView;
    do
    {
      return null;
      k = 0;
      break label61;
      j++;
      break;
      localagt = null;
      break label75;
      localaea = this.a.d;
      localView = localagt.a;
    } while (localaea.c.contains(localView));
    return localagt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.A = true;
    agr localagr = this.a.y;
    localagr.h = (paramInt2 + localagr.h);
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    RecyclerView localRecyclerView = this.a;
    int i = localRecyclerView.d.a.a();
    int j = paramInt1 + paramInt2;
    for (int k = 0; k < i; k++)
    {
      View localView = localRecyclerView.d.a.b(k);
      agt localagt2 = RecyclerView.b(localView);
      if ((localagt2 != null) && (!localagt2.a()) && (localagt2.b >= paramInt1) && (localagt2.b < j))
      {
        localagt2.i = (0x2 | localagt2.i);
        localagt2.a(paramObject);
        if (localRecyclerView.h()) {
          localagt2.i = (0x40 | localagt2.i);
        }
        ((agi)localView.getLayoutParams()).e = true;
      }
    }
    agl localagl = localRecyclerView.b;
    int m = paramInt1 + paramInt2;
    for (int n = -1 + localagl.c.size(); n >= 0; n--)
    {
      agt localagt1 = (agt)localagl.c.get(n);
      if (localagt1 != null)
      {
        int i1 = localagt1.c();
        if ((i1 >= paramInt1) && (i1 < m))
        {
          localagt1.i = (0x2 | localagt1.i);
          localagl.b(n);
        }
      }
    }
    this.a.B = true;
  }
  
  public void a(ada paramada)
  {
    c(paramada);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.A = true;
  }
  
  public void b(ada paramada)
  {
    c(paramada);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.a;
    int i = localRecyclerView.d.a.a();
    for (int j = 0; j < i; j++)
    {
      agt localagt2 = RecyclerView.b(localRecyclerView.d.a.b(j));
      if ((localagt2 != null) && (!localagt2.a()) && (localagt2.b >= paramInt1))
      {
        localagt2.a(paramInt2, false);
        localRecyclerView.y.i = true;
      }
    }
    agl localagl = localRecyclerView.b;
    int k = localagl.c.size();
    for (int m = 0; m < k; m++)
    {
      agt localagt1 = (agt)localagl.c.get(m);
      if ((localagt1 != null) && (localagt1.c() >= paramInt1)) {
        localagt1.a(paramInt2, true);
      }
    }
    localRecyclerView.requestLayout();
    this.a.A = true;
  }
  
  void c(ada paramada)
  {
    switch (paramada.a)
    {
    default: 
      return;
    case 0: 
      this.a.h.a(paramada.b, paramada.d);
      return;
    case 1: 
      this.a.h.b(paramada.b, paramada.d);
      return;
    case 2: 
      this.a.h.a(this.a, paramada.b, paramada.d);
      return;
    }
    this.a.h.c(paramada.b, paramada.d);
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    int i = -1;
    RecyclerView localRecyclerView = this.a;
    int j = localRecyclerView.d.a.a();
    int k;
    int m;
    int n;
    int i1;
    label38:
    agt localagt2;
    if (paramInt1 < paramInt2)
    {
      k = i;
      m = paramInt2;
      n = paramInt1;
      i1 = 0;
      if (i1 >= j) {
        break label144;
      }
      localagt2 = RecyclerView.b(localRecyclerView.d.a.b(i1));
      if ((localagt2 != null) && (localagt2.b >= n) && (localagt2.b <= m))
      {
        if (localagt2.b != paramInt1) {
          break label133;
        }
        localagt2.a(paramInt2 - paramInt1, false);
      }
    }
    for (;;)
    {
      localRecyclerView.y.i = true;
      i1++;
      break label38;
      k = 1;
      m = paramInt1;
      n = paramInt2;
      break;
      label133:
      localagt2.a(k, false);
    }
    label144:
    agl localagl = localRecyclerView.b;
    int i2;
    int i3;
    int i5;
    label175:
    agt localagt1;
    if (paramInt1 < paramInt2)
    {
      i2 = paramInt2;
      i3 = paramInt1;
      int i4 = localagl.c.size();
      i5 = 0;
      if (i5 >= i4) {
        break label267;
      }
      localagt1 = (agt)localagl.c.get(i5);
      if ((localagt1 != null) && (localagt1.b >= i3) && (localagt1.b <= i2))
      {
        if (localagt1.b != paramInt1) {
          break label257;
        }
        localagt1.a(paramInt2 - paramInt1, false);
      }
    }
    for (;;)
    {
      i5++;
      break label175;
      i = 1;
      i2 = paramInt1;
      i3 = paramInt2;
      break;
      label257:
      localagt1.a(i, false);
    }
    label267:
    localRecyclerView.requestLayout();
    this.a.A = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acz
 * JD-Core Version:    0.7.0.1
 */