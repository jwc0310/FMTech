import android.content.Context;
import android.os.Bundle;

final class dfj
  extends gzf
{
  private final Context a;
  private final int b;
  
  dfj(Context paramContext, int paramInt)
  {
    super(paramContext, "ProfileNameEditBackgroundTask");
    this.a = paramContext;
    this.b = paramInt;
  }
  
  protected final hae a()
  {
    String str = jjf.a(((giz)mbb.a(this.a, giz.class)).a(this.b).b("gaia_id"));
    byte[] arrayOfByte = brn.a(brn.a(this.a, this.b, str, false).h);
    hae localhae = new hae(true);
    localhae.a().putByteArray("name_edit_info_bytes", arrayOfByte);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfj
 * JD-Core Version:    0.7.0.1
 */