import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

final class kub
  implements mbo, mes, mew, mfd
{
  private final Activity a;
  private git b;
  private int c;
  
  public kub(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((git)parammbb.a(git.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    this.c = this.a.getResources().getConfiguration().orientation;
  }
  
  public final void c()
  {
    int i = this.a.getResources().getConfiguration().orientation;
    if (this.c != i) {}
    for (int j = 1;; j = 0)
    {
      this.c = i;
      if ((j != 0) && (this.b.d())) {
        gwz.a(this.a, 19);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kub
 * JD-Core Version:    0.7.0.1
 */