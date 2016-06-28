import android.mtp.MtpDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.social.ingest.ui.MtpImageView;
import java.lang.ref.WeakReference;

public final class ihy
  extends Handler
{
  public ihy(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    MtpImageView localMtpImageView = (MtpImageView)((WeakReference)paramMessage.obj).get();
    if (localMtpImageView == null) {}
    Object localObject3;
    for (;;)
    {
      return;
      synchronized (localMtpImageView.b)
      {
        localMtpImageView.c = false;
        MtpDevice localMtpDevice = localMtpImageView.e;
        ihk localihk = localMtpImageView.d;
        if (localMtpDevice != null)
        {
          localObject3 = localMtpImageView.a(localMtpDevice, localihk);
          if (localObject3 != null) {
            synchronized (localMtpImageView.b)
            {
              if (localMtpImageView.d != localihk) {
                return;
              }
            }
          }
        }
      }
    }
    localMtpImageView.f = localObject3;
    localMtpImageView.e = null;
    localMtpImageView.d = null;
    MtpImageView.g.sendMessage(MtpImageView.g.obtainMessage(0, localMtpImageView.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihy
 * JD-Core Version:    0.7.0.1
 */