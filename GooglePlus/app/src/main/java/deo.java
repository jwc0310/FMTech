import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.SectionIndexer;

public class deo
  extends hqi
  implements SectionIndexer
{
  public final aud t;
  public final LayoutInflater u;
  public final atu v;
  public View.OnClickListener w;
  public View.OnLongClickListener x;
  public det y = new det(new dep(this));
  
  public deo(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, paramCursor);
    this.t = ((aud)mbb.a(paramContext, aud.class));
    mbb.a(paramContext, dxl.class);
    mbb.a(paramContext, cpa.class);
    this.v = ((atu)mbb.a(paramContext, atu.class));
    this.u = LayoutInflater.from(paramContext);
  }
  
  public int getPositionForSection(int paramInt)
  {
    return this.y.getPositionForSection(paramInt);
  }
  
  public int getSectionForPosition(int paramInt)
  {
    return this.y.getSectionForPosition(paramInt);
  }
  
  public Object[] getSections()
  {
    return this.y.getSections();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     deo
 * JD-Core Version:    0.7.0.1
 */