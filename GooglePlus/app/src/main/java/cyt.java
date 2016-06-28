import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.plus.views.PhotoTileView;
import java.util.HashMap;

final class cyt
  extends Handler
{
  public cyt(cyr paramcyr, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.a.b.containsKey(paramMessage.obj))
    {
      PhotoTileView localPhotoTileView = (PhotoTileView)this.a.b.get(paramMessage.obj);
      localPhotoTileView.e = (0x1 | paramMessage.arg1);
      localPhotoTileView.invalidate();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyt
 * JD-Core Version:    0.7.0.1
 */