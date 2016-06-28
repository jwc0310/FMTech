import android.util.Log;
import com.google.android.apps.plus.service.EsService;

final class cds
  extends dme
{
  cds(cdo paramcdo) {}
  
  public final void J(int paramInt, dmx paramdmx)
  {
    cdo.b(this.a, paramInt, paramdmx);
  }
  
  public final void K(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(48).append("onSetCoverPhotoComplete(); requestId=").append(paramInt);
    }
    cdo.c(this.a, paramInt, paramdmx);
  }
  
  public final void L(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(48).append("onSetCoverPhotoComplete(); requestId=").append(paramInt);
    }
    cdo.c(this.a, paramInt, paramdmx);
  }
  
  public final void a(int paramInt1, int paramInt2, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(53).append("onUploadProfilePhotoComplete(); requestId=").append(paramInt1);
    }
    cdo.a(this.a, paramInt1, paramdmx);
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label111;
      }
    }
    label111:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && (paramdmx.d == null))
      {
        this.a.ab = EsService.c(this.a.f(), this.a.at.c(), this.a.af, true);
        this.a.N_();
      }
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean, dmx paramdmx)
  {
    cdo.b(this.a, paramInt, paramBoolean, paramdmx);
  }
  
  public final void a(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    cdo.a(this.a, paramInt, paramBoolean, paramdmx);
  }
  
  public final void k(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(55).append("onGetProfileAndContactComplete(); requestId=").append(paramInt);
    }
    cdo.a(this.a, paramInt, paramdmx);
  }
  
  public final void t(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(47).append("onGetAlbumListComplete(); requestId=").append(paramInt);
    }
    cdo.d(this.a, paramInt, paramdmx);
  }
  
  public final void z(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("HostedProfileFragment", 3)) {
      new StringBuilder(52).append("onGetBestPhotoTilesComplete(); requestId=").append(paramInt);
    }
    cdo.d(this.a, paramInt, paramdmx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cds
 * JD-Core Version:    0.7.0.1
 */