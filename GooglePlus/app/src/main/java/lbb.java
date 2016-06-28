import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public final class lbb
  extends lut
{
  private EditText Z;
  private EditText aa;
  
  final void a(int paramInt)
  {
    Object localObject = this.n;
    if (localObject == null) {
      localObject = f();
    }
    if ((localObject instanceof lbe)) {
      ((lbe)localObject).a(this.Z.getText().toString().trim(), this.aa.getText().toString().trim(), paramInt, this);
    }
  }
  
  public final void a(String paramString)
  {
    this.Z.setError(paramString);
    this.Z.requestFocus();
  }
  
  public final void b(String paramString)
  {
    this.aa.setError(paramString);
    this.aa.requestFocus();
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    mbf localmbf = this.ad;
    un localun = new un(localmbf, efj.WY);
    View localView = LayoutInflater.from(localmbf).inflate(aw.dZ, null);
    this.Z = ((EditText)localView.findViewById(dl.ad));
    if (paramBundle != null)
    {
      this.Z.setText(paramBundle.getCharSequence("name_value"));
      String str1 = localBundle.getString("name_error_msg");
      if (str1 != null) {
        this.Z.setError(str1);
      }
      this.aa = ((EditText)localView.findViewById(dl.al));
      if (!localBundle.getString("list_item_type").equals("link")) {
        break label325;
      }
      this.aa.setVisibility(0);
      EditText localEditText = this.Z;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(60);
      localEditText.setFilters(arrayOfInputFilter);
      this.aa.addTextChangedListener(new lbf(this, this.aa, 2048));
      this.Z.addTextChangedListener(new lbf(this, this.Z, 60));
      if (paramBundle == null) {
        break label309;
      }
      this.aa.setText(paramBundle.getCharSequence("url_value"));
      label219:
      String str2 = localBundle.getString("url_error_msg");
      if (str2 != null) {
        this.aa.setError(str2);
      }
    }
    for (;;)
    {
      localun.a(localView);
      CharSequence localCharSequence = localBundle.getCharSequence("dialog_title");
      localun.a.e = localCharSequence;
      localun.a(ev.c, this);
      localun.b(ev.a, this);
      return localun.a();
      this.Z.setText(localBundle.getCharSequence("name_value"));
      break;
      label309:
      this.aa.setText(localBundle.getCharSequence("url_value"));
      break label219;
      label325:
      this.Z.addTextChangedListener(new lbf(this, this.Z, 30));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putCharSequence("name_value", this.Z.getText());
    paramBundle.putCharSequence("name_error_msg", this.Z.getError());
    paramBundle.putCharSequence("url_value", this.aa.getText());
    paramBundle.putCharSequence("url_error_msg", this.aa.getError());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    super.onClick(paramDialogInterface, paramInt);
    a(paramInt);
  }
  
  public final void p_()
  {
    super.p_();
    um localum = (um)this.d;
    if (localum != null) {
      localum.a(-1).setOnClickListener(new lbc(this));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbb
 * JD-Core Version:    0.7.0.1
 */