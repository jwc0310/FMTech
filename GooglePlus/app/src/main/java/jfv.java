import android.text.Editable;
import android.text.Html.TagHandler;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutMyStoryView;
import java.util.Stack;
import org.xml.sax.XMLReader;

public final class jfv
  implements Html.TagHandler
{
  private Stack<Integer> a;
  
  public jfv(OneProfileAboutMyStoryView paramOneProfileAboutMyStoryView) {}
  
  private final void a(boolean paramBoolean1, Editable paramEditable, boolean paramBoolean2)
  {
    if (this.a == null) {
      this.a = new Stack();
    }
    if (paramBoolean1)
    {
      if ((paramEditable.length() == 0) || (paramEditable.charAt(-1 + paramEditable.length()) != '\n')) {
        paramEditable.append("\n\n");
      }
      localStack = this.a;
      if (paramBoolean2)
      {
        i = 0;
        localStack.push(Integer.valueOf(i));
      }
    }
    while (this.a.isEmpty()) {
      for (;;)
      {
        Stack localStack;
        return;
        int i = -1;
      }
    }
    paramEditable.append('\n');
    this.a.pop();
  }
  
  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    boolean bool1 = true;
    if ("ul".equals(paramString)) {
      a(paramBoolean, paramEditable, false);
    }
    do
    {
      return;
      if ("ol".equals(paramString))
      {
        a(paramBoolean, paramEditable, bool1);
        return;
      }
    } while (!"li".equals(paramString));
    if (paramBoolean)
    {
      Stack localStack = this.a;
      boolean bool2 = false;
      if (localStack == null) {}
      while (bool2 < bool1)
      {
        paramEditable.append("   ");
        bool2++;
        continue;
        int i = this.a.size();
        bool2 = false;
      }
      if ((this.a == null) || (this.a.isEmpty()) || (((Integer)this.a.peek()).intValue() == -1)) {}
      int j;
      for (String str = "• ";; str = 13 + j + ". ")
      {
        paramEditable.append(str);
        return;
        j = 1 + ((Integer)this.a.pop()).intValue();
        this.a.push(Integer.valueOf(j));
      }
    }
    paramEditable.append('\n');
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfv
 * JD-Core Version:    0.7.0.1
 */