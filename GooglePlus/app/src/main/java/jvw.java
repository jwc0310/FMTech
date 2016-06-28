import android.content.Context;
import android.os.Bundle;

final class jvw
  implements jts, mbo, mfd
{
  private Context a;
  private gzj b;
  
  jvw(mek parammek)
  {
    parammek.a(this);
  }
  
  jvw(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  private final gzj a()
  {
    if (this.b == null) {
      this.b = ((gzj)mbb.a(this.a, gzj.class));
    }
    return this.b;
  }
  
  public final void a(int paramInt, String paramString1, String paramString2)
  {
    jvd localjvd = new jvd(paramInt, paramString1, paramString2);
    a().c(localjvd);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    a().b(new juk(paramInt1, paramString1, paramString2, paramInt2, paramInt3, paramBoolean));
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    nul localnul = new nul();
    localnul.a = paramString3;
    a().b(new jvz(paramInt1, paramString1, paramString2, localnul, paramInt2, paramInt3, paramBoolean));
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
  }
  
  public final void b(int paramInt, String paramString1, String paramString2)
  {
    jvt localjvt = new jvt(paramInt, paramString1, paramString2);
    a().c(localjvt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvw
 * JD-Core Version:    0.7.0.1
 */