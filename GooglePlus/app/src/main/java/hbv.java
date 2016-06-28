import android.content.Context;
import android.os.PowerManager.WakeLock;
import com.google.android.libraries.social.autobackup.PicasaQuotaChangedReceiver;

public final class hbv
  implements Runnable
{
  public hbv(PicasaQuotaChangedReceiver paramPicasaQuotaChangedReceiver, Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, PowerManager.WakeLock paramWakeLock) {}
  
  public final void run()
  {
    try
    {
      hbj.a(this.a, this.b, this.c, this.d, this.e, this.f);
      return;
    }
    finally
    {
      this.g.release();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbv
 * JD-Core Version:    0.7.0.1
 */