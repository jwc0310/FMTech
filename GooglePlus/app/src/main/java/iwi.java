import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class iwi
  implements mdp, mfd, rl
{
  public List<rl> a = Collections.emptyList();
  private mca b;
  
  public final void a(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((rl)localIterator.next()).a(paramInt);
    }
  }
  
  public final void a(View paramView)
  {
    this.b.f(true);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((rl)localIterator.next()).a(paramView);
    }
  }
  
  public final void a(View paramView, float paramFloat)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((rl)localIterator.next()).a(paramView, paramFloat);
    }
  }
  
  final void a(mca parammca, List<rl> paramList)
  {
    this.b = parammca;
    this.a = paramList;
    parammca.bp.a(this);
  }
  
  public final void b(View paramView)
  {
    this.b.f(false);
    Context localContext = this.b.aI_();
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjs.i);
    localgxr.b.add(localgxq);
    new gwz(21, localgxr.a(this.b.aI_())).b(localContext);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((rl)localIterator.next()).b(paramView);
    }
  }
  
  public final void b_(Bundle paramBundle)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      rl localrl = (rl)localIterator.next();
      if ((localrl instanceof tu)) {
        ((tu)localrl).a();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwi
 * JD-Core Version:    0.7.0.1
 */