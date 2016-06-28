package com.google.android.apps.plus.locations;

import android.app.IntentService;
import android.content.Intent;
import fsc;
import fwv;

public class GcmLocationReportingSuggestionService
  extends IntentService
{
  private Intent a;
  private fsc b;
  private fwv c;
  
  public GcmLocationReportingSuggestionService()
  {
    super("GcmLocationReportingSuggestionService");
  }
  
  /* Error */
  protected void onHandleIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 23
    //   3: invokevirtual 29	android/content/Intent:hasExtra	(Ljava/lang/String;)Z
    //   6: ifeq +89 -> 95
    //   9: aload_0
    //   10: aload_1
    //   11: putfield 31	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:a	Landroid/content/Intent;
    //   14: aload_0
    //   15: aload_0
    //   16: ldc 33
    //   18: invokestatic 38	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   21: checkcast 33	fwv
    //   24: putfield 40	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:c	Lfwv;
    //   27: aload_0
    //   28: aload_0
    //   29: ldc 42
    //   31: invokestatic 38	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   34: checkcast 42	fsd
    //   37: aload_0
    //   38: ldc 44
    //   40: invokestatic 38	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   43: checkcast 46	fsb
    //   46: invokeinterface 49 2 0
    //   51: invokeinterface 52 1 0
    //   56: putfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   59: aload_0
    //   60: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   63: invokeinterface 59 1 0
    //   68: invokeinterface 64 1 0
    //   73: ifeq +22 -> 95
    //   76: aload_0
    //   77: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   80: ifnull +15 -> 95
    //   83: aload_0
    //   84: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   87: invokeinterface 67 1 0
    //   92: ifne +9 -> 101
    //   95: aload_1
    //   96: invokestatic 72	com/google/android/libraries/social/gcm/GcmBroadcastReceiver:a	(Landroid/content/Intent;)Z
    //   99: pop
    //   100: return
    //   101: aload_0
    //   102: getfield 31	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:a	Landroid/content/Intent;
    //   105: ldc 23
    //   107: invokevirtual 76	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   110: astore_3
    //   111: aload_0
    //   112: ldc 78
    //   114: invokestatic 38	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   117: checkcast 78	giz
    //   120: astore 4
    //   122: aload 4
    //   124: aload_3
    //   125: invokeinterface 81 2 0
    //   130: istore 5
    //   132: iload 5
    //   134: iconst_m1
    //   135: if_icmpne +15 -> 150
    //   138: aload_0
    //   139: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   142: invokeinterface 83 1 0
    //   147: goto -52 -> 95
    //   150: new 85	android/accounts/Account
    //   153: dup
    //   154: aload 4
    //   156: iload 5
    //   158: invokeinterface 88 2 0
    //   163: ldc 90
    //   165: invokeinterface 94 2 0
    //   170: ldc 96
    //   172: invokespecial 99	android/accounts/Account:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: astore 6
    //   177: aload_0
    //   178: getfield 40	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:c	Lfwv;
    //   181: aload_0
    //   182: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   185: aload 6
    //   187: invokeinterface 102 3 0
    //   192: invokevirtual 107	fsg:a	()Lfsh;
    //   195: checkcast 109	fwx
    //   198: invokevirtual 111	fwx:b	()Z
    //   201: ifne +224 -> 425
    //   204: aload_0
    //   205: ldc 113
    //   207: invokestatic 38	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   210: checkcast 113	gxx
    //   213: astore 9
    //   215: new 115	gxw
    //   218: dup
    //   219: aload_0
    //   220: iconst_0
    //   221: invokespecial 118	gxw:<init>	(Landroid/content/Context;I)V
    //   224: astore 10
    //   226: aload 10
    //   228: getstatic 124	gxz:cr	Lgxz;
    //   231: putfield 126	gxw:c	Lgxz;
    //   234: aload 10
    //   236: getstatic 132	gya:M	Lgya;
    //   239: putfield 134	gxw:d	Lgya;
    //   242: aload 9
    //   244: aload 10
    //   246: invokeinterface 137 2 0
    //   251: aload_0
    //   252: invokevirtual 141	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:getResources	()Landroid/content/res/Resources;
    //   255: astore 11
    //   257: aload_0
    //   258: iconst_0
    //   259: invokestatic 147	efj:e	(Landroid/content/Context;I)Landroid/content/Intent;
    //   262: astore 12
    //   264: aload 12
    //   266: ldc 149
    //   268: iconst_1
    //   269: invokevirtual 153	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   272: pop
    //   273: aload 12
    //   275: ldc 155
    //   277: iconst_0
    //   278: invokevirtual 158	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   281: pop
    //   282: aload 12
    //   284: ldc 159
    //   286: invokevirtual 163	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   289: pop
    //   290: aload_0
    //   291: iconst_0
    //   292: aload 12
    //   294: ldc 164
    //   296: invokestatic 170	android/app/PendingIntent:getActivity	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   299: astore 16
    //   301: new 172	dk
    //   304: dup
    //   305: aload_0
    //   306: invokespecial 175	dk:<init>	(Landroid/content/Context;)V
    //   309: astore 17
    //   311: getstatic 179	efj:rQ	I
    //   314: istore 18
    //   316: aload 17
    //   318: getfield 183	dk:x	Landroid/app/Notification;
    //   321: iload 18
    //   323: putfield 188	android/app/Notification:icon	I
    //   326: aload 17
    //   328: aload 11
    //   330: getstatic 193	aau:if	I
    //   333: invokevirtual 199	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   336: invokestatic 202	dk:a	(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   339: putfield 205	dk:b	Ljava/lang/CharSequence;
    //   342: aload 17
    //   344: aload 11
    //   346: getstatic 208	aau:ie	I
    //   349: invokevirtual 199	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   352: invokestatic 202	dk:a	(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   355: putfield 210	dk:c	Ljava/lang/CharSequence;
    //   358: aload 11
    //   360: getstatic 213	aau:ig	I
    //   363: invokevirtual 199	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   366: astore 19
    //   368: aload 17
    //   370: getfield 183	dk:x	Landroid/app/Notification;
    //   373: aload 19
    //   375: invokestatic 202	dk:a	(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   378: putfield 216	android/app/Notification:tickerText	Ljava/lang/CharSequence;
    //   381: invokestatic 222	java/lang/System:currentTimeMillis	()J
    //   384: lstore 20
    //   386: aload 17
    //   388: getfield 183	dk:x	Landroid/app/Notification;
    //   391: lload 20
    //   393: putfield 226	android/app/Notification:when	J
    //   396: aload 17
    //   398: bipush 16
    //   400: iconst_1
    //   401: invokevirtual 229	dk:a	(IZ)V
    //   404: aload 17
    //   406: aload 16
    //   408: putfield 232	dk:d	Landroid/app/PendingIntent;
    //   411: aload_0
    //   412: iconst_0
    //   413: aload 17
    //   415: invokevirtual 235	dk:b	()Landroid/app/Notification;
    //   418: getstatic 240	aaw:gr	I
    //   421: iconst_0
    //   422: invokestatic 245	dmr:a	(Landroid/content/Context;ILandroid/app/Notification;IZ)V
    //   425: aload_0
    //   426: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   429: invokeinterface 83 1 0
    //   434: goto -339 -> 95
    //   437: astore 8
    //   439: aload_0
    //   440: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   443: invokeinterface 83 1 0
    //   448: goto -353 -> 95
    //   451: astore 7
    //   453: aload_0
    //   454: getfield 54	com/google/android/apps/plus/locations/GcmLocationReportingSuggestionService:b	Lfsc;
    //   457: invokeinterface 83 1 0
    //   462: aload 7
    //   464: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	465	0	this	GcmLocationReportingSuggestionService
    //   0	465	1	paramIntent	Intent
    //   110	15	3	str1	java.lang.String
    //   120	35	4	localgiz	giz
    //   130	27	5	i	int
    //   175	11	6	localAccount	android.accounts.Account
    //   451	12	7	localObject	java.lang.Object
    //   437	1	8	localIllegalStateException	java.lang.IllegalStateException
    //   213	30	9	localgxx	gxx
    //   224	21	10	localgxw	gxw
    //   255	104	11	localResources	android.content.res.Resources
    //   262	31	12	localIntent	Intent
    //   299	108	16	localPendingIntent	android.app.PendingIntent
    //   309	105	17	localdk	dk
    //   314	8	18	j	int
    //   366	8	19	str2	java.lang.String
    //   384	8	20	l	long
    // Exception table:
    //   from	to	target	type
    //   177	425	437	java/lang/IllegalStateException
    //   177	425	451	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.locations.GcmLocationReportingSuggestionService
 * JD-Core Version:    0.7.0.1
 */