import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public class ebp
{
  public double a(efd paramefd)
  {
    ecx localecx = (ecx)paramefd.a(edl.a);
    localecx.f();
    return localecx.d;
  }
  
  public efk<ebo> a(efd paramefd, String paramString, LaunchOptions paramLaunchOptions)
  {
    return paramefd.b(new ebv(this, paramefd, paramString, paramLaunchOptions));
  }
  
  public efk<Status> a(efd paramefd, String paramString1, String paramString2)
  {
    return paramefd.b(new ebq(this, paramefd, paramString1, paramString2));
  }
  
  @Deprecated
  public efk<ebo> a(efd paramefd, String paramString, boolean paramBoolean)
  {
    ebx localebx = new ebx();
    localebx.a.b = paramBoolean;
    return a(paramefd, paramString, localebx.a);
  }
  
  public void a(efd paramefd, double paramDouble)
  {
    ecx localecx;
    try
    {
      localecx = (ecx)paramefd.a(edl.a);
      if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
        throw new IllegalArgumentException("Volume cannot be " + paramDouble);
      }
    }
    catch (RemoteException localRemoteException)
    {
      throw new IOException("service error");
    }
    ((edg)localecx.l()).a(paramDouble, localecx.d, localecx.c);
  }
  
  public void a(efd paramefd, String paramString)
  {
    try
    {
      ((ecx)paramefd.a(edl.a)).a(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IOException("service error");
    }
  }
  
  /* Error */
  public void a(efd paramefd, String paramString, ebu paramebu)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 15	edl:a	Lefc;
    //   4: invokeinterface 20 2 0
    //   9: checkcast 22	ecx
    //   12: astore 5
    //   14: aload_2
    //   15: invokestatic 114	edd:a	(Ljava/lang/String;)V
    //   18: aload 5
    //   20: aload_2
    //   21: invokevirtual 110	ecx:a	(Ljava/lang/String;)V
    //   24: aload_3
    //   25: ifnull +43 -> 68
    //   28: aload 5
    //   30: getfield 117	ecx:b	Ljava/util/Map;
    //   33: astore 6
    //   35: aload 6
    //   37: monitorenter
    //   38: aload 5
    //   40: getfield 117	ecx:b	Ljava/util/Map;
    //   43: aload_2
    //   44: aload_3
    //   45: invokeinterface 123 3 0
    //   50: pop
    //   51: aload 6
    //   53: monitorexit
    //   54: aload 5
    //   56: invokevirtual 99	ecx:l	()Landroid/os/IInterface;
    //   59: checkcast 101	edg
    //   62: aload_2
    //   63: invokeinterface 125 2 0
    //   68: return
    //   69: astore 7
    //   71: aload 6
    //   73: monitorexit
    //   74: aload 7
    //   76: athrow
    //   77: astore 4
    //   79: new 92	java/io/IOException
    //   82: dup
    //   83: ldc 94
    //   85: invokespecial 95	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	ebp
    //   0	89	1	paramefd	efd
    //   0	89	2	paramString	String
    //   0	89	3	paramebu	ebu
    //   77	1	4	localRemoteException	RemoteException
    //   12	43	5	localecx	ecx
    //   69	6	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   38	54	69	finally
    //   71	74	69	finally
    //   0	24	77	android/os/RemoteException
    //   28	38	77	android/os/RemoteException
    //   54	68	77	android/os/RemoteException
    //   74	77	77	android/os/RemoteException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ebp
 * JD-Core Version:    0.7.0.1
 */