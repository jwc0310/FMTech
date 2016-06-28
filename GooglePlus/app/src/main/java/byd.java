import android.content.Context;
import android.database.Cursor;
import android.util.Pair;
import com.google.android.apps.plus.content.EsProvider;
import java.util.List;

public final class byd
  extends hqj
{
  private static final String[] r = { "circle_id", "circle_name", "semantic_hints", "contact_count" };
  private final fv s = new fv(this);
  private final jiw t;
  private final int u;
  private final int v;
  
  public byd(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.u = paramInt1;
    this.v = 5;
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
    this.d = EsProvider.e(paramContext);
  }
  
  public final Cursor o()
  {
    List localList1 = this.t.b(this.u, this.v, jgx.t);
    int i = localList1.size();
    String[] arrayOfString = new String[r.length + 2 * this.v];
    System.arraycopy(r, 0, arrayOfString, 0, r.length);
    for (int j = 0; j < this.v; j++)
    {
      int i2 = r.length + j * 2;
      arrayOfString[i2] = (20 + "personId_" + j);
      arrayOfString[(i2 + 1)] = (18 + "avatar_" + j);
    }
    hqr localhqr = new hqr(arrayOfString);
    for (int k = 0; k < i; k++)
    {
      Pair localPair = (Pair)localList1.get(k);
      jgw localjgw = (jgw)localPair.first;
      List localList2 = (List)localPair.second;
      int m = localList2.size();
      Object[] arrayOfObject = new Object[4 + 2 * this.v];
      arrayOfObject[0] = localjgw.b();
      arrayOfObject[1] = localjgw.c();
      arrayOfObject[2] = Integer.valueOf(localjgw.g());
      arrayOfObject[3] = Integer.valueOf(localjgw.f());
      for (int n = 0; n < m; n++)
      {
        int i1 = 4 + (n << 1);
        arrayOfObject[i1] = ((jjg)localList2.get(n)).a();
        arrayOfObject[(i1 + 1)] = hdo.a(((jjg)localList2.get(n)).e());
      }
      localhqr.a(arrayOfObject);
    }
    localhqr.registerContentObserver(this.s);
    return localhqr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byd
 * JD-Core Version:    0.7.0.1
 */