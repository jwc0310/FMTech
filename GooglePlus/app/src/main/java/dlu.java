import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.apps.plus.service.EsService;

public final class dlu
  implements Runnable
{
  public dlu(EsService paramEsService, Context paramContext, ipf paramipf, Intent paramIntent) {}
  
  public final void run()
  {
    ipb localipb = (ipb)mbb.a(this.a, ipb.class);
    try
    {
      localBitmap = (Bitmap)new ipc(localipb, null, this.b, 0, jrw.c, jrw.c, 257).a();
      this.d.b(this.c, new dmx(), localBitmap);
      return;
    }
    catch (kbm localkbm)
    {
      for (;;)
      {
        Log.e("EsService", "Cannot download photo", localkbm);
        localBitmap = null;
      }
    }
    catch (kbc localkbc)
    {
      for (;;)
      {
        Log.e("EsService", "Canceled", localkbc);
        Bitmap localBitmap = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlu
 * JD-Core Version:    0.7.0.1
 */