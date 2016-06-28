import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class mbf
  extends ContextWrapper
  implements mbe
{
  public final mbb a = new mbb();
  private LayoutInflater b;
  
  public mbf()
  {
    super(null);
  }
  
  public final void a(Context paramContext)
  {
    attachBaseContext(paramContext);
    this.a.a(paramContext);
  }
  
  public final mbb aE_()
  {
    return this.a;
  }
  
  public final Object getSystemService(String paramString)
  {
    if (paramString.equals("layout_inflater"))
    {
      if (this.b == null) {
        this.b = ((LayoutInflater)super.getSystemService(paramString)).cloneInContext(this);
      }
      return this.b;
    }
    return super.getSystemService(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbf
 * JD-Core Version:    0.7.0.1
 */