import android.content.Context;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

public final class ltv
  extends hqj
{
  private final int r;
  private final Context s;
  
  public ltv(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.s = paramContext;
    this.r = paramInt;
  }
  
  public final Cursor o()
  {
    List localList = mbb.c(this.s, lsz.class);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Cursor localCursor = ((lsz)localIterator.next()).b(this.r);
        if (localCursor != null) {
          return localCursor;
        }
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltv
 * JD-Core Version:    0.7.0.1
 */