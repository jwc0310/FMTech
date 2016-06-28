import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public final class hgm
  extends lut
  implements TextWatcher
{
  private EditText Z;
  
  private void w()
  {
    AlertDialog localAlertDialog = (AlertDialog)this.d;
    if (localAlertDialog == null) {
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
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    this.Z.setSelection(this.Z.length());
    return localView;
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    Context localContext = ar_();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
    View localView = LayoutInflater.from(localContext).inflate(efj.Ho, null);
    this.Z = ((EditText)localView.findViewById(ehr.ay));
    this.Z.addTextChangedListener(this);
    this.Z.setHint(aw.aA);
    localView.findViewById(ehr.ax).setVisibility(8);
    localView.findViewById(ehr.az).setVisibility(8);
    if (paramBundle != null) {
      this.Z.setText(paramBundle.getCharSequence("name"));
    }
    for (;;)
    {
      localBuilder.setView(localView);
      localBuilder.setTitle(aw.ay);
      localBuilder.setPositiveButton(aw.aB, this);
      localBuilder.setNegativeButton(aw.ax, this);
      return localBuilder.create();
      Bundle localBundle = this.m;
      this.Z.setText(localBundle.getCharSequence("name"));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putCharSequence("name", this.Z.getText());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      hgn localhgn = (hgn)this.n;
      if (localhgn == null) {
        localhgn = (hgn)f();
      }
      localhgn.a(this.m.getString("circle_id"), this.Z.getText().toString().trim());
    }
    efj.k(this.Z);
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
 * Qualified Name:     hgm
 * JD-Core Version:    0.7.0.1
 */