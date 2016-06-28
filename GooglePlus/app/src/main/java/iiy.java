import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;

public final class iiy
  extends mby
  implements DialogInterface.OnClickListener
{
  private final CharSequence a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      paramCharSequence = null;
    }
    for (;;)
    {
      return paramCharSequence;
      if ((paramCharSequence instanceof Spannable))
      {
        Spannable localSpannable = (Spannable)paramCharSequence;
        for (URLSpan localURLSpan : (URLSpan[])localSpannable.getSpans(0, localSpannable.length(), URLSpan.class)) {
          localSpannable.setSpan(new iiz(this), localSpannable.getSpanStart(localURLSpan), localSpannable.getSpanEnd(localURLSpan), 0);
        }
      }
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ad);
    localBuilder.setTitle(localBundle.getString("arg_title_text"));
    localBuilder.setMessage(a(localBundle.getCharSequence("arg_message_text")));
    localBuilder.setPositiveButton(localBundle.getString("arg_positive_button_text"), this);
    localBuilder.setNegativeButton(localBundle.getString("arg_negative_button_text"), null);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bk localbk = this.n;
    if ((localbk instanceof iiu)) {
      ((iiu)localbk).a(this.D);
    }
  }
  
  public final void p_()
  {
    super.p_();
    ((TextView)this.d.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iiy
 * JD-Core Version:    0.7.0.1
 */