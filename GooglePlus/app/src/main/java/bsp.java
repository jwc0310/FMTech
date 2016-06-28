import android.content.Context;
import android.util.SparseArray;

public final class bsp
{
  public static final SparseArray<ojj> a = new SparseArray();
  
  public static int a(Context paramContext, int paramInt, bsn parambsn)
  {
    int i = 40;
    ojb localojb = aum.b(paramContext, paramInt);
    if (localojb.a.intValue() < i) {
      i = localojb.a.intValue();
    }
    if ((i == 0) && ((parambsn == bsn.c) || (parambsn == bsn.b))) {
      i = 2;
    }
    return i;
  }
  
  public static ojj a(Context paramContext, int paramInt)
  {
    synchronized (a)
    {
      ojj localojj1 = (ojj)a.get(paramInt);
      jru localjru;
      if ((localojj1 == null) || (localojj1.j == null) || (localojj1.k == null))
      {
        ojl localojl = new ojl();
        a(localojl);
        String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
        localjru = new jru(paramContext, new kcg(paramContext, paramInt), str, localojl);
        localjru.i();
        if (!localjru.n()) {
          a.put(paramInt, localjru.a);
        }
      }
      else
      {
        ojj localojj2 = (ojj)a.get(paramInt);
        return localojj2;
      }
      localjru.c("EsTileSyncSettings");
    }
  }
  
  public static void a(ojl paramojl)
  {
    paramojl.h = Boolean.valueOf(true);
    paramojl.i = Boolean.valueOf(true);
    paramojl.d = Boolean.valueOf(true);
    paramojl.f = Boolean.valueOf(true);
    paramojl.b = Boolean.valueOf(true);
    paramojl.e = Boolean.valueOf(true);
    paramojl.j = Boolean.valueOf(true);
  }
  
  public static long b(Context paramContext, int paramInt)
  {
    return aum.b(paramContext, paramInt).b.intValue();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsp
 * JD-Core Version:    0.7.0.1
 */