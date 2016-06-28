import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

final class ger
  implements Runnable
{
  private final gfb a;
  private final Rect b;
  private final FilterParameter c;
  private final gff d;
  
  public ger(gen paramgen, gfb paramgfb, Rect paramRect, FilterParameter paramFilterParameter, gff paramgff)
  {
    this.a = paramgfb;
    this.b = paramRect;
    this.c = paramFilterParameter;
    this.d = paramgff;
  }
  
  public final void run()
  {
    try
    {
      if (this.b == null)
      {
        geu localgeu2 = this.e.a;
        gfb localgfb2 = this.a;
        FilterParameter localFilterParameter2 = this.c;
        gff localgff2 = this.d;
        if (!localgeu2.a(localgff2))
        {
          NativeCore.setRenderScaleMode(3);
          localgeu2.a();
          NativeCore.offscreenPrepareToApplyImage();
          NativeCore.deactivateOffScreenFilter();
          NativeCore.deleteOffscreenContext();
          localgeu2.b();
          gfb localgfb3 = (gfb)localgfb2;
          FilterChain localFilterChain = new FilterChain(localFilterParameter2);
          localFilterChain.getFilterNodeAt(-1 + localFilterChain.size()).a = localgfb3.d();
          Bitmap localBitmap2 = NativeCore.a.renderFilterChain(localgfb3.c(), localFilterChain, 3, false);
          localgeu2.b();
          localgeu2.a(false);
          localgeu2.b();
          if (!localgeu2.a(localgff2))
          {
            localgeu2.b.b = true;
            localgeu2.b.post(new gex(localgeu2, localgff2, localBitmap2));
          }
        }
      }
      else
      {
        geu localgeu1 = this.e.a;
        gfb localgfb1 = this.a;
        Rect localRect = this.b;
        FilterParameter localFilterParameter1 = this.c;
        gff localgff1 = this.d;
        NativeCore.setRenderScaleMode(2);
        localgeu1.a(localFilterParameter1.getFilterType());
        Bitmap localBitmap1 = NativeCore.offscreenFilterHundredPercentRegion(localFilterParameter1, ((gfb)localgfb1).c(), localRect.left, localRect.top, localRect.width(), localRect.height());
        localgeu1.b(localFilterParameter1.getFilterType());
        localgeu1.b.post(new gey(localgeu1, localgff1, localBitmap1));
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ger
 * JD-Core Version:    0.7.0.1
 */