import android.view.View;
import com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout;

public final class lzg
  extends lzi
{
  public lzg(MultiLineLayout paramMultiLineLayout)
  {
    super(paramMultiLineLayout, (byte)0);
  }
  
  protected final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzg
 * JD-Core Version:    0.7.0.1
 */