import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SyncStats;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupEnvironment;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.util.Collections;
import java.util.Map;

final class hca
  implements haq
{
  volatile boolean a = true;
  final hci b;
  final hcc c;
  final Context d;
  final MediaRecordEntry e;
  final int f;
  final int g;
  final String h;
  final hcl i;
  final giz j;
  final hbz k;
  private final ixf l;
  private hao m;
  private final AutoBackupEnvironment n;
  private final hal o;
  private final hby p;
  
  protected hca(Context paramContext, MediaRecordEntry paramMediaRecordEntry)
  {
    if (paramMediaRecordEntry.mUploadAccountId != -1) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      throw new IllegalArgumentException();
    }
    this.f = paramMediaRecordEntry.mUploadAccountId;
    this.d = paramContext;
    this.i = hcl.a(paramContext);
    this.e = paramMediaRecordEntry;
    this.b = ((hci)mbb.a(paramContext, hci.class));
    this.c = hcd.a(paramContext);
    this.n = ((AutoBackupEnvironment)mbb.a(this.d, AutoBackupEnvironment.class));
    this.l = ((ixf)mbb.a(this.d, ixf.class));
    int i2 = paramMediaRecordEntry.mUploadReason;
    boolean bool = paramMediaRecordEntry.mIsImage;
    int i3 = i2 << 1;
    if (bool) {}
    for (int i4 = 0;; i4 = 1)
    {
      this.g = (i4 | i3);
      this.h = paramMediaRecordEntry.b();
      this.j = ((giz)mbb.a(this.d, giz.class));
      this.o = ((hal)mbb.a(this.d, hal.class));
      this.p = ((hby)mbb.a(this.d, hby.class));
      this.k = ((hbz)mbb.a(this.d, hbz.class));
      return;
    }
  }
  
  private final void a(SyncStats paramSyncStats, int paramInt)
  {
    MediaRecordEntry localMediaRecordEntry = this.e;
    localMediaRecordEntry.mUploadState = 600;
    localMediaRecordEntry.mUploadTaskState = 11;
    localMediaRecordEntry.mUploadStatus = paramInt;
    paramSyncStats.numSkippedEntries = (1L + paramSyncStats.numSkippedEntries);
  }
  
  private final void a(SyncStats paramSyncStats, Throwable paramThrowable)
  {
    paramSyncStats.numIoExceptions = (1L + paramSyncStats.numIoExceptions);
    a(3, 604800000L, paramThrowable);
    b(false);
  }
  
  private final void a(hao paramhao)
  {
    synchronized (this.i)
    {
      this.m = paramhao;
      return;
    }
  }
  
  /* Error */
  private static boolean a(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 158	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   6: aload_1
    //   7: invokevirtual 164	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   10: astore_2
    //   11: aload_2
    //   12: invokevirtual 170	java/io/InputStream:read	()I
    //   15: istore 7
    //   17: iload 7
    //   19: ifge +13 -> 32
    //   22: aload_2
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: invokevirtual 173	java/io/InputStream:close	()V
    //   30: iconst_0
    //   31: ireturn
    //   32: aload_2
    //   33: ifnull +7 -> 40
    //   36: aload_2
    //   37: invokevirtual 173	java/io/InputStream:close	()V
    //   40: iconst_1
    //   41: ireturn
    //   42: astore 5
    //   44: aload_2
    //   45: ifnull -15 -> 30
    //   48: aload_2
    //   49: invokevirtual 173	java/io/InputStream:close	()V
    //   52: iconst_0
    //   53: ireturn
    //   54: astore 6
    //   56: iconst_0
    //   57: ireturn
    //   58: astore_3
    //   59: aload_2
    //   60: ifnull +7 -> 67
    //   63: aload_2
    //   64: invokevirtual 173	java/io/InputStream:close	()V
    //   67: aload_3
    //   68: athrow
    //   69: astore 9
    //   71: iconst_0
    //   72: ireturn
    //   73: astore 8
    //   75: goto -35 -> 40
    //   78: astore 4
    //   80: goto -13 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramContext	Context
    //   0	83	1	paramUri	Uri
    //   1	63	2	localInputStream	java.io.InputStream
    //   58	10	3	localObject	Object
    //   78	1	4	localIOException1	java.io.IOException
    //   42	1	5	localIOException2	java.io.IOException
    //   54	1	6	localIOException3	java.io.IOException
    //   15	3	7	i1	int
    //   73	1	8	localIOException4	java.io.IOException
    //   69	1	9	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	17	42	java/io/IOException
    //   48	52	54	java/io/IOException
    //   2	17	58	finally
    //   26	30	69	java/io/IOException
    //   36	40	73	java/io/IOException
    //   63	67	78	java/io/IOException
  }
  
  private final void b(int paramInt)
  {
    for (int i1 = 1;; i1 = 0) {
      synchronized (this.i)
      {
        if (this.e != null)
        {
          MediaRecordEntry localMediaRecordEntry = this.e;
          if ((localMediaRecordEntry.mUploadTaskState != i1) && (localMediaRecordEntry.mUploadTaskState != 3)) {
            continue;
          }
          if (i1 != 0)
          {
            if (Log.isLoggable("iu.SyncTask", 3))
            {
              long l1 = this.e.id;
              new StringBuilder(37).append("stopCurrentTask: ").append(l1);
            }
            a(paramInt, 604800000L, null);
            this.i.notify();
            if (this.m != null) {
              this.m.a();
            }
          }
        }
        return;
      }
    }
  }
  
  private final void b(int paramInt, long paramLong, Throwable paramThrowable)
  {
    int i1 = 100;
    int i3;
    int i2;
    Context localContext;
    int i4;
    switch (paramInt)
    {
    case 2: 
    case 7: 
    default: 
      return;
    case 1: 
      i3 = i1;
      i2 = 1;
      localContext = this.d;
      i4 = this.e.mUploadAccountId;
      if (i3 == 300) {
        this.o.a(localContext, i4);
      }
      break;
    }
    for (;;)
    {
      MediaRecordEntry localMediaRecordEntry = this.e;
      localMediaRecordEntry.mUploadState = i3;
      localMediaRecordEntry.mUploadStatus = i2;
      SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
      MediaRecordEntry.a.a(localSQLiteDatabase, this.e);
      c(this.e);
      return;
      this.e.mUploadFinishTime = System.currentTimeMillis();
      i3 = 400;
      i2 = 0;
      break;
      i2 = 34;
      i3 = 400;
      break;
      long l4 = System.currentTimeMillis();
      if (a(l4, paramLong) < l4)
      {
        i2 = 40;
        i3 = 300;
        break;
      }
      i3 = 200;
      i2 = 0;
      break;
      long l3 = System.currentTimeMillis();
      if (a(l3, paramLong) < l3)
      {
        i2 = 40;
        i3 = 300;
        break;
      }
      i3 = i1;
      i2 = 2;
      break;
      long l2 = System.currentTimeMillis();
      if (a(l2, paramLong) < l2) {
        i1 = 300;
      }
      i3 = i1;
      i2 = 31;
      break;
      long l1 = System.currentTimeMillis();
      if (a(l1, paramLong) < l1) {
        i1 = 300;
      }
      i3 = i1;
      i2 = 30;
      break;
      i3 = 300;
      i2 = 0;
      break;
      i2 = 39;
      i3 = 300;
      break;
      i2 = 38;
      i3 = 300;
      break;
      if (i3 == 400) {
        this.o.b(localContext, i4);
      }
    }
  }
  
  private final void b(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      if (this.l.a()) {
        i1 = 15;
      }
    }
    for (;;)
    {
      a(i1);
      return;
      i1 = 14;
      continue;
      i1 = 13;
    }
  }
  
  static boolean b(MediaRecordEntry paramMediaRecordEntry)
  {
    long l1 = paramMediaRecordEntry.mBytesUploaded;
    return (l1 > 0L) && (l1 == paramMediaRecordEntry.mBytesTotal);
  }
  
  private final void c(int paramInt)
  {
    if (Log.isLoggable("iu.SyncTask", 4))
    {
      String str1 = this.h;
      String str2 = String.valueOf(hbu.a(paramInt));
      new StringBuilder(15 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("REJECT ").append(str1).append(" due to ").append(str2);
    }
    a(paramInt);
    if (this.e.mUploadReason == 40)
    {
      hcl localhcl = this.i;
      int i1 = this.e.mUploadAccountId;
      Message.obtain(localhcl.e, 1, Integer.valueOf(i1)).sendToTarget();
    }
  }
  
  private final void c(MediaRecordEntry paramMediaRecordEntry)
  {
    if (Thread.currentThread().isInterrupted()) {
      return;
    }
    Intent localIntent = new Intent("com.google.android.libraries.social.autobackup.upload_progress");
    localIntent.putExtra("upload_account_id", paramMediaRecordEntry.mUploadAccountId);
    fy.a(this.d).a(localIntent);
  }
  
  private final boolean f()
  {
    int i1;
    if (this.e.mBytesTotal > this.c.g())
    {
      i1 = 1;
      if (this.e.mUploadReason != 20) {
        break label105;
      }
    }
    label98:
    label105:
    for (boolean bool1 = false;; bool1 = this.c.b())
    {
      if (i1 == 0)
      {
        int i2 = this.e.mUploadReason;
        bool2 = false;
        if (i2 == 10) {
          break label98;
        }
        if (!bool1)
        {
          boolean bool3 = this.e.mIsImage;
          bool2 = false;
          if (bool3) {
            break label98;
          }
          boolean bool4 = this.c.c();
          bool2 = false;
          if (!bool4) {
            break label98;
          }
        }
      }
      boolean bool2 = true;
      return bool2;
      i1 = 0;
      break;
    }
  }
  
  private final boolean g()
  {
    return (this.e.mUploadReason == 10) || (this.e.mUploadReason == 20) || (this.c.d());
  }
  
  private final boolean h()
  {
    return (this.e.mUploadReason == 10) || (this.e.mUploadReason == 20) || (this.c.e());
  }
  
  private final boolean i()
  {
    return this.e.mUploadReason != 10;
  }
  
  final long a(long paramLong1, long paramLong2)
  {
    long l1 = this.e.mRetryEndTime;
    if (l1 == 0L)
    {
      l1 = paramLong1 + paramLong2;
      this.e.mRetryEndTime = l1;
    }
    if (Log.isLoggable("iu.SyncTask", 4))
    {
      long l2 = this.e.id;
      new StringBuilder(64).append("+++ RETRY until ").append(l1).append("; task: ").append(l2);
    }
    return l1;
  }
  
  final String a()
  {
    return this.j.a(this.f).b("account_name");
  }
  
  protected final void a(int paramInt)
  {
    int i1 = this.e.mUploadReason;
    String str;
    switch (i1)
    {
    default: 
      throw new IllegalArgumentException(34 + "unknown upload reason: " + i1);
    case 30: 
      str = "instant_upload_state";
    }
    for (;;)
    {
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put(str, Integer.valueOf(paramInt));
      this.d.getContentResolver().update(hbu.b(this.d), localContentValues, null, null);
      if (this.e.mUploadReason == 40)
      {
        hcl localhcl = this.i;
        int i2 = this.e.mUploadAccountId;
        Message.obtain(localhcl.e, 1, Integer.valueOf(i2)).sendToTarget();
      }
      this.i.c();
      return;
      str = "instant_share_state";
      continue;
      str = "upload_all_state";
      continue;
      str = "manual_upload_state";
    }
  }
  
  final void a(int paramInt, long paramLong, Throwable paramThrowable)
  {
    synchronized (this.i)
    {
      this.e.mUploadTaskState = paramInt;
      b(this.e.mUploadTaskState, paramLong, paramThrowable);
      this.i.c();
      return;
    }
  }
  
  public final void a(MediaRecordEntry paramMediaRecordEntry)
  {
    if (paramMediaRecordEntry == this.e) {}
    synchronized (this.i)
    {
      if (this.a)
      {
        if (Log.isLoggable("iu.SyncTask", 2))
        {
          long l1 = paramMediaRecordEntry.id;
          new StringBuilder(46).append("  progress for upload id: ").append(l1);
        }
        if (!this.e.a()) {
          return;
        }
        b(this.e.mUploadTaskState, 604800000L, null);
        this.i.c();
      }
      c(paramMediaRecordEntry);
      return;
    }
  }
  
  /* Error */
  final void a(haq paramhaq, android.content.SyncResult paramSyncResult, boolean paramBoolean, iun paramiun)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   6: invokevirtual 381	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	()Z
    //   9: ifne +6 -> 15
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: iconst_1
    //   17: ldc2_w 139
    //   20: aconst_null
    //   21: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_0
    //   27: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   30: astore 6
    //   32: new 404	ith
    //   35: dup
    //   36: aload_0
    //   37: getfield 56	hca:d	Landroid/content/Context;
    //   40: invokespecial 407	ith:<init>	(Landroid/content/Context;)V
    //   43: astore 7
    //   45: aload_0
    //   46: invokespecial 409	hca:f	()Z
    //   49: ifne +467 -> 516
    //   52: iconst_1
    //   53: istore 8
    //   55: aload 7
    //   57: iload 8
    //   59: putfield 411	ith:b	Z
    //   62: aload 7
    //   64: aload_0
    //   65: invokespecial 413	hca:g	()Z
    //   68: putfield 415	ith:c	Z
    //   71: new 417	itg
    //   74: dup
    //   75: aload 7
    //   77: invokespecial 420	itg:<init>	(Lith;)V
    //   80: astore 9
    //   82: new 203	hao
    //   85: dup
    //   86: aload_0
    //   87: getfield 56	hca:d	Landroid/content/Context;
    //   90: aload_0
    //   91: getfield 54	hca:f	I
    //   94: aload_1
    //   95: aload 4
    //   97: aload 9
    //   99: invokespecial 423	hao:<init>	(Landroid/content/Context;ILhaq;Liun;Litg;)V
    //   102: astore 10
    //   104: iconst_m1
    //   105: aload_0
    //   106: getfield 74	hca:b	Lhci;
    //   109: aload_0
    //   110: getfield 54	hca:f	I
    //   113: invokestatic 428	hbm:c	(Lhci;I)I
    //   116: iadd
    //   117: istore 11
    //   119: aload_0
    //   120: aload 10
    //   122: invokespecial 430	hca:a	(Lhao;)V
    //   125: aload 10
    //   127: aload 6
    //   129: putfield 431	hao:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   132: ldc_w 433
    //   135: iconst_4
    //   136: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   139: ifeq +74 -> 213
    //   142: iload_3
    //   143: ifeq +379 -> 522
    //   146: ldc_w 435
    //   149: astore 64
    //   151: aload 6
    //   153: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   156: astore 65
    //   158: new 187	java/lang/StringBuilder
    //   161: dup
    //   162: bipush 48
    //   164: aload 64
    //   166: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   169: invokevirtual 263	java/lang/String:length	()I
    //   172: iadd
    //   173: aload 65
    //   175: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   178: invokevirtual 263	java/lang/String:length	()I
    //   181: iadd
    //   182: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   185: aload 64
    //   187: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc_w 437
    //   193: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: aload 65
    //   198: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: ldc_w 439
    //   204: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: iload 11
    //   209: invokevirtual 348	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload 6
    //   215: getfield 442	com/google/android/libraries/social/autobackup/MediaRecordEntry:mResumeToken	Ljava/lang/String;
    //   218: astore 67
    //   220: aload 6
    //   222: getfield 92	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadReason	I
    //   225: bipush 10
    //   227: if_icmpeq +1429 -> 1656
    //   230: iconst_1
    //   231: istore 68
    //   233: aload 6
    //   235: getfield 445	com/google/android/libraries/social/autobackup/MediaRecordEntry:mMediaUrl	Ljava/lang/String;
    //   238: invokestatic 451	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   241: astore 69
    //   243: aload 6
    //   245: getfield 454	com/google/android/libraries/social/autobackup/MediaRecordEntry:mMimeType	Ljava/lang/String;
    //   248: ifnonnull +18 -> 266
    //   251: aload 6
    //   253: aload 10
    //   255: getfield 456	hao:a	Landroid/content/Context;
    //   258: aload 69
    //   260: invokestatic 461	efj:c	(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //   263: putfield 454	com/google/android/libraries/social/autobackup/MediaRecordEntry:mMimeType	Ljava/lang/String;
    //   266: aload 10
    //   268: getfield 456	hao:a	Landroid/content/Context;
    //   271: astore 70
    //   273: aload 69
    //   275: invokestatic 466	mfq:b	(Landroid/net/Uri;)Z
    //   278: ifne +252 -> 530
    //   281: aconst_null
    //   282: astore 71
    //   284: aload 67
    //   286: invokestatic 472	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   289: ifeq +259 -> 548
    //   292: aload 10
    //   294: getfield 475	hao:c	Litz;
    //   297: astore 77
    //   299: new 477	iup
    //   302: dup
    //   303: invokespecial 478	iup:<init>	()V
    //   306: astore 78
    //   308: aload 78
    //   310: aload 69
    //   312: putfield 481	iup:a	Landroid/net/Uri;
    //   315: aload 78
    //   317: aload 71
    //   319: putfield 483	iup:b	Ljava/lang/String;
    //   322: aload 78
    //   324: aload 6
    //   326: getfield 454	com/google/android/libraries/social/autobackup/MediaRecordEntry:mMimeType	Ljava/lang/String;
    //   329: putfield 485	iup:c	Ljava/lang/String;
    //   332: aload 78
    //   334: aload 6
    //   336: getfield 488	com/google/android/libraries/social/autobackup/MediaRecordEntry:mAlbumId	Ljava/lang/String;
    //   339: putfield 490	iup:d	Ljava/lang/String;
    //   342: aload 78
    //   344: aload 6
    //   346: getfield 493	com/google/android/libraries/social/autobackup/MediaRecordEntry:mEventId	Ljava/lang/String;
    //   349: putfield 495	iup:e	Ljava/lang/String;
    //   352: aload 78
    //   354: iload_3
    //   355: putfield 497	iup:f	Z
    //   358: aload 78
    //   360: iload 11
    //   362: putfield 498	iup:g	I
    //   365: aload 78
    //   367: iload 68
    //   369: putfield 500	iup:h	Z
    //   372: aload 77
    //   374: aload 78
    //   376: invokevirtual 503	iup:a	()Liuo;
    //   379: invokevirtual 508	itz:a	(Liuo;)Lity;
    //   382: astore 73
    //   384: aload 73
    //   386: getfield 513	ity:a	Liuk;
    //   389: astore 74
    //   391: aload 74
    //   393: ifnull +18 -> 411
    //   396: aload 10
    //   398: getfield 456	hao:a	Landroid/content/Context;
    //   401: aload 10
    //   403: getfield 515	hao:b	I
    //   406: aload 74
    //   408: invokestatic 520	com/google/android/libraries/social/autobackup/AutoBackupProvider:a	(Landroid/content/Context;ILiuk;)V
    //   411: aload 73
    //   413: getfield 521	ity:b	Ljava/lang/String;
    //   416: astore 75
    //   418: aconst_null
    //   419: astore 76
    //   421: aload 75
    //   423: ifnull +13 -> 436
    //   426: aload 73
    //   428: getfield 521	ity:b	Ljava/lang/String;
    //   431: invokestatic 524	iqw:b	(Ljava/lang/String;)Ljava/lang/String;
    //   434: astore 76
    //   436: aload 6
    //   438: aload 73
    //   440: getfield 526	ity:e	J
    //   443: putfield 249	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesTotal	J
    //   446: aload 6
    //   448: aload 73
    //   450: getfield 526	ity:e	J
    //   453: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   456: aload 6
    //   458: aload 73
    //   460: getfield 527	ity:d	Ljava/lang/String;
    //   463: invokestatic 532	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   466: invokevirtual 535	java/lang/Long:longValue	()J
    //   469: putfield 538	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadId	J
    //   472: aload 6
    //   474: aload 76
    //   476: putfield 541	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadUrl	Ljava/lang/String;
    //   479: aload 6
    //   481: aload 73
    //   483: getfield 543	ity:c	J
    //   486: putfield 546	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadTime	J
    //   489: aload 6
    //   491: sipush 400
    //   494: putfield 122	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadState	I
    //   497: aload 6
    //   499: iconst_0
    //   500: putfield 128	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadStatus	I
    //   503: aload_0
    //   504: aconst_null
    //   505: invokespecial 430	hca:a	(Lhao;)V
    //   508: return
    //   509: astore 5
    //   511: aload_0
    //   512: monitorexit
    //   513: aload 5
    //   515: athrow
    //   516: iconst_0
    //   517: istore 8
    //   519: goto -464 -> 55
    //   522: ldc_w 548
    //   525: astore 64
    //   527: goto -376 -> 151
    //   530: aload 70
    //   532: invokevirtual 158	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   535: aload 69
    //   537: ldc_w 550
    //   540: invokestatic 553	mfq:a	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    //   543: astore 71
    //   545: goto -261 -> 284
    //   548: aload 10
    //   550: getfield 475	hao:c	Litz;
    //   553: aload 69
    //   555: aload 71
    //   557: aload 67
    //   559: invokevirtual 556	itz:a	(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lity;
    //   562: astore 72
    //   564: aload 72
    //   566: astore 73
    //   568: goto -184 -> 384
    //   571: astore 60
    //   573: ldc 176
    //   575: iconst_5
    //   576: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   579: ifeq +33 -> 612
    //   582: aload_0
    //   583: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   586: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   589: lstore 61
    //   591: new 187	java/lang/StringBuilder
    //   594: dup
    //   595: bipush 47
    //   597: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   600: ldc_w 558
    //   603: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: lload 61
    //   608: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   611: pop
    //   612: aload_0
    //   613: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   616: aconst_null
    //   617: putfield 442	com/google/android/libraries/social/autobackup/MediaRecordEntry:mResumeToken	Ljava/lang/String;
    //   620: aload_0
    //   621: bipush 6
    //   623: ldc2_w 139
    //   626: aload 60
    //   628: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   631: aload_0
    //   632: aconst_null
    //   633: invokespecial 430	hca:a	(Lhao;)V
    //   636: aload_0
    //   637: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   640: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   643: ifeq +1012 -> 1655
    //   646: aload_0
    //   647: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   650: lconst_0
    //   651: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   654: return
    //   655: astore 48
    //   657: aload 48
    //   659: getfield 561	itp:a	Z
    //   662: ifeq +117 -> 779
    //   665: ldc 176
    //   667: iconst_4
    //   668: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   671: ifeq +63 -> 734
    //   674: aload 48
    //   676: getfield 562	itp:b	Ljava/lang/String;
    //   679: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   682: astore 56
    //   684: aload_0
    //   685: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   688: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   691: lstore 57
    //   693: new 187	java/lang/StringBuilder
    //   696: dup
    //   697: bipush 58
    //   699: aload 56
    //   701: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   704: invokevirtual 263	java/lang/String:length	()I
    //   707: iadd
    //   708: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   711: ldc_w 564
    //   714: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: aload 56
    //   719: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: ldc_w 566
    //   725: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   728: lload 57
    //   730: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   733: pop
    //   734: aload_0
    //   735: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   738: astore 55
    //   740: aload 55
    //   742: sipush 300
    //   745: putfield 122	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadState	I
    //   748: aload 55
    //   750: bipush 33
    //   752: putfield 128	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadStatus	I
    //   755: aload_0
    //   756: aconst_null
    //   757: invokespecial 430	hca:a	(Lhao;)V
    //   760: aload_0
    //   761: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   764: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   767: ifeq +888 -> 1655
    //   770: aload_0
    //   771: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   774: lconst_0
    //   775: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   778: return
    //   779: ldc 176
    //   781: iconst_4
    //   782: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   785: ifeq +59 -> 844
    //   788: aload_0
    //   789: getfield 102	hca:h	Ljava/lang/String;
    //   792: astore 51
    //   794: aload_0
    //   795: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   798: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   801: lstore 52
    //   803: new 187	java/lang/StringBuilder
    //   806: dup
    //   807: bipush 60
    //   809: aload 51
    //   811: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   814: invokevirtual 263	java/lang/String:length	()I
    //   817: iadd
    //   818: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   821: ldc_w 568
    //   824: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   827: aload 51
    //   829: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   832: ldc_w 570
    //   835: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   838: lload 52
    //   840: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   843: pop
    //   844: aload_0
    //   845: invokestatic 229	java/lang/System:currentTimeMillis	()J
    //   848: ldc2_w 571
    //   851: invokevirtual 235	hca:a	(JJ)J
    //   854: pop2
    //   855: aload_0
    //   856: aload_2
    //   857: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   860: aload 48
    //   862: invokespecial 580	hca:a	(Landroid/content/SyncStats;Ljava/lang/Throwable;)V
    //   865: goto -110 -> 755
    //   868: astore 14
    //   870: aload_0
    //   871: aconst_null
    //   872: invokespecial 430	hca:a	(Lhao;)V
    //   875: aload_0
    //   876: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   879: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   882: ifeq +11 -> 893
    //   885: aload_0
    //   886: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   889: lconst_0
    //   890: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   893: aload 14
    //   895: athrow
    //   896: astore 43
    //   898: ldc 176
    //   900: iconst_5
    //   901: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   904: ifeq +33 -> 937
    //   907: aload_0
    //   908: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   911: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   914: lstore 45
    //   916: new 187	java/lang/StringBuilder
    //   919: dup
    //   920: bipush 51
    //   922: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   925: ldc_w 582
    //   928: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   931: lload 45
    //   933: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   936: pop
    //   937: aload_2
    //   938: ldc2_w 583
    //   941: putfield 587	android/content/SyncResult:delayUntil	J
    //   944: aload_2
    //   945: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   948: astore 44
    //   950: aload 44
    //   952: lconst_1
    //   953: aload 44
    //   955: getfield 138	android/content/SyncStats:numIoExceptions	J
    //   958: ladd
    //   959: putfield 138	android/content/SyncStats:numIoExceptions	J
    //   962: aload_0
    //   963: bipush 6
    //   965: ldc2_w 588
    //   968: aload 43
    //   970: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   973: aload_0
    //   974: aconst_null
    //   975: invokespecial 430	hca:a	(Lhao;)V
    //   978: aload_0
    //   979: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   982: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   985: ifeq +670 -> 1655
    //   988: aload_0
    //   989: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   992: lconst_0
    //   993: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   996: return
    //   997: astore 42
    //   999: aload_0
    //   1000: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1003: aload 42
    //   1005: getfield 591	itn:a	Ljava/lang/String;
    //   1008: putfield 442	com/google/android/libraries/social/autobackup/MediaRecordEntry:mResumeToken	Ljava/lang/String;
    //   1011: aload_0
    //   1012: aconst_null
    //   1013: invokespecial 430	hca:a	(Lhao;)V
    //   1016: aload_0
    //   1017: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1020: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1023: ifeq +632 -> 1655
    //   1026: aload_0
    //   1027: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1030: lconst_0
    //   1031: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1034: return
    //   1035: astore 37
    //   1037: ldc 176
    //   1039: iconst_5
    //   1040: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1043: ifeq +33 -> 1076
    //   1046: aload_0
    //   1047: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1050: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1053: lstore 39
    //   1055: new 187	java/lang/StringBuilder
    //   1058: dup
    //   1059: bipush 49
    //   1061: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   1064: ldc_w 593
    //   1067: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1070: lload 39
    //   1072: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1075: pop
    //   1076: aload_0
    //   1077: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1080: aload 37
    //   1082: getfield 594	itt:a	Ljava/lang/String;
    //   1085: putfield 442	com/google/android/libraries/social/autobackup/MediaRecordEntry:mResumeToken	Ljava/lang/String;
    //   1088: aload 37
    //   1090: getfield 595	itt:b	Z
    //   1093: ifne +56 -> 1149
    //   1096: aload_2
    //   1097: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1100: astore 38
    //   1102: aload 38
    //   1104: lconst_1
    //   1105: aload 38
    //   1107: getfield 138	android/content/SyncStats:numIoExceptions	J
    //   1110: ladd
    //   1111: putfield 138	android/content/SyncStats:numIoExceptions	J
    //   1114: aload_0
    //   1115: bipush 6
    //   1117: ldc2_w 139
    //   1120: aload 37
    //   1122: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1125: aload_0
    //   1126: aconst_null
    //   1127: invokespecial 430	hca:a	(Lhao;)V
    //   1130: aload_0
    //   1131: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1134: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1137: ifeq +518 -> 1655
    //   1140: aload_0
    //   1141: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1144: lconst_0
    //   1145: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1148: return
    //   1149: aload_2
    //   1150: ldc2_w 596
    //   1153: putfield 587	android/content/SyncResult:delayUntil	J
    //   1156: goto -42 -> 1114
    //   1159: astore 32
    //   1161: ldc 176
    //   1163: iconst_5
    //   1164: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1167: ifeq +33 -> 1200
    //   1170: aload_0
    //   1171: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1174: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1177: lstore 34
    //   1179: new 187	java/lang/StringBuilder
    //   1182: dup
    //   1183: bipush 46
    //   1185: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   1188: ldc_w 599
    //   1191: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: lload 34
    //   1196: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1199: pop
    //   1200: aload_2
    //   1201: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1204: astore 33
    //   1206: aload 33
    //   1208: lconst_1
    //   1209: aload 33
    //   1211: getfield 602	android/content/SyncStats:numAuthExceptions	J
    //   1214: ladd
    //   1215: putfield 602	android/content/SyncStats:numAuthExceptions	J
    //   1218: aload_0
    //   1219: bipush 9
    //   1221: ldc2_w 139
    //   1224: aload 32
    //   1226: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1229: aload_0
    //   1230: aconst_null
    //   1231: invokespecial 430	hca:a	(Lhao;)V
    //   1234: aload_0
    //   1235: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1238: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1241: ifeq +414 -> 1655
    //   1244: aload_0
    //   1245: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1248: lconst_0
    //   1249: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1252: return
    //   1253: astore 24
    //   1255: invokestatic 603	com/google/android/libraries/social/autobackup/AutoBackupEnvironment:a	()Z
    //   1258: ifeq +94 -> 1352
    //   1261: ldc 176
    //   1263: iconst_5
    //   1264: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1267: ifeq +33 -> 1300
    //   1270: aload_0
    //   1271: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1274: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1277: lstore 29
    //   1279: new 187	java/lang/StringBuilder
    //   1282: dup
    //   1283: bipush 31
    //   1285: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   1288: ldc_w 605
    //   1291: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1294: lload 29
    //   1296: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1299: pop
    //   1300: aload_0
    //   1301: iconst_5
    //   1302: ldc2_w 139
    //   1305: aload 24
    //   1307: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1310: aload_2
    //   1311: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1314: astore 28
    //   1316: aload 28
    //   1318: lconst_1
    //   1319: aload 28
    //   1321: getfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1324: ladd
    //   1325: putfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1328: aload_0
    //   1329: aconst_null
    //   1330: invokespecial 430	hca:a	(Lhao;)V
    //   1333: aload_0
    //   1334: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1337: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1340: ifeq +315 -> 1655
    //   1343: aload_0
    //   1344: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1347: lconst_0
    //   1348: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1351: return
    //   1352: ldc 176
    //   1354: iconst_5
    //   1355: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1358: ifeq +33 -> 1391
    //   1361: aload_0
    //   1362: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1365: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1368: lstore 25
    //   1370: new 187	java/lang/StringBuilder
    //   1373: dup
    //   1374: bipush 49
    //   1376: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   1379: ldc_w 607
    //   1382: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1385: lload 25
    //   1387: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1390: pop
    //   1391: aload_0
    //   1392: bipush 6
    //   1394: ldc2_w 139
    //   1397: aload 24
    //   1399: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1402: goto -74 -> 1328
    //   1405: astore 21
    //   1407: ldc 176
    //   1409: bipush 6
    //   1411: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1414: ifeq +14 -> 1428
    //   1417: ldc 176
    //   1419: ldc_w 609
    //   1422: aload 21
    //   1424: invokestatic 612	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1427: pop
    //   1428: aload_2
    //   1429: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1432: astore 22
    //   1434: aload 22
    //   1436: lconst_1
    //   1437: aload 22
    //   1439: getfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1442: ladd
    //   1443: putfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1446: aload_0
    //   1447: iconst_5
    //   1448: ldc2_w 139
    //   1451: aload 21
    //   1453: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1456: aload_0
    //   1457: aconst_null
    //   1458: invokespecial 430	hca:a	(Lhao;)V
    //   1461: aload_0
    //   1462: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1465: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1468: ifeq +187 -> 1655
    //   1471: aload_0
    //   1472: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1475: lconst_0
    //   1476: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1479: return
    //   1480: astore 16
    //   1482: ldc 176
    //   1484: iconst_4
    //   1485: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1488: ifeq +33 -> 1521
    //   1491: aload_0
    //   1492: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1495: getfield 185	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   1498: lstore 18
    //   1500: new 187	java/lang/StringBuilder
    //   1503: dup
    //   1504: bipush 63
    //   1506: invokespecial 189	java/lang/StringBuilder:<init>	(I)V
    //   1509: ldc_w 614
    //   1512: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1515: lload 18
    //   1517: invokevirtual 198	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1520: pop
    //   1521: aload_2
    //   1522: ldc2_w 583
    //   1525: putfield 587	android/content/SyncResult:delayUntil	J
    //   1528: aload_2
    //   1529: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1532: astore 17
    //   1534: aload 17
    //   1536: lconst_1
    //   1537: aload 17
    //   1539: getfield 138	android/content/SyncStats:numIoExceptions	J
    //   1542: ladd
    //   1543: putfield 138	android/content/SyncStats:numIoExceptions	J
    //   1546: aload_0
    //   1547: bipush 6
    //   1549: ldc2_w 139
    //   1552: aload 16
    //   1554: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1557: aload_0
    //   1558: aconst_null
    //   1559: invokespecial 430	hca:a	(Lhao;)V
    //   1562: aload_0
    //   1563: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1566: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1569: ifeq +86 -> 1655
    //   1572: aload_0
    //   1573: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1576: lconst_0
    //   1577: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1580: return
    //   1581: astore 12
    //   1583: ldc 176
    //   1585: bipush 6
    //   1587: invokestatic 182	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1590: ifeq +14 -> 1604
    //   1593: ldc 176
    //   1595: ldc_w 609
    //   1598: aload 12
    //   1600: invokestatic 612	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1603: pop
    //   1604: aload_2
    //   1605: getfield 578	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   1608: astore 13
    //   1610: aload 13
    //   1612: lconst_1
    //   1613: aload 13
    //   1615: getfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1618: ladd
    //   1619: putfield 134	android/content/SyncStats:numSkippedEntries	J
    //   1622: aload_0
    //   1623: iconst_5
    //   1624: ldc2_w 139
    //   1627: aload 12
    //   1629: invokevirtual 143	hca:a	(IJLjava/lang/Throwable;)V
    //   1632: aload_0
    //   1633: aconst_null
    //   1634: invokespecial 430	hca:a	(Lhao;)V
    //   1637: aload_0
    //   1638: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1641: invokestatic 560	hca:b	(Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;)Z
    //   1644: ifeq +11 -> 1655
    //   1647: aload_0
    //   1648: getfield 65	hca:e	Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   1651: lconst_0
    //   1652: putfield 246	com/google/android/libraries/social/autobackup/MediaRecordEntry:mBytesUploaded	J
    //   1655: return
    //   1656: iconst_0
    //   1657: istore 68
    //   1659: goto -1426 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1662	0	this	hca
    //   0	1662	1	paramhaq	haq
    //   0	1662	2	paramSyncResult	android.content.SyncResult
    //   0	1662	3	paramBoolean	boolean
    //   0	1662	4	paramiun	iun
    //   509	5	5	localObject1	Object
    //   30	468	6	localMediaRecordEntry1	MediaRecordEntry
    //   43	33	7	localith	ith
    //   53	465	8	bool1	boolean
    //   80	18	9	localitg	itg
    //   102	447	10	localhao	hao
    //   117	244	11	i1	int
    //   1581	47	12	localThrowable	Throwable
    //   1608	6	13	localSyncStats1	SyncStats
    //   868	26	14	localObject2	Object
    //   1480	73	16	localito	ito
    //   1532	6	17	localSyncStats2	SyncStats
    //   1498	18	18	l1	long
    //   1405	47	21	localitv	itv
    //   1432	6	22	localSyncStats3	SyncStats
    //   1253	145	24	localitq	itq
    //   1368	18	25	l2	long
    //   1314	6	28	localSyncStats4	SyncStats
    //   1277	18	29	l3	long
    //   1159	66	32	localitu	itu
    //   1204	6	33	localSyncStats5	SyncStats
    //   1177	18	34	l4	long
    //   1035	86	37	localitt	itt
    //   1100	6	38	localSyncStats6	SyncStats
    //   1053	18	39	l5	long
    //   997	7	42	localitn	itn
    //   896	73	43	localits	its
    //   948	6	44	localSyncStats7	SyncStats
    //   914	18	45	l6	long
    //   655	206	48	localitp	itp
    //   792	36	51	str1	String
    //   801	38	52	l7	long
    //   738	11	55	localMediaRecordEntry2	MediaRecordEntry
    //   682	36	56	str2	String
    //   691	38	57	l8	long
    //   571	56	60	localitr	itr
    //   589	18	61	l9	long
    //   149	377	64	str3	String
    //   156	41	65	str4	String
    //   218	340	67	str5	String
    //   231	1427	68	bool2	boolean
    //   241	313	69	localUri	Uri
    //   271	260	70	localContext	Context
    //   282	274	71	str6	String
    //   562	3	72	locality	ity
    //   382	185	73	localObject3	Object
    //   389	18	74	localiuk	iuk
    //   416	6	75	str7	String
    //   419	56	76	str8	String
    //   297	76	77	localitz	itz
    //   306	69	78	localiup	iup
    // Exception table:
    //   from	to	target	type
    //   2	14	509	finally
    //   15	26	509	finally
    //   511	513	509	finally
    //   119	142	571	itr
    //   151	213	571	itr
    //   213	230	571	itr
    //   233	266	571	itr
    //   266	281	571	itr
    //   284	384	571	itr
    //   384	391	571	itr
    //   396	411	571	itr
    //   411	418	571	itr
    //   426	436	571	itr
    //   436	503	571	itr
    //   530	545	571	itr
    //   548	564	571	itr
    //   119	142	655	itp
    //   151	213	655	itp
    //   213	230	655	itp
    //   233	266	655	itp
    //   266	281	655	itp
    //   284	384	655	itp
    //   384	391	655	itp
    //   396	411	655	itp
    //   411	418	655	itp
    //   426	436	655	itp
    //   436	503	655	itp
    //   530	545	655	itp
    //   548	564	655	itp
    //   119	142	868	finally
    //   151	213	868	finally
    //   213	230	868	finally
    //   233	266	868	finally
    //   266	281	868	finally
    //   284	384	868	finally
    //   384	391	868	finally
    //   396	411	868	finally
    //   411	418	868	finally
    //   426	436	868	finally
    //   436	503	868	finally
    //   530	545	868	finally
    //   548	564	868	finally
    //   573	612	868	finally
    //   612	631	868	finally
    //   657	734	868	finally
    //   734	755	868	finally
    //   779	844	868	finally
    //   844	865	868	finally
    //   898	937	868	finally
    //   937	973	868	finally
    //   999	1011	868	finally
    //   1037	1076	868	finally
    //   1076	1114	868	finally
    //   1114	1125	868	finally
    //   1149	1156	868	finally
    //   1161	1200	868	finally
    //   1200	1229	868	finally
    //   1255	1300	868	finally
    //   1300	1328	868	finally
    //   1352	1391	868	finally
    //   1391	1402	868	finally
    //   1407	1428	868	finally
    //   1428	1456	868	finally
    //   1482	1521	868	finally
    //   1521	1557	868	finally
    //   1583	1604	868	finally
    //   1604	1632	868	finally
    //   119	142	896	its
    //   151	213	896	its
    //   213	230	896	its
    //   233	266	896	its
    //   266	281	896	its
    //   284	384	896	its
    //   384	391	896	its
    //   396	411	896	its
    //   411	418	896	its
    //   426	436	896	its
    //   436	503	896	its
    //   530	545	896	its
    //   548	564	896	its
    //   119	142	997	itn
    //   151	213	997	itn
    //   213	230	997	itn
    //   233	266	997	itn
    //   266	281	997	itn
    //   284	384	997	itn
    //   384	391	997	itn
    //   396	411	997	itn
    //   411	418	997	itn
    //   426	436	997	itn
    //   436	503	997	itn
    //   530	545	997	itn
    //   548	564	997	itn
    //   119	142	1035	itt
    //   151	213	1035	itt
    //   213	230	1035	itt
    //   233	266	1035	itt
    //   266	281	1035	itt
    //   284	384	1035	itt
    //   384	391	1035	itt
    //   396	411	1035	itt
    //   411	418	1035	itt
    //   426	436	1035	itt
    //   436	503	1035	itt
    //   530	545	1035	itt
    //   548	564	1035	itt
    //   119	142	1159	itu
    //   151	213	1159	itu
    //   213	230	1159	itu
    //   233	266	1159	itu
    //   266	281	1159	itu
    //   284	384	1159	itu
    //   384	391	1159	itu
    //   396	411	1159	itu
    //   411	418	1159	itu
    //   426	436	1159	itu
    //   436	503	1159	itu
    //   530	545	1159	itu
    //   548	564	1159	itu
    //   119	142	1253	itq
    //   151	213	1253	itq
    //   213	230	1253	itq
    //   233	266	1253	itq
    //   266	281	1253	itq
    //   284	384	1253	itq
    //   384	391	1253	itq
    //   396	411	1253	itq
    //   411	418	1253	itq
    //   426	436	1253	itq
    //   436	503	1253	itq
    //   530	545	1253	itq
    //   548	564	1253	itq
    //   119	142	1405	itv
    //   151	213	1405	itv
    //   213	230	1405	itv
    //   233	266	1405	itv
    //   266	281	1405	itv
    //   284	384	1405	itv
    //   384	391	1405	itv
    //   396	411	1405	itv
    //   411	418	1405	itv
    //   426	436	1405	itv
    //   436	503	1405	itv
    //   530	545	1405	itv
    //   548	564	1405	itv
    //   119	142	1480	ito
    //   151	213	1480	ito
    //   213	230	1480	ito
    //   233	266	1480	ito
    //   266	281	1480	ito
    //   284	384	1480	ito
    //   384	391	1480	ito
    //   396	411	1480	ito
    //   411	418	1480	ito
    //   426	436	1480	ito
    //   436	503	1480	ito
    //   530	545	1480	ito
    //   548	564	1480	ito
    //   119	142	1581	java/lang/Throwable
    //   151	213	1581	java/lang/Throwable
    //   213	230	1581	java/lang/Throwable
    //   233	266	1581	java/lang/Throwable
    //   266	281	1581	java/lang/Throwable
    //   284	384	1581	java/lang/Throwable
    //   384	391	1581	java/lang/Throwable
    //   396	411	1581	java/lang/Throwable
    //   411	418	1581	java/lang/Throwable
    //   426	436	1581	java/lang/Throwable
    //   436	503	1581	java/lang/Throwable
    //   530	545	1581	java/lang/Throwable
    //   548	564	1581	java/lang/Throwable
  }
  
  protected final boolean a(long paramLong)
  {
    boolean bool1 = true;
    synchronized (this.i)
    {
      if ((this.e != null) && (paramLong == this.e.id)) {}
      for (boolean bool2 = bool1; (this.a) && (!bool2); bool2 = false)
      {
        this.a = bool1;
        if (bool2) {
          b(6);
        }
        return bool2;
      }
      bool1 = false;
    }
  }
  
  final boolean a(SyncStats paramSyncStats)
  {
    Uri localUri;
    String str1;
    int i1;
    synchronized (this.i)
    {
      if (!this.a) {
        return false;
      }
      localUri = Uri.parse(this.e.mMediaUrl);
      str1 = localUri.toString();
      i1 = this.e.mUploadReason;
      long l1 = System.currentTimeMillis();
      long l2 = this.e.mRetryEndTime;
      if ((l2 != 0L) && (l1 > l2))
      {
        if (Log.isLoggable("iu.SyncTask", 5))
        {
          String str7 = this.h;
          long l9 = this.e.id;
          new StringBuilder(55 + String.valueOf(str7).length()).append("+++ SKIP task ").append(str7).append("; exceed retry time; ").append(l9);
        }
        a(paramSyncStats, 40);
        return false;
      }
    }
    if ((this.e.mIsImage) && (hbm.a(this.d.getContentResolver(), localUri)))
    {
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        long l8 = this.e.id;
        new StringBuilder(54).append("+++ SKIP record; has google exif; ").append(l8);
      }
      a(paramSyncStats, 37);
      return false;
    }
    if (!a(this.d, localUri))
    {
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        long l7 = this.e.id;
        new StringBuilder(52).append("+++ SKIP record; media removed; ").append(l7);
      }
      a(paramSyncStats, 41);
      return false;
    }
    String str2 = this.e.mFingerprint;
    if (str2 == null)
    {
      str2 = hco.a(this.d).a(str1, false);
      this.e.mFingerprint = str2;
      if (str2 == null)
      {
        if (Log.isLoggable("iu.SyncTask", 4))
        {
          String str6 = this.h;
          long l6 = this.e.id;
          new StringBuilder(64 + String.valueOf(str6).length()).append("+++ QUEUE task ").append(str6).append("; fingerprint not available; ").append(l6);
        }
        a(System.currentTimeMillis(), 604800000L);
        a(paramSyncStats, null);
        return false;
      }
    }
    String str3 = str2;
    int i2 = this.e.mUploadAccountId;
    gjb localgjb = this.j.a(i2);
    boolean bool = localgjb.c("is_plus_page");
    String str4 = localgjb.b("gaia_id");
    int i3;
    if (this.e.mUploadReason == 10)
    {
      i3 = 1;
      if ((bool) || (i3 != 0)) {
        break label612;
      }
      if (DatabaseUtils.longForQuery(this.b.getReadableDatabase(), "SELECT count(*) FROM server_fingerprints WHERE owner_id = ? AND fingerprint = ?", new String[] { str4, str3 }) <= 0L) {
        break label606;
      }
    }
    label606:
    for (int i5 = 1;; i5 = 0)
    {
      if (i5 == 0) {
        break label612;
      }
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        long l5 = this.e.id;
        new StringBuilder(55).append("+++ SKIP record; duplicate upload; ").append(l5);
      }
      MediaRecordEntry localMediaRecordEntry2 = this.e;
      localMediaRecordEntry2.mUploadState = 400;
      localMediaRecordEntry2.mUploadTaskState = 11;
      localMediaRecordEntry2.mUploadStatus = 34;
      return false;
      i3 = 0;
      break;
    }
    label612:
    mbb.a(this.d, hbd.class);
    jrv localjrv = new jrv(this.d, i2, str4, Collections.singletonList(str3), i(), false);
    localjrv.i();
    if (localjrv.n())
    {
      paramSyncStats.numIoExceptions = (1L + paramSyncStats.numIoExceptions);
      return false;
    }
    if (localjrv.a.containsKey(str3))
    {
      long l3 = localjrv.b(str3);
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        long l4 = this.e.id;
        new StringBuilder(55).append("+++ SKIP record; duplicate upload; ").append(l4);
      }
      hby.a(this.d).a(l3, str4, null, str3);
      MediaRecordEntry localMediaRecordEntry1 = this.e;
      localMediaRecordEntry1.mUploadState = 400;
      localMediaRecordEntry1.mUploadTaskState = 11;
      localMediaRecordEntry1.mUploadStatus = 34;
      return false;
    }
    if (!TextUtils.isEmpty(this.e.mEventId)) {}
    for (int i4 = 1;; i4 = 0)
    {
      String str5 = this.e.mAlbumId;
      if ((str5 == null) && (i4 == 0)) {
        this.e.mAlbumId = "instant";
      }
      if ((i1 == 20) && (str5 == null)) {
        this.e.mAlbumId = "instant";
      }
      this.e.mBytesTotal = -1L;
      this.e.mUploadTaskState = 3;
      return true;
    }
  }
  
  final boolean a(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.i)
      {
        switch (this.e.mUploadTaskState)
        {
        case 8: 
        default: 
          if (this.e.mUploadTaskState == 5) {
            break;
          }
          if (Log.isLoggable("iu.SyncTask", 6)) {
            Log.e("iu.SyncTask", "--- STOP wrong state after upload; task: ");
          }
          String str6 = String.valueOf("--- STOP wrong state;  task: ");
          int i1 = this.e.mUploadTaskState;
          localRuntimeException = new RuntimeException(11 + String.valueOf(str6).length() + str6 + i1);
          a(5, 604800000L, localRuntimeException);
          return false;
        case 6: 
          if (Log.isLoggable("iu.SyncTask", 4))
          {
            String str4 = this.h;
            long l4 = this.e.id;
            new StringBuilder(45 + String.valueOf(str4).length()).append("--- QUEUE stalled ").append(str4).append(" task: ").append(l4);
          }
          a(3, 604800000L, null);
          b(paramBoolean);
          return true;
        }
      }
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        String str3 = this.h;
        long l3 = this.e.id;
        new StringBuilder(50 + String.valueOf(str3).length()).append("--- QUEUE unauthorized ").append(str3).append(" task: ").append(l3);
      }
      a(3, 604800000L, null);
      a(10);
      return true;
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        String str2 = this.h;
        long l2 = this.e.id;
        new StringBuilder(52 + String.valueOf(str2).length()).append("--- QUEUE quota exceeded ").append(str2).append(" task: ").append(l2);
      }
      a(3, 604800000L, null);
      a(9);
      return true;
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        String str1 = this.h;
        long l1 = this.e.id;
        new StringBuilder(46 + String.valueOf(str1).length()).append("--- STOP cancelled ").append(str1).append(" task: ").append(l1);
      }
      a(8, 604800000L, null);
      continue;
      if (Log.isLoggable("iu.SyncTask", 4))
      {
        String str5 = this.h;
        long l5 = this.e.id;
        new StringBuilder(43 + String.valueOf(str5).length()).append("--- STOP failed ").append(str5).append(" task: ").append(l5);
      }
      RuntimeException localRuntimeException = null;
    }
  }
  
  protected final boolean b()
  {
    boolean bool = ContentResolver.getSyncAutomatically(new Account(a(), "com.google"), hbu.f(this.d));
    this.n.a(this.d);
    if (Log.isLoggable("iu.SyncTask", 4)) {
      new StringBuilder("-- isAccepted state -- isBackgroundSync: ").append(i()).append(" getMasterSync: ").append(ContentResolver.getMasterSyncAutomatically()).append(" doAutoSync: ").append(bool).append(" isConnected: ").append(this.l.a()).append(" backgroundDataAllowed: ").append(this.n.d).append(" isPlugged: ").append(this.n.a).append(" isSyncOnBattery: ").append(h()).append(" isNetworkMetered: ").append(this.n.b).append(" isMobileNetwork: ").append(this.l.h()).append(" isSyncOnWifiOnly ").append(f()).append(" isRoaming ").append(this.n.c).append(" isSyncOnRoaming ").append(g());
    }
    if (i())
    {
      if (!ContentResolver.getMasterSyncAutomatically())
      {
        if (Log.isLoggable("iu.SyncTask", 3))
        {
          String str7 = String.valueOf(this);
          new StringBuilder(39 + String.valueOf(str7).length()).append("reject ").append(str7).append(" because master auto sync is off");
        }
        c(6);
        return false;
      }
      if (!bool)
      {
        if (Log.isLoggable("iu.SyncTask", 3))
        {
          String str6 = String.valueOf(this);
          new StringBuilder(32 + String.valueOf(str6).length()).append("reject ").append(str6).append(" because auto sync is off");
        }
        c(6);
        return false;
      }
    }
    if (!this.l.a())
    {
      if (Log.isLoggable("iu.SyncTask", 3))
      {
        String str5 = String.valueOf(this);
        new StringBuilder(21 + String.valueOf(str5).length()).append("reject ").append(str5).append(" on no network");
      }
      c(16);
      return false;
    }
    if ((!this.n.d) && (i()))
    {
      if (Log.isLoggable("iu.SyncTask", 3))
      {
        String str4 = String.valueOf(this);
        new StringBuilder(36 + String.valueOf(str4).length()).append("reject ").append(str4).append(" for disabled background data");
      }
      c(8);
      return false;
    }
    if ((!this.n.a) && (!h()))
    {
      if (Log.isLoggable("iu.SyncTask", 3))
      {
        String str3 = String.valueOf(this);
        new StringBuilder(18 + String.valueOf(str3).length()).append("reject ").append(str3).append(" on battery");
      }
      c(4);
      return false;
    }
    if ((this.n.b) || (this.l.h()))
    {
      if (f())
      {
        if (Log.isLoggable("iu.SyncTask", 3))
        {
          String str2 = String.valueOf(this);
          new StringBuilder(31 + String.valueOf(str2).length()).append("reject ").append(str2).append(" for non-wifi connection");
        }
        c(2);
        return false;
      }
      if ((this.n.c) && (!g()))
      {
        if (Log.isLoggable("iu.SyncTask", 3))
        {
          String str1 = String.valueOf(this);
          new StringBuilder(19 + String.valueOf(str1).length()).append("reject ").append(str1).append(" for roaming");
        }
        c(3);
        return false;
      }
    }
    return true;
  }
  
  protected final void c()
  {
    if (Log.isLoggable("iu.SyncTask", 4))
    {
      String str = this.h;
      long l1 = this.e.id;
      new StringBuilder(44 + String.valueOf(str).length()).append("--- CANCEL sync ").append(str).append("; task: ").append(l1);
    }
    synchronized (this.i)
    {
      this.a = false;
      b(7);
      return;
    }
  }
  
  protected final void d()
  {
    if (Log.isLoggable("iu.SyncTask", 4))
    {
      String str = this.h;
      long l1 = this.e.id;
      new StringBuilder(42 + String.valueOf(str).length()).append("--- STOP sync ").append(str).append("; task: ").append(l1);
    }
    synchronized (this.i)
    {
      this.a = false;
      b(6);
      return;
    }
  }
  
  final void e()
  {
    synchronized (this.i)
    {
      if (!this.a) {
        return;
      }
      this.i.c();
      if (this.e.mUploadReason == 40)
      {
        hcl localhcl2 = this.i;
        int i1 = this.e.mUploadAccountId;
        Message.obtain(localhcl2.e, 1, Integer.valueOf(i1)).sendToTarget();
      }
      if (Log.isLoggable("iu.SyncTask", 3))
      {
        long l1 = this.e.id;
        new StringBuilder(34).append("   task done: ").append(l1);
      }
      return;
    }
  }
  
  @SuppressLint({"DefaultLocale"})
  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = getClass().getSimpleName();
    arrayOfObject[1] = this.h;
    arrayOfObject[2] = Long.valueOf(this.e.id);
    arrayOfObject[3] = Integer.valueOf(this.f);
    return String.format("[%s; reason: %s, id: %d, accountId: %d]", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hca
 * JD-Core Version:    0.7.0.1
 */