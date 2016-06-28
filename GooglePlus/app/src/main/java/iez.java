import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

final class iez
  implements ifc
{
  private static final AtomicReference<byte[]> a = new AtomicReference();
  private static final mcq b = new mcq("debug.bitmap.reuse");
  
  public final int a()
  {
    return 0;
  }
  
  @TargetApi(11)
  public final Object a(ife paramife, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    localOptions = new BitmapFactory.Options();
    paramByteBuffer.position(0);
    localmfp = new mfp(paramByteBuffer);
    localOptions.inTempStorage = ((byte[])a.getAndSet(null));
    if (localOptions.inTempStorage == null) {
      localOptions.inTempStorage = new byte[16384];
    }
    localOptions.inSampleSize = 1;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(localmfp, null, localOptions);
      localOptions.inJustDecodeBounds = false;
      paramByteBuffer.rewind();
      if ((localOptions.outWidth > 0) && (localOptions.outHeight > 0) && ((Build.VERSION.SDK_INT >= 19) || ("image/jpeg".equalsIgnoreCase(localOptions.outMimeType)) || ("image/png".equalsIgnoreCase(localOptions.outMimeType)))) {
        localOptions.inBitmap = paramife.b.b(localOptions.outWidth, localOptions.outHeight);
      }
    }
    long l = SystemClock.currentThreadTimeMillis();
    try
    {
      Bitmap localBitmap2 = BitmapFactory.decodeStream(localmfp, null, localOptions);
      localBitmap1 = localBitmap2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        if (paramife.t) {
          Log.e("EsResource", "Failed to reuse bitmap", localIllegalArgumentException);
        }
        paramByteBuffer.rewind();
        localOptions.inBitmap = null;
        Bitmap localBitmap1 = BitmapFactory.decodeStream(localmfp, null, localOptions);
      }
    }
    paramByteBuffer.rewind();
    a.set(localOptions.inTempStorage);
    paramife.a(l, localOptions.outMimeType, paramByteBuffer.remaining(), localOptions.outWidth, localOptions.outHeight, localBitmap1);
    return localBitmap1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iez
 * JD-Core Version:    0.7.0.1
 */