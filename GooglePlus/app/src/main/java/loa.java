import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;

public class loa
  extends lpi
{
  public lob b;
  public int c;
  
  public loa(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private loa(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  public loa(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void D_()
  {
    super.D_();
    this.c = 0;
  }
  
  public void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    this.c = lod.b(this.N);
    super.a(paramCursor, paramhfa, paramInt);
  }
  
  public boolean e()
  {
    return false;
  }
  
  protected final boolean l()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loa
 * JD-Core Version:    0.7.0.1
 */