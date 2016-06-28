import android.content.Context;
import android.os.Bundle;

public final class lfi
  implements lfh, mbo, mfd
{
  private final bk a;
  private Context b;
  private git c;
  
  public lfi(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((git)parammbb.a(git.class));
  }
  
  public final void a(String paramString)
  {
    lfj locallfj = new lfj(this.b, this.c.c(), paramString);
    ((gzj)mbb.a(this.b, gzj.class)).b(locallfj);
  }
  
  public final void b(String paramString)
  {
    lfg locallfg = new lfg();
    Bundle localBundle = new Bundle();
    localBundle.putString("square_id", paramString);
    locallfg.f(localBundle);
    locallfg.a(this.a.h(), null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfi
 * JD-Core Version:    0.7.0.1
 */