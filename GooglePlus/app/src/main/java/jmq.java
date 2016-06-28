import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.google.android.libraries.social.help.TooltipView;

final class jmq
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  jmq(jmp paramjmp) {}
  
  public final void onGlobalLayout()
  {
    int i = this.a.ab.getLeft();
    if (this.a.Z.a()) {}
    for (int j = this.a.aa.getMeasuredWidth() - this.a.ab.getRight();; j = i)
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.a.Z.getLayoutParams();
      localMarginLayoutParams.setMargins(j, localMarginLayoutParams.topMargin, j, localMarginLayoutParams.bottomMargin);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmq
 * JD-Core Version:    0.7.0.1
 */