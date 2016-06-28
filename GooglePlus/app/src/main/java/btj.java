import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class btj
  implements bti
{
  public static final Parcelable.Creator<btj> CREATOR = new btk();
  private isq a;
  private buy[] b;
  private boolean c;
  
  btj(Parcel paramParcel)
  {
    this.a = ((isq)paramParcel.readParcelable(isq.class.getClassLoader()));
    this.b = ((buy[])paramParcel.createTypedArray(buy.CREATOR));
  }
  
  public btj(isq paramisq)
  {
    this(paramisq, true);
  }
  
  public btj(isq paramisq, boolean paramBoolean)
  {
    this.a = paramisq;
    this.c = paramBoolean;
  }
  
  private static ArrayList<buy> a(String paramString1, List<Long> paramList, String paramString2)
  {
    Object localObject = null;
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      if (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        if (localLong == null) {}
        for (long l = 0L;; l = localLong.longValue())
        {
          localArrayList.add(new buy(paramString2, paramString1, l));
          break;
        }
      }
      localObject = localArrayList;
    }
    return localObject;
  }
  
  public final int a()
  {
    return this.a.b;
  }
  
  public final buy[] a(Context paramContext, int paramInt)
  {
    if (this.b != null) {
      return this.b;
    }
    ArrayList localArrayList1 = this.a.a(isp.class);
    ArrayList localArrayList2 = new ArrayList();
    int i = -1 + localArrayList1.size();
    if (i >= 0)
    {
      isp localisp = (isp)localArrayList1.get(i);
      ArrayList localArrayList6;
      ipf localipf;
      int j;
      if ((localisp instanceof jpu))
      {
        jpu localjpu = (jpu)localisp;
        localArrayList6 = new ArrayList();
        localipf = localjpu.b;
        if (localipf.d != null)
        {
          j = 1;
          label97:
          if (j == 0) {
            break label161;
          }
          hco localhco = hco.a(paramContext);
          String str2 = localipf.d.toString();
          localArrayList6.add(new buy(localhco.a(str2, false), str2));
          label141:
          localArrayList2.addAll(localArrayList6);
        }
      }
      label161:
      label251:
      bpr localbpr;
      boolean bool;
      ArrayList localArrayList3;
      apm localapm;
      ArrayList localArrayList4;
      for (;;)
      {
        i--;
        break;
        j = 0;
        break label97;
        if (localipf.a != null) {}
        for (int k = 1;; k = 0)
        {
          if (k == 0) {
            break label251;
          }
          List localList = jrf.b(paramContext, paramInt, localipf.a);
          if ((localList.isEmpty()) && (localipf.b.a != 0L)) {
            localList.add(Long.valueOf(localipf.b.a));
          }
          localArrayList6.addAll(a(null, localList, null));
          break;
        }
        break label141;
        if ((localisp instanceof bpr))
        {
          localbpr = (bpr)localisp;
          bool = this.c;
          localArrayList3 = new ArrayList();
          localapm = apk.a(paramContext, paramInt, Long.valueOf(localbpr.a), apn.a);
          if (localapm != null) {
            break label327;
          }
          localArrayList4 = new ArrayList(0);
          localArrayList2.addAll(localArrayList4);
        }
      }
      label327:
      if (!TextUtils.isEmpty(localapm.e)) {
        localArrayList3.add(new buy(hco.a(paramContext).a(localapm.e, false), localapm.e));
      }
      String str1 = jqx.b(paramContext, paramInt, localbpr.a);
      ArrayList localArrayList5 = a(localapm.e, jqx.a(paramContext, paramInt, localbpr.a), str1);
      if (!localArrayList5.isEmpty())
      {
        if (!bool) {
          break label431;
        }
        localArrayList3.addAll(localArrayList5);
      }
      for (;;)
      {
        localArrayList4 = localArrayList3;
        break;
        label431:
        localArrayList3.add(localArrayList5.get(0));
      }
    }
    this.b = ((buy[])localArrayList2.toArray(new buy[localArrayList2.size()]));
    return this.b;
  }
  
  public final ArrayList<ipf> b()
  {
    ArrayList localArrayList1 = this.a.a(isp.class);
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      isp localisp = (isp)localIterator.next();
      if ((localisp instanceof jpu)) {
        localArrayList2.add(((jpu)localisp).b);
      } else if ((localisp instanceof bpr)) {
        localArrayList2.add(((bpr)localisp).b);
      }
    }
    return localArrayList2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeTypedArray(this.b, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btj
 * JD-Core Version:    0.7.0.1
 */