import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public final class isg
  implements mbo, mes, mfa, mfd
{
  public gug a;
  public Context b;
  public git c;
  isi d;
  private final guf e = new ish(this);
  private Uri f;
  
  public isg(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.a = ((gug)parammbb.a(gug.class)).a(efj.PL, this.e);
    this.c = ((git)parammbb.a(git.class));
    this.d = ((isi)parammbb.a(isi.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.f = ((Uri)paramBundle.getParcelable("mediapickermixin_selected_image_uri"));
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    if (this.f != null) {
      paramBundle.putParcelable("mediapickermixin_selected_image_uri", this.f);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isg
 * JD-Core Version:    0.7.0.1
 */