import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class isq
  implements Parcelable
{
  public static final Parcelable.Creator<isq> CREATOR = new iss();
  public Map<isn, Map<aip, isp>> a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  private int l;
  private int m;
  
  public isq()
  {
    this.a = new HashMap();
  }
  
  isq(Parcel paramParcel)
  {
    int n = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.l = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.m = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readInt();
    this.k = paramParcel.readInt();
    this.a = new HashMap(n);
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(isn.class.getClassLoader());
    for (int i1 = 0; i1 < n; i1++)
    {
      isn localisn = (isn)arrayOfParcelable[i1];
      Map localMap = a(paramParcel);
      this.a.put(localisn, localMap);
      this.b += localMap.size();
    }
  }
  
  private static Map<aip, isp> a(Parcel paramParcel)
  {
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(isp.class.getClassLoader());
    int n = arrayOfParcelable.length;
    HashMap localHashMap = new HashMap(n);
    for (int i1 = 0; i1 < n; i1++)
    {
      isp localisp = (isp)arrayOfParcelable[i1];
      localHashMap.put(localisp.b(), localisp);
    }
    return localHashMap;
  }
  
  public final int a(isn paramisn)
  {
    Map localMap = (Map)this.a.get(paramisn);
    if (localMap != null) {
      return localMap.size();
    }
    return 0;
  }
  
  public final isp a(isn paramisn, aip paramaip)
  {
    Map localMap = (Map)this.a.get(paramisn);
    if (localMap == null) {
      return null;
    }
    return (isp)localMap.get(paramaip);
  }
  
  public final isq a()
  {
    isq localisq = new isq();
    Iterator localIterator1 = this.a.keySet().iterator();
    while (localIterator1.hasNext())
    {
      isn localisn = (isn)localIterator1.next();
      Map localMap = (Map)this.a.get(localisn);
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        localisq.a((isp)localMap.get((aip)localIterator2.next()));
      }
    }
    return localisq;
  }
  
  public final <T extends isp> ArrayList<T> a(Class<T> paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.a.values().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((Map)localIterator1.next()).values().iterator();
      while (localIterator2.hasNext())
      {
        isp localisp = (isp)localIterator2.next();
        if (paramClass.isInstance(localisp)) {
          localArrayList.add(paramClass.cast(localisp));
        }
      }
    }
    Collections.sort(localArrayList, new isr(this));
    return localArrayList;
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int n = 1;; n = -1)
    {
      this.b = (n + this.b);
      if ((1L & paramLong) != 0L) {
        this.c = (n + this.c);
      }
      if ((0x2 & paramLong) == 0L) {
        this.d = (n + this.d);
      }
      if ((0x4 & paramLong) == 0L) {
        this.e = (n + this.e);
      }
      if ((0x8 & paramLong) != 0L) {
        this.l = (n + this.l);
      }
      if ((paramLong & 0x10) != 0L) {
        this.f = (n + this.f);
      }
      if ((0x20 & paramLong) != 0L)
      {
        this.g = (n + this.g);
        if ((paramLong & 0x10) != 0L) {
          this.h = (n + this.h);
        }
      }
      if ((0x40 & paramLong) == 0L) {
        this.i = (n + this.i);
      }
      if ((0x80 & paramLong) == 0L) {
        this.j = (n + this.j);
      }
      if ((0x100 & paramLong) != 0L) {
        this.k = (n + this.k);
      }
      return;
    }
  }
  
  public final void a(isp paramisp)
  {
    long l1 = paramisp.c();
    String str;
    if (Log.isLoggable("MediaSelection", 4))
    {
      str = String.valueOf(paramisp);
      if ((0x2 & l1) == 0L) {
        break label186;
      }
    }
    label186:
    for (boolean bool = true;; bool = false)
    {
      new StringBuilder(25 + String.valueOf(str).length()).append("Adding ").append(str).append(", deletable: ").append(bool);
      aip localaip = paramisp.b();
      isn localisn = paramisp.a();
      Object localObject = (Map)this.a.get(localisn);
      if (localObject == null) {
        localObject = new HashMap();
      }
      if (!((Map)localObject).containsKey(localaip)) {
        a(l1, true);
      }
      int n = this.m;
      this.m = (n + 1);
      paramisp.a(n);
      ((Map)localObject).put(localaip, paramisp);
      this.a.put(localisn, localObject);
      return;
    }
  }
  
  public final boolean b()
  {
    return (this.b > 0) && (this.f < this.b);
  }
  
  public final boolean b(isp paramisp)
  {
    isn localisn = paramisp.a();
    Map localMap = (Map)this.a.get(localisn);
    return (localMap != null) && (localMap.containsKey(paramisp.b()));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaSelection size=").append(this.b).append('\n');
    Iterator localIterator1 = this.a.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      localStringBuilder.append("  Group Key: ").append(localEntry.getKey()).append('\n');
      Iterator localIterator2 = ((Map)localEntry.getValue()).keySet().iterator();
      while (localIterator2.hasNext())
      {
        aip localaip = (aip)localIterator2.next();
        localStringBuilder.append("    ").append(localaip).append('\n');
      }
    }
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int n = this.a.size();
    paramParcel.writeInt(n);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    isn[] arrayOfisn = new isn[n];
    ArrayList localArrayList = new ArrayList(n);
    Iterator localIterator = this.a.entrySet().iterator();
    for (int i1 = 0; localIterator.hasNext(); i1++)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      arrayOfisn[i1] = ((isn)localEntry.getKey());
      localArrayList.add(i1, localEntry.getValue());
    }
    paramParcel.writeParcelableArray(arrayOfisn, 0);
    for (int i2 = 0; i2 < n; i2++)
    {
      Map localMap = (Map)localArrayList.get(i2);
      paramParcel.writeParcelableArray((isp[])localMap.values().toArray(new isp[localMap.size()]), 0);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isq
 * JD-Core Version:    0.7.0.1
 */