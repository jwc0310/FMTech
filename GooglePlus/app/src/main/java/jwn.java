import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

final class jwn
  implements jtx, mbo, mfd
{
  private Context a;
  private gzj b;
  private jts c;
  
  jwn(mek parammek)
  {
    parammek.a(this);
  }
  
  jwn(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  private final jts a()
  {
    if (this.c == null) {
      this.c = ((jts)mbb.a(this.a, jts.class));
    }
    return this.c;
  }
  
  private final gzj b()
  {
    if (this.a == null) {
      return null;
    }
    if (this.b == null) {
      this.b = ((gzj)mbb.a(this.a, gzj.class));
    }
    return this.b;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
  }
  
  public final void a(gzi paramgzi)
  {
    gzj localgzj = b();
    if (localgzj == null) {
      return;
    }
    localgzj.a.add(paramgzi);
  }
  
  public final void a(String paramString, lly paramlly, int paramInt)
  {
    gzj localgzj = b();
    if (localgzj == null) {
      return;
    }
    localgzj.b(new jwd(this.a.getApplicationContext(), paramInt, paramString, paramlly));
  }
  
  public final void a(String paramString, lly paramlly, int paramInt, boolean paramBoolean)
  {
    int i = ((git)mbb.a(this.a, git.class)).c();
    a(paramString, paramlly, i);
    jts localjts = a();
    String str1 = paramlly.a;
    if (paramlly.a()) {}
    for (String str2 = paramlly.h[paramlly.k].a;; str2 = null)
    {
      localjts.a(i, paramString, str1, str2, paramlly.k, paramInt, paramBoolean);
      return;
    }
  }
  
  public final void b(gzi paramgzi)
  {
    gzj localgzj = b();
    if (localgzj == null) {
      return;
    }
    localgzj.a.remove(paramgzi);
  }
  
  public final void b(String paramString, lly paramlly, int paramInt, boolean paramBoolean)
  {
    int i = ((git)mbb.a(this.a, git.class)).c();
    a(paramString, paramlly, i);
    a().a(i, paramString, paramlly.a, paramlly.k, paramInt, paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwn
 * JD-Core Version:    0.7.0.1
 */