import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.webp.WebpDecoder;
import com.google.android.webp.WebpDecoder.Config;
import java.io.File;
import java.nio.ByteBuffer;

final class mat
  implements Handler.Callback
{
  mat(mas parammas) {}
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    boolean bool1 = false;
    File localFile;
    mas localmas;
    ByteBuffer localByteBuffer;
    WebpDecoder.Config localConfig;
    if (i == 1)
    {
      localFile = (File)paramMessage.obj;
      localmas = this.a;
      localByteBuffer = mas.a(localFile);
      if (localByteBuffer != null)
      {
        localConfig = WebpDecoder.getConfig(localByteBuffer);
        if (localConfig != null) {
          break label103;
        }
        if (Log.isLoggable("JpegEncodeQueue", 5))
        {
          String str5 = String.valueOf(localFile.getAbsolutePath());
          if (str5.length() == 0) {
            break label90;
          }
          "Unable to obtain header info for webp from file, path: ".concat(str5);
        }
      }
    }
    for (;;)
    {
      bool1 = true;
      return bool1;
      label90:
      new String("Unable to obtain header info for webp from file, path: ");
      continue;
      label103:
      Bitmap localBitmap = localmas.c.a(localConfig.a, localConfig.b, iga.a);
      if (localBitmap == null) {
        localBitmap = Bitmap.createBitmap(localConfig.a, localConfig.b, Bitmap.Config.ARGB_8888);
      }
      if (WebpDecoder.a(localByteBuffer, localBitmap)) {}
      for (;;)
      {
        if (localBitmap == null)
        {
          if (!Log.isLoggable("JpegEncodeQueue", 4)) {
            break;
          }
          String str4 = String.valueOf(localFile.getAbsolutePath());
          if (str4.length() != 0)
          {
            "Unable to decode webp from file, path: ".concat(str4);
            break;
            localBitmap = null;
            continue;
          }
          new String("Unable to decode webp from file, path: ");
          break;
        }
      }
      boolean bool2 = localmas.a(localBitmap);
      localmas.c.a(localBitmap);
      if (!bool2)
      {
        if (Log.isLoggable("JpegEncodeQueue", 4))
        {
          String str3 = String.valueOf(localFile.getAbsolutePath());
          if (str3.length() != 0) {
            "Failed to write decoded bitmap to temp file, original path: ".concat(str3);
          } else {
            new String("Failed to write decoded bitmap to temp file, original path: ");
          }
        }
      }
      else if ((!localmas.b.renameTo(localFile.getAbsoluteFile())) && (Log.isLoggable("JpegEncodeQueue", 5)))
      {
        if (Log.isLoggable("JpegEncodeQueue", 5))
        {
          String str2 = String.valueOf(localFile.getAbsolutePath());
          if (str2.length() != 0) {
            "Unable to rename temp file to: ".concat(str2);
          } else {
            new String("Unable to rename temp file to: ");
          }
        }
      }
      else if (Log.isLoggable("JpegEncodeQueue", 3))
      {
        String str1 = String.valueOf(localFile.getAbsolutePath());
        if (str1.length() != 0) {
          "Re-encoded file to jpeg path: ".concat(str1);
        } else {
          new String("Re-encoded file to jpeg path: ");
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mat
 * JD-Core Version:    0.7.0.1
 */