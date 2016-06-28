import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

final class fgj
  implements fgh
{
  private IBinder a;
  
  fgj(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final ffa a()
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
    //   15: getfield 15	fgj:a	Landroid/os/IBinder;
    //   18: iconst_4
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 34 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 37	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   36: astore 5
    //   38: aload 5
    //   40: ifnonnull +17 -> 57
    //   43: aconst_null
    //   44: astore 7
    //   46: aload_2
    //   47: invokevirtual 44	android/os/Parcel:recycle	()V
    //   50: aload_1
    //   51: invokevirtual 44	android/os/Parcel:recycle	()V
    //   54: aload 7
    //   56: areturn
    //   57: aload 5
    //   59: ldc 46
    //   61: invokeinterface 50 2 0
    //   66: astore 6
    //   68: aload 6
    //   70: ifnull +21 -> 91
    //   73: aload 6
    //   75: instanceof 52
    //   78: ifeq +13 -> 91
    //   81: aload 6
    //   83: checkcast 52	ffa
    //   86: astore 7
    //   88: goto -42 -> 46
    //   91: new 54	ffc
    //   94: dup
    //   95: aload 5
    //   97: invokespecial 56	ffc:<init>	(Landroid/os/IBinder;)V
    //   100: astore 7
    //   102: goto -56 -> 46
    //   105: astore_3
    //   106: aload_2
    //   107: invokevirtual 44	android/os/Parcel:recycle	()V
    //   110: aload_1
    //   111: invokevirtual 44	android/os/Parcel:recycle	()V
    //   114: aload_3
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	fgj
    //   3	108	1	localParcel1	Parcel
    //   7	100	2	localParcel2	Parcel
    //   105	10	3	localObject1	Object
    //   36	60	5	localIBinder	IBinder
    //   66	16	6	localIInterface	IInterface
    //   44	57	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   8	38	105	finally
    //   57	68	105	finally
    //   73	88	105	finally
    //   91	102	105	finally
  }
  
  public final ffm a(euz parameuz, GoogleMapOptions paramGoogleMapOptions)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      IBinder localIBinder2;
      Object localObject2;
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        IBinder localIBinder1;
        if (parameuz != null)
        {
          localIBinder1 = parameuz.asBinder();
          localParcel1.writeStrongBinder(localIBinder1);
          if (paramGoogleMapOptions != null)
          {
            localParcel1.writeInt(1);
            paramGoogleMapOptions.writeToParcel(localParcel1, 0);
            this.a.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
            localIBinder2 = localParcel2.readStrongBinder();
            localObject2 = null;
            if (localIBinder2 != null) {
              break label123;
            }
            return localObject2;
          }
        }
        else
        {
          localIBinder1 = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localIInterface = localIBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label123:
      IInterface localIInterface;
      if ((localIInterface != null) && ((localIInterface instanceof ffm))) {
        localObject2 = (ffm)localIInterface;
      } else {
        localObject2 = new ffo(localIBinder2);
      }
    }
  }
  
  public final ffy a(euz parameuz, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      IBinder localIBinder2;
      Object localObject2;
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        IBinder localIBinder1;
        if (parameuz != null)
        {
          localIBinder1 = parameuz.asBinder();
          localParcel1.writeStrongBinder(localIBinder1);
          if (paramStreetViewPanoramaOptions != null)
          {
            localParcel1.writeInt(1);
            paramStreetViewPanoramaOptions.writeToParcel(localParcel1, 0);
            this.a.transact(7, localParcel1, localParcel2, 0);
            localParcel2.readException();
            localIBinder2 = localParcel2.readStrongBinder();
            localObject2 = null;
            if (localIBinder2 != null) {
              break label124;
            }
            return localObject2;
          }
        }
        else
        {
          localIBinder1 = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localIInterface = localIBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label124:
      IInterface localIInterface;
      if ((localIInterface != null) && ((localIInterface instanceof ffy))) {
        localObject2 = (ffy)localIInterface;
      } else {
        localObject2 = new fga(localIBinder2);
      }
    }
  }
  
  /* Error */
  public final void a(euz parameuz)
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
    //   19: invokeinterface 62 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 65	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	fgj:a	Landroid/os/IBinder;
    //   36: iconst_1
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 44	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 44	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 44	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 44	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	fgj
    //   0	78	1	parameuz	euz
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
  public final void a(euz parameuz, int paramInt)
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
    //   16: ifnull +53 -> 69
    //   19: aload_1
    //   20: invokeinterface 62 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 65	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: iload_2
    //   35: invokevirtual 69	android/os/Parcel:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 15	fgj:a	Landroid/os/IBinder;
    //   42: bipush 6
    //   44: aload_3
    //   45: aload 4
    //   47: iconst_0
    //   48: invokeinterface 34 5 0
    //   53: pop
    //   54: aload 4
    //   56: invokevirtual 37	android/os/Parcel:readException	()V
    //   59: aload 4
    //   61: invokevirtual 44	android/os/Parcel:recycle	()V
    //   64: aload_3
    //   65: invokevirtual 44	android/os/Parcel:recycle	()V
    //   68: return
    //   69: aconst_null
    //   70: astore 6
    //   72: goto -45 -> 27
    //   75: astore 5
    //   77: aload 4
    //   79: invokevirtual 44	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 44	android/os/Parcel:recycle	()V
    //   86: aload 5
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	fgj
    //   0	89	1	parameuz	euz
    //   0	89	2	paramInt	int
    //   3	80	3	localParcel1	Parcel
    //   7	71	4	localParcel2	Parcel
    //   75	12	5	localObject	Object
    //   25	46	6	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	75	finally
    //   19	27	75	finally
    //   27	59	75	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public final ffj b(euz parameuz)
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
    //   15: ifnull +60 -> 75
    //   18: aload_1
    //   19: invokeinterface 62 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 65	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	fgj:a	Landroid/os/IBinder;
    //   36: iconst_2
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   54: astore 7
    //   56: aconst_null
    //   57: astore 8
    //   59: aload 7
    //   61: ifnonnull +20 -> 81
    //   64: aload_3
    //   65: invokevirtual 44	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 44	android/os/Parcel:recycle	()V
    //   72: aload 8
    //   74: areturn
    //   75: aconst_null
    //   76: astore 5
    //   78: goto -52 -> 26
    //   81: aload 7
    //   83: ldc 99
    //   85: invokeinterface 50 2 0
    //   90: astore 9
    //   92: aload 9
    //   94: ifnull +21 -> 115
    //   97: aload 9
    //   99: instanceof 101
    //   102: ifeq +13 -> 115
    //   105: aload 9
    //   107: checkcast 101	ffj
    //   110: astore 8
    //   112: goto -48 -> 64
    //   115: new 103	ffl
    //   118: dup
    //   119: aload 7
    //   121: invokespecial 104	ffl:<init>	(Landroid/os/IBinder;)V
    //   124: astore 8
    //   126: goto -62 -> 64
    //   129: astore 4
    //   131: aload_3
    //   132: invokevirtual 44	android/os/Parcel:recycle	()V
    //   135: aload_2
    //   136: invokevirtual 44	android/os/Parcel:recycle	()V
    //   139: aload 4
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	fgj
    //   0	142	1	parameuz	euz
    //   3	133	2	localParcel1	Parcel
    //   7	125	3	localParcel2	Parcel
    //   129	11	4	localObject1	Object
    //   24	53	5	localIBinder1	IBinder
    //   54	66	7	localIBinder2	IBinder
    //   57	68	8	localObject2	Object
    //   90	16	9	localIInterface	IInterface
    // Exception table:
    //   from	to	target	type
    //   8	14	129	finally
    //   18	26	129	finally
    //   26	56	129	finally
    //   81	92	129	finally
    //   97	112	129	finally
    //   115	126	129	finally
  }
  
  /* Error */
  public final fje b()
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
    //   15: getfield 15	fgj:a	Landroid/os/IBinder;
    //   18: iconst_5
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 34 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 37	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   36: astore 5
    //   38: aload 5
    //   40: ifnonnull +17 -> 57
    //   43: aconst_null
    //   44: astore 7
    //   46: aload_2
    //   47: invokevirtual 44	android/os/Parcel:recycle	()V
    //   50: aload_1
    //   51: invokevirtual 44	android/os/Parcel:recycle	()V
    //   54: aload 7
    //   56: areturn
    //   57: aload 5
    //   59: ldc 107
    //   61: invokeinterface 50 2 0
    //   66: astore 6
    //   68: aload 6
    //   70: ifnull +21 -> 91
    //   73: aload 6
    //   75: instanceof 109
    //   78: ifeq +13 -> 91
    //   81: aload 6
    //   83: checkcast 109	fje
    //   86: astore 7
    //   88: goto -42 -> 46
    //   91: new 111	fjg
    //   94: dup
    //   95: aload 5
    //   97: invokespecial 112	fjg:<init>	(Landroid/os/IBinder;)V
    //   100: astore 7
    //   102: goto -56 -> 46
    //   105: astore_3
    //   106: aload_2
    //   107: invokevirtual 44	android/os/Parcel:recycle	()V
    //   110: aload_1
    //   111: invokevirtual 44	android/os/Parcel:recycle	()V
    //   114: aload_3
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	fgj
    //   3	108	1	localParcel1	Parcel
    //   7	100	2	localParcel2	Parcel
    //   105	10	3	localObject1	Object
    //   36	60	5	localIBinder	IBinder
    //   66	16	6	localIInterface	IInterface
    //   44	57	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   8	38	105	finally
    //   57	68	105	finally
    //   73	88	105	finally
    //   91	102	105	finally
  }
  
  /* Error */
  public final ffv c(euz parameuz)
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
    //   15: ifnull +61 -> 76
    //   18: aload_1
    //   19: invokeinterface 62 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 65	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	fgj:a	Landroid/os/IBinder;
    //   36: bipush 8
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   55: astore 7
    //   57: aconst_null
    //   58: astore 8
    //   60: aload 7
    //   62: ifnonnull +20 -> 82
    //   65: aload_3
    //   66: invokevirtual 44	android/os/Parcel:recycle	()V
    //   69: aload_2
    //   70: invokevirtual 44	android/os/Parcel:recycle	()V
    //   73: aload 8
    //   75: areturn
    //   76: aconst_null
    //   77: astore 5
    //   79: goto -53 -> 26
    //   82: aload 7
    //   84: ldc 116
    //   86: invokeinterface 50 2 0
    //   91: astore 9
    //   93: aload 9
    //   95: ifnull +21 -> 116
    //   98: aload 9
    //   100: instanceof 118
    //   103: ifeq +13 -> 116
    //   106: aload 9
    //   108: checkcast 118	ffv
    //   111: astore 8
    //   113: goto -48 -> 65
    //   116: new 120	ffx
    //   119: dup
    //   120: aload 7
    //   122: invokespecial 121	ffx:<init>	(Landroid/os/IBinder;)V
    //   125: astore 8
    //   127: goto -62 -> 65
    //   130: astore 4
    //   132: aload_3
    //   133: invokevirtual 44	android/os/Parcel:recycle	()V
    //   136: aload_2
    //   137: invokevirtual 44	android/os/Parcel:recycle	()V
    //   140: aload 4
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	fgj
    //   0	143	1	parameuz	euz
    //   3	134	2	localParcel1	Parcel
    //   7	126	3	localParcel2	Parcel
    //   130	11	4	localObject1	Object
    //   24	54	5	localIBinder1	IBinder
    //   55	66	7	localIBinder2	IBinder
    //   58	68	8	localObject2	Object
    //   91	16	9	localIInterface	IInterface
    // Exception table:
    //   from	to	target	type
    //   8	14	130	finally
    //   18	26	130	finally
    //   26	57	130	finally
    //   82	93	130	finally
    //   98	113	130	finally
    //   116	127	130	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fgj
 * JD-Core Version:    0.7.0.1
 */