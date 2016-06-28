import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class ecf
{
  int a = 0;
  List<ecc> b = new ArrayList();
  SparseArray<Integer> c = new SparseArray();
  
  ecf(ece paramece) {}
  
  final void a(ecc[] paramArrayOfecc)
  {
    this.b.clear();
    this.c.clear();
    for (int i = 0; i < paramArrayOfecc.length; i++)
    {
      ecc localecc = paramArrayOfecc[i];
      this.b.add(localecc);
      this.c.put(localecc.b, Integer.valueOf(i));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecf
 * JD-Core Version:    0.7.0.1
 */