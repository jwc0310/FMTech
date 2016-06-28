import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

final class hpf
  implements TextWatcher
{
  hpf(hpb paramhpb) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    TextView localTextView = this.a.d;
    if (!TextUtils.isEmpty(this.a.x())) {}
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      this.a.w();
      return;
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    TextView localTextView = this.a.aa;
    hpb localhpb = this.a;
    int i = ehr.bF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramCharSequence.length());
    arrayOfObject[1] = Integer.valueOf(50);
    localTextView.setText(localhpb.g().getString(i, arrayOfObject));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpf
 * JD-Core Version:    0.7.0.1
 */