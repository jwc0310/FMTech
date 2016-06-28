import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import java.util.List;

public final class kuf
  implements lxx
{
  private final View a;
  private final gxq b;
  private final lxx c;
  
  public kuf(View paramView, gxq paramgxq, lxx paramlxx)
  {
    this.a = paramView;
    this.b = paramgxq;
    this.c = paramlxx;
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    Context localContext = this.a.getContext();
    gxr localgxr = new gxr();
    gxq localgxq = this.b;
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.a)).b(localContext);
    this.c.a(paramURLSpan);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kuf
 * JD-Core Version:    0.7.0.1
 */