import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public final class luy
  extends lut
  implements TextWatcher
{
  EditText Z;
  private int aa;
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    Context localContext = ar_();
    un localun = new un(localContext);
    View localView = LayoutInflater.from(localContext).inflate(efj.ZQ, null);
    this.Z = ((EditText)localView.findViewById(aw.eK));
    this.Z.addTextChangedListener(this);
    CharSequence localCharSequence1 = localBundle.getCharSequence("hint_text");
    if (localCharSequence1 != null) {
      this.Z.setHint(localCharSequence1);
    }
    this.aa = localBundle.getInt("max_length", 1000);
    if (this.aa > 0)
    {
      EditText localEditText = this.Z;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(this.aa);
      localEditText.setFilters(arrayOfInputFilter);
    }
    if (paramBundle != null) {
      this.Z.setText(paramBundle.getCharSequence("text_value"));
    }
    for (;;)
    {
      String str1 = localBundle.getString("error_msg");
      if (str1 != null) {
        this.Z.setError(str1);
      }
      TextView localTextView = (TextView)localView.findViewById(aw.eJ);
      String str2 = localBundle.getString("notice_text");
      if (str2 != null)
      {
        localTextView.setText(str2);
        localTextView.setVisibility(0);
      }
      localun.a(localView);
      CharSequence localCharSequence2 = localBundle.getCharSequence("dialog_title");
      localun.a.e = localCharSequence2;
      localun.a(fi.b, this);
      localun.b(localBundle.getInt("cancel_resource_id", fi.a), this);
      ((ImageView)localView.findViewById(aw.eH)).setOnClickListener(new luz(this));
      this.Z.post(new lva(this, localBundle));
      return localun.a();
      this.Z.setText(localBundle.getCharSequence("text_value"));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putCharSequence("text_value", this.Z.getText());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = this.n;
    if (localObject == null) {
      localObject = f();
    }
    if ((localObject instanceof lvc)) {
      ((lvc)localObject).a(this.Z.getText().toString().trim(), paramInt);
    }
    efj.k(this.Z);
    super.onClick(paramDialogInterface, paramInt);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    w();
    if (paramInt3 > this.aa) {
      this.Z.setText(mfx.a(paramCharSequence.toString(), 0, this.aa));
    }
  }
  
  public final void p_()
  {
    super.p_();
    w();
  }
  
  final void w()
  {
    um localum = (um)this.d;
    if (localum == null) {
      return;
    }
    Button localButton = localum.a(-1);
    if (!TextUtils.isEmpty(this.Z.getText().toString().trim())) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     luy
 * JD-Core Version:    0.7.0.1
 */