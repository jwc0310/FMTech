import android.content.Context;
import java.util.Random;

public final class bky
  extends cun<myx, myy>
{
  private static final Random a = new Random();
  private final String b;
  private final String c;
  private final String d;
  private final byte[] e;
  
  public bky(Context paramContext, int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    super(paramContext, paramInt, "postcomment", new myx(), new myy());
    this.b = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramArrayOfByte;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bky
 * JD-Core Version:    0.7.0.1
 */