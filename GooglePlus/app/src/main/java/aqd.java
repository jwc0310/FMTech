import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class aqd
  implements aqj
{
  private final Context a;
  private final int b;
  private final int c;
  private final boolean d;
  
  public aqd(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }
  
  private final atq a(asu paramasu)
  {
    return new atm(new apu(this.a, paramasu, this.b), aow.a.ordinal(), this.c, this.b);
  }
  
  public final aqc a(apz paramapz)
  {
    ArrayList localArrayList = new ArrayList();
    SparseArray localSparseArray1 = new SparseArray();
    int i = localArrayList.size();
    if (paramapz == null) {
      return null;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    SparseArray localSparseArray2 = paramapz.e;
    Integer localInteger = paramapz.b;
    Calendar localCalendar1 = Calendar.getInstance();
    Calendar localCalendar2 = Calendar.getInstance();
    Object localObject3 = null;
    Object localObject4 = null;
    int j = paramapz.a.length;
    int k = 0;
    long l1;
    long l2;
    int i2;
    label147:
    int i3;
    label195:
    int m;
    Object localObject7;
    Object localObject6;
    Object localObject5;
    label276:
    ast localast;
    if (k < j)
    {
      l1 = paramapz.a[k].a;
      l2 = paramapz.a[k].b;
      localCalendar2.setTimeInMillis(l2);
      if ((this.d) && (localObject3 != null) && (localObject1 != null)) {
        if ((l2 == 0L) && (localCalendar1.getTimeInMillis() != 0L))
        {
          i2 = 1;
          if ((localCalendar1.get(1) == localCalendar2.get(1)) && (localCalendar1.get(2) == localCalendar2.get(2)) && (localCalendar1.get(5) == localCalendar2.get(5))) {
            break label552;
          }
          i3 = 1;
          if ((i3 == 0) && (i2 == 0)) {
            break label564;
          }
          if ((localObject3.c + ((List)localObject1).size() < this.b) && (i2 == 0)) {
            break label558;
          }
          asu localasu2 = new asu((List)localObject1, (List)localObject2);
          localObject3.a(localasu2);
          localArrayList.add(a(localasu2));
          m = i + 1;
          localObject7 = null;
          localObject6 = null;
          localObject5 = null;
          if ((!this.d) || (localObject5 != null)) {
            break label617;
          }
          localast = new ast();
          localArrayList.add(new aot(this.a, localast, aow.j.ordinal()));
          m++;
        }
      }
    }
    label513:
    label552:
    label558:
    label564:
    label617:
    for (Object localObject8 = localast;; localObject8 = localObject5)
    {
      if (localObject7 == null)
      {
        localObject7 = new ArrayList();
        localObject6 = new ArrayList();
      }
      ((List)localObject7).add(Long.valueOf(l1));
      if (l2 > 0L) {
        ((List)localObject6).add(Long.valueOf(l2));
      }
      deu localdeu = (deu)localSparseArray2.get(k);
      if (localdeu != null) {
        localSparseArray1.put(m, localdeu);
      }
      if ((((List)localObject7).size() == this.b) || (k + 1 == j))
      {
        asu localasu1 = new asu((List)localObject7, (List)localObject6);
        if (localObject8 != null) {
          ((ast)localObject8).a(localasu1);
        }
        localArrayList.add(a(localasu1));
        localObject7 = null;
        localObject6 = null;
      }
      for (int n = m + 1;; n = m)
      {
        localCalendar1.setTimeInMillis(l2);
        int i1;
        if ((localInteger != null) && (localInteger.intValue() == k)) {
          if (n > 0) {
            i1 = n - 1;
          }
        }
        for (Object localObject9 = Integer.valueOf(i1);; localObject9 = localObject4)
        {
          k++;
          localObject4 = localObject9;
          localObject1 = localObject7;
          i = n;
          localObject2 = localObject6;
          localObject3 = localObject8;
          break;
          i2 = 0;
          break label147;
          i3 = 0;
          break label195;
          localObject3.b = true;
          localObject5 = localObject3;
          localObject6 = localObject2;
          localObject7 = localObject1;
          m = i;
          break label276;
          i1 = n;
          break label513;
          return new aqc(paramapz, localArrayList, localObject4, localSparseArray1);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqd
 * JD-Core Version:    0.7.0.1
 */