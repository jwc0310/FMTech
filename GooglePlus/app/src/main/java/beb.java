import android.view.View;

final class beb
  implements Runnable
{
  private final View a;
  
  public beb(bdp parambdp, View paramView)
  {
    this.a = paramView;
  }
  
  public final void run()
  {
    bdp.a(this.b, this.a);
    this.b.ai = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     beb
 * JD-Core Version:    0.7.0.1
 */