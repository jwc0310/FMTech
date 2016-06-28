import android.util.SparseIntArray;

public abstract class aes
{
  final SparseIntArray a = new SparseIntArray();
  private boolean b = false;
  
  public abstract int a(int paramInt);
  
  public int a(int paramInt1, int paramInt2)
  {
    int i = a(paramInt1);
    if (i == paramInt2) {}
    int k;
    do
    {
      return 0;
      int j = 0;
      k = 0;
      if (j < paramInt1)
      {
        int m = a(j);
        int n = k + m;
        if (n == paramInt2) {
          m = 0;
        }
        for (;;)
        {
          j++;
          k = m;
          break;
          if (n <= paramInt2) {
            m = n;
          }
        }
      }
    } while (k + i > paramInt2);
    return k;
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    int i = a(paramInt1);
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    int i1;
    if (j < paramInt1)
    {
      n = a(j);
      i1 = m + n;
      if (i1 == paramInt2)
      {
        k++;
        n = 0;
      }
    }
    for (;;)
    {
      j++;
      m = n;
      break;
      if (i1 > paramInt2)
      {
        k++;
        continue;
        if (m + i > paramInt2) {
          k++;
        }
        return k;
      }
      else
      {
        n = i1;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aes
 * JD-Core Version:    0.7.0.1
 */