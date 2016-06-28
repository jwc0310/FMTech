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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public final class cwm
  extends lut
  implements TextWatcher
{
  TextView Z;
  CheckBox aa;
  private TextView ac;
  
  private final boolean w()
  {
    Bundle localBundle = this.m;
    return (localBundle == null) || (TextUtils.isEmpty(localBundle.getString("circle_id")));
  }
  
  private void x()
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
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    Context localContext = ar_();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
    View localView = LayoutInflater.from(localContext).inflate(aau.wO, null);
    this.Z = ((TextView)localView.findViewById(efj.AE));
    this.Z.addTextChangedListener(this);
    this.Z.setHint(eyg.h);
    this.Z.post(new cwn(this));
    this.aa = ((CheckBox)localView.findViewById(efj.AF));
    this.ac = ((TextView)localView.findViewById(efj.AH));
    efj.a(this.ac, new gxq(pkf.l));
    this.ac.setOnClickListener(new gxn(new cwo(this)));
    localView.findViewById(efj.AG).setOnClickListener(new cwp(this));
    int i;
    if (paramBundle != null)
    {
      this.Z.setText(paramBundle.getCharSequence("name"));
      this.aa.setChecked(paramBundle.getBoolean("just_following"));
      localBuilder.setView(localView);
      if (!w()) {
        break label299;
      }
      i = eyg.i;
      label214:
      localBuilder.setTitle(i);
      if (!w()) {
        break label307;
      }
    }
    label299:
    label307:
    for (int j = eyg.g;; j = eyg.j)
    {
      localBuilder.setPositiveButton(j, this);
      localBuilder.setNegativeButton(eyg.a, this);
      return localBuilder.create();
      if (w()) {
        break;
      }
      Bundle localBundle = this.m;
      this.Z.setText(localBundle.getCharSequence("name"));
      this.aa.setChecked(localBundle.getBoolean("just_following"));
      break;
      i = eyg.b;
      break label214;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putCharSequence("name", this.Z.getText());
    paramBundle.putBoolean("just_following", this.aa.isChecked());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    cwq localcwq;
    String str1;
    String str2;
    if (paramInt == -1)
    {
      localcwq = (cwq)this.n;
      if (localcwq == null) {
        localcwq = (cwq)f();
      }
      if (!w()) {
        break label91;
      }
      str1 = null;
      str2 = this.Z.getText().toString().trim();
      if (this.aa.isChecked()) {
        break label105;
      }
    }
    label91:
    label105:
    for (boolean bool = true;; bool = false)
    {
      localcwq.a(str1, str2, bool);
      efj.k(this.Z);
      super.onClick(paramDialogInterface, paramInt);
      return;
      str1 = this.m.getString("circle_id");
      break;
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    x();
  }
  
  public final void p_()
  {
    super.p_();
    x();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwm
 * JD-Core Version:    0.7.0.1
 */