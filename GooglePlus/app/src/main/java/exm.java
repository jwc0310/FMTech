import android.os.IBinder;

public final class exm
  implements exk
{
  private IBinder a;
  
  public exm(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.api.Status paramStatus, java.util.List<com.google.android.gms.herrevad.PredictedNetworkQuality> paramList)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_3
    //   5: ldc 24
    //   7: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +38 -> 49
    //   14: aload_3
    //   15: iconst_1
    //   16: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_3
    //   21: iconst_0
    //   22: invokevirtual 38	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual 42	android/os/Parcel:writeTypedList	(Ljava/util/List;)V
    //   30: aload_0
    //   31: getfield 15	exm:a	Landroid/os/IBinder;
    //   34: iconst_2
    //   35: aload_3
    //   36: aconst_null
    //   37: iconst_1
    //   38: invokeinterface 48 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 51	android/os/Parcel:recycle	()V
    //   48: return
    //   49: aload_3
    //   50: iconst_0
    //   51: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   54: goto -29 -> 25
    //   57: astore 4
    //   59: aload_3
    //   60: invokevirtual 51	android/os/Parcel:recycle	()V
    //   63: aload 4
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	exm
    //   0	66	1	paramStatus	com.google.android.gms.common.api.Status
    //   0	66	2	paramList	java.util.List<com.google.android.gms.herrevad.PredictedNetworkQuality>
    //   3	57	3	localParcel	android.os.Parcel
    //   57	7	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	10	57	finally
    //   14	25	57	finally
    //   25	44	57	finally
    //   49	54	57	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exm
 * JD-Core Version:    0.7.0.1
 */