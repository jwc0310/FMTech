import android.graphics.Bitmap;
import junit.framework.Assert;

public final class iay
  extends ibh
{
  private final Bitmap j;
  
  public iay(Bitmap paramBitmap)
  {
    this(paramBitmap, false);
  }
  
  private iay(Bitmap paramBitmap, boolean paramBoolean)
  {
    super(false);
    boolean bool1 = false;
    if (paramBitmap != null)
    {
      boolean bool2 = paramBitmap.isRecycled();
      bool1 = false;
      if (!bool2) {
        bool1 = true;
      }
    }
    Assert.assertTrue(bool1);
    this.j = paramBitmap;
  }
  
  protected final void a(Bitmap paramBitmap) {}
  
  protected final Bitmap aD_()
  {
    return this.j;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iay
 * JD-Core Version:    0.7.0.1
 */