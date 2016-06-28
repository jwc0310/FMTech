import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class jnd
  implements gom
{
  private static int a = -1;
  private final Context b;
  private final jjg c;
  private final boolean d;
  
  jnd(Context paramContext, jne paramjne)
  {
    this.b = paramContext;
    this.c = paramjne.a;
    this.d = paramjne.b;
  }
  
  public final View a()
  {
    AvatarView localAvatarView = new AvatarView(this.b);
    localAvatarView.a(this.c.a(), this.c.e());
    localAvatarView.g = false;
    localAvatarView.e = 1;
    localAvatarView.a(1);
    return localAvatarView;
  }
  
  public final String b()
  {
    return this.c.d();
  }
  
  public final int c()
  {
    if (a == -1) {
      a = this.b.getResources().getColor(efj.Sl);
    }
    return a;
  }
  
  public final int d()
  {
    return ehr.de;
  }
  
  public final String e()
  {
    Context localContext = this.b;
    int i = aaw.pO;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.c.d();
    return localContext.getString(i, arrayOfObject);
  }
  
  public final boolean f()
  {
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnd
 * JD-Core Version:    0.7.0.1
 */