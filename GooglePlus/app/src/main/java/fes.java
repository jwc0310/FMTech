public final class fes
{
  private static boolean a = false;
  
  /* Error */
  public static int a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 17
    //   6: invokestatic 23	efj:b	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: getstatic 10	fes:a	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +12 -> 27
    //   18: iconst_0
    //   19: istore 5
    //   21: ldc 2
    //   23: monitorexit
    //   24: iload 5
    //   26: ireturn
    //   27: aload_0
    //   28: invokestatic 28	fit:a	(Landroid/content/Context;)Lfgh;
    //   31: astore 6
    //   33: aload 6
    //   35: invokeinterface 33 1 0
    //   40: invokestatic 36	efj:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast 38	ffa
    //   46: putstatic 42	efj:Cs	Lffa;
    //   49: aload 6
    //   51: invokeinterface 45 1 0
    //   56: astore 8
    //   58: getstatic 49	efj:Ct	Lfje;
    //   61: ifnonnull +14 -> 75
    //   64: aload 8
    //   66: invokestatic 36	efj:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast 51	fje
    //   72: putstatic 49	efj:Ct	Lfje;
    //   75: iconst_1
    //   76: putstatic 10	fes:a	Z
    //   79: iconst_0
    //   80: istore 5
    //   82: goto -61 -> 21
    //   85: astore 4
    //   87: aload 4
    //   89: getfield 54	eep:a	I
    //   92: istore 5
    //   94: goto -73 -> 21
    //   97: astore 7
    //   99: new 56	bm
    //   102: dup
    //   103: aload 7
    //   105: invokespecial 60	bm:<init>	(Landroid/os/RemoteException;)V
    //   108: athrow
    //   109: astore_1
    //   110: ldc 2
    //   112: monitorexit
    //   113: aload_1
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramContext	android.content.Context
    //   109	5	1	localObject	Object
    //   13	2	3	bool	boolean
    //   85	3	4	localeep	eep
    //   19	74	5	i	int
    //   31	19	6	localfgh	fgh
    //   97	7	7	localRemoteException	android.os.RemoteException
    //   56	9	8	localfje	fje
    // Exception table:
    //   from	to	target	type
    //   27	33	85	eep
    //   33	75	97	android/os/RemoteException
    //   3	14	109	finally
    //   27	33	109	finally
    //   33	75	109	finally
    //   75	79	109	finally
    //   87	94	109	finally
    //   99	109	109	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fes
 * JD-Core Version:    0.7.0.1
 */