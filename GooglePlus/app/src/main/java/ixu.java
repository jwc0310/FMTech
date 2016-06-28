import android.content.Context;
import java.util.List;

final class ixu
  implements ixr
{
  private final List<ixs> a;
  
  ixu(Context paramContext)
  {
    this.a = mbb.c(paramContext, ixs.class);
  }
  
  public final void a(ixt paramixt)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((ixs)this.a.get(j)).a(paramixt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixu
 * JD-Core Version:    0.7.0.1
 */