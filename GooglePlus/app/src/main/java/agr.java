import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class agr
{
  int a = -1;
  public kl<agt, agg> b = new kl();
  public kl<agt, agg> c = new kl();
  public kl<Long, agt> d = new kl();
  public final List<View> e = new ArrayList();
  public int f = 0;
  public int g = 0;
  public int h = 0;
  public boolean i = false;
  public boolean j = false;
  public boolean k = false;
  public boolean l = false;
  
  public final int a()
  {
    if (this.j) {
      return this.g - this.h;
    }
    return this.f;
  }
  
  final void a(agt paramagt)
  {
    this.b.remove(paramagt);
    this.c.remove(paramagt);
    kl localkl;
    if (this.d != null) {
      localkl = this.d;
    }
    for (int m = -1 + localkl.size();; m--) {
      if (m >= 0)
      {
        if (paramagt == localkl.b[(1 + (m << 1))]) {
          localkl.b(m);
        }
      }
      else
      {
        this.e.remove(paramagt.a);
        return;
      }
    }
  }
  
  final void a(View paramView)
  {
    if (!this.e.contains(paramView)) {
      this.e.add(paramView);
    }
  }
  
  public final String toString()
  {
    return "State{mTargetPosition=" + this.a + ", mPreLayoutHolderMap=" + this.b + ", mPostLayoutHolderMap=" + this.c + ", mData=" + null + ", mItemCount=" + this.f + ", mPreviousLayoutItemCount=" + this.g + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.h + ", mStructureChanged=" + this.i + ", mInPreLayout=" + this.j + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agr
 * JD-Core Version:    0.7.0.1
 */