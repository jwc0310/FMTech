import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

final class cnp
  implements Runnable
{
  cnp(cnj paramcnj) {}
  
  public final void run()
  {
    if ((this.a.F) || (!this.a.i())) {
      return;
    }
    Spanned localSpanned = Html.fromHtml(this.a.az);
    if ((localSpanned instanceof SpannableStringBuilder)) {}
    int i;
    int j;
    for (SpannableStringBuilder localSpannableStringBuilder = (SpannableStringBuilder)localSpanned;; localSpannableStringBuilder = new SpannableStringBuilder(localSpanned))
    {
      i = localSpannableStringBuilder.length();
      for (j = 0; (j != i) && (Character.isWhitespace(localSpannableStringBuilder.charAt(j))); j++) {}
    }
    if (j != 0)
    {
      localSpannableStringBuilder.delete(0, j);
      i = localSpannableStringBuilder.length();
    }
    for (int k = i - 1; (k >= 0) && (Character.isWhitespace(localSpannableStringBuilder.charAt(k))); k--) {}
    if (k != i - 1) {
      localSpannableStringBuilder.delete(k + 1, i);
    }
    this.a.ax.setText(localSpannableStringBuilder);
    Linkify.addLinks(this.a.ax, 1);
    this.a.ax.setVisibility(0);
    this.a.ax.setMovementMethod(LinkMovementMethod.getInstance());
    this.a.ay.setVisibility(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnp
 * JD-Core Version:    0.7.0.1
 */