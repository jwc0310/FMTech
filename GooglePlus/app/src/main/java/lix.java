import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

final class lix
  implements Runnable
{
  lix(liw paramliw) {}
  
  public final void run()
  {
    int i = this.a.b.size();
    for (int j = 0; j < i; j++)
    {
      liw localliw = this.a;
      agt localagt = (agt)this.a.b.get(j);
      localliw.c.add(localagt);
      View localView = localagt.a;
      ov localov = nj.a.j(localView);
      localov.a(new lja(localliw, localagt, localov));
      localov.b(localliw.a).a(localliw.i).a(new DecelerateInterpolator()).c(0.0F).b();
      localliw.a = (100L + localliw.a);
    }
    this.a.b.clear();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lix
 * JD-Core Version:    0.7.0.1
 */