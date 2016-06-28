import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class aee
  implements Runnable
{
  aee(aed paramaed, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      aen localaen = (aen)localIterator.next();
      aed localaed = this.b;
      agt localagt = localaen.a;
      int i = localaen.b;
      int j = localaen.c;
      int k = localaen.d;
      int m = localaen.e;
      View localView = localagt.a;
      int n = k - i;
      int i1 = m - j;
      if (n != 0) {
        nj.a.j(localView).b(0.0F);
      }
      if (i1 != 0) {
        nj.a.j(localView).c(0.0F);
      }
      ov localov = nj.a.j(localView);
      localaed.e.add(localagt);
      localov.a(localaed.k).a(new aej(localaed, localagt, n, i1, localov)).b();
    }
    this.a.clear();
    this.b.b.remove(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aee
 * JD-Core Version:    0.7.0.1
 */