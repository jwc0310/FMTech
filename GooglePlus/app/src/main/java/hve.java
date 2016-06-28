import android.content.Context;
import java.io.IOException;

public final class hve
  extends gzf
{
  private final Context a;
  private final int b;
  private final hus c;
  
  public hve(Context paramContext, int paramInt, hus paramhus)
  {
    super(paramContext, "InsertUploadSuggestionEventTask");
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramhus;
  }
  
  protected final hae a()
  {
    hvi localhvi = (hvi)mbb.a(this.a, hvi.class);
    localhvi.a(this.a, this.b, this.c);
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
 * Qualified Name:     hve
 * JD-Core Version:    0.7.0.1
 */