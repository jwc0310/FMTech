import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class evr
{
  public static evr a;
  private static final AtomicInteger e = new AtomicInteger(1);
  private Context b;
  private PendingIntent c;
  private Map<String, Handler> d = Collections.synchronizedMap(new HashMap());
  private final BlockingQueue<Intent> f = new LinkedBlockingQueue();
  private Messenger g = new Messenger(new evs(this, Looper.getMainLooper()));
  
  @Deprecated
  private Intent a(Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    if (b(this.b) < 0) {
      throw new IOException("Google Play Services missing");
    }
    Intent localIntent1 = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent1.setPackage(exx.a(this.b));
    b(localIntent1);
    localIntent1.putExtra("google.message_id", "google.rpc" + String.valueOf(e.getAndIncrement()));
    localIntent1.putExtras(paramBundle);
    localIntent1.putExtra("google.messenger", this.g);
    this.b.startService(localIntent1);
    try
    {
      Intent localIntent2 = (Intent)this.f.poll(30000L, TimeUnit.MILLISECONDS);
      return localIntent2;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
  }
  
  public static evr a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        evr localevr1 = new evr();
        a = localevr1;
        localevr1.b = paramContext.getApplicationContext();
      }
      evr localevr2 = a;
      return localevr2;
    }
    finally {}
  }
  
  public static String a(Intent paramIntent)
  {
    String str;
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      str = null;
    }
    do
    {
      return str;
      str = paramIntent.getStringExtra("message_type");
    } while (str != null);
    return "gcm";
  }
  
  public static int b(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i = localPackageManager.getPackageInfo(exx.a(paramContext), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return -1;
  }
  
  private void b(Intent paramIntent)
  {
    try
    {
      if (this.c == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.c = PendingIntent.getBroadcast(this.b, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.c);
      return;
    }
    finally {}
  }
  
  /* Error */
  @Deprecated
  public final String a(String... paramVarArgs)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_1
    //   5: ifnull +8 -> 13
    //   8: aload_1
    //   9: arraylength
    //   10: ifne +19 -> 29
    //   13: new 257	java/lang/IllegalArgumentException
    //   16: dup
    //   17: ldc_w 259
    //   20: invokespecial 260	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   23: athrow
    //   24: astore_3
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_3
    //   28: athrow
    //   29: new 108	java/lang/StringBuilder
    //   32: dup
    //   33: aload_1
    //   34: iconst_0
    //   35: aaload
    //   36: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: astore 4
    //   41: iload_2
    //   42: istore 5
    //   44: iload 5
    //   46: aload_1
    //   47: arraylength
    //   48: if_icmpge +24 -> 72
    //   51: aload 4
    //   53: bipush 44
    //   55: invokevirtual 263	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   58: aload_1
    //   59: iload 5
    //   61: aaload
    //   62: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: iinc 5 1
    //   69: goto -25 -> 44
    //   72: aload 4
    //   74: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore 6
    //   79: new 265	android/os/Bundle
    //   82: dup
    //   83: invokespecial 266	android/os/Bundle:<init>	()V
    //   86: astore 7
    //   88: aload_0
    //   89: getfield 82	evr:b	Landroid/content/Context;
    //   92: invokestatic 97	exx:a	(Landroid/content/Context;)Ljava/lang/String;
    //   95: ldc_w 268
    //   98: invokevirtual 272	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   101: ifeq +258 -> 359
    //   104: aload 7
    //   106: ldc_w 274
    //   109: aload 6
    //   111: invokevirtual 278	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: aload_0
    //   115: getfield 82	evr:b	Landroid/content/Context;
    //   118: invokestatic 283	exu:b	(Landroid/content/Context;)Lexu;
    //   121: astore 11
    //   123: invokestatic 58	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   126: invokestatic 73	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   129: if_acmpne +13 -> 142
    //   132: new 75	java/io/IOException
    //   135: dup
    //   136: ldc 77
    //   138: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   141: athrow
    //   142: getstatic 286	exu:a	Leyc;
    //   145: ldc_w 288
    //   148: invokevirtual 292	eyc:a	(Ljava/lang/String;)Ljava/lang/String;
    //   151: astore 12
    //   153: aload 12
    //   155: ifnull +294 -> 449
    //   158: aload 12
    //   160: getstatic 295	exu:d	Ljava/lang/String;
    //   163: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   166: ifne +114 -> 280
    //   169: goto +280 -> 449
    //   172: aload 9
    //   174: ifnonnull +101 -> 275
    //   177: aload 7
    //   179: ldc_w 297
    //   182: invokevirtual 300	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   185: ifnull +5 -> 190
    //   188: iconst_0
    //   189: istore_2
    //   190: ldc_w 302
    //   193: aload 7
    //   195: ldc_w 304
    //   198: invokevirtual 300	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   201: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   204: istore 14
    //   206: iconst_0
    //   207: istore 15
    //   209: iload 14
    //   211: ifeq +232 -> 443
    //   214: aload 11
    //   216: aload 6
    //   218: ldc_w 306
    //   221: aload 7
    //   223: invokevirtual 309	exu:a	(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //   226: astore 9
    //   228: new 108	java/lang/StringBuilder
    //   231: dup
    //   232: ldc_w 311
    //   235: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload 9
    //   240: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload 9
    //   246: ifnull +29 -> 275
    //   249: iload 15
    //   251: ifeq +24 -> 275
    //   254: getstatic 286	exu:a	Leyc;
    //   257: aload 11
    //   259: getfield 313	exu:c	Ljava/lang/String;
    //   262: aload 6
    //   264: ldc_w 306
    //   267: aload 9
    //   269: getstatic 295	exu:d	Ljava/lang/String;
    //   272: invokevirtual 316	eyc:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   275: aload_0
    //   276: monitorexit
    //   277: aload 9
    //   279: areturn
    //   280: getstatic 286	exu:a	Leyc;
    //   283: ldc_w 318
    //   286: invokevirtual 292	eyc:a	(Ljava/lang/String;)Ljava/lang/String;
    //   289: astore 17
    //   291: aload 17
    //   293: ifnonnull +9 -> 302
    //   296: iload_2
    //   297: istore 13
    //   299: goto +153 -> 452
    //   302: aload 17
    //   304: invokestatic 324	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   307: invokestatic 327	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   310: astore 18
    //   312: invokestatic 333	java/lang/System:currentTimeMillis	()J
    //   315: ldc2_w 334
    //   318: ldiv
    //   319: aload 18
    //   321: invokevirtual 338	java/lang/Long:longValue	()J
    //   324: lsub
    //   325: ldc2_w 339
    //   328: lcmp
    //   329: ifle +134 -> 463
    //   332: iload_2
    //   333: istore 13
    //   335: goto +117 -> 452
    //   338: getstatic 286	exu:a	Leyc;
    //   341: aload 11
    //   343: getfield 313	exu:c	Ljava/lang/String;
    //   346: aload 6
    //   348: ldc_w 306
    //   351: invokevirtual 343	eyc:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   354: astore 9
    //   356: goto -184 -> 172
    //   359: aload 7
    //   361: ldc_w 345
    //   364: aload 6
    //   366: invokevirtual 278	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: aload_0
    //   370: aload 7
    //   372: invokespecial 347	evr:a	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   375: astore 8
    //   377: aload 8
    //   379: ifnonnull +14 -> 393
    //   382: new 75	java/io/IOException
    //   385: dup
    //   386: ldc_w 349
    //   389: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   392: athrow
    //   393: aload 8
    //   395: ldc_w 351
    //   398: invokevirtual 188	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   401: astore 9
    //   403: aload 9
    //   405: ifnonnull -130 -> 275
    //   408: aload 8
    //   410: ldc 196
    //   412: invokevirtual 188	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   415: astore 10
    //   417: aload 10
    //   419: ifnull +13 -> 432
    //   422: new 75	java/io/IOException
    //   425: dup
    //   426: aload 10
    //   428: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   431: athrow
    //   432: new 75	java/io/IOException
    //   435: dup
    //   436: ldc_w 349
    //   439: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   442: athrow
    //   443: iload_2
    //   444: istore 15
    //   446: goto -232 -> 214
    //   449: iload_2
    //   450: istore 13
    //   452: iload 13
    //   454: ifeq -116 -> 338
    //   457: aconst_null
    //   458: astore 9
    //   460: goto -288 -> 172
    //   463: iconst_0
    //   464: istore 13
    //   466: goto -14 -> 452
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	this	evr
    //   0	469	1	paramVarArgs	String[]
    //   1	449	2	i	int
    //   24	4	3	localObject	Object
    //   39	34	4	localStringBuilder	java.lang.StringBuilder
    //   42	25	5	j	int
    //   77	288	6	str1	String
    //   86	285	7	localBundle	Bundle
    //   375	34	8	localIntent	Intent
    //   172	287	9	str2	String
    //   415	12	10	str3	String
    //   121	221	11	localexu	exu
    //   151	8	12	str4	String
    //   297	168	13	k	int
    //   204	6	14	bool	boolean
    //   207	238	15	m	int
    //   289	14	17	str5	String
    //   310	10	18	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   8	13	24	finally
    //   13	24	24	finally
    //   29	41	24	finally
    //   44	66	24	finally
    //   72	142	24	finally
    //   142	153	24	finally
    //   158	169	24	finally
    //   177	188	24	finally
    //   190	206	24	finally
    //   214	244	24	finally
    //   254	275	24	finally
    //   280	291	24	finally
    //   302	332	24	finally
    //   338	356	24	finally
    //   359	377	24	finally
    //   382	393	24	finally
    //   393	403	24	finally
    //   408	417	24	finally
    //   422	432	24	finally
    //   432	443	24	finally
  }
  
  @Deprecated
  public final void a()
  {
    try
    {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        throw new IOException("MAIN_THREAD");
      }
    }
    finally {}
    exu localexu = exu.b(this.b);
    String str1 = "*";
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    exu.a.b(localexu.c, str1, "*");
    Bundle localBundle = new Bundle();
    localBundle.putString("sender", str1);
    localBundle.putString("scope", "*");
    localBundle.putString("subscription", str1);
    localBundle.putString("delete", "1");
    localBundle.putString("X-delete", "1");
    String str2;
    if ("".equals(localexu.c))
    {
      str2 = str1;
      localBundle.putString("subtype", str2);
      if (!"".equals(localexu.c)) {
        break label211;
      }
    }
    for (;;)
    {
      localBundle.putString("X-subtype", str1);
      exx.a(exu.b.a(localBundle, localexu.a()));
      localexu.b();
      return;
      str2 = localexu.c;
      break;
      label211:
      str1 = localexu.c;
    }
  }
  
  public final void a(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Missing 'to'");
    }
    Intent localIntent = new Intent("com.google.android.gcm.intent.SEND");
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    b(localIntent);
    localIntent.setPackage(exx.a(this.b));
    localIntent.putExtra("google.to", paramString1);
    localIntent.putExtra("google.message_id", paramString2);
    localIntent.putExtra("google.ttl", Long.toString(0L));
    localIntent.putExtra("google.delay", Integer.toString(-1));
    if (exx.a(this.b).contains(".gsf"))
    {
      Bundle localBundle = new Bundle();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramBundle.get(str);
        if ((localObject instanceof String)) {
          localBundle.putString("gcm." + str, (String)localObject);
        }
      }
      localBundle.putString("google.to", paramString1);
      localBundle.putString("google.message_id", paramString2);
      exu.b(this.b).a("GCM", "upstream", localBundle);
      return;
    }
    this.b.sendOrderedBroadcast(localIntent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  public final void b()
  {
    try
    {
      if (this.c != null)
      {
        this.c.cancel();
        this.c = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evr
 * JD-Core Version:    0.7.0.1
 */