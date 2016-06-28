import android.content.Context;
import android.database.Cursor;

public final class hmo
  extends hqj
{
  private final int r;
  private final String s;
  
  public hmo(Context paramContext, int paramInt)
  {
    super(paramContext, ((hho)mbb.a(paramContext, hho.class)).e());
    this.r = paramInt;
    this.s = ((git)mbb.a(paramContext, git.class)).f().b("gaia_id");
  }
  
  public final Cursor o()
  {
    ((jyw)mbb.a(this.l, jyw.class)).a(this.r, this.s, true);
    return ((hhh)mbb.a(this.l, hhh.class)).l(this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmo
 * JD-Core Version:    0.7.0.1
 */