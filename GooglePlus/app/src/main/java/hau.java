import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupEnvironment;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.util.HashSet;

public final class hau
{
  private static hau g;
  final Context a;
  final HashSet<Integer> b = new HashSet();
  public final Handler c;
  final hci d;
  final giz e;
  volatile haz f;
  private final hby h;
  
  private hau(Context paramContext)
  {
    this.a = paramContext;
    this.d = ((hci)mbb.a(paramContext, hci.class));
    this.h = hby.a(this.a);
    this.e = ((giz)mbb.a(paramContext, giz.class));
    HandlerThread localHandlerThread = new HandlerThread("iu-sync-manager", 10);
    localHandlerThread.start();
    this.c = new haw(this, localHandlerThread.getLooper());
    this.c.sendEmptyMessage(2);
    hav localhav = new hav(this);
    AccountManager.get(this.a).addOnAccountsUpdatedListener(localhav, null, false);
  }
  
  public static hau a(Context paramContext)
  {
    try
    {
      if (g == null) {
        g = new hau(paramContext.getApplicationContext());
      }
      hau localhau = g;
      return localhau;
    }
    finally {}
  }
  
  static boolean a(Context paramContext, int paramInt)
  {
    if (paramInt == -1) {
      return false;
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Account[] arrayOfAccount = AccountManager.get(paramContext).getAccountsByType("com.google");
    int i = arrayOfAccount.length;
    for (int j = 0; j < i; j++)
    {
      int k = localgiz.a(arrayOfAccount[j].name);
      if ((k != -1) && (k == paramInt)) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  private final hca c(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 290
    //   3: invokestatic 293	iuh:a	(Ljava/lang/String;)I
    //   6: istore_2
    //   7: new 295	java/util/concurrent/FutureTask
    //   10: dup
    //   11: new 297	hax
    //   14: dup
    //   15: aload_0
    //   16: iload_1
    //   17: invokespecial 299	hax:<init>	(Lhau;I)V
    //   20: invokespecial 302	java/util/concurrent/FutureTask:<init>	(Ljava/util/concurrent/Callable;)V
    //   23: astore_3
    //   24: aload_0
    //   25: getfield 74	hau:c	Landroid/os/Handler;
    //   28: aload_3
    //   29: invokevirtual 306	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   32: pop
    //   33: aload_3
    //   34: invokevirtual 309	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   37: checkcast 117	hca
    //   40: astore 7
    //   42: iload_2
    //   43: invokestatic 311	iuh:a	(I)V
    //   46: aload 7
    //   48: areturn
    //   49: astore 6
    //   51: iload_2
    //   52: invokestatic 311	iuh:a	(I)V
    //   55: aconst_null
    //   56: areturn
    //   57: astore 5
    //   59: iload_2
    //   60: invokestatic 311	iuh:a	(I)V
    //   63: aload 5
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	hau
    //   0	66	1	paramInt	int
    //   6	54	2	i	int
    //   23	11	3	localFutureTask	java.util.concurrent.FutureTask
    //   57	7	5	localObject	Object
    //   49	1	6	localThrowable	java.lang.Throwable
    //   40	7	7	localhca	hca
    // Exception table:
    //   from	to	target	type
    //   33	42	49	java/lang/Throwable
    //   33	42	57	finally
  }
  
  final hca a(int paramInt, boolean paramBoolean)
  {
    MediaRecordEntry localMediaRecordEntry1 = hbm.b(this.d, paramInt);
    if (localMediaRecordEntry1 == null) {
      hbm.a(this.a, paramInt, -1);
    }
    for (MediaRecordEntry localMediaRecordEntry2 = hbm.b(this.d, paramInt);; localMediaRecordEntry2 = localMediaRecordEntry1)
    {
      if (localMediaRecordEntry2 == null) {}
      label110:
      hca localhca;
      label323:
      do
      {
        return null;
        int i = localMediaRecordEntry2.mUploadAccountId;
        if (!a(this.a, i))
        {
          if (Log.isLoggable("iu.SyncManager", 3))
          {
            String str5 = String.valueOf(iaw.b(Integer.valueOf(i)));
            if (str5.length() == 0) {
              break label110;
            }
            "invalid account, remove all uploads in DB: ".concat(str5);
          }
          for (;;)
          {
            hbm.a(this.d, i);
            break;
            new String("invalid account, remove all uploads in DB: ");
          }
        }
        localhca = new hca(this.a, localMediaRecordEntry2);
        if (!AutoBackupEnvironment.a())
        {
          if (Log.isLoggable("iu.SyncManager", 4))
          {
            String str4 = String.valueOf(localhca);
            new StringBuilder(33 + String.valueOf(str4).length()).append("--- NEW; skip: no storage; task: ").append(str4);
          }
          localhca.a(11);
        }
        int j;
        for (;;)
        {
          j = localhca.f;
          if ((!paramBoolean) || ((!b(j)) && (localhca.b()))) {
            break label323;
          }
          if (!Log.isLoggable("iu.SyncManager", 4)) {
            break;
          }
          String str3 = String.valueOf(localhca);
          new StringBuilder(22 + String.valueOf(str3).length()).append("NEXT; rejected; task: ").append(str3);
          return null;
          if (Log.isLoggable("iu.SyncManager", 4))
          {
            String str1 = String.valueOf(localhca);
            new StringBuilder(23 + String.valueOf(str1).length()).append("--- NEW; upload; task: ").append(str1);
          }
        }
        if ((paramInt == -1) || (j == paramInt)) {
          break label382;
        }
      } while (!Log.isLoggable("iu.SyncManager", 4));
      String str2 = String.valueOf(localhca);
      new StringBuilder(27 + String.valueOf(str2).length()).append("NEXT; wrong account; task: ").append(str2);
      return null;
      label382:
      return localhca;
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(this.a, hci.class)).getWritableDatabase();
      String str = MediaRecordEntry.a.a;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Integer.toString(paramInt);
      localSQLiteDatabase.delete(str, "upload_account_id == ?", arrayOfString);
      if (this.e.c(paramInt)) {
        localSQLiteDatabase.delete("server_fingerprints", "owner_id=?", new String[] { this.e.a(paramInt).b("gaia_id") });
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void a(haz paramhaz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 386	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 387	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: aload_0
    //   13: aload_1
    //   14: checkcast 206	haz
    //   17: putfield 108	hau:f	Lhaz;
    //   20: aload_0
    //   21: getfield 31	hau:b	Ljava/util/HashSet;
    //   24: astore_2
    //   25: aload_2
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 31	hau:b	Ljava/util/HashSet;
    //   31: invokevirtual 390	java/util/HashSet:clear	()V
    //   34: aload_2
    //   35: monitorexit
    //   36: aload_1
    //   37: getfield 222	haz:a	I
    //   40: istore 5
    //   42: aload_0
    //   43: iload 5
    //   45: invokespecial 392	hau:c	(I)Lhca;
    //   48: astore 6
    //   50: aload 6
    //   52: ifnonnull +107 -> 159
    //   55: iconst_m1
    //   56: istore 7
    //   58: aload 6
    //   60: ifnull +109 -> 169
    //   63: aload_0
    //   64: iload 7
    //   66: invokevirtual 211	hau:b	(I)Z
    //   69: ifne +11 -> 80
    //   72: aload 6
    //   74: invokevirtual 214	hca:b	()Z
    //   77: ifne +92 -> 169
    //   80: ldc 134
    //   82: iconst_4
    //   83: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   86: ifeq +40 -> 126
    //   89: aload 6
    //   91: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   94: astore 9
    //   96: new 148	java/lang/StringBuilder
    //   99: dup
    //   100: bipush 26
    //   102: aload 9
    //   104: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   107: invokevirtual 152	java/lang/String:length	()I
    //   110: iadd
    //   111: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   114: ldc_w 394
    //   117: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload 9
    //   122: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield 108	hau:f	Lhaz;
    //   131: aload_1
    //   132: invokevirtual 395	haz:b	()Z
    //   135: ifne +13 -> 148
    //   138: aload_0
    //   139: getfield 74	hau:c	Landroid/os/Handler;
    //   142: iconst_1
    //   143: lconst_0
    //   144: invokevirtual 399	android/os/Handler:sendEmptyMessageDelayed	(IJ)Z
    //   147: pop
    //   148: aload_0
    //   149: aconst_null
    //   150: putfield 108	hau:f	Lhaz;
    //   153: return
    //   154: astore_3
    //   155: aload_2
    //   156: monitorexit
    //   157: aload_3
    //   158: athrow
    //   159: aload 6
    //   161: getfield 120	hca:f	I
    //   164: istore 7
    //   166: goto -108 -> 58
    //   169: aload_1
    //   170: aload 6
    //   172: invokevirtual 402	haz:a	(Lhca;)Z
    //   175: pop
    //   176: aload 6
    //   178: ifnull -52 -> 126
    //   181: iload 5
    //   183: iload 7
    //   185: if_icmpne -59 -> 126
    //   188: ldc 134
    //   190: iconst_4
    //   191: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   194: ifeq +40 -> 234
    //   197: aload 6
    //   199: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   202: astore 81
    //   204: new 148	java/lang/StringBuilder
    //   207: dup
    //   208: bipush 18
    //   210: aload 81
    //   212: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   215: invokevirtual 152	java/lang/String:length	()I
    //   218: iadd
    //   219: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   222: ldc_w 404
    //   225: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload 81
    //   230: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_1
    //   235: getfield 407	haz:b	Landroid/content/SyncResult;
    //   238: astore 17
    //   240: aload 6
    //   242: getfield 411	hca:i	Lhcl;
    //   245: astore 18
    //   247: aload 18
    //   249: monitorenter
    //   250: aload 6
    //   252: getfield 414	hca:a	Z
    //   255: ifne +119 -> 374
    //   258: aload 18
    //   260: monitorexit
    //   261: ldc 134
    //   263: iconst_4
    //   264: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   267: ifeq +42 -> 309
    //   270: aload_1
    //   271: getfield 407	haz:b	Landroid/content/SyncResult;
    //   274: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   277: astore 33
    //   279: new 148	java/lang/StringBuilder
    //   282: dup
    //   283: bipush 24
    //   285: aload 33
    //   287: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   290: invokevirtual 152	java/lang/String:length	()I
    //   293: iadd
    //   294: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   297: ldc_w 416
    //   300: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: aload 33
    //   305: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload_1
    //   310: aconst_null
    //   311: invokevirtual 402	haz:a	(Lhca;)Z
    //   314: pop
    //   315: aload_1
    //   316: getfield 407	haz:b	Landroid/content/SyncResult;
    //   319: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   322: getfield 428	android/content/SyncStats:numIoExceptions	J
    //   325: lconst_0
    //   326: lcmp
    //   327: ifgt +30 -> 357
    //   330: aload_1
    //   331: getfield 407	haz:b	Landroid/content/SyncResult;
    //   334: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   337: getfield 431	android/content/SyncStats:numAuthExceptions	J
    //   340: lconst_0
    //   341: lcmp
    //   342: ifgt +15 -> 357
    //   345: aload_1
    //   346: getfield 407	haz:b	Landroid/content/SyncResult;
    //   349: getfield 434	android/content/SyncResult:delayUntil	J
    //   352: lconst_0
    //   353: lcmp
    //   354: ifle -312 -> 42
    //   357: aload_1
    //   358: invokevirtual 436	haz:a	()V
    //   361: goto -235 -> 126
    //   364: astore 4
    //   366: aload_0
    //   367: aconst_null
    //   368: putfield 108	hau:f	Lhaz;
    //   371: aload 4
    //   373: athrow
    //   374: aload 18
    //   376: monitorexit
    //   377: aload 6
    //   379: getfield 438	hca:d	Landroid/content/Context;
    //   382: ldc_w 440
    //   385: invokestatic 442	mbb:b	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   388: checkcast 440	hcq
    //   391: astore 20
    //   393: aload 6
    //   395: invokevirtual 446	java/lang/Object:getClass	()Ljava/lang/Class;
    //   398: invokevirtual 452	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   401: invokestatic 293	iuh:a	(Ljava/lang/String;)I
    //   404: istore 21
    //   406: ldc_w 454
    //   409: iconst_4
    //   410: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   413: ifeq +58 -> 471
    //   416: aload 6
    //   418: getfield 456	hca:h	Ljava/lang/String;
    //   421: astore 78
    //   423: aload 6
    //   425: getfield 120	hca:f	I
    //   428: istore 79
    //   430: new 148	java/lang/StringBuilder
    //   433: dup
    //   434: bipush 40
    //   436: aload 78
    //   438: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   441: invokevirtual 152	java/lang/String:length	()I
    //   444: iadd
    //   445: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   448: ldc_w 458
    //   451: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: aload 78
    //   456: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: ldc_w 460
    //   462: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: iload 79
    //   467: invokevirtual 193	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload 6
    //   473: iconst_1
    //   474: invokevirtual 347	hca:a	(I)V
    //   477: ldc_w 454
    //   480: iconst_4
    //   481: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   484: ifeq +34 -> 518
    //   487: aload 6
    //   489: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   492: getfield 466	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   495: lstore 75
    //   497: new 148	java/lang/StringBuilder
    //   500: dup
    //   501: bipush 47
    //   503: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   506: ldc_w 468
    //   509: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: lload 75
    //   514: invokevirtual 471	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   517: pop
    //   518: aload 20
    //   520: ifnull +20 -> 540
    //   523: aload 20
    //   525: aload 6
    //   527: getfield 120	hca:f	I
    //   530: aload 6
    //   532: invokevirtual 473	hca:a	()Ljava/lang/String;
    //   535: invokeinterface 476 3 0
    //   540: aload 17
    //   542: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   545: astore 40
    //   547: aload 6
    //   549: aload 40
    //   551: invokevirtual 479	hca:a	(Landroid/content/SyncStats;)Z
    //   554: ifeq +356 -> 910
    //   557: aload 6
    //   559: getfield 438	hca:d	Landroid/content/Context;
    //   562: ldc_w 481
    //   565: invokestatic 40	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   568: checkcast 481	hba
    //   571: astore 47
    //   573: ldc_w 454
    //   576: iconst_4
    //   577: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   580: ifeq +61 -> 641
    //   583: aload 6
    //   585: getfield 456	hca:h	Ljava/lang/String;
    //   588: astore 71
    //   590: aload 6
    //   592: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   595: getfield 466	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   598: lstore 72
    //   600: new 148	java/lang/StringBuilder
    //   603: dup
    //   604: bipush 38
    //   606: aload 71
    //   608: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   611: invokevirtual 152	java/lang/String:length	()I
    //   614: iadd
    //   615: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   618: ldc_w 483
    //   621: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   624: aload 71
    //   626: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: ldc_w 485
    //   632: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: lload 72
    //   637: invokevirtual 471	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   640: pop
    //   641: aload 6
    //   643: getfield 488	hca:c	Lhcc;
    //   646: invokeinterface 491 1 0
    //   651: aload 6
    //   653: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   656: getfield 494	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadReason	I
    //   659: bipush 10
    //   661: if_icmpne +1040 -> 1701
    //   664: aload 47
    //   666: aload 6
    //   668: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   671: getfield 322	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadAccountId	I
    //   674: invokevirtual 496	hba:c	(I)Lgjb;
    //   677: ldc_w 498
    //   680: invokeinterface 501 2 0
    //   685: ifeq +433 -> 1118
    //   688: goto +1013 -> 1701
    //   691: iload 48
    //   693: ifeq +431 -> 1124
    //   696: aload 6
    //   698: getfield 488	hca:c	Lhcc;
    //   701: invokeinterface 503 1 0
    //   706: ifeq +418 -> 1124
    //   709: aload 6
    //   711: getfield 488	hca:c	Lhcc;
    //   714: invokeinterface 506 1 0
    //   719: invokevirtual 509	iuk:a	()Z
    //   722: ifeq +402 -> 1124
    //   725: iconst_1
    //   726: istore 49
    //   728: aload 6
    //   730: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   733: getfield 322	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadAccountId	I
    //   736: istore 50
    //   738: aload 6
    //   740: getfield 513	hca:k	Lhbz;
    //   743: iload 50
    //   745: invokeinterface 517 2 0
    //   750: ifeq +380 -> 1130
    //   753: getstatic 522	iun:a	Liun;
    //   756: astore 51
    //   758: aload 51
    //   760: getstatic 524	iun:d	Liun;
    //   763: if_acmpeq +950 -> 1713
    //   766: iconst_1
    //   767: istore 52
    //   769: iload 48
    //   771: ifne +14 -> 785
    //   774: aload 6
    //   776: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   779: getfield 527	com/google/android/libraries/social/autobackup/MediaRecordEntry:mAllowFullRes	Z
    //   782: ifeq +937 -> 1719
    //   785: iload 52
    //   787: ifne +920 -> 1707
    //   790: aload 6
    //   792: getfield 488	hca:c	Lhcc;
    //   795: invokeinterface 503 1 0
    //   800: ifeq +919 -> 1719
    //   803: iload 49
    //   805: ifne +914 -> 1719
    //   808: goto +899 -> 1707
    //   811: aload 6
    //   813: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   816: getfield 530	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   819: lconst_0
    //   820: lcmp
    //   821: ifle +904 -> 1725
    //   824: iconst_1
    //   825: istore 54
    //   827: iload 54
    //   829: ifne +14 -> 843
    //   832: aload 6
    //   834: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   837: invokestatic 536	java/lang/System:currentTimeMillis	()J
    //   840: putfield 539	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTime	J
    //   843: aload 40
    //   845: getfield 428	android/content/SyncStats:numIoExceptions	J
    //   848: lstore 55
    //   850: aload 6
    //   852: aload 6
    //   854: aload 17
    //   856: iload 53
    //   858: aload 51
    //   860: invokevirtual 542	hca:a	(Lhaq;Landroid/content/SyncResult;ZLiun;)V
    //   863: aload 6
    //   865: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   868: invokestatic 545	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   871: ifne +267 -> 1138
    //   874: aload 40
    //   876: getfield 428	android/content/SyncStats:numIoExceptions	J
    //   879: lload 55
    //   881: lcmp
    //   882: ifle +849 -> 1731
    //   885: iconst_1
    //   886: istore 68
    //   888: aload 6
    //   890: iload 68
    //   892: invokevirtual 548	hca:a	(Z)Z
    //   895: ifeq +15 -> 910
    //   898: aload 6
    //   900: invokestatic 536	java/lang/System:currentTimeMillis	()J
    //   903: ldc2_w 549
    //   906: invokevirtual 553	hca:a	(JJ)J
    //   909: pop2
    //   910: ldc_w 454
    //   913: iconst_4
    //   914: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   917: ifeq +58 -> 975
    //   920: aload 6
    //   922: getfield 456	hca:h	Ljava/lang/String;
    //   925: astore 44
    //   927: aload 6
    //   929: getfield 120	hca:f	I
    //   932: istore 45
    //   934: new 148	java/lang/StringBuilder
    //   937: dup
    //   938: bipush 39
    //   940: aload 44
    //   942: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   945: invokevirtual 152	java/lang/String:length	()I
    //   948: iadd
    //   949: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   952: ldc_w 555
    //   955: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: aload 44
    //   960: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: ldc_w 460
    //   966: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: iload 45
    //   971: invokevirtual 193	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   974: pop
    //   975: aload 6
    //   977: getfield 557	hca:b	Lhci;
    //   980: invokevirtual 357	hci:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   983: astore 41
    //   985: getstatic 360	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	Liao;
    //   988: aload 41
    //   990: aload 6
    //   992: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   995: invokevirtual 560	iao:a	(Landroid/database/sqlite/SQLiteDatabase;Lial;)J
    //   998: pop2
    //   999: aload 6
    //   1001: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1004: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1007: iconst_4
    //   1008: if_icmpeq +16 -> 1024
    //   1011: aload 6
    //   1013: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1016: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1019: bipush 11
    //   1021: if_icmpne +8 -> 1029
    //   1024: aload 6
    //   1026: invokevirtual 565	hca:e	()V
    //   1029: aload 20
    //   1031: ifnull +20 -> 1051
    //   1034: aload 20
    //   1036: aload 6
    //   1038: getfield 120	hca:f	I
    //   1041: aload 6
    //   1043: invokevirtual 473	hca:a	()Ljava/lang/String;
    //   1046: invokeinterface 567 3 0
    //   1051: aload 6
    //   1053: getfield 438	hca:d	Landroid/content/Context;
    //   1056: iload 21
    //   1058: ldc_w 569
    //   1061: invokestatic 572	iuh:a	(Landroid/content/Context;ILjava/lang/String;)V
    //   1064: goto -803 -> 261
    //   1067: astore 14
    //   1069: aload_1
    //   1070: getfield 407	haz:b	Landroid/content/SyncResult;
    //   1073: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1076: astore 15
    //   1078: aload 15
    //   1080: lconst_1
    //   1081: aload 15
    //   1083: getfield 428	android/content/SyncStats:numIoExceptions	J
    //   1086: ladd
    //   1087: putfield 428	android/content/SyncStats:numIoExceptions	J
    //   1090: aload_1
    //   1091: aconst_null
    //   1092: invokevirtual 402	haz:a	(Lhca;)Z
    //   1095: pop
    //   1096: goto -781 -> 315
    //   1099: astore 19
    //   1101: aload 18
    //   1103: monitorexit
    //   1104: aload 19
    //   1106: athrow
    //   1107: astore 12
    //   1109: aload_1
    //   1110: aconst_null
    //   1111: invokevirtual 402	haz:a	(Lhca;)Z
    //   1114: pop
    //   1115: aload 12
    //   1117: athrow
    //   1118: iconst_0
    //   1119: istore 48
    //   1121: goto -430 -> 691
    //   1124: iconst_0
    //   1125: istore 49
    //   1127: goto -399 -> 728
    //   1130: getstatic 524	iun:d	Liun;
    //   1133: astore 51
    //   1135: goto -377 -> 758
    //   1138: aload 6
    //   1140: iconst_4
    //   1141: ldc2_w 549
    //   1144: aconst_null
    //   1145: invokevirtual 575	hca:a	(IJLjava/lang/Throwable;)V
    //   1148: aload 17
    //   1150: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1153: astore 57
    //   1155: aload 57
    //   1157: lconst_1
    //   1158: aload 57
    //   1160: getfield 578	android/content/SyncStats:numEntries	J
    //   1163: ladd
    //   1164: putfield 578	android/content/SyncStats:numEntries	J
    //   1167: aload 17
    //   1169: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1172: astore 58
    //   1174: aload 58
    //   1176: lconst_1
    //   1177: aload 58
    //   1179: getfield 581	android/content/SyncStats:numInserts	J
    //   1182: ladd
    //   1183: putfield 581	android/content/SyncStats:numInserts	J
    //   1186: aload 6
    //   1188: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1191: getfield 322	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadAccountId	I
    //   1194: istore 59
    //   1196: iload 59
    //   1198: iconst_m1
    //   1199: if_icmpne +334 -> 1533
    //   1202: aload 6
    //   1204: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1207: getfield 539	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTime	J
    //   1210: lconst_0
    //   1211: lcmp
    //   1212: ifne +14 -> 1226
    //   1215: aload 6
    //   1217: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1220: invokestatic 536	java/lang/System:currentTimeMillis	()J
    //   1223: putfield 539	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTime	J
    //   1226: aload 6
    //   1228: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1231: getfield 584	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadFinishTime	J
    //   1234: lconst_0
    //   1235: lcmp
    //   1236: ifne +14 -> 1250
    //   1239: aload 6
    //   1241: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1244: invokestatic 536	java/lang/System:currentTimeMillis	()J
    //   1247: putfield 584	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadFinishTime	J
    //   1250: ldc_w 454
    //   1253: iconst_4
    //   1254: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1257: ifeq -347 -> 910
    //   1260: aload 6
    //   1262: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1265: getfield 466	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1268: lstore 65
    //   1270: new 148	java/lang/StringBuilder
    //   1273: dup
    //   1274: bipush 47
    //   1276: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   1279: ldc_w 586
    //   1282: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1285: lload 65
    //   1287: invokevirtual 471	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1290: pop
    //   1291: goto -381 -> 910
    //   1294: astore 26
    //   1296: ldc_w 454
    //   1299: iconst_4
    //   1300: invokestatic 140	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1303: ifeq +88 -> 1391
    //   1306: aload 6
    //   1308: getfield 456	hca:h	Ljava/lang/String;
    //   1311: astore 35
    //   1313: aload 26
    //   1315: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1318: astore 36
    //   1320: aload 6
    //   1322: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1325: getfield 466	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1328: lstore 37
    //   1330: new 148	java/lang/StringBuilder
    //   1333: dup
    //   1334: bipush 44
    //   1336: aload 35
    //   1338: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1341: invokevirtual 152	java/lang/String:length	()I
    //   1344: iadd
    //   1345: aload 36
    //   1347: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1350: invokevirtual 152	java/lang/String:length	()I
    //   1353: iadd
    //   1354: invokespecial 154	java/lang/StringBuilder:<init>	(I)V
    //   1357: ldc_w 588
    //   1360: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1363: aload 35
    //   1365: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1368: ldc_w 590
    //   1371: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1374: aload 36
    //   1376: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1379: ldc_w 592
    //   1382: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1385: lload 37
    //   1387: invokevirtual 471	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1390: pop
    //   1391: aload 17
    //   1393: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1396: astore 27
    //   1398: aload 27
    //   1400: lconst_1
    //   1401: aload 27
    //   1403: getfield 428	android/content/SyncStats:numIoExceptions	J
    //   1406: ladd
    //   1407: putfield 428	android/content/SyncStats:numIoExceptions	J
    //   1410: aload 17
    //   1412: getfield 422	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1415: astore 28
    //   1417: aload 28
    //   1419: lconst_1
    //   1420: aload 28
    //   1422: getfield 595	android/content/SyncStats:numSkippedEntries	J
    //   1425: ladd
    //   1426: putfield 595	android/content/SyncStats:numSkippedEntries	J
    //   1429: aload 6
    //   1431: bipush 11
    //   1433: ldc2_w 549
    //   1436: aload 26
    //   1438: invokevirtual 575	hca:a	(IJLjava/lang/Throwable;)V
    //   1441: aload 6
    //   1443: getfield 557	hca:b	Lhci;
    //   1446: invokevirtual 357	hci:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   1449: astore 29
    //   1451: getstatic 360	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	Liao;
    //   1454: aload 29
    //   1456: aload 6
    //   1458: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1461: invokevirtual 560	iao:a	(Landroid/database/sqlite/SQLiteDatabase;Lial;)J
    //   1464: pop2
    //   1465: aload 6
    //   1467: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1470: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1473: iconst_4
    //   1474: if_icmpeq +16 -> 1490
    //   1477: aload 6
    //   1479: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1482: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1485: bipush 11
    //   1487: if_icmpne +8 -> 1495
    //   1490: aload 6
    //   1492: invokevirtual 565	hca:e	()V
    //   1495: aload 20
    //   1497: ifnull +20 -> 1517
    //   1500: aload 20
    //   1502: aload 6
    //   1504: getfield 120	hca:f	I
    //   1507: aload 6
    //   1509: invokevirtual 473	hca:a	()Ljava/lang/String;
    //   1512: invokeinterface 567 3 0
    //   1517: aload 6
    //   1519: getfield 438	hca:d	Landroid/content/Context;
    //   1522: iload 21
    //   1524: ldc_w 569
    //   1527: invokestatic 572	iuh:a	(Landroid/content/Context;ILjava/lang/String;)V
    //   1530: goto -1269 -> 261
    //   1533: aload 6
    //   1535: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1538: getfield 598	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadId	J
    //   1541: lstore 60
    //   1543: aload 6
    //   1545: getfield 601	hca:j	Lgiz;
    //   1548: iload 59
    //   1550: invokeinterface 165 2 0
    //   1555: ldc_w 383
    //   1558: invokeinterface 172 2 0
    //   1563: astore 62
    //   1565: aload 6
    //   1567: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1570: getfield 604	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadUrl	Ljava/lang/String;
    //   1573: astore 63
    //   1575: aload 6
    //   1577: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1580: getfield 607	com/google/android/libraries/social/autobackup/MediaRecordEntry:mFingerprint	Ljava/lang/String;
    //   1583: astore 64
    //   1585: aload 6
    //   1587: getfield 438	hca:d	Landroid/content/Context;
    //   1590: invokestatic 47	hby:a	(Landroid/content/Context;)Lhby;
    //   1593: lload 60
    //   1595: aload 62
    //   1597: aload 63
    //   1599: aload 64
    //   1601: invokevirtual 610	hby:a	(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1604: goto -402 -> 1202
    //   1607: astore 22
    //   1609: aload 6
    //   1611: getfield 557	hca:b	Lhci;
    //   1614: invokevirtual 357	hci:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   1617: astore 23
    //   1619: getstatic 360	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	Liao;
    //   1622: aload 23
    //   1624: aload 6
    //   1626: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1629: invokevirtual 560	iao:a	(Landroid/database/sqlite/SQLiteDatabase;Lial;)J
    //   1632: pop2
    //   1633: aload 6
    //   1635: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1638: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1641: iconst_4
    //   1642: if_icmpeq +16 -> 1658
    //   1645: aload 6
    //   1647: getfield 463	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1650: getfield 563	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTaskState	I
    //   1653: bipush 11
    //   1655: if_icmpne +8 -> 1663
    //   1658: aload 6
    //   1660: invokevirtual 565	hca:e	()V
    //   1663: aload 20
    //   1665: ifnull +20 -> 1685
    //   1668: aload 20
    //   1670: aload 6
    //   1672: getfield 120	hca:f	I
    //   1675: aload 6
    //   1677: invokevirtual 473	hca:a	()Ljava/lang/String;
    //   1680: invokeinterface 567 3 0
    //   1685: aload 6
    //   1687: getfield 438	hca:d	Landroid/content/Context;
    //   1690: iload 21
    //   1692: ldc_w 569
    //   1695: invokestatic 572	iuh:a	(Landroid/content/Context;ILjava/lang/String;)V
    //   1698: aload 22
    //   1700: athrow
    //   1701: iconst_1
    //   1702: istore 48
    //   1704: goto -1013 -> 691
    //   1707: iconst_1
    //   1708: istore 53
    //   1710: goto -899 -> 811
    //   1713: iconst_0
    //   1714: istore 52
    //   1716: goto -947 -> 769
    //   1719: iconst_0
    //   1720: istore 53
    //   1722: goto -911 -> 811
    //   1725: iconst_0
    //   1726: istore 54
    //   1728: goto -901 -> 827
    //   1731: iconst_0
    //   1732: istore 68
    //   1734: goto -846 -> 888
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1737	0	this	hau
    //   0	1737	1	paramhaz	haz
    //   24	132	2	localHashSet	HashSet
    //   154	4	3	localObject1	Object
    //   364	8	4	localObject2	Object
    //   40	146	5	i	int
    //   48	1638	6	localhca	hca
    //   56	130	7	j	int
    //   94	27	9	str1	String
    //   1107	9	12	localObject3	Object
    //   1067	1	14	localThrowable1	java.lang.Throwable
    //   1076	6	15	localSyncStats1	android.content.SyncStats
    //   238	1173	17	localSyncResult	android.content.SyncResult
    //   1099	6	19	localObject4	Object
    //   391	1278	20	localhcq	hcq
    //   404	1287	21	k	int
    //   1607	92	22	localObject5	Object
    //   1617	6	23	localSQLiteDatabase1	SQLiteDatabase
    //   1294	143	26	localThrowable2	java.lang.Throwable
    //   1396	6	27	localSyncStats2	android.content.SyncStats
    //   1415	6	28	localSyncStats3	android.content.SyncStats
    //   1449	6	29	localSQLiteDatabase2	SQLiteDatabase
    //   277	27	33	str2	String
    //   1311	53	35	str3	String
    //   1318	57	36	str4	String
    //   1328	58	37	l1	long
    //   545	330	40	localSyncStats4	android.content.SyncStats
    //   983	6	41	localSQLiteDatabase3	SQLiteDatabase
    //   925	34	44	str5	String
    //   932	38	45	m	int
    //   571	94	47	localhba	hba
    //   691	1012	48	n	int
    //   726	400	49	i1	int
    //   736	8	50	i2	int
    //   756	378	51	localiun	iun
    //   767	948	52	i3	int
    //   856	865	53	bool1	boolean
    //   825	902	54	i4	int
    //   848	32	55	l2	long
    //   1153	6	57	localSyncStats5	android.content.SyncStats
    //   1172	6	58	localSyncStats6	android.content.SyncStats
    //   1194	355	59	i5	int
    //   1541	53	60	l3	long
    //   1563	33	62	str6	String
    //   1573	25	63	str7	String
    //   1583	17	64	str8	String
    //   1268	18	65	l4	long
    //   886	847	68	bool2	boolean
    //   588	37	71	str9	String
    //   598	38	72	l5	long
    //   495	18	75	l6	long
    //   421	34	78	str10	String
    //   428	38	79	i6	int
    //   202	27	81	str11	String
    // Exception table:
    //   from	to	target	type
    //   27	36	154	finally
    //   155	157	154	finally
    //   36	42	364	finally
    //   42	50	364	finally
    //   63	80	364	finally
    //   80	126	364	finally
    //   126	148	364	finally
    //   159	166	364	finally
    //   169	176	364	finally
    //   309	315	364	finally
    //   315	357	364	finally
    //   357	361	364	finally
    //   1090	1096	364	finally
    //   1109	1118	364	finally
    //   188	234	1067	java/lang/Throwable
    //   234	250	1067	java/lang/Throwable
    //   261	309	1067	java/lang/Throwable
    //   377	406	1067	java/lang/Throwable
    //   975	1024	1067	java/lang/Throwable
    //   1024	1029	1067	java/lang/Throwable
    //   1034	1051	1067	java/lang/Throwable
    //   1051	1064	1067	java/lang/Throwable
    //   1104	1107	1067	java/lang/Throwable
    //   1441	1490	1067	java/lang/Throwable
    //   1490	1495	1067	java/lang/Throwable
    //   1500	1517	1067	java/lang/Throwable
    //   1517	1530	1067	java/lang/Throwable
    //   1609	1658	1067	java/lang/Throwable
    //   1658	1663	1067	java/lang/Throwable
    //   1668	1685	1067	java/lang/Throwable
    //   1685	1701	1067	java/lang/Throwable
    //   250	261	1099	finally
    //   374	377	1099	finally
    //   1101	1104	1099	finally
    //   188	234	1107	finally
    //   234	250	1107	finally
    //   261	309	1107	finally
    //   377	406	1107	finally
    //   975	1024	1107	finally
    //   1024	1029	1107	finally
    //   1034	1051	1107	finally
    //   1051	1064	1107	finally
    //   1069	1090	1107	finally
    //   1104	1107	1107	finally
    //   1441	1490	1107	finally
    //   1490	1495	1107	finally
    //   1500	1517	1107	finally
    //   1517	1530	1107	finally
    //   1609	1658	1107	finally
    //   1658	1663	1107	finally
    //   1668	1685	1107	finally
    //   1685	1701	1107	finally
    //   406	471	1294	java/lang/Throwable
    //   471	518	1294	java/lang/Throwable
    //   523	540	1294	java/lang/Throwable
    //   540	641	1294	java/lang/Throwable
    //   641	688	1294	java/lang/Throwable
    //   696	725	1294	java/lang/Throwable
    //   728	758	1294	java/lang/Throwable
    //   758	766	1294	java/lang/Throwable
    //   774	785	1294	java/lang/Throwable
    //   790	803	1294	java/lang/Throwable
    //   811	824	1294	java/lang/Throwable
    //   832	843	1294	java/lang/Throwable
    //   843	885	1294	java/lang/Throwable
    //   888	910	1294	java/lang/Throwable
    //   910	975	1294	java/lang/Throwable
    //   1130	1135	1294	java/lang/Throwable
    //   1138	1196	1294	java/lang/Throwable
    //   1202	1226	1294	java/lang/Throwable
    //   1226	1250	1294	java/lang/Throwable
    //   1250	1291	1294	java/lang/Throwable
    //   1533	1604	1294	java/lang/Throwable
    //   406	471	1607	finally
    //   471	518	1607	finally
    //   523	540	1607	finally
    //   540	641	1607	finally
    //   641	688	1607	finally
    //   696	725	1607	finally
    //   728	758	1607	finally
    //   758	766	1607	finally
    //   774	785	1607	finally
    //   790	803	1607	finally
    //   811	824	1607	finally
    //   832	843	1607	finally
    //   843	885	1607	finally
    //   888	910	1607	finally
    //   910	975	1607	finally
    //   1130	1135	1607	finally
    //   1138	1196	1607	finally
    //   1202	1226	1607	finally
    //   1226	1250	1607	finally
    //   1250	1291	1607	finally
    //   1296	1391	1607	finally
    //   1391	1441	1607	finally
    //   1533	1604	1607	finally
  }
  
  final boolean b(int paramInt)
  {
    synchronized (this.b)
    {
      boolean bool = this.b.contains(Integer.valueOf(paramInt));
      return bool;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hau
 * JD-Core Version:    0.7.0.1
 */