import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

public final class bww
  extends bk
{
  int a;
  RadioGroup b;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    if (localBundle != null) {
      this.a = localBundle.getInt("account_id", -1);
    }
    View localView = paramLayoutInflater.inflate(efj.sP, paramViewGroup, false);
    bp localbp = f();
    String str1 = efj.a(f(), "auto_backup", "https://support.google.com/plus/?hl=%locale%").toString();
    int i = aau.rE;
    TextView localTextView = (TextView)localView.findViewById(aaw.fn);
    String str2 = localbp.getString(i, new Object[] { str1 });
    if (efj.aaz == null) {
      efj.aaz = new lwi();
    }
    localTextView.setText(Html.fromHtml(str2, null, efj.aaz));
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    localView.findViewById(aaw.hY).setOnClickListener(new bwx(this));
    localView.findViewById(aaw.hZ).setOnClickListener(new bwy(this));
    this.b = ((RadioGroup)localView.findViewById(aaw.an));
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bww
 * JD-Core Version:    0.7.0.1
 */