import java.util.ArrayList;
import java.util.List;

public class afr
{
  ky<ada> a = new kz(30);
  final ArrayList<ada> b = new ArrayList();
  final ArrayList<ada> c = new ArrayList();
  final acz d;
  final boolean e;
  final afq f;
  
  public afr(acz paramacz)
  {
    this(paramacz, false);
  }
  
  afr(acz paramacz, boolean paramBoolean)
  {
    this.d = paramacz;
    this.e = false;
    this.f = new afq(this);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int i = -1 + this.c.size();
    int j = paramInt1;
    if (i >= 0)
    {
      ada localada2 = (ada)this.c.get(i);
      int n;
      int i1;
      label66:
      label106:
      int m;
      if (localada2.a == 3) {
        if (localada2.b < localada2.d)
        {
          n = localada2.b;
          i1 = localada2.d;
          if ((j < n) || (j > i1)) {
            break label204;
          }
          if (n != localada2.b) {
            break label159;
          }
          if (paramInt2 != 0) {
            break label139;
          }
          localada2.d = (1 + localada2.d);
          m = j + 1;
        }
      }
      for (;;)
      {
        i--;
        j = m;
        break;
        n = localada2.d;
        i1 = localada2.b;
        break label66;
        label139:
        if (paramInt2 != 1) {
          break label106;
        }
        localada2.d = (-1 + localada2.d);
        break label106;
        label159:
        if (paramInt2 == 0) {
          localada2.b = (1 + localada2.b);
        }
        for (;;)
        {
          m = j - 1;
          break;
          if (paramInt2 == 1) {
            localada2.b = (-1 + localada2.b);
          }
        }
        label204:
        if (j < localada2.b)
        {
          if (paramInt2 == 0)
          {
            localada2.b = (1 + localada2.b);
            localada2.d = (1 + localada2.d);
            m = j;
            continue;
          }
          if (paramInt2 == 1)
          {
            localada2.b = (-1 + localada2.b);
            localada2.d = (-1 + localada2.d);
          }
        }
        m = j;
        continue;
        if (localada2.b <= j)
        {
          if (localada2.a == 0)
          {
            m = j - localada2.d;
            continue;
          }
          if (localada2.a == 1) {
            m = j + localada2.d;
          }
        }
        else
        {
          if (paramInt2 == 0)
          {
            localada2.b = (1 + localada2.b);
            m = j;
            continue;
          }
          if (paramInt2 == 1) {
            localada2.b = (-1 + localada2.b);
          }
        }
        m = j;
      }
    }
    int k = -1 + this.c.size();
    if (k >= 0)
    {
      ada localada1 = (ada)this.c.get(k);
      if (localada1.a == 3) {
        if ((localada1.d == localada1.b) || (localada1.d < 0))
        {
          this.c.remove(k);
          a(localada1);
        }
      }
      for (;;)
      {
        k--;
        break;
        if (localada1.d <= 0)
        {
          this.c.remove(k);
          a(localada1);
        }
      }
    }
    return j;
  }
  
  public ada a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    ada localada = (ada)this.a.a();
    if (localada == null) {
      return new ada(paramInt1, paramInt2, paramInt3, paramObject);
    }
    localada.a = paramInt1;
    localada.b = paramInt2;
    localada.d = paramInt3;
    localada.c = paramObject;
    return localada;
  }
  
  public void a()
  {
    a(this.b);
    a(this.c);
  }
  
  public void a(ada paramada)
  {
    if (!this.e)
    {
      paramada.c = null;
      this.a.a(paramada);
    }
  }
  
  void a(ada paramada, int paramInt)
  {
    this.d.a(paramada);
    switch (paramada.a)
    {
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 1: 
      this.d.a(paramInt, paramada.d);
      return;
    }
    this.d.a(paramInt, paramada.d, paramada.c);
  }
  
  void a(List<ada> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      a((ada)paramList.get(j));
    }
    paramList.clear();
  }
  
  boolean a(int paramInt)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      ada localada = (ada)this.c.get(j);
      if (localada.a == 3)
      {
        if (b(localada.d, j + 1) == paramInt) {
          return true;
        }
      }
      else if (localada.a == 0)
      {
        int k = localada.b + localada.d;
        for (int m = localada.b; m < k; m++) {
          if (b(m, j + 1) == paramInt) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  boolean a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.b.add(a(2, paramInt1, paramInt2, paramObject));
    return this.b.size() == 1;
  }
  
  int b(int paramInt)
  {
    return b(paramInt, 0);
  }
  
  int b(int paramInt1, int paramInt2)
  {
    int i = this.c.size();
    int j = paramInt1;
    ada localada;
    if (paramInt2 < i)
    {
      localada = (ada)this.c.get(paramInt2);
      if (localada.a == 3) {
        if (localada.b == j) {
          j = localada.d;
        }
      }
    }
    for (;;)
    {
      paramInt2++;
      break;
      if (localada.b < j) {
        j--;
      }
      if (localada.d <= j)
      {
        j++;
        continue;
        if (localada.b <= j) {
          if (localada.a == 1)
          {
            if (j < localada.b + localada.d)
            {
              j = -1;
              return j;
            }
            j -= localada.d;
          }
          else if (localada.a == 0)
          {
            j += localada.d;
          }
        }
      }
    }
  }
  
  public void b()
  {
    afq localafq = this.f;
    ArrayList localArrayList = this.b;
    int i;
    int j;
    label22:
    int k;
    label53:
    int i1;
    ada localada2;
    ada localada3;
    for (;;)
    {
      i = 0;
      j = -1 + localArrayList.size();
      if (j < 0) {
        break label278;
      }
      if (((ada)localArrayList.get(j)).a != 3) {
        break;
      }
      if (i == 0) {
        break label1402;
      }
      k = j;
      if (k == -1) {
        break label1285;
      }
      i1 = k + 1;
      localada2 = (ada)localArrayList.get(k);
      localada3 = (ada)localArrayList.get(i1);
      switch (localada3.a)
      {
      default: 
        break;
      case 0: 
        int i20 = localada2.d;
        int i21 = localada3.b;
        int i22 = 0;
        if (i20 < i21) {
          i22 = -1;
        }
        if (localada2.b < localada3.b) {
          i22++;
        }
        if (localada3.b <= localada2.b) {
          localada2.b += localada3.d;
        }
        if (localada3.b <= localada2.d) {
          localada2.d += localada3.d;
        }
        localada3.b = (i22 + localada3.b);
        localArrayList.set(k, localada3);
        localArrayList.set(i1, localada2);
      }
    }
    label278:
    label363:
    label1264:
    label1402:
    for (int i23 = 1;; i23 = i)
    {
      j--;
      i = i23;
      break label22;
      k = -1;
      break label53;
      ada localada4 = null;
      int i7;
      int i10;
      if (localada2.b < localada2.d)
      {
        int i16 = localada3.b;
        int i17 = localada2.b;
        i7 = 0;
        i10 = 0;
        if (i16 == i17)
        {
          int i18 = localada3.d;
          int i19 = localada2.d - localada2.b;
          i7 = 0;
          i10 = 0;
          if (i18 == i19) {
            i10 = 1;
          }
        }
        if (localada2.d >= localada3.b) {
          break label515;
        }
        localada3.b = (-1 + localada3.b);
        if (localada2.b > localada3.b) {
          break label587;
        }
        localada3.b = (1 + localada3.b);
      }
      for (;;)
      {
        if (i10 == 0) {
          break label675;
        }
        localArrayList.set(k, localada3);
        localArrayList.remove(i1);
        localafq.a.a(localada2);
        break;
        i7 = 1;
        int i8 = localada3.b;
        int i9 = 1 + localada2.d;
        i10 = 0;
        if (i8 != i9) {
          break label363;
        }
        int i11 = localada3.d;
        int i12 = localada2.b - localada2.d;
        i10 = 0;
        if (i11 != i12) {
          break label363;
        }
        i10 = 1;
        break label363;
        if (localada2.d >= localada3.b + localada3.d) {
          break label388;
        }
        localada3.d = (-1 + localada3.d);
        localada2.a = 1;
        localada2.d = 1;
        if (localada3.d != 0) {
          break;
        }
        localArrayList.remove(i1);
        localafq.a.a(localada3);
        break;
        int i13 = localada2.b;
        int i14 = localada3.b + localada3.d;
        localada4 = null;
        if (i13 < i14)
        {
          int i15 = localada3.b + localada3.d - localada2.b;
          localada4 = localafq.a.a(1, 1 + localada2.b, i15, null);
          localada3.d = (localada2.b - localada3.b);
        }
      }
      if (i7 != 0)
      {
        if (localada4 != null)
        {
          if (localada2.b > localada4.b) {
            localada2.b -= localada4.d;
          }
          if (localada2.d > localada4.b) {
            localada2.d -= localada4.d;
          }
        }
        if (localada2.b > localada3.b) {
          localada2.b -= localada3.d;
        }
        if (localada2.d > localada3.b) {
          localada2.d -= localada3.d;
        }
        localArrayList.set(k, localada3);
        if (localada2.b == localada2.d) {
          break label978;
        }
        localArrayList.set(i1, localada2);
      }
      while (localada4 != null)
      {
        localArrayList.add(k, localada4);
        break;
        if (localada4 != null)
        {
          if (localada2.b >= localada4.b) {
            localada2.b -= localada4.d;
          }
          if (localada2.d >= localada4.b) {
            localada2.d -= localada4.d;
          }
        }
        if (localada2.b >= localada3.b) {
          localada2.b -= localada3.d;
        }
        if (localada2.d < localada3.b) {
          break label801;
        }
        localada2.d -= localada3.d;
        break label801;
        localArrayList.remove(i1);
      }
      Object localObject1 = null;
      Object localObject2 = null;
      if (localada2.d < localada3.b)
      {
        localada3.b = (-1 + localada3.b);
        label1021:
        if (localada2.b > localada3.b) {
          break label1175;
        }
        localada3.b = (1 + localada3.b);
        localArrayList.set(i1, localada2);
        if (localada3.d <= 0) {
          break label1264;
        }
        localArrayList.set(k, localada3);
      }
      for (;;)
      {
        if (localObject1 != null) {
          localArrayList.add(k, localObject1);
        }
        if (localObject2 == null) {
          break;
        }
        localArrayList.add(k, localObject2);
        break;
        int i2 = localada2.d;
        int i3 = localada3.b + localada3.d;
        localObject1 = null;
        if (i2 >= i3) {
          break label1021;
        }
        localada3.d = (-1 + localada3.d);
        localObject1 = localafq.a.a(2, localada2.b, 1, localada3.c);
        break label1021;
        int i4 = localada2.b;
        int i5 = localada3.b + localada3.d;
        localObject2 = null;
        if (i4 >= i5) {
          break label1046;
        }
        int i6 = localada3.b + localada3.d - localada2.b;
        localObject2 = localafq.a.a(2, 1 + localada2.b, i6, localada3.c);
        localada3.d -= i6;
        break label1046;
        localArrayList.remove(k);
        localafq.a.a(localada3);
      }
      int m = this.b.size();
      int n = 0;
      if (n < m)
      {
        ada localada1 = (ada)this.b.get(n);
        switch (localada1.a)
        {
        }
        for (;;)
        {
          n++;
          break;
          f(localada1);
          continue;
          c(localada1);
          continue;
          d(localada1);
          continue;
          b(localada1);
        }
      }
      this.b.clear();
      return;
    }
  }
  
  void b(ada paramada)
  {
    g(paramada);
  }
  
  public int c(int paramInt)
  {
    int i = this.b.size();
    int j = 0;
    int k = paramInt;
    ada localada;
    if (j < i)
    {
      localada = (ada)this.b.get(j);
      switch (localada.a)
      {
      }
    }
    for (;;)
    {
      j++;
      break;
      if (localada.b <= k)
      {
        k += localada.d;
        continue;
        if (localada.b <= k)
        {
          if (localada.b + localada.d > k)
          {
            k = -1;
            return k;
          }
          k -= localada.d;
          continue;
          if (localada.b == k)
          {
            k = localada.d;
          }
          else
          {
            if (localada.b < k) {
              k--;
            }
            if (localada.d <= k) {
              k++;
            }
          }
        }
      }
    }
  }
  
  public void c()
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++) {
      this.d.b((ada)this.c.get(j));
    }
    a(this.c);
  }
  
  void c(ada paramada)
  {
    int i = paramada.b;
    int j = paramada.b + paramada.d;
    int k = -1;
    int m = paramada.b;
    int n = 0;
    if (m < j) {
      if ((this.d.a(m) != null) || (a(m)))
      {
        if (k != 0) {
          break label218;
        }
        e(a(1, i, n, null));
      }
    }
    label212:
    label218:
    for (int i1 = 1;; i1 = 0)
    {
      k = 1;
      int i6;
      int i4;
      int i5;
      if (i1 != 0)
      {
        i6 = m - n;
        i4 = j - n;
        i5 = 1;
        label99:
        int i7 = i6 + 1;
        n = i5;
        j = i4;
        m = i7;
        break;
        if (k != 1) {
          break label212;
        }
        g(a(1, i, n, null));
      }
      for (i1 = 1;; i1 = 0)
      {
        k = 0;
        break;
        int i2 = n + 1;
        int i3 = m;
        i4 = j;
        i5 = i2;
        i6 = i3;
        break label99;
        if (n != paramada.d)
        {
          a(paramada);
          paramada = a(1, i, n, null);
        }
        if (k == 0)
        {
          e(paramada);
          return;
        }
        g(paramada);
        return;
      }
    }
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    this.b.add(a(0, paramInt1, paramInt2, null));
    return this.b.size() == 1;
  }
  
  void d(ada paramada)
  {
    int i = paramada.b;
    int j = paramada.b + paramada.d;
    int k = paramada.b;
    int m = -1;
    int n = 0;
    if (k < j)
    {
      int i1;
      int i2;
      if ((this.d.a(k) != null) || (a(k)))
      {
        if (m == 0)
        {
          e(a(2, i, n, paramada.c));
          n = 0;
          i = k;
        }
        i1 = i;
        i2 = n;
      }
      for (int i3 = 1;; i3 = 0)
      {
        int i4 = i2 + 1;
        k++;
        int i5 = i3;
        n = i4;
        i = i1;
        m = i5;
        break;
        if (m == 1)
        {
          g(a(2, i, n, paramada.c));
          n = 0;
          i = k;
        }
        i1 = i;
        i2 = n;
      }
    }
    if (n != paramada.d)
    {
      Object localObject = paramada.c;
      a(paramada);
      paramada = a(2, i, n, localObject);
    }
    if (m == 0)
    {
      e(paramada);
      return;
    }
    g(paramada);
  }
  
  boolean d()
  {
    return this.b.size() > 0;
  }
  
  boolean d(int paramInt1, int paramInt2)
  {
    this.b.add(a(1, paramInt1, paramInt2, null));
    return this.b.size() == 1;
  }
  
  public void e()
  {
    c();
    int i = this.b.size();
    int j = 0;
    if (j < i)
    {
      ada localada = (ada)this.b.get(j);
      switch (localada.a)
      {
      }
      for (;;)
      {
        j++;
        break;
        this.d.b(localada);
        this.d.c(localada.b, localada.d);
        continue;
        this.d.b(localada);
        this.d.a(localada.b, localada.d);
        continue;
        this.d.b(localada);
        this.d.a(localada.b, localada.d, localada.c);
        continue;
        this.d.b(localada);
        this.d.d(localada.b, localada.d);
      }
    }
    a(this.b);
  }
  
  void e(ada paramada)
  {
    if ((paramada.a == 0) || (paramada.a == 3)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i = a(paramada.b, paramada.a);
    int j = paramada.b;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    label107:
    int i3;
    int i4;
    switch (paramada.a)
    {
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramada);
    case 2: 
      k = 1;
      m = 1;
      n = i;
      i1 = j;
      i2 = 1;
      if (i2 >= paramada.d) {
        break label284;
      }
      i3 = a(paramada.b + k * i2, paramada.a);
      switch (paramada.a)
      {
      default: 
        i4 = 0;
        label167:
        if (i4 != 0) {
          m++;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      i2++;
      break label107;
      k = 0;
      break;
      if (i3 == n + 1)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      if (i3 == n)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      ada localada2 = a(paramada.a, n, m, paramada.c);
      a(localada2, i1);
      a(localada2);
      if (paramada.a == 2) {
        i1 += m;
      }
      m = 1;
      n = i3;
    }
    label284:
    Object localObject = paramada.c;
    a(paramada);
    if (m > 0)
    {
      ada localada1 = a(paramada.a, n, m, localObject);
      a(localada1, i1);
      a(localada1);
    }
  }
  
  void f(ada paramada)
  {
    g(paramada);
  }
  
  void g(ada paramada)
  {
    this.c.add(paramada);
    switch (paramada.a)
    {
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramada);
    case 0: 
      this.d.c(paramada.b, paramada.d);
      return;
    case 3: 
      this.d.d(paramada.b, paramada.d);
      return;
    case 1: 
      this.d.b(paramada.b, paramada.d);
      return;
    }
    this.d.a(paramada.b, paramada.d, paramada.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afr
 * JD-Core Version:    0.7.0.1
 */