import android.content.Context;
import android.os.Bundle;

public final class kmr
  extends gzf
{
  private final int a;
  
  public kmr(String paramString, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    int i = ((kht)mbb.a(paramContext, kht.class)).a(this.a);
    hae localhae = new hae(true);
    localhae.a().putInt("count_of_drafts_deleted", i);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmr
 * JD-Core Version:    0.7.0.1
 */