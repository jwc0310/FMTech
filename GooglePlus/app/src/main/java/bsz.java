import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.photos.phone.ManualAwesomeActivity;
import com.google.android.apps.plus.phone.HostSingleAlbumTileActivity;
import com.google.android.apps.plus.phone.SelectFromHomePhotosActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class bsz
{
  public static final String a = null;
  private static final ArrayList<btc> b;
  private static ArrayList<btc> c;
  private static long d = 0L;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    localArrayList.add(new bsx(aau.nq, aau.nr, efj.pA, 8, 1, 1, false));
    b.add(new bsx(aau.nb, aau.nc, efj.pg, 1, 2, 50, true));
    b.add(new bsx(aau.nj, aau.nk, efj.pz, 4, 2, 9, true));
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString, ArrayList<btc> paramArrayList, int paramInt2)
  {
    btc localbtc = a(paramArrayList, paramInt2);
    int i = 20;
    if (localbtc.f()) {
      i = 29;
    }
    jqa localjqa = new jqa(paramContext, HostSingleAlbumTileActivity.class, paramInt1);
    localjqa.a = paramString;
    localjqa.c = Integer.valueOf(2);
    localjqa.g = Boolean.valueOf(false);
    localjqa.h = Boolean.valueOf(false);
    localjqa.e = Integer.valueOf(0);
    localjqa.q = paramContext.getResources().getString(aau.jC);
    localjqa.r = Integer.valueOf(localbtc.d());
    localjqa.s = Integer.valueOf(localbtc.e());
    localjqa.t = Integer.valueOf(i);
    return localjqa.a();
  }
  
  public static Intent a(Context paramContext, int paramInt1, ArrayList<btc> paramArrayList, int paramInt2)
  {
    btc localbtc = a(paramArrayList, paramInt2);
    int i = 20;
    if (localbtc.f()) {
      i = 29;
    }
    dbt localdbt = new dbt(paramContext, SelectFromHomePhotosActivity.class, paramInt1);
    localdbt.a = Integer.valueOf(2);
    localdbt.e = Integer.valueOf(6);
    localdbt.b = Integer.valueOf(i);
    localdbt.d = Boolean.valueOf(true);
    localdbt.i = Boolean.valueOf(false);
    localdbt.j = paramContext.getResources().getString(aau.jC);
    localdbt.k = Integer.valueOf(localbtc.d());
    localdbt.l = Integer.valueOf(localbtc.e());
    return localdbt.a();
  }
  
  public static Intent a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, ManualAwesomeActivity.class);
    localIntent.putExtra("show_movie", paramBoolean);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  private static btc a(ArrayList<btc> paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {
      throw new RuntimeException("Manual awesome types not initialized");
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      btc localbtc = (btc)localIterator.next();
      if (localbtc.c() == paramInt) {
        return localbtc;
      }
    }
    throw new RuntimeException("Cannot recognize render type");
  }
  
  public static gxz a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 3: 
    default: 
      return gxz.dZ;
    case 1: 
      return gxz.dX;
    }
    return gxz.dY;
  }
  
  public static String a(Context paramContext, ArrayList<btc> paramArrayList, int paramInt)
  {
    btc localbtc = a(paramArrayList, paramInt);
    int i = localbtc.d();
    int j = localbtc.e();
    if (localbtc.f())
    {
      if (i == j)
      {
        Resources localResources2 = paramContext.getResources();
        int i1 = efj.xy;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(j);
        return localResources2.getQuantityString(i1, j, arrayOfObject4);
      }
      int n = aau.jF;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(i);
      arrayOfObject3[1] = Integer.valueOf(j);
      return paramContext.getString(n, arrayOfObject3);
    }
    if (i == j)
    {
      Resources localResources1 = paramContext.getResources();
      int m = efj.xz;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(j);
      return localResources1.getQuantityString(m, j, arrayOfObject2);
    }
    int k = aau.jG;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(i);
    arrayOfObject1[1] = Integer.valueOf(j);
    return paramContext.getString(k, arrayOfObject1);
  }
  
  public static ArrayList<btc> a(boolean paramBoolean)
  {
    if (System.currentTimeMillis() - d >= 18000000L) {
      c = null;
    }
    if (c == null) {
      return null;
    }
    if (paramBoolean) {
      return c;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      btc localbtc = (btc)localIterator.next();
      if (localbtc.c() != 8) {
        localArrayList.add(localbtc);
      }
    }
    return localArrayList;
  }
  
  public static void a()
  {
    d = 0L;
  }
  
  public static void a(ArrayList<btc> paramArrayList, Context paramContext)
  {
    if (b(paramArrayList, paramContext)) {
      c = paramArrayList;
    }
    ArrayList localArrayList;
    do
    {
      d = System.currentTimeMillis();
      return;
      localArrayList = b;
      c = localArrayList;
    } while (b(localArrayList, paramContext));
    throw new RuntimeException("Invalid default manual awesome types");
  }
  
  public static String b(Context paramContext, ArrayList<btc> paramArrayList, int paramInt)
  {
    return a(paramArrayList, paramInt).b(paramContext);
  }
  
  private static boolean b(ArrayList<btc> paramArrayList, Context paramContext)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return false;
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      btc localbtc = (btc)localIterator.next();
      if ((localbtc.c() == 0) || (localbtc.c() < 0) || (localbtc.d() <= 0) || (localbtc.d() > localbtc.e()) || (TextUtils.isEmpty(localbtc.a(paramContext))) || (TextUtils.isEmpty(localbtc.b(paramContext))) || (((localbtc.a() < 0) || (localbtc.b() != null)) && ((localbtc.a() != -1) || (localbtc.b() == null)))) {
        return false;
      }
    }
    return true;
  }
  
  public static String c(Context paramContext, ArrayList<btc> paramArrayList, int paramInt)
  {
    int i = aau.eC;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = a(paramArrayList, paramInt).a(paramContext);
    return paramContext.getString(i, arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsz
 * JD-Core Version:    0.7.0.1
 */