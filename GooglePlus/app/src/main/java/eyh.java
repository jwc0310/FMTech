final class eyh
  implements Cloneable
{
  private static final eyi c = new eyi();
  eyi[] a;
  int b;
  private boolean d = false;
  private int[] e;
  
  public eyh()
  {
    this(10);
  }
  
  private eyh(int paramInt)
  {
    int i = a(paramInt << 2) / 4;
    this.e = new int[i];
    this.a = new eyi[i];
    this.b = 0;
  }
  
  private static int a(int paramInt)
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
  
  public final eyh a()
  {
    int i = 0;
    int j = this.b;
    eyh localeyh = new eyh(j);
    System.arraycopy(this.e, 0, localeyh.e, 0, j);
    while (i < j)
    {
      if (this.a[i] != null) {
        localeyh.a[i] = this.a[i].b();
      }
      i++;
    }
    localeyh.b = j;
    return localeyh;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label147:
    label153:
    label157:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof eyh)) {
        return false;
      }
      eyh localeyh = (eyh)paramObject;
      if (this.b != localeyh.b) {
        return false;
      }
      int[] arrayOfInt1 = this.e;
      int[] arrayOfInt2 = localeyh.e;
      int i = this.b;
      int j = 0;
      int k;
      label76:
      int n;
      if (j < i) {
        if (arrayOfInt1[j] != arrayOfInt2[j])
        {
          k = 0;
          if (k != 0)
          {
            eyi[] arrayOfeyi1 = this.a;
            eyi[] arrayOfeyi2 = localeyh.a;
            int m = this.b;
            n = 0;
            label102:
            if (n >= m) {
              break label153;
            }
            if (arrayOfeyi1[n].equals(arrayOfeyi2[n])) {
              break label147;
            }
          }
        }
      }
      for (int i1 = 0;; i1 = 1)
      {
        if (i1 != 0) {
          break label157;
        }
        return false;
        j++;
        break;
        k = 1;
        break label76;
        n++;
        break label102;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.b; j++) {
      i = 31 * (i * 31 + this.e[j]) + this.a[j].hashCode();
    }
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyh
 * JD-Core Version:    0.7.0.1
 */