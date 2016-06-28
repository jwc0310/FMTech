import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;

final class ays
  implements bfg
{
  ays(ayq paramayq) {}
  
  public final void a()
  {
    ayq localayq = this.a;
    Resources localResources = localayq.g();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((localayq.w()) && (localayq.b.e()))
    {
      localArrayList1.add(localResources.getString(aau.sW));
      localArrayList2.add(Integer.valueOf(0));
    }
    if (localArrayList1.size() == 0)
    {
      localayq.y();
      return;
    }
    if (localayq.x())
    {
      localArrayList1.add(localResources.getString(aau.sY));
      localArrayList2.add(Integer.valueOf(1));
    }
    String[] arrayOfString = new String[localArrayList1.size()];
    localArrayList1.toArray(arrayOfString);
    int i = aau.sV;
    lut locallut = lut.a(localayq.g().getString(i), arrayOfString);
    locallut.n = localayq;
    locallut.p = 0;
    locallut.m.putIntegerArrayList("operation_list", localArrayList2);
    locallut.a(localayq.x, "set_photo_as");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ays
 * JD-Core Version:    0.7.0.1
 */