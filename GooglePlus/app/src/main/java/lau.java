import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public final class lau
  extends mby
  implements DialogInterface.OnClickListener
{
  private String Z;
  private String aa;
  private String ab;
  private String ac;
  private String ag;
  
  public static lau a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    lau locallau = new lau();
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("message", paramString2);
    localBundle.putString("checkbox", paramString3);
    localBundle.putString("positive_button", paramString4);
    localBundle.putString("negative_button", paramString5);
    locallau.f(localBundle);
    return locallau;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = this.m.getString("title");
    this.aa = this.m.getString("message");
    this.ab = this.m.getString("positive_button");
    this.ac = this.m.getString("negative_button");
    this.ag = this.m.getString("checkbox");
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun = new un(this.ad);
    String str = this.Z;
    localun.a.e = str;
    localun.a.n = true;
    localun.a(this.ab, this);
    localun.b(this.ac, this);
    View localView = LayoutInflater.from(this.ad).inflate(aw.dW, null);
    TextView localTextView = (TextView)localView.findViewById(dl.ac);
    CheckBox localCheckBox = (CheckBox)localView.findViewById(dl.G);
    if (TextUtils.isEmpty(this.aa)) {
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      localun.a(localView);
      um localum = localun.a();
      localCheckBox.setText(this.ag);
      localCheckBox.setOnCheckedChangeListener(new lav(this, localum));
      localum.setOnShowListener(new law(this, localCheckBox));
      return localum;
      localTextView.setText(this.aa);
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    kxx localkxx = (kxx)this.ae.b(kxx.class);
    if ((localkxx != null) && (paramInt == -1)) {
      localkxx.a(this.D, this.m);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lau
 * JD-Core Version:    0.7.0.1
 */