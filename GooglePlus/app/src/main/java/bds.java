import android.view.View;

final class bds
  implements Runnable
{
  bds(bdp parambdp) {}
  
  public final void run()
  {
    this.a.ag = false;
    View localView = this.a.N;
    if (localView == null) {
      return;
    }
    bdp.a(this.a, localView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bds
 * JD-Core Version:    0.7.0.1
 */