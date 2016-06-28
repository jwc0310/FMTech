final class gkp
  implements gjl
{
  private final fpw a;
  
  gkp(fpw paramfpw)
  {
    this.a = paramfpw;
  }
  
  /* Error */
  public final java.util.List<gjj> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	gkp:a	Lfpw;
    //   4: ldc 24
    //   6: invokeinterface 30 2 0
    //   11: astore_2
    //   12: new 32	java/util/ArrayList
    //   15: dup
    //   16: aload_2
    //   17: arraylength
    //   18: invokespecial 35	java/util/ArrayList:<init>	(I)V
    //   21: astore_3
    //   22: iconst_0
    //   23: istore 4
    //   25: iload 4
    //   27: aload_2
    //   28: arraylength
    //   29: if_icmpge +49 -> 78
    //   32: aload_3
    //   33: new 37	gjj
    //   36: dup
    //   37: new 39	gjk
    //   40: dup
    //   41: aload_2
    //   42: iload 4
    //   44: aaload
    //   45: getfield 45	android/accounts/Account:name	Ljava/lang/String;
    //   48: iload 4
    //   50: invokespecial 48	gjk:<init>	(Ljava/lang/String;I)V
    //   53: invokespecial 51	gjj:<init>	(Lgjk;)V
    //   56: invokeinterface 57 2 0
    //   61: pop
    //   62: iinc 4 1
    //   65: goto -40 -> 25
    //   68: astore_1
    //   69: new 59	gjo
    //   72: dup
    //   73: aload_1
    //   74: invokespecial 62	gjo:<init>	(Ljava/lang/Throwable;)V
    //   77: athrow
    //   78: aload_3
    //   79: areturn
    //   80: astore_1
    //   81: goto -12 -> 69
    //   84: astore_1
    //   85: goto -16 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	gkp
    //   68	6	1	localRemoteException	android.os.RemoteException
    //   80	1	1	localfrv	frv
    //   84	1	1	localfru	fru
    //   11	31	2	arrayOfAccount	android.accounts.Account[]
    //   21	58	3	localArrayList	java.util.ArrayList
    //   23	40	4	i	int
    // Exception table:
    //   from	to	target	type
    //   0	12	68	android/os/RemoteException
    //   0	12	80	frv
    //   0	12	84	fru
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkp
 * JD-Core Version:    0.7.0.1
 */