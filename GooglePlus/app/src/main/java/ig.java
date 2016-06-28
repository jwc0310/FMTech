import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.PlaybackState;
import android.os.Bundle;

public final class ig<T extends if>
  extends MediaController.Callback
{
  private T a;
  
  public ig(T paramT)
  {
    this.a = paramT;
  }
  
  public final void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    this.a.b(paramMediaMetadata);
  }
  
  public final void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    this.a.a(paramPlaybackState);
  }
  
  public final void onSessionDestroyed()
  {
    this.a.a();
  }
  
  public final void onSessionEvent(String paramString, Bundle paramBundle) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ig
 * JD-Core Version:    0.7.0.1
 */