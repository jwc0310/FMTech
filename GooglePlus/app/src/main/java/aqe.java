import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class aqe
  implements aqj
{
  private final Context a;
  private final int b;
  
  public aqe(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((int)paramContext.getResources().getDimension(efj.mr));
  }
  
  private final atq a(List<Long> paramList1, List<Long> paramList2)
  {
    long l = ((Long)paramList2.get(0)).longValue();
    List localList = a(paramList1, apg.b());
    asu localasu = new asu(localList, a(paramList2, apg.b()));
    apu localapu = new apu(this.a, localasu, localList.size());
    int i = this.b;
    int j = this.b;
    localapu.a = i;
    localapu.b = j;
    return new apg(this.a, localasu, localapu, new Date(l));
  }
  
  private static <T> List<T> a(List<T> paramList, int paramInt)
  {
    if (paramList.size() <= paramInt) {
      return paramList;
    }
    ArrayList localArrayList = new ArrayList(paramInt);
    float f = paramList.size() / paramInt;
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(paramList.get((int)(f * i)));
    }
    return localArrayList;
  }
  
  public final aqc a(apz paramapz)
  {
    if (paramapz == null) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject3 = null;
    Integer localInteger = paramapz.b;
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = paramapz.e;
    int j = paramapz.a.length;
    int k = 0;
    deu localdeu1;
    int i3;
    label123:
    int i4;
    label152:
    int i5;
    int m;
    if (k < j)
    {
      localdeu1 = (deu)localSparseArray2.get(k);
      deu localdeu2 = (deu)localSparseArray1.valueAt(Math.max(0, -1 + localSparseArray1.size()));
      if (localdeu1 == null) {
        break label435;
      }
      if (localdeu2 != localdeu1)
      {
        i3 = 1;
        if ((localdeu2 == null) || (localdeu2.a.get(1) == localdeu1.a.get(1))) {
          break label372;
        }
        i4 = 1;
        i5 = i4;
        m = i3;
      }
    }
    for (int n = i5;; n = 0)
    {
      int i1;
      if ((m != 0) && (((List)localObject1).size() > 0))
      {
        localArrayList1.add(a((List)localObject1, (List)localObject2));
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList3 = new ArrayList();
        i1 = i + 1;
        localObject1 = localArrayList2;
        localObject2 = localArrayList3;
      }
      for (;;)
      {
        if (localdeu1 != null) {
          localSparseArray1.put(i1, localdeu1);
        }
        if (n != 0)
        {
          localArrayList1.add(new apj(this.a, new Date(paramapz.a[k].b)));
          i1++;
        }
        ((List)localObject1).add(Long.valueOf(paramapz.a[k].a));
        ((List)localObject2).add(Long.valueOf(paramapz.a[k].b));
        int i2;
        if ((localInteger != null) && (localInteger.intValue() == k)) {
          if (i1 > 0) {
            i2 = i1 - 1;
          }
        }
        label346:
        for (Object localObject4 = Integer.valueOf(i2);; localObject4 = localObject3)
        {
          k++;
          i = i1;
          localObject3 = localObject4;
          break;
          i3 = 0;
          break label123;
          label372:
          i4 = 0;
          break label152;
          i2 = i1;
          break label346;
          if (((List)localObject1).size() > 0) {
            localArrayList1.add(a((List)localObject1, (List)localObject2));
          }
          return new aqc(paramapz, localArrayList1, localObject3, localSparseArray1);
        }
        i1 = i;
      }
      label435:
      m = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqe
 * JD-Core Version:    0.7.0.1
 */