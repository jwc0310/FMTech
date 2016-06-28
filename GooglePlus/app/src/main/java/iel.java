import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;

public final class iel
  extends FrameLayout
  implements iej, iek
{
  public TooltipView a;
  public ied b;
  public int c;
  public int d;
  public int e;
  private View f;
  private int g = 0;
  
  public iel(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(View paramView)
  {
    this.f = paramView;
    if (this.b != null)
    {
      iee localiee = (iee)mbb.a(getContext(), iee.class);
      if ((this.a == null) && (localiee.a(this.b)))
      {
        this.a = new TooltipView(getContext());
        this.a.a(this.b);
        this.a.e.add(this);
        this.a.a(0);
        addView(this.a);
        localiee.c(this.a);
      }
    }
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    if (this.a != null) {
      this.a = null;
    }
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    if (this.a != null) {
      removeView(this.a);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    int j = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
    {
      int k = this.d;
      int m = this.e;
      View localView1 = this.f;
      int n = View.MeasureSpec.makeMeasureSpec(this.c, -2147483648);
      this.a.measure(n, 0);
      int i1;
      label95:
      int i6;
      int i3;
      if (Build.VERSION.SDK_INT >= 17)
      {
        i1 = i;
        if ((i1 == 0) || (getResources().getConfiguration().getLayoutDirection() != i)) {
          break label190;
        }
        if (i == 0) {
          break label196;
        }
        i6 = localView1.getRight() - this.a.getMeasuredWidth();
        i3 = this.a.getMeasuredWidth() - k;
      }
      label190:
      label196:
      int i2;
      for (int i4 = i6;; i4 = i2)
      {
        this.a.b(i3);
        for (View localView2 = (View)localView1.getParent(); (localView2 != null) && (localView2 != this); localView2 = (View)localView2.getParent()) {
          j += localView2.getTop();
        }
        i1 = 0;
        break;
        i = 0;
        break label95;
        i2 = localView1.getLeft();
        i3 = k;
      }
      int i5 = j + (m + localView1.getBottom());
      this.a.layout(i4, i5, i4 + this.a.getMeasuredWidth(), i5 + this.a.getMeasuredHeight());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iel
 * JD-Core Version:    0.7.0.1
 */