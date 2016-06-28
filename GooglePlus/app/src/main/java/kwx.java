import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import android.view.GestureDetector;
import com.google.android.libraries.social.socialcast.impl.SocialCastMediaView;

final class kwx
  implements ServiceConnection
{
  kwx(kwt paramkwt) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.b = ((kwd)paramIBinder);
    SocialCastMediaView localSocialCastMediaView = this.a.c;
    bp localbp = this.a.f();
    localSocialCastMediaView.a = this.a.b;
    localSocialCastMediaView.b = new GestureDetector(localbp, new kwj(localSocialCastMediaView));
    this.a.b.a(this.a.a);
    kwt.a(this.a);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.e("StreamCastUiFragment", "Disconnected from service.");
    this.a.b = null;
    if (this.a.f() != null) {
      this.a.f().finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwx
 * JD-Core Version:    0.7.0.1
 */