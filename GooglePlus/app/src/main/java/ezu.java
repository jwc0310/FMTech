import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

final class ezu
  implements ezs
{
  private IBinder a;
  
  ezu(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final int a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
      localParcel1.writeLong(paramLong);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final int a(Account paramAccount, PlaceReport paramPlaceReport)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (paramAccount != null)
        {
          localParcel1.writeInt(1);
          paramAccount.writeToParcel(localParcel1, 0);
          if (paramPlaceReport != null)
          {
            localParcel1.writeInt(1);
            paramPlaceReport.writeToParcel(localParcel1, 0);
            this.a.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final ReportingState a(Account paramAccount)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (paramAccount != null)
        {
          localParcel1.writeInt(1);
          paramAccount.writeToParcel(localParcel1, 0);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            ReportingState localReportingState2 = fdu.a(localParcel2);
            localReportingState1 = localReportingState2;
            return localReportingState1;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        ReportingState localReportingState1 = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final UploadRequestResult a(UploadRequest paramUploadRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (paramUploadRequest != null)
        {
          localParcel1.writeInt(1);
          paramUploadRequest.writeToParcel(localParcel1, 0);
          this.a.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            UploadRequestResult localUploadRequestResult2 = fdx.a(localParcel2);
            localUploadRequestResult1 = localUploadRequestResult2;
            return localUploadRequestResult1;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        UploadRequestResult localUploadRequestResult1 = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public final int b(Account paramAccount)
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
    //   15: ifnull +49 -> 64
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 53	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 59	android/accounts/Account:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	ezu:a	Landroid/os/IBinder;
    //   33: iconst_2
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 38 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 41	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 45	android/os/Parcel:readInt	()I
    //   51: istore 6
    //   53: aload_3
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: iload 6
    //   63: ireturn
    //   64: aload_2
    //   65: iconst_0
    //   66: invokevirtual 53	android/os/Parcel:writeInt	(I)V
    //   69: goto -40 -> 29
    //   72: astore 4
    //   74: aload_3
    //   75: invokevirtual 48	android/os/Parcel:recycle	()V
    //   78: aload_2
    //   79: invokevirtual 48	android/os/Parcel:recycle	()V
    //   82: aload 4
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	ezu
    //   0	85	1	paramAccount	Account
    //   3	76	2	localParcel1	Parcel
    //   7	68	3	localParcel2	Parcel
    //   72	11	4	localObject	Object
    //   51	11	6	i	int
    // Exception table:
    //   from	to	target	type
    //   8	14	72	finally
    //   18	29	72	finally
    //   29	53	72	finally
    //   64	69	72	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezu
 * JD-Core Version:    0.7.0.1
 */