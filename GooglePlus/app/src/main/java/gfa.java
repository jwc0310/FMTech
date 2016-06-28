import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.core.TilesProvider;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import java.util.ArrayList;
import java.util.List;

final class gfa
  implements Runnable
{
  private final gfb a;
  private final int b;
  private final int c;
  private final FilterParameter d;
  private final int e;
  private final gfd f;
  
  public gfa(gen paramgen, gfb paramgfb, int paramInt1, int paramInt2, FilterParameter paramFilterParameter, int paramInt3, gfd paramgfd)
  {
    this.a = paramgfb;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramFilterParameter;
    this.e = paramInt3;
    this.f = paramgfd;
  }
  
  public final void run()
  {
    try
    {
      geu localgeu = this.g.a;
      gfb localgfb = this.a;
      int i = this.b;
      int j = this.c;
      FilterParameter localFilterParameter = this.d;
      int k = this.e;
      gfd localgfd = this.f;
      NativeCore.setRenderScaleMode(1);
      Object[] arrayOfObject = localFilterParameter.e(k);
      localgeu.a(localFilterParameter.getFilterType());
      TilesProvider localTilesProvider = ((gfb)localgfb).f();
      ArrayList localArrayList = new ArrayList(arrayOfObject.length);
      if (arrayOfObject.length >= 2) {
        localFilterParameter.a(k, arrayOfObject[1]);
      }
      int m = arrayOfObject.length;
      for (int n = 0; n < m; n++)
      {
        Object localObject = arrayOfObject[n];
        localFilterParameter.a(k, localObject);
        localFilterParameter.a(k, ((Number)localObject).intValue());
        Bitmap localBitmap = NativeCore.offscreenFilterPreviewToBitmap(localFilterParameter, localTilesProvider, i, j);
        if (localBitmap == null)
        {
          localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
          localBitmap.eraseColor(-65536);
        }
        int i1 = localgeu.b.e.getParameterInteger(616);
        localArrayList.add(efj.Cv.rotateImage(localBitmap, i1, true));
        if (localgeu.b.b) {
          break;
        }
      }
      localgeu.b(localFilterParameter.getFilterType());
      NativeCore.setRenderScaleMode(2);
      if (localgeu.b.b) {
        localgeu.b.post(new gew(localgeu, localgfd));
      }
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 == 0) {
          localgeu.b.post(new gez(localgeu, localgfd, localArrayList));
        }
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfa
 * JD-Core Version:    0.7.0.1
 */