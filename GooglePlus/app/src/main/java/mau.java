import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.webp.WebpDecoder;
import com.google.android.webp.WebpDecoder.Config;
import java.io.File;
import java.nio.ByteBuffer;

final class mau
  implements ifc
{
  private boolean a;
  private mas b;
  
  public final int a()
  {
    return 2;
  }
  
  public final Object a(ife paramife, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    WebpDecoder.Config localConfig = WebpDecoder.getConfig(paramByteBuffer);
    Object localObject2;
    Object localObject1;
    if (localConfig != null)
    {
      if ((0x10000 & ((kba)paramife.o).b()) != 0)
      {
        if (!this.a)
        {
          ifj localifj = paramife.b;
          igb localigb = localifj.d();
          if (localigb != null) {
            this.b = new mas(localifj.r(), localigb);
          }
          this.a = true;
        }
        if (this.b != null)
        {
          File localFile = paramife.g();
          if (localFile != null) {
            this.b.a.obtainMessage(1, localFile).sendToTarget();
          }
        }
      }
      if (paramife.t)
      {
        int i = localConfig.a;
        int j = localConfig.b;
        new StringBuilder(38).append("Decoding WEBP: ").append(i).append("x").append(j);
      }
      if (paramBoolean)
      {
        localObject2 = paramife.b.a(localConfig.a, localConfig.b);
        if ((localObject2 instanceof Bitmap))
        {
          localObject2 = (Bitmap)localObject2;
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        throw new OutOfMemoryError("Cannot create a bitmap");
        if ((localObject2 instanceof iey))
        {
          localObject1 = ((iey)localObject2).a;
          continue;
        }
        localObject2 = null;
        localObject1 = null;
        continue;
        localObject1 = paramife.b.b(localConfig.a, localConfig.b);
        if (localObject1 == null)
        {
          localObject1 = Bitmap.createBitmap(localConfig.a, localConfig.b, Bitmap.Config.ARGB_8888);
          localObject2 = localObject1;
        }
      }
      else
      {
        long l = SystemClock.currentThreadTimeMillis();
        if (WebpDecoder.a(paramByteBuffer, (Bitmap)localObject1))
        {
          paramByteBuffer.rewind();
          paramife.a(l, "image/webp", paramByteBuffer.remaining(), localConfig.a, localConfig.b, (Bitmap)localObject1);
          return localObject2;
        }
        ((Bitmap)localObject1).recycle();
        Log.e("EsResource", "Cannot decode WEBP", null);
        return null;
        return null;
      }
      localObject2 = localObject1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mau
 * JD-Core Version:    0.7.0.1
 */