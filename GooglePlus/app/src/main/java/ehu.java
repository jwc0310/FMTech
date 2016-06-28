import android.os.IBinder;

final class ehu
  implements ehs
{
  private IBinder a;
  
  ehu(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final android.accounts.Account a()
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	ehu:a	Landroid/os/IBinder;
    //   18: iconst_2
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 34 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 37	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 41	android/os/Parcel:readInt	()I
    //   36: ifeq +28 -> 64
    //   39: getstatic 47	android/accounts/Account:CREATOR	Landroid/os/Parcelable$Creator;
    //   42: aload_2
    //   43: invokeinterface 53 2 0
    //   48: checkcast 43	android/accounts/Account
    //   51: astore 5
    //   53: aload_2
    //   54: invokevirtual 56	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: invokevirtual 56	android/os/Parcel:recycle	()V
    //   61: aload 5
    //   63: areturn
    //   64: aconst_null
    //   65: astore 5
    //   67: goto -14 -> 53
    //   70: astore_3
    //   71: aload_2
    //   72: invokevirtual 56	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: invokevirtual 56	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	ehu
    //   3	73	1	localParcel1	android.os.Parcel
    //   7	65	2	localParcel2	android.os.Parcel
    //   70	10	3	localObject	Object
    //   51	15	5	localAccount	android.accounts.Account
    // Exception table:
    //   from	to	target	type
    //   8	53	70	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehu
 * JD-Core Version:    0.7.0.1
 */