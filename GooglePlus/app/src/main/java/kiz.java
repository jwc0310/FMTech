import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class kiz
  extends gzf
{
  private final int a;
  private final kiy b;
  private final Context c;
  
  public kiz(int paramInt, Context paramContext)
  {
    super("AudienceHistoryTask");
    this.a = paramInt;
    this.c = paramContext;
    this.b = new kiy(this.c, new kcg(this.c, this.a));
  }
  
  protected final hae a(Context paramContext)
  {
    this.b.a();
    if (!this.b.a.n())
    {
      qwr[] arrayOfqwr = this.b.b().b;
      List localList = efj.a(paramContext, this.a, arrayOfqwr);
      hae localhae = new hae(true);
      if (localList != null) {
        localhae.a().putParcelableArrayList("audience_list", new ArrayList(localList));
      }
      return localhae;
    }
    Exception localException = this.b.a.q;
    if (Log.isLoggable("AudienceHistoryTask", 6)) {
      Log.e("AudienceHistoryTask", "Error querying audience history", localException);
    }
    return new hae(this.b.a.o, localException, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kiz
 * JD-Core Version:    0.7.0.1
 */