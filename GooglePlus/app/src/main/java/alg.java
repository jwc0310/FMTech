import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.util.ArrayList;
import java.util.List;

public final class alg
  extends ale
{
  int a;
  private final int b;
  private final List<Bitmap> c;
  
  public alg(akx paramakx, FilterParameter paramFilterParameter, int paramInt, Bitmap paramBitmap)
  {
    super(paramakx);
    int i = 1 + (Float.valueOf(paramFilterParameter.c(3)).intValue() - Float.valueOf(paramFilterParameter.b(3)).intValue());
    this.b = 3;
    this.c = new ArrayList(i);
    for (;;)
    {
      int j = i - 1;
      if (i <= 0) {
        break;
      }
      this.c.add(paramBitmap);
      i = j;
    }
  }
  
  public final int a()
  {
    return this.c.size();
  }
  
  public final Integer a(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public final boolean a(List<Bitmap> paramList)
  {
    if (paramList == null) {
      return this.c.isEmpty();
    }
    if (this.c.size() != paramList.size()) {
      return false;
    }
    this.c.clear();
    this.c.addAll(paramList);
    return true;
  }
  
  public final Object[] a(Integer paramInteger)
  {
    if ((paramInteger == null) || (paramInteger.intValue() < 0) || (paramInteger.intValue() >= this.c.size())) {
      return null;
    }
    int i = (int)this.d.g().getDimension(efj.ce);
    int j = this.d.g().getColor(efj.bP);
    Bitmap localBitmap = (Bitmap)this.c.get(paramInteger.intValue());
    int k = Math.min(localBitmap.getWidth(), localBitmap.getHeight());
    return new Bitmap[] { BitmapHelper.createCenterCropBitmap(localBitmap, k, k, 0, 0, j), BitmapHelper.createCenterCropBitmap(localBitmap, k, k, 0, i, j) };
  }
  
  public final String b(Integer paramInteger)
  {
    return this.d.b(this.b, paramInteger);
  }
  
  public final boolean c(Integer paramInteger)
  {
    return paramInteger.equals(Integer.valueOf(this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alg
 * JD-Core Version:    0.7.0.1
 */