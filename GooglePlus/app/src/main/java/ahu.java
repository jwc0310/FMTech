import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ahu
{
  int[] a;
  List<ahv> b;
  
  final int a(int paramInt)
  {
    if (this.b != null) {
      for (int i = -1 + this.b.size(); i >= 0; i--) {
        if (((ahv)this.b.get(i)).a >= paramInt) {
          this.b.remove(i);
        }
      }
    }
    return b(paramInt);
  }
  
  public final ahv a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    ahv localahv;
    if (this.b == null)
    {
      localahv = null;
      return localahv;
    }
    int i = this.b.size();
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label97;
      }
      localahv = (ahv)this.b.get(j);
      if (localahv.a >= paramInt2) {
        return null;
      }
      if ((localahv.a >= paramInt1) && ((paramInt3 == 0) || (localahv.b == paramInt3) || (localahv.d))) {
        break;
      }
    }
    label97:
    return null;
  }
  
  final void a()
  {
    if (this.a != null) {
      Arrays.fill(this.a, -1);
    }
    this.b = null;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {}
    do
    {
      return;
      c(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, this.a.length - paramInt2, this.a.length, -1);
    } while (this.b == null);
    int i = paramInt1 + paramInt2;
    int j = -1 + this.b.size();
    label92:
    ahv localahv;
    if (j >= 0)
    {
      localahv = (ahv)this.b.get(j);
      if (localahv.a >= paramInt1)
      {
        if (localahv.a >= i) {
          break label149;
        }
        this.b.remove(j);
      }
    }
    for (;;)
    {
      j--;
      break label92;
      break;
      label149:
      localahv.a -= paramInt2;
    }
  }
  
  public final void a(ahv paramahv)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      ahv localahv = (ahv)this.b.get(j);
      if (localahv.a == paramahv.a) {
        this.b.remove(j);
      }
      if (localahv.a >= paramahv.a)
      {
        this.b.add(j, paramahv);
        return;
      }
    }
    this.b.add(paramahv);
  }
  
  final int b(int paramInt)
  {
    if (this.a == null) {
      return -1;
    }
    if (paramInt >= this.a.length) {
      return -1;
    }
    int k;
    if (this.b != null)
    {
      ahv localahv1 = d(paramInt);
      if (localahv1 != null) {
        this.b.remove(localahv1);
      }
      int j = this.b.size();
      k = 0;
      if (k >= j) {
        break label182;
      }
      if (((ahv)this.b.get(k)).a < paramInt) {}
    }
    for (;;)
    {
      ahv localahv2;
      if (k != -1)
      {
        localahv2 = (ahv)this.b.get(k);
        this.b.remove(k);
      }
      for (int i = localahv2.a;; i = -1)
      {
        if (i != -1) {
          break label166;
        }
        Arrays.fill(this.a, paramInt, this.a.length, -1);
        return this.a.length;
        k++;
        break;
      }
      label166:
      Arrays.fill(this.a, paramInt, i + 1, -1);
      return i + 1;
      label182:
      k = -1;
    }
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {}
    for (;;)
    {
      return;
      c(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, paramInt1, paramInt1 + paramInt2, -1);
      if (this.b != null) {
        for (int i = -1 + this.b.size(); i >= 0; i--)
        {
          ahv localahv = (ahv)this.b.get(i);
          if (localahv.a >= paramInt1) {
            localahv.a = (paramInt2 + localahv.a);
          }
        }
      }
    }
  }
  
  final void c(int paramInt)
  {
    if (this.a == null)
    {
      this.a = new int[1 + Math.max(paramInt, 10)];
      Arrays.fill(this.a, -1);
    }
    while (paramInt < this.a.length) {
      return;
    }
    int[] arrayOfInt = this.a;
    int i = this.a.length;
    while (i <= paramInt) {
      i <<= 1;
    }
    this.a = new int[i];
    System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
    Arrays.fill(this.a, arrayOfInt.length, this.a.length, -1);
  }
  
  public final ahv d(int paramInt)
  {
    ahv localahv;
    if (this.b == null)
    {
      localahv = null;
      return localahv;
    }
    for (int i = -1 + this.b.size();; i--)
    {
      if (i < 0) {
        break label55;
      }
      localahv = (ahv)this.b.get(i);
      if (localahv.a == paramInt) {
        break;
      }
    }
    label55:
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahu
 * JD-Core Version:    0.7.0.1
 */