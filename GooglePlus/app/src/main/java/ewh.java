import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

final class ewh
  implements ewf
{
  private IBinder a;
  
  ewh(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(Bitmap paramBitmap, ewc paramewc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (paramBitmap != null)
        {
          localParcel1.writeInt(1);
          paramBitmap.writeToParcel(localParcel1, 0);
          if (paramewc != null)
          {
            localIBinder = paramewc.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        IBinder localIBinder = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(GoogleHelp paramGoogleHelp, Bitmap paramBitmap, ewc paramewc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (paramGoogleHelp != null)
        {
          localParcel1.writeInt(1);
          paramGoogleHelp.writeToParcel(localParcel1, 0);
          if (paramBitmap != null)
          {
            localParcel1.writeInt(1);
            paramBitmap.writeToParcel(localParcel1, 0);
            if (paramewc == null) {
              break label135;
            }
            localIBinder = paramewc.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
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
      continue;
      label135:
      IBinder localIBinder = null;
    }
  }
  
  public final void a(GoogleHelp paramGoogleHelp, ewc paramewc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (paramGoogleHelp != null)
        {
          localParcel1.writeInt(1);
          paramGoogleHelp.writeToParcel(localParcel1, 0);
          if (paramewc != null)
          {
            localIBinder = paramewc.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        IBinder localIBinder = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public final void a(ewc paramewc)
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
    //   15: ifnull +44 -> 59
    //   18: aload_1
    //   19: invokeinterface 44 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ewh:a	Landroid/os/IBinder;
    //   36: iconst_4
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 53 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 56	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 59	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 59	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 59	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 59	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ewh
    //   0	78	1	paramewc	ewc
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    //   24	37	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	26	65	finally
    //   26	50	65	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public final void b(ewc paramewc)
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
    //   15: ifnull +44 -> 59
    //   18: aload_1
    //   19: invokeinterface 44 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ewh:a	Landroid/os/IBinder;
    //   36: iconst_5
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 53 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 56	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 59	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 59	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 59	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 59	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ewh
    //   0	78	1	paramewc	ewc
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    //   24	37	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	26	65	finally
    //   26	50	65	finally
  }
  
  /* Error */
  public final void c(ewc paramewc)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 44 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ewh:a	Landroid/os/IBinder;
    //   36: bipush 6
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 53 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 56	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 59	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 59	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 59	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	ewh
    //   0	79	1	paramewc	ewc
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ewh
 * JD-Core Version:    0.7.0.1
 */