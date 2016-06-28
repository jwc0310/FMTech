import android.content.Context;

public class kzr
{
  public final kzl a;
  
  public kzr(Context paramContext)
  {
    this.a = new kzl(paramContext, "squares_metadata");
  }
  
  public final boolean a(int paramInt)
  {
    return this.a.b(paramInt, "last_squares_sync_time", -1L) < System.currentTimeMillis() - 1200000L;
  }
  
  public final boolean b(int paramInt)
  {
    return this.a.b(paramInt, "last_suggestions_sync_time", -1L) < System.currentTimeMillis() - 3600000L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzr
 * JD-Core Version:    0.7.0.1
 */