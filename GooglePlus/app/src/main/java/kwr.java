import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.libraries.social.socialcast.impl.CastService;
import com.google.android.libraries.social.socialcast.impl.StreamCastActivity;
import java.util.HashSet;

public final class kwr
  implements ServiceConnection
{
  public kwr(StreamCastActivity paramStreamCastActivity) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.e = ((kwa)paramIBinder);
    kwa localkwa = this.a.e;
    kwq localkwq = this.a.d;
    localkwa.a.a.add(localkwq);
    if (!CastService.G)
    {
      this.a.finish();
      return;
    }
    if (this.a.e.a.q)
    {
      StreamCastActivity.a(this.a);
      return;
    }
    StreamCastActivity.b(this.a);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.e = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwr
 * JD-Core Version:    0.7.0.1
 */