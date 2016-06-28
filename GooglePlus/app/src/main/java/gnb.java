import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class gnb
  implements Parcelable, Cloneable
{
  public static final Parcelable.Creator<gnb> CREATOR = new gnc();
  public int a;
  public final jjd[] b;
  public final jgs[] c;
  public lhp[] d = new lhp[0];
  public hps[] e = new hps[0];
  
  gnb(Parcel paramParcel)
  {
    this.b = new jjd[paramParcel.readInt()];
    paramParcel.readTypedArray(this.b, jjd.CREATOR);
    this.c = new jgs[paramParcel.readInt()];
    paramParcel.readTypedArray(this.c, jgs.CREATOR);
    this.d = new lhp[paramParcel.readInt()];
    paramParcel.readTypedArray(this.d, lhp.CREATOR);
    this.e = new hps[paramParcel.readInt()];
    paramParcel.readTypedArray(this.e, hps.CREATOR);
    this.a = paramParcel.readInt();
  }
  
  public gnb(hps paramhps)
  {
    this.b = new jjd[0];
    this.c = new jgs[0];
    this.d = new lhp[0];
    this.e = new hps[1];
    this.e[0] = paramhps;
    this.a = 0;
  }
  
  public gnb(List<jjd> paramList, List<jgs> paramList1)
  {
    this(paramList, paramList1, null, paramList.size());
  }
  
  public gnb(List<jjd> paramList, List<jgs> paramList1, int paramInt)
  {
    this(paramList, null, null, paramInt);
  }
  
  public gnb(List<jjd> paramList, List<jgs> paramList1, List<hps> paramList2)
  {
    this(paramList, paramList1, null, 0);
    this.e = new hps[paramList2.size()];
    paramList2.toArray(this.e);
  }
  
  private gnb(List<jjd> paramList, List<jgs> paramList1, List<lhp> paramList2, int paramInt)
  {
    if (paramList != null)
    {
      this.b = new jjd[paramList.size()];
      paramList.toArray(this.b);
      if (paramList1 == null) {
        break label122;
      }
      this.c = new jgs[paramList1.size()];
      paramList1.toArray(this.c);
      label76:
      if (paramList2 == null) {
        break label133;
      }
      this.d = new lhp[paramList2.size()];
      paramList2.toArray(this.d);
    }
    for (;;)
    {
      this.a = paramInt;
      return;
      this.b = new jjd[0];
      break;
      label122:
      this.c = new jgs[0];
      break label76;
      label133:
      this.d = new lhp[0];
    }
  }
  
  public gnb(List<jjd> paramList, List<jgs> paramList1, List<lhp> paramList2, List<hps> paramList3, int paramInt)
  {
    this(paramList, paramList1, paramList2, paramInt);
    if (paramList3 != null)
    {
      this.e = new hps[paramList3.size()];
      paramList3.toArray(this.e);
    }
  }
  
  public gnb(jgs paramjgs)
  {
    this.b = new jjd[0];
    this.c = new jgs[1];
    this.d = new lhp[0];
    this.e = new hps[0];
    this.c[0] = paramjgs;
    this.a = paramjgs.d;
  }
  
  public gnb(jjd paramjjd)
  {
    this.b = new jjd[1];
    this.c = new jgs[0];
    this.d = new lhp[0];
    this.e = new hps[0];
    this.b[0] = paramjjd;
    this.a = 1;
  }
  
  public gnb(lhp paramlhp)
  {
    this.b = new jjd[0];
    this.c = new jgs[0];
    this.d = new lhp[1];
    this.d[0] = paramlhp;
    this.e = new hps[0];
    this.a = 0;
  }
  
  public gnb(jjd[] paramArrayOfjjd, jgs[] paramArrayOfjgs, lhp[] paramArrayOflhp, hps[] paramArrayOfhps)
  {
    if (paramArrayOfjjd != null) {
      this.b = paramArrayOfjjd;
    }
    for (this.a = this.b.length; paramArrayOfjgs != null; this.a = 0)
    {
      this.c = paramArrayOfjgs;
      while (i < paramArrayOfjgs.length)
      {
        this.a += paramArrayOfjgs[i].d;
        i++;
      }
      this.b = new jjd[0];
    }
    this.c = new jgs[0];
    if (paramArrayOflhp != null) {
      this.d = paramArrayOflhp;
    }
    if (paramArrayOfhps != null) {
      this.e = paramArrayOfhps;
    }
  }
  
  public static gnb a(gnb paramgnb)
  {
    if (paramgnb != null)
    {
      Arrays.sort(paramgnb.b);
      Arrays.sort(paramgnb.c);
    }
    return paramgnb;
  }
  
  public static gnb a(Iterable<gnb> paramIterable)
  {
    if (paramIterable == null) {
      return null;
    }
    LinkedHashSet localLinkedHashSet1 = new LinkedHashSet();
    LinkedHashSet localLinkedHashSet2 = new LinkedHashSet();
    LinkedHashSet localLinkedHashSet3 = new LinkedHashSet();
    LinkedHashSet localLinkedHashSet4 = new LinkedHashSet();
    int i = 0;
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      gnb localgnb = (gnb)localIterator.next();
      if (localgnb != null)
      {
        jjd[] arrayOfjjd = localgnb.b;
        if (arrayOfjjd != null) {
          Collections.addAll(localLinkedHashSet1, arrayOfjjd);
        }
        jgs[] arrayOfjgs = localgnb.c;
        if (arrayOfjgs != null) {
          Collections.addAll(localLinkedHashSet2, arrayOfjgs);
        }
        lhp[] arrayOflhp = localgnb.d;
        if (arrayOflhp != null) {
          Collections.addAll(localLinkedHashSet3, arrayOflhp);
        }
        hps[] arrayOfhps = localgnb.e;
        if (arrayOfhps != null) {
          Collections.addAll(localLinkedHashSet4, arrayOfhps);
        }
        i += localgnb.a;
      }
    }
    ArrayList localArrayList1 = new ArrayList(localLinkedHashSet1);
    Collections.sort(localArrayList1);
    ArrayList localArrayList2 = new ArrayList(localLinkedHashSet2);
    Collections.sort(localArrayList2);
    ArrayList localArrayList3 = new ArrayList(localLinkedHashSet3);
    Collections.sort(localArrayList3);
    ArrayList localArrayList4 = new ArrayList(localLinkedHashSet4);
    Collections.sort(localArrayList4);
    return new gnb(localArrayList1, localArrayList2, localArrayList3, localArrayList4, i);
  }
  
  @Deprecated
  public static gnb a(List<Parcelable> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    int i = paramList.size();
    int j = 0;
    if (j < i)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(j);
      if ((localParcelable instanceof jmm))
      {
        jgw localjgw = ((jmm)localParcelable).a;
        localArrayList1.add(new jgs(localjgw.b(), localjgw.e(), localjgw.c(), localjgw.f()));
      }
      for (;;)
      {
        j++;
        break;
        if ((localParcelable instanceof jne))
        {
          jjg localjjg = ((jne)localParcelable).a;
          boolean bool1 = ((jne)localParcelable).b;
          String str1;
          label219:
          String str2;
          String str3;
          String str4;
          boolean bool2;
          if (new jjf(localjjg.a()).a)
          {
            String str5 = localjjg.a();
            if ((str5 != null) && (str5.length() > 2) && (str5.startsWith("e:")))
            {
              str1 = str5.substring(2);
              str2 = localjjg.c();
              str3 = localjjg.d();
              str4 = localjjg.e();
              if (localjjg.k() != 2) {
                break label309;
              }
              bool2 = true;
              label260:
              if (bool1) {
                break label315;
              }
            }
          }
          label309:
          label315:
          for (boolean bool3 = true;; bool3 = false)
          {
            localArrayList2.add(new jjd(str2, str3, str1, str4, bool2, bool3));
            break;
            str1 = null;
            break label219;
            str1 = null;
            break label219;
            bool2 = false;
            break label260;
          }
        }
        if ((localParcelable instanceof lgu))
        {
          localArrayList3.add(((lgu)localParcelable).a);
        }
        else
        {
          if (!(localParcelable instanceof hpp)) {
            break label374;
          }
          localArrayList4.add(((hpp)localParcelable).a);
        }
      }
      label374:
      throw new IllegalStateException(String.format("unknown item in selection %s", new Object[] { localParcelable }));
    }
    return new gnb(localArrayList2, localArrayList1, localArrayList3, localArrayList4, i);
  }
  
  private static String a(Resources paramResources, hps paramhps)
  {
    if ((paramhps != null) && (!TextUtils.isEmpty(paramhps.b))) {
      return paramhps.b;
    }
    return paramResources.getString(aw.ar);
  }
  
  private static String a(Resources paramResources, jgs paramjgs)
  {
    String str = paramjgs.b;
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    return paramResources.getString(aw.ar);
  }
  
  private static String a(Resources paramResources, jjd paramjjd)
  {
    String str1 = paramjjd.b;
    String str2 = paramjjd.c;
    if (!TextUtils.isEmpty(str1)) {
      return str1;
    }
    if (!TextUtils.isEmpty(str2)) {
      return str2;
    }
    return paramResources.getString(17039374);
  }
  
  private static String a(Resources paramResources, lhp paramlhp)
  {
    String str1 = paramlhp.b;
    String str2 = paramlhp.d;
    if (!TextUtils.isEmpty(str1))
    {
      if (!TextUtils.isEmpty(str2)) {
        str1 = paramResources.getString(aw.as, new Object[] { str1, str2 });
      }
      return str1;
    }
    return paramResources.getString(aw.at);
  }
  
  public static boolean a(gnb paramgnb1, gnb paramgnb2)
  {
    if (paramgnb1 == paramgnb2) {
      return true;
    }
    if ((paramgnb1 == null) || (paramgnb2 == null) || (paramgnb1.b.length != paramgnb2.b.length) || (paramgnb1.c.length != paramgnb2.c.length) || (paramgnb1.d.length != paramgnb2.d.length) || (paramgnb1.e.length != paramgnb2.e.length)) {
      return false;
    }
    HashSet localHashSet = new HashSet();
    if (paramgnb1.b.length > 0)
    {
      localHashSet.clear();
      jjd[] arrayOfjjd1 = paramgnb1.b;
      int i8 = arrayOfjjd1.length;
      for (int i9 = 0; i9 < i8; i9++) {
        localHashSet.add(arrayOfjjd1[i9].a);
      }
      jjd[] arrayOfjjd2 = paramgnb2.b;
      int i10 = arrayOfjjd2.length;
      for (int i11 = 0; i11 < i10; i11++) {
        if (!localHashSet.contains(arrayOfjjd2[i11].a)) {
          return false;
        }
      }
    }
    if (paramgnb1.c.length > 0)
    {
      localHashSet.clear();
      jgs[] arrayOfjgs1 = paramgnb1.c;
      int i4 = arrayOfjgs1.length;
      for (int i5 = 0; i5 < i4; i5++) {
        localHashSet.add(arrayOfjgs1[i5].a);
      }
      jgs[] arrayOfjgs2 = paramgnb2.c;
      int i6 = arrayOfjgs2.length;
      for (int i7 = 0; i7 < i6; i7++) {
        if (!localHashSet.contains(arrayOfjgs2[i7].a)) {
          return false;
        }
      }
    }
    if (paramgnb1.d.length > 0)
    {
      localHashSet.clear();
      lhp[] arrayOflhp1 = paramgnb1.d;
      int n = arrayOflhp1.length;
      int i1 = 0;
      if (i1 < n)
      {
        lhp locallhp2 = arrayOflhp1[i1];
        String str4 = String.valueOf(locallhp2.a);
        String str5 = String.valueOf(locallhp2.c);
        if (str5.length() != 0) {}
        for (String str6 = str4.concat(str5);; str6 = new String(str4))
        {
          localHashSet.add(str6);
          i1++;
          break;
        }
      }
      for (lhp locallhp1 : paramgnb2.d)
      {
        String str1 = String.valueOf(locallhp1.a);
        String str2 = String.valueOf(locallhp1.c);
        if (str2.length() != 0) {}
        for (String str3 = str1.concat(str2); !localHashSet.contains(str3); str3 = new String(str1)) {
          return false;
        }
      }
    }
    if (paramgnb1.e.length > 0)
    {
      localHashSet.clear();
      hps[] arrayOfhps1 = paramgnb1.e;
      int i = arrayOfhps1.length;
      for (int j = 0; j < i; j++) {
        localHashSet.add(arrayOfhps1[j].a);
      }
      hps[] arrayOfhps2 = paramgnb2.e;
      int k = arrayOfhps2.length;
      for (int m = 0; m < k; m++) {
        if (!localHashSet.contains(arrayOfhps2[m].a)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static gnb b(gnb paramgnb1, gnb paramgnb2)
  {
    int i = 0;
    ArrayList localArrayList1 = new ArrayList(Arrays.asList(paramgnb1.b));
    ArrayList localArrayList2 = new ArrayList(Arrays.asList(paramgnb1.c));
    ArrayList localArrayList3 = new ArrayList(Arrays.asList(paramgnb1.d));
    ArrayList localArrayList4 = new ArrayList(Arrays.asList(paramgnb1.e));
    jjd[] arrayOfjjd = paramgnb2.b;
    int j = arrayOfjjd.length;
    for (int k = 0; k < j; k++) {
      localArrayList1.remove(arrayOfjjd[k]);
    }
    jgs[] arrayOfjgs = paramgnb2.c;
    int m = arrayOfjgs.length;
    for (int n = 0; n < m; n++) {
      localArrayList2.remove(arrayOfjgs[n]);
    }
    lhp[] arrayOflhp = paramgnb2.d;
    int i1 = arrayOflhp.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localArrayList3.remove(arrayOflhp[i2]);
    }
    hps[] arrayOfhps = paramgnb2.e;
    int i3 = arrayOfhps.length;
    while (i < i3)
    {
      localArrayList4.remove(arrayOfhps[i]);
      i++;
    }
    return new gnb(localArrayList1, localArrayList2, localArrayList3, localArrayList4, localArrayList1.size());
  }
  
  public final int a()
  {
    return Math.max(0, this.a - this.b.length);
  }
  
  public final String a(Context paramContext)
  {
    int i = 0;
    Resources localResources = paramContext.getResources();
    String str = localResources.getString(aw.ao);
    int j = this.c.length + this.b.length + this.d.length + this.e.length;
    StringBuilder localStringBuilder = new StringBuilder();
    jgs[] arrayOfjgs = this.c;
    int k = arrayOfjgs.length;
    int m = 0;
    int i8;
    for (int n = 0; m < k; n = i8)
    {
      localStringBuilder.append(a(localResources, arrayOfjgs[m]));
      i8 = n + 1;
      if (i8 < j) {
        localStringBuilder.append(str);
      }
      m++;
    }
    jjd[] arrayOfjjd = this.b;
    int i1 = arrayOfjjd.length;
    int i2 = 0;
    while (i2 < i1)
    {
      localStringBuilder.append(a(localResources, arrayOfjjd[i2]));
      int i7 = n + 1;
      if (i7 < j) {
        localStringBuilder.append(str);
      }
      i2++;
      n = i7;
    }
    lhp[] arrayOflhp = this.d;
    int i3 = arrayOflhp.length;
    int i4 = 0;
    while (i4 < i3)
    {
      localStringBuilder.append(a(localResources, arrayOflhp[i4]));
      int i6 = n + 1;
      if (i6 < j) {
        localStringBuilder.append(str);
      }
      i4++;
      n = i6;
    }
    hps[] arrayOfhps = this.e;
    int i5 = arrayOfhps.length;
    while (i < i5)
    {
      localStringBuilder.append(a(localResources, arrayOfhps[i]));
      n++;
      if (n < j) {
        localStringBuilder.append(str);
      }
      i++;
    }
    return localStringBuilder.toString();
  }
  
  public final String b(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    ArrayList localArrayList = new ArrayList();
    jgs[] arrayOfjgs = this.c;
    int i = arrayOfjgs.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(a(localResources, arrayOfjgs[j]));
    }
    lhp[] arrayOflhp = this.d;
    int k = arrayOflhp.length;
    for (int m = 0; m < k; m++) {
      localArrayList.add(a(localResources, arrayOflhp[m]));
    }
    hps[] arrayOfhps = this.e;
    int n = arrayOfhps.length;
    for (int i1 = 0; i1 < n; i1++) {
      localArrayList.add(a(localResources, arrayOfhps[i1]));
    }
    if (localArrayList.size() > 2) {}
    for (int i2 = 1;; i2 = 0)
    {
      jjd[] arrayOfjjd = this.b;
      int i3 = arrayOfjjd.length;
      for (int i4 = 0; i4 < i3; i4++) {
        localArrayList.add(a(localResources, arrayOfjjd[i4]));
      }
    }
    switch (localArrayList.size())
    {
    default: 
      if (i2 != 0)
      {
        int i9 = aw.an;
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = localArrayList.get(0);
        arrayOfObject4[1] = localArrayList.get(1);
        return localResources.getString(i9, arrayOfObject4);
      }
      break;
    case 0: 
      return "";
    case 1: 
      return (String)localArrayList.get(0);
    case 2: 
      int i6 = aw.al;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = localArrayList.get(0);
      arrayOfObject2[1] = localArrayList.get(1);
      return localResources.getString(i6, arrayOfObject2);
    case 3: 
      int i5 = aw.am;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = localArrayList.get(0);
      arrayOfObject1[1] = localArrayList.get(1);
      arrayOfObject1[2] = localArrayList.get(2);
      return localResources.getString(i5, arrayOfObject1);
    }
    int i7 = -2 + localArrayList.size();
    int i8 = efj.DM;
    Object[] arrayOfObject3 = new Object[3];
    arrayOfObject3[0] = localArrayList.get(0);
    arrayOfObject3[1] = localArrayList.get(1);
    arrayOfObject3[2] = Integer.valueOf(i7);
    return localResources.getQuantityString(i8, i7, arrayOfObject3);
  }
  
  public final boolean b()
  {
    return (this.b.length == 0) && (this.c.length == 0) && (this.d.length == 0) && (this.e.length == 0);
  }
  
  public final boolean b(gnb paramgnb)
  {
    jjd[] arrayOfjjd = paramgnb.b;
    int i = arrayOfjjd.length;
    for (int j = 0; j < i; j++) {
      if (!arrayOfjjd[j].a(this.b)) {
        return false;
      }
    }
    jgs[] arrayOfjgs = paramgnb.c;
    int k = arrayOfjgs.length;
    for (int m = 0;; m++)
    {
      if (m >= k) {
        break label81;
      }
      if (!arrayOfjgs[m].a(this.c)) {
        break;
      }
    }
    label81:
    lhp[] arrayOflhp = paramgnb.d;
    int n = arrayOflhp.length;
    for (int i1 = 0;; i1++)
    {
      if (i1 >= n) {
        break label123;
      }
      if (!arrayOflhp[i1].a(this.d)) {
        break;
      }
    }
    label123:
    hps[] arrayOfhps = paramgnb.e;
    int i2 = arrayOfhps.length;
    for (int i3 = 0;; i3++)
    {
      if (i3 >= i2) {
        break label165;
      }
      if (!arrayOfhps[i3].a(this.e)) {
        break;
      }
    }
    label165:
    return true;
  }
  
  public final boolean c()
  {
    return (this.c.length == 1) && (101 == this.c[0].c);
  }
  
  @Deprecated
  public final ArrayList<Parcelable> d()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.c.length; i++)
    {
      jgs localjgs = this.c[i];
      jmo localjmo = jmm.a();
      localjmo.a = new gni(localjgs);
      localArrayList.add(new jmm(localjmo));
    }
    int j = 0;
    if (j < this.b.length)
    {
      jjd localjjd = this.b[j];
      jng localjng = jne.a();
      localjng.a = new gnn(localjjd);
      if (!localjjd.f) {}
      for (boolean bool = true;; bool = false)
      {
        localjng.b = bool;
        localArrayList.add(new jne(localjng));
        j++;
        break;
      }
    }
    int n;
    for (int k = 0;; k++)
    {
      int m = this.e.length;
      n = 0;
      if (k >= m) {
        break;
      }
      hps localhps = this.e[k];
      hpr localhpr = hpp.a();
      localhpr.a = localhps;
      localArrayList.add(new hpp(localhpr));
    }
    while (n < this.d.length)
    {
      lhp locallhp = this.d[n];
      lgw locallgw = lgu.a();
      locallgw.a = locallhp;
      localArrayList.add(new lgu(locallgw));
      n++;
    }
    return localArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof gnb))
    {
      gnb localgnb = (gnb)paramObject;
      if ((this.a == localgnb.a) && (Arrays.equals(this.b, localgnb.b)) && (Arrays.equals(this.c, localgnb.c)) && (Arrays.equals(this.d, localgnb.d)) && (Arrays.equals(this.e, localgnb.e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 * (527 + this.a) + Arrays.hashCode(this.b)) + Arrays.hashCode(this.c)) + Arrays.hashCode(this.d)) + Arrays.hashCode(this.e);
  }
  
  public final String toString()
  {
    return "Audience circles: " + Arrays.asList(this.c) + ", users: " + Arrays.asList(this.b) + ", squares: " + Arrays.asList(this.d) + ", clx: " + Arrays.asList(this.e) + ", hidden users: " + a();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.b.length);
    paramParcel.writeTypedArray(this.b, 0);
    paramParcel.writeInt(this.c.length);
    paramParcel.writeTypedArray(this.c, 0);
    paramParcel.writeInt(this.d.length);
    paramParcel.writeTypedArray(this.d, 0);
    paramParcel.writeInt(this.e.length);
    paramParcel.writeTypedArray(this.e, 0);
    paramParcel.writeInt(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gnb
 * JD-Core Version:    0.7.0.1
 */