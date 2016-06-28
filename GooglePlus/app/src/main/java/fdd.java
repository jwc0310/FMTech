import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;

public final class fdd
  extends fcj
{
  public final fcy b = new fcy(paramContext, this.a);
  
  public fdd(Context paramContext, Looper paramLooper, efg paramefg, efi paramefi, String paramString, ehq paramehq)
  {
    this(paramContext, paramLooper, paramefg, paramefi, paramString, paramehq, CopresenceApiOptions.a);
  }
  
  private fdd(Context paramContext, Looper paramLooper, efg paramefg, efi paramefi, String paramString, ehq paramehq, CopresenceApiOptions paramCopresenceApiOptions)
  {
    super(paramContext, paramLooper, paramefg, paramefi, paramString, paramehq);
    new fci(paramContext, paramehq.a(), paramehq.e, this.a, paramCopresenceApiOptions);
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	fdd:b	Lfcy;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: invokevirtual 52	fdd:g	()Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifeq +133 -> 146
    //   16: aload_0
    //   17: getfield 29	fdd:b	Lfcy;
    //   20: astore 6
    //   22: aload 6
    //   24: getfield 56	fcy:c	Ljava/util/Map;
    //   27: astore 8
    //   29: aload 8
    //   31: monitorenter
    //   32: aload 6
    //   34: getfield 56	fcy:c	Ljava/util/Map;
    //   37: invokeinterface 62 1 0
    //   42: invokeinterface 68 1 0
    //   47: astore 10
    //   49: aload 10
    //   51: invokeinterface 73 1 0
    //   56: ifeq +97 -> 153
    //   59: aload 10
    //   61: invokeinterface 77 1 0
    //   66: checkcast 79	fdc
    //   69: astore 16
    //   71: aload 16
    //   73: ifnull -24 -> 49
    //   76: aload 6
    //   78: getfield 80	fcy:a	Lfdh;
    //   81: invokevirtual 85	fdh:a	()Landroid/os/IInterface;
    //   84: checkcast 87	fcs
    //   87: new 89	com/google/android/gms/location/internal/LocationRequestUpdateData
    //   90: dup
    //   91: iconst_1
    //   92: iconst_2
    //   93: aconst_null
    //   94: aload 16
    //   96: invokeinterface 95 1 0
    //   101: aconst_null
    //   102: aconst_null
    //   103: invokespecial 98	com/google/android/gms/location/internal/LocationRequestUpdateData:<init>	(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V
    //   106: invokeinterface 101 2 0
    //   111: goto -62 -> 49
    //   114: astore 9
    //   116: aload 8
    //   118: monitorexit
    //   119: aload 9
    //   121: athrow
    //   122: astore 7
    //   124: new 103	java/lang/IllegalStateException
    //   127: dup
    //   128: aload 7
    //   130: invokespecial 106	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   133: athrow
    //   134: astore 4
    //   136: ldc 108
    //   138: ldc 110
    //   140: aload 4
    //   142: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   145: pop
    //   146: aload_0
    //   147: invokespecial 117	fcj:a	()V
    //   150: aload_1
    //   151: monitorexit
    //   152: return
    //   153: aload 6
    //   155: getfield 56	fcy:c	Ljava/util/Map;
    //   158: invokeinterface 120 1 0
    //   163: aload 6
    //   165: getfield 123	fcy:d	Ljava/util/Map;
    //   168: invokeinterface 62 1 0
    //   173: invokeinterface 68 1 0
    //   178: astore 11
    //   180: aload 11
    //   182: invokeinterface 73 1 0
    //   187: ifeq +44 -> 231
    //   190: aload 11
    //   192: invokeinterface 77 1 0
    //   197: checkcast 125	fcz
    //   200: astore 15
    //   202: aload 15
    //   204: ifnull -24 -> 180
    //   207: aload 6
    //   209: getfield 80	fcy:a	Lfdh;
    //   212: invokevirtual 85	fdh:a	()Landroid/os/IInterface;
    //   215: checkcast 87	fcs
    //   218: aload 15
    //   220: invokestatic 128	com/google/android/gms/location/internal/LocationRequestUpdateData:a	(Lfea;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    //   223: invokeinterface 101 2 0
    //   228: goto -48 -> 180
    //   231: aload 6
    //   233: getfield 123	fcy:d	Ljava/util/Map;
    //   236: invokeinterface 120 1 0
    //   241: aload 8
    //   243: monitorexit
    //   244: aload_0
    //   245: getfield 29	fdd:b	Lfcy;
    //   248: astore 12
    //   250: aload 12
    //   252: getfield 131	fcy:b	Z
    //   255: istore 13
    //   257: iload 13
    //   259: ifeq -113 -> 146
    //   262: aload 12
    //   264: getfield 80	fcy:a	Lfdh;
    //   267: invokevirtual 133	fdh:b	()V
    //   270: aload 12
    //   272: getfield 80	fcy:a	Lfdh;
    //   275: invokevirtual 85	fdh:a	()Landroid/os/IInterface;
    //   278: checkcast 87	fcs
    //   281: iconst_0
    //   282: invokeinterface 136 2 0
    //   287: aload 12
    //   289: iconst_0
    //   290: putfield 131	fcy:b	Z
    //   293: goto -147 -> 146
    //   296: astore 14
    //   298: new 103	java/lang/IllegalStateException
    //   301: dup
    //   302: aload 14
    //   304: invokespecial 106	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   307: athrow
    //   308: astore_2
    //   309: aload_1
    //   310: monitorexit
    //   311: aload_2
    //   312: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	313	0	this	fdd
    //   4	306	1	localfcy1	fcy
    //   308	4	2	localObject1	java.lang.Object
    //   11	2	3	bool1	boolean
    //   134	7	4	localException	java.lang.Exception
    //   20	212	6	localfcy2	fcy
    //   122	7	7	localRemoteException1	android.os.RemoteException
    //   114	6	9	localObject2	java.lang.Object
    //   47	13	10	localIterator1	java.util.Iterator
    //   178	13	11	localIterator2	java.util.Iterator
    //   248	40	12	localfcy3	fcy
    //   255	3	13	bool2	boolean
    //   296	7	14	localRemoteException2	android.os.RemoteException
    //   200	19	15	localfcz	fcz
    //   69	26	16	localfdc	fdc
    // Exception table:
    //   from	to	target	type
    //   32	49	114	finally
    //   49	71	114	finally
    //   76	111	114	finally
    //   116	119	114	finally
    //   153	180	114	finally
    //   180	202	114	finally
    //   207	228	114	finally
    //   231	244	114	finally
    //   22	32	122	android/os/RemoteException
    //   119	122	122	android/os/RemoteException
    //   16	22	134	java/lang/Exception
    //   22	32	134	java/lang/Exception
    //   119	122	134	java/lang/Exception
    //   124	134	134	java/lang/Exception
    //   244	257	134	java/lang/Exception
    //   262	293	134	java/lang/Exception
    //   298	308	134	java/lang/Exception
    //   262	293	296	android/os/RemoteException
    //   7	12	308	finally
    //   16	22	308	finally
    //   22	32	308	finally
    //   119	122	308	finally
    //   124	134	308	finally
    //   136	146	308	finally
    //   146	152	308	finally
    //   244	257	308	finally
    //   262	293	308	finally
    //   298	308	308	finally
    //   309	311	308	finally
  }
  
  public final boolean m()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdd
 * JD-Core Version:    0.7.0.1
 */