import android.annotation.TargetApi;
import android.mtp.MtpDevice;
import android.mtp.MtpObjectInfo;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

@TargetApi(12)
public final class ihs
  implements Runnable
{
  static iht a = new iht();
  private final MtpDevice b;
  private ihp c;
  private final long d;
  private ihw e = new ihw();
  
  ihs(ihp paramihp)
  {
    this.c = paramihp;
    this.b = paramihp.a();
    this.d = paramihp.d;
  }
  
  private int a(SortedMap<ihw, List<ihk>> paramSortedMap)
  {
    int[] arrayOfInt1 = this.b.getStorageIds();
    int i = arrayOfInt1.length;
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      int m = arrayOfInt1[j];
      if (!this.c.a(this.b, this.d)) {
        throw new ihu(this);
      }
      Stack localStack = new Stack();
      localStack.add(Integer.valueOf(-1));
      int i4;
      for (n = k; !localStack.isEmpty(); n = i4)
      {
        if (!this.c.a(this.b, this.d)) {
          throw new ihu(this);
        }
        int i1 = ((Integer)localStack.pop()).intValue();
        int[] arrayOfInt2 = this.b.getObjectHandles(m, 0, i1);
        int i2 = arrayOfInt2.length;
        int i3 = 0;
        i4 = n;
        if (i3 < i2)
        {
          int i5 = arrayOfInt2[i3];
          MtpObjectInfo localMtpObjectInfo = this.b.getObjectInfo(i5);
          if (localMtpObjectInfo == null) {
            throw new ihu(this);
          }
          int i6 = localMtpObjectInfo.getFormat();
          if (i6 == 12289) {
            localStack.add(Integer.valueOf(i5));
          }
          for (;;)
          {
            i3++;
            break;
            int i7;
            int i8;
            ihk localihk;
            ihw localihw;
            long l;
            if ((ihp.a.contains(Integer.valueOf(i6))) || (ihp.b.contains(Integer.valueOf(i6))))
            {
              i7 = 1;
              if (i7 != 0)
              {
                i8 = i4 + 1;
                localihk = new ihk(localMtpObjectInfo);
                localihw = this.e;
                l = localihk.b;
              }
            }
            else
            {
              synchronized (ihw.f)
              {
                ihw.f.setTimeInMillis(l);
                localihw.b = ihw.f.get(5);
                localihw.a = ihw.f.get(2);
                localihw.c = ihw.f.get(1);
                localihw.d = l;
                localihw.e = DateFormat.getDateInstance(3).format(Long.valueOf(l));
                Object localObject2 = (List)paramSortedMap.get(this.e);
                if (localObject2 == null)
                {
                  localObject2 = new ArrayList();
                  paramSortedMap.put(this.e, localObject2);
                  this.e = new ihw();
                }
                ((List)localObject2).add(localihk);
                this.c.a(localihk, i8);
                i4 = i8;
                continue;
                i7 = 0;
              }
            }
          }
        }
      }
      j++;
    }
    return k;
  }
  
  public final void run()
  {
    try
    {
      TreeMap localTreeMap = new TreeMap();
      int i = a(localTreeMap);
      this.c.e();
      int j = localTreeMap.size();
      ihh[] arrayOfihh = new ihh[j];
      ihk[] arrayOfihk = new ihk[i];
      int[] arrayOfInt = new int[i + j];
      int k = 0;
      int m = 0;
      Iterator localIterator = localTreeMap.entrySet().iterator();
      int n = 0;
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        List localList = (List)localEntry.getValue();
        Collections.sort(localList);
        int i1 = localList.size();
        int i2 = 1 + (k + i1);
        Arrays.fill(arrayOfInt, k, i2, n);
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = m;
        while (i4 < i1)
        {
          arrayOfihk[i5] = ((ihk)localList.get(i4));
          i5++;
          i4++;
        }
        arrayOfihh[n] = new ihh((ihw)localEntry.getKey(), k, i3, m, i1);
        n++;
        m = i5;
        k = i2;
      }
      if (!this.c.a(this.b, this.d, new ihv(arrayOfInt, arrayOfihk, arrayOfihh))) {
        throw new ihu(this);
      }
    }
    catch (ihu localihu)
    {
      this.c.a(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihs
 * JD-Core Version:    0.7.0.1
 */