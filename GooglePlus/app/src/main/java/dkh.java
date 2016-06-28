import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.provider.ContactsContract;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class dkh
{
  private static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "profile/raw_contacts");
  private static String[] b = { "_id", "sync1" };
  private static final String c = "1";
  private static final String d = "3";
  private static final String e = "7";
  private static final String f = "5";
  private static final String g = "4";
  private static final String h = "2";
  private static final String i = "6";
  private static final String j = "13";
  private static final String k = "10";
  private static final String l = "19";
  private static final String m = "9";
  private static final String n = "14";
  private static final String o = "11";
  private static final String p = "8";
  private static final String q = "15";
  private static final String r = "16";
  private static final String s = "17";
  private static final String t = "18";
  private static final String u = "12";
  private static SparseArray<String> v;
  private static boolean w;
  private static boolean x;
  private static int y = 0;
  
  static
  {
    SparseArray localSparseArray = new SparseArray();
    v = localSparseArray;
    localSparseArray.put(2, c);
    v.put(3, d);
    v.put(4, e);
    v.put(5, f);
    v.put(6, g);
    v.put(7, h);
    v.put(8, i);
    v.put(9, j);
    v.put(10, k);
    v.put(11, l);
    v.put(12, m);
    v.put(13, n);
    v.put(14, o);
    v.put(15, p);
    v.put(16, q);
    v.put(17, r);
    v.put(18, s);
    v.put(19, t);
    v.put(20, u);
  }
  
  public static void a(Context paramContext)
  {
    int i1 = paramContext.getSharedPreferences("accounts", 0).getInt("profile_action_status", 2);
    y = 0;
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setType("vnd.android.cursor.item/vnd.googleplus.profile.comm");
    List localList = localPackageManager.queryIntentActivities(localIntent, 65536);
    int i3;
    if ((localList != null) && (localList.size() > 0))
    {
      y = 1;
      int i2 = y;
      i3 = 0;
      if (i2 == 1) {
        i3 = 1;
      }
      if ((i1 != 0) || (i3 == 0)) {
        break label132;
      }
      bgp.l(paramContext, 2);
      int i5 = bgp.a(paramContext);
      if (i5 != -1) {
        EsSyncAdapterService.a(paramContext, i5);
      }
    }
    label132:
    int i4;
    do
    {
      do
      {
        return;
        y = 2;
        break;
      } while ((i1 != 1) || (i3 != 0));
      bgp.l(paramContext, 2);
      i4 = bgp.a(paramContext);
    } while (i4 == -1);
    EsSyncAdapterService.a(paramContext, i4);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    if (!c(paramContext)) {
      return;
    }
    bgp.a(paramContext, false);
    bgp.b(paramContext, false);
    kck localkck = new kck();
    localkck.n = true;
    List localList = Arrays.asList(new String[] { "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS" });
    jpd localjpd = (jpd)mbb.a(paramContext, jpd.class);
    Iterator localIterator = localList.iterator();
    int i1;
    label102:
    String str;
    ContentResolver localContentResolver;
    Cursor localCursor;
    while (localIterator.hasNext()) {
      if (localjpd.a(paramContext, (String)localIterator.next()) == 0)
      {
        i1 = 1;
        if (i1 == 0) {
          break label319;
        }
        str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
        localkck.b("Android:DeleteProfile");
        localContentResolver = paramContext.getContentResolver();
        localCursor = localContentResolver.query(a.buildUpon().appendQueryParameter("account_type", "com.google").appendQueryParameter("data_set", "plus").appendQueryParameter("account_name", str).appendQueryParameter("caller_is_syncadapter", "true").build(), b, null, null, null);
        if (localCursor == null) {
          break label339;
        }
      }
    }
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          continue;
        }
        long l2 = localCursor.getLong(0);
        l1 = l2;
        localCursor.close();
        if (l1 != 0L) {
          localkck.a(localContentResolver.delete(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_type", "com.google").appendQueryParameter("data_set", "plus").appendQueryParameter("account_name", str).appendQueryParameter("caller_is_syncadapter", "true").build(), l1), null, null));
        }
        localkck.d();
        return;
      }
      finally
      {
        label319:
        localCursor.close();
      }
      i1 = 0;
      break label102;
      break;
      continue;
      label339:
      long l1 = 0L;
    }
  }
  
  private static void a(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString, kck paramkck)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ArrayList localArrayList1 = new ArrayList();
    Cursor localCursor = localContentResolver.query(paramUri, new String[] { "_id" }, paramString, paramArrayOfString, null);
    if (localCursor != null) {
      try
      {
        while (localCursor.moveToNext()) {
          localArrayList1.add(localCursor.getString(0));
        }
        if (!localArrayList1.isEmpty()) {
          break label95;
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    return;
    label95:
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList2.add(ContentProviderOperation.newDelete(paramUri).withSelection("_id=?", new String[] { str }).withYieldAllowed(true).build());
      a(paramContext, localArrayList2, 128, false);
      paramkck.c();
    }
    a(paramContext, localArrayList2, 128, true);
  }
  
  public static void a(Context paramContext, kck paramkck)
  {
    if ((!c(paramContext)) || (paramkck.b())) {
      return;
    }
    paramkck.b("Android contacts sync");
    try
    {
      brn.a(paramContext);
      brn.b(paramContext, true);
      return;
    }
    finally
    {
      paramkck.d();
    }
  }
  
  private static ContentProviderResult[] a(Context paramContext, ArrayList<ContentProviderOperation> paramArrayList, int paramInt, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    int i1 = paramArrayList.size();
    if (i1 == 0) {}
    while ((!paramBoolean) && (i1 < 128)) {
      return null;
    }
    try
    {
      ContentProviderResult[] arrayOfContentProviderResult2 = localContentResolver.applyBatch("com.android.contacts", paramArrayList);
      arrayOfContentProviderResult1 = arrayOfContentProviderResult2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = Log.isLoggable("GooglePlusContactsSync", 6);
        ContentProviderResult[] arrayOfContentProviderResult1 = null;
        if (bool)
        {
          Log.e("GooglePlusContactsSync", "Cannot apply a batch of content provider operations", localException);
          arrayOfContentProviderResult1 = null;
        }
      }
    }
    paramArrayList.clear();
    return arrayOfContentProviderResult1;
  }
  
  public static void b(Context paramContext)
  {
    if (!c(paramContext)) {}
    while (bgp.c(paramContext)) {
      return;
    }
    new Thread(new dki(paramContext), "contact_cleanup").start();
  }
  
  /* Error */
  public static void b(Context paramContext, kck paramkck)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 213	dkh:c	(Landroid/content/Context;)Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: invokestatic 425	bgp:c	(Landroid/content/Context;)Z
    //   12: ifne +638 -> 650
    //   15: aload_0
    //   16: ldc_w 259
    //   19: invokestatic 240	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   22: checkcast 259	giz
    //   25: astore 4
    //   27: aload 4
    //   29: iconst_1
    //   30: anewarray 55	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc_w 443
    //   38: aastore
    //   39: invokeinterface 446 2 0
    //   44: astore 5
    //   46: aload 5
    //   48: invokeinterface 198 1 0
    //   53: istore 6
    //   55: new 448	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 449	java/lang/StringBuilder:<init>	()V
    //   62: astore 7
    //   64: iload 6
    //   66: ifne +609 -> 675
    //   69: iconst_1
    //   70: anewarray 55	java/lang/String
    //   73: dup
    //   74: iconst_0
    //   75: ldc_w 451
    //   78: aastore
    //   79: astore 8
    //   81: aload 7
    //   83: bipush 63
    //   85: invokevirtual 455	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_1
    //   90: ldc_w 457
    //   93: invokevirtual 274	kck:b	(Ljava/lang/String;)V
    //   96: getstatic 53	dkh:a	Landroid/net/Uri;
    //   99: invokevirtual 282	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   102: ldc_w 298
    //   105: ldc_w 300
    //   108: invokevirtual 292	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   111: invokevirtual 304	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   114: astore 10
    //   116: ldc_w 459
    //   119: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: astore 11
    //   124: aload 7
    //   126: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   129: astore 12
    //   131: ldc_w 284
    //   134: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   137: astore 13
    //   139: ldc_w 286
    //   142: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   145: astore 14
    //   147: aload_0
    //   148: aload 10
    //   150: new 448	java/lang/StringBuilder
    //   153: dup
    //   154: bipush 9
    //   156: aload 11
    //   158: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   161: invokevirtual 466	java/lang/String:length	()I
    //   164: iadd
    //   165: aload 12
    //   167: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   170: invokevirtual 466	java/lang/String:length	()I
    //   173: iadd
    //   174: aload 13
    //   176: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual 466	java/lang/String:length	()I
    //   182: iadd
    //   183: aload 14
    //   185: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   188: invokevirtual 466	java/lang/String:length	()I
    //   191: iadd
    //   192: invokespecial 468	java/lang/StringBuilder:<init>	(I)V
    //   195: aload 11
    //   197: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload 12
    //   202: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: ldc_w 473
    //   208: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload 13
    //   213: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: ldc_w 475
    //   219: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: aload 14
    //   224: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: ldc_w 477
    //   230: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 481	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: aload 8
    //   238: aload_1
    //   239: invokestatic 483	dkh:a	(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Lkck;)V
    //   242: aload_1
    //   243: invokevirtual 342	kck:d	()V
    //   246: aload_1
    //   247: ldc_w 485
    //   250: invokevirtual 274	kck:b	(Ljava/lang/String;)V
    //   253: getstatic 327	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   256: invokevirtual 282	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   259: ldc_w 298
    //   262: ldc_w 300
    //   265: invokevirtual 292	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   268: invokevirtual 304	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   271: astore 15
    //   273: ldc_w 459
    //   276: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   279: astore 16
    //   281: aload 7
    //   283: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   286: astore 17
    //   288: ldc_w 284
    //   291: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   294: astore 18
    //   296: ldc_w 286
    //   299: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   302: astore 19
    //   304: aload_0
    //   305: aload 15
    //   307: new 448	java/lang/StringBuilder
    //   310: dup
    //   311: bipush 9
    //   313: aload 16
    //   315: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   318: invokevirtual 466	java/lang/String:length	()I
    //   321: iadd
    //   322: aload 17
    //   324: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   327: invokevirtual 466	java/lang/String:length	()I
    //   330: iadd
    //   331: aload 18
    //   333: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   336: invokevirtual 466	java/lang/String:length	()I
    //   339: iadd
    //   340: aload 19
    //   342: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   345: invokevirtual 466	java/lang/String:length	()I
    //   348: iadd
    //   349: invokespecial 468	java/lang/StringBuilder:<init>	(I)V
    //   352: aload 16
    //   354: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: aload 17
    //   359: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: ldc_w 473
    //   365: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: aload 18
    //   370: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: ldc_w 475
    //   376: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: aload 19
    //   381: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: ldc_w 477
    //   387: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: invokevirtual 481	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   393: aload 8
    //   395: aload_1
    //   396: invokestatic 483	dkh:a	(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Lkck;)V
    //   399: aload_1
    //   400: invokevirtual 342	kck:d	()V
    //   403: aload_1
    //   404: ldc_w 487
    //   407: invokevirtual 274	kck:b	(Ljava/lang/String;)V
    //   410: getstatic 490	android/provider/ContactsContract$Groups:CONTENT_URI	Landroid/net/Uri;
    //   413: invokevirtual 282	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   416: ldc_w 298
    //   419: ldc_w 300
    //   422: invokevirtual 292	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   425: invokevirtual 304	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   428: astore 20
    //   430: aload_0
    //   431: invokevirtual 278	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   434: astore 21
    //   436: iconst_1
    //   437: anewarray 55	java/lang/String
    //   440: dup
    //   441: iconst_0
    //   442: ldc 57
    //   444: aastore
    //   445: astore 22
    //   447: ldc_w 459
    //   450: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   453: astore 23
    //   455: aload 7
    //   457: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   460: astore 24
    //   462: ldc_w 284
    //   465: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   468: astore 25
    //   470: ldc_w 286
    //   473: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   476: astore 26
    //   478: aload 21
    //   480: aload 20
    //   482: aload 22
    //   484: new 448	java/lang/StringBuilder
    //   487: dup
    //   488: bipush 9
    //   490: aload 23
    //   492: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   495: invokevirtual 466	java/lang/String:length	()I
    //   498: iadd
    //   499: aload 24
    //   501: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   504: invokevirtual 466	java/lang/String:length	()I
    //   507: iadd
    //   508: aload 25
    //   510: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   513: invokevirtual 466	java/lang/String:length	()I
    //   516: iadd
    //   517: aload 26
    //   519: invokestatic 463	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   522: invokevirtual 466	java/lang/String:length	()I
    //   525: iadd
    //   526: invokespecial 468	java/lang/StringBuilder:<init>	(I)V
    //   529: aload 23
    //   531: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: aload 24
    //   536: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: ldc_w 473
    //   542: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: aload 25
    //   547: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: ldc_w 475
    //   553: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: aload 26
    //   558: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: ldc_w 477
    //   564: invokevirtual 471	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: invokevirtual 481	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   570: aload 8
    //   572: aconst_null
    //   573: invokevirtual 310	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   576: astore 27
    //   578: aload 27
    //   580: ifnull +181 -> 761
    //   583: aload 27
    //   585: invokeinterface 351 1 0
    //   590: ifeq +164 -> 754
    //   593: aload 27
    //   595: iconst_0
    //   596: invokeinterface 319 2 0
    //   601: lstore 29
    //   603: aload_1
    //   604: aload_0
    //   605: invokevirtual 278	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   608: aload 20
    //   610: lload 29
    //   612: invokestatic 333	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   615: aconst_null
    //   616: aconst_null
    //   617: invokevirtual 337	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   620: invokevirtual 340	kck:a	(I)V
    //   623: goto -40 -> 583
    //   626: astore 28
    //   628: aload 27
    //   630: invokeinterface 322 1 0
    //   635: aload 28
    //   637: athrow
    //   638: astore_2
    //   639: ldc_w 413
    //   642: ldc_w 492
    //   645: aload_2
    //   646: invokestatic 424	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   649: pop
    //   650: aload_0
    //   651: ldc 153
    //   653: iconst_0
    //   654: invokevirtual 159	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   657: ldc_w 494
    //   660: iconst_0
    //   661: invokeinterface 498 3 0
    //   666: ifne -659 -> 7
    //   669: aload_0
    //   670: iconst_1
    //   671: invokestatic 218	bgp:b	(Landroid/content/Context;Z)V
    //   674: return
    //   675: iload 6
    //   677: anewarray 55	java/lang/String
    //   680: astore 8
    //   682: iconst_0
    //   683: istore 31
    //   685: iload 31
    //   687: iload 6
    //   689: if_icmpge -600 -> 89
    //   692: aload 8
    //   694: iload 31
    //   696: aload 4
    //   698: aload 5
    //   700: iload 31
    //   702: invokeinterface 502 2 0
    //   707: checkcast 504	java/lang/Integer
    //   710: invokevirtual 507	java/lang/Integer:intValue	()I
    //   713: invokeinterface 262 2 0
    //   718: ldc_w 264
    //   721: invokeinterface 269 2 0
    //   726: aastore
    //   727: iload 31
    //   729: ifle +11 -> 740
    //   732: aload 7
    //   734: bipush 44
    //   736: invokevirtual 455	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   739: pop
    //   740: aload 7
    //   742: bipush 63
    //   744: invokevirtual 455	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: iinc 31 1
    //   751: goto -66 -> 685
    //   754: aload 27
    //   756: invokeinterface 322 1 0
    //   761: aload_1
    //   762: invokevirtual 342	kck:d	()V
    //   765: aload_0
    //   766: iconst_1
    //   767: invokestatic 216	bgp:a	(Landroid/content/Context;Z)V
    //   770: goto -120 -> 650
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	773	0	paramContext	Context
    //   0	773	1	paramkck	kck
    //   638	8	2	localThrowable	Throwable
    //   25	672	4	localgiz	giz
    //   44	655	5	localList	List
    //   53	637	6	i1	int
    //   62	679	7	localStringBuilder	java.lang.StringBuilder
    //   79	614	8	arrayOfString1	String[]
    //   114	35	10	localUri1	Uri
    //   122	74	11	str1	String
    //   129	72	12	str2	String
    //   137	75	13	str3	String
    //   145	78	14	str4	String
    //   271	35	15	localUri2	Uri
    //   279	74	16	str5	String
    //   286	72	17	str6	String
    //   294	75	18	str7	String
    //   302	78	19	str8	String
    //   428	181	20	localUri3	Uri
    //   434	45	21	localContentResolver	ContentResolver
    //   445	38	22	arrayOfString2	String[]
    //   453	77	23	str9	String
    //   460	75	24	str10	String
    //   468	78	25	str11	String
    //   476	81	26	str12	String
    //   576	179	27	localCursor	Cursor
    //   626	10	28	localObject	Object
    //   601	10	29	l1	long
    //   683	66	31	i2	int
    // Exception table:
    //   from	to	target	type
    //   583	623	626	finally
    //   15	64	638	java/lang/Throwable
    //   69	89	638	java/lang/Throwable
    //   89	578	638	java/lang/Throwable
    //   628	638	638	java/lang/Throwable
    //   675	682	638	java/lang/Throwable
    //   692	727	638	java/lang/Throwable
    //   732	740	638	java/lang/Throwable
    //   740	748	638	java/lang/Throwable
    //   754	761	638	java/lang/Throwable
    //   761	770	638	java/lang/Throwable
  }
  
  public static boolean c(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 14) {}
    while (!"TRUE".equalsIgnoreCase(dun.g.a())) {
      return false;
    }
    return d(paramContext);
  }
  
  private static boolean d(Context paramContext)
  {
    if (w) {
      return x;
    }
    for (;;)
    {
      try
      {
        ContentProviderClient localContentProviderClient = paramContext.getContentResolver().acquireContentProviderClient("com.android.contacts");
        if (localContentProviderClient == null) {
          continue;
        }
        bool = true;
        x = bool;
        if (localContentProviderClient != null) {
          localContentProviderClient.release();
        }
        w = true;
      }
      catch (Throwable localThrowable)
      {
        boolean bool;
        Log.e("GooglePlusContactsSync", "Cannot determine availability of the contacts provider");
        continue;
      }
      catch (SecurityException localSecurityException) {}
      return x;
      bool = false;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkh
 * JD-Core Version:    0.7.0.1
 */