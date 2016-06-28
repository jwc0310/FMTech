import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class aef
  implements Runnable
{
  aef(aed paramaed, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      aem localaem = (aem)localIterator.next();
      aed localaed = this.b;
      agt localagt1 = localaem.a;
      View localView1;
      label47:
      agt localagt2;
      if (localagt1 == null)
      {
        localView1 = null;
        localagt2 = localaem.b;
        if (localagt2 == null) {
          break label240;
        }
      }
      label240:
      for (View localView2 = localagt2.a;; localView2 = null)
      {
        if (localView1 != null)
        {
          ov localov2 = nj.a.j(localView1).a(localaed.l);
          localaed.g.add(localaem.a);
          localov2.b(localaem.e - localaem.c);
          localov2.c(localaem.f - localaem.d);
          localov2.a(0.0F).a(new aek(localaed, localaem, localov2)).b();
        }
        if (localView2 == null) {
          break;
        }
        ov localov1 = nj.a.j(localView2);
        localaed.g.add(localaem.b);
        localov1.b(0.0F).c(0.0F).a(localaed.l).a(1.0F).a(new ael(localaed, localaem, localov1, localView2)).b();
        break;
        localView1 = localagt1.a;
        break label47;
      }
    }
    this.a.clear();
    this.b.c.remove(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aef
 * JD-Core Version:    0.7.0.1
 */