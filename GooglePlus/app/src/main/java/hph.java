import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class hph
  implements hhp, mbo, mfd
{
  private int b;
  private mbb c;
  private Context d;
  private gug e;
  private Bundle f;
  private final boolean g;
  
  public hph(mek parammek)
  {
    this(parammek, true);
  }
  
  public hph(mek parammek, boolean paramBoolean)
  {
    parammek.a(this);
    this.g = paramBoolean;
    this.f = new hhg().a().a;
  }
  
  public final void a()
  {
    Intent localIntent = ((hpo)this.c.a(hpo.class)).a(this.f, this.b);
    if (this.e != null)
    {
      this.e.a(a, localIntent);
      return;
    }
    this.d.startActivity(localIntent);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = paramContext;
    this.c = parammbb;
    this.b = ((git)parammbb.a(git.class)).c();
    if (this.g) {
      this.e = ((gug)parammbb.b(gug.class));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    this.f = paramBundle;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt)
  {
    this.d.startActivity(((hpo)this.c.a(hpo.class)).a(paramString1, paramString2, paramString3, this.b, paramBoolean, paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hph
 * JD-Core Version:    0.7.0.1
 */