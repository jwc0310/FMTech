import android.os.Bundle;

final class egh
  implements efg, efi
{
  egh(efw paramefw) {}
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.d.a(new ega(this.a));
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	egh:a	Lefw;
    //   4: getfield 39	efw:b	Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 44 1 0
    //   12: aload_0
    //   13: getfield 14	egh:a	Lefw;
    //   16: aload_1
    //   17: invokevirtual 47	efw:a	(Lcom/google/android/gms/common/ConnectionResult;)Z
    //   20: ifeq +30 -> 50
    //   23: aload_0
    //   24: getfield 14	egh:a	Lefw;
    //   27: invokevirtual 50	efw:i	()V
    //   30: aload_0
    //   31: getfield 14	egh:a	Lefw;
    //   34: invokevirtual 53	efw:h	()V
    //   37: aload_0
    //   38: getfield 14	egh:a	Lefw;
    //   41: getfield 39	efw:b	Ljava/util/concurrent/locks/Lock;
    //   44: invokeinterface 56 1 0
    //   49: return
    //   50: aload_0
    //   51: getfield 14	egh:a	Lefw;
    //   54: aload_1
    //   55: invokevirtual 58	efw:b	(Lcom/google/android/gms/common/ConnectionResult;)V
    //   58: goto -21 -> 37
    //   61: astore_2
    //   62: aload_0
    //   63: getfield 14	egh:a	Lefw;
    //   66: getfield 39	efw:b	Ljava/util/concurrent/locks/Lock;
    //   69: invokeinterface 56 1 0
    //   74: aload_2
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	egh
    //   0	76	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   61	14	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	37	61	finally
    //   50	58	61	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egh
 * JD-Core Version:    0.7.0.1
 */