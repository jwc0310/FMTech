import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

public final class isl
  extends gzf
{
  private final ArrayList<Uri> a;
  private final Context b;
  
  public isl(ArrayList<Uri> paramArrayList, Context paramContext)
  {
    super("SetCopyContentUriTask");
    this.a = paramArrayList;
    this.b = paramContext;
  }
  
  protected final hae a(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    boolean bool = efj.a(this.b, this.a, localArrayList);
    hae localhae = new hae(bool);
    if (bool) {
      localhae.a().putStringArrayList("final_uris", localArrayList);
    }
    return localhae;
  }
  
  public final String b()
  {
    return this.b.getString(da.q);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isl
 * JD-Core Version:    0.7.0.1
 */