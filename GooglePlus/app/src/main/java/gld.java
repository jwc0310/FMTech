import android.content.Context;
import android.os.Bundle;

public final class gld
  implements mbo, mfd
{
  private ikt a;
  
  public gld(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((ikt)parammbb.a(ikt.class));
  }
  
  public final void a(gmf paramgmf)
  {
    ilf localilf1 = new ilf();
    localilf1.g = true;
    ilf localilf2 = paramgmf.a(localilf1);
    int i = localilf2.c;
    ikt localikt = this.a;
    efj.k();
    if (i != localikt.e) {
      this.a.a(localilf2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gld
 * JD-Core Version:    0.7.0.1
 */