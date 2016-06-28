import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

final class ht
  implements hr
{
  private IBinder a;
  
  ht(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
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
  
  public final void a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      this.a.transact(17, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void a(Uri paramUri, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        if (paramUri != null)
        {
          localParcel1.writeInt(1);
          paramUri.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.a.transact(16, localParcel1, localParcel2, 0);
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
  
  /* Error */
  public final void a(hk paramhk)
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
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 65	hk:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	ht:a	Landroid/os/IBinder;
    //   33: bipush 25
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 41 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 44	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 47	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 47	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 47	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 47	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ht
    //   0	78	1	paramhk	hk
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
  public final void a(ho paramho)
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
    //   19: invokeinterface 72 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 75	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ht:a	Landroid/os/IBinder;
    //   36: iconst_3
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 41 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 44	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 47	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 47	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 47	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ht
    //   0	78	1	paramho	ho
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
  public final void a(String paramString, Bundle paramBundle)
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
    //   16: aload_1
    //   17: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	ht:a	Landroid/os/IBinder;
    //   39: bipush 14
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 41 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 44	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 47	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 47	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 47	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ht
    //   0	88	1	paramString	String
    //   0	88	2	paramBundle	Bundle
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
  
  public final void a(String paramString, Bundle paramBundle, il paramil)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        localParcel1.writeString(paramString);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramil != null)
          {
            localParcel1.writeInt(1);
            paramil.writeToParcel(localParcel1, 0);
            this.a.transact(1, localParcel1, localParcel2, 0);
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
  
  public final boolean a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        if (paramKeyEvent != null)
        {
          localParcel1.writeInt(1);
          paramKeyEvent.writeToParcel(localParcel1, 0);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            return bool;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        bool = false;
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
  
  public final String b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
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
  
  public final void b(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      this.a.transact(24, localParcel1, localParcel2, 0);
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
  public final void b(ho paramho)
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
    //   19: invokeinterface 72 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 75	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	ht:a	Landroid/os/IBinder;
    //   36: iconst_4
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 41 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 44	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 47	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 47	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 47	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ht
    //   0	78	1	paramho	ho
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
  public final void b(String paramString, Bundle paramBundle)
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
    //   16: aload_1
    //   17: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	ht:a	Landroid/os/IBinder;
    //   39: bipush 15
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 41 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 44	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 47	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 47	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 47	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ht
    //   0	88	1	paramString	String
    //   0	88	2	paramBundle	Bundle
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
  
  public final String c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final void c(String paramString, Bundle paramBundle)
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
    //   16: aload_1
    //   17: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	ht:a	Landroid/os/IBinder;
    //   39: bipush 26
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 41 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 44	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 47	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 47	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 47	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ht
    //   0	88	1	paramString	String
    //   0	88	2	paramBundle	Bundle
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
  public final android.app.PendingIntent d()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 8
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 103	android/app/PendingIntent:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 99	android/app/PendingIntent
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localPendingIntent	android.app.PendingIntent
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public final long e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final ip f()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 10
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 119	ip:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 118	ip
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localip	ip
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public final void g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(18, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(19, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(20, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void k()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(21, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(22, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void m()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(23, localParcel1, localParcel2, 0);
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
  public final hh n()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 27
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 131	hh:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 130	hh
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localhh	hh
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  /* Error */
  public final ir o()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 28
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 136	ir:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 135	ir
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localir	ir
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public final List<ij> p()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(29, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.createTypedArrayList(ij.CREATOR);
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final java.lang.CharSequence q()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 30
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 152	android/text/TextUtils:CHAR_SEQUENCE_CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 154	java/lang/CharSequence
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localCharSequence	java.lang.CharSequence
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  /* Error */
  public final Bundle r()
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
    //   15: getfield 15	ht:a	Landroid/os/IBinder;
    //   18: bipush 31
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 41 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 44	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 85	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 157	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 109 2 0
    //   49: checkcast 60	android/os/Bundle
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 47	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 47	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 47	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 47	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ht
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public final int s()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(32, localParcel1, localParcel2, 0);
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
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ht
 * JD-Core Version:    0.7.0.1
 */