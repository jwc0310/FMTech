import android.content.Context;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class hvf
  extends gzf
{
  private final Context a;
  private final int b;
  private final List<hus> c;
  
  public hvf(Context paramContext, int paramInt, List<hus> paramList)
  {
    super(paramContext, "InsertUploadSuggestionEventsTask");
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramList;
  }
  
  protected final hae a()
  {
    hvi localhvi = (hvi)mbb.a(this.a, hvi.class);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      hus localhus = (hus)localIterator.next();
      localhvi.a(this.a, this.b, localhus);
    }
    try
    {
      localhvi.a(this.a, this.b);
      hae localhae = new hae(200, null, null);
      return localhae;
    }
    catch (IOException localIOException)
    {
      return new hae(0, localIOException, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvf
 * JD-Core Version:    0.7.0.1
 */