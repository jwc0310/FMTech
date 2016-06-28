import android.content.Context;
import android.os.Bundle;

public final class jyj
  implements mbo, mfd
{
  private final bp a;
  private final mek b;
  
  public jyj(bp parambp, mek parammek)
  {
    this.a = parambp;
    this.b = parammek;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    jyk localjyk = (jyk)parammbb.b(jyk.class);
    if (localjyk != null) {
      localjyk.a(this.a, this.b);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyj
 * JD-Core Version:    0.7.0.1
 */