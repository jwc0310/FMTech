import android.os.Build.VERSION;
import android.view.View;
import com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout;

public class lzi
{
  private lzi(MultiLineLayout paramMultiLineLayout) {}
  
  public void a(int paramInt)
  {
    int i;
    int j;
    label27:
    int k;
    int n;
    int i1;
    label59:
    int i2;
    label73:
    int i3;
    label84:
    int i4;
    label98:
    int i5;
    label108:
    int i6;
    int i8;
    label145:
    View localView;
    int i10;
    int i11;
    int i12;
    label231:
    int i15;
    label264:
    int i13;
    if (Build.VERSION.SDK_INT >= 17)
    {
      i = 1;
      if ((i == 0) || (this.a.getLayoutDirection() != 1)) {
        break label336;
      }
      j = 1;
      k = this.a.getPaddingLeft();
      int m = this.a.getPaddingTop();
      n = 0;
      if (Build.VERSION.SDK_INT < 17) {
        break label341;
      }
      i1 = 1;
      if (i1 == 0) {
        break label347;
      }
      i2 = this.a.getPaddingStart();
      if (Build.VERSION.SDK_INT < 17) {
        break label359;
      }
      i3 = 1;
      if (i3 == 0) {
        break label365;
      }
      i4 = this.a.getPaddingEnd();
      if (j == 0) {
        break label377;
      }
      i5 = paramInt - i2;
      i6 = this.a.getPaddingTop();
      int i7 = this.a.getChildCount();
      this.a.a = 1;
      this.a.b = 0;
      i8 = 0;
      if (i8 >= i7) {
        break label448;
      }
      localView = this.a.getChildAt(i8);
      if (localView.getVisibility() == 8) {
        break label449;
      }
      a(localView);
      i10 = localView.getMeasuredWidth();
      i11 = localView.getMeasuredHeight();
      if (this.a.b < i11) {
        this.a.b = i11;
      }
      if (j == 0) {
        break label390;
      }
      if (i5 - i10 >= i4) {
        break label384;
      }
      i12 = 1;
      if (i12 == 0) {
        break label456;
      }
      MultiLineLayout localMultiLineLayout = this.a;
      localMultiLineLayout.a = (1 + localMultiLineLayout.a);
      if (j == 0) {
        break label414;
      }
      i15 = paramInt - i2;
      i6 += n + m;
      i13 = i15;
    }
    for (int i14 = 0;; i14 = n)
    {
      if (j != 0)
      {
        a(localView, i13 - i10, i6, i10, i11);
        i5 = i13 - (i10 + k);
      }
      label312:
      label448:
      label449:
      for (int i9 = Math.max(i14, i11);; i9 = n)
      {
        i8++;
        n = i9;
        break label145;
        i = 0;
        break;
        label336:
        j = 0;
        break label27;
        label341:
        i1 = 0;
        break label59;
        label347:
        i2 = this.a.getPaddingLeft();
        break label73;
        label359:
        i3 = 0;
        break label84;
        label365:
        i4 = this.a.getPaddingRight();
        break label98;
        label377:
        i5 = i2;
        break label108;
        i12 = 0;
        break label231;
        if (i5 + i10 > paramInt - i4)
        {
          i12 = 1;
          break label231;
        }
        i12 = 0;
        break label231;
        i15 = i2;
        break label264;
        a(localView, i13, i6, i10, i11);
        i5 = i13 + (i10 + k);
        break label312;
        return;
      }
      label384:
      label390:
      label414:
      label456:
      i13 = i5;
    }
  }
  
  protected void a(View paramView) {}
  
  protected void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzi
 * JD-Core Version:    0.7.0.1
 */