import android.content.Context;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class cll
  extends hqe<ArrayList<hur>>
{
  static HashSet<String> d = new HashSet();
  private int e;
  private long f;
  private List<ocr> h = null;
  private HashMap<String, bun> r = new HashMap();
  private ArrayList<cln> s;
  private final jiw t;
  
  public cll(Context paramContext, int paramInt, long paramLong, List<ocr> paramList)
  {
    super(paramContext);
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
    a(paramInt, 2147483647L, paramList);
  }
  
  public cll(Context paramContext, int paramInt, long paramLong, ocr paramocr)
  {
    super(paramContext);
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramocr);
    a(paramInt, 2147483647L, localArrayList);
  }
  
  private static String a(ocr paramocr, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramocr.a);
    ori localori;
    Integer localInteger1;
    int i;
    Integer localInteger2;
    int j;
    if (paramocr.c != null)
    {
      localori = paramocr.c;
      localStringBuilder.append('-').append(localori.b).append('-').append(localori.a);
      localInteger1 = localori.c;
      if (localInteger1 != null) {
        break label147;
      }
      i = 0;
      if (i != 0) {
        localStringBuilder.append('-').append(localori.c);
      }
      localInteger2 = localori.d;
      j = 0;
      if (localInteger2 != null) {
        break label157;
      }
    }
    for (;;)
    {
      if (j != 0) {
        localStringBuilder.append('-').append(localori.d);
      }
      if (paramBoolean) {
        localStringBuilder.append("-p");
      }
      return efj.C(localStringBuilder.toString());
      label147:
      i = localInteger1.intValue();
      break;
      label157:
      j = localInteger2.intValue();
    }
  }
  
  private final void a(int paramInt, long paramLong, List<ocr> paramList)
  {
    this.e = paramInt;
    this.f = paramLong;
    this.h = paramList;
    if (!this.g) {
      this.g = o();
    }
  }
  
  private final void a(ArrayList<hur> paramArrayList, hur paramhur)
  {
    Iterator localIterator = paramArrayList.iterator();
    int k;
    label66:
    int i;
    label89:
    int j;
    String str1;
    if (localIterator.hasNext())
    {
      hur localhur = (hur)localIterator.next();
      if (localhur.a != paramhur.a) {
        break label195;
      }
      if (((3 == localhur.a) || (2 == localhur.a)) && (localhur.b != null)) {
        break label189;
      }
      k = 1;
      if ((k == 0) && (!a(localhur.b, paramhur.b))) {
        break label195;
      }
      i = 1;
      if (i == 0) {
        break label199;
      }
      if (Log.isLoggable("PeopleViewLoader", 2))
      {
        j = localhur.a;
        if (localhur.b == null) {
          break label215;
        }
        String str2 = String.valueOf(localhur.b.a);
        if (str2.length() == 0) {
          break label201;
        }
        str1 = "; ".concat(str2);
      }
    }
    for (;;)
    {
      new StringBuilder(36 + String.valueOf(str1).length()).append("removing from responses: ").append(j).append(str1);
      localIterator.remove();
      return;
      label189:
      k = 0;
      break label66;
      label195:
      i = 0;
      break label89;
      label199:
      break;
      label201:
      str1 = new String("; ");
      continue;
      label215:
      str1 = "";
    }
  }
  
  public static boolean a(hur paramhur)
  {
    return a(paramhur.c);
  }
  
  public static boolean a(ArrayList<odg> paramArrayList)
  {
    if (d.isEmpty()) {
      return false;
    }
    Iterator localIterator = paramArrayList.iterator();
    boolean bool1 = false;
    if (localIterator.hasNext())
    {
      odg localodg = (odg)localIterator.next();
      if ((localodg.a == null) || (localodg.a.a == null)) {
        break label94;
      }
      String str = localodg.a.a.c;
      if (!d.contains(str)) {
        break label94;
      }
      localIterator.remove();
    }
    label94:
    for (boolean bool2 = true;; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
  
  private static boolean a(ocr paramocr)
  {
    return paramocr.b.intValue() == 10;
  }
  
  private final boolean a(ocr paramocr, bun parambun)
  {
    if (((3 == paramocr.a) || (2 == paramocr.a)) && (paramocr.c == null))
    {
      ArrayList localArrayList = parambun.a;
      int i = localArrayList.size();
      int j = 0;
      if (j < i)
      {
        hur localhur = (hur)localArrayList.get(j);
        ocr localocr1 = new ocr();
        localocr1.a = localhur.a;
        localocr1.c = localhur.b;
        localocr1.b = Integer.valueOf(10);
        localocr1.d = Boolean.valueOf(false);
        Iterator localIterator = this.h.iterator();
        label114:
        int m;
        label168:
        int k;
        if (localIterator.hasNext())
        {
          ocr localocr2 = (ocr)localIterator.next();
          if ((localocr2.a == localocr1.a) && (a(localocr2.c, localocr1.c)))
          {
            m = 1;
            if (m == 0) {
              break label241;
            }
            k = 1;
            label176:
            if (k == 0)
            {
              this.h.add(localocr1);
              if (Log.isLoggable("PeopleViewLoader", 2))
              {
                String str = String.valueOf(localocr1.c.a);
                if (str.length() == 0) {
                  break label249;
                }
                "queueing to all request: ".concat(str);
              }
            }
          }
        }
        for (;;)
        {
          j++;
          break;
          m = 0;
          break label168;
          label241:
          break label114;
          k = 0;
          break label176;
          label249:
          new String("queueing to all request: ");
        }
      }
      return true;
    }
    return false;
  }
  
  private static boolean a(ori paramori1, ori paramori2)
  {
    boolean bool1 = true;
    if ((paramori1 == null) && (paramori2 == null)) {
      return bool1;
    }
    if ((paramori1 == null) || (paramori2 == null)) {
      return false;
    }
    if ((paramori1.c != null) && (paramori2.c != null)) {}
    for (boolean bool2 = bool1; (bool2) && (!efj.a(paramori1.c, paramori2.c)); bool2 = false) {
      return false;
    }
    if ((paramori1.d != null) && (paramori2.d != null)) {}
    while ((bool1) && (!efj.a(paramori1.d, paramori2.d)))
    {
      return false;
      bool1 = false;
    }
    return TextUtils.equals(paramori1.a, paramori2.a);
  }
  
  private final bun b(ocr paramocr)
  {
    String str1 = a(paramocr, false);
    String str2 = String.valueOf(str1);
    byte[] arrayOfByte;
    if (str2.length() != 0)
    {
      "Cache: Looking for: ".concat(str2);
      bvc localbvc = bvc.a(this.l);
      arrayOfByte = localbvc.a(str1, this.f);
      if (a(paramocr))
      {
        if (arrayOfByte != null) {
          break label245;
        }
        str1 = a(paramocr, true);
        String str3 = String.valueOf(str1);
        if (str3.length() == 0) {
          break label231;
        }
        "Cache: Looking for: ".concat(str3);
        label88:
        arrayOfByte = localbvc.a(str1, this.f);
        if ((arrayOfByte == null) || (!Log.isLoggable("PeopleViewLoader", 2))) {}
      }
    }
    bun localbun;
    for (;;)
    {
      if (arrayOfByte == null) {
        break label266;
      }
      try
      {
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        localbun = new bun(localParcel);
        localParcel.recycle();
      }
      catch (Exception localException1)
      {
        return null;
      }
      try
      {
        if (Log.isLoggable("PeopleViewLoader", 2))
        {
          int i = localbun.a.size();
          new StringBuilder(40).append("loaded from cache; ").append(i).append(" responses");
        }
        this.r.put(str1, localbun);
        return localbun;
      }
      catch (Exception localException2)
      {
        return localbun;
      }
      new String("Cache: Looking for: ");
      break;
      label231:
      new String("Cache: Looking for: ");
      break label88;
      label245:
      paramocr.b = Integer.valueOf(50);
    }
    label266:
    return null;
  }
  
  private final kcp b(ArrayList<ocr> paramArrayList)
  {
    int i = this.e;
    kcp localkcp = kdg.a(this.l, new kcg(this.l, i));
    int j = paramArrayList.size();
    int k = 0;
    ArrayList localArrayList1 = null;
    Object localObject1 = null;
    ocr localocr;
    Object localObject2;
    if (k < j)
    {
      localocr = (ocr)paramArrayList.get(k);
      if ((localocr.a == 0) || (15 == localocr.a) || (1 == localocr.a))
      {
        if (localObject1 != null) {
          break label259;
        }
        localObject2 = new ArrayList();
      }
    }
    for (bkp localbkp1 = new bkp(this.l, i, (List)localObject2);; localbkp1 = null)
    {
      ((List)localObject2).add(localocr);
      bkp localbkp2 = localbkp1;
      localObject1 = localObject2;
      bkp localbkp3 = localbkp2;
      if (localbkp3 != null) {
        localkcp.a(localbkp3);
      }
      k++;
      break;
      if ((3 == localocr.a) || (2 == localocr.a))
      {
        if (localArrayList1 != null) {
          break label253;
        }
        localArrayList1 = new ArrayList();
      }
      label253:
      for (localbkp3 = new bkp(this.l, i, localArrayList1);; localbkp3 = null)
      {
        localArrayList1.add(localocr);
        break;
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(localocr);
        localbkp3 = new bkp(this.l, i, localArrayList2);
        break;
        return localkcp;
      }
      label259:
      localObject2 = localObject1;
    }
  }
  
  private ArrayList<hur> r()
  {
    int i = this.e;
    ArrayList localArrayList1 = new ArrayList();
    if ((this.h == null) || (this.h.size() == 0)) {
      return localArrayList1;
    }
    ArrayList localArrayList2 = new ArrayList();
    int j = 0;
    ocr localocr3;
    String str13;
    bun localbun3;
    bun localbun4;
    if (j < this.h.size())
    {
      localocr3 = (ocr)this.h.get(j);
      if (Log.isLoggable("PeopleViewLoader", 2))
      {
        int i15 = this.h.size();
        int i16 = localocr3.a;
        if (localocr3.c == null) {
          break label369;
        }
        String str14 = String.valueOf(localocr3.c.a);
        if (str14.length() != 0)
        {
          str13 = "; ".concat(str14);
          new StringBuilder(50 + String.valueOf(str13).length()).append(i15).append(" requests; processing type: ").append(i16).append(str13);
        }
      }
      else
      {
        String str10 = a(localocr3, false);
        localbun3 = (bun)this.r.get(str10);
        if (!a(localocr3)) {
          break label386;
        }
        if (localbun3 != null) {
          break label376;
        }
        String str12 = a(localocr3, true);
        localbun3 = (bun)this.r.get(str12);
        if ((localbun3 == null) || (!Log.isLoggable("PeopleViewLoader", 2))) {
          break label386;
        }
        localbun4 = localbun3;
        label255:
        if (localbun4 == null) {
          break label1940;
        }
      }
    }
    label386:
    label1155:
    label1940:
    for (bun localbun5 = new bun(localbun4);; localbun5 = localbun4)
    {
      if (localbun5 == null) {}
      for (bun localbun6 = b(localocr3);; localbun6 = localbun5)
      {
        if (localbun6 != null) {
          if (!a(localocr3, localbun6))
          {
            Iterator localIterator3 = localbun6.a.iterator();
            boolean bool3 = false;
            for (;;)
            {
              if (localIterator3.hasNext())
              {
                hur localhur4 = (hur)localIterator3.next();
                bool3 |= a(localhur4);
                localArrayList1.add(localhur4);
                continue;
                str13 = new String("; ");
                break;
                label369:
                str13 = "";
                break;
                label376:
                localocr3.b = Integer.valueOf(50);
                localbun4 = localbun3;
                break label255;
              }
            }
            if (bool3)
            {
              if (Log.isLoggable("PeopleViewLoader", 2))
              {
                int i14 = localocr3.a;
                new StringBuilder(49).append("need to update cache for request type=").append(i14);
              }
              if (this.s == null) {
                this.s = new ArrayList();
              }
              String str11 = a(localocr3, a(localocr3));
              this.s.add(new cln(str11, localbun6.a()));
            }
          }
        }
        for (;;)
        {
          j++;
          break;
          localArrayList2.add(localocr3);
        }
        ConditionVariable localConditionVariable = new ConditionVariable();
        kcp localkcp;
        HashMap localHashMap;
        ArrayList localArrayList3;
        int i1;
        if (!localArrayList2.isEmpty())
        {
          localkcp = b(localArrayList2);
          new Thread(new clm(this, localkcp, localConditionVariable), "PeopleViewLoader").start();
          localHashMap = s();
          localConditionVariable.block();
          if (localkcp != null)
          {
            localArrayList3 = localkcp.e;
            i1 = localArrayList3.size();
          }
        }
        else
        {
          label796:
          label939:
          label1605:
          for (int i2 = 0;; i2++)
          {
            if (i2 >= i1) {
              break label1611;
            }
            bkp localbkp = (bkp)localArrayList3.get(i2);
            if (Log.isLoggable("PeopleViewLoader", 2)) {
              new StringBuilder(25).append("processing op ").append(i2);
            }
            if (!localbkp.n())
            {
              ocr[] arrayOfocr = localbkp.a.a;
              odb[] arrayOfodb = localbkp.b.a;
              if (Log.isLoggable("PeopleViewLoader", 2))
              {
                int i12 = arrayOfocr.length;
                int i13 = arrayOfodb.length;
                new StringBuilder(43).append(i12).append(" requests; ").append(i13).append(" responses");
              }
              ArrayList localArrayList4 = new ArrayList();
              int i3 = arrayOfocr.length;
              for (int i4 = 0;; i4++)
              {
                if (i4 >= i3) {
                  break label1605;
                }
                ocr localocr1 = arrayOfocr[i4];
                String str8;
                int i5;
                label860:
                int i6;
                label868:
                int i7;
                label871:
                odb localodb2;
                String str6;
                if (Log.isLoggable("PeopleViewLoader", 2))
                {
                  int i11 = localocr1.a;
                  if (localocr1.c == null) {
                    break label1107;
                  }
                  String str9 = String.valueOf(localocr1.c.a);
                  if (str9.length() != 0)
                  {
                    str8 = "; ".concat(str9);
                    new StringBuilder(37 + String.valueOf(str8).length()).append("processing request, type: ").append(i11).append(str8);
                  }
                }
                else
                {
                  if (((3 == localocr1.a) || (2 == localocr1.a)) && (localocr1.c != null)) {
                    break label1114;
                  }
                  i5 = 1;
                  if (arrayOfodb != null) {
                    break label1120;
                  }
                  i6 = 0;
                  i7 = 0;
                  if (i7 >= i6) {
                    break label1155;
                  }
                  localodb2 = arrayOfodb[i7];
                  if (Log.isLoggable("PeopleViewLoader", 2))
                  {
                    int i10 = localodb2.b;
                    if (localodb2.d == null) {
                      break label1142;
                    }
                    String str7 = String.valueOf(localodb2.d.a);
                    if (str7.length() == 0) {
                      break label1128;
                    }
                    str6 = "; ".concat(str7);
                    new StringBuilder(36 + String.valueOf(str6).length()).append("checking response, type: ").append(i10).append(str6);
                  }
                  if ((localocr1.a == localodb2.b) && ((i5 != 0) || (a(localocr1.c, localodb2.d))))
                  {
                    localArrayList4.add(localodb2);
                    if ((localodb2.b == 15) && (!a(localocr1))) {
                      if ((localodb2.f == null) || (!localodb2.f.a.booleanValue())) {
                        break label1149;
                      }
                    }
                  }
                }
                label1107:
                label1114:
                label1120:
                label1128:
                label1142:
                label1149:
                for (boolean bool2 = true;; bool2 = false)
                {
                  bgp.a(this.l, i, localodb2.c, bool2);
                  i7++;
                  break label871;
                  localConditionVariable.open();
                  localkcp = null;
                  break;
                  str8 = new String("; ");
                  break label796;
                  str8 = "";
                  break label796;
                  i5 = 0;
                  break label860;
                  i6 = arrayOfodb.length;
                  break label868;
                  str6 = new String("; ");
                  break label939;
                  str6 = "";
                  break label939;
                }
                int i8 = localArrayList4.size();
                if (Log.isLoggable("PeopleViewLoader", 2)) {
                  new StringBuilder(26).append("total matches: ").append(i8);
                }
                bun localbun1 = new bun();
                String str4 = a(localocr1, a(localocr1));
                int i9 = 0;
                if (i9 < i8)
                {
                  odb localodb1 = (odb)localArrayList4.get(i9);
                  boolean bool1;
                  label1264:
                  hur localhur2;
                  if ((localodb1.f != null) && (localodb1.f.a.booleanValue()))
                  {
                    bool1 = true;
                    localhur2 = new hur(localodb1.b, localodb1.d, new ArrayList(Arrays.asList(localodb1.c)), bool1);
                    if (!d.isEmpty()) {
                      a(localhur2);
                    }
                    if (((3 != localocr1.a) && (2 != localocr1.a)) || (localocr1.c != null)) {
                      break label1526;
                    }
                    ocr localocr2 = new ocr();
                    localocr2.a = localocr1.a;
                    localocr2.c = localodb1.d;
                    String str5 = a(localocr2, a(localocr1));
                    bun localbun2 = new bun();
                    localbun2.a.add(localhur2);
                    if (this.s == null) {
                      this.s = new ArrayList();
                    }
                    ArrayList localArrayList5 = this.s;
                    cln localcln2 = new cln(str5, localbun2.a());
                    localArrayList5.add(localcln2);
                    this.r.put(str5, localbun2);
                    hur localhur3 = new hur(localodb1.b, localodb1.d, new ArrayList(), false);
                    localbun1.a.add(localhur3);
                  }
                  for (;;)
                  {
                    a(localArrayList1, localhur2);
                    localArrayList1.add(localhur2);
                    i9++;
                    break;
                    bool1 = false;
                    break label1264;
                    label1526:
                    localbun1.a.add(localhur2);
                  }
                }
                if (this.s == null) {
                  this.s = new ArrayList();
                }
                this.s.add(new cln(str4, localbun1.a()));
                this.r.put(str4, localbun1);
                localArrayList4.clear();
              }
            }
          }
        }
        label1611:
        if ((this.s != null) && (!this.s.isEmpty()))
        {
          bvc localbvc = bvc.a(this.l);
          Iterator localIterator2 = this.s.iterator();
          while (localIterator2.hasNext())
          {
            cln localcln1 = (cln)localIterator2.next();
            if (Log.isLoggable("PeopleViewLoader", 2))
            {
              String str3 = localcln1.a;
              int n = localcln1.b.length;
              new StringBuilder(28 + String.valueOf(str3).length()).append("   saving ").append(str3).append("; size=").append(n);
            }
            localbvc.a(localcln1.a, localcln1.b);
          }
          this.s.clear();
        }
        brn.a(localArrayList1, localHashMap);
        if (Log.isLoggable("PeopleViewLoader", 2))
        {
          Iterator localIterator1 = localArrayList1.iterator();
          if (localIterator1.hasNext())
          {
            hur localhur1 = (hur)localIterator1.next();
            int k = localhur1.a;
            String str1;
            if (localhur1.b != null)
            {
              String str2 = String.valueOf(localhur1.b.a);
              if (str2.length() != 0) {
                str1 = "; ".concat(str2);
              }
            }
            for (;;)
            {
              int m = localhur1.c.size();
              new StringBuilder(46 + String.valueOf(str1).length()).append("returning type=").append(k).append(str1).append("; ").append(m).append(" people");
              break;
              str1 = new String("; ");
              continue;
              str1 = "";
            }
          }
        }
        return localArrayList1;
      }
    }
  }
  
  private final HashMap<String, String> s()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.t.a(this.e, 0, jjh.a).iterator();
    while (localIterator.hasNext())
    {
      jjg localjjg = (jjg)localIterator.next();
      localHashMap.put(localjjg.c(), localjjg.j());
    }
    return localHashMap;
  }
  
  protected final void i()
  {
    super.i();
    if (this.h != null) {
      this.h.clear();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cll
 * JD-Core Version:    0.7.0.1
 */