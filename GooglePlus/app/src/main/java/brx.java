import android.content.Context;
import android.util.SparseArray;

public final class brx
{
  public static Object a = new Object();
  public static boolean b = false;
  private static final SparseArray<ptl> c = new SparseArray();
  
  public static ptl a(Context paramContext, int paramInt)
  {
    synchronized (c)
    {
      bjk localbjk;
      if ((ptl)c.get(paramInt) == null)
      {
        ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
        localbjk = new bjk(paramContext, new kcg(paramContext, paramInt), paramInt);
        localbjk.i();
        if (!localbjk.n()) {
          c.put(paramInt, localbjk.a);
        }
      }
      else
      {
        ptl localptl = (ptl)c.get(paramInt);
        return localptl;
      }
      localbjk.c("EsPhotosFeatures");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brx
 * JD-Core Version:    0.7.0.1
 */