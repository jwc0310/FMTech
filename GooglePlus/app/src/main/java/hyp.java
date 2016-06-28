import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class hyp
  implements DialogInterface.OnClickListener
{
  hyp(hyo paramhyo, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hza localhza = this.b.b.b;
    hyf localhyf = this.b.a;
    String str = this.a.getText().toString();
    localhza.a.a(localhyf, str);
    localhza.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyp
 * JD-Core Version:    0.7.0.1
 */