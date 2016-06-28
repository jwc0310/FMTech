import android.os.IBinder;

final class eeg
  implements eee
{
  private IBinder a;
  
  eeg(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final void a(eeb parameeb, com.google.android.gms.clearcut.LogEventParcelable paramLogEventParcelable)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_3
    //   5: ldc 24
    //   7: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aconst_null
    //   11: astore 5
    //   13: aload_1
    //   14: ifnull +11 -> 25
    //   17: aload_1
    //   18: invokeinterface 34 1 0
    //   23: astore 5
    //   25: aload_3
    //   26: aload 5
    //   28: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_2
    //   32: ifnull +33 -> 65
    //   35: aload_3
    //   36: iconst_1
    //   37: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   40: aload_2
    //   41: aload_3
    //   42: iconst_0
    //   43: invokevirtual 47	com/google/android/gms/clearcut/LogEventParcelable:writeToParcel	(Landroid/os/Parcel;I)V
    //   46: aload_0
    //   47: getfield 15	eeg:a	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload_3
    //   52: aconst_null
    //   53: iconst_1
    //   54: invokeinterface 53 5 0
    //   59: pop
    //   60: aload_3
    //   61: invokevirtual 56	android/os/Parcel:recycle	()V
    //   64: return
    //   65: aload_3
    //   66: iconst_0
    //   67: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   70: goto -24 -> 46
    //   73: astore 4
    //   75: aload_3
    //   76: invokevirtual 56	android/os/Parcel:recycle	()V
    //   79: aload 4
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	eeg
    //   0	82	1	parameeb	eeb
    //   0	82	2	paramLogEventParcelable	com.google.android.gms.clearcut.LogEventParcelable
    //   3	73	3	localParcel	android.os.Parcel
    //   73	7	4	localObject	Object
    //   11	16	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   4	10	73	finally
    //   17	25	73	finally
    //   25	31	73	finally
    //   35	46	73	finally
    //   46	60	73	finally
    //   65	70	73	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eeg
 * JD-Core Version:    0.7.0.1
 */