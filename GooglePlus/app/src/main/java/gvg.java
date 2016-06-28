import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;

public class gvg
{
  private Context a;
  
  public gvg(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final String a(int paramInt)
  {
    try
    {
      String str = this.a.getResources().getResourceName(paramInt);
      return str;
    }
    catch (Resources.NotFoundException localNotFoundException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvg
 * JD-Core Version:    0.7.0.1
 */