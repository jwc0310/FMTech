import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;

final class few
  implements eur
{
  final ffj a;
  private final bk b;
  
  public few(bk parambk, ffj paramffj)
  {
    this.a = ((ffj)efj.a(paramffj));
    this.b = ((bk)efj.a(parambk));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      euz localeuz = this.a.a(new evc(paramLayoutInflater), new evc(paramViewGroup), paramBundle);
      return (View)evc.a(localeuz);
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a()
  {
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    GoogleMapOptions localGoogleMapOptions = (GoogleMapOptions)paramBundle1.getParcelable("MapOptions");
    try
    {
      this.a.a(new evc(paramActivity), localGoogleMapOptions, paramBundle2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    try
    {
      paramBundle = new Bundle();
      Bundle localBundle1 = this.b.m;
      if ((localBundle1 != null) && (localBundle1.containsKey("MapOptions")))
      {
        Parcelable localParcelable = localBundle1.getParcelable("MapOptions");
        paramBundle.setClassLoader(fis.class.getClassLoader());
        Bundle localBundle2 = paramBundle.getBundle("map_state");
        if (localBundle2 == null) {
          localBundle2 = new Bundle();
        }
        localBundle2.setClassLoader(fis.class.getClassLoader());
        localBundle2.putParcelable("MapOptions", localParcelable);
        paramBundle.putBundle("map_state", localBundle2);
      }
      this.a.a(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void b()
  {
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    try
    {
      this.a.b(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void c()
  {
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void d()
  {
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void e()
  {
    try
    {
      this.a.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     few
 * JD-Core Version:    0.7.0.1
 */