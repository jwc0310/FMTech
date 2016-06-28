import android.os.IBinder;

final class ffr
  implements ffp
{
  private IBinder a;
  
  ffr(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.LatLng a(euz parameuz)
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
    //   15: ifnull +74 -> 89
    //   18: aload_1
    //   19: invokeinterface 34 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ffr:a	Landroid/os/IBinder;
    //   36: iconst_1
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 43 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 46	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 50	android/os/Parcel:readInt	()I
    //   54: istore 7
    //   56: aconst_null
    //   57: astore 8
    //   59: iload 7
    //   61: ifeq +17 -> 78
    //   64: getstatic 56	com/google/android/gms/maps/model/LatLng:CREATOR	Lfkg;
    //   67: pop
    //   68: aload_3
    //   69: invokestatic 61	fkg:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLng;
    //   72: astore 10
    //   74: aload 10
    //   76: astore 8
    //   78: aload_3
    //   79: invokevirtual 64	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 64	android/os/Parcel:recycle	()V
    //   86: aload 8
    //   88: areturn
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -66 -> 26
    //   95: astore 4
    //   97: aload_3
    //   98: invokevirtual 64	android/os/Parcel:recycle	()V
    //   101: aload_2
    //   102: invokevirtual 64	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	ffr
    //   0	108	1	parameuz	euz
    //   3	99	2	localParcel1	android.os.Parcel
    //   7	91	3	localParcel2	android.os.Parcel
    //   95	11	4	localObject1	Object
    //   24	67	5	localIBinder	IBinder
    //   54	6	7	i	int
    //   57	30	8	localObject2	Object
    //   72	3	10	localLatLng	com.google.android.gms.maps.model.LatLng
    // Exception table:
    //   from	to	target	type
    //   8	14	95	finally
    //   18	26	95	finally
    //   26	56	95	finally
    //   64	74	95	finally
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.VisibleRegion a()
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
    //   15: getfield 15	ffr:a	Landroid/os/IBinder;
    //   18: iconst_3
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 43 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 46	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 50	android/os/Parcel:readInt	()I
    //   36: ifeq +28 -> 64
    //   39: getstatic 70	com/google/android/gms/maps/model/VisibleRegion:CREATOR	Lfkr;
    //   42: pop
    //   43: aload_2
    //   44: invokestatic 75	fkr:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/VisibleRegion;
    //   47: astore 7
    //   49: aload 7
    //   51: astore 5
    //   53: aload_2
    //   54: invokevirtual 64	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: invokevirtual 64	android/os/Parcel:recycle	()V
    //   61: aload 5
    //   63: areturn
    //   64: aconst_null
    //   65: astore 5
    //   67: goto -14 -> 53
    //   70: astore_3
    //   71: aload_2
    //   72: invokevirtual 64	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: invokevirtual 64	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	ffr
    //   3	73	1	localParcel1	android.os.Parcel
    //   7	65	2	localParcel2	android.os.Parcel
    //   70	10	3	localObject	Object
    //   51	15	5	localVisibleRegion1	com.google.android.gms.maps.model.VisibleRegion
    //   47	3	7	localVisibleRegion2	com.google.android.gms.maps.model.VisibleRegion
    // Exception table:
    //   from	to	target	type
    //   8	49	70	finally
  }
  
  /* Error */
  public final euz a(com.google.android.gms.maps.model.LatLng paramLatLng)
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
    //   15: ifnull +52 -> 67
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 80	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 84	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	ffr:a	Landroid/os/IBinder;
    //   33: iconst_2
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 43 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 46	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 87	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   51: invokestatic 92	eva:a	(Landroid/os/IBinder;)Leuz;
    //   54: astore 6
    //   56: aload_3
    //   57: invokevirtual 64	android/os/Parcel:recycle	()V
    //   60: aload_2
    //   61: invokevirtual 64	android/os/Parcel:recycle	()V
    //   64: aload 6
    //   66: areturn
    //   67: aload_2
    //   68: iconst_0
    //   69: invokevirtual 80	android/os/Parcel:writeInt	(I)V
    //   72: goto -43 -> 29
    //   75: astore 4
    //   77: aload_3
    //   78: invokevirtual 64	android/os/Parcel:recycle	()V
    //   81: aload_2
    //   82: invokevirtual 64	android/os/Parcel:recycle	()V
    //   85: aload 4
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ffr
    //   0	88	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	79	2	localParcel1	android.os.Parcel
    //   7	71	3	localParcel2	android.os.Parcel
    //   75	11	4	localObject	Object
    //   54	11	6	localeuz	euz
    // Exception table:
    //   from	to	target	type
    //   8	14	75	finally
    //   18	29	75	finally
    //   29	56	75	finally
    //   67	72	75	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ffr
 * JD-Core Version:    0.7.0.1
 */