import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

final class fcu
  implements fcs
{
  private IBinder a;
  
  fcu(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final android.location.Location a()
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
    //   15: getfield 15	fcu:a	Landroid/os/IBinder;
    //   18: bipush 7
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 34 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 37	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 41	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 47	android/location/Location:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 53 2 0
    //   49: checkcast 43	android/location/Location
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 56	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 56	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 56	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 56	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	fcu
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localLocation	android.location.Location
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public final Status a(GestureRequest paramGestureRequest, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramGestureRequest != null)
        {
          localParcel1.writeInt(1);
          paramGestureRequest.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.a.transact(60, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() == 0) {
              break label131;
            }
            localStatus = (Status)Status.CREATOR.createFromParcel(localParcel2);
            return localStatus;
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
      label131:
      Status localStatus = null;
    }
  }
  
  /* Error */
  public final com.google.android.gms.location.ActivityRecognitionResult a(String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 77	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 15	fcu:a	Landroid/os/IBinder;
    //   23: bipush 64
    //   25: aload_2
    //   26: aload_3
    //   27: iconst_0
    //   28: invokeinterface 34 5 0
    //   33: pop
    //   34: aload_3
    //   35: invokevirtual 37	android/os/Parcel:readException	()V
    //   38: aload_3
    //   39: invokevirtual 41	android/os/Parcel:readInt	()I
    //   42: ifeq +28 -> 70
    //   45: getstatic 82	com/google/android/gms/location/ActivityRecognitionResult:CREATOR	Lfbv;
    //   48: pop
    //   49: aload_3
    //   50: invokestatic 87	fbv:a	(Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;
    //   53: astore 8
    //   55: aload 8
    //   57: astore 6
    //   59: aload_3
    //   60: invokevirtual 56	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 56	android/os/Parcel:recycle	()V
    //   67: aload 6
    //   69: areturn
    //   70: aconst_null
    //   71: astore 6
    //   73: goto -14 -> 59
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 56	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	fcu
    //   0	89	1	paramString	String
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   57	15	6	localActivityRecognitionResult1	com.google.android.gms.location.ActivityRecognitionResult
    //   53	3	8	localActivityRecognitionResult2	com.google.android.gms.location.ActivityRecognitionResult
    // Exception table:
    //   from	to	target	type
    //   8	55	76	finally
  }
  
  /* Error */
  public final void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 7
    //   13: aload 6
    //   15: ldc 24
    //   17: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload 6
    //   22: lload_1
    //   23: invokevirtual 92	android/os/Parcel:writeLong	(J)V
    //   26: iload_3
    //   27: ifeq +61 -> 88
    //   30: aload 6
    //   32: iload 5
    //   34: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   37: aload 4
    //   39: ifnull +55 -> 94
    //   42: aload 6
    //   44: iconst_1
    //   45: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   48: aload 4
    //   50: aload 6
    //   52: iconst_0
    //   53: invokevirtual 70	android/app/PendingIntent:writeToParcel	(Landroid/os/Parcel;I)V
    //   56: aload_0
    //   57: getfield 15	fcu:a	Landroid/os/IBinder;
    //   60: iconst_5
    //   61: aload 6
    //   63: aload 7
    //   65: iconst_0
    //   66: invokeinterface 34 5 0
    //   71: pop
    //   72: aload 7
    //   74: invokevirtual 37	android/os/Parcel:readException	()V
    //   77: aload 7
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload 6
    //   84: invokevirtual 56	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 5
    //   91: goto -61 -> 30
    //   94: aload 6
    //   96: iconst_0
    //   97: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   100: goto -44 -> 56
    //   103: astore 8
    //   105: aload 7
    //   107: invokevirtual 56	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: invokevirtual 56	android/os/Parcel:recycle	()V
    //   115: aload 8
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	fcu
    //   0	118	1	paramLong	long
    //   0	118	3	paramBoolean	boolean
    //   0	118	4	paramPendingIntent	PendingIntent
    //   1	89	5	i	int
    //   6	105	6	localParcel1	Parcel
    //   11	95	7	localParcel2	Parcel
    //   103	13	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	26	103	finally
    //   30	37	103	finally
    //   42	56	103	finally
    //   56	77	103	finally
    //   94	100	103	finally
  }
  
  /* Error */
  public final void a(PendingIntent paramPendingIntent)
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
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 70	android/app/PendingIntent:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	fcu:a	Landroid/os/IBinder;
    //   33: bipush 6
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 56	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 56	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 56	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 56	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	fcu
    //   0	78	1	paramPendingIntent	PendingIntent
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  public final void a(PendingIntent paramPendingIntent, fcp paramfcp, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          if (paramfcp != null)
          {
            localIBinder = paramfcp.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.a.transact(2, localParcel1, localParcel2, 0);
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
  public final void a(android.location.Location paramLocation)
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
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 105	android/location/Location:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	fcu:a	Landroid/os/IBinder;
    //   33: bipush 13
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 56	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 56	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 56	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 56	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	fcu
    //   0	78	1	paramLocation	android.location.Location
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  /* Error */
  public final void a(android.location.Location paramLocation, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +50 -> 66
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 105	android/location/Location:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: iload_2
    //   32: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 15	fcu:a	Landroid/os/IBinder;
    //   39: bipush 26
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 34 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 37	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 56	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 56	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   71: goto -41 -> 30
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 56	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 56	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fcu
    //   0	88	1	paramLocation	android.location.Location
    //   0	88	2	paramInt	int
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	30	74	finally
    //   30	56	74	finally
    //   66	71	74	finally
  }
  
  public final void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, fcp paramfcp)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramGeofencingRequest != null)
        {
          localParcel1.writeInt(1);
          paramGeofencingRequest.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            if (paramfcp == null) {
              break label136;
            }
            localIBinder = paramfcp.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(57, localParcel1, localParcel2, 0);
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
      label136:
      IBinder localIBinder = null;
    }
  }
  
  public final void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.a.transact(9, localParcel1, localParcel2, 0);
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
    }
  }
  
  public final void a(LocationRequest paramLocationRequest, fed paramfed)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (paramfed != null)
          {
            localIBinder = paramfed.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(8, localParcel1, localParcel2, 0);
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
  
  public final void a(LocationRequest paramLocationRequest, fed paramfed, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (paramfed != null)
          {
            localIBinder = paramfed.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.a.transact(20, localParcel1, localParcel2, 0);
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
  
  public final void a(LocationSettingsRequest paramLocationSettingsRequest, fcv paramfcv, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationSettingsRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationSettingsRequest.writeToParcel(localParcel1, 0);
          if (paramfcv != null)
          {
            localIBinder = paramfcv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.a.transact(63, localParcel1, localParcel2, 0);
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
  
  public final void a(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequestInternal != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequestInternal.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.a.transact(53, localParcel1, localParcel2, 0);
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
    }
  }
  
  public final void a(LocationRequestInternal paramLocationRequestInternal, fed paramfed)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequestInternal != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequestInternal.writeToParcel(localParcel1, 0);
          if (paramfed != null)
          {
            localIBinder = paramfed.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(52, localParcel1, localParcel2, 0);
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
  public final void a(com.google.android.gms.location.internal.LocationRequestUpdateData paramLocationRequestUpdateData)
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
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 135	com/google/android/gms/location/internal/LocationRequestUpdateData:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	fcu:a	Landroid/os/IBinder;
    //   33: bipush 59
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 56	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 56	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 56	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 56	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	fcu
    //   0	78	1	paramLocationRequestUpdateData	com.google.android.gms.location.internal.LocationRequestUpdateData
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  /* Error */
  public final void a(fcp paramfcp, String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +52 -> 68
    //   19: aload_1
    //   20: invokeinterface 100 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 103	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: aload_2
    //   35: invokevirtual 77	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: getfield 15	fcu:a	Landroid/os/IBinder;
    //   42: iconst_4
    //   43: aload_3
    //   44: aload 4
    //   46: iconst_0
    //   47: invokeinterface 34 5 0
    //   52: pop
    //   53: aload 4
    //   55: invokevirtual 37	android/os/Parcel:readException	()V
    //   58: aload 4
    //   60: invokevirtual 56	android/os/Parcel:recycle	()V
    //   63: aload_3
    //   64: invokevirtual 56	android/os/Parcel:recycle	()V
    //   67: return
    //   68: aconst_null
    //   69: astore 6
    //   71: goto -44 -> 27
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 56	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 56	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fcu
    //   0	88	1	paramfcp	fcp
    //   0	88	2	paramString	String
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    //   25	45	6	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	27	74	finally
    //   27	58	74	finally
  }
  
  /* Error */
  public final void a(fed paramfed)
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
    //   19: invokeinterface 118 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 103	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	fcu:a	Landroid/os/IBinder;
    //   36: bipush 10
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 56	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 56	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 56	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 56	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	fcu
    //   0	79	1	paramfed	fed
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
  
  public final void a(List<ParcelableGeofence> paramList, PendingIntent paramPendingIntent, fcp paramfcp, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeTypedList(paramList);
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          if (paramfcp != null)
          {
            localIBinder = paramfcp.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
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
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final void a(String[] paramArrayOfString, fcp paramfcp, String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: aload_1
    //   20: invokevirtual 148	android/os/Parcel:writeStringArray	([Ljava/lang/String;)V
    //   23: aload_2
    //   24: ifnull +56 -> 80
    //   27: aload_2
    //   28: invokeinterface 100 1 0
    //   33: astore 7
    //   35: aload 4
    //   37: aload 7
    //   39: invokevirtual 103	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload 4
    //   44: aload_3
    //   45: invokevirtual 77	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   48: aload_0
    //   49: getfield 15	fcu:a	Landroid/os/IBinder;
    //   52: iconst_3
    //   53: aload 4
    //   55: aload 5
    //   57: iconst_0
    //   58: invokeinterface 34 5 0
    //   63: pop
    //   64: aload 5
    //   66: invokevirtual 37	android/os/Parcel:readException	()V
    //   69: aload 5
    //   71: invokevirtual 56	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: invokevirtual 56	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore 7
    //   83: goto -48 -> 35
    //   86: astore 6
    //   88: aload 5
    //   90: invokevirtual 56	android/os/Parcel:recycle	()V
    //   93: aload 4
    //   95: invokevirtual 56	android/os/Parcel:recycle	()V
    //   98: aload 6
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	fcu
    //   0	101	1	paramArrayOfString	String[]
    //   0	101	2	paramfcp	fcp
    //   0	101	3	paramString	String
    //   3	91	4	localParcel1	Parcel
    //   8	81	5	localParcel2	Parcel
    //   86	13	6	localObject	Object
    //   33	49	7	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   10	23	86	finally
    //   27	35	86	finally
    //   35	69	86	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public final android.location.Location b(String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 77	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 15	fcu:a	Landroid/os/IBinder;
    //   23: bipush 21
    //   25: aload_2
    //   26: aload_3
    //   27: iconst_0
    //   28: invokeinterface 34 5 0
    //   33: pop
    //   34: aload_3
    //   35: invokevirtual 37	android/os/Parcel:readException	()V
    //   38: aload_3
    //   39: invokevirtual 41	android/os/Parcel:readInt	()I
    //   42: ifeq +28 -> 70
    //   45: getstatic 47	android/location/Location:CREATOR	Landroid/os/Parcelable$Creator;
    //   48: aload_3
    //   49: invokeinterface 53 2 0
    //   54: checkcast 43	android/location/Location
    //   57: astore 6
    //   59: aload_3
    //   60: invokevirtual 56	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 56	android/os/Parcel:recycle	()V
    //   67: aload 6
    //   69: areturn
    //   70: aconst_null
    //   71: astore 6
    //   73: goto -14 -> 59
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 56	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	fcu
    //   0	89	1	paramString	String
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   57	15	6	localLocation	android.location.Location
    // Exception table:
    //   from	to	target	type
    //   8	59	76	finally
  }
  
  public final IBinder b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.a.transact(51, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      return localIBinder;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final Status b(PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          this.a.transact(65, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localStatus = (Status)Status.CREATOR.createFromParcel(localParcel2);
            return localStatus;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        Status localStatus = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final Status c(PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          this.a.transact(66, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localStatus = (Status)Status.CREATOR.createFromParcel(localParcel2);
            return localStatus;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        Status localStatus = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public final com.google.android.gms.location.LocationAvailability c(String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 77	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 15	fcu:a	Landroid/os/IBinder;
    //   23: bipush 34
    //   25: aload_2
    //   26: aload_3
    //   27: iconst_0
    //   28: invokeinterface 34 5 0
    //   33: pop
    //   34: aload_3
    //   35: invokevirtual 37	android/os/Parcel:readException	()V
    //   38: aload_3
    //   39: invokevirtual 41	android/os/Parcel:readInt	()I
    //   42: ifeq +28 -> 70
    //   45: getstatic 161	com/google/android/gms/location/LocationAvailability:CREATOR	Lfca;
    //   48: pop
    //   49: aload_3
    //   50: invokestatic 166	fca:a	(Landroid/os/Parcel;)Lcom/google/android/gms/location/LocationAvailability;
    //   53: astore 8
    //   55: aload 8
    //   57: astore 6
    //   59: aload_3
    //   60: invokevirtual 56	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 56	android/os/Parcel:recycle	()V
    //   67: aload 6
    //   69: areturn
    //   70: aconst_null
    //   71: astore 6
    //   73: goto -14 -> 59
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 56	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	fcu
    //   0	89	1	paramString	String
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   57	15	6	localLocationAvailability1	com.google.android.gms.location.LocationAvailability
    //   53	3	8	localLocationAvailability2	com.google.android.gms.location.LocationAvailability
    // Exception table:
    //   from	to	target	type
    //   8	55	76	finally
  }
  
  public final Status d(PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          this.a.transact(61, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localStatus = (Status)Status.CREATOR.createFromParcel(localParcel2);
            return localStatus;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        Status localStatus = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public final void e(PendingIntent paramPendingIntent)
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
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 70	android/app/PendingIntent:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	fcu:a	Landroid/os/IBinder;
    //   33: bipush 11
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 56	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 56	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 56	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 56	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	fcu
    //   0	78	1	paramPendingIntent	PendingIntent
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcu
 * JD-Core Version:    0.7.0.1
 */