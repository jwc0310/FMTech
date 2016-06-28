import android.graphics.Rect;
import java.util.Comparator;

public final class lwv
  implements Comparator<lwu>
{
  public static int a(lwu paramlwu1, lwu paramlwu2)
  {
    Rect localRect1 = paramlwu1.a();
    Rect localRect2 = paramlwu2.a();
    int i;
    if (localRect1.bottom <= localRect2.top) {
      i = -1;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            if (localRect1.top >= localRect2.bottom) {
              return 1;
            }
            i = localRect1.left - localRect2.left;
          } while (i != 0);
          i = localRect1.top - localRect2.top;
        } while (i != 0);
        i = localRect1.bottom - localRect2.bottom;
      } while (i != 0);
      i = localRect1.right - localRect2.right;
    } while (i != 0);
    return paramlwu1.hashCode() - paramlwu2.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwv
 * JD-Core Version:    0.7.0.1
 */