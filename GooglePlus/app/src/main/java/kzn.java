import android.content.Context;
import android.database.Cursor;

public final class kzn
  extends hqj
{
  private final Context r;
  private final int s;
  private final String t;
  
  public kzn(Context paramContext, int paramInt)
  {
    super(paramContext, ((kyx)mbb.a(paramContext, kyx.class)).b());
    this.r = paramContext;
    this.s = paramInt;
    this.t = ((git)mbb.a(paramContext, git.class)).f().b("gaia_id");
  }
  
  public final Cursor o()
  {
    ((jyw)mbb.a(this.l, jyw.class)).a(this.s, this.t, true);
    return ((kyn)mbb.a(this.r, kyn.class)).d(this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzn
 * JD-Core Version:    0.7.0.1
 */