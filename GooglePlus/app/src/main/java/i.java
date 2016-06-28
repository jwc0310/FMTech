import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class i
  implements g
{
  private IBinder a;
  
  i(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final Bundle a(String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        localParcel1.writeString(paramString);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          this.a.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
            return localBundle;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        Bundle localBundle = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final boolean a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      localParcel1.writeLong(paramLong);
      this.a.transact(2, localParcel1, localParcel2, 0);
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
  
  /* Error */
  public final boolean a(d paramd)
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
    //   15: ifnull +63 -> 78
    //   18: aload_1
    //   19: invokeinterface 79 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 82	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	i:a	Landroid/os/IBinder;
    //   36: iconst_3
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 47 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 50	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 54	android/os/Parcel:readInt	()I
    //   54: istore 7
    //   56: iconst_0
    //   57: istore 8
    //   59: iload 7
    //   61: ifeq +6 -> 67
    //   64: iconst_1
    //   65: istore 8
    //   67: aload_3
    //   68: invokevirtual 67	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 67	android/os/Parcel:recycle	()V
    //   75: iload 8
    //   77: ireturn
    //   78: aconst_null
    //   79: astore 5
    //   81: goto -55 -> 26
    //   84: astore 4
    //   86: aload_3
    //   87: invokevirtual 67	android/os/Parcel:recycle	()V
    //   90: aload_2
    //   91: invokevirtual 67	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	i
    //   0	97	1	paramd	d
    //   3	88	2	localParcel1	Parcel
    //   7	80	3	localParcel2	Parcel
    //   84	11	4	localObject	Object
    //   24	56	5	localIBinder	IBinder
    //   54	6	7	i	int
    //   57	19	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	14	84	finally
    //   18	26	84	finally
    //   26	56	84	finally
  }
  
  public final boolean a(d paramd, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        IBinder localIBinder;
        if (paramd != null)
        {
          localIBinder = paramd.asBinder();
          localParcel1.writeStrongBinder(localIBinder);
          if (paramUri != null)
          {
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label156;
            }
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            localParcel1.writeTypedList(paramList);
            this.a.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            if (i == 0) {
              break label165;
            }
            return bool;
          }
        }
        else
        {
          localIBinder = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label156:
      continue;
      label165:
      bool = false;
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     i
 * JD-Core Version:    0.7.0.1
 */