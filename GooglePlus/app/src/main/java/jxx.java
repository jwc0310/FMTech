import android.content.Context;
import android.os.Bundle;
import java.util.Set;

final class jxx
  implements mbo, mes, meu, mfd
{
  private final bk a;
  private jxv b;
  
  jxx(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((jxv)parammbb.a(jxv.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    jxv localjxv = this.b;
    bk localbk = this.a;
    efj.b(localjxv.b.add(localbk), "Already added: %s", new Object[] { localbk });
    localjxv.a.a(localbk);
  }
  
  public final void m_()
  {
    jxv localjxv = this.b;
    bk localbk = this.a;
    efj.b(localjxv.b.remove(localbk), "Failed to remove: %s", new Object[] { localbk });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxx
 * JD-Core Version:    0.7.0.1
 */