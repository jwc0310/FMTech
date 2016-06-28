import android.content.Context;
import android.view.SubMenu;

public final class k
  extends xl
{
  public k(Context paramContext)
  {
    super(paramContext);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    xp localxp = (xp)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    n localn = new n(this.a, this, localxp);
    localxp.c = localn;
    localn.setHeaderTitle(localxp.getTitle());
    return localn;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     k
 * JD-Core Version:    0.7.0.1
 */