import android.accounts.Account;
import android.os.Binder;

public final class ehv
  extends eht
{
  private int a;
  
  /* Error */
  public static Account a(ehs paramehs)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ifnull +22 -> 25
    //   6: invokestatic 15	android/os/Binder:clearCallingIdentity	()J
    //   9: lstore_2
    //   10: aload_0
    //   11: invokeinterface 20 1 0
    //   16: astore 6
    //   18: aload 6
    //   20: astore_1
    //   21: lload_2
    //   22: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   25: aload_1
    //   26: areturn
    //   27: astore 5
    //   29: lload_2
    //   30: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   33: aconst_null
    //   34: areturn
    //   35: astore 4
    //   37: lload_2
    //   38: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   41: aload 4
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	paramehs	ehs
    //   1	25	1	localObject1	Object
    //   9	29	2	l	long
    //   35	7	4	localObject2	Object
    //   27	1	5	localRemoteException	android.os.RemoteException
    //   16	3	6	localAccount	Account
    // Exception table:
    //   from	to	target	type
    //   10	18	27	android/os/RemoteException
    //   10	18	35	finally
  }
  
  public final Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a) {
      return null;
    }
    if (eer.a(null, i))
    {
      this.a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ehv)) {
      return false;
    }
    return null.equals(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehv
 * JD-Core Version:    0.7.0.1
 */