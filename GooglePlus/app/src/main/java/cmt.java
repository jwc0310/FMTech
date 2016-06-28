import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

public class cmt
  implements TextWatcher
{
  private final View a;
  private final String b;
  
  public cmt(cmo paramcmo, View paramView, String paramString)
  {
    this.a = paramView;
    this.b = paramString;
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.toString().equals(this.b))
    {
      this.c.a(this.a);
      return;
    }
    this.c.b(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmt
 * JD-Core Version:    0.7.0.1
 */