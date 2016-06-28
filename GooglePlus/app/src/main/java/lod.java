import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class lod
{
  private static int[] a = { -2147483648, 104, 103, 105, 102, 114, 124, 112, 116, 113, 106, 139, 163, 164, 165, 166, 167 };
  private static final int[] b = { 104, 103, 105, 102, 114, 124, 112, 116, 113, 106, 139 };
  
  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    default: 
      return 0;
    case 1: 
      return 104;
    case 2: 
      return 103;
    case 3: 
      return 105;
    case 4: 
      return 102;
    case 6: 
      return 124;
    case 7: 
      return 112;
    case 8: 
      return 116;
    case 9: 
      return 113;
    case 10: 
      return 106;
    case 12: 
      return 163;
    case 11: 
      return 139;
    case 13: 
      return 164;
    case 14: 
      return 165;
    case 15: 
      return 166;
    }
    return 167;
  }
  
  public static String a(Context paramContext, int paramInt, oqw paramoqw)
  {
    String str1;
    if ((paramoqw == null) || (paramoqw.c == null)) {
      str1 = null;
    }
    String str2;
    label212:
    label599:
    for (;;)
    {
      return str1;
      int i = 0;
      str2 = null;
      if (i >= a.length) {
        break;
      }
      if ((paramoqw.c == null) || (paramoqw.c.a != a[i])) {
        str1 = null;
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(str1)) {
          break label599;
        }
        i++;
        str2 = str1;
        break;
        lnz locallnz = (lnz)mbb.a(paramContext, lnz.class);
        if (locallnz != null)
        {
          Integer localInteger2 = Integer.valueOf(i);
          lny locallny = (lny)locallnz.a.get(localInteger2);
          if (locallny != null)
          {
            str1 = efj.a("promo", String.valueOf(i), locallny.a(paramoqw));
            continue;
          }
        }
        rcy localrcy = paramoqw.c;
        Integer localInteger1;
        switch (i)
        {
        case 5: 
        default: 
          localInteger1 = null;
        }
        for (;;)
        {
          if (localInteger1 != null) {
            break label582;
          }
          Log.e("StreamPromosData", 31 + "Unknown promo type! " + i);
          str1 = null;
          break;
          localInteger1 = Integer.valueOf(0);
          continue;
          if (localrcy.b(nzb.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(nzb.a))));
          continue;
          if (localrcy.b(nzg.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(nzg.a))));
          continue;
          nze localnze = (nze)localrcy.b(nze.a);
          if (localnze == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a(localnze)));
          continue;
          if (localrcy.b(oac.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(oac.a))));
          continue;
          if (localrcy.b(odj.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(odj.a))));
          continue;
          odh localodh = (odh)localrcy.b(odh.a);
          if (localodh == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a(localodh)));
          continue;
          if (localrcy.b(nhf.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(nhf.a))));
          continue;
          if (localrcy.b(nhj.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(nhj.a))));
          continue;
          if (localrcy.b(rdp.a) == null) {
            break label212;
          }
          localInteger1 = Integer.valueOf(Arrays.hashCode(qat.a((qat)localrcy.b(rdp.a))));
        }
        str1 = efj.a("promo", String.valueOf(i), localInteger1.toString());
      }
    }
    label582:
    return str2;
  }
  
  public static void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, ArrayList<oqw> paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    int i = paramArrayList.size();
    int j = 0;
    label26:
    oqw localoqw;
    String str1;
    if (j < i)
    {
      localoqw = (oqw)paramArrayList.get(j);
      str1 = a(paramContext, paramInt, localoqw);
      if (!TextUtils.isEmpty(str1)) {
        break label85;
      }
      if (Log.isLoggable("StreamPromosData", 6)) {
        Log.e("StreamPromosData", ">>>>> could not determine activity id");
      }
    }
    for (;;)
    {
      j++;
      break label26;
      break;
      label85:
      if (localoqw.c != null) {
        break label114;
      }
      if (Log.isLoggable("StreamPromosData", 6)) {
        Log.e("StreamPromosData", ">>>>> stream item contains no promo data");
      }
    }
    label114:
    if (Log.isLoggable("StreamPromosData", 3))
    {
      String str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break label276;
      }
      ">>>>> promo internal activity id: ".concat(str2);
    }
    for (;;)
    {
      localContentValues.put("unique_activity_id", str1);
      localContentValues.put("activity_id", str1);
      localContentValues.put("author_id", "~promo");
      localContentValues.put("total_comment_count", Integer.valueOf(0));
      localContentValues.put("created", Integer.valueOf(0));
      localContentValues.put("modified", Integer.valueOf(0));
      localContentValues.put("data_state", Integer.valueOf(0));
      localContentValues.put("content_flags", Long.valueOf(0L));
      localContentValues.put("activity_flags", Long.valueOf(0L));
      localContentValues.put("payload", a(paramContext, paramInt, localoqw.c));
      paramSQLiteDatabase.insertWithOnConflict("activities", "unique_activity_id", localContentValues, 5);
      localContentValues.clear();
      break;
      label276:
      new String(">>>>> promo internal activity id: ");
    }
  }
  
  public static boolean a(String paramString)
  {
    return "promo".equals(efj.u(paramString));
  }
  
  private static byte[] a(Context paramContext, int paramInt, rcy paramrcy)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    lny locallny;
    while (i < a.length) {
      if (paramrcy.a != a[i])
      {
        localObject2 = null;
        if (localObject2 != null) {
          break label610;
        }
        i++;
        localObject1 = localObject2;
      }
      else
      {
        lnz locallnz = (lnz)mbb.a(paramContext, lnz.class);
        if (locallnz == null) {
          break label613;
        }
        Integer localInteger = Integer.valueOf(i);
        locallny = (lny)locallnz.a.get(localInteger);
        if (locallny == null) {
          break label613;
        }
      }
    }
    label610:
    label613:
    for (byte[] arrayOfByte = locallny.a(paramInt, paramrcy);; arrayOfByte = null)
    {
      if (arrayOfByte == null) {
        switch (i)
        {
        }
      }
      for (;;)
      {
        localObject2 = arrayOfByte;
        break;
        localObject2 = null;
        break;
        arrayOfByte = lnr.a(new lnr((nzb)paramrcy.b(nzb.a)));
        continue;
        arrayOfByte = lnr.a(new lnr(paramContext, (nzg)paramrcy.b(nzg.a), (nzf)paramrcy.b(nzf.a)));
        continue;
        arrayOfByte = lnr.a(new lnr(paramContext, (nze)paramrcy.b(nze.a), (nzc)paramrcy.b(nzc.a)));
        continue;
        arrayOfByte = lnr.a(new lnr(paramContext, (nzg)paramrcy.b(nzg.a), (nzf)paramrcy.b(nzf.a)));
        continue;
        arrayOfByte = lns.a(new lns((oac)paramrcy.b(oac.a)));
        continue;
        arrayOfByte = lnu.a(new lnu((odj)paramrcy.b(odj.a)));
        continue;
        arrayOfByte = lnu.a(new lnu((odh)paramrcy.b(odh.a)));
        continue;
        arrayOfByte = hxg.a(new hxg((nhf)paramrcy.b(nhf.a)));
        continue;
        arrayOfByte = lnr.a(new lnr(paramContext, (nzg)paramrcy.b(nzg.a), (nzf)paramrcy.b(nzf.a)));
        continue;
        lnv locallnv = new lnv((nhj)paramrcy.b(nhj.a));
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
        DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
        int j = locallnv.a.length;
        localDataOutputStream.writeInt(j);
        for (int k = 0; k < j; k++)
        {
          lnv.a(localDataOutputStream, locallnv.a[k]);
          lnv.a(localDataOutputStream, locallnv.b[k]);
          lnv.a(localDataOutputStream, locallnv.c[k]);
        }
        arrayOfByte = localByteArrayOutputStream.toByteArray();
        localDataOutputStream.close();
        continue;
        arrayOfByte = lnw.a(new lnw((rdp)paramrcy.b(rdp.a)));
      }
      localObject2 = localObject1;
      return localObject2;
    }
  }
  
  public static int[] a(Context paramContext, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = b.length;
    for (int j = 0; j < i; j++) {
      localArrayList1.add(Integer.valueOf(b[j]));
    }
    lnz locallnz = (lnz)mbb.b(paramContext, lnz.class);
    if (locallnz != null)
    {
      ArrayList localArrayList2 = new ArrayList(locallnz.a.keySet());
      int k = localArrayList2.size();
      for (int m = 0; m < k; m++)
      {
        Object localObject = localArrayList2.get(m);
        Integer localInteger = ((lny)locallnz.a.get(localObject)).a(paramInt);
        if (localInteger != null) {
          localArrayList1.add(localInteger);
        }
      }
    }
    if (((lln)mbb.a(paramContext, lln.class)).c(paramInt)) {
      localArrayList1.add(Integer.valueOf(163));
    }
    int[] arrayOfInt = new int[localArrayList1.size()];
    int n = localArrayList1.size();
    for (int i1 = 0; i1 < n; i1++) {
      arrayOfInt[i1] = ((Integer)localArrayList1.get(i1)).intValue();
    }
    return arrayOfInt;
  }
  
  public static int b(String paramString)
  {
    if (!"promo".equals(efj.u(paramString))) {}
    for (;;)
    {
      return 0;
      try
      {
        int i = Integer.parseInt(efj.v(paramString));
        if ((i >= 0) && (i <= 17)) {
          return i;
        }
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lod
 * JD-Core Version:    0.7.0.1
 */