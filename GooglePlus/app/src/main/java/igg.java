import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.SortedSet;

@TargetApi(19)
final class igg
  implements ifx
{
  private static final ifz a = new igh();
  
  public final ify a(int paramInt1, int paramInt2)
  {
    return new ify(paramInt1, paramInt2, a);
  }
  
  public final ify a(Bitmap paramBitmap)
  {
    return new ify(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getAllocationByteCount(), a);
  }
  
  public final ify a(ify paramify, SortedSet<ify> paramSortedSet, iga paramiga)
  {
    if (!paramSortedSet.isEmpty()) {
      return (ify)paramSortedSet.first();
    }
    return null;
  }
  
  public final void a(ify paramify, Bitmap paramBitmap)
  {
    paramBitmap.reconfigure(paramify.b, paramify.a, Bitmap.Config.ARGB_8888);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igg
 * JD-Core Version:    0.7.0.1
 */