import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

final class lva
  implements Runnable
{
  lva(luy paramluy, Bundle paramBundle) {}
  
  public final void run()
  {
    efj.j(this.b.Z);
    if (this.a.getBoolean("cursor_at_end", false)) {
      this.b.Z.setSelection(this.b.Z.getText().length());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lva
 * JD-Core Version:    0.7.0.1
 */