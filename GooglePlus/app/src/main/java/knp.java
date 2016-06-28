import android.content.Context;
import android.os.Bundle;

public final class knp
  extends gzf
{
  private final kog a;
  private final long b;
  private final int c;
  
  public knp(String paramString, long paramLong, kog paramkog, int paramInt)
  {
    super(paramString);
    this.a = paramkog;
    this.b = paramLong;
    this.c = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    hae localhae = new hae(((kht)mbb.a(paramContext, kht.class)).a(this.b, this.a, this.c));
    localhae.a().putLong("draft_id_extra", this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knp
 * JD-Core Version:    0.7.0.1
 */