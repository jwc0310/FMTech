import android.content.Context;
import android.os.Bundle;
import java.util.List;

final class ims
  extends gzf
{
  private final String a;
  private final String b;
  private final imt c;
  private final ilf d;
  
  ims(String paramString1, String paramString2, String paramString3, imt paramimt, ilf paramilf)
  {
    super(paramString1);
    this.a = paramString2;
    this.b = paramString3;
    this.c = paramimt;
    this.d = paramilf;
  }
  
  protected final hae a(Context paramContext)
  {
    ilx localilx = this.c.a(this.a, this.b, this.d, false);
    hae localhae = imm.a(localilx);
    if (localilx.a) {
      localhae.a().putInt("account_id", ((Integer)localilx.f.get(0)).intValue());
    }
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ims
 * JD-Core Version:    0.7.0.1
 */