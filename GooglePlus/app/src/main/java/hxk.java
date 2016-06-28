import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

public final class hxk
{
  private static String c;
  private static String d;
  public List<hxm> a;
  public Calendar b;
  private kp<hxl> e;
  
  public hxk(Context paramContext)
  {
    a(paramContext);
  }
  
  public static long a(TimeZone paramTimeZone, Calendar paramCalendar)
  {
    int i = paramCalendar.get(0);
    int j = paramCalendar.get(1);
    int k = paramCalendar.get(5);
    int m = paramCalendar.get(2);
    int n = paramCalendar.get(11);
    int i1 = paramCalendar.get(12);
    return paramTimeZone.getOffset(i, j, m, k, paramCalendar.get(7), 60000 * (i1 + n * 60));
  }
  
  public static TimeZone a(String paramString)
  {
    TimeZone localTimeZone;
    if (TextUtils.isEmpty(paramString)) {
      localTimeZone = TimeZone.getDefault();
    }
    do
    {
      return localTimeZone;
      localTimeZone = TimeZone.getTimeZone(paramString);
    } while ((localTimeZone != null) && (a(paramString, localTimeZone.getID())));
    return TimeZone.getDefault();
  }
  
  private static kp<hxl> a(String[] paramArrayOfString, String paramString, Calendar paramCalendar)
  {
    kp localkp = new kp();
    TimeZone localTimeZone1 = paramCalendar.getTimeZone();
    long l1 = a(localTimeZone1, paramCalendar);
    int i = -1 + paramArrayOfString.length;
    if (i >= 0)
    {
      TimeZone localTimeZone2 = a(paramArrayOfString[i]);
      long l2 = a(localTimeZone2, paramCalendar);
      hxl localhxl2 = (hxl)localkp.a(l2);
      if (localhxl2 == null)
      {
        localhxl2 = new hxl();
        localkp.a(l2, localhxl2);
      }
      hxm localhxm = new hxm(localTimeZone2);
      localhxm.b = l2;
      String str1 = localTimeZone2.getDisplayName();
      String str2 = hxl.a(localTimeZone2, l2);
      boolean bool = a(localTimeZone2.getID(), localTimeZone1.getID());
      String str3 = hxl.a(localTimeZone1, l1);
      if ((!localhxl2.c.contains(str2)) && ((bool) || (!TextUtils.equals(str3, str2))))
      {
        if ((paramString == null) || (!str1.startsWith(paramString))) {
          break label210;
        }
        localhxl2.b.add(localhxm);
      }
      for (;;)
      {
        localhxl2.c.add(str2);
        i--;
        break;
        label210:
        localhxl2.a.add(localhxm);
      }
    }
    if (localkp.b) {
      localkp.a();
    }
    for (int j = -1 + localkp.e; j >= 0; j--)
    {
      hxl localhxl1 = (hxl)localkp.a(localkp.a(j));
      if ((localhxl1.a.isEmpty()) && (!localhxl1.b.isEmpty()))
      {
        Collections.sort(localhxl1.b);
        localhxl1.a.add(localhxl1.b.get(0));
      }
      localhxl1.b.clear();
      Collections.sort(localhxl1.a);
    }
    return localkp;
  }
  
  public static void a(Context paramContext)
  {
    if (c == null)
    {
      c = paramContext.getResources().getString(efj.LQ);
      d = paramContext.getResources().getString(efj.LP);
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      return TextUtils.equals(paramString1.toLowerCase(), paramString2.toLowerCase());
    }
    return false;
  }
  
  public final hxm a()
  {
    TimeZone localTimeZone = this.b.getTimeZone();
    return a(localTimeZone.getID(), Long.valueOf(a(localTimeZone, this.b)));
  }
  
  public final hxm a(String paramString, Long paramLong)
  {
    kp localkp1 = this.e;
    if (localkp1.b) {
      localkp1.a();
    }
    int i = localkp1.e;
    Object localObject1;
    if ((TextUtils.isEmpty(paramString)) && (paramLong == null))
    {
      localObject1 = a();
      return localObject1;
    }
    TimeZone localTimeZone = a(paramString);
    String str2;
    if (localTimeZone != null) {
      if (a(localTimeZone.getID(), paramString))
      {
        str2 = localTimeZone.getDisplayName();
        paramLong = Long.valueOf(a(localTimeZone, this.b));
      }
    }
    label297:
    label314:
    for (String str1 = str2;; str1 = null)
    {
      localObject1 = null;
      if (i <= 0) {
        break;
      }
      int j = 0;
      int k;
      Object localObject2;
      if (paramLong != null)
      {
        kp localkp2 = this.e;
        long l2 = paramLong.longValue();
        if (localkp2.b) {
          localkp2.a();
        }
        j = kn.a(localkp2.c, localkp2.e, l2);
        if (j < 0)
        {
          k = 0;
          localObject2 = null;
        }
      }
      for (;;)
      {
        int n;
        if (k < i)
        {
          long l1 = this.e.a(k);
          ArrayList localArrayList = ((hxl)this.e.a(l1)).a;
          int m = localArrayList.size();
          n = 0;
          label202:
          if (n < m)
          {
            localObject1 = (hxm)localArrayList.get(n);
            boolean bool = TextUtils.equals(((hxm)localObject1).a.getDisplayName(), str1);
            if ((l1 == paramLong.longValue()) && ((bool) || (TextUtils.isEmpty(str1)))) {
              break;
            }
            if ((!bool) && (n != 0)) {
              break label297;
            }
          }
        }
        for (;;)
        {
          n++;
          localObject2 = localObject1;
          break label202;
          if (paramLong != null) {
            break label314;
          }
          return a();
          k++;
          break;
          return localObject2;
          localObject1 = localObject2;
        }
        k = j;
        localObject2 = null;
      }
    }
  }
  
  public final void a(Calendar paramCalendar)
  {
    this.b = paramCalendar;
    this.a = new ArrayList();
    this.e = a(TimeZone.getAvailableIDs(), d, paramCalendar);
    int i = this.e.b();
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      long l = this.e.a(j);
      ArrayList localArrayList = ((hxl)this.e.a(l)).a;
      int m = localArrayList.size();
      n = k;
      int i1 = 0;
      while (i1 < m)
      {
        hxm localhxm = (hxm)localArrayList.get(i1);
        int i2 = n + 1;
        localhxm.c = n;
        this.a.add(localhxm);
        i1++;
        n = i2;
      }
      j++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxk
 * JD-Core Version:    0.7.0.1
 */