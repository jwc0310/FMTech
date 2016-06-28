import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dtt
  extends FrameLayout
  implements lxj
{
  private View a = inflate(getContext(), efj.BM, null);
  private MediaView b;
  
  public dtt(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dtt(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  public dtt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    addView(this.a);
    this.b = ((MediaView)this.a.findViewById(efj.BI));
  }
  
  public final void D_()
  {
    this.b.ap_();
  }
  
  public final void a(dtq paramdtq)
  {
    ipf localipf;
    String str1;
    String str2;
    int i;
    int j;
    if (paramdtq.b != null)
    {
      localipf = ipf.a(getContext(), paramdtq.b, ipm.a);
      str1 = paramdtq.a;
      str2 = paramdtq.d;
      i = paramdtq.f;
      this.b.a(localipf);
      this.b.e(32);
      this.b.o = false;
      j = getContext().getResources().getInteger(efj.BL);
      if (i == 0) {
        break label155;
      }
    }
    label155:
    for (int k = i;; k = getContext().getResources().getColor(efj.BG))
    {
      ColorDrawable localColorDrawable = new ColorDrawable(k + (j << 24));
      this.b.b(localColorDrawable);
      ((TextView)this.a.findViewById(efj.BK)).setText(str1);
      ((TextView)this.a.findViewById(efj.BJ)).setText(str2);
      return;
      localipf = null;
      break;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    if (paramInt2 == 0) {}
    for (int j = (int)(0.6666667F * i);; j = View.MeasureSpec.getSize(paramInt2))
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtt
 * JD-Core Version:    0.7.0.1
 */