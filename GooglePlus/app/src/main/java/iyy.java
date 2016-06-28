import android.content.Context;
import android.util.SparseArray;

final class iyy
  extends gzf
{
  private final int a;
  
  public iyy(iyx paramiyx, int paramInt)
  {
    super("ClearQueueTask");
    this.a = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    iyz localiyz = this.b.a;
    int i = this.a;
    ize localize = (ize)localiyz.b.get(i);
    if (localize != null) {
      localize.d();
    }
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iyy
 * JD-Core Version:    0.7.0.1
 */