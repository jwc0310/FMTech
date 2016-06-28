import android.util.SparseArray;
import android.widget.SectionIndexer;
import com.google.android.apps.plus.views.FastScrollContainer;

public final class det
  implements SectionIndexer
{
  public FastScrollContainer a;
  private SparseArray<deu> b;
  private final dev c;
  
  public det(dev paramdev)
  {
    this.c = paramdev;
  }
  
  public final void a(SparseArray<deu> paramSparseArray)
  {
    this.b = paramSparseArray;
    if (this.a != null) {
      this.a.a.e();
    }
  }
  
  public final int getPositionForSection(int paramInt)
  {
    if (this.b == null) {}
    for (int i = 0; i == 0; i = this.b.size()) {
      return 0;
    }
    if (paramInt >= i) {
      paramInt = i - 1;
    }
    for (;;)
    {
      return this.b.keyAt(paramInt);
      if (paramInt < 0) {
        paramInt = 0;
      }
    }
  }
  
  public final int getSectionForPosition(int paramInt)
  {
    if (this.b == null) {}
    int j;
    int k;
    for (int i = 0;; i = this.b.size())
    {
      j = i - 1;
      k = 0;
      if (i != 0) {
        break;
      }
      return k;
    }
    if (paramInt >= this.c.a()) {
      return j;
    }
    int m = Math.max(paramInt, this.b.keyAt(0));
    int n = 0;
    for (;;)
    {
      k = (n + j) / 2;
      int i1 = this.b.keyAt(k);
      if (i1 > m)
      {
        j = k;
      }
      else
      {
        if ((i1 == m) || (i == k + 1) || (this.b.keyAt(k + 1) > m)) {
          break;
        }
        n = k;
      }
    }
  }
  
  public final Object[] getSections()
  {
    if (this.b != null) {}
    Object[] arrayOfObject;
    for (int i = this.b.size();; i = 0)
    {
      arrayOfObject = new Object[i];
      for (int j = i - 1; j >= 0; j--) {
        arrayOfObject[j] = this.b.valueAt(j);
      }
    }
    return arrayOfObject;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     det
 * JD-Core Version:    0.7.0.1
 */