import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

final class juv
  implements TextWatcher
{
  private final int a;
  
  public juv(juo paramjuo)
  {
    this.a = 2147483647;
  }
  
  public juv(juo paramjuo, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    if (!this.b.ae) {}
    do
    {
      return;
      if (this.a == 2147483647)
      {
        juo.a(this.b).a(kia.a(this.b.a.getText()), true);
        return;
      }
    } while (this.a >= juo.a(this.b).c());
    juo.a(this.b).a(this.a).a(paramEditable.toString().trim());
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juv
 * JD-Core Version:    0.7.0.1
 */