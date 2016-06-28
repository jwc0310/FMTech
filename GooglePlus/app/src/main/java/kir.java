import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import java.util.List;

public final class kir
  implements TextWatcher
{
  public kir(MentionMultiAutoCompleteTextView paramMentionMultiAutoCompleteTextView, kiu paramkiu) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence instanceof Spannable))
    {
      Spannable localSpannable = (Spannable)paramCharSequence;
      int k = -1 + (paramInt1 + paramInt2);
      List localList = this.b.b();
      URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannable.getSpans(paramInt1, k, URLSpan.class);
      int m = arrayOfURLSpan.length;
      int n = 0;
      int i1 = 0;
      while (n < m)
      {
        URLSpan localURLSpan = arrayOfURLSpan[n];
        if (lxf.a(localURLSpan))
        {
          localSpannable.removeSpan(localURLSpan);
          i1 = 1;
        }
        n++;
      }
      if (i1 != 0) {
        this.b.a(localList);
      }
    }
    int i;
    MentionMultiAutoCompleteTextView localMentionMultiAutoCompleteTextView1;
    MentionMultiAutoCompleteTextView localMentionMultiAutoCompleteTextView2;
    Layout localLayout;
    if (this.b.c)
    {
      i = (int)this.b.getContext().getResources().getDimension(efj.Dm);
      localMentionMultiAutoCompleteTextView1 = this.b;
      localMentionMultiAutoCompleteTextView2 = this.b;
      localLayout = localMentionMultiAutoCompleteTextView2.getLayout();
      if (localLayout != null) {
        break label186;
      }
    }
    label186:
    for (int j = 0;; j = localLayout.getLineBaseline(localLayout.getLineForOffset(localMentionMultiAutoCompleteTextView2.getSelectionEnd())))
    {
      localMentionMultiAutoCompleteTextView1.setDropDownVerticalOffset(j + i - this.b.getHeight());
      return;
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.b.getSelectionEnd();
    if ((paramInt2 >= 3) && (paramInt3 >= 3) && (paramCharSequence.charAt(-1 + (paramInt1 + paramInt3)) == '​')) {
      efj.l(this.b);
    }
    MentionMultiAutoCompleteTextView localMentionMultiAutoCompleteTextView = this.b;
    if (1 + this.a.findTokenStart(paramCharSequence, i) <= i) {}
    for (boolean bool = true;; bool = false)
    {
      localMentionMultiAutoCompleteTextView.a(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kir
 * JD-Core Version:    0.7.0.1
 */