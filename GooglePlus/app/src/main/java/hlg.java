import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

public final class hlg
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String[] d;
  
  public hlg(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    super("GetCollexionsExploreStreamTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramArrayOfString;
  }
  
  protected final hae a(Context paramContext)
  {
    try
    {
      kcg localkcg = new kch().a(paramContext, this.a).a();
      hke localhke = new hke(paramContext, localkcg, this.c, this.d);
      localhke.a.i();
      localhke.a.c("GetClxExploreStreamOp");
      if (localhke.a.n()) {
        return new hae(localhke.a.o, localhke.a.q, null);
      }
      String str1 = efj.a(this.b, null, false, null, null, 5, "collection_explore_stream");
      String str2 = localhke.a().b.c;
      ((llk)mbb.a(paramContext, llk.class)).a(paramContext, this.a, str1, System.currentTimeMillis(), localhke.a().b.b, 3, this.c, str2, null, null, true, null, "collection_explore_stream");
      hae localhae = new hae(true);
      Bundle localBundle = localhae.a();
      localBundle.putString("clx_new_continuation_token", str2);
      localBundle.putStringArray("clx_obfuscated_collexion_ids", localhke.a().c);
      return localhae;
    }
    catch (IOException localIOException)
    {
      return new hae(0, localIOException, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlg
 * JD-Core Version:    0.7.0.1
 */