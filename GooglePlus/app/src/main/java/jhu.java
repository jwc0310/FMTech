import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public abstract class jhu
  extends lut
{
  public Uri a(String paramString)
  {
    return efj.a(f(), paramString, "https://support.google.com/plus/?hl=%locale%");
  }
  
  public final void a(String paramString1, String paramString2)
  {
    SpannableString localSpannableString = new SpannableString(paramString1);
    Intent localIntent = new Intent("android.intent.action.VIEW", a(paramString2));
    localIntent.addFlags(524288);
    localSpannableString.setSpan(new lxv(f(), localIntent), 0, paramString1.length(), 33);
    Dialog localDialog = this.d;
    if (localDialog != null)
    {
      TextView localTextView = (TextView)localDialog.findViewById(efj.Sc);
      localTextView.setText(localSpannableString);
      localTextView.setMovementMethod(LinkMovementMethod.getInstance());
      localTextView.setClickable(true);
    }
  }
  
  public final void m()
  {
    super.m();
    if (this.d != null) {
      v();
    }
  }
  
  public final void n()
  {
    super.n();
    Dialog localDialog = this.d;
    if (localDialog != null) {
      ((TextView)localDialog.findViewById(efj.Sc)).setText(null);
    }
  }
  
  public abstract void v();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jhu
 * JD-Core Version:    0.7.0.1
 */