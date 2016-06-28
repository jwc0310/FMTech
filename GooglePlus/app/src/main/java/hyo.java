import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

final class hyo
  implements View.OnClickListener
{
  final hyf a;
  
  hyo(hyn paramhyn, hyf paramhyf)
  {
    this.a = paramhyf;
  }
  
  public final void onClick(View paramView)
  {
    if (hyn.a(this.a))
    {
      Toast.makeText(this.b.a, dl.c, 0).show();
      return;
    }
    if (this.a.c == hym.a)
    {
      Toast.makeText(this.b.a, dl.d, 0).show();
      return;
    }
    if (!this.b.b.a(this.a))
    {
      EditText localEditText = new EditText(this.b.a);
      localEditText.setInputType(1);
      AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this.b.a).setTitle(dl.i).setView(localEditText);
      localBuilder1.setPositiveButton(dl.k, new hyp(this, localEditText));
      localBuilder1.setNegativeButton(dl.b, new hyq(this));
      localBuilder1.show();
      return;
    }
    AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(this.b.a).setTitle(dl.i).setMessage(dl.g);
    localBuilder2.setPositiveButton(dl.k, new hyr(this));
    localBuilder2.setNegativeButton(dl.b, new hys(this));
    localBuilder2.show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyo
 * JD-Core Version:    0.7.0.1
 */