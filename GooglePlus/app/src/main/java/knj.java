import android.content.Context;
import android.database.Cursor;

public final class knj
  extends fp
{
  private int r;
  private kht s;
  
  public knj(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.r = paramInt;
    this.s = ((kht)mbb.a(paramContext, kht.class));
  }
  
  public final Cursor f()
  {
    return this.s.b(this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knj
 * JD-Core Version:    0.7.0.1
 */