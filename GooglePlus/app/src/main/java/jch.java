import android.content.Context;
import java.util.List;

public final class jch
  implements izz
{
  private final jck a;
  
  public jch(Context paramContext)
  {
    this.a = ((jck)mbb.a(paramContext, jck.class));
  }
  
  public final jds a(int paramInt, jdh paramjdh)
  {
    jci localjci = this.a.a(paramInt);
    jds localjds = new jds();
    List localList = localjci.a(paramjdh);
    localjds.a = ((jdt[])localList.toArray(new jdt[localList.size()]));
    return localjds;
  }
  
  public final void a(int paramInt)
  {
    this.a.a(paramInt).a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jch
 * JD-Core Version:    0.7.0.1
 */