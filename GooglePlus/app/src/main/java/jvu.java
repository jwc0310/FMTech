import android.content.Context;
import android.os.Bundle;

public final class jvu
  implements jtr, mbo, mfd
{
  private Context a;
  private jtv b;
  
  jvu(mek parammek)
  {
    parammek.a(this);
  }
  
  public jvu(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  public final void a()
  {
    if (this.b != null) {
      if (((jxg)this.b.c()).x == -1) {
        break label33;
      }
    }
    label33:
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    String str1 = this.b.f();
    String str2 = this.b.e().a;
    ((jts)mbb.a(this.a, jts.class)).b(((git)mbb.a(this.a, git.class)).c(), str1, str2);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
  }
  
  public final void a(jtv paramjtv)
  {
    this.b = paramjtv;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvu
 * JD-Core Version:    0.7.0.1
 */