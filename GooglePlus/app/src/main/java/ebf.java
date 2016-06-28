import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;

public final class ebf
{
  private static String a = "androidPackageName";
  private static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  
  static
  {
    new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  }
  
  /* Error */
  private static Bundle a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 45	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: ldc 47
    //   8: invokestatic 53	efj:f	(Ljava/lang/String;)V
    //   11: aload 4
    //   13: invokestatic 56	ebf:a	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +148 -> 165
    //   20: new 58	android/os/Bundle
    //   23: dup
    //   24: invokespecial 60	android/os/Bundle:<init>	()V
    //   27: astore 5
    //   29: aload_0
    //   30: invokevirtual 64	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   33: getfield 69	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 5
    //   40: ldc 71
    //   42: aload 6
    //   44: invokevirtual 74	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload 5
    //   49: getstatic 20	ebf:a	Ljava/lang/String;
    //   52: invokevirtual 78	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokestatic 84	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   58: ifeq +13 -> 71
    //   61: aload 5
    //   63: getstatic 20	ebf:a	Ljava/lang/String;
    //   66: aload 6
    //   68: invokevirtual 74	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: new 86	eju
    //   74: dup
    //   75: invokespecial 87	eju:<init>	()V
    //   78: astore 7
    //   80: aload 4
    //   82: invokestatic 92	ein:a	(Landroid/content/Context;)Lein;
    //   85: astore 8
    //   87: aload 8
    //   89: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   92: aload 7
    //   94: ldc 94
    //   96: invokevirtual 97	ein:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   99: ifeq +396 -> 495
    //   102: aload 7
    //   104: invokevirtual 100	eju:a	()Landroid/os/IBinder;
    //   107: invokestatic 105	eyt:a	(Landroid/os/IBinder;)Leys;
    //   110: aload_1
    //   111: aload_2
    //   112: aload 5
    //   114: invokeinterface 110 4 0
    //   119: astore 12
    //   121: aload 12
    //   123: ifnonnull +55 -> 178
    //   126: new 112	ebe
    //   129: dup
    //   130: ldc 114
    //   132: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   135: athrow
    //   136: astore 11
    //   138: new 118	java/io/IOException
    //   141: dup
    //   142: ldc 120
    //   144: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   147: athrow
    //   148: astore 10
    //   150: aload 8
    //   152: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   155: aload 7
    //   157: ldc 94
    //   159: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   162: aload 10
    //   164: athrow
    //   165: new 58	android/os/Bundle
    //   168: dup
    //   169: aload_3
    //   170: invokespecial 127	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   173: astore 5
    //   175: goto -146 -> 29
    //   178: aload 12
    //   180: ldc 129
    //   182: invokevirtual 78	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   185: invokestatic 84	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   188: istore 13
    //   190: iload 13
    //   192: ifne +18 -> 210
    //   195: aload 8
    //   197: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   200: aload 7
    //   202: ldc 94
    //   204: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   207: aload 12
    //   209: areturn
    //   210: aload 12
    //   212: ldc 131
    //   214: invokevirtual 78	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   217: astore 14
    //   219: aload 12
    //   221: ldc 133
    //   223: invokevirtual 137	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   226: checkcast 139	android/content/Intent
    //   229: astore 15
    //   231: ldc 141
    //   233: aload 14
    //   235: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   238: ifne +267 -> 505
    //   241: ldc 149
    //   243: aload 14
    //   245: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   248: ifne +257 -> 505
    //   251: ldc 151
    //   253: aload 14
    //   255: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: ifne +247 -> 505
    //   261: ldc 153
    //   263: aload 14
    //   265: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   268: ifne +237 -> 505
    //   271: ldc 155
    //   273: aload 14
    //   275: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifne +227 -> 505
    //   281: ldc 157
    //   283: aload 14
    //   285: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   288: ifne +217 -> 505
    //   291: ldc 159
    //   293: aload 14
    //   295: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   298: ifne +207 -> 505
    //   301: getstatic 164	ebi:b	Lebi;
    //   304: getfield 167	ebi:h	Ljava/lang/String;
    //   307: aload 14
    //   309: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   312: ifne +193 -> 505
    //   315: getstatic 170	ebi:c	Lebi;
    //   318: getfield 167	ebi:h	Ljava/lang/String;
    //   321: aload 14
    //   323: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   326: ifne +179 -> 505
    //   329: getstatic 173	ebi:d	Lebi;
    //   332: getfield 167	ebi:h	Ljava/lang/String;
    //   335: aload 14
    //   337: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   340: ifne +165 -> 505
    //   343: getstatic 176	ebi:e	Lebi;
    //   346: getfield 167	ebi:h	Ljava/lang/String;
    //   349: aload 14
    //   351: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   354: ifne +151 -> 505
    //   357: getstatic 178	ebi:f	Lebi;
    //   360: getfield 167	ebi:h	Ljava/lang/String;
    //   363: aload 14
    //   365: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   368: ifne +137 -> 505
    //   371: getstatic 181	ebi:g	Lebi;
    //   374: getfield 167	ebi:h	Ljava/lang/String;
    //   377: aload 14
    //   379: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   382: ifne +123 -> 505
    //   385: getstatic 183	ebi:a	Lebi;
    //   388: getfield 167	ebi:h	Ljava/lang/String;
    //   391: aload 14
    //   393: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   396: ifeq +35 -> 431
    //   399: goto +106 -> 505
    //   402: iload 16
    //   404: ifeq +33 -> 437
    //   407: new 185	ebh
    //   410: dup
    //   411: aload 14
    //   413: aload 15
    //   415: invokespecial 188	ebh:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   418: athrow
    //   419: astore 9
    //   421: new 112	ebe
    //   424: dup
    //   425: ldc 190
    //   427: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   430: athrow
    //   431: iconst_0
    //   432: istore 16
    //   434: goto -32 -> 402
    //   437: ldc 192
    //   439: aload 14
    //   441: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   444: ifne +67 -> 511
    //   447: ldc 114
    //   449: aload 14
    //   451: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   454: ifne +57 -> 511
    //   457: ldc 194
    //   459: aload 14
    //   461: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   464: ifeq +53 -> 517
    //   467: goto +44 -> 511
    //   470: iload 17
    //   472: ifeq +13 -> 485
    //   475: new 118	java/io/IOException
    //   478: dup
    //   479: aload 14
    //   481: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   484: athrow
    //   485: new 112	ebe
    //   488: dup
    //   489: aload 14
    //   491: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   494: athrow
    //   495: new 118	java/io/IOException
    //   498: dup
    //   499: ldc 196
    //   501: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   504: athrow
    //   505: iconst_1
    //   506: istore 16
    //   508: goto -106 -> 402
    //   511: iconst_1
    //   512: istore 17
    //   514: goto -44 -> 470
    //   517: iconst_0
    //   518: istore 17
    //   520: goto -50 -> 470
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	523	0	paramContext	Context
    //   0	523	1	paramAccount	Account
    //   0	523	2	paramString	String
    //   0	523	3	paramBundle	Bundle
    //   4	77	4	localContext	Context
    //   27	147	5	localBundle1	Bundle
    //   36	31	6	str1	String
    //   78	123	7	localeju	eju
    //   85	111	8	localein	ein
    //   419	1	9	localInterruptedException	java.lang.InterruptedException
    //   148	15	10	localObject	Object
    //   136	1	11	localRemoteException	android.os.RemoteException
    //   119	101	12	localBundle2	Bundle
    //   188	3	13	bool	boolean
    //   217	273	14	str2	String
    //   229	185	15	localIntent	Intent
    //   402	105	16	i	int
    //   470	49	17	j	int
    // Exception table:
    //   from	to	target	type
    //   102	121	136	android/os/RemoteException
    //   126	136	136	android/os/RemoteException
    //   178	190	136	android/os/RemoteException
    //   210	399	136	android/os/RemoteException
    //   407	419	136	android/os/RemoteException
    //   437	467	136	android/os/RemoteException
    //   475	485	136	android/os/RemoteException
    //   485	495	136	android/os/RemoteException
    //   102	121	148	finally
    //   126	136	148	finally
    //   138	148	148	finally
    //   178	190	148	finally
    //   210	399	148	finally
    //   407	419	148	finally
    //   421	431	148	finally
    //   437	467	148	finally
    //   475	485	148	finally
    //   485	495	148	finally
    //   102	121	419	java/lang/InterruptedException
    //   126	136	419	java/lang/InterruptedException
    //   178	190	419	java/lang/InterruptedException
    //   210	399	419	java/lang/InterruptedException
    //   407	419	419	java/lang/InterruptedException
    //   437	467	419	java/lang/InterruptedException
    //   475	485	419	java/lang/InterruptedException
    //   485	495	419	java/lang/InterruptedException
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, new Bundle()).getString("authtoken");
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Account localAccount = new Account(paramString1, "com.google");
    Bundle localBundle = null;
    if (0 == 0) {
      localBundle = new Bundle();
    }
    localBundle.putBoolean("handle_notification", true);
    return b(paramContext, localAccount, paramString2, localBundle).getString("authtoken");
  }
  
  private static void a(Context paramContext)
  {
    try
    {
      eer.b(paramContext);
      return;
    }
    catch (eeq localeeq)
    {
      throw new ebg(localeeq.a, localeeq.getMessage(), new Intent(localeeq.b));
    }
    catch (eep localeep)
    {
      throw new ebe(localeep.getMessage());
    }
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 45	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore_2
    //   5: ldc 47
    //   7: invokestatic 53	efj:f	(Ljava/lang/String;)V
    //   10: aload_2
    //   11: invokestatic 56	ebf:a	(Landroid/content/Context;)V
    //   14: new 58	android/os/Bundle
    //   17: dup
    //   18: invokespecial 60	android/os/Bundle:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: invokevirtual 64	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: getfield 69	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   29: astore 4
    //   31: aload_3
    //   32: ldc 71
    //   34: aload 4
    //   36: invokevirtual 74	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: aload_3
    //   40: getstatic 20	ebf:a	Ljava/lang/String;
    //   43: invokevirtual 247	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   46: ifne +12 -> 58
    //   49: aload_3
    //   50: getstatic 20	ebf:a	Ljava/lang/String;
    //   53: aload 4
    //   55: invokevirtual 74	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: new 86	eju
    //   61: dup
    //   62: invokespecial 87	eju:<init>	()V
    //   65: astore 5
    //   67: aload_2
    //   68: invokestatic 92	ein:a	(Landroid/content/Context;)Lein;
    //   71: astore 6
    //   73: aload 6
    //   75: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   78: aload 5
    //   80: ldc 94
    //   82: invokevirtual 97	ein:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   85: ifeq +103 -> 188
    //   88: aload 5
    //   90: invokevirtual 100	eju:a	()Landroid/os/IBinder;
    //   93: invokestatic 105	eyt:a	(Landroid/os/IBinder;)Leys;
    //   96: aload_1
    //   97: aload_3
    //   98: invokeinterface 250 3 0
    //   103: astore 10
    //   105: aload 10
    //   107: ldc 131
    //   109: invokevirtual 78	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   112: astore 11
    //   114: aload 10
    //   116: ldc 252
    //   118: invokevirtual 255	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   121: ifne +42 -> 163
    //   124: new 112	ebe
    //   127: dup
    //   128: aload 11
    //   130: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   133: athrow
    //   134: astore 9
    //   136: new 118	java/io/IOException
    //   139: dup
    //   140: ldc 120
    //   142: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   145: athrow
    //   146: astore 8
    //   148: aload 6
    //   150: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   153: aload 5
    //   155: ldc 94
    //   157: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   160: aload 8
    //   162: athrow
    //   163: aload 6
    //   165: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   168: aload 5
    //   170: ldc 94
    //   172: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   175: return
    //   176: astore 7
    //   178: new 112	ebe
    //   181: dup
    //   182: ldc 190
    //   184: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: new 118	java/io/IOException
    //   191: dup
    //   192: ldc 196
    //   194: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   197: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	paramContext	Context
    //   0	198	1	paramString	String
    //   4	64	2	localContext	Context
    //   21	77	3	localBundle1	Bundle
    //   29	25	4	str1	String
    //   65	104	5	localeju	eju
    //   71	93	6	localein	ein
    //   176	1	7	localInterruptedException	java.lang.InterruptedException
    //   146	15	8	localObject	Object
    //   134	1	9	localRemoteException	android.os.RemoteException
    //   103	12	10	localBundle2	Bundle
    //   112	17	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   88	134	134	android/os/RemoteException
    //   88	134	146	finally
    //   136	146	146	finally
    //   178	188	146	finally
    //   88	134	176	java/lang/InterruptedException
  }
  
  /* Error */
  public static Account[] a(Context paramContext, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 259	efj:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: invokestatic 261	efj:d	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 45	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   14: invokestatic 56	ebf:a	(Landroid/content/Context;)V
    //   17: new 86	eju
    //   20: dup
    //   21: invokespecial 87	eju:<init>	()V
    //   24: astore 5
    //   26: aload_0
    //   27: invokestatic 92	ein:a	(Landroid/content/Context;)Lein;
    //   30: astore 6
    //   32: aload 6
    //   34: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   37: aload 5
    //   39: ldc 94
    //   41: invokevirtual 97	ein:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   44: ifeq +170 -> 214
    //   47: aload 5
    //   49: invokevirtual 100	eju:a	()Landroid/os/IBinder;
    //   52: invokestatic 105	eyt:a	(Landroid/os/IBinder;)Leys;
    //   55: astore 10
    //   57: new 58	android/os/Bundle
    //   60: dup
    //   61: invokespecial 60	android/os/Bundle:<init>	()V
    //   64: astore 11
    //   66: aload 11
    //   68: ldc_w 263
    //   71: aload_1
    //   72: invokevirtual 74	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: aload 11
    //   77: ldc_w 265
    //   80: aload_2
    //   81: invokevirtual 269	android/os/Bundle:putStringArray	(Ljava/lang/String;[Ljava/lang/String;)V
    //   84: aload 10
    //   86: aload 11
    //   88: invokeinterface 272 2 0
    //   93: astore 12
    //   95: aload 12
    //   97: ifnonnull +42 -> 139
    //   100: new 112	ebe
    //   103: dup
    //   104: ldc 114
    //   106: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: astore 9
    //   112: new 118	java/io/IOException
    //   115: dup
    //   116: ldc 120
    //   118: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   121: athrow
    //   122: astore 8
    //   124: aload 6
    //   126: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   129: aload 5
    //   131: ldc 94
    //   133: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   136: aload 8
    //   138: athrow
    //   139: aload 12
    //   141: ldc_w 274
    //   144: invokevirtual 278	android/os/Bundle:getParcelableArray	(Ljava/lang/String;)[Landroid/os/Parcelable;
    //   147: astore 13
    //   149: aload 13
    //   151: arraylength
    //   152: anewarray 200	android/accounts/Account
    //   155: astore 14
    //   157: iconst_0
    //   158: istore 15
    //   160: iload 15
    //   162: aload 13
    //   164: arraylength
    //   165: if_icmpge +22 -> 187
    //   168: aload 14
    //   170: iload 15
    //   172: aload 13
    //   174: iload 15
    //   176: aaload
    //   177: checkcast 200	android/accounts/Account
    //   180: aastore
    //   181: iinc 15 1
    //   184: goto -24 -> 160
    //   187: aload 6
    //   189: getstatic 32	ebf:b	Landroid/content/ComponentName;
    //   192: aload 5
    //   194: ldc 94
    //   196: invokevirtual 124	ein:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   199: aload 14
    //   201: areturn
    //   202: astore 7
    //   204: new 112	ebe
    //   207: dup
    //   208: ldc 190
    //   210: invokespecial 116	ebe:<init>	(Ljava/lang/String;)V
    //   213: athrow
    //   214: new 118	java/io/IOException
    //   217: dup
    //   218: ldc 196
    //   220: invokespecial 121	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   223: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramContext	Context
    //   0	224	1	paramString	String
    //   0	224	2	paramArrayOfString	String[]
    //   24	169	5	localeju	eju
    //   30	158	6	localein	ein
    //   202	1	7	localInterruptedException	java.lang.InterruptedException
    //   122	15	8	localObject	Object
    //   110	1	9	localRemoteException	android.os.RemoteException
    //   55	30	10	localeys	eys
    //   64	23	11	localBundle1	Bundle
    //   93	47	12	localBundle2	Bundle
    //   147	26	13	arrayOfParcelable	Parcelable[]
    //   155	45	14	arrayOfAccount	Account[]
    //   158	24	15	i	int
    // Exception table:
    //   from	to	target	type
    //   47	95	110	android/os/RemoteException
    //   100	110	110	android/os/RemoteException
    //   139	157	110	android/os/RemoteException
    //   160	181	110	android/os/RemoteException
    //   47	95	122	finally
    //   100	110	122	finally
    //   112	122	122	finally
    //   139	157	122	finally
    //   160	181	122	finally
    //   204	214	122	finally
    //   47	95	202	java/lang/InterruptedException
    //   100	110	202	java/lang/InterruptedException
    //   139	157	202	java/lang/InterruptedException
    //   160	181	202	java/lang/InterruptedException
  }
  
  private static Bundle b(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    try
    {
      Bundle localBundle = a(paramContext, paramAccount, paramString, paramBundle);
      eer.c(paramContext);
      return localBundle;
    }
    catch (ebg localebg)
    {
      eer.a(localebg.a, paramContext);
      throw new ebe("User intervention required. Notification has been pushed.", (byte)0);
    }
    catch (ebh localebh)
    {
      eer.c(paramContext);
      throw new ebe("User intervention required. Notification has been pushed.", (byte)0);
    }
  }
  
  public static Account[] b(Context paramContext, String paramString)
  {
    int i = 1;
    eeo.b(paramContext);
    efj.d(paramString);
    int j;
    int k;
    if (Build.VERSION.SDK_INT >= 22)
    {
      j = i;
      if (j == 0) {
        break label100;
      }
      if (Build.VERSION.SDK_INT < 23) {
        break label63;
      }
      k = i;
      label42:
      if (k == 0) {
        break label69;
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label105;
      }
      return c(paramContext, paramString);
      j = 0;
      break;
      label63:
      k = 0;
      break label42;
      label69:
      switch (Build.VERSION.CODENAME.charAt(0))
      {
      }
      label100:
      i = 0;
    }
    label105:
    return AccountManager.get(paramContext).getAccountsByType(paramString);
  }
  
  private static Account[] c(Context paramContext, String paramString)
  {
    int i = 0;
    ContentProviderClient localContentProviderClient = ((Context)efj.a(paramContext)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
    if (localContentProviderClient == null) {
      return new Account[0];
    }
    try
    {
      Parcelable[] arrayOfParcelable = localContentProviderClient.call("get_accounts", paramString, new Bundle()).getParcelableArray("accounts");
      Account[] arrayOfAccount = new Account[arrayOfParcelable.length];
      while (i < arrayOfParcelable.length)
      {
        arrayOfAccount[i] = ((Account)arrayOfParcelable[i]);
        i++;
      }
      return arrayOfAccount;
    }
    finally
    {
      localContentProviderClient.release();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ebf
 * JD-Core Version:    0.7.0.1
 */