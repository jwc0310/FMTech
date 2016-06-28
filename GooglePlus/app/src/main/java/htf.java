import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.TextView;

final class htf
  implements View.OnClickListener
{
  htf(hte paramhte, CheckedTextView paramCheckedTextView) {}
  
  public final void onClick(View paramView)
  {
    if ((paramView instanceof CheckedTextView)) {
      ((CheckedTextView)paramView).toggle();
    }
    this.b.a.setText(this.b.a(this.a.isChecked()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htf
 * JD-Core Version:    0.7.0.1
 */