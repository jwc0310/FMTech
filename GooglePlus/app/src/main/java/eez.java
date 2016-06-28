import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.rastermill.FrameSequence;

public class eez
{
  public long a;
  
  private eez() {}
  
  public eez(long paramLong)
  {
    this.a = paramLong;
  }
  
  public long a(int paramInt1, Bitmap paramBitmap, int paramInt2)
  {
    if ((paramBitmap == null) || (paramBitmap.getConfig() != Bitmap.Config.ARGB_8888)) {
      throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
    }
    if (this.a == 0L) {
      throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
    }
    return FrameSequence.a(this.a, paramInt1, paramBitmap, paramInt2);
  }
  
  public void a()
  {
    if (this.a != 0L)
    {
      FrameSequence.a(this.a);
      this.a = 0L;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eez
 * JD-Core Version:    0.7.0.1
 */