import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class lfz
  implements gzi, lfy, mbo, mfd
{
  private final bk a;
  private Context b;
  private git c;
  
  public lfz(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((git)parammbb.a(git.class));
    ((gzj)parammbb.a(gzj.class)).a.add(this);
  }
  
  public final void a(String paramString, int paramInt)
  {
    lfx.a(paramString, paramInt).a(this.a.h(), null);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("EditSquareMembershipTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label38;
      }
    }
    label38:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        this.a.f().finish();
      }
      return;
    }
  }
  
  public final void b(String paramString)
  {
    lfp locallfp = new lfp(this.b, this.c.c(), paramString, 5);
    ((gzj)mbb.a(this.b, gzj.class)).c(locallfp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfz
 * JD-Core Version:    0.7.0.1
 */