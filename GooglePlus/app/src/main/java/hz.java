import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.RemoteException;

final class hz
  implements hy
{
  private Object a;
  
  public hz(Context paramContext, in paramin)
  {
    this.a = new MediaController(paramContext, (MediaSession.Token)paramin.a);
    if (this.a == null) {
      throw new RemoteException();
    }
  }
  
  public final ic a()
  {
    MediaController.TransportControls localTransportControls = ((MediaController)this.a).getTransportControls();
    if (localTransportControls != null) {
      return new id(localTransportControls);
    }
    return null;
  }
  
  public final void a(hv paramhv)
  {
    Object localObject1 = this.a;
    Object localObject2 = paramhv.a;
    ((MediaController)localObject1).unregisterCallback((MediaController.Callback)localObject2);
  }
  
  public final void a(hv paramhv, Handler paramHandler)
  {
    Object localObject1 = this.a;
    Object localObject2 = paramhv.a;
    ((MediaController)localObject1).registerCallback((MediaController.Callback)localObject2, paramHandler);
  }
  
  public final ir b()
  {
    PlaybackState localPlaybackState = ((MediaController)this.a).getPlaybackState();
    if (localPlaybackState != null) {
      return ir.a(localPlaybackState);
    }
    return null;
  }
  
  public final hh c()
  {
    MediaMetadata localMediaMetadata = ((MediaController)this.a).getMetadata();
    if (localMediaMetadata != null) {
      return hh.a(localMediaMetadata);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hz
 * JD-Core Version:    0.7.0.1
 */