import android.content.Context;
import android.os.Bundle;

public final class kms
  extends gzf
{
  private final int a;
  private final long b;
  
  public kms(String paramString, long paramLong, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
    this.b = paramLong;
  }
  
  protected final hae a(Context paramContext)
  {
    hae localhae = new hae(((kht)mbb.a(paramContext, kht.class)).a(this.b, this.a));
    localhae.a().putLong("draft_id_extra", this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kms
 * JD-Core Version:    0.7.0.1
 */