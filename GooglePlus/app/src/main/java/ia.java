import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

final class ia
  implements hy
{
  private hr a;
  private ic b;
  
  public ia(in paramin)
  {
    IBinder localIBinder = (IBinder)paramin.a;
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      this.a = ((hr)localObject);
      return;
      IInterface localIInterface = localIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      if ((localIInterface != null) && ((localIInterface instanceof hr))) {
        localObject = (hr)localIInterface;
      } else {
        localObject = new ht(localIBinder);
      }
    }
  }
  
  public final ic a()
  {
    if (this.b == null) {
      this.b = new ie(this.a);
    }
    return this.b;
  }
  
  public final void a(hv paramhv)
  {
    if (paramhv == null) {
      throw new IllegalArgumentException("callback may not be null.");
    }
    try
    {
      this.a.b((ho)paramhv.a);
      this.a.asBinder().unlinkToDeath(paramhv, 0);
      paramhv.c = false;
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in unregisterCallback. " + localRemoteException);
    }
  }
  
  public final void a(hv paramhv, Handler paramHandler)
  {
    if (paramhv == null) {
      throw new IllegalArgumentException("callback may not be null.");
    }
    try
    {
      this.a.asBinder().linkToDeath(paramhv, 0);
      this.a.a((ho)paramhv.a);
      paramhv.b = new hw(paramhv, paramHandler.getLooper());
      paramhv.c = true;
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in registerCallback. " + localRemoteException);
      paramhv.a();
    }
  }
  
  public final ir b()
  {
    try
    {
      ir localir = this.a.o();
      return localir;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getPlaybackState. " + localRemoteException);
    }
    return null;
  }
  
  public final hh c()
  {
    try
    {
      hh localhh = this.a.n();
      return localhh;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getMetadata. " + localRemoteException);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ia
 * JD-Core Version:    0.7.0.1
 */