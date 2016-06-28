import android.view.View;
import android.view.View.OnClickListener;

final class akp
  implements View.OnClickListener
{
  akp(akl paramakl) {}
  
  public final void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    if (this.a.a != null) {
      this.a.a.a(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akp
 * JD-Core Version:    0.7.0.1
 */