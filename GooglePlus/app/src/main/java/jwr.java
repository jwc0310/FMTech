import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class jwr
  extends gzf
{
  static final String a = jwr.class.getName();
  private final int b;
  private final ArrayList<ipf> c;
  
  public jwr(int paramInt, ipf paramipf)
  {
    super(a);
    this.b = paramInt;
    this.c = new ArrayList();
    this.c.add(paramipf);
  }
  
  protected final hae a(Context paramContext)
  {
    List localList = jrf.b(paramContext, this.b, this.c);
    hae localhae = new hae(true);
    localhae.a().putParcelableArrayList("media_refs_with_photo_ids", (ArrayList)localList);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwr
 * JD-Core Version:    0.7.0.1
 */