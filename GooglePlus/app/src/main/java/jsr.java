import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.social.picasalegacy.PicasaPhotoContentProvider;

public final class jsr
  extends Handler
{
  public jsr(PicasaPhotoContentProvider paramPicasaPhotoContentProvider, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      throw new AssertionError(28 + "unknown message: " + i);
    }
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsr
 * JD-Core Version:    0.7.0.1
 */