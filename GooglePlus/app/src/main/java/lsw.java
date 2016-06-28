import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;

public final class lsw
  implements TextureView.SurfaceTextureListener
{
  public lsw(TiledImageView paramTiledImageView) {}
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.a.d = true;
    this.a.b.onSurfaceTextureAvailable(paramSurfaceTexture, paramInt1, paramInt2);
    if (!this.a.e)
    {
      TiledImageView localTiledImageView = this.a;
      localTiledImageView.e = false;
      if ((localTiledImageView.d) && (TiledImageView.a)) {
        localTiledImageView.b.setVisibility(4);
      }
    }
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    return this.a.b.onSurfaceTextureDestroyed(paramSurfaceTexture);
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.a.b.onSurfaceTextureSizeChanged(paramSurfaceTexture, paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.a.b.onSurfaceTextureUpdated(paramSurfaceTexture);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsw
 * JD-Core Version:    0.7.0.1
 */