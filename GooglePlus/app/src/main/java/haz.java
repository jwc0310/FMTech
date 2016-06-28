import android.content.SyncResult;

final class haz
{
  public final int a;
  public final SyncResult b;
  private hca c;
  private boolean d;
  
  haz(int paramInt, SyncResult paramSyncResult)
  {
    this.a = paramInt;
    this.b = paramSyncResult;
  }
  
  public final void a()
  {
    try
    {
      this.d = true;
      hca localhca = this.c;
      this.c = null;
      if (localhca != null) {
        localhca.d();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final boolean a(hca paramhca)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	haz:d	Z
    //   6: ifne +14 -> 20
    //   9: aload_0
    //   10: aload_1
    //   11: putfield 25	haz:c	Lhca;
    //   14: iconst_1
    //   15: istore_3
    //   16: aload_0
    //   17: monitorexit
    //   18: iload_3
    //   19: ireturn
    //   20: iconst_0
    //   21: istore_3
    //   22: goto -6 -> 16
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	haz
    //   0	30	1	paramhca	hca
    //   25	4	2	localObject	Object
    //   15	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final hca c()
  {
    try
    {
      hca localhca = this.c;
      return localhca;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     haz
 * JD-Core Version:    0.7.0.1
 */