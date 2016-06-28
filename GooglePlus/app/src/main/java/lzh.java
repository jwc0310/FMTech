import android.view.View;
import com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout;

public final class lzh
  extends lzi
{
  public int a = 0;
  public int b = 0;
  public int c;
  public int d;
  public int e;
  
  public lzh(MultiLineLayout paramMultiLineLayout)
  {
    super(paramMultiLineLayout, (byte)0);
  }
  
  public final void a(int paramInt)
  {
    super.a(paramInt);
    this.a += this.f.getPaddingRight();
    this.b = Math.max(this.b + this.f.getPaddingBottom(), this.e);
    MultiLineLayout.a(this.f, View.resolveSize(this.a, this.c), View.resolveSize(this.b, this.d));
  }
  
  protected final void a(View paramView)
  {
    MultiLineLayout.a(this.f, paramView, this.c, this.d);
  }
  
  protected final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = Math.max(this.a, paramInt1 + paramInt3);
    this.b = Math.max(this.b, paramInt2 + paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzh
 * JD-Core Version:    0.7.0.1
 */