import android.os.IBinder;

public final class eje
  implements ejc
{
  private IBinder a;
  
  public eje(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.internal.ResolveAccountResponse paramResolveAccountResponse)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +41 -> 56
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 38	com/google/android/gms/common/internal/ResolveAccountResponse:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	eje:a	Landroid/os/IBinder;
    //   33: iconst_2
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 44 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 47	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 50	android/os/Parcel:recycle	()V
    //   51: aload_2
    //   52: invokevirtual 50	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_2
    //   57: iconst_0
    //   58: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore 4
    //   66: aload_3
    //   67: invokevirtual 50	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 50	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	eje
    //   0	77	1	paramResolveAccountResponse	com.google.android.gms.common.internal.ResolveAccountResponse
    //   3	68	2	localParcel1	android.os.Parcel
    //   7	60	3	localParcel2	android.os.Parcel
    //   64	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eje
 * JD-Core Version:    0.7.0.1
 */