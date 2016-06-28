import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class brn
{
  static final String[] a = { "circle_id", "circle_name", "type", "contact_count", "semantic_hints", "volume", "for_sharing" };
  public static final Object b = new Object();
  private static final String[] c = { "person_id", "last_updated_time" };
  private static final String[] d = { "reviews_data_proto" };
  private static final String[] e = { "profile_state", "name", "profile_type" };
  private static final String[] f = { "profile_state", "name", "group_concat(link_circle_id, '|') AS packed_circle_ids", "blocked", "last_updated_time", "contact_proto", "profile_update_time", "profile_proto", "people_data_proto", "videos_data_proto", "reviews_data_proto", "local_reviews_data_proto", "self_local_reviews_data_proto", "profile_stats_proto", "profile_squares_proto" };
  private static final Object g = new Object();
  @Deprecated
  private static final Object h = new Object();
  private static final HashMap<String, Object> i = new HashMap();
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 3: 
    case 4: 
    case 6: 
    default: 
      return 11;
    case 1: 
      return 0;
    }
    return 3;
  }
  
  public static long a(ors paramors)
  {
    if (!TextUtils.isEmpty(paramors.b.e)) {
      return Long.parseLong(paramors.b.e, 16);
    }
    return System.currentTimeMillis();
  }
  
  @Deprecated
  public static Cursor a(Context paramContext, int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    int j = 0;
    if (!((giz)mbb.a(paramContext, giz.class)).a(paramInt1).c("is_google_plus")) {
      return new hqr(paramArrayOfString);
    }
    jkz localjkz = new jkz(paramContext);
    jix localjix = localjkz.c();
    jjq localjjq = new jjq(localjix, paramInt1);
    localjix.d();
    localjkz.a(localjjq, paramInt1, 28800L, false);
    long l = f(paramContext, paramInt1);
    boolean bool;
    String str1;
    String[] arrayOfString;
    if (l == -1L)
    {
      bool = true;
      a(paramContext, paramInt1, l, bool);
      str1 = "show_order ASC, sort_key";
      switch (paramInt2)
      {
      case 0: 
      case 6: 
      default: 
        arrayOfString = null;
        str2 = null;
        label230:
        if (0 != 0) {
          if (str2 != null) {
            break label610;
          }
        }
        break;
      }
    }
    label610:
    for (String str2 = null;; str2 = 5 + String.valueOf(str2).length() + String.valueOf(null).length() + str2 + " AND " + null)
    {
      Uri.Builder localBuilder = EsProvider.e(paramContext).buildUpon();
      EsProvider.a(localBuilder, paramInt1);
      return paramContext.getContentResolver().query(localBuilder.build(), paramArrayOfString, str2, arrayOfString, str1);
      bool = false;
      break;
      str2 = "0";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&1=0 AND (type!=10 OR contact_count>0)";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&2=0 AND type!=10 AND type!=100";
      arrayOfString = null;
      break label230;
      str2 = "type=1 OR circle_id='v.whatshot'";
      arrayOfString = null;
      break label230;
      str2 = "type IN (1,-1)";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type NOT IN (9,8)";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type!=9";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type IN (1,5)";
      arrayOfString = null;
      break label230;
      str2 = "for_sharing!=0 AND type=1";
      arrayOfString = null;
      break label230;
      ArrayList localArrayList = bgp.i(paramContext, paramInt1);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("circle_id IN (");
      int k = localArrayList.size();
      while (j < k)
      {
        if (j != 0) {
          localStringBuilder.append(',');
        }
        DatabaseUtils.appendEscapedSQLString(localStringBuilder, (String)localArrayList.get(j));
        j++;
      }
      localStringBuilder.append(')');
      str2 = localStringBuilder.toString();
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type=1";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&1=0";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type IN (9,5,8)";
      arrayOfString = null;
      break label230;
      str2 = "type IN (9,8)";
      arrayOfString = null;
      break label230;
      str2 = "semantic_hints&8=0 AND type=1";
      str1 = "for_sharing DESC, circle_name ASC";
      arrayOfString = null;
      break label230;
      str2 = "type = 8";
      arrayOfString = null;
      break label230;
      str2 = "circle_name IN (?, ?)";
      arrayOfString = new String[2];
      arrayOfString[0] = paramContext.getString(aau.iB);
      arrayOfString[1] = paramContext.getString(aau.hU);
      break label230;
      str2 = "type IN (1,-1) AND circle_id NOT IN ('v.all.circles','v.whatshot')";
      arrayOfString = null;
      break label230;
    }
  }
  
  @Deprecated
  public static Cursor a(Context paramContext, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3)
  {
    d(paramContext, paramInt);
    Uri localUri = EsProvider.a(EsProvider.f(paramContext), paramInt);
    return paramContext.getContentResolver().query(localUri, jmd.a, paramString2, paramArrayOfString, null);
  }
  
  public static Cursor a(Context paramContext, int paramInt, String[] paramArrayOfString, ArrayList<String> paramArrayList)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    Uri localUri = EsProvider.a(EsProvider.f(paramContext), paramInt);
    if (paramArrayList != null) {}
    StringBuilder localStringBuilder;
    for (String[] arrayOfString = (String[])paramArrayList.toArray(new String[paramArrayList.size()]);; arrayOfString = null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("blocked=1");
      if ((arrayOfString == null) || (arrayOfString.length <= 0)) {
        break label130;
      }
      localStringBuilder.append(" OR person_id IN (");
      for (int j = 0; j < arrayOfString.length; j++) {
        localStringBuilder.append("?,");
      }
    }
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    localStringBuilder.append(')');
    label130:
    long l = g(paramContext, paramInt);
    if (l == -1L)
    {
      ContentValues localContentValues1 = new ContentValues();
      localContentValues1.put("blocked_people_sync_time", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.update("account_status", localContentValues1, null, null);
      bix localbix = new bix(paramContext, paramInt);
      localbix.i();
      if (localbix.n())
      {
        localbix.c("EsPeopleData");
        localContentValues1.put("blocked_people_sync_time", Integer.valueOf(-1));
        localSQLiteDatabase.update("account_status", localContentValues1, null, null);
        return null;
      }
      return paramContext.getContentResolver().query(localUri, paramArrayOfString, localStringBuilder.toString(), arrayOfString, null);
    }
    Cursor localCursor = paramContext.getContentResolver().query(localUri, paramArrayOfString, localStringBuilder.toString(), arrayOfString, null);
    if (System.currentTimeMillis() - l > 10000L)
    {
      ContentValues localContentValues2 = new ContentValues();
      localContentValues2.put("blocked_people_sync_time", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.update("account_status", localContentValues2, null, null);
      bro localbro = new bro(paramContext, paramInt);
      if (EsService.f == null) {
        EsService.f = new Handler(Looper.getMainLooper());
      }
      EsService.f.post(localbro);
    }
    return localCursor;
  }
  
  /* Error */
  public static bru a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 443	bru
    //   3: dup
    //   4: invokespecial 444	bru:<init>	()V
    //   7: astore 4
    //   9: getstatic 94	brn:i	Ljava/util/HashMap;
    //   12: astore 5
    //   14: aload 5
    //   16: monitorenter
    //   17: getstatic 94	brn:i	Ljava/util/HashMap;
    //   20: aload_2
    //   21: invokevirtual 447	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: astore 7
    //   26: aload 7
    //   28: ifnonnull +257 -> 285
    //   31: new 4	java/lang/Object
    //   34: dup
    //   35: invokespecial 83	java/lang/Object:<init>	()V
    //   38: astore 8
    //   40: getstatic 94	brn:i	Ljava/util/HashMap;
    //   43: aload_2
    //   44: aload 8
    //   46: invokevirtual 450	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: aload 8
    //   52: astore 10
    //   54: aload 5
    //   56: monitorexit
    //   57: aload 10
    //   59: monitorenter
    //   60: aload_0
    //   61: iload_1
    //   62: aload_2
    //   63: aload 4
    //   65: invokestatic 453	brn:a	(Landroid/content/Context;ILjava/lang/String;Lbru;)V
    //   68: aload 4
    //   70: getfield 455	bru:a	I
    //   73: ifeq +230 -> 303
    //   76: iconst_0
    //   77: istore 12
    //   79: iload_3
    //   80: ifeq +74 -> 154
    //   83: aload 4
    //   85: getfield 458	bru:h	Lnxl;
    //   88: ifnull +215 -> 303
    //   91: aload 4
    //   93: getfield 462	bru:j	Lmua;
    //   96: ifnull +207 -> 303
    //   99: aload 4
    //   101: getfield 465	bru:k	Lmvk;
    //   104: ifnull +199 -> 303
    //   107: aload 4
    //   109: getfield 469	bru:l	Lnyv;
    //   112: ifnull +191 -> 303
    //   115: aload_0
    //   116: iload_1
    //   117: aload_2
    //   118: invokestatic 474	jjf:c	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokestatic 477	brn:d	(Landroid/content/Context;ILjava/lang/String;)Z
    //   124: ifeq +100 -> 224
    //   127: aload 4
    //   129: getfield 481	bru:p	Lofk;
    //   132: ifnull +160 -> 292
    //   135: aload 4
    //   137: getfield 485	bru:o	Loea;
    //   140: ifnull +152 -> 292
    //   143: aload 4
    //   145: getfield 488	bru:n	Lofg;
    //   148: ifnonnull +70 -> 218
    //   151: goto +141 -> 292
    //   154: iload 12
    //   156: ifeq +29 -> 185
    //   159: aload_2
    //   160: invokestatic 474	jjf:c	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 13
    //   165: aload 13
    //   167: ifnull +18 -> 185
    //   170: aload_0
    //   171: iload_1
    //   172: aload 13
    //   174: invokestatic 491	brn:c	(Landroid/content/Context;ILjava/lang/String;)V
    //   177: aload_0
    //   178: iload_1
    //   179: aload_2
    //   180: aload 4
    //   182: invokestatic 453	brn:a	(Landroid/content/Context;ILjava/lang/String;Lbru;)V
    //   185: aload 10
    //   187: monitorexit
    //   188: getstatic 94	brn:i	Ljava/util/HashMap;
    //   191: astore 14
    //   193: aload 14
    //   195: monitorenter
    //   196: getstatic 94	brn:i	Ljava/util/HashMap;
    //   199: aload_2
    //   200: invokevirtual 494	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   203: pop
    //   204: aload 14
    //   206: monitorexit
    //   207: aload 4
    //   209: areturn
    //   210: astore 6
    //   212: aload 5
    //   214: monitorexit
    //   215: aload 6
    //   217: athrow
    //   218: iconst_0
    //   219: istore 18
    //   221: goto +74 -> 295
    //   224: aload 4
    //   226: getfield 481	bru:p	Lofk;
    //   229: ifnonnull +80 -> 309
    //   232: iconst_1
    //   233: istore 18
    //   235: goto +60 -> 295
    //   238: astore 17
    //   240: aload 17
    //   242: invokestatic 499	kbw:a	(Ljava/lang/Throwable;)Z
    //   245: ifeq +23 -> 268
    //   248: aload 4
    //   250: iconst_1
    //   251: putfield 455	bru:a	I
    //   254: aload 10
    //   256: monitorexit
    //   257: aload 4
    //   259: areturn
    //   260: astore 11
    //   262: aload 10
    //   264: monitorexit
    //   265: aload 11
    //   267: athrow
    //   268: aload 4
    //   270: iconst_0
    //   271: putfield 455	bru:a	I
    //   274: goto -20 -> 254
    //   277: astore 15
    //   279: aload 14
    //   281: monitorexit
    //   282: aload 15
    //   284: athrow
    //   285: aload 7
    //   287: astore 10
    //   289: goto -235 -> 54
    //   292: iconst_1
    //   293: istore 18
    //   295: iconst_0
    //   296: istore 12
    //   298: iload 18
    //   300: ifeq -146 -> 154
    //   303: iconst_1
    //   304: istore 12
    //   306: goto -152 -> 154
    //   309: iconst_0
    //   310: istore 18
    //   312: goto -17 -> 295
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	paramContext	Context
    //   0	315	1	paramInt	int
    //   0	315	2	paramString	String
    //   0	315	3	paramBoolean	boolean
    //   7	262	4	localbru	bru
    //   12	201	5	localHashMap1	HashMap
    //   210	6	6	localObject1	Object
    //   24	262	7	localObject2	Object
    //   38	13	8	localObject3	Object
    //   52	236	10	localObject4	Object
    //   260	6	11	localObject5	Object
    //   77	228	12	j	int
    //   163	10	13	str	String
    //   277	6	15	localObject6	Object
    //   238	3	17	localIOException	java.io.IOException
    //   219	92	18	k	int
    // Exception table:
    //   from	to	target	type
    //   17	26	210	finally
    //   31	50	210	finally
    //   54	57	210	finally
    //   212	215	210	finally
    //   170	177	238	java/io/IOException
    //   60	76	260	finally
    //   83	151	260	finally
    //   159	165	260	finally
    //   170	177	260	finally
    //   177	185	260	finally
    //   185	188	260	finally
    //   224	232	260	finally
    //   240	254	260	finally
    //   254	257	260	finally
    //   262	265	260	finally
    //   268	274	260	finally
    //   196	207	277	finally
    //   279	282	277	finally
  }
  
  public static String a(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    if (paramCursor == null) {
      return null;
    }
    git localgit = (git)mbb.a(paramContext, git.class);
    if (((hyi)mbb.a(paramContext, hyi.class)).b(jik.c, localgit.c()))
    {
      gjb localgjb = localgit.f();
      String str2 = localgjb.a("following_circle_id", null);
      long l = localgjb.a("following_circle_id_last_sync", 0L);
      if (System.currentTimeMillis() - l > cxd.a) {
        gzj.a(paramContext, new cxd(paramContext, localgit.c()));
      }
      if (str2 != null) {
        return str2;
      }
    }
    int j = paramCursor.getColumnIndex("circle_name");
    int k = paramCursor.getColumnIndex("circle_id");
    String str1 = a(paramContext, paramBoolean);
    if (paramCursor.moveToFirst()) {
      do
      {
        if (str1.equalsIgnoreCase(paramCursor.getString(j))) {
          return paramCursor.getString(k);
        }
      } while (paramCursor.moveToNext());
    }
    return null;
  }
  
  public static String a(Context paramContext, boolean paramBoolean)
  {
    git localgit = (git)mbb.a(paramContext, git.class);
    if (((hyi)mbb.a(paramContext, hyi.class)).b(jik.c, localgit.c()))
    {
      gjb localgjb = localgit.f();
      String str = localgjb.a("following_circle_name", null);
      long l = localgjb.a("following_circle_id_last_sync", 0L);
      if (System.currentTimeMillis() - l > cxd.a) {
        gzj.a(paramContext, new cxd(paramContext, localgit.c()));
      }
      if (str != null) {
        return str;
      }
    }
    if (paramBoolean) {
      return paramContext.getString(aau.iB);
    }
    return paramContext.getString(aau.hU);
  }
  
  private static nxl a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      nxl localnxl = (nxl)qat.b(new nxl(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localnxl;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Failed to create SimpleProfile from.", localqas);
    }
    return null;
  }
  
  public static orm a(String paramString)
  {
    orm localorm = new orm();
    if (paramString.startsWith("g:")) {
      localorm.c = paramString.substring(2);
    }
    do
    {
      return localorm;
      if (paramString.startsWith("e:"))
      {
        localorm.a = paramString.substring(2);
        return localorm;
      }
    } while (!paramString.startsWith("p:"));
    localorm.d = paramString.substring(2);
    return localorm;
  }
  
  public static void a(Context paramContext)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a().iterator();
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      gjb localgjb = localgiz.a(j);
      if (!localgjb.c("is_plus_page"))
      {
        boolean bool1 = bgp.g(paramContext, j);
        if ((localgjb.a()) && (bool1)) {}
        for (boolean bool2 = true;; bool2 = false)
        {
          gzj.a(new jjw(paramContext, j, bool2, new String[] { "$$mycircles$$" }));
          break;
        }
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, f(paramContext, paramInt), true);
  }
  
  private static void a(Context paramContext, int paramInt, long paramLong, boolean paramBoolean)
  {
    jkz localjkz = new jkz(paramContext);
    jix localjix = localjkz.c();
    ConditionVariable localConditionVariable = new ConditionVariable();
    jib localjib = new jib(localjix, localConditionVariable, paramLong, paramContext, paramInt);
    if (jid.a()) {
      jid.a("EsPeopleData#loadCircles", String.format("Connecting client %s.", new Object[] { localjix }));
    }
    localjix.d();
    localjkz.a(localjib, paramInt, null, -999, null, false, paramBoolean);
    if (paramBoolean)
    {
      efj.l();
      localConditionVariable.block(10000L);
    }
  }
  
  /* Error */
  private static void a(Context paramContext, int paramInt, String paramString, bru parambru)
  {
    // Byte code:
    //   0: aload_3
    //   1: iconst_0
    //   2: putfield 455	bru:a	I
    //   5: aload_0
    //   6: iload_1
    //   7: invokestatic 346	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   10: invokevirtual 779	bqj:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   13: ldc_w 781
    //   16: getstatic 80	brn:f	[Ljava/lang/String;
    //   19: ldc_w 783
    //   22: iconst_1
    //   23: anewarray 22	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: aload_2
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 676	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore 4
    //   38: aload 4
    //   40: invokeinterface 550 1 0
    //   45: ifeq +280 -> 325
    //   48: aload_3
    //   49: aload_2
    //   50: invokestatic 474	jjf:c	(Ljava/lang/String;)Ljava/lang/String;
    //   53: putfield 785	bru:b	Ljava/lang/String;
    //   56: aload_3
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 788 2 0
    //   65: putfield 455	bru:a	I
    //   68: aload 4
    //   70: iconst_3
    //   71: invokeinterface 788 2 0
    //   76: ifeq +305 -> 381
    //   79: iconst_1
    //   80: istore 7
    //   82: aload_3
    //   83: iload 7
    //   85: putfield 791	bru:e	Z
    //   88: aload_3
    //   89: aload 4
    //   91: iconst_2
    //   92: invokeinterface 551 2 0
    //   97: putfield 792	bru:d	Ljava/lang/String;
    //   100: aload 4
    //   102: iconst_4
    //   103: invokeinterface 687 2 0
    //   108: pop2
    //   109: aload_3
    //   110: aload 4
    //   112: iconst_1
    //   113: invokeinterface 551 2 0
    //   118: putfield 793	bru:c	Ljava/lang/String;
    //   121: aload_3
    //   122: aload 4
    //   124: iconst_4
    //   125: invokeinterface 687 2 0
    //   130: putfield 795	bru:g	J
    //   133: aload 4
    //   135: iconst_5
    //   136: invokeinterface 799 2 0
    //   141: astore 10
    //   143: aload 10
    //   145: ifnull +17 -> 162
    //   148: aconst_null
    //   149: astore 11
    //   151: aload 10
    //   153: ifnonnull +234 -> 387
    //   156: aload_3
    //   157: aload 11
    //   159: putfield 802	bru:f	Lbrs;
    //   162: aload_3
    //   163: aload 4
    //   165: bipush 6
    //   167: invokeinterface 687 2 0
    //   172: putfield 805	bru:m	J
    //   175: aload 4
    //   177: bipush 7
    //   179: invokeinterface 799 2 0
    //   184: astore 13
    //   186: aload 13
    //   188: ifnull +12 -> 200
    //   191: aload_3
    //   192: aload 13
    //   194: invokestatic 807	brn:a	([B)Lnxl;
    //   197: putfield 458	bru:h	Lnxl;
    //   200: aload 4
    //   202: bipush 8
    //   204: invokeinterface 799 2 0
    //   209: astore 14
    //   211: aload 14
    //   213: ifnull +12 -> 225
    //   216: aload_3
    //   217: aload 14
    //   219: invokestatic 810	brn:d	([B)Lmua;
    //   222: putfield 462	bru:j	Lmua;
    //   225: aload 4
    //   227: bipush 9
    //   229: invokeinterface 799 2 0
    //   234: astore 15
    //   236: aload 15
    //   238: ifnull +12 -> 250
    //   241: aload_3
    //   242: aload 15
    //   244: invokestatic 813	brn:e	([B)Lmvk;
    //   247: putfield 465	bru:k	Lmvk;
    //   250: aload 4
    //   252: bipush 10
    //   254: invokeinterface 799 2 0
    //   259: astore 16
    //   261: aload 16
    //   263: ifnull +12 -> 275
    //   266: aload_3
    //   267: aload 16
    //   269: invokestatic 816	brn:f	([B)Lnyv;
    //   272: putfield 469	bru:l	Lnyv;
    //   275: aload 4
    //   277: bipush 13
    //   279: invokeinterface 799 2 0
    //   284: astore 17
    //   286: aload 17
    //   288: ifnull +12 -> 300
    //   291: aload_3
    //   292: aload 17
    //   294: invokestatic 819	brn:c	([B)Lnwy;
    //   297: putfield 822	bru:i	Lnwy;
    //   300: aload 4
    //   302: bipush 14
    //   304: invokeinterface 799 2 0
    //   309: astore 18
    //   311: aload 18
    //   313: ifnull +12 -> 325
    //   316: aload_3
    //   317: aload 18
    //   319: invokestatic 825	brn:b	([B)Lofk;
    //   322: putfield 481	bru:p	Lofk;
    //   325: aload 4
    //   327: invokeinterface 690 1 0
    //   332: aload_0
    //   333: iload_1
    //   334: aload_2
    //   335: invokestatic 474	jjf:c	(Ljava/lang/String;)Ljava/lang/String;
    //   338: invokestatic 477	brn:d	(Landroid/content/Context;ILjava/lang/String;)Z
    //   341: ifeq +39 -> 380
    //   344: aload_0
    //   345: ldc_w 827
    //   348: invokestatic 152	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   351: checkcast 827	kyk
    //   354: astore 6
    //   356: aload_3
    //   357: aload 6
    //   359: iload_1
    //   360: invokeinterface 830 2 0
    //   365: putfield 488	bru:n	Lofg;
    //   368: aload_3
    //   369: aload 6
    //   371: iload_1
    //   372: invokeinterface 833 2 0
    //   377: putfield 485	bru:o	Loea;
    //   380: return
    //   381: iconst_0
    //   382: istore 7
    //   384: goto -302 -> 82
    //   387: invokestatic 839	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   390: astore 12
    //   392: aload 12
    //   394: aload 10
    //   396: iconst_0
    //   397: aload 10
    //   399: arraylength
    //   400: invokevirtual 843	android/os/Parcel:unmarshall	([BII)V
    //   403: aload 12
    //   405: iconst_0
    //   406: invokevirtual 846	android/os/Parcel:setDataPosition	(I)V
    //   409: new 848	brs
    //   412: dup
    //   413: aload 12
    //   415: invokespecial 851	brs:<init>	(Landroid/os/Parcel;)V
    //   418: astore 11
    //   420: aload 12
    //   422: invokevirtual 854	android/os/Parcel:recycle	()V
    //   425: goto -269 -> 156
    //   428: astore 5
    //   430: aload 4
    //   432: invokeinterface 690 1 0
    //   437: aload 5
    //   439: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	paramContext	Context
    //   0	440	1	paramInt	int
    //   0	440	2	paramString	String
    //   0	440	3	parambru	bru
    //   36	395	4	localCursor	Cursor
    //   428	10	5	localObject	Object
    //   354	16	6	localkyk	kyk
    //   80	303	7	bool	boolean
    //   141	257	10	arrayOfByte1	byte[]
    //   149	270	11	localbrs	brs
    //   390	31	12	localParcel	Parcel
    //   184	9	13	arrayOfByte2	byte[]
    //   209	9	14	arrayOfByte3	byte[]
    //   234	9	15	arrayOfByte4	byte[]
    //   259	9	16	arrayOfByte5	byte[]
    //   284	9	17	arrayOfByte6	byte[]
    //   309	9	18	arrayOfByte7	byte[]
    // Exception table:
    //   from	to	target	type
    //   38	79	428	finally
    //   82	143	428	finally
    //   156	162	428	finally
    //   162	186	428	finally
    //   191	200	428	finally
    //   200	211	428	finally
    //   216	225	428	finally
    //   225	236	428	finally
    //   241	250	428	finally
    //   250	261	428	finally
    //   266	275	428	finally
    //   275	286	428	finally
    //   291	300	428	finally
    //   300	311	428	finally
    //   316	325	428	finally
    //   387	425	428	finally
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, mua parammua)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
      try
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("people_data_proto", a(parammua));
        localContentValues.put("profile_update_time", Long.valueOf(System.currentTimeMillis()));
        localSQLiteDatabase.update("profiles", localContentValues, "profile_person_id=?", new String[] { str2 });
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, nxl paramnxl, mua parammua, mvk parammvk, nyv paramnyv, nwy paramnwy, ofk paramofk)
  {
    if (Log.isLoggable("EsPeopleData", 3)) {
      if (paramnxl == null) {
        break label80;
      }
    }
    label80:
    for (String str4 = paramnxl.toString();; str4 = null)
    {
      String str5 = String.valueOf(str4);
      new StringBuilder(14 + String.valueOf(paramString).length() + String.valueOf(str5).length()).append("Profile for ").append(paramString).append(": ").append(str5);
      if (paramnxl != null) {
        break;
      }
      return;
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:")) {
      for (;;)
      {
        SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
        localSQLiteDatabase.beginTransaction();
        try
        {
          boolean bool1 = a(paramContext, paramInt, localSQLiteDatabase, str2, paramnxl, parammua, parammvk, paramnyv, paramnwy, paramofk, true);
          if ((bool1) && (paramnxl.c != null) && (paramnxl.c.e != null) && (paramnxl.c.e.b != null))
          {
            boolean bool2 = paramnxl.c.e.b.booleanValue();
            String str3 = paramnxl.g;
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("blocked", Boolean.valueOf(bool2));
            if (bool2) {
              localContentValues.put("in_my_circles", Integer.valueOf(0));
            }
            if ((localSQLiteDatabase.update("contacts", localContentValues, "person_id=?", new String[] { str2 }) == 0) && (bool2))
            {
              localContentValues.put("person_id", str2);
              localContentValues.put("gaia_id", jjf.c(str2));
              localContentValues.put("name", str3);
              localSQLiteDatabase.insert("contacts", null, localContentValues);
            }
            if (bool2)
            {
              localSQLiteDatabase.delete("circle_contact", "link_person_id=?", new String[] { str2 });
              localSQLiteDatabase.execSQL("UPDATE circles SET contact_count=(SELECT count(*) FROM circle_contact WHERE link_circle_id=circle_id) WHERE type=1");
            }
            if (!bool2) {
              a(localSQLiteDatabase, str2, paramnxl.c.e.a, false);
            }
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (!bool1) {
            break;
          }
          ContentResolver localContentResolver = paramContext.getContentResolver();
          localContentResolver.notifyChange(Uri.withAppendedPath(EsProvider.g(paramContext), str2), null);
          localContentResolver.notifyChange(EsProvider.e(paramContext), null);
          localContentResolver.notifyChange(EsProvider.c(paramContext), null);
          EsSyncAdapterService.a(paramContext, paramInt);
          return;
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
        }
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, nyv paramnyv)
  {
    if (Log.isLoggable("EsPeopleData", 3)) {
      new StringBuilder(28 + String.valueOf(paramString).length()).append("Profile for ").append(paramString).append(": Adding reviews");
    }
    if (paramnyv == null) {
      return;
    }
    String str1 = String.valueOf(paramString);
    String str2;
    SQLiteDatabase localSQLiteDatabase;
    if (str1.length() != 0)
    {
      str2 = "g:".concat(str1);
      localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
    }
    for (;;)
    {
      qfx localqfx1;
      try
      {
        localCursor = localSQLiteDatabase.query("profiles", d, "profile_person_id=?", new String[] { str2 }, null, null, null);
        try
        {
          if (!localCursor.moveToFirst()) {
            break label458;
          }
          nyv localnyv2 = f(localCursor.getBlob(0));
          localnyv1 = localnyv2;
          localCursor.close();
          if ((localnyv1 != null) && (localnyv1.a != null) && (localnyv1.a.b != null) && (localnyv1.a.b.length != 0))
          {
            localqfx1 = localnyv1.a.b[0];
            if ((paramnyv.a == null) || (paramnyv.a.b == null) || (paramnyv.a.b.length == 0)) {
              break label452;
            }
            localqfx2 = paramnyv.a.b[0];
            if (localqfx2 == null) {
              break label440;
            }
            localqfx1.d = localqfx2.d;
            if ((localqfx2.c == null) || (localqfx2.c.length == 0)) {
              break label446;
            }
            qfm[] arrayOfqfm = (qfm[])Arrays.copyOf(localqfx1.c, localqfx1.c.length + localqfx2.c.length);
            System.arraycopy(localqfx2.c, 0, arrayOfqfm, localqfx1.c.length, localqfx2.c.length);
            localqfx1.c = arrayOfqfm;
            paramnyv = localnyv1;
          }
          byte[] arrayOfByte = a(paramnyv);
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("reviews_data_proto", arrayOfByte);
          localSQLiteDatabase.update("profiles", localContentValues, "profile_person_id=?", new String[] { str2 });
          localSQLiteDatabase.setTransactionSuccessful();
          return;
        }
        finally
        {
          localCursor.close();
        }
        str2 = new String("g:");
        break;
      }
      finally
      {
        Cursor localCursor;
        localSQLiteDatabase.endTransaction();
      }
      label440:
      localqfx1.d = null;
      label446:
      paramnyv = localnyv1;
      continue;
      label452:
      qfx localqfx2 = null;
      continue;
      label458:
      nyv localnyv1 = null;
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, omv paramomv)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      a(localSQLiteDatabase, efj.q(paramString), paramomv);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      ContentResolver localContentResolver = paramContext.getContentResolver();
      localContentResolver.notifyChange(EsProvider.f(paramContext), null);
      localContentResolver.notifyChange(EsProvider.e(paramContext), null);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, ors paramors, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    String str1;
    boolean bool1;
    int n;
    label81:
    boolean bool6;
    label337:
    int i2;
    boolean bool7;
    label370:
    int i3;
    StringBuilder localStringBuilder;
    boolean bool2;
    if (paramors != null)
    {
      for (;;)
      {
        Boolean localBoolean3;
        try
        {
          str1 = efj.a(paramors.a);
          if (!TextUtils.equals(str1, paramString)) {
            a(localSQLiteDatabase, paramString);
          }
          bool1 = b(localSQLiteDatabase, str1);
          if ((bool1) || (paramors == null)) {
            break label969;
          }
          ArrayList localArrayList = new ArrayList();
          if (b(paramors) == 0) {
            break label1385;
          }
          n = 1;
          String str2 = efj.a(paramors.a);
          ContentValues localContentValues3 = new ContentValues();
          String str3 = paramors.b.a;
          if (n != 0) {
            a(localArrayList, str3);
          }
          localContentValues3.put("name", str3);
          localContentValues3.put("sort_key", paramors.b.b);
          localContentValues3.put("interaction_sort_key", paramors.b.d);
          localContentValues3.put("avatar", hdo.a(paramors.b.c));
          localContentValues3.put("last_updated_time", Long.valueOf(a(paramors)));
          localContentValues3.put("in_my_circles", Integer.valueOf(n));
          Boolean localBoolean1 = paramors.b.i;
          boolean bool4;
          Boolean localBoolean2;
          if (localBoolean1 == null)
          {
            bool4 = false;
            localContentValues3.put("verified", Boolean.valueOf(bool4));
            if (paramors.b.g == 3)
            {
              localContentValues3.put("profile_type", Integer.valueOf(2));
              if ((n != 0) && (paramors.a.c == null)) {
                localContentValues3.put("profile_state", Integer.valueOf(2));
              }
              int i1 = localSQLiteDatabase.update("contacts", localContentValues3, "person_id=?", new String[] { str2 });
              boolean bool5 = false;
              if (i1 == 0)
              {
                bool5 = true;
                localBoolean2 = paramors.b.f;
                if (localBoolean2 != null) {
                  break label949;
                }
                bool6 = false;
                break label1357;
                localContentValues3.put("in_same_visibility_group", Integer.valueOf(i2));
                localBoolean3 = paramors.b.i;
                if (localBoolean3 != null) {
                  break label959;
                }
                bool7 = false;
                break label1368;
                localContentValues3.put("verified", Integer.valueOf(i3));
                localContentValues3.put("person_id", str2);
                localContentValues3.put("gaia_id", jjf.c(str2));
                localSQLiteDatabase.insert("contacts", null, localContentValues3);
              }
              localContentValues3.clear();
              localContentValues3.put("contact_update_time", Long.valueOf(System.currentTimeMillis()));
              brs localbrs = new brs();
              if (paramors.b != null)
              {
                orm localorm = paramors.a;
                if (!TextUtils.isEmpty(localorm.a))
                {
                  localbrs.a = new ArrayList();
                  orx localorx = new orx();
                  localorx.a = localorm.a;
                  localbrs.a.add(localorx);
                }
                if (!TextUtils.isEmpty(localorm.d))
                {
                  localbrs.b = new ArrayList();
                  osg localosg = new osg();
                  localosg.a = localorm.d;
                  localbrs.b.add(localosg);
                }
                if (paramors.b.q != null)
                {
                  if (localbrs.a == null) {
                    localbrs.a = new ArrayList();
                  }
                  Collections.addAll(localbrs.a, paramors.b.q);
                }
                if (paramors.b.r != null)
                {
                  if (localbrs.b == null) {
                    localbrs.b = new ArrayList();
                  }
                  Collections.addAll(localbrs.b, paramors.b.r);
                }
                if (paramors.b.s != null)
                {
                  if (localbrs.c == null) {
                    localbrs.c = new ArrayList();
                  }
                  Collections.addAll(localbrs.c, paramors.b.s);
                }
              }
              localContentValues3.put("contact_proto", a(localbrs));
              if (localSQLiteDatabase.update("profiles", localContentValues3, "profile_person_id=?", new String[] { str2 }) == 0)
              {
                localContentValues3.put("profile_person_id", str2);
                localSQLiteDatabase.insert("profiles", null, localContentValues3);
              }
              a(localSQLiteDatabase, str1, paramors, bool5);
              a(paramors, localArrayList);
              a(localSQLiteDatabase, str1, localArrayList, bool5);
              localStringBuilder = new StringBuilder();
              bool2 = false;
              if (paramArrayList1 == null) {
                break label1137;
              }
              int j = paramArrayList1.size();
              bool2 = false;
              if (j <= 0) {
                break label1137;
              }
              localStringBuilder.append("INSERT OR IGNORE INTO circle_contact").append('(').append("link_person_id,").append("link_circle_id)").append(" SELECT ").append(DatabaseUtils.sqlEscapeString(str1)).append(',').append("circle_id FROM ").append("circles WHERE ").append("circle_id IN(");
              int k = 0;
              if (k >= paramArrayList1.size()) {
                break;
              }
              localStringBuilder.append("?,");
              k++;
              continue;
            }
          }
          else
          {
            bool4 = localBoolean1.booleanValue();
            continue;
          }
          localContentValues3.put("profile_type", Integer.valueOf(1));
          continue;
          bool6 = localBoolean2.booleanValue();
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
        }
        label949:
        break label1357;
        label959:
        bool7 = localBoolean3.booleanValue();
        break label1368;
        label969:
        long l = System.currentTimeMillis();
        ContentValues localContentValues1 = new ContentValues();
        localContentValues1.put("contact_update_time", Long.valueOf(l));
        localSQLiteDatabase.update("profiles", localContentValues1, "profile_person_id=?", new String[] { str1 });
        ContentValues localContentValues2 = new ContentValues();
        localContentValues2.put("last_updated_time", Long.valueOf(l));
        localSQLiteDatabase.update("contacts", localContentValues2, "person_id=?", new String[] { str1 });
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      localSQLiteDatabase.execSQL(localStringBuilder.toString(), paramArrayList1.toArray());
      a(localSQLiteDatabase, (String[])paramArrayList1.toArray(new String[paramArrayList1.size()]));
      if (bool1) {
        break label1403;
      }
      c(localSQLiteDatabase, str1);
    }
    for (;;)
    {
      label1137:
      if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
      {
        localStringBuilder.setLength(0);
        localStringBuilder.append("DELETE FROM circle_contact").append(" WHERE link_person_id").append('=').append(DatabaseUtils.sqlEscapeString(str1)).append(" AND link_circle_id").append(" IN  (");
        for (int m = 0; m < paramArrayList2.size(); m++) {
          localStringBuilder.append("?,");
        }
        localStringBuilder.setLength(-1 + localStringBuilder.length());
        localStringBuilder.append(')');
        localSQLiteDatabase.execSQL(localStringBuilder.toString(), paramArrayList2.toArray());
        a(localSQLiteDatabase, (String[])paramArrayList2.toArray(new String[paramArrayList2.size()]));
        c(localSQLiteDatabase, str1);
        if (bool2) {}
      }
      for (boolean bool3 = b(localSQLiteDatabase, str1);; bool3 = bool2)
      {
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        ContentResolver localContentResolver = paramContext.getContentResolver();
        localContentResolver.notifyChange(EsProvider.f(paramContext), null);
        localContentResolver.notifyChange(EsProvider.e(paramContext), null);
        if (bool1 != bool3) {
          EsSyncAdapterService.a(paramContext, paramInt);
        }
        return;
      }
      label1357:
      if (bool6)
      {
        i2 = 1;
        break label337;
        label1368:
        if (!bool7) {
          break label1397;
        }
        i3 = 1;
        break label370;
        str1 = paramString;
        break;
        label1385:
        n = 0;
        break label81;
      }
      i2 = 0;
      break label337;
      label1397:
      i3 = 0;
      break label370;
      label1403:
      bool2 = true;
    }
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, kck paramkck, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 87	brn:h	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: iload_3
    //   9: ifne +27 -> 36
    //   12: aload_0
    //   13: iload_1
    //   14: invokestatic 1088	brn:h	(Landroid/content/Context;I)J
    //   17: lstore 15
    //   19: invokestatic 144	java/lang/System:currentTimeMillis	()J
    //   22: lload 15
    //   24: lsub
    //   25: ldc2_w 1089
    //   28: lcmp
    //   29: ifge +7 -> 36
    //   32: aload 4
    //   34: monitorexit
    //   35: return
    //   36: getstatic 85	brn:g	Ljava/lang/Object;
    //   39: astore 6
    //   41: aload 6
    //   43: monitorenter
    //   44: aload_2
    //   45: invokevirtual 1094	kck:b	()Z
    //   48: ifeq +114 -> 162
    //   51: iconst_0
    //   52: istore 8
    //   54: aload 6
    //   56: monitorexit
    //   57: aload_2
    //   58: invokevirtual 1094	kck:b	()Z
    //   61: istore 9
    //   63: iconst_0
    //   64: istore 10
    //   66: iload 9
    //   68: ifeq +119 -> 187
    //   71: iload 10
    //   73: iload 8
    //   75: iand
    //   76: ifeq +74 -> 150
    //   79: new 372	android/content/ContentValues
    //   82: dup
    //   83: invokespecial 373	android/content/ContentValues:<init>	()V
    //   86: astore 11
    //   88: invokestatic 144	java/lang/System:currentTimeMillis	()J
    //   91: lstore 12
    //   93: aload 11
    //   95: ldc_w 1096
    //   98: lload 12
    //   100: invokestatic 378	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   103: invokevirtual 382	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   106: aload 11
    //   108: ldc_w 1098
    //   111: lload 12
    //   113: invokestatic 378	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   116: invokevirtual 382	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   119: aload_0
    //   120: iload_1
    //   121: invokestatic 346	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   124: invokevirtual 350	bqj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   127: ldc_w 384
    //   130: aload 11
    //   132: aconst_null
    //   133: aconst_null
    //   134: invokevirtual 390	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   137: pop
    //   138: aload_0
    //   139: invokevirtual 221	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   142: aload_0
    //   143: invokestatic 932	com/google/android/apps/plus/content/EsProvider:c	(Landroid/content/Context;)Landroid/net/Uri;
    //   146: aconst_null
    //   147: invokevirtual 776	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   150: aload 4
    //   152: monitorexit
    //   153: return
    //   154: astore 5
    //   156: aload 4
    //   158: monitorexit
    //   159: aload 5
    //   161: athrow
    //   162: aload_0
    //   163: iload_1
    //   164: aload_0
    //   165: iload_1
    //   166: invokestatic 194	brn:f	(Landroid/content/Context;I)J
    //   169: iconst_0
    //   170: invokestatic 199	brn:a	(Landroid/content/Context;IJZ)V
    //   173: iconst_1
    //   174: istore 8
    //   176: goto -122 -> 54
    //   179: astore 7
    //   181: aload 6
    //   183: monitorexit
    //   184: aload 7
    //   186: athrow
    //   187: aload_0
    //   188: iload_1
    //   189: invokestatic 332	brn:d	(Landroid/content/Context;I)V
    //   192: iconst_1
    //   193: istore 10
    //   195: goto -124 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	paramContext	Context
    //   0	198	1	paramInt	int
    //   0	198	2	paramkck	kck
    //   0	198	3	paramBoolean	boolean
    //   3	154	4	localObject1	Object
    //   154	6	5	localObject2	Object
    //   179	6	7	localObject4	Object
    //   52	123	8	j	int
    //   61	6	9	bool	boolean
    //   64	130	10	k	int
    //   86	45	11	localContentValues	ContentValues
    //   91	21	12	l1	long
    //   17	6	15	l2	long
    // Exception table:
    //   from	to	target	type
    //   12	35	154	finally
    //   36	44	154	finally
    //   57	63	154	finally
    //   79	150	154	finally
    //   150	153	154	finally
    //   156	159	154	finally
    //   184	187	154	finally
    //   187	192	154	finally
    //   44	51	179	finally
    //   54	57	179	finally
    //   162	173	179	finally
    //   181	184	179	finally
  }
  
  public static void a(Context paramContext, int paramInt, ors[] paramArrayOfors)
  {
    HashSet localHashSet = new HashSet();
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    ContentValues localContentValues1;
    String[] arrayOfString;
    Cursor localCursor;
    try
    {
      localContentValues1 = new ContentValues();
      arrayOfString = new String[1];
      localCursor = localSQLiteDatabase.query("contacts", new String[] { "person_id" }, "blocked=1", null, null, null, null);
    }
    finally
    {
      try
      {
        while (localCursor.moveToNext())
        {
          localHashSet.add(localCursor.getString(0));
          continue;
          localSQLiteDatabase.endTransaction();
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    int j;
    int k;
    label242:
    int m;
    ors localors;
    String str1;
    if (paramArrayOfors == null)
    {
      j = 0;
      break label677;
      while (k < j)
      {
        localHashSet.remove(efj.a(paramArrayOfors[k].a));
        k++;
      }
    }
    else
    {
      j = paramArrayOfors.length;
      break label677;
      if (localHashSet.isEmpty()) {
        break label683;
      }
      localContentValues1.put("blocked", Integer.valueOf(0));
      localContentValues1.put("last_updated_time", Integer.valueOf(0));
      Iterator localIterator = localHashSet.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          arrayOfString[0] = ((String)localIterator.next());
          localSQLiteDatabase.update("contacts", localContentValues1, "person_id=?", arrayOfString);
          continue;
          if (m < j)
          {
            localors = paramArrayOfors[m];
            str1 = efj.a(paramArrayOfors[m].a);
            if (localors.b.g != 3) {
              break label689;
            }
          }
        }
      }
    }
    label677:
    label683:
    label689:
    for (int n = 2;; n = 1)
    {
      String str2 = localors.b.a;
      long l = a(localors);
      ContentValues localContentValues2 = new ContentValues();
      localContentValues2.put("name", str2);
      localContentValues2.put("last_updated_time", Long.valueOf(l));
      localContentValues2.put("in_my_circles", Integer.valueOf(0));
      localContentValues2.put("blocked", Integer.valueOf(1));
      localContentValues2.put("profile_type", Integer.valueOf(n));
      localContentValues2.put("avatar", hdo.a(null));
      String str3 = jjf.c(str1);
      localContentValues2.put("profile_state", Integer.valueOf(6));
      if (localSQLiteDatabase.update("contacts", localContentValues2, "person_id=?", new String[] { str1 }) == 0)
      {
        localContentValues2.put("person_id", str1);
        localContentValues2.put("gaia_id", str3);
        localSQLiteDatabase.insert("contacts", null, localContentValues2);
      }
      localContentValues2.clear();
      localContentValues2.put("contact_update_time", Long.valueOf(System.currentTimeMillis()));
      localContentValues2.put("contact_proto", a(null));
      if (localSQLiteDatabase.update("profiles", localContentValues2, "profile_person_id=?", new String[] { str1 }) == 0)
      {
        localContentValues2.put("profile_person_id", str1);
        localSQLiteDatabase.insert("profiles", null, localContentValues2);
      }
      arrayOfString[0] = str1;
      localSQLiteDatabase.delete("circle_contact", "link_person_id=?", arrayOfString);
      localSQLiteDatabase.delete("contact_search", "search_person_id=?", arrayOfString);
      m++;
      break label242;
      localContentValues1.clear();
      localContentValues1.put("contact_count", Integer.valueOf(j));
      arrayOfString[0] = "15";
      localSQLiteDatabase.update("circles", localContentValues1, "circle_id=?", arrayOfString);
      localContentValues1.clear();
      localContentValues1.put("blocked_people_sync_time", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.update("account_status", localContentValues1, null, null);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      ContentResolver localContentResolver = paramContext.getContentResolver();
      localContentResolver.notifyChange(EsProvider.f(paramContext), null);
      localContentResolver.notifyChange(EsProvider.e(paramContext), null);
      return;
      k = 0;
      break;
      m = 0;
      break label242;
    }
  }
  
  static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    String str2 = String.valueOf("in_my_circles=0  AND blocked=0 AND gaia_id!=");
    String str3 = String.valueOf("gaia_id");
    String str4 = String.valueOf("author_id");
    String str5 = String.valueOf("activities");
    String str6 = String.valueOf("gaia_id");
    String str7 = String.valueOf("author_id");
    String str8 = String.valueOf("activity_comments");
    String str9 = String.valueOf("gaia_id");
    String str10 = String.valueOf("gaia_id");
    String str11 = String.valueOf("circled_me_users");
    String str12 = String.valueOf("gaia_id");
    String str13 = String.valueOf("gaia_id");
    String str14 = String.valueOf("event_people");
    String str15 = String.valueOf("gaia_id");
    String str16 = String.valueOf("inviter_gaia_id");
    String str17 = String.valueOf("squares");
    paramSQLiteDatabase.delete("contacts", 140 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + String.valueOf(str10).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + String.valueOf(str15).length() + String.valueOf(str16).length() + String.valueOf(str17).length() + str2 + str1 + " AND " + str3 + " NOT IN (SELECT " + str4 + " FROM " + str5 + ") AND " + str6 + " NOT IN (SELECT " + str7 + " FROM " + str8 + ") AND " + str9 + " NOT IN (SELECT " + str10 + " FROM " + str11 + ") AND " + str12 + " NOT IN (SELECT " + str13 + " FROM " + str14 + ") AND " + str15 + " NOT IN (SELECT " + str16 + " FROM " + str17 + ")", null);
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE circles SET contact_count=(SELECT count(*) FROM circle_contact WHERE link_circle_id=circle_id) WHERE type=1");
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, fzp paramfzp, boolean paramBoolean)
  {
    int j = 1;
    int k = 0;
    String[] arrayOfString1 = paramfzp.i();
    int m;
    if (arrayOfString1 != null) {
      m = arrayOfString1.length;
    }
    while (m != 0)
    {
      String[] arrayOfString3 = new String[m + 1];
      arrayOfString3[0] = paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      for (;;)
      {
        if (k < m)
        {
          localStringBuilder.append("?,");
          int n = j + 1;
          arrayOfString3[j] = efj.q(arrayOfString1[k]);
          k++;
          j = n;
          continue;
          m = 0;
          break;
        }
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      if (!paramBoolean)
      {
        String str3 = String.valueOf("DELETE FROM circle_contact WHERE link_person_id=? AND link_circle_id NOT IN (");
        String str4 = String.valueOf(localStringBuilder.toString());
        paramSQLiteDatabase.execSQL(1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + str4 + ")", arrayOfString3);
      }
      String str1 = String.valueOf("INSERT OR IGNORE INTO circle_contact(link_person_id,link_circle_id) SELECT ?, circle_id FROM circles WHERE circle_id IN (");
      String str2 = String.valueOf(localStringBuilder.toString());
      paramSQLiteDatabase.execSQL(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2 + ")", arrayOfString3);
    }
    for (;;)
    {
      paramSQLiteDatabase.execSQL("UPDATE circles SET contact_count=(SELECT count(*) FROM circle_contact WHERE link_circle_id=circle_id) WHERE type=1");
      return;
      if (!paramBoolean)
      {
        String[] arrayOfString2 = new String[j];
        arrayOfString2[0] = paramString;
        paramSQLiteDatabase.delete("circle_contact", "link_person_id=?", arrayOfString2);
      }
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, ArrayList<brv> paramArrayList, boolean paramBoolean)
  {
    if (!paramBoolean) {
      paramSQLiteDatabase.delete("contact_search", "search_person_id=?", new String[] { paramString });
    }
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      brv localbrv = (brv)localIterator.next();
      localContentValues.put("search_person_id", paramString);
      localContentValues.put("search_key_type", Integer.valueOf(localbrv.a));
      localContentValues.put("search_key", localbrv.b);
      paramSQLiteDatabase.insert("contact_search", null, localContentValues);
    }
  }
  
  public static void a(Context paramContext)
  {
    ;
    if ((localObject == null) || (localObject.isEmpty())) {}
    for (;;)
    {
      return;
      ContentValues localContentValues = new ContentValues(2);
      Iterator localIterator = localObject.iterator();
      while (localIterator.hasNext())
      {
        bpx localbpx = (bpx)localIterator.next();
        a(paramContext, localbpx.c, localbpx.b, localbpx.d);
        localContentValues.clear();
        String str;
        localContentValues.put("notification_key", str);
        localContentValues.put("gaia_id", localbpx.c);
        paramContext.insertWithOnConflict("circled_me_users", null, localContentValues, 5);
      }
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, omv paramomv)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramomv.b == 2) {}
    for (int j = 1;; j = 0)
    {
      localContentValues.put("notifications_enabled", Integer.valueOf(j));
      localContentValues.put("volume", Integer.valueOf(paramomv.a));
      localContentValues.put("last_volume_sync", Long.valueOf(System.currentTimeMillis()));
      paramSQLiteDatabase.update("circles", localContentValues, "circle_id=?", new String[] { paramString });
      return;
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, ors paramors, boolean paramBoolean)
  {
    int j = 1;
    int k = 0;
    int m = b(paramors);
    if (m != 0)
    {
      String[] arrayOfString2 = new String[m + 1];
      arrayOfString2[0] = paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      while (k < paramors.c.length)
      {
        osf localosf = paramors.c[k];
        if ((localosf.b == null) || (!localosf.b.booleanValue()))
        {
          localStringBuilder.append("?,");
          int n = j + 1;
          arrayOfString2[j] = efj.q(localosf.a.a);
          j = n;
        }
        k++;
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      if (!paramBoolean)
      {
        String str3 = String.valueOf("DELETE FROM circle_contact WHERE link_person_id=? AND link_circle_id NOT IN (");
        String str4 = String.valueOf(localStringBuilder.toString());
        paramSQLiteDatabase.execSQL(1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + str4 + ")", arrayOfString2);
      }
      String str1 = String.valueOf("INSERT OR IGNORE INTO circle_contact(link_person_id,link_circle_id) SELECT ?, circle_id FROM circles WHERE circle_id IN (");
      String str2 = String.valueOf(localStringBuilder.toString());
      paramSQLiteDatabase.execSQL(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2 + ")", arrayOfString2);
    }
    for (;;)
    {
      paramSQLiteDatabase.execSQL("UPDATE circles SET contact_count=(SELECT count(*) FROM circle_contact WHERE link_circle_id=circle_id) WHERE type=1");
      return;
      if (!paramBoolean)
      {
        String[] arrayOfString1 = new String[j];
        arrayOfString1[0] = paramString;
        paramSQLiteDatabase.delete("circle_contact", "link_person_id=?", arrayOfString1);
      }
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
    {
      String[] arrayOfString = new String[2];
      int j = paramArrayOfString.length;
      for (int k = 0; k < j; k++)
      {
        String str = paramArrayOfString[k];
        arrayOfString[1] = str;
        arrayOfString[0] = str;
        paramSQLiteDatabase.execSQL("UPDATE circles SET contact_count=(SELECT count(*) FROM circle_contact WHERE link_circle_id=?) WHERE circle_id=?", arrayOfString);
      }
    }
  }
  
  private static void a(ArrayList<brv> paramArrayList, String paramString)
  {
    if ((paramArrayList == null) || (TextUtils.isEmpty(paramString))) {}
    String str;
    int j;
    int m;
    do
    {
      return;
      str = paramString.toLowerCase();
      j = str.length();
      int k = 0;
      m = 0;
      while (k < j)
      {
        if (!Character.isLetterOrDigit(str.charAt(k)))
        {
          if (k > m) {
            paramArrayList.add(new brv(0, str.substring(m, k)));
          }
          m = k + 1;
        }
        k++;
      }
    } while (j <= m);
    paramArrayList.add(new brv(0, str.substring(m)));
  }
  
  public static void a(ArrayList<hur> paramArrayList, HashMap<String, String> paramHashMap)
  {
    int j = paramArrayList.size();
    for (int k = 0; k < j; k++)
    {
      hur localhur = (hur)paramArrayList.get(k);
      if (localhur.c != null) {}
      for (int m = localhur.c.size();; m = 0) {
        for (int n = 0; n < m; n++)
        {
          odg localodg = (odg)localhur.c.get(n);
          if ((localodg.a != null) && (localodg.a.a != null)) {
            a(localodg.a, paramHashMap);
          }
        }
      }
    }
  }
  
  private static void a(ors paramors, ArrayList<brv> paramArrayList)
  {
    int j = 0;
    int k;
    if (!TextUtils.isEmpty(paramors.a.a))
    {
      k = 1;
      if ((paramors.b.q == null) || (paramors.b.q.length <= 0)) {
        break label204;
      }
    }
    label204:
    for (int m = 1;; m = 0)
    {
      if ((k == 0) && (m == 0)) {
        return;
      }
      ArrayList localArrayList = new ArrayList();
      if (k != 0)
      {
        String str2 = c(paramors.a.a);
        if (str2 != null)
        {
          localArrayList.add(str2);
          paramArrayList.add(new brv(1, str2));
        }
      }
      if (m == 0) {
        return;
      }
      orx[] arrayOforx = paramors.b.q;
      int n = arrayOforx.length;
      while (j < n)
      {
        orx localorx = arrayOforx[j];
        if (!TextUtils.isEmpty(localorx.a))
        {
          String str1 = c(localorx.a);
          if ((str1 != null) && (!localArrayList.contains(str1)))
          {
            localArrayList.add(str1);
            paramArrayList.add(new brv(1, str1));
          }
        }
        j++;
      }
      k = 0;
      break;
    }
  }
  
  public static void a(ors paramors, HashMap<String, String> paramHashMap)
  {
    String str = (String)paramHashMap.get(efj.b(paramors.a));
    if (str != null)
    {
      ArrayList localArrayList = new ArrayList();
      int k;
      for (int j = 0; j < str.length(); j = k + 1)
      {
        k = str.indexOf('|', j);
        if (k == -1) {
          k = str.length();
        }
        osf localosf = new osf();
        localosf.a = new ork();
        localosf.a.b = str.substring(j, k);
        localArrayList.add(localosf);
      }
      paramors.c = ((osf[])localArrayList.toArray(new osf[localArrayList.size()]));
      return;
    }
    paramors.c = null;
  }
  
  public static void a(ors[] paramArrayOfors, HashMap<String, String> paramHashMap)
  {
    for (int j = 0; j < paramArrayOfors.length; j++) {
      a(paramArrayOfors[j], paramHashMap);
    }
  }
  
  public static void a(oso[] paramArrayOfoso, HashMap<String, String> paramHashMap)
  {
    for (int j = 0; j < paramArrayOfoso.length; j++)
    {
      oso localoso = paramArrayOfoso[j];
      if ((localoso.a != null) && (localoso.a.a != null)) {
        a(localoso.a, paramHashMap);
      }
    }
  }
  
  public static boolean a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, String paramString, nxl paramnxl, mua parammua, mvk parammvk, nyv paramnyv, nwy paramnwy, ofk paramofk, boolean paramBoolean)
  {
    if ((paramnxl.c != null) && (paramnxl.c.a != null)) {}
    int j;
    String str1;
    int k;
    label82:
    Cursor localCursor1;
    switch (paramnxl.c.a.a)
    {
    default: 
      j = 0;
      str1 = paramnxl.g;
      if (paramnxl.b == 2)
      {
        k = 2;
        localCursor1 = paramSQLiteDatabase.query("contacts", e, "person_id=?", new String[] { paramString }, null, null, null);
      }
      break;
    }
    for (;;)
    {
      ContentValues localContentValues;
      Cursor localCursor2;
      boolean bool2;
      boolean bool4;
      String str4;
      label979:
      gjc localgjc;
      try
      {
        if (!localCursor1.moveToFirst()) {
          break label1283;
        }
        n = localCursor1.getInt(0);
        str2 = localCursor1.getString(1);
        int i5 = localCursor1.getInt(2);
        m = i5;
        i1 = 0;
        localCursor1.close();
        localContentValues = new ContentValues();
        if ((n == j) && (TextUtils.equals(str2, str1)) && (m == k)) {
          break label1277;
        }
        if (TextUtils.isEmpty(str1))
        {
          localContentValues.put("name", str2);
          localContentValues.put("profile_state", Integer.valueOf(j));
          localContentValues.put("profile_type", Integer.valueOf(k));
          if (i1 == 0) {
            break label1110;
          }
          localContentValues.put("person_id", paramString);
          localContentValues.put("gaia_id", jjf.c(paramString));
          paramSQLiteDatabase.insert("contacts", null, localContentValues);
          bool1 = true;
          localCursor2 = paramSQLiteDatabase.query("profiles", new String[] { "profile_proto" }, "profile_person_id=?", new String[] { paramString }, null, null, null);
        }
      }
      finally
      {
        byte[] arrayOfByte1;
        String str3;
        label1051:
        localCursor1.close();
      }
      try
      {
        if (!localCursor2.moveToFirst()) {
          break label1268;
        }
        i2 = 0;
        arrayOfByte1 = localCursor2.getBlob(0);
        arrayOfByte2 = arrayOfByte1;
        localCursor2.close();
        if (paramnxl != null)
        {
          if ((paramnxl.c != null) && (paramnxl.c.e != null) && (paramnxl.c.e.a != null) && (paramnxl.c.e.a.b != null)) {
            paramnxl.c.e.a.b.e = null;
          }
          if ((paramnxl.f != null) && (paramnxl.f.c != null)) {
            paramnxl.f.c.d = null;
          }
        }
        if (paramnxl != null) {
          break label1149;
        }
        arrayOfByte3 = null;
        localContentValues.clear();
        if (paramBoolean) {
          localContentValues.put("profile_update_time", Long.valueOf(System.currentTimeMillis()));
        }
        if (parammua != null) {
          localContentValues.put("people_data_proto", a(parammua));
        }
        if (parammvk != null) {
          localContentValues.put("videos_data_proto", qat.a(parammvk));
        }
        if (paramnyv != null) {
          localContentValues.put("reviews_data_proto", a(paramnyv));
        }
        if (paramnwy != null)
        {
          if (paramnwy != null) {
            break label1159;
          }
          arrayOfByte6 = null;
          localContentValues.put("profile_stats_proto", arrayOfByte6);
        }
        if (paramofk != null)
        {
          if (paramofk != null) {
            break label1169;
          }
          arrayOfByte5 = null;
          if (Arrays.equals(arrayOfByte5, a(paramContext, paramInt, paramString))) {
            break label1179;
          }
          i4 = 1;
          bool1 |= i4;
          localContentValues.put("profile_squares_proto", arrayOfByte5);
        }
        bool2 = bool1;
        if (i2 == 0) {
          break label1185;
        }
        localContentValues.put("profile_person_id", paramString);
        localContentValues.put("profile_proto", arrayOfByte3);
        paramSQLiteDatabase.insert("profiles", null, localContentValues);
        bool4 = true;
        str3 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
        if ((bool4) && (mfx.a(str3, jjf.c(paramString))))
        {
          nvn localnvn = paramnxl.d;
          byte[] arrayOfByte4 = null;
          if (localnvn != null)
          {
            nxe localnxe = paramnxl.d.i;
            arrayOfByte4 = null;
            if (localnxe != null)
            {
              nxf localnxf = paramnxl.d.i.b;
              arrayOfByte4 = null;
              if (localnxf != null)
              {
                String str5 = paramnxl.d.i.b.a;
                arrayOfByte4 = null;
                if (str5 != null)
                {
                  nxg localnxg = paramnxl.d.h;
                  arrayOfByte4 = null;
                  if (localnxg != null)
                  {
                    nxi localnxi = paramnxl.d.h.b;
                    arrayOfByte4 = null;
                    if (localnxi != null)
                    {
                      nxh localnxh1 = paramnxl.d.h.b.d;
                      arrayOfByte4 = null;
                      if (localnxh1 != null)
                      {
                        nxh localnxh2 = paramnxl.d.h.b.d;
                        Integer localInteger = paramnxl.d.h.b.e;
                        int i3 = 0;
                        if (localInteger != null) {
                          i3 = paramnxl.d.h.b.e.intValue();
                        }
                        arrayOfByte4 = bpw.a(paramnxl.d.i.b.b, localnxh2.a.floatValue(), localnxh2.d.floatValue(), localnxh2.c.floatValue(), localnxh2.b.floatValue(), i3);
                      }
                    }
                  }
                }
              }
            }
          }
          localContentValues.clear();
          localContentValues.put("cover_photo_spec", arrayOfByte4);
          paramSQLiteDatabase.update("account_status", localContentValues, null, null);
          if (paramnxl.d == null) {
            break label1255;
          }
          str4 = efj.E(paramnxl.d.f);
          localContentValues.clear();
          localContentValues.put("avatar", hdo.a(str4));
          paramSQLiteDatabase.update("contacts", localContentValues, "person_id=?", new String[] { paramString });
          localgjc = ((giz)mbb.a(paramContext, giz.class)).b(paramInt);
          if (str4 == null) {
            break label1243;
          }
          localgjc.b("profile_photo_url", str4);
          localgjc.d();
        }
        return bool4;
      }
      finally
      {
        localCursor2.close();
      }
      j = 3;
      break;
      j = 4;
      break;
      j = 6;
      break;
      j = 5;
      break;
      k = 1;
      break label82;
      continue;
      label1110:
      paramSQLiteDatabase.update("contacts", localContentValues, "person_id=?", new String[] { paramString });
      boolean bool1 = true;
      continue;
      label1149:
      byte[] arrayOfByte3 = qat.a(paramnxl);
      continue;
      label1159:
      byte[] arrayOfByte6 = qat.a(paramnwy);
      continue;
      label1169:
      byte[] arrayOfByte5 = qat.a(paramofk);
      continue;
      label1179:
      int i4 = 0;
      continue;
      label1185:
      if (!Arrays.equals(arrayOfByte2, arrayOfByte3)) {
        localContentValues.put("profile_proto", arrayOfByte3);
      }
      for (boolean bool3 = true;; bool3 = bool2)
      {
        if (localContentValues.size() > 0) {
          paramSQLiteDatabase.update("profiles", localContentValues, "profile_person_id=?", new String[] { paramString });
        }
        bool4 = bool3;
        break;
        label1243:
        localgjc.e("profile_photo_url");
        break label1051;
        label1255:
        str4 = null;
        break label979;
      }
      label1268:
      int i2 = 1;
      byte[] arrayOfByte2 = null;
      continue;
      label1277:
      bool1 = false;
      continue;
      label1283:
      int m = -1;
      int n = -1;
      int i1 = 1;
      String str2 = null;
    }
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("in_my_circles", Integer.valueOf(0));
    localContentValues.put("last_updated_time", Long.valueOf(System.currentTimeMillis()));
    String[] arrayOfString = { paramString };
    int j = paramSQLiteDatabase.update("contacts", localContentValues, "person_id=?", arrayOfString);
    if (j != 0) {
      paramSQLiteDatabase.delete("circle_contact", "link_person_id=?", arrayOfString);
    }
    return j > 0;
  }
  
  public static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong)
  {
    Cursor localCursor = paramSQLiteDatabase.query("contacts", new String[] { "last_updated_time" }, "person_id=?", new String[] { paramString }, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        long l = localCursor.getLong(0);
        if (l != paramLong) {}
        for (boolean bool = true;; bool = false) {
          return bool;
        }
      }
      return true;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    if ((paramString2 == null) || (paramString1 == null) || ("0".equals(paramString1)))
    {
      if (Log.isLoggable("EsPeopleData", 3)) {
        new StringBuilder(55 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> Person id: ").append(paramString1).append(", name: ").append(paramString2).append("; *** Skip. No gaia id or name");
      }
      return false;
    }
    Cursor localCursor = paramSQLiteDatabase.query("contacts", jii.a, "gaia_id = ?", new String[] { paramString1 }, null, null, null);
    try
    {
      boolean bool1 = localCursor.moveToNext();
      jij localjij = null;
      if (bool1)
      {
        localjij = new jij();
        localjij.a = localCursor.getString(1);
        localjij.b = localCursor.getString(2);
        int j = localCursor.getInt(3);
        boolean bool2 = false;
        if (j != 0) {
          bool2 = true;
        }
        localjij.c = bool2;
      }
      return jii.a(paramSQLiteDatabase, paramString1, paramString2, paramString3, localjij);
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static byte[] a(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = hsb.b(paramContext, paramInt).query("profiles", new String[] { "profile_squares_proto" }, "profile_person_id=?", new String[] { paramString }, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        byte[] arrayOfByte = localCursor.getBlob(0);
        return arrayOfByte;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static byte[] a(brs parambrs)
  {
    if (parambrs == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    parambrs.writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
  
  private static byte[] a(mua parammua)
  {
    int j = 0;
    nys localnys = parammua.a;
    if (parammua.apiHeader != null)
    {
      parammua.apiHeader.a = null;
      parammua.apiHeader.b = null;
    }
    oon localoon = localnys.a;
    if (localoon != null)
    {
      if ((localoon.c != null) && (localoon.c.b != null))
      {
        omy[] arrayOfomy3 = localoon.c.b;
        for (int m = 0; m < arrayOfomy3.length; m++)
        {
          omy localomy3 = arrayOfomy3[m];
          localomy3.e = null;
          localomy3.b = null;
          localomy3.c = hdo.a(localomy3.c);
        }
      }
      if ((localoon.b != null) && (localoon.b.b != null))
      {
        omy[] arrayOfomy2 = localoon.b.b;
        for (int k = 0; k < arrayOfomy2.length; k++)
        {
          omy localomy2 = arrayOfomy2[k];
          localomy2.e = null;
          localomy2.b = null;
          localomy2.c = hdo.a(localomy2.c);
        }
      }
      if ((localoon.a != null) && (localoon.a.b != null))
      {
        omy[] arrayOfomy1 = localoon.a.b;
        while (j < arrayOfomy1.length)
        {
          omy localomy1 = arrayOfomy1[j];
          localomy1.e = null;
          localomy1.b = null;
          localomy1.c = hdo.a(localomy1.c);
          j++;
        }
      }
    }
    return qat.a(parammua);
  }
  
  public static byte[] a(nxl paramnxl)
  {
    Object localObject = null;
    if (paramnxl == null)
    {
      Parcel localParcel = Parcel.obtain();
      localObject.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      return arrayOfByte;
    }
    boolean bool;
    label43:
    cmw localcmw;
    if (paramnxl.b == 2)
    {
      bool = true;
      localcmw = new cmw(null, null, null, bool, true);
      if (!localcmw.d) {
        break label95;
      }
      localcmw.a = new nwn();
      localcmw.a.c = paramnxl.g;
    }
    for (;;)
    {
      localObject = localcmw;
      break;
      bool = false;
      break label43;
      label95:
      nxv localnxv = paramnxl.e;
      localObject = null;
      if (localnxv == null) {
        break;
      }
      nwn localnwn = paramnxl.e.a;
      localObject = null;
      if (localnwn == null) {
        break;
      }
      localcmw.a = paramnxl.e.a;
      if (paramnxl.e.d != null) {
        localcmw.e = paramnxl.e.d.booleanValue();
      }
      if (paramnxl.e.c != null) {
        localcmw.b = paramnxl.e.c;
      }
      if (paramnxl.d.b != null) {
        localcmw.c = paramnxl.d.b;
      }
    }
  }
  
  private static byte[] a(nyv paramnyv)
  {
    if ((paramnyv.a != null) && (paramnyv.a.b != null) && (paramnyv.a.b.length != 0))
    {
      qfx localqfx = paramnyv.a.b[0];
      localqfx.e = null;
      localqfx.a = null;
      localqfx.b = null;
      localqfx.f = null;
      if ((localqfx.c != null) && (localqfx.c.length != 0)) {
        for (qfm localqfm : localqfx.c)
        {
          localqfm.a = null;
          localqfm.b = null;
          localqfm.e = null;
          if ((localqfm.d != null) && (localqfm.d.length != 0)) {
            for (qfk localqfk : localqfm.d)
            {
              qhd localqhd = (qhd)localqfk.b(qfj.a);
              qgj localqgj = (qgj)localqfk.b(qfl.a);
              if (localqhd != null)
              {
                localqhd.a = null;
                localqfk.a(qfj.a, localqhd);
              }
              if (localqgj != null)
              {
                localqgj.a = null;
                localqgj.g = null;
                localqfk.a(qfl.a, localqgj);
              }
            }
          }
          if (localqfm.c != null)
          {
            if (localqfm.c.b != null)
            {
              localqfm.c.b.c = qay.f;
              localqfm.c.b.b = null;
            }
            localqfm.c.g = null;
            localqfm.c.c = null;
            localqfm.c.q = null;
            if (localqfm.c.a != null)
            {
              localqfm.c.a.f = null;
              localqfm.c.a.j = null;
              localqfm.c.a.h = null;
              localqfm.c.a.a = null;
              localqfm.c.a.c = null;
              localqfm.c.a.b = null;
              localqfm.c.a.g = null;
              localqfm.c.a.d = null;
              localqfm.c.a.e = null;
            }
            localqfm.c.l = null;
            localqfm.c.m = null;
          }
        }
      }
    }
    return qat.a(paramnyv);
  }
  
  public static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    default: 
      return 50;
    case 9: 
      return 20;
    case 8: 
      return 30;
    case 5: 
      return 40;
    case 7: 
      return 60;
    }
    return 1000;
  }
  
  private static int b(ors paramors)
  {
    if (paramors.c == null) {
      return 0;
    }
    int j = 0;
    int k = 0;
    if (j < paramors.c.length)
    {
      Boolean localBoolean = paramors.c[j].b;
      if (localBoolean == null) {}
      for (boolean bool = false;; bool = localBoolean.booleanValue())
      {
        if (!bool) {
          k++;
        }
        j++;
        break;
      }
    }
    return k;
  }
  
  public static ArrayList<String> b(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramString))
    {
      int k;
      for (int j = 0; j < paramString.length(); j = k + 1)
      {
        k = paramString.indexOf('|', j);
        if (k == -1) {
          k = paramString.length();
        }
        localArrayList.add(paramString.substring(j, k));
      }
    }
    return localArrayList;
  }
  
  private static ofk b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      ofk localofk = (ofk)qat.b(new ofk(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localofk;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Unable to deserialize ProfileSquares.", localqas);
    }
    return null;
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    if (Log.isLoggable("EsPeopleData", 3))
    {
      String str2 = String.valueOf(localgjb.b("display_name"));
      if (str2.length() == 0) {
        break label126;
      }
      ">>>> insertSelf: ".concat(str2);
    }
    for (;;)
    {
      localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      String str1 = localgjb.b("profile_photo_url");
      if (TextUtils.isEmpty(str1)) {
        str1 = null;
      }
      localSQLiteDatabase.beginTransaction();
      try
      {
        a(localSQLiteDatabase, localgjb.b("gaia_id"), localgjb.b("display_name"), str1);
        localSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        label126:
        localSQLiteDatabase.endTransaction();
      }
      new String(">>>> insertSelf: ");
    }
  }
  
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    String str = jjf.c(paramString);
    if (str == null) {
      return;
    }
    c(paramContext, paramInt, str);
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    gzj.a(new jjv(paramContext, true));
  }
  
  private static boolean b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    try
    {
      long l = DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT in_my_circles FROM contacts WHERE person_id=?", new String[] { paramString });
      return l != 0L;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return false;
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 0: 
      return 1;
    case 1: 
      return 2;
    }
    return 3;
  }
  
  private static String c(String paramString)
  {
    Rfc822Token[] arrayOfRfc822Token = Rfc822Tokenizer.tokenize(paramString);
    if (arrayOfRfc822Token.length == 0) {}
    String str;
    do
    {
      return null;
      str = arrayOfRfc822Token[0].getAddress();
    } while (TextUtils.isEmpty(str));
    return str.toLowerCase();
  }
  
  public static ArrayList<jgs> c(Context paramContext, int paramInt)
  {
    List localList = ((jiw)mbb.a(paramContext, jiw.class)).a(paramInt, jgx.p);
    ArrayList localArrayList = new ArrayList();
    int j = localList.size();
    for (int k = 0; k < j; k++)
    {
      jgw localjgw = (jgw)localList.get(k);
      localArrayList.add(new jgs(localjgw.b(), localjgw.e(), localjgw.c(), localjgw.f()));
    }
    return localArrayList;
  }
  
  private static nwy c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      nwy localnwy = (nwy)qat.b(new nwy(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localnwy;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Unable to deserialize ProfileStats.", localqas);
    }
    return null;
  }
  
  private static void c(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    String[] arrayOfString1 = { "videos_data_proto" };
    String[] arrayOfString2 = new String[1];
    String str1 = String.valueOf(paramString);
    String str2;
    Cursor localCursor;
    if (str1.length() != 0)
    {
      str2 = "g:".concat(str1);
      arrayOfString2[0] = str2;
      localCursor = localSQLiteDatabase.query("profiles", arrayOfString1, "profile_person_id=?", arrayOfString2, null, null, null);
    }
    for (;;)
    {
      bjt localbjt1;
      qat localqat1;
      try
      {
        if (!localCursor.moveToFirst()) {
          break label801;
        }
        byte[] arrayOfByte2 = localCursor.getBlob(0);
        arrayOfByte1 = arrayOfByte2;
        localCursor.close();
        if (arrayOfByte1 == null) {
          break label795;
        }
        bool1 = bjt.a(e(arrayOfByte1));
        boolean bool2 = d(paramContext, paramInt, paramString);
        kcg localkcg = new kcg(paramContext, paramInt);
        kcp localkcp = kdg.a(paramContext, localkcg);
        jyd localjyd = new jyd(paramContext, localkcg, paramInt, paramString);
        bjg localbjg = new bjg(paramContext, paramInt, paramString);
        bjo localbjo = new bjo(paramContext, paramInt, paramString, null);
        localbjt1 = new bjt(paramContext, paramInt, paramString, bool1);
        bjm localbjm = new bjm(paramContext, new kcg(paramContext, paramInt), paramString);
        bjv localbjv = new bjv(paramContext, new kcg(paramContext, paramInt), paramString);
        localkcp.a(localjyd);
        localkcp.a(localbjg);
        localkcp.a(localbjo);
        localkcp.a(localbjt1);
        localkcp.a(localbjm);
        if (!bool2) {
          break label786;
        }
        kzi localkzi1 = new kzi(paramContext, new kcg(paramContext, paramInt), 1);
        lgs locallgs1 = new lgs(paramContext, new kcg(paramContext, paramInt));
        localkcp.a(localkzi1);
        localkcp.a(locallgs1);
        locallgs2 = locallgs1;
        localkzi2 = localkzi1;
        localkcp.a(localbjv);
        localkcp.i();
        localjyd.d("EsPeopleData");
        localbjg.c("EsPeopleData");
        localbjo.c("EsPeopleData");
        localbjt1.c("EsPeopleData");
        localbjm.c("EsPeopleData");
        if (bool2)
        {
          localkzi2.c("EsPeopleData");
          locallgs2.c("EsPeopleData");
        }
        localbjv.c("EsPeopleData");
        if ((bool1) || (!bjt.a(localbjt1.a))) {
          break label779;
        }
        localbjt2 = new bjt(paramContext, paramInt, paramString, true);
        localbjt2.i();
        localbjt2.c("EsPeopleData");
        nxl localnxl = localjyd.a;
        mua localmua = localbjg.a;
        mvk localmvk = localbjt2.a;
        nyv localnyv = localbjo.a;
        if (!localbjm.x) {
          continue;
        }
        localqat1 = localbjm.w;
        mui localmui = (mui)localqat1;
        if ((localmui == null) || (localmui.a == null)) {
          break label743;
        }
        localnwy = localmui.a.a;
        if (!localbjv.x) {
          break label749;
        }
        localqat2 = localbjv.w;
        mwg localmwg = (mwg)localqat2;
        if (localmwg == null) {
          break label755;
        }
        localofk = localmwg.a;
        a(paramContext, paramInt, paramString, localnxl, localmua, localmvk, localnyv, localnwy, localofk);
        kyk localkyk;
        if (bool2)
        {
          localkyk = (kyk)mbb.a(paramContext, kyk.class);
          if (!localkzi2.n())
          {
            if (!localkzi2.x) {
              break label761;
            }
            localqat4 = localkzi2.w;
            localkyk.a(paramInt, ((muu)localqat4).a);
          }
          if (!locallgs2.n())
          {
            if (!locallgs2.x) {
              break label767;
            }
            localqat3 = locallgs2.w;
            muy localmuy = (muy)localqat3;
            if ((localmuy == null) || (localmuy.a == null)) {
              break label773;
            }
            localoea = localmuy.a.a;
          }
        }
        return;
      }
      finally
      {
        localCursor.close();
      }
      str2 = new String("g:");
      break;
      continue;
      label743:
      nwy localnwy = null;
      continue;
      label749:
      qat localqat2 = null;
      continue;
      label755:
      ofk localofk = null;
      continue;
      label761:
      qat localqat4 = null;
      continue;
      label767:
      qat localqat3 = null;
      continue;
      label773:
      oea localoea = null;
      continue;
      label779:
      bjt localbjt2 = localbjt1;
      continue;
      label786:
      lgs locallgs2 = null;
      kzi localkzi2 = null;
      continue;
      label795:
      boolean bool1 = false;
      continue;
      label801:
      byte[] arrayOfByte1 = null;
    }
  }
  
  private static void c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramSQLiteDatabase.execSQL("UPDATE contacts SET in_my_circles=(EXISTS (SELECT 1 FROM circle_contact WHERE link_person_id=?)),last_updated_time=last_updated_time + 1 WHERE person_id=?", new String[] { paramString, paramString });
  }
  
  public static int d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -2147483648;
    case 1: 
      return 0;
    case 2: 
      return 1;
    }
    return 2;
  }
  
  private static mua d(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      mua localmua = (mua)qat.b(new mua(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localmua;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Unable to deserialize GetPeopleDataResponse.", localqas);
    }
    return null;
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, f(paramContext, paramInt), true);
    long l = i(paramContext, paramInt);
    if (l == -1L) {}
    for (boolean bool = true;; bool = false)
    {
      jkz localjkz = new jkz(paramContext);
      ConditionVariable localConditionVariable = new ConditionVariable();
      jix localjix = localjkz.c();
      jic localjic = new jic(localjix, localConditionVariable, l, paramContext, paramInt);
      if (jid.a()) {
        jid.a("EsPeopleData#loadPeople", String.format("Connecting client %s.", new Object[] { localjix }));
      }
      localjix.d();
      localjkz.a(localjic, paramInt, bool);
      if (bool)
      {
        efj.l();
        localConditionVariable.block(10000L);
      }
      return;
    }
  }
  
  private static boolean d(Context paramContext, int paramInt, String paramString)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id").equals(paramString);
  }
  
  private static mvk e(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      mvk localmvk = (mvk)qat.b(new mvk(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localmvk;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Unable to deserialize cached video data.", localqas);
    }
    return null;
  }
  
  public static void e(Context paramContext, int paramInt)
  {
    jkz localjkz = new jkz(paramContext);
    jix localjix = localjkz.c();
    brr localbrr = new brr(localjix);
    localjix.d();
    localjkz.a(localbrr, paramInt);
  }
  
  private static long f(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT circle_fingerprint  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  private static nyv f(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      nyv localnyv = (nyv)qat.b(new nyv(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localnyv;
    }
    catch (qas localqas)
    {
      Log.e("EsPeopleData", "Unable to deserialize GetReviewsDataResponse.", localqas);
    }
    return null;
  }
  
  private static long g(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT blocked_people_sync_time  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  @Deprecated
  private static long h(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT people_sync_time  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  private static long i(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT people_fingerprint  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brn
 * JD-Core Version:    0.7.0.1
 */