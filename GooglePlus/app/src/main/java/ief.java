import android.view.View;
import com.google.android.libraries.social.help.TooltipView;

public final class ief
  implements lvh
{
  final TooltipView a;
  private long c;
  private boolean d;
  
  public ief(iee paramiee, TooltipView paramTooltipView)
  {
    this.a = paramTooltipView;
  }
  
  public final void a(View paramView, int paramInt) {}
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = lwo.a(this.a, paramView);
    if ((!this.d) && (bool))
    {
      this.c = this.b.a.a();
      this.d = true;
    }
    do
    {
      return;
      if ((this.d) && (!bool))
      {
        if (a())
        {
          this.b.d(this.a);
          iee.b(this.a);
          return;
        }
        this.c = 0L;
        this.d = false;
        return;
      }
    } while ((!this.d) || (!bool) || (!a()));
    this.b.d(this.a);
    iee.b(this.a);
  }
  
  public final boolean a()
  {
    return (this.c != 0L) && (iee.a(this.b.a, this.c));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ief
 * JD-Core Version:    0.7.0.1
 */