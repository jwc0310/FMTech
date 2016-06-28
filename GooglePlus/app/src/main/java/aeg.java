import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class aeg
  implements Runnable
{
  aeg(aed paramaed, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      agt localagt = (agt)localIterator.next();
      aed localaed = this.b;
      View localView = localagt.a;
      ov localov = nj.a.j(localView);
      localaed.d.add(localagt);
      localov.a(1.0F).a(localaed.i).a(new aei(localaed, localagt, localov)).b();
    }
    this.a.clear();
    this.b.a.remove(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aeg
 * JD-Core Version:    0.7.0.1
 */