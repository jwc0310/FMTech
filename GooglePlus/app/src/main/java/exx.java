import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class exx
{
  private static String c = null;
  private static int d = 0;
  Messenger a;
  MessengerCompat b;
  private Context e;
  private Map<String, Object> f = new HashMap();
  private Messenger g;
  private PendingIntent h;
  private int i;
  private int j;
  private long k;
  
  public exx(Context paramContext)
  {
    this.e = paramContext;
  }
  
  public static String a()
  {
    try
    {
      int m = d;
      d = m + 1;
      String str = Integer.toString(m);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static String a(Context paramContext)
  {
    if (c != null) {
      return c;
    }
    Process.myUid();
    PackageManager localPackageManager = paramContext.getPackageManager();
    Iterator localIterator = localPackageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      if (localPackageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", localResolveInfo.serviceInfo.packageName) == 0) {
        try
        {
          ApplicationInfo localApplicationInfo3 = localPackageManager.getApplicationInfo(localResolveInfo.serviceInfo.packageName, 0);
          new StringBuilder("Found ").append(localApplicationInfo3.uid);
          String str3 = localResolveInfo.serviceInfo.packageName;
          c = str3;
          return str3;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException3) {}
      } else {
        new StringBuilder("Possible malicious package ").append(localResolveInfo.serviceInfo.packageName).append(" declares com.google.android.c2dm.intent.REGISTER").append(" without permission");
      }
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      c = localApplicationInfo2.packageName;
      String str2 = c;
      return str2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      try
      {
        ApplicationInfo localApplicationInfo1 = localPackageManager.getApplicationInfo("com.google.android.gsf", 0);
        c = localApplicationInfo1.packageName;
        String str1 = c;
        return str1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2) {}
    }
    return null;
  }
  
  public static String a(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    String str1 = paramIntent.getStringExtra("registration_id");
    if (str1 == null) {
      str1 = paramIntent.getStringExtra("unregistered");
    }
    paramIntent.getLongExtra("Retry-After", 0L);
    if (str1 == null)
    {
      String str2 = paramIntent.getStringExtra("error");
      if (str2 != null) {
        throw new IOException(str2);
      }
      new StringBuilder("Unexpected response from GCM ").append(paramIntent.getExtras());
      new Throwable();
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    return str1;
  }
  
  /* Error */
  private static String a(KeyPair paramKeyPair, String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc 182
    //   2: aload_1
    //   3: invokestatic 188	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   6: ldc 190
    //   8: invokevirtual 196	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   11: astore 4
    //   13: aload_0
    //   14: invokevirtual 202	java/security/KeyPair:getPrivate	()Ljava/security/PrivateKey;
    //   17: astore 7
    //   19: aload 7
    //   21: instanceof 204
    //   24: ifeq +53 -> 77
    //   27: ldc 206
    //   29: astore 8
    //   31: aload 8
    //   33: invokestatic 212	java/security/Signature:getInstance	(Ljava/lang/String;)Ljava/security/Signature;
    //   36: astore 9
    //   38: aload 9
    //   40: aload 7
    //   42: invokevirtual 216	java/security/Signature:initSign	(Ljava/security/PrivateKey;)V
    //   45: aload 9
    //   47: aload 4
    //   49: invokevirtual 220	java/security/Signature:update	([B)V
    //   52: aload 9
    //   54: invokevirtual 224	java/security/Signature:sign	()[B
    //   57: invokestatic 229	exu:a	([B)Ljava/lang/String;
    //   60: astore 10
    //   62: aload 10
    //   64: areturn
    //   65: astore_2
    //   66: ldc 231
    //   68: ldc 233
    //   70: aload_2
    //   71: invokestatic 238	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   74: pop
    //   75: aconst_null
    //   76: areturn
    //   77: ldc 240
    //   79: astore 8
    //   81: goto -50 -> 31
    //   84: astore 5
    //   86: ldc 231
    //   88: ldc 242
    //   90: aload 5
    //   92: invokestatic 238	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   95: pop
    //   96: aconst_null
    //   97: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramKeyPair	KeyPair
    //   0	98	1	paramVarArgs	String[]
    //   65	6	2	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   11	37	4	arrayOfByte	byte[]
    //   84	7	5	localGeneralSecurityException	java.security.GeneralSecurityException
    //   17	24	7	localPrivateKey	java.security.PrivateKey
    //   29	51	8	str1	String
    //   36	17	9	localSignature	java.security.Signature
    //   60	3	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	13	65	java/io/UnsupportedEncodingException
    //   13	27	84	java/security/GeneralSecurityException
    //   31	62	84	java/security/GeneralSecurityException
  }
  
  private final void a(Object paramObject)
  {
    synchronized (getClass())
    {
      Iterator localIterator = this.f.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject2 = this.f.get(str);
        this.f.put(str, paramObject);
        a(localObject2, paramObject);
      }
    }
  }
  
  private static void a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof ConditionVariable)) {
      ((ConditionVariable)paramObject1).open();
    }
    Messenger localMessenger;
    Message localMessage;
    if ((paramObject1 instanceof Messenger))
    {
      localMessenger = (Messenger)paramObject1;
      localMessage = Message.obtain();
      localMessage.obj = paramObject2;
    }
    try
    {
      localMessenger.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      new StringBuilder("Failed to send response ").append(localRemoteException);
    }
  }
  
  private final void a(String paramString, Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject2 = this.f.get(paramString);
      this.f.put(paramString, paramObject);
      a(localObject2, paramObject);
      return;
    }
  }
  
  /* Error */
  private final Intent b(Bundle paramBundle, KeyPair paramKeyPair)
  {
    // Byte code:
    //   0: new 271	android/os/ConditionVariable
    //   3: dup
    //   4: invokespecial 295	android/os/ConditionVariable:<init>	()V
    //   7: astore_3
    //   8: invokestatic 297	exx:a	()Ljava/lang/String;
    //   11: astore 4
    //   13: aload_0
    //   14: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: astore 5
    //   19: aload 5
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield 39	exx:f	Ljava/util/Map;
    //   26: aload 4
    //   28: aload_3
    //   29: invokeinterface 264 3 0
    //   34: pop
    //   35: aload 5
    //   37: monitorexit
    //   38: invokestatic 303	android/os/SystemClock:elapsedRealtime	()J
    //   41: lstore 8
    //   43: aload_0
    //   44: getfield 305	exx:k	J
    //   47: lconst_0
    //   48: lcmp
    //   49: ifeq +66 -> 115
    //   52: lload 8
    //   54: aload_0
    //   55: getfield 305	exx:k	J
    //   58: lcmp
    //   59: ifgt +56 -> 115
    //   62: new 115	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 307
    //   69: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_0
    //   73: getfield 305	exx:k	J
    //   76: lload 8
    //   78: lsub
    //   79: invokevirtual 310	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   82: ldc_w 312
    //   85: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_0
    //   89: getfield 314	exx:j	I
    //   92: invokevirtual 127	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: new 144	java/io/IOException
    //   99: dup
    //   100: ldc_w 316
    //   103: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   106: athrow
    //   107: astore 6
    //   109: aload 5
    //   111: monitorexit
    //   112: aload 6
    //   114: athrow
    //   115: aload_0
    //   116: getfield 318	exx:g	Landroid/os/Messenger;
    //   119: ifnonnull +33 -> 152
    //   122: aload_0
    //   123: getfield 41	exx:e	Landroid/content/Context;
    //   126: invokestatic 320	exx:a	(Landroid/content/Context;)Ljava/lang/String;
    //   129: pop
    //   130: aload_0
    //   131: new 276	android/os/Messenger
    //   134: dup
    //   135: new 322	exy
    //   138: dup
    //   139: aload_0
    //   140: invokestatic 328	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   143: invokespecial 331	exy:<init>	(Lexx;Landroid/os/Looper;)V
    //   146: invokespecial 334	android/os/Messenger:<init>	(Landroid/os/Handler;)V
    //   149: putfield 318	exx:g	Landroid/os/Messenger;
    //   152: getstatic 28	exx:c	Ljava/lang/String;
    //   155: ifnonnull +14 -> 169
    //   158: new 144	java/io/IOException
    //   161: dup
    //   162: ldc_w 336
    //   165: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   168: athrow
    //   169: invokestatic 303	android/os/SystemClock:elapsedRealtime	()J
    //   172: pop2
    //   173: new 65	android/content/Intent
    //   176: dup
    //   177: ldc 67
    //   179: invokespecial 70	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   182: astore 12
    //   184: aload 12
    //   186: getstatic 28	exx:c	Ljava/lang/String;
    //   189: invokevirtual 340	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   192: pop
    //   193: aload_1
    //   194: ldc_w 342
    //   197: aload_0
    //   198: getfield 41	exx:e	Landroid/content/Context;
    //   201: invokestatic 347	evr:b	(Landroid/content/Context;)I
    //   204: invokestatic 48	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   207: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: aload_1
    //   211: ldc_w 355
    //   214: getstatic 360	android/os/Build$VERSION:SDK_INT	I
    //   217: invokestatic 48	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   220: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: aload_1
    //   224: ldc_w 362
    //   227: aload_0
    //   228: getfield 41	exx:e	Landroid/content/Context;
    //   231: invokestatic 364	exu:a	(Landroid/content/Context;)I
    //   234: invokestatic 48	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   237: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: aload_1
    //   241: ldc_w 366
    //   244: ldc_w 368
    //   247: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: aload_1
    //   251: ldc_w 370
    //   254: aload_2
    //   255: invokestatic 373	exu:a	(Ljava/security/KeyPair;)Ljava/lang/String;
    //   258: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload_2
    //   262: invokevirtual 377	java/security/KeyPair:getPublic	()Ljava/security/PublicKey;
    //   265: invokeinterface 382 1 0
    //   270: invokestatic 229	exu:a	([B)Ljava/lang/String;
    //   273: astore 14
    //   275: aload_1
    //   276: ldc_w 384
    //   279: aload 14
    //   281: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: iconst_2
    //   285: anewarray 192	java/lang/String
    //   288: astore 15
    //   290: aload 15
    //   292: iconst_0
    //   293: aload_0
    //   294: getfield 41	exx:e	Landroid/content/Context;
    //   297: invokevirtual 387	android/content/Context:getPackageName	()Ljava/lang/String;
    //   300: aastore
    //   301: aload 15
    //   303: iconst_1
    //   304: aload 14
    //   306: aastore
    //   307: aload_1
    //   308: ldc_w 389
    //   311: aload_2
    //   312: aload 15
    //   314: invokestatic 391	exx:a	(Ljava/security/KeyPair;[Ljava/lang/String;)Ljava/lang/String;
    //   317: invokevirtual 353	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload 12
    //   322: aload_1
    //   323: invokevirtual 395	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   326: pop
    //   327: aload_0
    //   328: aload 12
    //   330: invokespecial 398	exx:c	(Landroid/content/Intent;)V
    //   333: invokestatic 303	android/os/SystemClock:elapsedRealtime	()J
    //   336: pop2
    //   337: aload 12
    //   339: ldc_w 400
    //   342: new 115	java/lang/StringBuilder
    //   345: dup
    //   346: ldc_w 402
    //   349: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   352: aload 4
    //   354: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: ldc_w 404
    //   360: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: invokevirtual 406	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokevirtual 410	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   369: pop
    //   370: aload 12
    //   372: ldc_w 412
    //   375: new 115	java/lang/StringBuilder
    //   378: dup
    //   379: ldc_w 402
    //   382: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   385: aload 4
    //   387: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: ldc_w 404
    //   393: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 406	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: invokevirtual 410	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   402: pop
    //   403: ldc 141
    //   405: getstatic 28	exx:c	Ljava/lang/String;
    //   408: invokevirtual 416	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   411: istore 21
    //   413: aload 12
    //   415: ldc_w 418
    //   418: invokevirtual 153	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   421: astore 22
    //   423: aload 22
    //   425: ifnull +13 -> 438
    //   428: ldc_w 368
    //   431: aload 22
    //   433: invokevirtual 416	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   436: istore 21
    //   438: ldc 231
    //   440: iconst_3
    //   441: invokestatic 422	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   444: ifeq +22 -> 466
    //   447: new 115	java/lang/StringBuilder
    //   450: dup
    //   451: ldc_w 424
    //   454: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   457: aload 12
    //   459: invokevirtual 169	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   462: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: aload_0
    //   467: getfield 426	exx:a	Landroid/os/Messenger;
    //   470: ifnull +90 -> 560
    //   473: aload 12
    //   475: ldc_w 428
    //   478: aload_0
    //   479: getfield 318	exx:g	Landroid/os/Messenger;
    //   482: invokevirtual 431	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   485: pop
    //   486: invokestatic 282	android/os/Message:obtain	()Landroid/os/Message;
    //   489: astore 40
    //   491: aload 40
    //   493: aload 12
    //   495: putfield 286	android/os/Message:obj	Ljava/lang/Object;
    //   498: aload_0
    //   499: getfield 426	exx:a	Landroid/os/Messenger;
    //   502: aload 40
    //   504: invokevirtual 290	android/os/Messenger:send	(Landroid/os/Message;)V
    //   507: aload_3
    //   508: ldc2_w 432
    //   511: invokevirtual 437	android/os/ConditionVariable:block	(J)Z
    //   514: pop
    //   515: aload_0
    //   516: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
    //   519: astore 28
    //   521: aload 28
    //   523: monitorenter
    //   524: aload_0
    //   525: getfield 39	exx:f	Ljava/util/Map;
    //   528: aload 4
    //   530: invokeinterface 440 2 0
    //   535: astore 30
    //   537: aload 30
    //   539: instanceof 65
    //   542: ifeq +173 -> 715
    //   545: aload 30
    //   547: checkcast 65	android/content/Intent
    //   550: astore 32
    //   552: aload 28
    //   554: monitorexit
    //   555: aload 32
    //   557: areturn
    //   558: astore 41
    //   560: iload 21
    //   562: ifeq +52 -> 614
    //   565: new 65	android/content/Intent
    //   568: dup
    //   569: ldc_w 442
    //   572: invokespecial 70	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   575: astore 23
    //   577: aload 23
    //   579: aload_0
    //   580: getfield 41	exx:e	Landroid/content/Context;
    //   583: invokevirtual 387	android/content/Context:getPackageName	()Ljava/lang/String;
    //   586: invokevirtual 340	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   589: pop
    //   590: aload 23
    //   592: ldc_w 444
    //   595: aload 12
    //   597: invokevirtual 431	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   600: pop
    //   601: aload_0
    //   602: getfield 41	exx:e	Landroid/content/Context;
    //   605: aload 23
    //   607: invokevirtual 448	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   610: pop
    //   611: goto -104 -> 507
    //   614: aload 12
    //   616: ldc_w 428
    //   619: aload_0
    //   620: getfield 318	exx:g	Landroid/os/Messenger;
    //   623: invokevirtual 431	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   626: pop
    //   627: aload 12
    //   629: ldc_w 450
    //   632: ldc_w 368
    //   635: invokevirtual 410	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   638: pop
    //   639: aload_0
    //   640: getfield 452	exx:b	Lcom/google/android/gms/iid/MessengerCompat;
    //   643: ifnull +44 -> 687
    //   646: invokestatic 282	android/os/Message:obtain	()Landroid/os/Message;
    //   649: astore 36
    //   651: aload 36
    //   653: aload 12
    //   655: putfield 286	android/os/Message:obj	Ljava/lang/Object;
    //   658: aload_0
    //   659: getfield 452	exx:b	Lcom/google/android/gms/iid/MessengerCompat;
    //   662: astore 38
    //   664: aload 38
    //   666: getfield 455	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   669: ifnull +31 -> 700
    //   672: aload 38
    //   674: getfield 455	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   677: aload 36
    //   679: invokevirtual 290	android/os/Messenger:send	(Landroid/os/Message;)V
    //   682: goto -175 -> 507
    //   685: astore 37
    //   687: aload_0
    //   688: getfield 41	exx:e	Landroid/content/Context;
    //   691: aload 12
    //   693: invokevirtual 448	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   696: pop
    //   697: goto -190 -> 507
    //   700: aload 38
    //   702: getfield 458	com/google/android/gms/iid/MessengerCompat:b	Lexz;
    //   705: aload 36
    //   707: invokeinterface 462 2 0
    //   712: goto -205 -> 507
    //   715: aload 30
    //   717: instanceof 192
    //   720: ifeq +24 -> 744
    //   723: new 144	java/io/IOException
    //   726: dup
    //   727: aload 30
    //   729: checkcast 192	java/lang/String
    //   732: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   735: athrow
    //   736: astore 29
    //   738: aload 28
    //   740: monitorexit
    //   741: aload 29
    //   743: athrow
    //   744: new 115	java/lang/StringBuilder
    //   747: dup
    //   748: ldc_w 464
    //   751: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   754: aload 30
    //   756: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: new 144	java/io/IOException
    //   763: dup
    //   764: ldc_w 466
    //   767: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   770: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	771	0	this	exx
    //   0	771	1	paramBundle	Bundle
    //   0	771	2	paramKeyPair	KeyPair
    //   7	501	3	localConditionVariable	ConditionVariable
    //   11	518	4	str1	String
    //   17	93	5	localClass1	java.lang.Class
    //   107	6	6	localObject1	Object
    //   41	36	8	l	long
    //   182	510	12	localIntent1	Intent
    //   273	32	14	str2	String
    //   288	25	15	arrayOfString	String[]
    //   411	150	21	bool	boolean
    //   421	11	22	str3	String
    //   575	31	23	localIntent2	Intent
    //   736	6	29	localObject2	Object
    //   535	220	30	localObject3	Object
    //   550	6	32	localIntent3	Intent
    //   649	57	36	localMessage1	Message
    //   685	1	37	localRemoteException1	RemoteException
    //   662	39	38	localMessengerCompat	MessengerCompat
    //   489	14	40	localMessage2	Message
    //   558	1	41	localRemoteException2	RemoteException
    // Exception table:
    //   from	to	target	type
    //   22	38	107	finally
    //   109	112	107	finally
    //   498	507	558	android/os/RemoteException
    //   658	682	685	android/os/RemoteException
    //   700	712	685	android/os/RemoteException
    //   524	555	736	finally
    //   715	736	736	finally
    //   738	741	736	finally
    //   744	771	736	finally
  }
  
  private void c(Intent paramIntent)
  {
    try
    {
      if (this.h == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.h = PendingIntent.getBroadcast(this.e, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.h);
      return;
    }
    finally {}
  }
  
  public final Intent a(Bundle paramBundle, KeyPair paramKeyPair)
  {
    Intent localIntent = b(paramBundle, paramKeyPair);
    if ((localIntent != null) && (localIntent.hasExtra("google.messenger"))) {
      localIntent = b(paramBundle, paramKeyPair);
    }
    return localIntent;
  }
  
  final void b(Intent paramIntent)
  {
    if (paramIntent == null) {}
    do
    {
      return;
      String str1 = paramIntent.getAction();
      if (("com.google.android.c2dm.intent.REGISTRATION".equals(str1)) || ("com.google.android.gms.iid.InstanceID".equals(str1))) {
        break;
      }
    } while (!Log.isLoggable("InstanceID/Rpc", 3));
    new StringBuilder("Unexpected response ").append(paramIntent.getAction());
    return;
    String str2 = paramIntent.getStringExtra("registration_id");
    if (str2 == null) {}
    for (String str3 = paramIntent.getStringExtra("unregistered");; str3 = str2)
    {
      if (str3 == null)
      {
        String str6 = paramIntent.getStringExtra("error");
        if (str6 == null)
        {
          new StringBuilder("Unexpected response, no error or registration id ").append(paramIntent.getExtras());
          return;
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
          new StringBuilder("Received InstanceID error ").append(str6);
        }
        boolean bool2 = str6.startsWith("|");
        String str7 = null;
        if (bool2)
        {
          String[] arrayOfString2 = str6.split("\\|");
          if (!"ID".equals(arrayOfString2[1])) {
            new StringBuilder("Unexpected structured response ").append(str6);
          }
          if (arrayOfString2.length > 2)
          {
            str7 = arrayOfString2[2];
            str6 = arrayOfString2[3];
            if (str6.startsWith(":")) {
              str6 = str6.substring(1);
            }
            paramIntent.putExtra("error", str6);
          }
        }
        else
        {
          if (str7 != null) {
            break label328;
          }
          a(str6);
        }
        for (;;)
        {
          long l = paramIntent.getLongExtra("Retry-After", 0L);
          if (l <= 0L) {
            break label339;
          }
          SystemClock.elapsedRealtime();
          this.j = (1000 * (int)l);
          this.k = (SystemClock.elapsedRealtime() + this.j);
          new StringBuilder("Explicit request from server to backoff: ").append(this.j);
          return;
          str6 = "UNKNOWN";
          str7 = null;
          break;
          label328:
          a(str7, str6);
        }
        label339:
        if (((!"SERVICE_NOT_AVAILABLE".equals(str6)) && (!"AUTHENTICATION_FAILED".equals(str6))) || (!"com.google.android.gsf".equals(c))) {
          break;
        }
        this.i = (1 + this.i);
        if (this.i < 3) {
          break;
        }
        if (this.i == 3) {
          this.j = (1000 + new Random().nextInt(1000));
        }
        this.j <<= 1;
        this.k = (SystemClock.elapsedRealtime() + this.j);
        new StringBuilder("Backoff due to ").append(str6).append(" for ").append(this.j);
        return;
      }
      SystemClock.elapsedRealtime();
      this.k = 0L;
      this.i = 0;
      this.j = 0;
      if (Log.isLoggable("InstanceID/Rpc", 3)) {
        new StringBuilder("AppIDResponse: ").append(str3).append(" ").append(paramIntent.getExtras());
      }
      boolean bool1 = str3.startsWith("|");
      Object localObject = null;
      String[] arrayOfString1;
      String str4;
      if (bool1)
      {
        arrayOfString1 = str3.split("\\|");
        if (!"ID".equals(arrayOfString1[1])) {
          new StringBuilder("Unexpected structured response ").append(str3);
        }
        str4 = arrayOfString1[2];
        if (arrayOfString1.length > 4)
        {
          if (!"SYNC".equals(arrayOfString1[3])) {
            break label713;
          }
          localContext2 = this.e;
          localIntent = new Intent("com.google.android.gms.iid.InstanceID");
          localIntent.setPackage(localContext2.getPackageName());
          localIntent.putExtra(exv.a, "SYNC");
          localContext2.startService(localIntent);
        }
      }
      label713:
      while (!"RST".equals(arrayOfString1[3]))
      {
        Context localContext2;
        Intent localIntent;
        String str5 = arrayOfString1[(-1 + arrayOfString1.length)];
        if (str5.startsWith(":")) {
          str5 = str5.substring(1);
        }
        paramIntent.putExtra("registration_id", str5);
        localObject = str4;
        if (localObject != null) {
          break;
        }
        a(paramIntent);
        return;
      }
      Context localContext1 = this.e;
      exu.b(this.e);
      exv.a(localContext1, exu.a);
      paramIntent.removeExtra("registration_id");
      a(str4, paramIntent);
      return;
      a(localObject, paramIntent);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exx
 * JD-Core Version:    0.7.0.1
 */