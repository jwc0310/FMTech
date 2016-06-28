import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class agv
  extends ld
{
  agv(agu paramagu) {}
  
  public final void a(View paramView, pr parampr)
  {
    super.a(paramView, parampr);
    if ((!this.d.a()) && (this.d.d.h != null)) {
      this.d.d.h.a(paramView, parampr);
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2;
    if (super.a(paramView, paramInt, paramBundle)) {
      bool2 = true;
    }
    agh localagh1;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = this.d.a();
        bool2 = false;
      } while (bool1);
      localagh1 = this.d.d.h;
      bool2 = false;
    } while (localagh1 == null);
    agh localagh2 = this.d.d.h;
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agv
 * JD-Core Version:    0.7.0.1
 */