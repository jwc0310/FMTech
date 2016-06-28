import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

public final class hmh
  extends hqj
{
  private final int r;
  private final String s;
  private final boolean t;
  private final Bundle u;
  
  public hmh(Context paramContext, int paramInt, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    super(paramContext, ((hho)mbb.a(paramContext, hho.class)).d());
    this.r = paramInt;
    this.s = paramString;
    this.t = paramBoolean;
    this.u = paramBundle;
  }
  
  public hmh(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final Cursor o()
  {
    return ((hhh)mbb.a(this.l, hhh.class)).a(this.r, this.s, this.t, this.u);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmh
 * JD-Core Version:    0.7.0.1
 */