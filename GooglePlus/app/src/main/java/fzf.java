import java.util.Iterator;

public final class fzf
  extends fzc<fzp, fnt>
  implements fzl
{
  public fzf(fnt paramfnt)
  {
    super(paramfnt);
  }
  
  public final Iterator<fzp> iterator()
  {
    return new fzn(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fzf
 * JD-Core Version:    0.7.0.1
 */