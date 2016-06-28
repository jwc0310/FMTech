import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;

final class fot
  implements for
{
  private IBinder a;
  
  fot(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
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
  
  public final void a(int paramInt, Account paramAccount, foo paramfoo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        localParcel1.writeInt(paramInt);
        if (paramAccount != null)
        {
          localParcel1.writeInt(1);
          paramAccount.writeToParcel(localParcel1, 0);
          if (paramfoo != null)
          {
            localIBinder = paramfoo.asBinder();
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
  
  public final void a(AuthAccountRequest paramAuthAccountRequest, foo paramfoo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (paramAuthAccountRequest != null)
        {
          localParcel1.writeInt(1);
          paramAuthAccountRequest.writeToParcel(localParcel1, 0);
          if (paramfoo != null)
          {
            localIBinder = paramfoo.asBinder();
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
        IBinder localIBinder = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(ResolveAccountRequest paramResolveAccountRequest, ejc paramejc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (paramResolveAccountRequest != null)
        {
          localParcel1.writeInt(1);
          paramResolveAccountRequest.writeToParcel(localParcel1, 0);
          if (paramejc != null)
          {
            localIBinder = paramejc.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(5, localParcel1, localParcel2, 0);
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
  public final void a(com.google.android.gms.signin.internal.CheckServerAuthResult paramCheckServerAuthResult)
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
    //   15: ifnull +41 -> 56
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 74	com/google/android/gms/signin/internal/CheckServerAuthResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	fot:a	Landroid/os/IBinder;
    //   33: iconst_3
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 37 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 40	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 43	android/os/Parcel:recycle	()V
    //   51: aload_2
    //   52: invokevirtual 43	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_2
    //   57: iconst_0
    //   58: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore 4
    //   66: aload_3
    //   67: invokevirtual 43	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 43	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	fot
    //   0	77	1	paramCheckServerAuthResult	com.google.android.gms.signin.internal.CheckServerAuthResult
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    //   64	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public final void a(RecordConsentRequest paramRecordConsentRequest, foo paramfoo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (paramRecordConsentRequest != null)
        {
          localParcel1.writeInt(1);
          paramRecordConsentRequest.writeToParcel(localParcel1, 0);
          if (paramfoo != null)
          {
            localIBinder = paramfoo.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.a.transact(10, localParcel1, localParcel2, 0);
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
  public final void a(ehs paramehs, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +74 -> 92
    //   21: aload_1
    //   22: invokeinterface 82 1 0
    //   27: astore 7
    //   29: aload 4
    //   31: aload 7
    //   33: invokevirtual 59	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 4
    //   38: iload_2
    //   39: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   42: iconst_0
    //   43: istore 8
    //   45: iload_3
    //   46: ifeq +6 -> 52
    //   49: iconst_1
    //   50: istore 8
    //   52: aload 4
    //   54: iload 8
    //   56: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   59: aload_0
    //   60: getfield 15	fot:a	Landroid/os/IBinder;
    //   63: bipush 9
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 37 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 40	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 43	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: invokevirtual 43	android/os/Parcel:recycle	()V
    //   91: return
    //   92: aconst_null
    //   93: astore 7
    //   95: goto -66 -> 29
    //   98: astore 6
    //   100: aload 5
    //   102: invokevirtual 43	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: invokevirtual 43	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	fot
    //   0	113	1	paramehs	ehs
    //   0	113	2	paramInt	int
    //   0	113	3	paramBoolean	boolean
    //   3	103	4	localParcel1	Parcel
    //   8	93	5	localParcel2	Parcel
    //   98	13	6	localObject	Object
    //   27	67	7	localIBinder	IBinder
    //   43	12	8	i	int
    // Exception table:
    //   from	to	target	type
    //   10	17	98	finally
    //   21	29	98	finally
    //   29	42	98	finally
    //   52	81	98	finally
  }
  
  /* Error */
  public final void a(foo paramfoo)
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
    //   19: invokeinterface 56 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 59	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	fot:a	Landroid/os/IBinder;
    //   36: bipush 11
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 37 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 40	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 43	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 43	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 43	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 43	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	fot
    //   0	79	1	paramfoo	foo
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
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
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
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fot
 * JD-Core Version:    0.7.0.1
 */