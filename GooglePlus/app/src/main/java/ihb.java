import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

public final class ihb
  implements MediaScannerConnection.MediaScannerConnectionClient
{
  public ArrayList<String> a = new ArrayList();
  public MediaScannerConnection b = new MediaScannerConnection(paramContext, this);
  public boolean c;
  public final Object d = new Object();
  
  public ihb(Context paramContext) {}
  
  public final void onMediaScannerConnected()
  {
    synchronized (this.d)
    {
      this.c = true;
      if (this.a.isEmpty()) {
        break label75;
      }
      Iterator localIterator = this.a.iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.b.scanFile(str, null);
      }
    }
    this.a.clear();
    label75:
  }
  
  public final void onScanCompleted(String paramString, Uri paramUri) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihb
 * JD-Core Version:    0.7.0.1
 */