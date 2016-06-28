import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import java.util.Calendar;

public class cms
  implements CompoundButton.OnCheckedChangeListener
{
  private final EditText a;
  private final cmt b;
  private String c;
  private final boolean d;
  
  public cms(cmo paramcmo, EditText paramEditText, cmt paramcmt, boolean paramBoolean)
  {
    this.a = paramEditText;
    this.b = paramcmt;
    this.d = paramBoolean;
  }
  
  public cms(cmo paramcmo, boolean paramBoolean)
  {
    this.a = null;
    this.b = null;
    this.d = paramBoolean;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = 1;
    EditText localEditText;
    if (this.a != null)
    {
      if (!paramBoolean) {
        break label103;
      }
      this.c = this.a.getText().toString();
      this.e.a(this.a);
      this.a.removeTextChangedListener(this.b);
      Calendar localCalendar = Calendar.getInstance();
      this.a.setText(Integer.toString(localCalendar.get(i)));
      localEditText = this.a;
      if (paramBoolean) {
        break label149;
      }
    }
    for (;;)
    {
      localEditText.setEnabled(i);
      if (this.d != paramBoolean) {
        break label154;
      }
      this.e.a(paramCompoundButton);
      return;
      label103:
      if (this.c == null) {
        this.c = this.a.getText().toString();
      }
      this.a.addTextChangedListener(this.b);
      this.a.setText(this.c);
      break;
      label149:
      int j = 0;
    }
    label154:
    this.e.b(paramCompoundButton);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cms
 * JD-Core Version:    0.7.0.1
 */