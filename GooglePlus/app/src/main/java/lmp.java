import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class lmp
{
  public static final mcs a = new mcs("enable_owner_response", (byte)0);
  private static final Integer b = Integer.valueOf(10);
  private static final String[] c = { "name", "avatar_url", "blocked" };
  private static final String d = efj.a("-1", "-1", false, null, null, 0, null);
  private static int[] e;
  private static final hge f = new lmq();
  private static final String[] g = { "unique_activity_id", "modified", "data_state" };
  
  public static int a(long paramLong)
  {
    if ((0x100 & paramLong) != 0L) {
      return do.ae;
    }
    if ((0x400 & paramLong) != 0L) {
      return do.aj;
    }
    if ((0x40 & paramLong) != 0L) {
      return do.ac;
    }
    if ((0x80 & paramLong) != 0L) {
      return do.ak;
    }
    if ((0x804 & paramLong) != 0L) {
      return do.ag;
    }
    if ((0x20 & paramLong) != 0L) {
      return do.af;
    }
    if ((0x20000 & paramLong) != 0L) {
      return do.ad;
    }
    if ((0x8 & paramLong) != 0L) {
      return do.ah;
    }
    if ((0x1000 & paramLong) != 0L) {
      return do.ai;
    }
    return 0;
  }
  
  private static int a(Context paramContext, int paramInt1, String paramString1, long paramLong, oqw[] paramArrayOfoqw, int paramInt2, boolean paramBoolean, String paramString2, int paramInt3, String paramString3, SQLiteDatabase paramSQLiteDatabase, lln paramlln, String paramString4)
  {
    boolean bool1;
    boolean bool2;
    label16:
    int i;
    int j;
    label23:
    oqw localoqw2;
    if (paramString2 != null)
    {
      bool1 = true;
      if (paramString3 == null) {
        break label63;
      }
      bool2 = true;
      i = 0;
      j = paramInt3;
      if (i >= paramArrayOfoqw.length) {
        break label132;
      }
      localoqw2 = paramArrayOfoqw[i];
      if (localoqw2 != null) {
        break label69;
      }
      Log.e("EsPostsData", "null stream item");
    }
    for (;;)
    {
      i++;
      break label23;
      bool1 = false;
      break;
      label63:
      bool2 = false;
      break label16;
      label69:
      llm localllm2 = paramlln.a(localoqw2.a, paramInt1);
      if (localllm2 == null) {
        Log.e("EsPostsData", "unknown stream type");
      } else if (localllm2.a(paramContext, paramInt1, paramSQLiteDatabase, localoqw2, paramString1, paramLong, j, bool1, bool2, paramString4)) {
        j++;
      }
    }
    label132:
    int k = 0;
    if (k < paramArrayOfoqw.length)
    {
      oqw localoqw1 = paramArrayOfoqw[k];
      llm localllm1 = paramlln.a(localoqw1.a, paramInt1);
      if (localllm1 == null) {
        Log.e("EsPostsData", "unknown stream type");
      }
      for (;;)
      {
        k++;
        break;
        localllm1.a(paramContext, paramInt1, paramSQLiteDatabase, localoqw1, paramInt2, paramBoolean);
      }
    }
    return j;
  }
  
  public static int a(Context paramContext, int paramInt, String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    localSQLiteDatabase.beginTransaction();
    Cursor localCursor;
    int i;
    for (;;)
    {
      try
      {
        localCursor = localSQLiteDatabase.query("activities", new String[] { "content_flags", "unique_activity_id" }, "event_id=?", new String[] { paramString }, null, null, null);
        long l;
        try
        {
          ContentValues localContentValues = new ContentValues(1);
          i = 0;
          if (!localCursor.moveToNext()) {
            break;
          }
          l = localCursor.getLong(0);
          String str = localCursor.getString(1);
          if (paramBoolean)
          {
            if ((l & 0x40000) == 0L) {
              continue;
            }
            localContentValues.put("embed", paramArrayOfByte);
            i += localSQLiteDatabase.update("activities", localContentValues, "activity_id=?", new String[] { str });
            a(paramContext, str);
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localCursor.close();
        }
        if ((l & 0x100) == 0L) {}
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    localCursor.close();
    localSQLiteDatabase.setTransactionSuccessful();
    localSQLiteDatabase.endTransaction();
    return i;
  }
  
  private static long a(opo paramopo, long paramLong)
  {
    if (paramopo.h != null) {
      for (ona localona : paramopo.h) {
        paramLong = Math.max(paramLong, Math.max(efj.a(localona.i), localona.c.longValue()));
      }
    }
    if (paramopo.B != null) {
      paramLong = Math.max(paramLong, efj.a(paramopo.B.b));
    }
    return paramLong;
  }
  
  public static String a(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (paramInt == 4) {
      return efj.a(null, null, paramBoolean, paramString1, paramString2, 0, null);
    }
    return efj.a(paramString1, paramString3, paramBoolean, null, null, paramInt, null);
  }
  
  private static String a(int paramInt, lln paramlln, oqw paramoqw)
  {
    if (paramoqw == null) {
      return null;
    }
    llm localllm = paramlln.a(paramoqw.a, paramInt);
    if (localllm == null)
    {
      Log.e("EsPostsData", "unknown stream type");
      return null;
    }
    return localllm.a(paramInt, paramoqw);
  }
  
  private static ArrayList<ona> a(ona[] paramArrayOfona)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfona.length;
    for (int j = 0; j < i; j++)
    {
      ona localona = paramArrayOfona[j];
      if ((!efj.b(localona.g)) || (efj.b(localona.h))) {
        localArrayList.add(localona);
      }
    }
    return localArrayList;
  }
  
  private static HashMap<String, lmr> a(SQLiteDatabase paramSQLiteDatabase, opo[] paramArrayOfopo)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList();
    localStringBuilder.append("unique_activity_id IN (");
    int j = paramArrayOfopo.length;
    while (i < j)
    {
      opo localopo = paramArrayOfopo[i];
      localStringBuilder.append("?,");
      localArrayList.add(localopo.af);
      i++;
    }
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    localStringBuilder.append(')');
    localHashMap = new HashMap();
    Cursor localCursor = paramSQLiteDatabase.query("activities", g, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[localArrayList.size()]), null, null, null);
    try
    {
      if (localCursor.moveToNext())
      {
        String str = localCursor.getString(0);
        lmr locallmr = new lmr();
        locallmr.a = localCursor.getLong(1);
        locallmr.b = localCursor.getInt(2);
        localHashMap.put(str, locallmr);
      }
      return localHashMap;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static kbw a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, byte[] paramArrayOfByte, int paramInt3, String[] paramArrayOfString1, String[] paramArrayOfString2, kck paramkck, boolean paramBoolean2, boolean paramBoolean3, long paramLong, String[] paramArrayOfString3)
  {
    ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "doActivityStreamSync start");
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str7 = efj.a(paramString2, paramString1, false, null, null, paramInt2, null);
      new StringBuilder(63 + String.valueOf(str7).length()).append("doActivityStreamSync starting sync stream: ").append(str7).append(", count: ").append(paramInt3);
    }
    if (paramBoolean3) {}
    lmv locallmv;
    for (String[] arrayOfString = paramArrayOfString3;; arrayOfString = null)
    {
      locallmv = new lmv(paramContext, paramInt1, paramInt2, paramString1, paramString2, paramString3, paramBoolean1, paramString4, paramArrayOfByte, paramInt3, paramArrayOfString1, paramArrayOfString2, paramkck, paramBoolean3, paramLong, arrayOfString);
      locallmv.i();
      if (locallmv.q == null) {
        break;
      }
      throw locallmv.q;
    }
    if (locallmv.n())
    {
      int i = locallmv.o;
      String str6 = String.valueOf(locallmv.p);
      throw new IOException(21 + String.valueOf(str6).length() + "Error: " + i + " [" + str6 + "]");
    }
    long l1 = System.currentTimeMillis();
    qat localqat;
    olr localolr;
    String str1;
    String str2;
    label292:
    String str3;
    label327:
    long l2;
    String str4;
    if (locallmv.x)
    {
      localqat = locallmv.w;
      localolr = ((msm)localqat).a;
      str1 = a(paramInt2, paramString2, paramString3, paramString1, paramBoolean1);
      if (!paramBoolean3) {
        break label564;
      }
      str2 = d;
      if ((!paramBoolean3) && (Log.isLoggable("EsPostsData", 4)))
      {
        if (!TextUtils.equals(paramString4, localolr.a.c)) {
          break label571;
        }
        str3 = "!!!!!";
        l2 = locallmv.a;
        str4 = String.valueOf(localolr.a.c);
        if (localolr.a.b != null) {
          break label579;
        }
      }
    }
    label564:
    label571:
    label579:
    for (Object localObject = "0";; localObject = Integer.valueOf(localolr.a.b.length))
    {
      String str5 = String.valueOf(localObject);
      new StringBuilder(93 + String.valueOf(str3).length() + String.valueOf(paramString4).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append(str3).append("Sent token ").append(paramString4).append(" at time ").append(l2).append(" and received token ").append(str4).append(" with ").append(str5).append(" activities for ").append(paramInt1);
      a(paramContext, paramInt1, str2, l1, localolr.a.b, 3, paramString4, localolr.a.c, localolr.a.d, paramkck, paramBoolean2, paramString3, null, paramBoolean3, locallmv.a, str1, locallmv.d);
      ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "doActivityStreamSync end");
      return locallmv;
      localqat = null;
      break;
      str2 = str1;
      break label292;
      str3 = "";
      break label327;
    }
  }
  
  public static lmj a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(53 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> plusOneComment activity id: ").append(paramString1).append(", commentId: ").append(paramString2).append(" ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    lmj locallmj = b(localSQLiteDatabase, paramString2);
    if (locallmj == null) {
      return null;
    }
    locallmj.a(paramBoolean);
    a(localSQLiteDatabase, paramString2, locallmj);
    a(paramContext, paramString1);
    return locallmj;
  }
  
  public static lmj a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(37 + String.valueOf(paramString).length()).append(">>>>> plusOnePost activity id: ").append(paramString).append(" ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    lmj locallmj = a(localSQLiteDatabase, paramString);
    if (locallmj == null) {
      return null;
    }
    locallmj.a(paramBoolean);
    a(paramContext, localSQLiteDatabase, paramString, locallmj, true);
    a(paramContext, paramInt, paramString, locallmj);
    return locallmj;
  }
  
  private static lmj a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor = paramSQLiteDatabase.query("activities", new String[] { "plus_one_data" }, "activity_id=?", new String[] { paramString }, null, null, null);
    if (localCursor == null) {
      return null;
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        if (localCursor.isNull(0))
        {
          lmj locallmj1 = new lmj();
          return locallmj1;
        }
        lmj locallmj2 = lmj.a(localCursor.getBlob(0));
        return locallmj2;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static lmu a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, byte[] paramArrayOfByte, int paramInt3, String[] paramArrayOfString1, String[] paramArrayOfString2, kck paramkck, boolean paramBoolean2, lmx paramlmx, long paramLong, String[] paramArrayOfString3)
  {
    String str1 = a(paramInt2, paramString2, paramString3, paramString1, paramBoolean1);
    SQLiteDatabase localSQLiteDatabase;
    if ((paramlmx != null) && (paramlmx.a != null))
    {
      olr localolr;
      if (Log.isLoggable("EsPostsData", 3))
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0) {
          "Activities fetch cached: ".concat(str3);
        }
      }
      else
      {
        localolr = paramlmx.a;
        if (localolr.c != null) {
          break label294;
        }
      }
      label294:
      for (long l = 0L;; l = localolr.c.a.longValue())
      {
        oqw[] arrayOfoqw = localolr.a.b;
        ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "updateTopStreamFromCache start");
        localSQLiteDatabase = hsb.a(paramContext, paramInt1);
        localSQLiteDatabase.beginTransaction();
        if (paramkck != null) {}
        try
        {
          paramkck.a(arrayOfoqw.length);
          localSQLiteDatabase.delete("activity_streams", "stream_key=?", new String[] { str1 });
          ContentValues localContentValues = new ContentValues(1);
          localContentValues.put("stream_key", str1);
          String[] arrayOfString = new String[1];
          arrayOfString[0] = d;
          localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=?", arrayOfString);
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          paramContext.getContentResolver().notifyChange(Uri.withAppendedPath(lnf.a, str1), null);
          ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "updateTopStreamFromCache end");
          return new lmu(localolr.a.c, localolr.a.d, l);
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
        }
        new String("Activities fetch cached: ");
        break;
      }
    }
    lmv locallmv = (lmv)a(paramContext, paramInt1, paramInt2, paramString1, paramString2, paramString3, paramBoolean1, paramString4, paramArrayOfByte, paramInt3, paramArrayOfString1, paramArrayOfString2, paramkck, paramBoolean2, false, paramLong, paramArrayOfString3);
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break label413;
      }
      "Activities fetch NOT cached: ".concat(str2);
    }
    for (;;)
    {
      return new lmu(locallmv.b, locallmv.c, locallmv.a);
      label413:
      new String("Activities fetch NOT cached: ");
    }
  }
  
  public static ohy a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      ohy localohy = (ohy)qat.b(new ohy(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localohy;
    }
    catch (qas localqas) {}
    return null;
  }
  
  public static opu a(String paramString, Boolean paramBoolean)
  {
    opu localopu = new opu();
    localopu.a = 25;
    localopu.c = paramBoolean;
    localopu.b = 2;
    localopu.d = new String[] { paramString };
    return localopu;
  }
  
  public static void a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, opo[] paramArrayOfopo, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfopo.length == 0) {
      return;
    }
    HashMap localHashMap = a(paramSQLiteDatabase, paramArrayOfopo);
    int i;
    label22:
    hsv localhsv;
    ContentValues localContentValues;
    int k;
    label53:
    opo localopo;
    String str1;
    lmr locallmr;
    int i9;
    label283:
    boolean bool1;
    label331:
    lng locallng;
    String str5;
    label831:
    int m;
    label875:
    long l4;
    label945:
    label980:
    String str6;
    label1024:
    int n;
    label1072:
    byte[] arrayOfByte1;
    label1084:
    String str10;
    String str9;
    String str8;
    String str7;
    label1163:
    int i1;
    label1193:
    String str12;
    label1202:
    int i8;
    label1278:
    String str13;
    if (paramInt2 != 1)
    {
      i = 1;
      localhsv = (hsv)mbb.a(paramContext.getApplicationContext(), hsv.class);
      localContentValues = new ContentValues();
      int j = paramArrayOfopo.length;
      k = 0;
      if (k < j)
      {
        localopo = paramArrayOfopo[k];
        str1 = localopo.af;
        if (Log.isLoggable("EsPostsData", 3))
        {
          String str20 = String.valueOf(localopo.k);
          String str21 = String.valueOf(localopo.g);
          String str22 = String.valueOf(localopo.w);
          new StringBuilder(58 + String.valueOf(str1).length() + String.valueOf(str20).length() + String.valueOf(str21).length() + String.valueOf(str22).length()).append(">>>>> Unique activity id: ").append(str1).append(", author id: ").append(str20).append(", updated: ").append(str21).append(", read: ").append(str22);
        }
        long l1 = Math.max(efj.a(localopo.A) / 1000L, localopo.g.longValue());
        long l2 = a(localopo, l1);
        locallmr = (lmr)localHashMap.get(localopo.af);
        if (!paramBoolean)
        {
          if ((locallmr != null) && (l2 == locallmr.a) && (locallmr.b == 0)) {
            break label2114;
          }
          i9 = 1;
          if (i9 == 0) {}
        }
        else
        {
          String str2 = localopo.k;
          String str3 = localopo.e;
          String str4 = localopo.l;
          if ((localopo.U == null) || (!localopo.U.booleanValue())) {
            break label2120;
          }
          bool1 = true;
          a(paramSQLiteDatabase, str2, str3, str4, bool1);
          locallng = (lng)mbb.a(paramContext, lng.class);
          locallng.a(paramSQLiteDatabase, localopo.k, localopo.e, localopo.l);
          localContentValues.clear();
          long l3 = 0L;
          if (localopo.m.booleanValue()) {
            l3 = 1L;
          }
          if ((efj.b(localopo.S)) && ((localopo.R == -2147483648) || (localopo.R == 0))) {
            l3 |= 0x2;
          }
          if (l1 != localopo.g.longValue()) {
            l3 |= 0x100;
          }
          if (localopo.o.booleanValue()) {
            l3 |= 0x4;
          }
          if (localopo.I.booleanValue()) {
            l3 |= 0x8;
          }
          if (localopo.D.booleanValue()) {
            l3 |= 0x10;
          }
          if (localopo.E.booleanValue()) {
            l3 |= 0x20;
          }
          if (localopo.n.booleanValue()) {
            l3 |= 0x40;
          }
          if ((localopo.w == null) || (localopo.w.booleanValue())) {
            l3 |= 0x80;
          }
          if (localopo.q.booleanValue()) {
            l3 |= 0x800;
          }
          if ((localopo.f != null) && (efj.b(localopo.f.a))) {
            l3 |= 0x200;
          }
          if (efj.b(localopo.Q)) {
            l3 |= 0x400;
          }
          if (efj.b(localopo.x)) {
            l3 |= 0x1000;
          }
          localContentValues.put("activity_flags", Long.valueOf(l3));
          localContentValues.putNull("embed");
          localContentValues.putNull("embed_appinvite");
          localContentValues.putNull("embed_deep_link");
          localContentValues.putNull("payload");
          localContentValues.put("activity_id", localopo.i);
          localContentValues.put("unique_activity_id", str1);
          localContentValues.put("author_id", localopo.k);
          localContentValues.putNull("author_annotation");
          if ((localopo.Z != null) && (localopo.Z.a != null)) {
            localContentValues.put("author_annotation", lwh.a(efj.a(localopo.Z, f, efj.d(), efj.d())));
          }
          if ((localopo.W != null) && (!TextUtils.isEmpty(localopo.W.d))) {
            break label2126;
          }
          str5 = "other";
          localContentValues.put("author_gender", str5);
          localContentValues.put("source_id", localopo.j);
          localContentValues.put("source_name", localopo.d);
          if (i == 0) {
            break label2139;
          }
          m = 1;
          localContentValues.put("data_state", Integer.valueOf(m));
          if ((localopo.P == null) || ((localopo.L != null) && (localopo.L.b(qcz.a) != null))) {
            break label2145;
          }
          localContentValues.put("loc", lmg.a(new lmg(localopo.P)));
          l4 = 8L;
          if (localopo.Y == null) {
            break label2159;
          }
          localContentValues.put("annotation", lwh.a(efj.a(localopo.Y)));
          l4 |= 0x2;
          if (localopo.X == null) {
            break label2170;
          }
          SpannableStringBuilder localSpannableStringBuilder = efj.a(localopo.X);
          str6 = localSpannableStringBuilder.toString();
          localContentValues.put("title", lwh.a(localSpannableStringBuilder));
          l4 |= 1L;
          opc localopc1 = localopo.N;
          if (localopc1 != null)
          {
            localContentValues.put("square_update", lml.a(localopc1));
            l4 |= 0x4000;
          }
          opc localopc2 = localopo.O;
          if (localopc2 == null) {
            break label2186;
          }
          n = 1;
          if (n == 0) {
            break label2192;
          }
          arrayOfByte1 = lml.a(localopc2);
          localContentValues.put("square_reshare_update", arrayOfByte1);
          if ((localopo.u == null) || (localopo.r == null) || (TextUtils.equals(localopo.i, localopo.r))) {
            break label2198;
          }
          str10 = localopo.u.b;
          str9 = localopo.u.a;
          str8 = localopo.u.c;
          str7 = localopo.r;
          if ((n == 0) && (!efj.b(localopo.M)) && (!efj.b(localopo.Q))) {
            break label2318;
          }
          i1 = 1;
          if (i1 == 0) {
            break label2324;
          }
          str12 = str7;
          localContentValues.put("original_activity_id", str12);
          localContentValues.put("original_author_id", str10);
          localContentValues.put("original_author_name", str9);
          localContentValues.put("original_author_avatar_url", str8);
          ooc localooc = localopo.ah;
          if (localooc != null)
          {
            localContentValues.put("original_comment_count", localooc.a);
            if (localooc.b != null)
            {
              i8 = 0;
              if (i8 < localooc.b.length)
              {
                ond localond = localooc.b[i8];
                if (localond.a.a != 11) {
                  break label2330;
                }
                localContentValues.put("original_collexion_name", localond.b);
              }
            }
          }
          localContentValues.put("total_comment_count", localopo.J);
          if ((!efj.b(localopo.m)) || (efj.b(localopo.v))) {
            break label2336;
          }
          str13 = paramContext.getString(do.Q);
          label1369:
          localContentValues.put("acl_display", str13);
          localContentValues.put("created", localopo.g);
          localContentValues.put("modified", Long.valueOf(l2));
          if (localopo.C != null) {
            localContentValues.put("domain", localopo.C.a);
          }
          localContentValues.putNull("birthday");
          if ((localopo.G != null) && (localopo.G.b != null) && (localopo.G.b.a != null))
          {
            okv localokv = localopo.G.b.a;
            String str18 = localokv.a.b;
            String str19 = localokv.a.a;
            if (llo.a(str18, str19)) {
              localContentValues.put("birthday", llo.a(new llo(str18, str19, localokv.b, localokv.a.c)));
            }
          }
          if (localopo.B == null) {
            break label2488;
          }
          localContentValues.put("plus_one_data", lmj.a(new lmj(localopo.B)));
          label1578:
          localContentValues.put("num_reshares", Integer.valueOf(efj.a(localopo.K)));
          if ((localopo.L == null) || (localopo.L.c == null)) {
            break label4539;
          }
          localContentValues.put("embed_deep_link", llu.a(localopo.L.c, null, null));
        }
      }
    }
    label1711:
    label1971:
    label2102:
    label2488:
    label4539:
    for (long l5 = l4 | 0x800;; l5 = l4)
    {
      if (localopo.L != null) {}
      for (qcy localqcy = (qcy)localopo.L.b(qcy.a);; localqcy = null)
      {
        String str17;
        long l6;
        qbe localqbe1;
        label1752:
        Object localObject;
        long l7;
        int i3;
        label1872:
        label1885:
        int i2;
        if ((localqcy != null) && (localqcy.c != null) && (localqcy.c.a != null))
        {
          qbe localqbe2 = localqcy.b;
          if (localqcy.d == null)
          {
            str17 = null;
            localContentValues.put("embed_appinvite", llu.a(localqcy.c.a, localqcy.c.b, str17));
            l6 = l5 | 0x2000;
            localqbe1 = localqbe2;
            if (localqbe1 == null) {
              break label4526;
            }
            if (localqbe1.b(qei.a) == null) {
              break label2526;
            }
            localObject = new llx((qei)localqbe1.b(qei.a));
            l7 = l6;
            if (localObject != null)
            {
              ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream(64);
              DataOutputStream localDataOutputStream1 = new DataOutputStream(localByteArrayOutputStream1);
              ((llx)localObject).a(localDataOutputStream1);
              byte[] arrayOfByte2 = localByteArrayOutputStream1.toByteArray();
              localDataOutputStream1.close();
              localContentValues.put("embed", arrayOfByte2);
              if (!TextUtils.isEmpty(((llx)localObject).e))
              {
                if (((llx)localObject).m != ipm.b) {
                  break label4429;
                }
                i3 = 1;
                if (i3 == 0) {
                  break label4435;
                }
                l7 |= 0x80;
              }
              if (!TextUtils.isEmpty(((llx)localObject).c))
              {
                if (((llx)localObject).m != ipm.b) {
                  break label4446;
                }
                i2 = 1;
                label1910:
                if (i2 != 0) {}
              }
            }
          }
        }
        for (l7 |= 0x4;; l7 = l6)
        {
          localContentValues.put("content_flags", Long.valueOf(l7));
          ona[] arrayOfona = localopo.h;
          boolean bool3;
          label2114:
          label2120:
          label2126:
          label2139:
          label2145:
          label2159:
          label2170:
          long l10;
          if (arrayOfona != null)
          {
            localContentValues.put("comment", lmm.a(new lmm(a(arrayOfona), 3)));
            localContentValues.put("permalink", localopo.V);
            localContentValues.put("youtube_permalink_url", localopo.ai);
            opr localopr = localopo.ad;
            if ((localopr != null) && (localopr.a != null)) {
              localContentValues.put("promoted_post_data", qat.a(localopr.a));
            }
            if (locallmr == null) {
              break label4463;
            }
            paramSQLiteDatabase.update("activities", localContentValues, "unique_activity_id=?", new String[] { str1 });
            if (i == 0)
            {
              if ((arrayOfona == null) || (arrayOfona.length <= 0)) {
                break label4484;
              }
              String str14 = localopo.i;
              if (locallmr != null) {
                break label4478;
              }
              bool3 = true;
              a(paramSQLiteDatabase, str14, arrayOfona, bool3, locallng);
            }
            k++;
            break label53;
            break;
            i = 0;
            break label22;
            i9 = 0;
            break label283;
            bool1 = false;
            break label331;
            str5 = localopo.W.d;
            break label831;
            m = 0;
            break label875;
            localContentValues.putNull("loc");
            l4 = 0L;
            break label945;
            localContentValues.putNull("annotation");
            break label980;
            localContentValues.putNull("title");
            str6 = "";
            break label1024;
            n = 0;
            break label1072;
            arrayOfByte1 = null;
            break label1084;
            ood localood = localopo.t;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            if (localood == null) {
              break label1163;
            }
            String str11 = localopo.s;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            if (str11 == null) {
              break label1163;
            }
            boolean bool2 = TextUtils.equals(localopo.i, localopo.s);
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            if (bool2) {
              break label1163;
            }
            str10 = localopo.t.b;
            str9 = localopo.t.a;
            str8 = localopo.t.c;
            str7 = localopo.s;
            break label1163;
            i1 = 0;
            break label1193;
            str12 = null;
            break label1202;
            i8++;
            break label1278;
            if ((efj.b(localopo.v)) && (efj.b(localopo.Q)))
            {
              if (localopo.C != null)
              {
                str13 = localopo.C.a;
                break label1369;
              }
              str13 = "";
              break label1369;
            }
            if ((efj.b(localopo.y)) || (efj.b(localopo.F)))
            {
              str13 = paramContext.getString(do.P);
              break label1369;
            }
            if (efj.b(localopo.H))
            {
              str13 = paramContext.getString(do.O);
              break label1369;
            }
            if ((localopo.ae != null) && (localopo.ae.a == 1))
            {
              str13 = paramContext.getString(do.S);
              break label1369;
            }
            str13 = paramContext.getString(do.R);
            break label1369;
            localContentValues.putNull("plus_one_data");
            break label1578;
            str17 = localqcy.d.a;
            break label1711;
            localqbe1 = localopo.L;
            l6 = l5;
            break label1752;
            label2526:
            if (localqbe1.b(qdb.a) != null)
            {
              localContentValues.put("embed", hwn.a(new hwn((qdb)localqbe1.b(qdb.a))));
              l7 = l6 | 0x20000;
              localObject = null;
              break label1792;
            }
            if (localqbe1.b(qdw.a) != null)
            {
              llx localllx1 = new llx((qdw)localqbe1.b(qdw.a));
              localhsv.a(paramContext, paramInt1, efj.a(localopo.i, localllx1));
              localObject = localllx1;
              l7 = l6;
              break label1792;
            }
            if (localqbe1.b(qdv.a) != null)
            {
              llt localllt = new llt((qdv)localqbe1.b(qdv.a));
              localContentValues.put("embed", llt.a(localllt));
              long l8 = l6 | 0x40;
              localhsv.a(paramContext, paramInt1, efj.a(localopo.i, localllt));
              l7 = l8;
              localObject = null;
              break label1792;
            }
            if (localqbe1.b(qeh.a) != null)
            {
              localObject = new llx((qeh)localqbe1.b(qeh.a));
              l7 = l6;
              break label1792;
            }
            if (localqbe1.b(qcz.a) != null)
            {
              localContentValues.put("loc", lmg.a(new lmg((qcz)localqbe1.b(qcz.a))));
              l7 = l6 | 0x18;
              localObject = null;
              break label1792;
            }
            if (localqbe1.b(qdp.a) != null)
            {
              localContentValues.put("embed", qdp.a((qat)localqbe1.b(qdp.a)));
              l7 = l6 | 0x1000;
              localObject = null;
              break label1792;
            }
            if (localqbe1.b(qdx.a) != null)
            {
              qdx localqdx = (qdx)localqbe1.b(qdx.a);
              if ((localqdx.c == null) || (localqdx.b == null)) {
                break label4519;
              }
              qdt localqdt2 = (qdt)localqdx.c.b(qdt.a);
              localhsv.a(paramContext, paramInt1, new hdy(localopo, localqdt2));
              localContentValues.put("event_id", localqdt2.g);
              qdv localqdv = (qdv)localqdx.b.b(qdv.a);
              localContentValues.put("embed", llt.a(localqdv));
              l10 = 0x40 | l6;
              a(paramContext, paramInt1, localopo.i, localqdv, localhsv);
            }
          }
          for (l7 = l10;; l7 = l6)
          {
            localObject = null;
            break;
            if (localqbe1.b(qdt.a) != null)
            {
              qdt localqdt1 = (qdt)localqbe1.b(qdt.a);
              localhsv.a(paramContext, paramInt1, new hdy(localopo, localqdt1));
              localContentValues.put("event_id", localqdt1.g);
              localContentValues.put("embed", qat.a(localqdt1));
              l7 = l6 | 0x100;
              localObject = null;
              break;
            }
            if (localqbe1.b(qdj.a) != null)
            {
              qdj localqdj = (qdj)localqbe1.b(qdj.a);
              localhsv.a(paramContext, paramInt1, new hdz(localopo, localqdj));
              localContentValues.put("event_id", localqdj.g);
              localContentValues.put("embed", qat.a(localqdj));
              l7 = l6 | 0x40000;
              localObject = null;
              break;
            }
            if (localqbe1.b(qdr.a) != null)
            {
              localContentValues.put("embed", lma.a(new lma((qdr)localqbe1.b(qdr.a))));
              l7 = l6 | 0x400;
              localObject = null;
              break;
            }
            if (localqbe1.b(qds.a) != null)
            {
              localContentValues.put("embed", lma.a(new lma((qds)localqbe1.b(qds.a))));
              l7 = l6 | 0x400;
              localObject = null;
              break;
            }
            if (localqbe1.b(qdg.a) != null)
            {
              llv localllv = new llv((qdg)localqbe1.b(qdg.a));
              ByteArrayOutputStream localByteArrayOutputStream2 = new ByteArrayOutputStream();
              DataOutputStream localDataOutputStream2 = new DataOutputStream(localByteArrayOutputStream2);
              llv.a(localDataOutputStream2, localllv.a);
              llv.a(localDataOutputStream2, localllv.b);
              llv.a(localDataOutputStream2, localllv.c);
              llv.a(localDataOutputStream2, localllv.d);
              llv.a(localDataOutputStream2, localllv.e);
              localDataOutputStream2.writeInt(localllv.g);
              llv.a(localDataOutputStream2, localllv.f);
              llv.a(localDataOutputStream2, localllv.h);
              localDataOutputStream2.writeBoolean(localllv.i);
              localDataOutputStream2.writeBoolean(localllv.j);
              byte[] arrayOfByte3 = localByteArrayOutputStream2.toByteArray();
              localDataOutputStream2.close();
              localContentValues.put("embed", arrayOfByte3);
              l7 = l6 | 0x200;
              localObject = null;
              break;
            }
            if (localqbe1.b(qee.a) != null)
            {
              localContentValues.put("embed", lmb.a(new lmb((qee)localqbe1.b(qee.a))));
              l7 = l6 | 0x8000;
              localObject = null;
              break;
            }
            if (localqbe1.b(qed.a) != null)
            {
              localContentValues.put("embed", lmb.a(new lmb((qed)localqbe1.b(qed.a))));
              l7 = l6 | 0x10000;
              localObject = null;
              break;
            }
            if (localqbe1.b(qdm.a) != null)
            {
              olo localolo;
              olp localolp;
              qdm localqdm;
              int i7;
              label3657:
              String str15;
              label3669:
              String str16;
              label3681:
              long l9;
              label3696:
              byte[] arrayOfByte5;
              if ((localopo.G != null) && (localopo.G.b != null))
              {
                localolo = localopo.G.b.b;
                if (localolo == null) {
                  break label3733;
                }
                localolp = localolo.b;
                localqdm = (qdm)localqbe1.b(qdm.a);
                if (localopo.ab == null) {
                  break label3739;
                }
                i7 = localopo.ab.a;
                if (localolo == null) {
                  break label3745;
                }
                str15 = localolo.a;
                if (localolp == null) {
                  break label3751;
                }
                str16 = localolp.a;
                if (localolp == null) {
                  break label3757;
                }
                l9 = efj.a(localolp.b);
                if (localqdm != null) {
                  break label3763;
                }
                arrayOfByte5 = null;
              }
              for (;;)
              {
                localContentValues.put("embed", arrayOfByte5);
                l7 = l6 | 0x80000;
                localObject = null;
                break;
                localolo = null;
                break label3614;
                localolp = null;
                break label3626;
                i7 = 0;
                break label3657;
                str15 = null;
                break label3669;
                str16 = null;
                break label3681;
                l9 = 0L;
                break label3696;
                llw localllw = new llw(localqdm, i7, str6, str15, str16, l9);
                ByteArrayOutputStream localByteArrayOutputStream3 = new ByteArrayOutputStream(512);
                DataOutputStream localDataOutputStream3 = new DataOutputStream(localByteArrayOutputStream3);
                llw.a(localDataOutputStream3, localllw.a);
                llw.a(localDataOutputStream3, localllw.b);
                llw.a(localDataOutputStream3, localllw.c);
                llw.a(localDataOutputStream3, localllw.d);
                localDataOutputStream3.writeInt(localllw.e);
                localDataOutputStream3.writeFloat(localllw.f);
                localDataOutputStream3.writeInt(localllw.g);
                llw.a(localDataOutputStream3, localllw.h);
                llw.a(localDataOutputStream3, localllw.i);
                llw.a(localDataOutputStream3, localllw.j);
                llw.a(localDataOutputStream3, localllw.k);
                llw.a(localDataOutputStream3, localllw.l);
                localDataOutputStream3.writeLong(localllw.m);
                arrayOfByte5 = localByteArrayOutputStream3.toByteArray();
                localDataOutputStream3.close();
              }
            }
            if (localqbe1.b(qdz.a) != null)
            {
              qdz localqdz = (qdz)localqbe1.b(qdz.a);
              if (localqdz.e != null)
              {
                int i5 = localqdz.e.length;
                for (int i6 = 0; i6 < i5; i6++)
                {
                  qdy localqdy = (qdy)localqdz.e[i6].b(qdy.a);
                  if ((localqdy != null) && (localqdy.e != null))
                  {
                    qdw localqdw = (qdw)localqdy.e.b(qdw.a);
                    llx localllx2 = new llx(localqdw);
                    localllx2.e = localqdw.f;
                    localhsv.a(paramContext, paramInt1, efj.a(localopo.i, localllx2));
                  }
                }
              }
              int i4;
              if (localopo.m.booleanValue())
              {
                i4 = 9;
                if (localqdz != null) {
                  break label4176;
                }
              }
              label4176:
              for (byte[] arrayOfByte4 = null;; arrayOfByte4 = lly.a(new lly(localqdz, i4)))
              {
                localContentValues.put("embed", arrayOfByte4);
                l7 = l6 | 0x200000;
                localObject = null;
                break;
                if ((localopo.Q.booleanValue()) && (localopo.C != null))
                {
                  i4 = 8;
                  break label4111;
                }
                i4 = 2147483647;
                break label4111;
              }
            }
            if (localqbe1.b(qcx.a) != null)
            {
              localObject = new llx((qcx)localqbe1.b(qcx.a));
              l7 = l6;
              break;
            }
            List localList = mbb.c(paramContext, lpo.class);
            kx localkx1 = null;
            Iterator localIterator = localList.iterator();
            do
            {
              if (!localIterator.hasNext()) {
                break;
              }
              localkx1 = ((lpo)localIterator.next()).a(localqbe1);
            } while (localkx1 == null);
            kx localkx2 = localkx1;
            if (localkx2 != null)
            {
              localContentValues.put("embed", (byte[])localkx2.a);
              l7 = l6 | ((Long)localkx2.b).longValue();
              localObject = null;
              break;
            }
            if (localqbe1.b(qeg.a) != null)
            {
              localObject = new llx((qeg)localqbe1.b(qeg.a));
              l7 = l6;
              break;
            }
            if (localqbe1.b(qcj.a) != null)
            {
              localObject = new llx((qcj)localqbe1.b(qcj.a));
              l7 = l6;
              break;
            }
            Log.e("EsPostsData", "Found an embed we don't understand without a THING!");
            l7 = l6;
            localObject = null;
            break;
            label4429:
            i3 = 0;
            break label1872;
            label4435:
            l7 |= 0x20;
            break label1885;
            label4446:
            i2 = 0;
            break label1910;
            localContentValues.putNull("comment");
            break label1971;
            label4463:
            paramSQLiteDatabase.insertWithOnConflict("activities", "unique_activity_id", localContentValues, 5);
            break label2059;
            label4478:
            bool3 = false;
            break label2090;
            if (locallmr == null) {
              break label2102;
            }
            String[] arrayOfString = new String[1];
            arrayOfString[0] = localopo.i;
            paramSQLiteDatabase.delete("activity_comments", "activity_id=?", arrayOfString);
            break label2102;
          }
        }
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, hec paramhec)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    lmj locallmj = new lmj(paramhec.b, paramhec.c, paramhec.d);
    a(paramContext, localSQLiteDatabase, paramhec.a, locallmj, true);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str2 = String.valueOf(paramString);
      if (str2.length() == 0) {
        break label145;
      }
      ">>>>> deleteActivity id: ".concat(str2);
    }
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
      localSQLiteDatabase.beginTransaction();
      try
      {
        List localList = c(localSQLiteDatabase, paramString);
        String[] arrayOfString = { paramString };
        localSQLiteDatabase.delete("activity_streams", "unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", arrayOfString);
        localSQLiteDatabase.delete("activities", "activity_id=?", arrayOfString);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        ContentResolver localContentResolver = paramContext.getContentResolver();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          localContentResolver.notifyChange(Uri.withAppendedPath(lnf.a, str1), null);
          continue;
          label145:
          new String(">>>>> deleteActivity id: ");
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt1, String paramString1, long paramLong, oqw[] paramArrayOfoqw, int paramInt2, String paramString2, String paramString3, byte[] paramArrayOfByte, kck paramkck, boolean paramBoolean, String paramString4, String paramString5)
  {
    a(paramContext, paramInt1, paramString1, paramLong, paramArrayOfoqw, paramInt2, paramString2, paramString3, paramArrayOfByte, paramkck, paramBoolean, paramString4, paramString5, false, -1L, paramString1, -1L);
  }
  
  private static void a(Context paramContext, int paramInt1, String paramString1, long paramLong1, oqw[] paramArrayOfoqw, int paramInt2, String paramString2, String paramString3, byte[] paramArrayOfByte, kck paramkck, boolean paramBoolean1, String paramString4, String paramString5, boolean paramBoolean2, long paramLong2, String paramString6, long paramLong3)
  {
    ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "updateStreamItems start");
    oqw[] arrayOfoqw;
    if (paramArrayOfoqw == null) {
      arrayOfoqw = new oqw[0];
    }
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt1);
      localSQLiteDatabase.beginTransaction();
      try
      {
        lln locallln = (lln)mbb.a(paramContext, lln.class);
        if (paramString2 == null)
        {
          boolean bool = a(paramInt1, locallln, localSQLiteDatabase, paramString1, arrayOfoqw);
          if ((!bool) && (!paramBoolean1)) {
            return;
          }
        }
        if (TextUtils.equals(paramString2, paramString3)) {
          paramString3 = null;
        }
        if (Log.isLoggable("EsPostsData", 3))
        {
          int m = arrayOfoqw.length;
          new StringBuilder(73 + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + String.valueOf(paramString2).length()).append("updateStreamItems: ").append(paramString1).append(" received items: ").append(m).append(" ,new token: ").append(paramString3).append(" ,old token: ").append(paramString2);
        }
        if ((paramkck != null) && (!paramBoolean2)) {
          paramkck.a(arrayOfoqw.length);
        }
        int i;
        if (TextUtils.isEmpty(paramString2))
        {
          i = 0;
          localSQLiteDatabase.delete("activity_streams", "stream_key=?", new String[] { paramString1 });
        }
        for (;;)
        {
          int j = a(paramContext, paramInt1, paramString1, paramLong1, arrayOfoqw, paramInt2, paramBoolean1, paramString4, i, paramString5, localSQLiteDatabase, locallln, paramString6);
          ContentValues localContentValues = new ContentValues(5);
          localContentValues.clear();
          localContentValues.put("token", paramString3);
          localContentValues.put("stream_token", paramArrayOfByte);
          if (paramLong2 != -1L) {
            localContentValues.put("server_timestamp", Long.valueOf(paramLong2));
          }
          if (paramLong3 != -1L) {
            localContentValues.put("next_prefetch_time", Long.valueOf(paramLong3));
          }
          localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND sort_index=0", new String[] { paramString1 });
          int k = j - 1;
          if (TextUtils.isEmpty(paramString3))
          {
            localContentValues.clear();
            localContentValues.put("last_activity", Integer.valueOf(1));
            String[] arrayOfString = new String[2];
            arrayOfString[0] = paramString1;
            arrayOfString[1] = String.valueOf(k);
            localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND sort_index=?", arrayOfString);
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (!paramBoolean2) {
            paramContext.getContentResolver().notifyChange(Uri.withAppendedPath(lnf.a, paramString1), null);
          }
          ((lta)mbb.a(paramContext, lta.class)).a(paramInt1, 2L, 1L, "updateStreamItems end");
          return;
          long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM activity_streams WHERE stream_key=?", new String[] { paramString1 });
          i = (int)l;
        }
        arrayOfoqw = paramArrayOfoqw;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(31 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> update post plusone id: ").append(paramString1).append(" ").append(paramString2);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    lmj locallmj = a(localSQLiteDatabase, paramString1);
    if (locallmj == null) {}
    while (TextUtils.equals(locallmj.a, paramString2)) {
      return;
    }
    locallmj.a = paramString2;
    a(paramContext, localSQLiteDatabase, paramString1, locallmj, false);
    a(paramContext, paramInt, paramString1, locallmj);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(56 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> updateCommentPlusOneId activity id: ").append(paramString1).append(", comment id: ").append(paramString2);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    lmj locallmj = b(localSQLiteDatabase, paramString2);
    if (locallmj == null) {}
    while (TextUtils.equals(locallmj.a, paramString3)) {
      return;
    }
    locallmj.a = paramString3;
    a(localSQLiteDatabase, paramString2, locallmj);
    a(paramContext, paramString1);
  }
  
  private static void a(Context paramContext, int paramInt, String paramString, lmj paramlmj)
  {
    hec localhec = new hec(paramString, paramlmj.a, paramlmj.b, paramlmj.c);
    ((hsv)mbb.a(paramContext, hsv.class)).a(paramContext, paramInt, localhec, lmy.class);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, ona paramona)
  {
    boolean bool = true;
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str5 = String.valueOf(paramona.d);
      new StringBuilder(35 + String.valueOf(str5).length() + String.valueOf(paramString).length()).append(">>>> insertComment: ").append(str5).append(" for activity: ").append(paramString);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      String str3;
      String str4;
      try
      {
        if (paramona.l != null)
        {
          str3 = paramona.l.a;
          str4 = paramona.l.c;
          if ((paramona.k != null) && (paramona.k.booleanValue()))
          {
            break label249;
            ContentValues localContentValues = new ContentValues();
            a(paramona, paramString, localContentValues);
            localSQLiteDatabase.insertWithOnConflict("activity_comments", "activity_id", localContentValues, 5);
            a(localSQLiteDatabase, paramString, 1);
            a(localSQLiteDatabase, paramona.e, str2, str1, bool);
            ((lng)mbb.a(paramContext, lng.class)).a(localSQLiteDatabase, paramona.e, str2, str1);
            localSQLiteDatabase.setTransactionSuccessful();
            a(paramContext, paramString);
          }
          else
          {
            bool = false;
          }
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      bool = false;
      String str1 = null;
      String str2 = null;
      continue;
      label249:
      str1 = str4;
      str2 = str3;
    }
  }
  
  private static void a(Context paramContext, int paramInt, String paramString, qdv paramqdv, hsv paramhsv)
  {
    if ((paramqdv == null) || (paramqdv.e == null)) {}
    for (;;)
    {
      return;
      ArrayList localArrayList1 = new ArrayList(paramqdv.e.length);
      for (int i = 0; i < paramqdv.e.length; i++) {
        localArrayList1.add(paramqdv.e[i].b(qdw.a));
      }
      ArrayList localArrayList2 = new ArrayList();
      qdv localqdv = new qdv();
      localqdv.b = paramqdv.b;
      while (!localArrayList1.isEmpty())
      {
        int j = 1;
        String str1 = null;
        String str2 = null;
        int k = localArrayList1.size();
        for (int m = 0; m < k; m++)
        {
          qdw localqdw = (qdw)localArrayList1.get(m);
          if (j != 0)
          {
            str1 = localqdw.h;
            str2 = localqdw.g;
            j = 0;
          }
          if ((TextUtils.equals(str1, localqdw.h)) && (TextUtils.equals(str2, localqdw.g))) {
            localArrayList2.add(localqdw);
          }
        }
        localqdv.d = str1;
        localqdv.c = str2;
        localqdv.f = Integer.valueOf(localArrayList2.size());
        qbe[] arrayOfqbe = new qbe[localArrayList2.size()];
        for (int n = 0; n < localArrayList2.size(); n++)
        {
          arrayOfqbe[n] = new qbe();
          arrayOfqbe[n].a = new int[] { 344 };
          arrayOfqbe[n].a(qdw.a, localArrayList2.get(n));
        }
        localqdv.e = arrayOfqbe;
        paramhsv.a(paramContext, paramInt, efj.a(paramString, new llt(localqdv)));
        localArrayList1.removeAll(localArrayList2);
        localArrayList2.clear();
        localqdv.d = null;
        localqdv.c = null;
        localqdv.f = Integer.valueOf(0);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt1, String paramString1, opo[] paramArrayOfopo, int paramInt2, String paramString2, String paramString3, kck paramkck, boolean paramBoolean)
  {
    if (paramArrayOfopo == null) {}
    for (opo[] arrayOfopo = new opo[0];; arrayOfopo = paramArrayOfopo)
    {
      long l = System.currentTimeMillis();
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt1);
      localSQLiteDatabase.beginTransaction();
      if (paramString2 == null) {}
      try
      {
        boolean bool = a(localSQLiteDatabase, paramString1, arrayOfopo);
        if (!bool) {
          return;
        }
        if (TextUtils.equals(paramString2, paramString3)) {
          paramString3 = null;
        }
        if (Log.isLoggable("EsPostsData", 3))
        {
          int i1 = arrayOfopo.length;
          new StringBuilder(83 + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + String.valueOf(paramString2).length()).append("updateStreamActivities: ").append(paramString1).append(" received activities: ").append(i1).append(" ,new token: ").append(paramString3).append(" ,old token: ").append(paramString2);
        }
        int i;
        if (TextUtils.isEmpty(paramString2))
        {
          i = 0;
          localSQLiteDatabase.delete("activity_streams", "stream_key=?", new String[] { paramString1 });
        }
        ContentValues localContentValues;
        int j;
        for (;;)
        {
          localContentValues = new ContentValues(5);
          j = -1 + (i + arrayOfopo.length);
          int k = arrayOfopo.length;
          for (int m = 0; m < k; m++)
          {
            opo localopo = arrayOfopo[m];
            localContentValues.put("stream_key", paramString1);
            localContentValues.put("unique_activity_id", localopo.af);
            localContentValues.put("sort_index", Integer.valueOf(i));
            localContentValues.put("context_specific_data", llr.a(new llr(paramContext, localopo)));
            localContentValues.put("stream_fetch_timestamp", Long.valueOf(l));
            localSQLiteDatabase.insertWithOnConflict("activity_streams", "unique_activity_id", localContentValues, 5);
            i++;
          }
          i = (int)DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM activity_streams WHERE stream_key=?", new String[] { paramString1 });
        }
        localContentValues.clear();
        localContentValues.put("token", paramString3);
        localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND sort_index=0", new String[] { paramString1 });
        if (TextUtils.isEmpty(paramString3))
        {
          localContentValues.clear();
          localContentValues.put("last_activity", Integer.valueOf(1));
          String[] arrayOfString = new String[2];
          arrayOfString[0] = paramString1;
          arrayOfString[1] = String.valueOf(j);
          localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND sort_index=?", arrayOfString);
        }
        if (arrayOfopo.length > 0)
        {
          if (Log.isLoggable("EsPostsData", 3))
          {
            int n = arrayOfopo.length;
            new StringBuilder(57 + String.valueOf(paramString1).length()).append("updateStreamActivities: ").append(paramString1).append(" inserting activities:").append(n);
          }
          a(paramContext, paramInt1, localSQLiteDatabase, arrayOfopo, 1, false);
        }
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        Uri localUri = Uri.withAppendedPath(lnf.a, paramString1);
        paramContext.getContentResolver().notifyChange(localUri, null);
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt1, oqw paramoqw, int paramInt2, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt1);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        opo localopo = (opo)paramoqw.b(opo.a);
        if (localopo != null)
        {
          String str1 = localopo.i;
          a(paramContext, paramInt1, localSQLiteDatabase, new opo[] { localopo }, 1, true);
          str2 = str1;
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (str2 != null) {
            a(paramContext, str2);
          }
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      String str2 = null;
    }
  }
  
  public static void a(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    int i = 1;
    if (Log.isLoggable("EsPostsData", 3))
    {
      int m = paramArrayOfString.length;
      int n = 0;
      if (n < m)
      {
        String str5 = String.valueOf(paramArrayOfString[n]);
        if (str5.length() != 0) {
          "\t".concat(str5);
        }
        for (;;)
        {
          n++;
          break;
          new String("\t");
        }
      }
    }
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    int k;
    label132:
    String str4;
    if (localmfz.b == i)
    {
      localStringBuilder = localmfz.a;
      localStringBuilder.append(") WHERE activity_id").append(" IN(");
      int j = paramArrayOfString.length;
      k = 0;
      if (k >= j) {
        break label194;
      }
      str4 = paramArrayOfString[k];
      if (i == 0) {
        break label183;
      }
      i = 0;
    }
    for (;;)
    {
      localStringBuilder.append(DatabaseUtils.sqlEscapeString(str4));
      k++;
      break label132;
      localStringBuilder = new StringBuilder(256);
      break;
      label183:
      localStringBuilder.append(',');
    }
    label194:
    localStringBuilder.append(')');
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    String str1 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags | 128");
    String str2 = String.valueOf(mfx.b(localStringBuilder));
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localSQLiteDatabase.execSQL(str3);
      return;
    }
  }
  
  public static void a(Context paramContext, int paramInt1, opo[] paramArrayOfopo, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt1);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        ArrayList localArrayList = new ArrayList();
        HashMap localHashMap = a(localSQLiteDatabase, paramArrayOfopo);
        if (i <= 0)
        {
          opo localopo = paramArrayOfopo[0];
          if (!localHashMap.containsKey(localopo.af)) {
            localArrayList.add(localopo);
          }
        }
        else
        {
          a(paramContext, paramInt1, localSQLiteDatabase, (opo[])localArrayList.toArray(new opo[localArrayList.size()]), 1, true);
          localSQLiteDatabase.setTransactionSuccessful();
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      i++;
    }
  }
  
  public static void a(Context paramContext, int paramInt1, opo[] paramArrayOfopo, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt1);
    localSQLiteDatabase.beginTransaction();
    try
    {
      a(paramContext, paramInt1, localSQLiteDatabase, paramArrayOfopo, 1, true);
      if (paramInt3 == 8)
      {
        String str = efj.a(null, null, false, null, null, 8, null);
        int i = (int)DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM activity_streams WHERE stream_key=?", new String[] { str });
        long l = System.currentTimeMillis();
        ContentValues localContentValues = new ContentValues(5);
        for (int j = 0; j < paramArrayOfopo.length; j++)
        {
          opo localopo = paramArrayOfopo[j];
          localContentValues.put("stream_key", str);
          localContentValues.put("unique_activity_id", localopo.af);
          localContentValues.put("sort_index", Integer.valueOf(i));
          localContentValues.put("context_specific_data", llr.a(new llr(paramContext, localopo)));
          localContentValues.put("stream_fetch_timestamp", Long.valueOf(l));
          localSQLiteDatabase.insertWithOnConflict("activity_streams", "unique_activity_id", localContentValues, 4);
          i++;
        }
      }
      a(paramContext, localSQLiteDatabase, paramArrayOfopo);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      for (int k = 0; k < paramArrayOfopo.length; k++) {
        a(paramContext, paramArrayOfopo[k].i);
      }
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString, lmj paramlmj, boolean paramBoolean)
  {
    try
    {
      byte[] arrayOfByte = lmj.a(paramlmj);
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("plus_one_data", arrayOfByte);
      paramSQLiteDatabase.update("activities", localContentValues, "activity_id=?", new String[] { paramString });
      if (paramBoolean) {
        a(paramContext, paramString);
      }
      return;
    }
    catch (IOException localIOException)
    {
      String str = String.valueOf(localIOException);
      Log.e("EsPostsData", 34 + String.valueOf(str).length() + "Could not serialize DbPlusOneData " + str);
    }
  }
  
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, opo[] paramArrayOfopo)
  {
    int i = paramArrayOfopo.length;
    Cursor localCursor;
    for (int j = 0;; j++)
    {
      opo localopo;
      String str1;
      if (j < i)
      {
        localopo = paramArrayOfopo[j];
        str1 = localopo.af;
        localCursor = paramSQLiteDatabase.query("activity_streams", lms.a, "unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", new String[] { str1 }, null, null, null, null);
      }
      try
      {
        ContentValues localContentValues = new ContentValues();
        while (localCursor.moveToNext())
        {
          String str2 = localCursor.getString(0);
          byte[] arrayOfByte1 = localCursor.getBlob(1);
          int k = 1;
          int n;
          if (arrayOfByte1 != null)
          {
            n = 0;
            int i1 = arrayOfByte1.length;
            if (n < i1)
            {
              if (arrayOfByte1[n] == 0) {
                break label230;
              }
              k = 0;
            }
          }
          if (k == 0)
          {
            llr localllr = llr.a(arrayOfByte1);
            if (localllr.f != null) {
              if (localllr.f.a != 11) {
                break label236;
              }
            }
            label230:
            label236:
            for (int m = 1;; m = 0)
            {
              if (m != 0)
              {
                localllr.a(localopo.ac);
                localContentValues.clear();
                localContentValues.put("context_specific_data", llr.a(localllr));
                paramSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", new String[] { str2, str1 });
              }
              return;
              n++;
              break;
            }
          }
          byte[] arrayOfByte2 = llr.a(new llr(paramContext, localopo));
          localContentValues.clear();
          localContentValues.put("context_specific_data", arrayOfByte2);
          paramSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", new String[] { str2, str1 });
        }
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    localContentResolver.notifyChange(Uri.withAppendedPath(lnf.b, paramString), null);
    localContentResolver.notifyChange(lnf.a, null);
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 171	android/content/ContentValues
    //   3: dup
    //   4: invokespecial 620	android/content/ContentValues:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: iload_2
    //   10: invokestatic 154	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 4
    //   15: iconst_1
    //   16: anewarray 39	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: aload_1
    //   22: aastore
    //   23: astore 5
    //   25: aload 4
    //   27: invokevirtual 159	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   30: aload 4
    //   32: ldc 161
    //   34: iconst_1
    //   35: anewarray 39	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: ldc_w 959
    //   43: aastore
    //   44: ldc 198
    //   46: aload 5
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: invokevirtual 169	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore 7
    //   56: aload 7
    //   58: invokeinterface 502 1 0
    //   63: ifeq +59 -> 122
    //   66: aload_3
    //   67: ldc_w 959
    //   70: iconst_1
    //   71: aload 7
    //   73: iconst_0
    //   74: invokeinterface 326 2 0
    //   79: iadd
    //   80: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: invokevirtual 784	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   86: aload 4
    //   88: ldc 161
    //   90: aload_3
    //   91: ldc 198
    //   93: aload 5
    //   95: invokevirtual 202	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   98: pop
    //   99: aload 7
    //   101: invokeinterface 208 1 0
    //   106: aload 4
    //   108: invokevirtual 214	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   111: aload 4
    //   113: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   116: aload_0
    //   117: aload_1
    //   118: invokestatic 205	lmp:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   121: return
    //   122: ldc 122
    //   124: new 280	java/lang/StringBuilder
    //   127: dup
    //   128: sipush 135
    //   131: aload_1
    //   132: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual 354	java/lang/String:length	()I
    //   138: iadd
    //   139: invokespecial 355	java/lang/StringBuilder:<init>	(I)V
    //   142: ldc_w 1622
    //   145: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload_1
    //   149: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: ldc_w 1624
    //   155: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokestatic 129	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   164: pop
    //   165: goto -66 -> 99
    //   168: astore 8
    //   170: aload 7
    //   172: invokeinterface 208 1 0
    //   177: aload 8
    //   179: athrow
    //   180: astore 6
    //   182: aload 4
    //   184: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   187: aload 6
    //   189: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	paramContext	Context
    //   0	190	1	paramString	String
    //   0	190	2	paramInt	int
    //   7	84	3	localContentValues	ContentValues
    //   13	170	4	localSQLiteDatabase	SQLiteDatabase
    //   23	71	5	arrayOfString	String[]
    //   180	8	6	localObject1	Object
    //   54	117	7	localCursor	Cursor
    //   168	10	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   56	99	168	finally
    //   122	165	168	finally
    //   30	56	180	finally
    //   99	111	180	finally
    //   170	180	180	finally
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    String[] arrayOfString = { paramString };
    Cursor localCursor1 = paramSQLiteDatabase.query("comments_view", lne.a, "activity_id=? AND (comment_flags&1=0)", new String[] { paramString }, null, null, "created DESC", Integer.toString(3));
    Cursor localCursor2 = paramSQLiteDatabase.query("activities", new String[] { "total_comment_count" }, "activity_id=?", arrayOfString, null, null, null);
    for (;;)
    {
      byte[] arrayOfByte1;
      try
      {
        if (!localCursor2.moveToFirst()) {
          break label199;
        }
        i = localCursor2.getInt(0);
        if (paramInt != 0) {
          localContentValues.put("total_comment_count", Integer.valueOf(i + paramInt));
        }
        locallmm = new lmm(localCursor1, 3);
      }
      finally
      {
        lmm locallmm;
        byte[] arrayOfByte2;
        localCursor1.close();
        localCursor2.close();
      }
      try
      {
        arrayOfByte2 = lmm.a(locallmm);
        arrayOfByte1 = arrayOfByte2;
      }
      catch (IOException localIOException)
      {
        arrayOfByte1 = null;
        continue;
      }
      localContentValues.put("comment", arrayOfByte1);
      paramSQLiteDatabase.update("activities", localContentValues, "activity_id=?", arrayOfString);
      localCursor1.close();
      localCursor2.close();
      return;
      label199:
      int i = 0;
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString1)) || ("0".equals(paramString1))) {
      return;
    }
    String str1 = hdo.a(paramString3);
    Cursor localCursor = paramSQLiteDatabase.query("activity_contacts", c, "gaia_id=?", new String[] { paramString1 }, null, null, null);
    try
    {
      if (localCursor.moveToNext())
      {
        String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("name"));
        String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("avatar_url"));
        if (localCursor.getLong(localCursor.getColumnIndexOrThrow("blocked")) != 0L) {}
        for (boolean bool1 = true; TextUtils.equals(paramString2, str2); bool1 = false)
        {
          boolean bool2 = TextUtils.equals(str1, str3);
          if ((!bool2) || (paramBoolean != bool1)) {
            break;
          }
          return;
        }
      }
      localCursor.close();
      if (Log.isLoggable("EsPostsData", 3)) {
        new StringBuilder(32 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> Inserting gaiaId: ").append(paramString1).append(", name: ").append(paramString2);
      }
      ContentValues localContentValues = new ContentValues(4);
      localContentValues.put("gaia_id", paramString1);
      localContentValues.put("name", paramString2);
      localContentValues.put("avatar_url", str1);
      localContentValues.put("blocked", Boolean.valueOf(paramBoolean));
      paramSQLiteDatabase.replace("activity_contacts", null, localContentValues);
      return;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, lmj paramlmj)
  {
    try
    {
      byte[] arrayOfByte = lmj.a(paramlmj);
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("plus_one_data", arrayOfByte);
      paramSQLiteDatabase.update("activity_comments", localContentValues, "comment_id=?", new String[] { paramString });
      return;
    }
    catch (IOException localIOException)
    {
      String str = String.valueOf(localIOException);
      Log.e("EsPostsData", 34 + String.valueOf(str).length() + "Could not serialize DbPlusOneData " + str);
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, ona[] paramArrayOfona, boolean paramBoolean, lng paramlng)
  {
    if (!paramBoolean) {
      paramSQLiteDatabase.delete("activity_comments", "activity_id=?", new String[] { paramString });
    }
    if ((paramArrayOfona == null) || (paramArrayOfona.length == 0)) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator = a(paramArrayOfona).iterator();
    label50:
    ona localona;
    String str1;
    String str2;
    if (localIterator.hasNext())
    {
      localona = (ona)localIterator.next();
      if (Log.isLoggable("EsPostsData", 3))
      {
        String str3 = String.valueOf(localona.d);
        String str4 = String.valueOf(localona.e);
        String str5 = String.valueOf(localona.a);
        String str6 = String.valueOf(localona.c);
        new StringBuilder(72 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length()).append("    >>>>> insertComments comment id: ").append(str3).append(", author id: ").append(str4).append(", content: ").append(str5).append(", created: ").append(str6);
      }
      ood localood = localona.l;
      bool = false;
      str1 = null;
      str2 = null;
      if (localood != null)
      {
        str2 = localona.l.a;
        str1 = localona.l.c;
        if ((localona.k == null) || (!localona.k.booleanValue())) {
          break label332;
        }
      }
    }
    label332:
    for (boolean bool = true;; bool = false)
    {
      a(localona, paramString, localContentValues);
      paramSQLiteDatabase.insertWithOnConflict("activity_comments", "activity_id", localContentValues, 5);
      a(paramSQLiteDatabase, localona.e, str2, str1, bool);
      paramlng.a(paramSQLiteDatabase, localona.e, str2, str1);
      break label50;
      break;
    }
  }
  
  private static void a(ona paramona, String paramString, ContentValues paramContentValues)
  {
    paramContentValues.clear();
    String str = paramona.d;
    long l = 0L;
    paramContentValues.put("activity_id", paramString);
    paramContentValues.put("comment_id", str);
    paramContentValues.put("author_id", paramona.e);
    paramContentValues.put("content", lwh.a(efj.a(paramona.m)));
    paramContentValues.put("created", paramona.c);
    if ((paramona.b != null) && (efj.b(paramona.b.a))) {
      l = 2L;
    }
    paramContentValues.put("comment_flags", Long.valueOf(l));
    if (paramona.j != null) {}
    try
    {
      paramContentValues.put("plus_one_data", lmj.a(new lmj(paramona.j)));
      return;
    }
    catch (IOException localIOException)
    {
      paramContentValues.putNull("plus_one_data");
    }
  }
  
  private static boolean a(int paramInt, lln paramlln, SQLiteDatabase paramSQLiteDatabase, String paramString, oqw[] paramArrayOfoqw)
  {
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str5 = String.valueOf(paramString);
      if (str5.length() == 0) {
        break label66;
      }
      "haveStreamItemsChangedInTransaction: Comparing items in stream with key: ".concat(str5);
    }
    for (;;)
    {
      int m = paramArrayOfoqw.length;
      new StringBuilder(34).append("New stream items size: ").append(m);
      if (paramArrayOfoqw.length != 0) {
        break;
      }
      return true;
      label66:
      new String("haveStreamItemsChangedInTransaction: Comparing items in stream with key: ");
    }
    Cursor localCursor = paramSQLiteDatabase.query("activity_streams", new String[] { "unique_activity_id" }, "stream_key=?", new String[] { paramString }, null, null, "sort_index ASC", Integer.toString(paramArrayOfoqw.length));
    for (;;)
    {
      int k;
      String str2;
      try
      {
        int i = localCursor.getCount();
        if (Log.isLoggable("EsPostsData", 3)) {
          new StringBuilder(34).append("Old stream items size: ").append(i);
        }
        int j = paramArrayOfoqw.length;
        if (i != j) {
          return true;
        }
        k = 0;
        if (k >= i) {
          break label348;
        }
        localCursor.moveToNext();
        String str1 = localCursor.getString(0);
        str2 = a(paramInt, paramlln, paramArrayOfoqw[k]);
        if (!TextUtils.equals(str1, str2))
        {
          if (Log.isLoggable("EsPostsData", 3))
          {
            String str4 = String.valueOf(str2);
            if (str4.length() != 0) {
              "Activity Id did not match with db entry: ".concat(str4);
            }
          }
          else
          {
            return true;
          }
          new String("Activity Id did not match with db entry: ");
          continue;
        }
        if (!Log.isLoggable("EsPostsData", 3)) {
          break label357;
        }
      }
      finally
      {
        localCursor.close();
      }
      String str3 = String.valueOf(str2);
      if (str3.length() != 0)
      {
        "Activity Id matched with db entry: : ".concat(str3);
      }
      else
      {
        new String("Activity Id matched with db entry: : ");
        break label357;
        label348:
        localCursor.close();
        return false;
      }
      label357:
      k++;
    }
  }
  
  public static boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, byte[] paramArrayOfByte, int paramInt3, String[] paramArrayOfString1, String[] paramArrayOfString2, kck paramkck, long paramLong, String[] paramArrayOfString3)
  {
    lmv locallmv = (lmv)a(paramContext, paramInt1, paramInt2, paramString1, paramString2, paramString3, paramBoolean, paramString4, paramArrayOfByte, paramInt3, paramArrayOfString1, paramArrayOfString2, paramkck, false, true, paramLong, paramArrayOfString3);
    if (locallmv.n()) {
      return false;
    }
    String str1 = a(paramInt2, paramString2, paramString3, paramString1, paramBoolean);
    if (locallmv.x) {}
    olr localolr;
    for (qat localqat = locallmv.w;; localqat = null)
    {
      localolr = ((msm)localqat).a;
      if (localolr.a.b.length != 0) {
        break;
      }
      return false;
    }
    if (Log.isLoggable("EsPostsData", 4))
    {
      String str2 = String.valueOf(Arrays.toString(localolr.a.b));
      if (str2.length() == 0) {
        break label192;
      }
      "prefetchNewStreamActivities:checkIfNewPosts = ".concat(str2);
    }
    while (((paramArrayOfString3 == null) || (paramArrayOfString3.length == 0)) && (!b(paramContext, paramInt1, str1, a(paramInt1, (lln)mbb.a(paramContext, lln.class), localolr.a.b[0]))))
    {
      return false;
      label192:
      new String("prefetchNewStreamActivities:checkIfNewPosts = ");
    }
    lmw.a.a(paramInt1, str1, new lmx(localolr));
    return true;
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString, opo[] paramArrayOfopo)
  {
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str5 = String.valueOf(paramString);
      if (str5.length() == 0) {
        break label64;
      }
      "haveUpdatesStreamChangedInTransaction: Comparing updates in stream with key: ".concat(str5);
    }
    for (;;)
    {
      int m = paramArrayOfopo.length;
      new StringBuilder(30).append("New updates size : ").append(m);
      if (paramArrayOfopo.length != 0) {
        break;
      }
      return true;
      label64:
      new String("haveUpdatesStreamChangedInTransaction: Comparing updates in stream with key: ");
    }
    Cursor localCursor = paramSQLiteDatabase.query("activity_streams", new String[] { "unique_activity_id" }, "stream_key=? AND unique_activity_id NOT LIKE '~typeprefix~%'", new String[] { paramString }, null, null, "sort_index ASC", Integer.toString(paramArrayOfopo.length));
    for (;;)
    {
      int k;
      String str2;
      try
      {
        int i = localCursor.getCount();
        if (Log.isLoggable("EsPostsData", 3)) {
          new StringBuilder(29).append("Old updates size: ").append(i);
        }
        int j = paramArrayOfopo.length;
        if (i != j) {
          return true;
        }
        k = 0;
        if (k >= i) {
          break label334;
        }
        localCursor.moveToNext();
        String str1 = localCursor.getString(0);
        str2 = paramArrayOfopo[k].af;
        if (!TextUtils.equals(str1, str2))
        {
          if (Log.isLoggable("EsPostsData", 3))
          {
            String str4 = String.valueOf(str2);
            if (str4.length() != 0) {
              "Activity uniqueId did not match with db entry: ".concat(str4);
            }
          }
          else
          {
            return true;
          }
          new String("Activity uniqueId did not match with db entry: ");
          continue;
        }
        if (!Log.isLoggable("EsPostsData", 3)) {
          break label342;
        }
      }
      finally
      {
        localCursor.close();
      }
      String str3 = String.valueOf(str2);
      if (str3.length() != 0)
      {
        "Activity uniqueId matched with db entry: ".concat(str3);
      }
      else
      {
        new String("Activity uniqueId matched with db entry: ");
        break label342;
        label334:
        localCursor.close();
        return false;
      }
      label342:
      k++;
    }
  }
  
  public static int[] a(Context paramContext, int paramInt)
  {
    ArrayList localArrayList;
    if (e == null)
    {
      localArrayList = ((lln)mbb.a(paramContext, lln.class)).a(paramInt);
      if (!localArrayList.isEmpty()) {
        break label42;
      }
      Log.e("EsPostsData", "No registered stream item extensions");
    }
    for (;;)
    {
      return e;
      label42:
      e = new int[localArrayList.size()];
      for (int i = 0; i < e.length; i++) {
        e[i] = ((Integer)localArrayList.get(i)).intValue();
      }
    }
  }
  
  private static lmj b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor = paramSQLiteDatabase.query("activity_comments", new String[] { "plus_one_data" }, "comment_id=?", new String[] { paramString }, null, null, null);
    if (localCursor == null) {
      return null;
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        if (localCursor.isNull(0))
        {
          lmj locallmj1 = new lmj();
          return locallmj1;
        }
        lmj locallmj2 = lmj.a(localCursor.getBlob(0));
        return locallmj2;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  /* Error */
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 154	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   5: astore_3
    //   6: iconst_1
    //   7: anewarray 39	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: aload_2
    //   13: aastore
    //   14: astore 4
    //   16: aload_3
    //   17: ldc_w 1756
    //   20: aload 4
    //   22: invokestatic 1760	android/database/DatabaseUtils:stringForQuery	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   25: astore 9
    //   27: ldc 122
    //   29: iconst_3
    //   30: invokestatic 350	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   33: ifeq +51 -> 84
    //   36: new 280	java/lang/StringBuilder
    //   39: dup
    //   40: bipush 35
    //   42: aload_2
    //   43: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   46: invokevirtual 354	java/lang/String:length	()I
    //   49: iadd
    //   50: aload 9
    //   52: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   55: invokevirtual 354	java/lang/String:length	()I
    //   58: iadd
    //   59: invokespecial 355	java/lang/StringBuilder:<init>	(I)V
    //   62: ldc_w 1762
    //   65: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: aload_2
    //   69: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w 1483
    //   75: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload 9
    //   80: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_3
    //   85: invokevirtual 159	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   88: new 280	java/lang/StringBuilder
    //   91: dup
    //   92: sipush 256
    //   95: invokespecial 355	java/lang/StringBuilder:<init>	(I)V
    //   98: astore 10
    //   100: aload 10
    //   102: ldc_w 1764
    //   105: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload 10
    //   111: aload_2
    //   112: invokestatic 1574	android/database/DatabaseUtils:sqlEscapeString	(Ljava/lang/String;)Ljava/lang/String;
    //   115: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload 10
    //   121: bipush 41
    //   123: invokevirtual 301	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_3
    //   128: ldc_w 1393
    //   131: aload 10
    //   133: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: aconst_null
    //   137: invokevirtual 541	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   140: pop
    //   141: aload_3
    //   142: aload 9
    //   144: iconst_m1
    //   145: invokestatic 1493	lmp:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V
    //   148: aload_3
    //   149: invokevirtual 214	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   152: aload_3
    //   153: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   156: aload 9
    //   158: ifnull +9 -> 167
    //   161: aload_0
    //   162: aload 9
    //   164: invokestatic 205	lmp:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   167: return
    //   168: astore 5
    //   170: ldc 122
    //   172: iconst_5
    //   173: invokestatic 350	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   176: ifeq -9 -> 167
    //   179: aload_2
    //   180: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   183: astore 6
    //   185: aload 6
    //   187: invokevirtual 354	java/lang/String:length	()I
    //   190: ifeq +13 -> 203
    //   193: ldc_w 1766
    //   196: aload 6
    //   198: invokevirtual 524	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   201: pop
    //   202: return
    //   203: new 39	java/lang/String
    //   206: dup
    //   207: ldc_w 1766
    //   210: invokespecial 577	java/lang/String:<init>	(Ljava/lang/String;)V
    //   213: pop
    //   214: return
    //   215: astore 11
    //   217: aload_3
    //   218: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   221: aload 11
    //   223: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramContext	Context
    //   0	224	1	paramInt	int
    //   0	224	2	paramString	String
    //   5	213	3	localSQLiteDatabase	SQLiteDatabase
    //   14	7	4	arrayOfString	String[]
    //   168	1	5	localSQLiteDoneException	android.database.sqlite.SQLiteDoneException
    //   183	14	6	str1	String
    //   25	138	9	str2	String
    //   98	34	10	localStringBuilder	StringBuilder
    //   215	7	11	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	27	168	android/database/sqlite/SQLiteDoneException
    //   88	152	215	finally
  }
  
  public static void b(Context paramContext, int paramInt, String paramString, ona paramona)
  {
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str4 = String.valueOf(paramona.d);
      new StringBuilder(33 + String.valueOf(str4).length() + String.valueOf(paramString).length()).append(">>>> editComment: ").append(str4).append(" for activity: ").append(paramString);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        if (paramona.l != null)
        {
          str2 = paramona.l.a;
          str1 = paramona.l.c;
          Boolean localBoolean = paramona.k;
          bool1 = false;
          if (localBoolean != null)
          {
            boolean bool2 = paramona.k.booleanValue();
            bool1 = false;
            if (bool2) {
              bool1 = true;
            }
          }
          ContentValues localContentValues = new ContentValues();
          a(paramona, paramString, localContentValues);
          String str3 = paramona.d;
          StringBuilder localStringBuilder = new StringBuilder(256);
          localStringBuilder.append("comment_id IN(");
          localStringBuilder.append(DatabaseUtils.sqlEscapeString(str3));
          localStringBuilder.append(')');
          localSQLiteDatabase.update("activity_comments", localContentValues, localStringBuilder.toString(), null);
          a(localSQLiteDatabase, paramona.e, str2, str1, bool1);
          ((lng)mbb.a(paramContext, lng.class)).a(localSQLiteDatabase, paramona.e, str2, str1);
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          a(paramContext, paramString);
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      boolean bool1 = false;
      String str1 = null;
      String str2 = null;
    }
  }
  
  public static void b(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase;
    if (Log.isLoggable("EsPostsData", 3))
    {
      String str6 = String.valueOf(paramString);
      if (str6.length() != 0) {
        ">>>>> muteActivity id: ".concat(str6);
      }
    }
    else
    {
      localSQLiteDatabase = hsb.a(paramContext, paramInt);
      if (!paramBoolean) {
        break label232;
      }
    }
    ContentResolver localContentResolver;
    label232:
    for (String str1 = " | 64";; str1 = " & -65")
    {
      String str2 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags");
      String str3 = String.valueOf(") WHERE activity_id='");
      String str4 = String.valueOf("'");
      localSQLiteDatabase.execSQL(0 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(paramString).length() + String.valueOf(str4).length() + str2 + str1 + str3 + paramString + str4);
      List localList = c(localSQLiteDatabase, paramString);
      localContentResolver = paramContext.getContentResolver();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str5 = (String)localIterator.next();
        localContentResolver.notifyChange(Uri.withAppendedPath(lnf.a, str5), null);
      }
      new String(">>>>> muteActivity id: ");
      break;
    }
    localContentResolver.notifyChange(Uri.withAppendedPath(lnf.b, paramString), null);
  }
  
  private static boolean b(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    boolean bool1 = true;
    SQLiteDatabase localSQLiteDatabase = hsb.b(paramContext, paramInt);
    String[] arrayOfString1 = new String[bool1];
    arrayOfString1[0] = "unique_activity_id";
    String[] arrayOfString2 = new String[bool1];
    arrayOfString2[0] = paramString1;
    Cursor localCursor = localSQLiteDatabase.query("activity_streams", arrayOfString1, "stream_key=? AND unique_activity_id NOT LIKE '~typeprefix~%'", arrayOfString2, null, null, "sort_index ASC", b.toString());
    label153:
    label283:
    for (;;)
    {
      try
      {
        if (localCursor.getCount() != 0) {
          break label159;
        }
        if (Log.isLoggable("EsPostsData", 3))
        {
          String str4 = String.valueOf(paramString2);
          if (str4.length() != 0) {
            "hasStreamChanged: no local activities, server activity: ".concat(str4);
          }
        }
        else
        {
          if (paramString2 == null) {
            break label153;
          }
          bool3 = bool1;
          bool1 = bool3;
          return bool1;
        }
        new String("hasStreamChanged: no local activities, server activity: ");
        continue;
        boolean bool3 = false;
      }
      finally
      {
        localCursor.close();
      }
      continue;
      label159:
      if (paramString2 != null)
      {
        if (localCursor.moveToNext()) {
          if (Log.isLoggable("EsPostsData", 3))
          {
            String str3 = String.valueOf(localCursor.getString(0));
            if (str3.length() != 0) {
              "\t".concat(str3);
            }
          }
          else
          {
            label212:
            if (!paramString2.equals(localCursor.getString(0))) {
              break label283;
            }
          }
        }
        for (boolean bool2 = bool1;; bool2 = false)
        {
          if (bool2)
          {
            if (!Log.isLoggable("EsPostsData", 3)) {
              break label354;
            }
            String str1 = String.valueOf(paramString2);
            if (str1.length() != 0)
            {
              "hasStreamChanged: no change, found: ".concat(str1);
              break label354;
              new String("\t");
              break label212;
              break;
            }
            new String("hasStreamChanged: no change, found: ");
            break label354;
          }
          if (!Log.isLoggable("EsPostsData", 3)) {
            break label354;
          }
          String str2 = String.valueOf(paramString2);
          if (str2.length() != 0)
          {
            "hasStreamChanged: changed, not found: ".concat(str2);
            break label354;
          }
          new String("hasStreamChanged: changed, not found: ");
          break label354;
        }
        label354:
        if (bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  private static List<String> c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    localArrayList = new ArrayList();
    Cursor localCursor = paramSQLiteDatabase.query(true, "activity_streams", lmt.a, "unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", new String[] { paramString }, null, null, null, null);
    if (localCursor == null) {
      return localArrayList;
    }
    try
    {
      if (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void c(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(45 + String.valueOf(paramString).length()).append(">>>>> updateActivityIsSpam id: ").append(paramString).append(" isSpam: false");
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    String str1 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags");
    String str2 = String.valueOf(") WHERE activity_id='");
    String str3 = String.valueOf("'");
    localSQLiteDatabase.execSQL(0 + String.valueOf(str1).length() + String.valueOf(" & -3").length() + String.valueOf(str2).length() + String.valueOf(paramString).length() + String.valueOf(str3).length() + str1 + " & -3" + str2 + paramString + str3);
    a(paramContext, paramString);
  }
  
  public static boolean c(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = hsb.b(paramContext, paramInt).query("activities", new String[] { "plus_one_data" }, "activity_id=?", new String[] { paramString }, null, null, null);
    try
    {
      if ((localCursor.moveToFirst()) && (!localCursor.isNull(0)))
      {
        lmj locallmj = lmj.a(localCursor.getBlob(0));
        if (locallmj != null)
        {
          boolean bool = locallmj.c;
          return bool;
        }
      }
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void d(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(59 + String.valueOf(paramString).length()).append(">>>>> updateActivityCanComment id: ").append(paramString).append(" canViewerComment: ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    if (paramBoolean) {}
    for (String str1 = " | 4";; str1 = " & -5")
    {
      String str2 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags");
      String str3 = String.valueOf(") WHERE activity_id='");
      String str4 = String.valueOf("'");
      localSQLiteDatabase.execSQL(0 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(paramString).length() + String.valueOf(str4).length() + str2 + str1 + str3 + paramString + str4);
      a(paramContext, paramString);
      return;
    }
  }
  
  public static boolean d(Context paramContext, int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    llu localllu;
    do
    {
      return false;
      localllu = f(paramContext, paramInt, paramString);
    } while ((localllu == null) || (TextUtils.isEmpty(localllu.d)));
    return true;
  }
  
  public static void e(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(49 + String.valueOf(paramString).length()).append(">>>>> updateActivityCanShare id: ").append(paramString).append(" canShare: ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    if (paramBoolean) {}
    for (String str1 = " | 8";; str1 = " & -9")
    {
      String str2 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags");
      String str3 = String.valueOf(") WHERE activity_id='");
      String str4 = String.valueOf("'");
      localSQLiteDatabase.execSQL(0 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(paramString).length() + String.valueOf(str4).length() + str2 + str1 + str3 + paramString + str4);
      a(paramContext, paramString);
      return;
    }
  }
  
  public static boolean e(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor;
    if (!TextUtils.isEmpty(paramString)) {
      localCursor = hsb.b(paramContext, paramInt).query("activities", new String[] { "activity_flags" }, "activity_id=?", new String[] { paramString }, null, null, null);
    }
    try
    {
      if ((localCursor.moveToFirst()) && (!localCursor.isNull(0)))
      {
        long l = localCursor.getLong(0);
        if ((l & 0x1000) != 0L) {}
        for (boolean bool = true;; bool = false) {
          return bool;
        }
      }
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static llu f(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = hsb.b(paramContext, paramInt).query("activities", new String[] { "embed_appinvite" }, "activity_id=?", new String[] { paramString }, null, null, null);
    try
    {
      if ((localCursor.moveToFirst()) && (!localCursor.isNull(0)))
      {
        llu localllu = llu.a(localCursor.getBlob(0));
        return localllu;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void f(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(61 + String.valueOf(paramString).length()).append(">>>>> updateActivityIsStrangerPost id: ").append(paramString).append(" isStrangerPost: ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    if (paramBoolean) {}
    for (String str1 = " | 32";; str1 = " & -33")
    {
      String str2 = String.valueOf("UPDATE activities SET activity_flags=(activity_flags");
      String str3 = String.valueOf(") WHERE author_id='");
      String str4 = String.valueOf("'");
      localSQLiteDatabase.execSQL(0 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(paramString).length() + String.valueOf(str4).length() + str2 + str1 + str3 + paramString + str4);
      a(paramContext, paramString);
      return;
    }
  }
  
  public static void g(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("stream_key IN(");
    localStringBuilder.append(DatabaseUtils.sqlEscapeString(paramString));
    localStringBuilder.append(')');
    int i = localSQLiteDatabase.delete("activity_streams", localStringBuilder.toString(), null);
    Uri localUri = Uri.withAppendedPath(lnf.a, paramString);
    paramContext.getContentResolver().notifyChange(localUri, null);
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(49).append("deleteActivityStream deleted streams: ").append(i);
    }
  }
  
  public static void g(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("EsPostsData", 3)) {
      new StringBuilder(55 + String.valueOf(paramString).length()).append(">>>>> updateActivityContactsBlocked id: ").append(paramString).append(" blocked: ").append(paramBoolean);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    Cursor localCursor = localSQLiteDatabase.query("activity_contacts", c, "gaia_id=?", new String[] { paramString }, null, null, null);
    for (;;)
    {
      try
      {
        if (localCursor.moveToNext())
        {
          str1 = localCursor.getString(localCursor.getColumnIndexOrThrow("name"));
          String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("avatar_url"));
          str2 = str3;
          localCursor.close();
          a(localSQLiteDatabase, paramString, str1, str2, paramBoolean);
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      String str1 = null;
      String str2 = null;
    }
  }
  
  /* Error */
  public static void h(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 122
    //   2: iconst_3
    //   3: invokestatic 350	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +26 -> 32
    //   9: aload_2
    //   10: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: astore 16
    //   15: aload 16
    //   17: invokevirtual 354	java/lang/String:length	()I
    //   20: ifeq +193 -> 213
    //   23: ldc_w 1847
    //   26: aload 16
    //   28: invokevirtual 524	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   31: pop
    //   32: aload_0
    //   33: iload_1
    //   34: invokestatic 154	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   37: astore 4
    //   39: iconst_1
    //   40: anewarray 39	java/lang/String
    //   43: dup
    //   44: iconst_0
    //   45: aload_2
    //   46: aastore
    //   47: astore 5
    //   49: aload 4
    //   51: ldc_w 1756
    //   54: aload 5
    //   56: invokestatic 1760	android/database/DatabaseUtils:stringForQuery	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   59: astore 10
    //   61: aload 4
    //   63: invokevirtual 159	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   66: iload_3
    //   67: ifeq +207 -> 274
    //   70: ldc_w 1849
    //   73: astore 11
    //   75: ldc_w 1851
    //   78: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   81: astore 13
    //   83: ldc_w 1853
    //   86: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore 14
    //   91: ldc_w 1779
    //   94: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   97: astore 15
    //   99: aload 4
    //   101: new 280	java/lang/StringBuilder
    //   104: dup
    //   105: iconst_0
    //   106: aload 13
    //   108: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   111: invokevirtual 354	java/lang/String:length	()I
    //   114: iadd
    //   115: aload 11
    //   117: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   120: invokevirtual 354	java/lang/String:length	()I
    //   123: iadd
    //   124: aload 14
    //   126: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   129: invokevirtual 354	java/lang/String:length	()I
    //   132: iadd
    //   133: aload_2
    //   134: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   137: invokevirtual 354	java/lang/String:length	()I
    //   140: iadd
    //   141: aload 15
    //   143: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: invokevirtual 354	java/lang/String:length	()I
    //   149: iadd
    //   150: invokespecial 355	java/lang/StringBuilder:<init>	(I)V
    //   153: aload 13
    //   155: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload 11
    //   160: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload 14
    //   165: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: aload_2
    //   169: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: aload 15
    //   174: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   180: invokevirtual 1582	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   183: aload 4
    //   185: aload 10
    //   187: iconst_0
    //   188: invokestatic 1493	lmp:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V
    //   191: aload 4
    //   193: invokevirtual 214	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   196: aload 4
    //   198: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   201: aload 10
    //   203: ifnull +9 -> 212
    //   206: aload_0
    //   207: aload 10
    //   209: invokestatic 205	lmp:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   212: return
    //   213: new 39	java/lang/String
    //   216: dup
    //   217: ldc_w 1847
    //   220: invokespecial 577	java/lang/String:<init>	(Ljava/lang/String;)V
    //   223: pop
    //   224: goto -192 -> 32
    //   227: astore 6
    //   229: ldc 122
    //   231: iconst_5
    //   232: invokestatic 350	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   235: ifeq -23 -> 212
    //   238: aload_2
    //   239: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   242: astore 7
    //   244: aload 7
    //   246: invokevirtual 354	java/lang/String:length	()I
    //   249: ifeq +13 -> 262
    //   252: ldc_w 1855
    //   255: aload 7
    //   257: invokevirtual 524	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   260: pop
    //   261: return
    //   262: new 39	java/lang/String
    //   265: dup
    //   266: ldc_w 1855
    //   269: invokespecial 577	java/lang/String:<init>	(Ljava/lang/String;)V
    //   272: pop
    //   273: return
    //   274: ldc_w 1857
    //   277: astore 11
    //   279: goto -204 -> 75
    //   282: astore 12
    //   284: aload 4
    //   286: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   289: aload 12
    //   291: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	paramContext	Context
    //   0	292	1	paramInt	int
    //   0	292	2	paramString	String
    //   0	292	3	paramBoolean	boolean
    //   37	248	4	localSQLiteDatabase	SQLiteDatabase
    //   47	8	5	arrayOfString	String[]
    //   227	1	6	localSQLiteDoneException	android.database.sqlite.SQLiteDoneException
    //   242	14	7	str1	String
    //   59	149	10	str2	String
    //   73	205	11	str3	String
    //   282	8	12	localObject	Object
    //   81	73	13	str4	String
    //   89	75	14	str5	String
    //   97	76	15	str6	String
    //   13	14	16	str7	String
    // Exception table:
    //   from	to	target	type
    //   49	61	227	android/database/sqlite/SQLiteDoneException
    //   75	196	282	finally
  }
  
  /* Error */
  public static void i(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 154	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   5: astore 4
    //   7: aload 4
    //   9: iconst_1
    //   10: ldc_w 535
    //   13: getstatic 1598	lms:a	[Ljava/lang/String;
    //   16: ldc_w 1413
    //   19: iconst_1
    //   20: anewarray 39	java/lang/String
    //   23: dup
    //   24: iconst_0
    //   25: aload_2
    //   26: aastore
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: invokevirtual 1796	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore 5
    //   36: aload 5
    //   38: ifnonnull +4 -> 42
    //   41: return
    //   42: iconst_0
    //   43: istore 6
    //   45: aload 5
    //   47: invokeinterface 180 1 0
    //   52: ifeq +156 -> 208
    //   55: aload 5
    //   57: iconst_1
    //   58: invokeinterface 511 2 0
    //   63: astore 8
    //   65: aload 5
    //   67: iconst_0
    //   68: invokeinterface 188 2 0
    //   73: astore 9
    //   75: aload 8
    //   77: invokestatic 1604	llr:a	([B)Lllr;
    //   80: astore 10
    //   82: aload 10
    //   84: ifnull -39 -> 45
    //   87: aload 10
    //   89: getfield 1860	llr:a	Llmo;
    //   92: astore 11
    //   94: aload 11
    //   96: ifnull -51 -> 45
    //   99: aload 11
    //   101: iconst_1
    //   102: putfield 1864	lmo:a	Z
    //   105: aload 4
    //   107: invokevirtual 159	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   110: new 171	android/content/ContentValues
    //   113: dup
    //   114: iconst_1
    //   115: invokespecial 174	android/content/ContentValues:<init>	(I)V
    //   118: astore 12
    //   120: aload 12
    //   122: ldc_w 1532
    //   125: aload 10
    //   127: invokestatic 1540	llr:a	(Lllr;)[B
    //   130: invokevirtual 196	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   133: aload 4
    //   135: ldc_w 535
    //   138: aload 12
    //   140: ldc_w 1617
    //   143: iconst_2
    //   144: anewarray 39	java/lang/String
    //   147: dup
    //   148: iconst_0
    //   149: aload 9
    //   151: aastore
    //   152: dup
    //   153: iconst_1
    //   154: aload_2
    //   155: aastore
    //   156: invokevirtual 202	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   159: pop
    //   160: aload 4
    //   162: invokevirtual 214	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   165: aload 4
    //   167: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   170: iconst_1
    //   171: istore 6
    //   173: goto -128 -> 45
    //   176: astore 14
    //   178: aload 4
    //   180: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   183: goto -138 -> 45
    //   186: astore 7
    //   188: aload 5
    //   190: invokeinterface 208 1 0
    //   195: aload 7
    //   197: athrow
    //   198: astore 13
    //   200: aload 4
    //   202: invokevirtual 211	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   205: aload 13
    //   207: athrow
    //   208: aload 5
    //   210: invokeinterface 208 1 0
    //   215: iload 6
    //   217: ifeq -176 -> 41
    //   220: aload_0
    //   221: aload_2
    //   222: invokestatic 205	lmp:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   225: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	paramContext	Context
    //   0	226	1	paramInt	int
    //   0	226	2	paramString	String
    //   0	226	3	paramBoolean	boolean
    //   5	196	4	localSQLiteDatabase	SQLiteDatabase
    //   34	175	5	localCursor	Cursor
    //   43	173	6	i	int
    //   186	10	7	localObject1	Object
    //   63	13	8	arrayOfByte	byte[]
    //   73	77	9	str	String
    //   80	46	10	localllr	llr
    //   92	8	11	locallmo	lmo
    //   118	21	12	localContentValues	ContentValues
    //   198	8	13	localObject2	Object
    //   176	1	14	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   110	165	176	java/io/IOException
    //   45	82	186	finally
    //   87	94	186	finally
    //   99	110	186	finally
    //   165	170	186	finally
    //   178	183	186	finally
    //   200	208	186	finally
    //   110	165	198	finally
  }
  
  public static void j(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    String[] arrayOfString1 = lms.a;
    String[] arrayOfString2 = new String[bool];
    arrayOfString2[0] = paramString;
    Cursor localCursor = localSQLiteDatabase.query(bool, "activity_streams", arrayOfString1, "unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", arrayOfString2, null, null, null, null);
    if (localCursor == null) {
      return;
    }
    int i;
    int j;
    for (;;)
    {
      try
      {
        localSQLiteDatabase.beginTransaction();
        i = 0;
        j = 0;
        label67:
        if (localCursor.moveToNext())
        {
          j++;
          byte[] arrayOfByte = localCursor.getBlob(1);
          str = localCursor.getString(0);
          localllr = llr.a(arrayOfByte);
          if (localllr != null)
          {
            lmf locallmf = localllr.e;
            if (locallmf != null) {
              locallmf.a = paramBoolean;
            }
          }
        }
      }
      finally
      {
        String str;
        llr localllr;
        ContentValues localContentValues;
        Object[] arrayOfObject;
        localSQLiteDatabase.endTransaction();
        localCursor.close();
      }
      try
      {
        localContentValues = new ContentValues(1);
        localContentValues.put("context_specific_data", llr.a(localllr));
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        String.format("Updating activity to %s", arrayOfObject);
        localSQLiteDatabase.update("activity_streams", localContentValues, "stream_key=? AND unique_activity_id IN (SELECT unique_activity_id FROM activities WHERE activity_id = ?)", new String[] { str, paramString });
        i++;
      }
      catch (IOException localIOException) {}
      Log.e("EsPostsData", "Failed to update inferred post because DbInferredGraphPost is null.");
      continue;
      Log.e("EsPostsData", "Failed to update inferred post because DbContextSpecificData is null.");
    }
    if (i == j) {
      localSQLiteDatabase.setTransactionSuccessful();
    }
    for (;;)
    {
      localSQLiteDatabase.endTransaction();
      localCursor.close();
      if (!bool) {
        break;
      }
      a(paramContext, paramString);
      return;
      break label67;
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmp
 * JD-Core Version:    0.7.0.1
 */