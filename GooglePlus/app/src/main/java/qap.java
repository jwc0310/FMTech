public final class qap
  implements Cloneable
{
  static final qaq a = new qaq();
  boolean b = false;
  qaq[] c;
  int d;
  private int[] e;
  
  qap()
  {
    this(10);
  }
  
  private qap(int paramInt)
  {
    int i = d(paramInt << 2) / 4;
    this.e = new int[i];
    this.c = new qaq[i];
    this.d = 0;
  }
  
  private static int d(int paramInt)
  {
    for (int i = 4;; i++) {
      if (i < 32)
      {
        if (paramInt <= -12 + (1 << i)) {
          paramInt = -12 + (1 << i);
        }
      }
      else {
        return paramInt;
      }
    }
  }
  
  final qaq a(int paramInt)
  {
    int i = c(paramInt);
    if ((i < 0) || (this.c[i] == a)) {
      return null;
    }
    return this.c[i];
  }
  
  final void a()
  {
    int i = this.d;
    int[] arrayOfInt = this.e;
    qaq[] arrayOfqaq = this.c;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      qaq localqaq = arrayOfqaq[j];
      if (localqaq != a)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfqaq[k] = localqaq;
          arrayOfqaq[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.d = k;
  }
  
  final void a(int paramInt, qaq paramqaq)
  {
    int i = c(paramInt);
    if (i >= 0)
    {
      this.c[i] = paramqaq;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.d) && (this.c[j] == a))
    {
      this.e[j] = paramInt;
      this.c[j] = paramqaq;
      return;
    }
    if ((this.b) && (this.d >= this.e.length))
    {
      a();
      j = 0xFFFFFFFF ^ c(paramInt);
    }
    int k;
    if (this.d >= this.e.length) {
      k = 1 + this.d << 2;
    }
    for (int m = 4;; m++) {
      if (m < 32)
      {
        if (k <= -12 + (1 << m)) {
          k = -12 + (1 << m);
        }
      }
      else
      {
        int n = k / 4;
        int[] arrayOfInt = new int[n];
        qaq[] arrayOfqaq = new qaq[n];
        System.arraycopy(this.e, 0, arrayOfInt, 0, this.e.length);
        System.arraycopy(this.c, 0, arrayOfqaq, 0, this.c.length);
        this.e = arrayOfInt;
        this.c = arrayOfqaq;
        if (this.d - j != 0)
        {
          System.arraycopy(this.e, j, this.e, j + 1, this.d - j);
          System.arraycopy(this.c, j, this.c, j + 1, this.d - j);
        }
        this.e[j] = paramInt;
        this.c[j] = paramqaq;
        this.d = (1 + this.d);
        return;
      }
    }
  }
  
  final qaq b(int paramInt)
  {
    if (this.b) {
      a();
    }
    return this.c[paramInt];
  }
  
  final int c(int paramInt)
  {
    int i = -1 + this.d;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      m = j + k >>> 1;
      int n = this.e[m];
      if (n < paramInt)
      {
        j = m + 1;
      }
      else
      {
        if (n <= paramInt) {
          break label69;
        }
        k = m - 1;
      }
    }
    int m = j ^ 0xFFFFFFFF;
    label69:
    return m;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label128:
    label173:
    label179:
    label183:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof qap)) {
        return false;
      }
      qap localqap = (qap)paramObject;
      if (this.b) {
        a();
      }
      int i = this.d;
      if (localqap.b) {
        localqap.a();
      }
      if (i != localqap.d) {
        return false;
      }
      int[] arrayOfInt1 = this.e;
      int[] arrayOfInt2 = localqap.e;
      int j = this.d;
      int k = 0;
      int m;
      label102:
      int i1;
      if (k < j) {
        if (arrayOfInt1[k] != arrayOfInt2[k])
        {
          m = 0;
          if (m != 0)
          {
            qaq[] arrayOfqaq1 = this.c;
            qaq[] arrayOfqaq2 = localqap.c;
            int n = this.d;
            i1 = 0;
            if (i1 >= n) {
              break label179;
            }
            if (arrayOfqaq1[i1].equals(arrayOfqaq2[i1])) {
              break label173;
            }
          }
        }
      }
      for (int i2 = 0;; i2 = 1)
      {
        if (i2 != 0) {
          break label183;
        }
        return false;
        k++;
        break;
        m = 1;
        break label102;
        i1++;
        break label128;
      }
    }
  }
  
  public final int hashCode()
  {
    if (this.b) {
      a();
    }
    int i = 17;
    for (int j = 0; j < this.d; j++) {
      i = 31 * (i * 31 + this.e[j]) + this.c[j].hashCode();
    }
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qap
 * JD-Core Version:    0.7.0.1
 */