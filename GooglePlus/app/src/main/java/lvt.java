import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListView;
import java.util.HashMap;

final class lvt
  implements ViewTreeObserver.OnPreDrawListener
{
  lvt(lvp paramlvp, ViewTreeObserver paramViewTreeObserver, ListView paramListView, boolean paramBoolean, HashMap paramHashMap) {}
  
  public final boolean onPreDraw()
  {
    this.a.removeOnPreDrawListener(this);
    int i = this.b.getFirstVisiblePosition();
    int j = this.b.getLastVisiblePosition();
    int i3;
    int k;
    int m;
    label60:
    int n;
    float f1;
    label68:
    Float localFloat1;
    View localView;
    Float localFloat2;
    if (this.c) {
      if (i == 0)
      {
        i3 = 1;
        if (j + 1 == this.b.getCount()) {
          j--;
        }
        k = j;
        m = i3;
        n = m;
        f1 = -2.147484E+009F;
        if (n > k) {
          break label483;
        }
        localFloat1 = this.e.a(this.b, n, this.d);
        localView = this.b.getChildAt(n - i);
        if (localFloat1 != null) {
          break label492;
        }
        if (f1 == -2.147484E+009F) {
          break label331;
        }
        localFloat2 = Float.valueOf(f1);
      }
    }
    for (;;)
    {
      float f2 = lvp.c(localView);
      float f3 = localFloat2.floatValue() - f2;
      int i1;
      if (this.c) {
        if (m + 3 + (k - m) >= this.b.getCount()) {
          i1 = 1;
        }
      }
      for (;;)
      {
        if ((f3 == 0.0F) && (n == k) && (i1 == 0)) {
          f3 = localFloat2.floatValue() + localView.getHeight() + this.b.getDividerHeight() - f2;
        }
        if ((m != 0) && (f3 == 0.0F) && (n == m) && (i1 != 0)) {
          f3 = -1.0F * (localFloat2.floatValue() + localView.getHeight() + this.b.getDividerHeight() - f2);
        }
        this.e.a(localView, 0.0F, 0.0F, f3, 0.0F, null);
        float f4 = localFloat2.floatValue() + localView.getHeight() + this.b.getDividerHeight();
        n++;
        f1 = f4;
        break label68;
        i3 = i;
        break;
        k = j;
        m = i;
        break label60;
        label331:
        float f5 = localView.getHeight() + this.b.getDividerHeight();
        for (int i2 = n + 1;; i2++)
        {
          if (i2 <= k)
          {
            Float localFloat3 = this.e.a(this.b, i2, this.d);
            if (localFloat3 != null) {
              localFloat1 = Float.valueOf(localFloat3.floatValue() - f5);
            }
          }
          else
          {
            if (localFloat1 != null) {
              break label492;
            }
            localFloat2 = Float.valueOf(-f5);
            break;
          }
          f5 += this.b.getChildAt(i2 - i).getHeight() + this.b.getDividerHeight();
        }
        i1 = 0;
        continue;
        if (m + 1 + (k - m) >= this.b.getCount()) {
          i1 = 1;
        } else {
          i1 = 0;
        }
      }
      label483:
      this.d.clear();
      return true;
      label492:
      localFloat2 = localFloat1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvt
 * JD-Core Version:    0.7.0.1
 */