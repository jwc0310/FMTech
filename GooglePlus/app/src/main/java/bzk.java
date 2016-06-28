import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public final class bzk
  extends lut
  implements TextWatcher
{
  private EditText Z;
  
  public static bzk a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    if (paramString1 != null) {
      localBundle.putString("title", paramString1);
    }
    localBundle.putString("message", null);
    localBundle.putString("hint", paramString3);
    if (paramString4 != null) {
      localBundle.putString("positive", paramString4);
    }
    if (paramString5 != null) {
      localBundle.putString("negative", paramString5);
    }
    localBundle.putBoolean("allow_empty", false);
    bzk localbzk = new bzk();
    localbzk.f(localBundle);
    return localbzk;
  }
  
  private void w()
  {
    AlertDialog localAlertDialog = (AlertDialog)this.d;
    if (localAlertDialog == null) {}
    while (this.m.getBoolean("allow_empty")) {
      return;
    }
    Button localButton = localAlertDialog.getButton(-1);
    if (!TextUtils.isEmpty(this.Z.getText().toString().trim())) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    View localView = ((LayoutInflater)f().getSystemService("layout_inflater")).inflate(efj.wz, null);
    this.Z = ((EditText)localView.findViewById(aaw.lv));
    if (!localBundle.getBoolean("allow_empty")) {
      this.Z.addTextChangedListener(this);
    }
    if (paramBundle != null) {
      this.Z.setText(paramBundle.getString("message"));
    }
    for (;;)
    {
      this.Z.setHint(localBundle.getString("hint"));
      localBuilder.setView(localView);
      if (localBundle.containsKey("title")) {
        localBuilder.setTitle(localBundle.getString("title"));
      }
      if (localBundle.containsKey("positive")) {
        localBuilder.setPositiveButton(localBundle.getString("positive"), this);
      }
      if (localBundle.containsKey("negative")) {
        localBuilder.setNegativeButton(localBundle.getString("negative"), this);
      }
      return localBuilder.create();
      this.Z.setText(localBundle.getString("message"));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putString("message", this.Z.getText().toString());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.m.putString("message", this.Z.getText().toString().trim());
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
 * Qualified Name:     bzk
 * JD-Core Version:    0.7.0.1
 */