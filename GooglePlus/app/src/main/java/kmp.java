import android.content.Context;
import android.util.Log;
import java.util.List;

public final class kmp
  extends gzf
{
  private int a;
  private List<gnb> b;
  
  public kmp(int paramInt, List<gnb> paramList)
  {
    super("UpdateAudienceTask");
    this.a = paramInt;
    this.b = paramList;
  }
  
  protected final hae a(Context paramContext)
  {
    boolean bool = efj.a(paramContext, this.a, this.b);
    if ((!bool) && (Log.isLoggable("UpdateAudienceTask", 6))) {
      efj.b(6, "UpdateAudienceTask", "Error saving audience history");
    }
    return new hae(bool);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmp
 * JD-Core Version:    0.7.0.1
 */