import android.content.Context;
import java.util.HashMap;

public final class bld
  extends cun<mzh, mzi>
{
  public nrn a;
  public HashMap<String, okn> b = new HashMap();
  private final String c;
  private final Iterable<String> d;
  private final boolean e;
  private final Integer f;
  
  public bld(Context paramContext, kcg paramkcg, int paramInt, Iterable<String> paramIterable, boolean paramBoolean, Integer paramInteger, String paramString)
  {
    super(paramContext, paramkcg, paramInt, "readcollectionsbyid", new mzh(), new mzi());
    this.d = paramIterable;
    this.e = false;
    this.f = paramInteger;
    this.c = paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bld
 * JD-Core Version:    0.7.0.1
 */