import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import java.util.List;

final class fbq
  implements fbo
{
  private IBinder a;
  
  fbq(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      this.a.transact(7, localParcel1, localParcel2, 0);
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
  public final void a(int paramInt, android.app.PendingIntent paramPendingIntent)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +44 -> 65
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 50	android/app/PendingIntent:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	fbq:a	Landroid/os/IBinder;
    //   39: iconst_2
    //   40: aload_3
    //   41: aload 4
    //   43: iconst_0
    //   44: invokeinterface 37 5 0
    //   49: pop
    //   50: aload 4
    //   52: invokevirtual 40	android/os/Parcel:readException	()V
    //   55: aload 4
    //   57: invokevirtual 43	android/os/Parcel:recycle	()V
    //   60: aload_3
    //   61: invokevirtual 43	android/os/Parcel:recycle	()V
    //   64: return
    //   65: aload_3
    //   66: iconst_0
    //   67: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   70: goto -35 -> 35
    //   73: astore 5
    //   75: aload 4
    //   77: invokevirtual 43	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 43	android/os/Parcel:recycle	()V
    //   84: aload 5
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	fbq
    //   0	87	1	paramInt	int
    //   0	87	2	paramPendingIntent	android.app.PendingIntent
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    //   73	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	73	finally
    //   24	35	73	finally
    //   35	55	73	finally
    //   65	70	73	finally
  }
  
  /* Error */
  public final void a(int paramInt, com.google.android.gms.photos.autobackup.model.AutoBackupStatus paramAutoBackupStatus)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 54	com/google/android/gms/photos/autobackup/model/AutoBackupStatus:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	fbq:a	Landroid/os/IBinder;
    //   39: bipush 6
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 40	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 43	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fbq
    //   0	88	1	paramInt	int
    //   0	88	2	paramAutoBackupStatus	com.google.android.gms.photos.autobackup.model.AutoBackupStatus
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public final void a(int paramInt, com.google.android.gms.photos.autobackup.model.MediaState paramMediaState)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 58	com/google/android/gms/photos/autobackup/model/MediaState:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	fbq:a	Landroid/os/IBinder;
    //   39: bipush 13
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 40	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 43	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fbq
    //   0	88	1	paramInt	int
    //   0	88	2	paramMediaState	com.google.android.gms.photos.autobackup.model.MediaState
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public final void a(int paramInt, com.google.android.gms.photos.autobackup.model.MigrationStatus paramMigrationStatus)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 62	com/google/android/gms/photos/autobackup/model/MigrationStatus:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	fbq:a	Landroid/os/IBinder;
    //   39: bipush 12
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 40	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 43	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fbq
    //   0	88	1	paramInt	int
    //   0	88	2	paramMigrationStatus	com.google.android.gms.photos.autobackup.model.MigrationStatus
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public final void a(int paramInt, com.google.android.gms.photos.autobackup.model.SyncSettings paramSyncSettings)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 66	com/google/android/gms/photos/autobackup/model/SyncSettings:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	fbq:a	Landroid/os/IBinder;
    //   39: bipush 10
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 40	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 43	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	fbq
    //   0	88	1	paramInt	int
    //   0	88	2	paramSyncSettings	com.google.android.gms.photos.autobackup.model.SyncSettings
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  public final void a(int paramInt, List<AutoBackupSettings> paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeTypedList(paramList);
      this.a.transact(3, localParcel1, localParcel2, 0);
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
  public final void a(int paramInt, boolean paramBoolean, java.lang.String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 5
    //   8: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 6
    //   13: aload 5
    //   15: ldc 24
    //   17: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload 5
    //   22: iload_1
    //   23: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   26: iload_2
    //   27: ifeq +48 -> 75
    //   30: aload 5
    //   32: iload 4
    //   34: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   37: aload 5
    //   39: aload_3
    //   40: invokevirtual 75	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 15	fbq:a	Landroid/os/IBinder;
    //   47: iconst_1
    //   48: aload 5
    //   50: aload 6
    //   52: iconst_0
    //   53: invokeinterface 37 5 0
    //   58: pop
    //   59: aload 6
    //   61: invokevirtual 40	android/os/Parcel:readException	()V
    //   64: aload 6
    //   66: invokevirtual 43	android/os/Parcel:recycle	()V
    //   69: aload 5
    //   71: invokevirtual 43	android/os/Parcel:recycle	()V
    //   74: return
    //   75: iconst_0
    //   76: istore 4
    //   78: goto -48 -> 30
    //   81: astore 7
    //   83: aload 6
    //   85: invokevirtual 43	android/os/Parcel:recycle	()V
    //   88: aload 5
    //   90: invokevirtual 43	android/os/Parcel:recycle	()V
    //   93: aload 7
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	fbq
    //   0	96	1	paramInt	int
    //   0	96	2	paramBoolean	boolean
    //   0	96	3	paramString	java.lang.String
    //   1	76	4	i	int
    //   6	83	5	localParcel1	Parcel
    //   11	73	6	localParcel2	Parcel
    //   81	13	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	26	81	finally
    //   30	64	81	finally
  }
  
  public final void a(Status paramStatus, LocalFolder paramLocalFolder)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
        if (paramStatus != null)
        {
          localParcel1.writeInt(1);
          paramStatus.writeToParcel(localParcel1, 0);
          if (paramLocalFolder != null)
          {
            localParcel1.writeInt(1);
            paramLocalFolder.writeToParcel(localParcel1, 0);
            this.a.transact(5, localParcel1, localParcel2, 0);
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
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  public final void b(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void b(int paramInt, List<LocalFolder> paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeTypedList(paramList);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void c(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void d(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      localParcel1.writeInt(paramInt);
      this.a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbq
 * JD-Core Version:    0.7.0.1
 */