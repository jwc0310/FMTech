import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.apps.plus.fragments.EditEventFragment;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

public final class bzg
  implements TextWatcher
{
  public bzg(EditEventFragment paramEditEventFragment) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    String str1 = this.a.al.getText().toString().trim();
    hxj localhxj;
    String str2;
    if (!TextUtils.equals(this.a.ac.m(), str1))
    {
      localhxj = this.a.ac;
      str2 = kia.a(this.a.al.getText());
      if (localhxj.a == null) {
        break label105;
      }
      localhxj.a.c = str2;
    }
    for (;;)
    {
      this.a.ab = true;
      if (this.a.ae != null) {}
      return;
      label105:
      localhxj.b.c = str2;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzg
 * JD-Core Version:    0.7.0.1
 */