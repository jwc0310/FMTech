import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class bry
{
  static final String[] a = { "_id", "cluster_id", "parent_id", "type", "media_key", "comment_count", "plusone_count" };
  static final String[] b = { "cluster_id", "equivalence_token" };
  private static final String[] c = { "token" };
  private static final SparseArray<Object> d = new SparseArray();
  
  private static bsj a(Context paramContext, int paramInt1, bsh parambsh, int paramInt2)
  {
    a(paramContext, paramInt1, "in_progress", 2);
    Object localObject1 = null;
    Object localObject2 = null;
    boolean bool2;
    label40:
    int i;
    label183:
    int j;
    label212:
    bsc localbsc;
    boolean bool1;
    label381:
    int n;
    if (Log.isLoggable("EsTileSync", 3))
    {
      String str8 = String.valueOf("has_next, hasSyncedAtLeastOnePage=");
      if (parambsh.j > 0)
      {
        bool2 = true;
        boolean bool3 = parambsh.d();
        long l = jqx.b(parambsh.g, parambsh.f);
        int i2 = parambsh.e;
        boolean bool4 = parambsh.d;
        boolean bool5 = parambsh.c();
        boolean bool6 = parambsh.b();
        new StringBuilder(167 + String.valueOf(str8).length()).append(str8).append(bool2).append(", validResumeToken=").append(bool3).append(", total fetched so far=").append(l).append(", max can fetch=").append(i2).append(", isInitialSync=").append(bool4).append(", isUnderMetadataLimit=").append(bool5).append(", isCancelled=").append(bool6);
      }
    }
    else
    {
      if (parambsh.j <= 0) {
        break label480;
      }
      i = 1;
      if ((i != 0) && ((parambsh.b()) || (!parambsh.d()) || (!parambsh.c()))) {
        break label486;
      }
      j = 1;
      if (j == 0) {
        break label498;
      }
      if (Log.isLoggable("EsTileSync", 4))
      {
        String str7 = String.valueOf("Syncing updated photos, pages read so far:");
        int i1 = parambsh.j;
        new StringBuilder(11 + String.valueOf(str7).length()).append(str7).append(i1);
      }
      localbsc = parambsh.c.a(parambsh.h);
      if (parambsh.b != null)
      {
        bup localbup1 = parambsh.b;
        localbup1.h = (localbsc.c.length + localbup1.h);
        bup localbup2 = parambsh.b;
        localbup2.i = (1 + localbup2.i);
      }
      parambsh.i = parambsh.h;
      parambsh.h = localbsc.a;
      parambsh.j = (1 + parambsh.j);
      a((Thread)localObject2);
      if ((!parambsh.a) || (parambsh.j != 1)) {
        break label492;
      }
      bool1 = true;
      n = parambsh.j;
      if ((localbsc.e == null) || (localbsc.e.e == null) || (localbsc.e.e.a == null)) {
        break label806;
      }
    }
    label650:
    label806:
    for (Object localObject3 = localbsc.e.e.a;; localObject3 = localObject1)
    {
      Thread localThread = new Thread(new brz(paramContext, paramInt1, bool1, n, paramInt2, localbsc));
      localThread.start();
      localObject2 = localThread;
      localObject1 = localObject3;
      break;
      bool2 = false;
      break label40;
      label480:
      i = 0;
      break label183;
      label486:
      j = 0;
      break label212;
      label492:
      bool1 = false;
      break label381;
      label498:
      a((Thread)localObject2);
      String str1 = a(paramContext, paramInt1, 1);
      if (Log.isLoggable("EsTileSync", 2))
      {
        String str6 = String.valueOf(str1);
        if (str6.length() == 0) {
          break label650;
        }
        "Got next sync token from db=".concat(str6);
      }
      while (TextUtils.isEmpty(str1))
      {
        ((dka)mbb.a(paramContext, dka.class)).e(paramInt1);
        String str4 = String.valueOf("We've completed a sync without getting a non null sync token, pages read: ");
        int m = parambsh.j;
        String str5 = String.valueOf(parambsh);
        throw new IllegalStateException(57 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + m + ", photoPager: " + str5 + ", resume token type: " + paramInt2);
        new String("Got next sync token from db=");
      }
      a(paramContext, paramInt1, null, 2);
      a(paramContext, paramInt1, null, 1);
      a(paramContext, paramInt1, str1, 0);
      if (Log.isLoggable("EsTileSync", 4))
      {
        String str2 = String.valueOf("Finished all photos update, stop reason: ");
        String str3 = String.valueOf(parambsh.a());
        int k = parambsh.j;
        new StringBuilder(65 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str1).length()).append(str2).append(str3).append(", pages retrieved: ").append(k).append(", syncToken: ").append(str1).append(", account: ").append(paramInt1);
      }
      return new bsj(parambsh.a(), localObject1);
    }
  }
  
  private static bsj a(Context paramContext, int paramInt1, bup parambup, String paramString, int paramInt2, bsb parambsb, boolean paramBoolean, int paramInt3)
  {
    if (Log.isLoggable("EsTileSync", 4))
    {
      String str1 = String.valueOf("updateRemotePhotos starting, fetcher: (");
      String str2 = String.valueOf(parambsb);
      long l = jqx.b(paramContext, paramInt1);
      new StringBuilder(158 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(paramString).length()).append(str1).append(str2).append("), resumeToken: ").append(paramString).append(", resumeTokenType: ").append(paramInt2).append(", metadata so far: ").append(l).append(", max metadata: ").append(paramInt3).append(", is initial sync: ").append(paramBoolean).append(", account: ").append(paramInt1);
    }
    return a(paramContext, paramInt1, new bsh(paramContext, paramInt1, parambup, paramString, paramInt3, parambsb, paramBoolean), paramInt2);
  }
  
  public static bsk a(Context paramContext, int paramInt1, bup parambup, bsn parambsn, int paramInt2)
  {
    String str1 = a(paramContext, paramInt1, 0);
    int j;
    int i;
    label58:
    String str5;
    bsg localbsg;
    bsj localbsj2;
    bsk localbsk3;
    label153:
    bsk localbsk1;
    String str2;
    if ((!TextUtils.isEmpty(str1)) && (parambsn != bsn.c))
    {
      if ((!TextUtils.isEmpty(a(paramContext, paramInt1, 3))) && (jqx.b(paramContext, paramInt1) < paramInt2))
      {
        j = 1;
        if (j == 0) {
          break label257;
        }
      }
    }
    else
    {
      i = 1;
      if (i == 0) {
        break label577;
      }
      str5 = a(paramContext, paramInt1, 3);
      localbsg = new bsg(paramContext, paramInt1, parambsn);
      if ((parambsn != bsn.c) && (!TextUtils.isEmpty(str5))) {
        break label263;
      }
      if (parambsn == bsn.c) {
        a(paramContext, paramInt1);
      }
      localbsj2 = a(paramContext, paramInt1, parambup, null, 3, localbsg, true, paramInt2);
      if (localbsj2.a != bsi.a) {
        break label392;
      }
      localbsk3 = new bsk(bsm.b, localbsj2.b);
      String str7 = a(paramContext, paramInt1, 0);
      localbsk1 = localbsk3;
      str2 = str7;
    }
    for (;;)
    {
      String str3 = a(paramContext, paramInt1, 4);
      bse localbse = new bse(paramContext, paramInt1, parambsn, str2);
      if (TextUtils.isEmpty(str3)) {}
      bsk localbsk2;
      for (bsj localbsj1 = a(paramContext, paramInt1, parambup, null, 4, localbse, false, 2147483647);; localbsj1 = a(paramContext, paramInt1, null, str3, 4, localbse, false, 2147483647))
      {
        if (localbsj1.a != bsi.a) {
          break label524;
        }
        localbsk2 = new bsk(bsm.c, localbsj1.b);
        if (localbsk1 == null) {
          break label574;
        }
        return localbsk1;
        j = 0;
        break;
        label257:
        i = 0;
        break label58;
        label263:
        String str8 = a(paramContext, paramInt1, 0);
        if (!TextUtils.isEmpty(str8)) {
          a(paramContext, paramInt1, str8, 1);
        }
        while (!TextUtils.isEmpty(a(paramContext, paramInt1, 1)))
        {
          localbsj2 = a(paramContext, paramInt1, null, str5, 3, localbsg, true, paramInt2);
          break;
        }
        ((dka)mbb.a(paramContext, dka.class)).e(paramInt1);
        String str9 = String.valueOf("Trying to resume initial sync with empty current and next sync tokens, syncType: ");
        String str10 = String.valueOf(parambsn);
        throw new IllegalStateException(0 + String.valueOf(str9).length() + String.valueOf(str10).length() + str9 + str10);
        label392:
        if (localbsj2.a == bsi.b)
        {
          localbsk3 = new bsk(bsm.a, localbsj2.b);
          break label153;
        }
        if (localbsj2.a == bsi.c)
        {
          localbsk3 = new bsk(bsm.d, localbsj2.b);
          break label153;
        }
        String str6 = String.valueOf(localbsj2.a);
        throw new IllegalStateException(39 + String.valueOf(str6).length() + "Initial sync ended for unknown reason: " + str6);
      }
      label524:
      String str4 = String.valueOf(localbsj1.a);
      throw new IllegalArgumentException(37 + String.valueOf(str4).length() + "Delta sync ended for unknown reason: " + str4);
      label574:
      return localbsk2;
      label577:
      str2 = str1;
      localbsk1 = null;
    }
  }
  
  private static String a(Context paramContext, int paramInt1, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getReadableDatabase();
    String[] arrayOfString1 = c;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Integer.toString(paramInt2);
    Cursor localCursor = localSQLiteDatabase.query("photo_requests", arrayOfString1, "token_type = ?", arrayOfString2, null, null, null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        String str = localCursor.getString(0);
        localObject2 = str;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    bqj.a(paramContext, paramInt).getWritableDatabase().delete("photo_requests", null, null);
  }
  
  private static void a(Context paramContext, int paramInt, bso parambso, bsd parambsd, bsl parambsl, ArrayList<jrg> paramArrayList, bsn parambsn, SQLiteDatabase paramSQLiteDatabase)
  {
    String str1 = jrf.a(paramContext, paramInt);
    String[] arrayOfString = { str1 };
    bsf localbsf = new bsf(paramContext, paramInt);
    if (parambsn == bsn.c)
    {
      paramSQLiteDatabase.delete("all_tiles", "view_id = ? AND media_attr & 512 == 0", arrayOfString);
      parambsl.a += localbsf.f;
    }
    HashSet localHashSet;
    for (Object localObject = null;; localObject = localHashSet)
    {
      long l1 = 1000000L;
      Iterator localIterator2 = parambso.e.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        if ((localObject != null) && (localObject.contains(str2)))
        {
          Iterator localIterator4 = ((ArrayList)localbsf.a.get(str2)).iterator();
          while (localIterator4.hasNext())
          {
            String str4 = (String)localIterator4.next();
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("view_order", Long.valueOf(l1));
            paramSQLiteDatabase.update("all_tiles", localContentValues, "_id = ?", new String[] { str4 });
            parambsl.b = (1L + parambsl.b);
            l1 += 1L;
          }
          continue;
          localHashSet = new HashSet();
          if (parambso.a != bsn.c)
          {
            Iterator localIterator5 = parambso.e.keySet().iterator();
            while (localIterator5.hasNext())
            {
              String str5 = (String)localIterator5.next();
              bme localbme = (bme)parambso.e.get(str5);
              String str6 = localbme.a(str5);
              if ((str6 == null) || (localbsf.a(str5, str6)) || (parambso.c == 2))
              {
                localHashSet.add(str5);
                localHashSet.addAll(localbme.b(str5));
              }
            }
          }
          Iterator localIterator1 = localbsf.a(localHashSet).iterator();
          while (localIterator1.hasNext())
          {
            paramSQLiteDatabase.delete("all_tiles", "_id = ?", new String[] { (String)localIterator1.next() });
            parambsl.a = (1L + parambsl.a);
          }
        }
        else
        {
          okn localokn1 = (okn)parambsd.a.get(str2);
          if (localokn1 != null)
          {
            okn[] arrayOfokn1 = localokn1.i;
            ArrayList localArrayList = new ArrayList();
            Iterator localIterator3 = ((bme)parambso.e.get(str2)).b(str2).iterator();
            label556:
            while (localIterator3.hasNext())
            {
              String str3 = (String)localIterator3.next();
              LinkedHashMap localLinkedHashMap = (LinkedHashMap)parambsd.b.get(str2);
              if (localLinkedHashMap != null) {}
              for (okn localokn3 = (okn)localLinkedHashMap.get(str3);; localokn3 = null)
              {
                if (localokn3 == null) {
                  break label556;
                }
                localArrayList.add(localokn3);
                break;
              }
            }
            localokn1.i = ((okn[])localArrayList.toArray(new okn[localArrayList.size()]));
            if (localokn1.i.length > 0)
            {
              if ((localokn1.b(okl.a) == null) || (localokn1.j != 2))
              {
                long l2 = jrf.a(paramContext, paramInt, paramSQLiteDatabase, str1, new okn[] { localokn1 }, l1, null, paramArrayList, null, null, new HashSet());
                parambsl.c = (l2 + parambsl.c);
                l1 += l2;
              }
            }
            else
            {
              localokn1.i = arrayOfokn1;
              continue;
            }
            oif localoif = ((okl)localokn1.b(okl.a)).b;
            Long localLong1 = localoif.h;
            long l3;
            label703:
            Long localLong2;
            if (localLong1 == null)
            {
              l3 = 0L;
              localLong2 = localoif.i;
              if (localLong2 != null) {
                break label857;
              }
            }
            label857:
            for (long l4 = 0L;; l4 = localLong2.longValue())
            {
              if ((l4 == 0L) && (localokn1.i != null)) {
                l4 = localokn1.i.length;
              }
              if ((l3 == 0L) || (l4 == 0L) || (l3 == l4) || (localokn1.i == null)) {
                break;
              }
              okn localokn2 = efj.a(jrf.a(localoif.a, localoif.e, localoif.b, localoif.c), l3 - l4);
              okn[] arrayOfokn2 = (okn[])Arrays.copyOf(localokn1.i, 1 + localokn1.i.length);
              arrayOfokn2[localokn1.i.length] = localokn2;
              localokn1.i = arrayOfokn2;
              break;
              l3 = localLong1.longValue();
              break label703;
            }
          }
          else if (Log.isLoggable("EsTileSync", 5))
          {
            new StringBuilder(41 + String.valueOf(str2).length()).append("Could not find collection ID ").append(str2).append(" during sync");
          }
        }
      }
      return;
    }
  }
  
  private static void a(Context paramContext, int paramInt, bup parambup, bsd parambsd, bsn parambsn)
  {
    String str1 = jrf.a(paramContext, paramInt);
    l1 = System.currentTimeMillis();
    localbsl = new bsl();
    bsf localbsf = new bsf(paramContext, paramInt);
    int i;
    int j;
    label65:
    bso localbso;
    ArrayList localArrayList;
    if ((localbsf.a.isEmpty()) && (localbsf.b.isEmpty()))
    {
      i = 1;
      if (i == 0) {
        break label376;
      }
      j = 1;
      localbso = new bso(paramContext, paramInt, parambup, parambsn, j);
      localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      localArrayList = new ArrayList();
      if ((parambsn != bsn.c) && (localbso.a(localbsf))) {
        break label438;
      }
    }
    label438:
    for (int k = 1;; k = 0)
    {
      if (k != 0) {
        parambsd.a(localbso.b(localbsf));
      }
      localSQLiteDatabase.beginTransaction();
      if (k != 0) {}
      try
      {
        a(paramContext, paramInt, localbso, parambsd, localbsl, localArrayList, parambsn, localSQLiteDatabase);
        if (localbso.d) {
          a(localbso, localbsf, localbsl, localSQLiteDatabase);
        }
        jrf.b(paramContext, paramInt, str1, localbso.b, true);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsTileSync", 4))
        {
          String str4 = String.valueOf("[UPDATE_BEST_PHOTOS], rows deleted = ");
          long l6 = localbsl.a;
          long l7 = localbsl.b;
          long l8 = localbsl.c;
          long l9 = localbsl.d;
          String str5 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
          new StringBuilder(159 + String.valueOf(str4).length() + String.valueOf(str5).length()).append(str4).append(l6).append(", rows reordered = ").append(l7).append(", rows inserted = ").append(l8).append(", rows with new social data = ").append(l9).append(", duration: ").append(str5);
        }
        paramContext.getContentResolver().notifyChange(jrf.a.buildUpon().appendEncodedPath(str1).build(), null);
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        if (!Log.isLoggable("EsTileSync", 4)) {
          break label593;
        }
        String str2 = String.valueOf("[UPDATE_BEST_PHOTOS], rows deleted = ");
        long l2 = localbsl.a;
        long l3 = localbsl.b;
        long l4 = localbsl.c;
        long l5 = localbsl.d;
        String str3 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
        new StringBuilder(159 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str2).append(l2).append(", rows reordered = ").append(l3).append(", rows inserted = ").append(l4).append(", rows with new social data = ").append(l5).append(", duration: ").append(str3);
      }
      i = 0;
      break;
      label376:
      if (parambsn == bsn.e)
      {
        j = 2;
        break label65;
      }
      if (parambsn == bsn.f)
      {
        j = 3;
        break label65;
      }
      if (parambsn == bsn.c)
      {
        j = 5;
        break label65;
      }
      if (parambsn == bsn.b)
      {
        j = 4;
        break label65;
      }
      j = 0;
      break label65;
    }
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, bup parambup, bsn parambsn)
  {
    // Byte code:
    //   0: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   11: iload_1
    //   12: invokevirtual 661	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   15: astore 6
    //   17: aload 6
    //   19: ifnull +291 -> 310
    //   22: aload_3
    //   23: getstatic 655	bsn:f	Lbsn;
    //   26: if_acmpeq +10 -> 36
    //   29: aload_3
    //   30: getstatic 653	bsn:e	Lbsn;
    //   33: if_acmpne +180 -> 213
    //   36: ldc 54
    //   38: iconst_4
    //   39: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   42: ifeq +65 -> 107
    //   45: ldc_w 663
    //   48: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   51: astore 19
    //   53: aload_3
    //   54: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore 20
    //   59: new 99	java/lang/StringBuilder
    //   62: dup
    //   63: bipush 50
    //   65: aload 19
    //   67: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: invokevirtual 103	java/lang/String:length	()I
    //   73: iadd
    //   74: aload 20
    //   76: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   79: invokevirtual 103	java/lang/String:length	()I
    //   82: iadd
    //   83: invokespecial 106	java/lang/StringBuilder:<init>	(I)V
    //   86: aload 19
    //   88: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: aload 20
    //   93: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc_w 665
    //   99: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: iload_1
    //   103: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 4
    //   109: monitorexit
    //   110: aload 6
    //   112: monitorenter
    //   113: ldc 54
    //   115: iconst_4
    //   116: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   119: ifeq +39 -> 158
    //   122: aload_3
    //   123: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   126: astore 17
    //   128: new 99	java/lang/StringBuilder
    //   131: dup
    //   132: bipush 37
    //   134: aload 17
    //   136: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   139: invokevirtual 103	java/lang/String:length	()I
    //   142: iadd
    //   143: invokespecial 106	java/lang/StringBuilder:<init>	(I)V
    //   146: ldc_w 667
    //   149: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload 17
    //   154: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_2
    //   159: ifnull +176 -> 335
    //   162: aload_0
    //   163: ldc_w 669
    //   166: invokestatic 217	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   169: checkcast 669	ixf
    //   172: astore 11
    //   174: aload_2
    //   175: invokevirtual 670	bup:b	()Z
    //   178: ifne +13 -> 191
    //   181: aload 11
    //   183: invokeinterface 672 1 0
    //   188: ifne +147 -> 335
    //   191: aload 6
    //   193: monitorexit
    //   194: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   197: astore 12
    //   199: aload 12
    //   201: monitorenter
    //   202: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   205: iload_1
    //   206: invokevirtual 675	android/util/SparseArray:remove	(I)V
    //   209: aload 12
    //   211: monitorexit
    //   212: return
    //   213: ldc 54
    //   215: iconst_4
    //   216: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   219: ifeq +65 -> 284
    //   222: ldc_w 663
    //   225: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   228: astore 23
    //   230: aload_3
    //   231: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   234: astore 24
    //   236: new 99	java/lang/StringBuilder
    //   239: dup
    //   240: bipush 36
    //   242: aload 23
    //   244: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   247: invokevirtual 103	java/lang/String:length	()I
    //   250: iadd
    //   251: aload 24
    //   253: invokestatic 66	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   256: invokevirtual 103	java/lang/String:length	()I
    //   259: iadd
    //   260: invokespecial 106	java/lang/StringBuilder:<init>	(I)V
    //   263: aload 23
    //   265: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: aload 24
    //   270: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: ldc_w 677
    //   276: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: iload_1
    //   280: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload 6
    //   286: monitorenter
    //   287: aload 6
    //   289: monitorexit
    //   290: aload 4
    //   292: monitorexit
    //   293: return
    //   294: astore 5
    //   296: aload 4
    //   298: monitorexit
    //   299: aload 5
    //   301: athrow
    //   302: astore 22
    //   304: aload 6
    //   306: monitorexit
    //   307: aload 22
    //   309: athrow
    //   310: new 4	java/lang/Object
    //   313: dup
    //   314: invokespecial 678	java/lang/Object:<init>	()V
    //   317: astore 26
    //   319: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   322: iload_1
    //   323: aload 26
    //   325: invokevirtual 681	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   328: aload 26
    //   330: astore 6
    //   332: goto -225 -> 107
    //   335: aload_0
    //   336: iload_1
    //   337: invokestatic 686	aum:b	(Landroid/content/Context;I)Lojb;
    //   340: pop
    //   341: aload_0
    //   342: iload_1
    //   343: aload_3
    //   344: invokestatic 691	bsp:a	(Landroid/content/Context;ILbsn;)I
    //   347: ifle -156 -> 191
    //   350: new 489	bsd
    //   353: dup
    //   354: aload_0
    //   355: iload_1
    //   356: aload_2
    //   357: invokespecial 694	bsd:<init>	(Landroid/content/Context;ILbup;)V
    //   360: astore 15
    //   362: aload_0
    //   363: iload_1
    //   364: aload_2
    //   365: aload 15
    //   367: aload_3
    //   368: invokestatic 696	bry:a	(Landroid/content/Context;ILbup;Lbsd;Lbsn;)V
    //   371: aload 15
    //   373: invokevirtual 698	bsd:a	()V
    //   376: aload_0
    //   377: ldc_w 700
    //   380: invokestatic 217	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   383: checkcast 700	giz
    //   386: iload_1
    //   387: invokeinterface 703 2 0
    //   392: ldc_w 705
    //   395: invokeinterface 709 2 0
    //   400: pop
    //   401: aload_0
    //   402: ldc_w 711
    //   405: invokestatic 217	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   408: checkcast 711	ivl
    //   411: invokevirtual 713	ivl:d	()V
    //   414: aload_0
    //   415: iload_1
    //   416: invokestatic 717	bua:c	(Landroid/content/Context;I)V
    //   419: goto -228 -> 191
    //   422: astore 10
    //   424: aload 6
    //   426: monitorexit
    //   427: aload 10
    //   429: athrow
    //   430: astore 7
    //   432: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   435: astore 8
    //   437: aload 8
    //   439: monitorenter
    //   440: getstatic 46	bry:d	Landroid/util/SparseArray;
    //   443: iload_1
    //   444: invokevirtual 675	android/util/SparseArray:remove	(I)V
    //   447: aload 8
    //   449: monitorexit
    //   450: aload 7
    //   452: athrow
    //   453: astore 13
    //   455: aload 12
    //   457: monitorexit
    //   458: aload 13
    //   460: athrow
    //   461: astore 9
    //   463: aload 8
    //   465: monitorexit
    //   466: aload 9
    //   468: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	paramContext	Context
    //   0	469	1	paramInt	int
    //   0	469	2	parambup	bup
    //   0	469	3	parambsn	bsn
    //   3	294	4	localSparseArray1	SparseArray
    //   294	6	5	localObject1	Object
    //   15	410	6	localObject2	Object
    //   430	21	7	localObject3	Object
    //   435	29	8	localSparseArray2	SparseArray
    //   461	6	9	localObject4	Object
    //   422	6	10	localObject5	Object
    //   172	10	11	localixf	ixf
    //   197	259	12	localSparseArray3	SparseArray
    //   453	6	13	localObject6	Object
    //   360	12	15	localbsd	bsd
    //   126	27	17	str1	String
    //   51	36	19	str2	String
    //   57	35	20	str3	String
    //   302	6	22	localObject7	Object
    //   228	36	23	str4	String
    //   234	35	24	str5	String
    //   317	12	26	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   8	17	294	finally
    //   22	36	294	finally
    //   36	107	294	finally
    //   107	110	294	finally
    //   213	284	294	finally
    //   284	287	294	finally
    //   290	293	294	finally
    //   296	299	294	finally
    //   307	310	294	finally
    //   310	328	294	finally
    //   287	290	302	finally
    //   304	307	302	finally
    //   113	158	422	finally
    //   162	191	422	finally
    //   191	194	422	finally
    //   335	419	422	finally
    //   424	427	422	finally
    //   110	113	430	finally
    //   427	430	430	finally
    //   202	212	453	finally
    //   455	458	453	finally
    //   440	450	461	finally
    //   463	466	461	finally
  }
  
  static void a(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      a(localSQLiteDatabase, paramString, paramInt2);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("token_type", Integer.valueOf(paramInt));
    if (TextUtils.isEmpty(paramString)) {
      localContentValues.putNull("token");
    }
    String[] arrayOfString;
    for (;;)
    {
      arrayOfString = new String[1];
      arrayOfString[0] = Integer.toString(paramInt);
      if (DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT COUNT(*) FROM photo_requests WHERE token_type = ?", arrayOfString) != 0L) {
        break;
      }
      paramSQLiteDatabase.insert("photo_requests", null, localContentValues);
      return;
      localContentValues.put("token", paramString);
    }
    paramSQLiteDatabase.update("photo_requests", localContentValues, "token_type = ?", arrayOfString);
  }
  
  private static void a(bso parambso, bsf parambsf, bsl parambsl, SQLiteDatabase paramSQLiteDatabase)
  {
    ArrayList localArrayList1 = new ArrayList();
    if ((parambso.f.isEmpty()) || (parambso.g.isEmpty())) {}
    for (ArrayList localArrayList2 = localArrayList1; localArrayList2.size() == 0; localArrayList2 = localArrayList1)
    {
      return;
      Iterator localIterator2 = parambso.e.keySet().iterator();
      if (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        Iterator localIterator3 = ((bme)parambso.e.get(str2)).b(str2).iterator();
        label100:
        String str3;
        Integer localInteger1;
        int i;
        label144:
        int j;
        Integer localInteger2;
        if (localIterator3.hasNext())
        {
          str3 = (String)localIterator3.next();
          localInteger1 = (Integer)parambsf.e.get(str3);
          if (localInteger1 != null) {
            break label207;
          }
          i = 0;
          j = parambso.b(str3);
          localInteger2 = (Integer)parambsf.d.get(str3);
          if (localInteger2 != null) {
            break label217;
          }
        }
        label207:
        label217:
        for (int k = 0;; k = localInteger2.intValue())
        {
          int m = parambso.a(str3);
          if ((i == j) && (k == m)) {
            break label100;
          }
          localArrayList1.add(str3);
          break label100;
          break;
          i = localInteger1.intValue();
          break label144;
        }
      }
    }
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator1 = localArrayList2.iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localContentValues.clear();
      localContentValues.put("comment_count", Integer.valueOf(parambso.b(str1)));
      localContentValues.put("plusone_count", Integer.valueOf(parambso.a(str1)));
      paramSQLiteDatabase.update("all_tiles", localContentValues, "tile_id = ?", new String[] { str1 });
    }
    parambsl.d += localArrayList2.size();
  }
  
  private static void a(Thread paramThread)
  {
    if (paramThread != null) {}
    try
    {
      paramThread.join();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IllegalStateException("Insert page thread interrupted!", localInterruptedException);
    }
  }
  
  public static boolean b(Context paramContext, int paramInt)
  {
    return !TextUtils.isEmpty(a(paramContext, paramInt, 2));
  }
  
  public static boolean c(Context paramContext, int paramInt)
  {
    String str1 = a(paramContext, paramInt, 0);
    String str2 = a(paramContext, paramInt, 3);
    boolean bool1 = TextUtils.isEmpty(str1);
    boolean bool2 = false;
    if (!bool1)
    {
      boolean bool3 = TextUtils.isEmpty(str2);
      bool2 = false;
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bry
 * JD-Core Version:    0.7.0.1
 */