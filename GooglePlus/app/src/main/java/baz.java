import android.view.View;
import android.view.View.OnLongClickListener;

final class baz
  implements View.OnLongClickListener
{
  baz(baw parambaw) {}
  
  public final boolean onLongClick(View paramView)
  {
    if (this.a.v())
    {
      if (!this.a.a.e)
      {
        this.a.c = true;
        baw localbaw = this.a;
        boolean bool1 = this.a.a.e;
        boolean bool2 = false;
        if (!bool1) {
          bool2 = true;
        }
        localbaw.a(bool2, true);
        return true;
      }
    }
    else {
      baw.a(this.a, this.a.b);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     baz
 * JD-Core Version:    0.7.0.1
 */