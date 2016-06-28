import java.util.ArrayList;
import java.util.List;

public final class gpc
{
  public boolean a;
  private List<gpd> b = new ArrayList();
  
  public final void a(gpd paramgpd)
  {
    this.b.add(paramgpd);
    paramgpd.a(this.a);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    int i = this.b.size();
    for (int j = 0; j < i; j++) {
      ((gpd)this.b.get(j)).a(paramBoolean);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpc
 * JD-Core Version:    0.7.0.1
 */