import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import org.xml.sax.XMLReader;

public final class lwi
  implements Html.TagHandler
{
  private static void a(Editable paramEditable)
  {
    int i = paramEditable.length();
    Object[] arrayOfObject = paramEditable.getSpans(0, i, StrikethroughSpan.class);
    Object localObject = null;
    if (arrayOfObject != null)
    {
      int k = arrayOfObject.length;
      localObject = null;
      if (k <= 0) {}
    }
    for (int m = -1 + arrayOfObject.length;; m--)
    {
      localObject = null;
      if (m >= 0)
      {
        if (paramEditable.getSpanFlags(arrayOfObject[m]) == 17) {
          localObject = arrayOfObject[m];
        }
      }
      else
      {
        int j = paramEditable.getSpanStart(localObject);
        paramEditable.removeSpan(localObject);
        if (j != i) {
          paramEditable.setSpan(new StrikethroughSpan(), j, i, 33);
        }
        return;
      }
    }
  }
  
  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    String str = paramString.toLowerCase();
    if ((TextUtils.equals(str, "strike")) || (TextUtils.equals(str, "s")))
    {
      if (paramBoolean)
      {
        int i = paramEditable.length();
        paramEditable.setSpan(new StrikethroughSpan(), i, i, 17);
      }
    }
    else {
      return;
    }
    a(paramEditable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwi
 * JD-Core Version:    0.7.0.1
 */