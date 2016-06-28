import android.os.RemoteException;
import android.util.Log;

final class ie
  extends ic
{
  private hr a;
  
  public ie(hr paramhr)
  {
    this.a = paramhr;
  }
  
  public final void a()
  {
    try
    {
      this.a.g();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in play. " + localRemoteException);
    }
  }
  
  public final void b()
  {
    try
    {
      this.a.h();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in pause. " + localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ie
 * JD-Core Version:    0.7.0.1
 */