import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.plus.views.PhotoTileView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class cyr
{
  final Context a;
  final HashMap<ipf, PhotoTileView> b = new HashMap();
  Handler c;
  private Handler d;
  
  public cyr(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a()
  {
    if (this.d == null) {
      return;
    }
    this.d.getLooper().quit();
    this.d = null;
    this.b.clear();
  }
  
  public final void a(PhotoTileView paramPhotoTileView, ipf paramipf)
  {
    if (this.d == null)
    {
      HandlerThread localHandlerThread = new HandlerThread("DEBUG-STATUS-FETCHER");
      localHandlerThread.start();
      this.d = new cys(this, localHandlerThread.getLooper());
      this.c = new cyt(this, Looper.getMainLooper());
    }
    Iterator localIterator = this.b.entrySet().iterator();
    while (localIterator.hasNext()) {
      if (((Map.Entry)localIterator.next()).getValue() == paramPhotoTileView) {
        localIterator.remove();
      }
    }
    this.b.put(paramipf, paramPhotoTileView);
    Message localMessage = Message.obtain();
    localMessage.obj = paramipf;
    localMessage.what = paramPhotoTileView.hashCode();
    this.d.removeMessages(paramPhotoTileView.hashCode());
    this.d.sendMessage(localMessage);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyr
 * JD-Core Version:    0.7.0.1
 */