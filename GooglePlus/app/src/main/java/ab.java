import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public final class ab
  extends ph
{
  public ab(Snackbar paramSnackbar) {}
  
  public final void a(View paramView)
  {
    TextView localTextView1 = null.a;
    nj.a.c(localTextView1, 0.0F);
    TextView localTextView2 = null.a;
    nj.a.j(localTextView2).a(1.0F).a(180L).b(70L).b();
    if (null.b.getVisibility() == 0)
    {
      Button localButton1 = null.b;
      nj.a.c(localButton1, 0.0F);
      Button localButton2 = null.b;
      nj.a.j(localButton2).a(1.0F).a(180L).b(70L).b();
    }
  }
  
  public final void b(View paramView)
  {
    if (Snackbar.b(this.a) != null) {
      Snackbar.b(this.a);
    }
    dbi.a().b(Snackbar.a(this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ab
 * JD-Core Version:    0.7.0.1
 */