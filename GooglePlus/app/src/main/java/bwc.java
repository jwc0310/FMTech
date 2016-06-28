import android.util.Log;
import com.google.android.apps.plus.fragments.AddProfilePhotoSpringboardFragment;
import com.google.android.apps.plus.service.EsService;

public final class bwc
  extends dme
{
  public bwc(AddProfilePhotoSpringboardFragment paramAddProfilePhotoSpringboardFragment) {}
  
  public final void a(int paramInt1, int paramInt2, dmx paramdmx)
  {
    if (Log.isLoggable("OobProfilePhotoFragment", 3)) {
      new StringBuilder(53).append("onUploadProfilePhotoComplete(); requestId=").append(paramInt1);
    }
    this.a.a(paramInt1, paramdmx);
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; (i == 0) && (paramdmx.d == null); i = 0)
      {
        String str = jjf.a(((giz)this.a.bo.a(giz.class)).a(paramInt2).b("gaia_id"));
        this.a.d = EsService.c(this.a.f(), paramInt2, str, true);
        return;
      }
    }
    AddProfilePhotoSpringboardFragment.a(this.a);
  }
  
  public final void k(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("OobProfilePhotoFragment", 3)) {
      new StringBuilder(55).append("onGetProfileAndContactComplete(); requestId=").append(paramInt);
    }
    this.a.b = Boolean.valueOf(true);
    this.a.a(paramInt, paramdmx);
    this.a.v();
    AddProfilePhotoSpringboardFragment.a(this.a);
  }
  
  public final void l(int paramInt, dmx paramdmx)
  {
    if (Log.isLoggable("OobProfilePhotoFragment", 3)) {
      new StringBuilder(52).append("onInsertCameraPhotoComplete(); requestId=").append(paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwc
 * JD-Core Version:    0.7.0.1
 */