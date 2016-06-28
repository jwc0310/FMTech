import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

public final class bye
  extends lut
  implements TextWatcher
{
  MentionMultiAutoCompleteTextView Z;
  private String aa;
  private int ac;
  
  private void w()
  {
    AlertDialog localAlertDialog = (AlertDialog)this.d;
    if (localAlertDialog == null) {
      return;
    }
    localAlertDialog.getButton(-1).setEnabled(this.Z.c());
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    View localView = ((LayoutInflater)f().getSystemService("layout_inflater")).inflate(efj.tg, null);
    this.Z = ((MentionMultiAutoCompleteTextView)localView.findViewById(aaw.ls));
    this.aa = localBundle.getString("activity_id");
    this.ac = localBundle.getInt("account_id");
    this.Z.a(this, this.ac, this.aa, null);
    this.Z.c = true;
    this.Z.addTextChangedListener(this);
    if (paramBundle != null) {
      this.Z.setText(paramBundle.getCharSequence("comment_text"));
    }
    for (;;)
    {
      localBuilder.setView(localView);
      localBuilder.setTitle(localBundle.getInt("title_id", aau.kB));
      localBuilder.setPositiveButton(aau.tn, this);
      return localBuilder.create();
      this.Z.a(localBundle.getString("comment_text"));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putCharSequence("comment_text", this.Z.getText());
  }
  
  public final void m()
  {
    super.m();
    if (this.Z != null) {
      this.Z.post(new byf(this));
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(kia.a(this.Z.getText()));
      while ((localSpannableStringBuilder.length() > 0) && (Character.isWhitespace(localSpannableStringBuilder.charAt(0)))) {
        localSpannableStringBuilder.delete(0, 1);
      }
      while ((localSpannableStringBuilder.length() > 0) && (Character.isWhitespace(localSpannableStringBuilder.charAt(-1 + localSpannableStringBuilder.length())))) {
        localSpannableStringBuilder.delete(-1 + localSpannableStringBuilder.length(), localSpannableStringBuilder.length());
      }
      byg localbyg = (byg)this.n;
      this.m.getString("comment_id");
      localbyg.a(localSpannableStringBuilder.toString());
    }
    super.onClick(paramDialogInterface, paramInt);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    w();
  }
  
  public final void p_()
  {
    super.p_();
    w();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bye
 * JD-Core Version:    0.7.0.1
 */