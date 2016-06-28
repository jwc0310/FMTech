import android.content.Context;
import android.os.Bundle;

public final class les
  implements lex, mbo, mfd
{
  final bk a;
  private Context b;
  private git c;
  
  public les(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((git)parammbb.a(git.class));
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    lfp locallfp = new lfp(this.b, this.c.c(), paramString1, paramInt);
    locallfp.a = paramString2;
    ((gzj)mbb.a(this.b, gzj.class)).c(locallfp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     les
 * JD-Core Version:    0.7.0.1
 */