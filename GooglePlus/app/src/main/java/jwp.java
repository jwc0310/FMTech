import android.content.Context;
import android.os.Bundle;

class jwp
  extends gzf
{
  private boolean a;
  public final int b;
  public final String c;
  public final String d;
  private int l;
  private int m;
  
  public jwp(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(paramString1);
    this.b = paramInt1;
    this.c = paramString2;
    this.d = paramString3;
    this.l = paramInt2;
    this.m = paramInt3;
    this.a = paramBoolean;
  }
  
  protected final hae a(Context paramContext, int paramInt, Exception paramException, boolean paramBoolean, nuc paramnuc)
  {
    hae localhae = new hae(paramInt, paramException, null);
    localhae.a().putString("activity_id", this.c);
    if (!paramBoolean)
    {
      ((jtm)mbb.a(paramContext, jtm.class)).a(this.b, this.c, paramnuc, this.a);
      byte[] arrayOfByte = qat.a(paramnuc);
      localhae.a().putByteArray("poll_data", arrayOfByte);
      return localhae;
    }
    localhae.a().putInt("voted_option_index", this.l);
    localhae.a().putInt("previous_voted_option_index", this.m);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwp
 * JD-Core Version:    0.7.0.1
 */