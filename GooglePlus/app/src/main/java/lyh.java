import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

public final class lyh
{
  public ArrayList<View>[] a;
  public int b;
  public lpw c;
  public SparseArray<View> d;
  private int e;
  
  public final void a(View paramView, int paramInt)
  {
    lyc locallyc = (lyc)paramView.getLayoutParams();
    if (locallyc.d == -1) {}
    do
    {
      return;
      if (nj.a.k(paramView))
      {
        if (this.d == null) {
          this.d = new SparseArray();
        }
        this.d.put(locallyc.c, paramView);
        return;
      }
      if (paramInt > this.e) {
        this.e = paramInt;
      }
      ArrayList localArrayList = this.a[locallyc.d];
      if (localArrayList.size() < this.e) {
        localArrayList.add(paramView);
      }
    } while (this.c == null);
    this.c.a(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyh
 * JD-Core Version:    0.7.0.1
 */