import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class jeu
  implements mbo, mfd
{
  public final bp a;
  public List<jes> b;
  public git c;
  public boolean d;
  private jyl e;
  private jew f;
  
  public jeu(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = parammbb.c(jes.class);
    this.c = ((git)parammbb.a(git.class));
    this.e = ((jyl)parammbb.a(jyl.class));
    this.f = ((jew)parammbb.a(jew.class));
  }
  
  public final boolean a()
  {
    int i = this.c.c();
    int j = this.b.size();
    for (int k = 0; k < j; k++) {
      if (((jes)this.b.get(k)).a(this.a, i, this.d) == jet.a) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jeu
 * JD-Core Version:    0.7.0.1
 */