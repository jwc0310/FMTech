import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

final class cmm
  extends cmy
{
  int a;
  RadioGroup b;
  private cml c;
  
  public cmm(cmj paramcmj, int paramInt, cml paramcml, RadioGroup paramRadioGroup)
  {
    super(paramcmj, 0);
    this.a = paramInt;
    this.c = paramcml;
    this.b = paramRadioGroup;
  }
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    int i = 1;
    cml localcml = this.c;
    int j = localcml.f.a.getCheckedRadioButtonId();
    int k;
    if (j == 1003) {
      if ((localcml.d.getSelectedItemPosition() != 0) && (!TextUtils.isEmpty(localcml.e.getText().toString().trim())))
      {
        k = i;
        if (localcml.a == j) {
          break label115;
        }
        label73:
        if (k == 0) {
          break label192;
        }
      }
    }
    for (;;)
    {
      super.onCheckedChanged(paramRadioGroup, i);
      if (this.a != paramInt)
      {
        this.a = paramInt;
        this.d.b(this.a);
      }
      return;
      k = 0;
      break;
      label115:
      if ((k != 0) && ((localcml.d.getSelectedItemPosition() != localcml.b) || (!localcml.e.getText().toString().equals(localcml.c))))
      {
        k = i;
        break label73;
      }
      k = 0;
      break label73;
      if (localcml.a != j)
      {
        k = i;
        break label73;
      }
      k = 0;
      break label73;
      label192:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmm
 * JD-Core Version:    0.7.0.1
 */