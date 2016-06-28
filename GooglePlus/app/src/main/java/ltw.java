import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class ltw
  extends gzf
{
  private final Context a;
  private final int b;
  
  public ltw(Context paramContext, int paramInt)
  {
    super(paramContext, "ResetTimingBreakdown");
    this.a = paramContext;
    this.b = paramInt;
  }
  
  protected final hae a()
  {
    List localList = mbb.c(this.a, lsz.class);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        ((lsz)localIterator.next()).a(this.b);
      }
    }
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltw
 * JD-Core Version:    0.7.0.1
 */