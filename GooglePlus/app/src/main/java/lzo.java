import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class lzo
  implements ahn
{
  public SearchView a;
  public boolean b = false;
  private List<lzp> c = new ArrayList();
  
  public final void a(lzp paramlzp)
  {
    this.c.add(paramlzp);
    if (this.a != null)
    {
      Editable localEditable = this.a.a.getText();
      if (!TextUtils.isEmpty(localEditable)) {
        paramlzp.a(localEditable.toString());
      }
    }
  }
  
  public final boolean a(String paramString)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++) {
      ((lzp)this.c.get(j)).a(paramString);
    }
    return true;
  }
  
  public final boolean b(String paramString)
  {
    if (this.b)
    {
      int i = this.c.size();
      for (int j = 0; j < i; j++) {
        ((lzp)this.c.get(j)).a(paramString);
      }
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzo
 * JD-Core Version:    0.7.0.1
 */