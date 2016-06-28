import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class cki
  implements View.OnClickListener
{
  cki(ckf paramckf) {}
  
  public final void onClick(View paramView)
  {
    if (!this.a.b.a())
    {
      this.a.bn.startActivity(this.a.b.b());
      return;
    }
    Intent localIntent = efj.g(this.a.bn, this.a.am.c());
    localIntent.putExtra("people_clear_cache", this.a.c);
    this.a.a(localIntent);
    this.a.c = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cki
 * JD-Core Version:    0.7.0.1
 */