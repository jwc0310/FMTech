import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.social.ingest.ui.MtpImageView;
import java.lang.ref.WeakReference;

public final class ihz
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    MtpImageView localMtpImageView = (MtpImageView)((WeakReference)paramMessage.obj).get();
    if (localMtpImageView == null) {}
    for (;;)
    {
      return;
      synchronized (localMtpImageView.b)
      {
        Object localObject3 = localMtpImageView.f;
        if (localObject3 == null) {
          continue;
        }
        localMtpImageView.a(localObject3);
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihz
 * JD-Core Version:    0.7.0.1
 */