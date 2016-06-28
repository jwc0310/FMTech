import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import com.google.android.libraries.social.sharekit.comments.CommentBox;
import com.google.android.libraries.social.sharekit.impl.CommentBoxFragment;
import com.google.android.libraries.social.sharekit.impl.ComposedContentFragment;

public final class kjb
  implements kik
{
  public kjb(ComposedContentFragment paramComposedContentFragment) {}
  
  public final void f()
  {
    int i = 0;
    this.a.y();
    ComposedContentFragment localComposedContentFragment = this.a;
    bz localbz = localComposedContentFragment.x;
    bk localbk1 = localbz.a("sharelet_content_fragment");
    if (localComposedContentFragment.b.a() == null) {}
    cl localcl;
    Bundle localBundle;
    khu[] arrayOfkhu2;
    for (bk localbk2 = null;; localbk2 = localComposedContentFragment.b.a().a(1))
    {
      if ((localbk2 == null) && (localbk1 == null)) {
        break label235;
      }
      localcl = localbz.a();
      if (localbk2 == null) {
        break label236;
      }
      localBundle = new Bundle();
      SpannableStringBuilder localSpannableStringBuilder = (SpannableStringBuilder)localComposedContentFragment.a.b.getEditableText();
      localBundle.putString("editable_post_text", localSpannableStringBuilder.toString());
      URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), URLSpan.class);
      if (arrayOfURLSpan == null) {
        break label247;
      }
      arrayOfkhu2 = new khu[arrayOfURLSpan.length];
      while (i < arrayOfURLSpan.length)
      {
        arrayOfkhu2[i] = new khu(arrayOfURLSpan[i], localSpannableStringBuilder.getSpanStart(arrayOfURLSpan[i]), localSpannableStringBuilder.getSpanEnd(arrayOfURLSpan[i]));
        i++;
      }
    }
    label235:
    label236:
    label247:
    for (khu[] arrayOfkhu1 = arrayOfkhu2;; arrayOfkhu1 = null)
    {
      localBundle.putParcelableArray("editable_post_text_url_spans", arrayOfkhu1);
      localbk2.f(localBundle);
      localcl.b(aau.BL, localbk2, "sharelet_content_fragment");
      for (;;)
      {
        localcl.b();
        return;
        localcl.a(localbk1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjb
 * JD-Core Version:    0.7.0.1
 */