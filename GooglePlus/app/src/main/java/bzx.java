import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bzx
  extends hqj
{
  private static final String[] r = { "is_header", "_id", "person_id", "gaia_id", "avatar", "name", "email", "packed_circle_ids", "numaddguests", "readstate", "blacklisted", "rsvp", "is_past", "total_invitee_count", "add_invitee_count", "in_same_visibility_group", "verified" };
  private final int s;
  private final String t;
  private final String u;
  
  public bzx(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, hxi.a);
    this.t = paramString1;
    this.u = paramString2;
    this.s = paramInt;
  }
  
  private final HashMap<String, bzz> a(qbr[] paramArrayOfqbr)
  {
    localHashMap = new HashMap();
    int i = paramArrayOfqbr.length;
    for (int j = 0; j < i; j++)
    {
      qbr localqbr = paramArrayOfqbr[j];
      if ((localqbr.a != null) && (localqbr.a.c != null)) {
        localHashMap.put(localqbr.a.c, null);
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gaia_id IN(");
    for (int k = 0; k < localHashMap.size(); k++)
    {
      if (k > 0) {
        localStringBuilder.append(',');
      }
      localStringBuilder.append('?');
    }
    localStringBuilder.append(')');
    String str = localStringBuilder.toString();
    String[] arrayOfString = (String[])localHashMap.keySet().toArray(new String[0]);
    int m = this.s;
    Cursor localCursor = brn.a(this.l, m, null, str, arrayOfString, null);
    if (localCursor != null) {
      try
      {
        if (localCursor.moveToNext())
        {
          bzz localbzz = new bzz();
          localbzz.b = localCursor.getString(12);
          localbzz.a = localCursor.getString(5);
          localHashMap.put(localCursor.getString(11), localbzz);
        }
        return localHashMap;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  private final void a(hxj paramhxj, int paramInt, List<qbr> paramList, hqr paramhqr, HashMap<String, bzz> paramHashMap)
  {
    qbs localqbs = bqo.a(paramhxj.f().c, paramInt);
    int i = 0;
    int j = 0;
    if (j < paramList.size())
    {
      qbr localqbr2 = (qbr)paramList.get(j);
      Integer localInteger3;
      if (a(localqbr2.a))
      {
        localInteger3 = localqbr2.c;
        if (localInteger3 != null) {
          break label84;
        }
      }
      label84:
      for (int i7 = 0;; i7 = localInteger3.intValue())
      {
        i += i7 + 1;
        j++;
        break;
      }
    }
    int n;
    int i1;
    label179:
    label208:
    int i3;
    label281:
    Object[] arrayOfObject3;
    String str2;
    label339:
    Integer localInteger1;
    int i4;
    if (localqbs != null)
    {
      n = localqbs.b.intValue();
      if (n <= 0) {
        return;
      }
      boolean bool = bqo.a(paramhxj, System.currentTimeMillis());
      Object[] arrayOfObject1 = new Object[r.length];
      arrayOfObject1[0] = Integer.valueOf(0);
      arrayOfObject1[1] = Integer.valueOf(paramhqr.getCount());
      arrayOfObject1[11] = Integer.valueOf(paramInt);
      arrayOfObject1[13] = Integer.valueOf(n);
      if (!bool) {
        break label569;
      }
      i1 = 1;
      arrayOfObject1[12] = Integer.valueOf(i1);
      paramhqr.a(arrayOfObject1);
      if (paramList == null) {
        break label623;
      }
      Iterator localIterator = paramList.iterator();
      qbr localqbr1;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localqbr1 = (qbr)localIterator.next();
      } while ((localqbr1.a == null) || (!a(localqbr1.a)));
      String str1 = localqbr1.a.c;
      if ((localqbr1.e == null) || (!localqbr1.e.booleanValue())) {
        break label575;
      }
      i3 = 1;
      arrayOfObject3 = new Object[r.length];
      arrayOfObject3[0] = Integer.valueOf(1);
      arrayOfObject3[1] = Integer.valueOf(paramhqr.getCount());
      if (str1 == null) {
        break label595;
      }
      String str3 = String.valueOf(str1);
      if (str3.length() == 0) {
        break label581;
      }
      str2 = "g:".concat(str3);
      arrayOfObject3[2] = str2;
      arrayOfObject3[3] = str1;
      arrayOfObject3[5] = localqbr1.a.b;
      arrayOfObject3[6] = localqbr1.a.e;
      arrayOfObject3[11] = Integer.valueOf(paramInt);
      if (localqbr1.b != 1) {
        break label611;
      }
      localInteger1 = localqbr1.c;
      if (localInteger1 != null) {
        break label601;
      }
      i4 = 0;
      label409:
      arrayOfObject3[8] = Integer.valueOf(i4);
      arrayOfObject3[9] = Integer.valueOf(localqbr1.g);
      bzz localbzz = (bzz)paramHashMap.get(str1);
      if (localbzz != null)
      {
        arrayOfObject3[4] = localbzz.a;
        arrayOfObject3[7] = localbzz.b;
      }
      if (i3 == 0) {
        break label617;
      }
    }
    label569:
    label575:
    label581:
    label595:
    label601:
    label611:
    label617:
    for (int i5 = 1;; i5 = 0)
    {
      arrayOfObject3[10] = Integer.valueOf(i5);
      paramhqr.a(arrayOfObject3);
      break label208;
      int k = 0;
      int m = 0;
      if (m < paramList.size())
      {
        Integer localInteger2 = ((qbr)paramList.get(m)).c;
        if (localInteger2 == null) {}
        for (int i6 = 0;; i6 = localInteger2.intValue())
        {
          k += i6 + 1;
          m++;
          break;
        }
      }
      n = k;
      break;
      i1 = 0;
      break label179;
      i3 = 0;
      break label281;
      str2 = new String("g:");
      break label339;
      str2 = null;
      break label339;
      i4 = localInteger1.intValue();
      break label409;
      i4 = 0;
      break label409;
    }
    label623:
    int i2 = n - i;
    if (i2 > 0)
    {
      Object[] arrayOfObject2 = new Object[r.length];
      arrayOfObject2[0] = Integer.valueOf(2);
      arrayOfObject2[1] = Integer.valueOf(paramhqr.getCount());
      arrayOfObject2[13] = Integer.valueOf(n);
      arrayOfObject2[14] = Integer.valueOf(i2);
      paramhqr.a(arrayOfObject2);
    }
  }
  
  private static boolean a(qbu paramqbu)
  {
    return (paramqbu != null) && ((!TextUtils.isEmpty(paramqbu.e)) || (!TextUtils.isEmpty(paramqbu.b)));
  }
  
  public final Cursor o()
  {
    int i = 0;
    if ((this.t == null) || (this.u == null)) {
      return null;
    }
    int j = this.s;
    Cursor localCursor = bqo.a(this.l, j, this.t, bzy.a);
    hxj localhxj;
    qbr[] arrayOfqbr;
    if (localCursor.moveToFirst())
    {
      localhxj = bqo.a(localCursor, 0, 1);
      byte[] arrayOfByte = localCursor.getBlob(2);
      if (arrayOfByte != null) {
        arrayOfqbr = (qbr[])efj.a(arrayOfByte, qbr.class);
      }
    }
    for (;;)
    {
      localCursor.close();
      if (arrayOfqbr == null) {
        break;
      }
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList();
      ArrayList localArrayList4 = new ArrayList();
      ArrayList localArrayList5 = new ArrayList();
      int k = arrayOfqbr.length;
      if (i < k)
      {
        qbr localqbr = arrayOfqbr[i];
        if ((localqbr.e != null) && (localqbr.e.booleanValue())) {
          localArrayList5.add(localqbr);
        }
        for (;;)
        {
          i++;
          break;
          int m = localqbr.b;
          if ((m == 1) || (m == 3)) {
            localArrayList1.add(localqbr);
          } else if (m == 2) {
            localArrayList3.add(localqbr);
          } else if (m == 6) {
            localArrayList2.add(localqbr);
          } else {
            localArrayList4.add(localqbr);
          }
        }
      }
      HashMap localHashMap = a(arrayOfqbr);
      hqr localhqr = new hqr(r);
      a(localhxj, 1, localArrayList1, localhqr, localHashMap);
      a(localhxj, 6, localArrayList2, localhqr, localHashMap);
      a(localhxj, 2, localArrayList3, localhqr, localHashMap);
      a(localhxj, 5, localArrayList4, localhqr, localHashMap);
      a(localhxj, 1000, localArrayList5, localhqr, localHashMap);
      return localhqr;
      arrayOfqbr = null;
      continue;
      arrayOfqbr = null;
      localhxj = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzx
 * JD-Core Version:    0.7.0.1
 */