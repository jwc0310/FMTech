import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class kza
  implements gii, gzi, mbo, mfd
{
  public final bk a;
  private final kye b;
  private final kyd c;
  private gzj d;
  private Context e;
  private git f;
  
  public kza(bk parambk, mek parammek, kye paramkye, kyd paramkyd)
  {
    this.a = parambk;
    parammek.a(this);
    this.b = paramkye;
    this.c = paramkyd;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = paramContext;
    this.f = ((git)parammbb.a(git.class));
    this.d = ((gzj)parammbb.a(gzj.class));
    this.d.a.add(this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("ReportSquareTask".equals(paramString)) && (this.c.O() == 5)) {
      this.d.b(new kzg(this.e, this.f.c(), this.b.N()));
    }
  }
  
  public final void c_(int paramInt)
  {
    this.d.c(new kzb(this.f.c(), this.b.N(), paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kza
 * JD-Core Version:    0.7.0.1
 */