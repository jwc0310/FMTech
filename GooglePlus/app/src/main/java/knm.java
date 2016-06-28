import android.content.Context;
import android.database.Cursor;

public final class knm
  extends hqj
{
  private long r;
  private kht s;
  private int t;
  
  public knm(Context paramContext, long paramLong, int paramInt)
  {
    super(paramContext);
    this.s = ((kht)mbb.a(paramContext, kht.class));
    this.r = paramLong;
    this.t = paramInt;
  }
  
  public final Cursor o()
  {
    return this.s.b(this.r, this.t);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knm
 * JD-Core Version:    0.7.0.1
 */