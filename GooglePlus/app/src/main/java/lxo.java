import com.google.android.libraries.social.ui.views.RecyclingViewGroup;

public final class lxo
  implements Runnable
{
  public boolean a;
  
  public lxo(RecyclingViewGroup paramRecyclingViewGroup) {}
  
  public final void run()
  {
    RecyclingViewGroup localRecyclingViewGroup1 = this.b;
    int i = nj.a.m(localRecyclingViewGroup1);
    RecyclingViewGroup localRecyclingViewGroup2 = this.b;
    nj.a.c(localRecyclingViewGroup2, 1);
    this.b.sendAccessibilityEvent(4096);
    RecyclingViewGroup localRecyclingViewGroup3 = this.b;
    nj.a.c(localRecyclingViewGroup3, i);
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxo
 * JD-Core Version:    0.7.0.1
 */