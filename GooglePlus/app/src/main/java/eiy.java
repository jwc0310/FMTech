import android.os.IBinder;

final class eiy
  implements eiw
{
  private IBinder a;
  
  eiy(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final void a(int paramInt, android.os.Bundle paramBundle)
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
    //   17: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +44 -> 65
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	eiy:a	Landroid/os/IBinder;
    //   39: iconst_2
    //   40: aload_3
    //   41: aload 4
    //   43: iconst_0
    //   44: invokeinterface 44 5 0
    //   49: pop
    //   50: aload 4
    //   52: invokevirtual 47	android/os/Parcel:readException	()V
    //   55: aload 4
    //   57: invokevirtual 50	android/os/Parcel:recycle	()V
    //   60: aload_3
    //   61: invokevirtual 50	android/os/Parcel:recycle	()V
    //   64: return
    //   65: aload_3
    //   66: iconst_0
    //   67: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   70: goto -35 -> 35
    //   73: astore 5
    //   75: aload 4
    //   77: invokevirtual 50	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 50	android/os/Parcel:recycle	()V
    //   84: aload 5
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	eiy
    //   0	87	1	paramInt	int
    //   0	87	2	paramBundle	android.os.Bundle
    //   3	78	3	localParcel1	android.os.Parcel
    //   7	69	4	localParcel2	android.os.Parcel
    //   73	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	73	finally
    //   24	35	73	finally
    //   35	55	73	finally
    //   65	70	73	finally
  }
  
  /* Error */
  public final void a(int paramInt, IBinder paramIBinder, android.os.Bundle paramBundle)
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
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload 4
    //   25: aload_2
    //   26: invokevirtual 54	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   29: aload_3
    //   30: ifnull +48 -> 78
    //   33: aload 4
    //   35: iconst_1
    //   36: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   39: aload_3
    //   40: aload 4
    //   42: iconst_0
    //   43: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   46: aload_0
    //   47: getfield 15	eiy:a	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload 4
    //   53: aload 5
    //   55: iconst_0
    //   56: invokeinterface 44 5 0
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 47	android/os/Parcel:readException	()V
    //   67: aload 5
    //   69: invokevirtual 50	android/os/Parcel:recycle	()V
    //   72: aload 4
    //   74: invokevirtual 50	android/os/Parcel:recycle	()V
    //   77: return
    //   78: aload 4
    //   80: iconst_0
    //   81: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   84: goto -38 -> 46
    //   87: astore 6
    //   89: aload 5
    //   91: invokevirtual 50	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 50	android/os/Parcel:recycle	()V
    //   99: aload 6
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	eiy
    //   0	102	1	paramInt	int
    //   0	102	2	paramIBinder	IBinder
    //   0	102	3	paramBundle	android.os.Bundle
    //   3	92	4	localParcel1	android.os.Parcel
    //   8	82	5	localParcel2	android.os.Parcel
    //   87	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	29	87	finally
    //   33	46	87	finally
    //   46	67	87	finally
    //   78	84	87	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eiy
 * JD-Core Version:    0.7.0.1
 */