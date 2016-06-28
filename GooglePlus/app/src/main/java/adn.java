import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

final class adn
  extends afe
{
  CharSequence a;
  ListAdapter b;
  final Rect c = new Rect();
  
  public adn(adk paramadk, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.n = paramadk;
    this.r = true;
    this.e.setFocusable(true);
    this.m = 0;
    this.o = new ado(this, paramadk);
  }
  
  final void a()
  {
    Drawable localDrawable = this.e.getBackground();
    int i3;
    int i;
    label49:
    int j;
    int k;
    int m;
    int i1;
    int i2;
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.d.d);
      if (aab.a(this.d))
      {
        i3 = this.d.d.right;
        i = i3;
        j = this.d.getPaddingLeft();
        k = this.d.getPaddingRight();
        m = this.d.getWidth();
        if (this.d.c != -2) {
          break label251;
        }
        i1 = this.d.a((SpinnerAdapter)this.b, this.e.getBackground());
        i2 = this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left - this.d.d.right;
        if (i1 <= i2) {
          break label300;
        }
      }
    }
    for (;;)
    {
      a(Math.max(i2, m - j - k));
      label175:
      if (aab.a(this.d)) {}
      for (int n = i + (m - k - this.g);; n = i + j)
      {
        this.h = n;
        return;
        i3 = -this.d.d.left;
        break;
        Rect localRect = this.d.d;
        this.d.d.right = 0;
        localRect.left = 0;
        i = 0;
        break label49;
        label251:
        if (this.d.c == -1)
        {
          a(m - j - k);
          break label175;
        }
        a(this.d.c);
        break label175;
      }
      label300:
      i2 = i1;
    }
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.b = paramListAdapter;
  }
  
  public final void b()
  {
    boolean bool = this.e.isShowing();
    a();
    this.e.setInputMethodMode(2);
    super.b();
    this.f.setChoiceMode(1);
    int i = this.d.getSelectedItemPosition();
    afh localafh = this.f;
    if ((this.e.isShowing()) && (localafh != null))
    {
      localafh.b = false;
      localafh.setSelection(i);
      if ((Build.VERSION.SDK_INT >= 11) && (localafh.getChoiceMode() != 0)) {
        localafh.setItemChecked(i, true);
      }
    }
    if (bool) {}
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = this.d.getViewTreeObserver();
    } while (localViewTreeObserver == null);
    adp localadp = new adp(this);
    localViewTreeObserver.addOnGlobalLayoutListener(localadp);
    adq localadq = new adq(this, localadp);
    this.e.setOnDismissListener(localadq);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adn
 * JD-Core Version:    0.7.0.1
 */