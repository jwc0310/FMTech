import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

final class cnk
  implements CompoundButton.OnCheckedChangeListener
{
  cnk(cnj paramcnj) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    cnj localcnj;
    int i;
    if ((paramCompoundButton.isChecked()) && (!TextUtils.isEmpty(this.a.a.getText().toString())))
    {
      localcnj = this.a;
      i = paramCompoundButton.getId();
      if (i != aaw.gN) {
        break label51;
      }
      localcnj.aA = 1;
    }
    label51:
    do
    {
      return;
      if (i == aaw.gP)
      {
        localcnj.aA = 2;
        return;
      }
    } while (i != aaw.gO);
    localcnj.aA = 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnk
 * JD-Core Version:    0.7.0.1
 */