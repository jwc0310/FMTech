import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.apps.plus.views.PhotoView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class dyi
  implements Runnable
{
  public dyi(PhotoView paramPhotoView, File paramFile, kaz paramkaz) {}
  
  public final void run()
  {
    for (;;)
    {
      int i;
      try
      {
        float f = PhotoView.a;
        localOptions = new BitmapFactory.Options();
        localOptions.inSampleSize = 1;
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new FileInputStream(this.a), null, localOptions);
        if (localOptions.outWidth > localOptions.outHeight)
        {
          i = localOptions.outWidth;
          break label220;
          if (j > f)
          {
            localOptions.inSampleSize <<= 1;
            j = i / localOptions.inSampleSize;
            continue;
          }
        }
        else
        {
          i = localOptions.outHeight;
          break label220;
        }
        localOptions.inJustDecodeBounds = false;
        int k = localOptions.inSampleSize;
        if (k > 16) {
          continue;
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        BitmapFactory.Options localOptions;
        Bitmap localBitmap2;
        Bitmap localBitmap1 = null;
        continue;
        localBitmap1 = null;
        continue;
        PhotoView.B.a.a(this.b, 5, null);
        return;
      }
      try
      {
        localBitmap2 = BitmapFactory.decodeStream(new FileInputStream(this.a), null, localOptions);
        localBitmap1 = localBitmap2;
        if (localBitmap1 == null) {
          continue;
        }
        PhotoView.B.a.a(this.b, 1, localBitmap1);
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localOptions.inSampleSize <<= 1;
      }
      continue;
      label220:
      int j = i;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyi
 * JD-Core Version:    0.7.0.1
 */