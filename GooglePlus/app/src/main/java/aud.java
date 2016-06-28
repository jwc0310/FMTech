import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

public class aud
  implements jen<aud>, mbo, mes, mfa, mfd
{
  public final jeo<aud> a = new jem(this);
  public isq b;
  private gpl c;
  private final Bundle d;
  
  public aud(Activity paramActivity, mek parammek)
  {
    this.d = paramActivity.getIntent().getExtras();
    parammek.a(this);
  }
  
  public final void a()
  {
    isq localisq = this.b;
    localisq.a.clear();
    localisq.b = 0;
    localisq.c = 0;
    localisq.d = 0;
    localisq.g = 0;
    localisq.h = 0;
    localisq.e = 0;
    localisq.i = 0;
    localisq.j = 0;
    localisq.k = 0;
    c();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((gpl)mbb.b(paramContext, gpl.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      isq localisq = (isq)paramBundle.getParcelable("com.google.android.apps.photos.selection.SelectionModel.MediaSelection");
      if (localisq != null) {
        this.b = localisq;
      }
    }
    do
    {
      return;
      if (this.d != null) {
        this.b = ((isq)this.d.getParcelable("photo_picker_selected"));
      }
    } while (this.b != null);
    this.b = new isq();
  }
  
  public final jeo<aud> b()
  {
    return this.a;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("com.google.android.apps.photos.selection.SelectionModel.MediaSelection", this.b);
  }
  
  public final void c()
  {
    if (this.c != null) {
      this.c.b();
    }
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aud
 * JD-Core Version:    0.7.0.1
 */