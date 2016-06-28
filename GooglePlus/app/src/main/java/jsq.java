import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.libraries.social.picasalegacy.PicasaPhotoContentProvider;

public final class jsq
  extends ContentObserver
{
  public jsq(PicasaPhotoContentProvider paramPicasaPhotoContentProvider, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsq
 * JD-Core Version:    0.7.0.1
 */