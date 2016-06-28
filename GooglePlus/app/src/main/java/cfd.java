import android.content.Context;
import android.database.Cursor;
import java.util.List;

final class cfd
  extends dch
{
  private final ivl r;
  
  public cfd(Context paramContext, List<jpx> paramList)
  {
    super(paramContext, null, 2, null, jrf.b(), null);
    this.r = ((ivl)mbb.a(paramContext, ivl.class));
  }
  
  public final Cursor o()
  {
    return new dce(this.l, (hra)super.o(), 0, this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfd
 * JD-Core Version:    0.7.0.1
 */