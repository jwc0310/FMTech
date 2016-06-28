import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AlphaAnimation;
import android.widget.Spinner;
import com.google.android.apps.plus.views.EventRsvpButtonLayout;
import java.util.List;

public final class dwt
  extends dwz
  implements dwu
{
  private static boolean a;
  private static int b;
  private static Paint c;
  private static int d;
  private dwb e;
  private EventRsvpButtonLayout f;
  private dwv g;
  private ill h;
  private int i;
  private boolean j;
  
  public dwt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!a)
    {
      Resources localResources = paramContext.getResources();
      b = localResources.getColor(efj.jz);
      Paint localPaint = new Paint();
      c = localPaint;
      localPaint.setColor(localResources.getColor(efj.ju));
      c.setStrokeWidth(localResources.getDimension(efj.lK));
      d = localResources.getDimensionPixelSize(efj.lF);
      a = true;
    }
    setBackgroundColor(b);
    ill localill = new ill(paramContext, ((git)mbb.a(paramContext, git.class)).c());
    localill.a.add(ine.class);
    this.h = localill;
    this.f = ((EventRsvpButtonLayout)((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(efj.tD, null));
    addView(this.f);
    this.g = new dwv(paramContext, paramAttributeSet, paramInt);
    this.g.setVisibility(4);
    addView(this.g);
    setWillNotDraw(false);
  }
  
  private final void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 6) || (paramInt == 5)) {}
    for (int k = 1; (paramInt != 5) && ((!this.j) || (k == 0)); k = 0)
    {
      int m = this.f.getVisibility();
      this.f.setVisibility(4);
      this.g.setVisibility(0);
      if ((paramBoolean) && (m == 0))
      {
        AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
        localAlphaAnimation1.setDuration(500L);
        localAlphaAnimation1.setFillAfter(true);
        AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation2.setDuration(500L);
        localAlphaAnimation2.setFillAfter(true);
        this.f.startAnimation(localAlphaAnimation1);
        this.g.startAnimation(localAlphaAnimation2);
      }
      return;
    }
    this.f.setVisibility(0);
    this.g.setVisibility(4);
  }
  
  public final void a(hxj paramhxj, bzu parambzu, dwb paramdwb)
  {
    int k = 1;
    this.e = paramdwb;
    this.j = bqo.a(paramhxj, System.currentTimeMillis());
    dwv localdwv = this.g;
    localdwv.e = this;
    localdwv.f = paramdwb;
    localdwv.h = paramhxj;
    long l = System.currentTimeMillis();
    localdwv.b = bqo.a(localdwv.h, l);
    localdwv.d = new dww(localdwv, localdwv.getContext(), localdwv.b);
    localdwv.c.setAdapter(localdwv.d);
    int m;
    dww localdww;
    int n;
    if (parambzu.b != -2147483648)
    {
      m = parambzu.b;
      localdww = localdwv.d;
      if ((m != k) && (m != 3)) {
        break label313;
      }
      n = 0;
    }
    for (;;)
    {
      label138:
      localdwv.g = n;
      localdwv.c.setSelection(localdwv.g);
      localdwv.d.notifyDataSetChanged();
      localdwv.c.setOnItemSelectedListener(localdwv);
      localdwv.c.setEnabled(parambzu.c);
      int i1 = localdwv.g;
      label240:
      EventRsvpButtonLayout localEventRsvpButtonLayout;
      if ((i1 == 0) && (((localdwv.b) && (bqo.c(localdwv.h))) || ((!localdwv.b) && (parambzu.f))))
      {
        localdwv.a = k;
        localEventRsvpButtonLayout = this.f;
        boolean bool = this.j;
        localEventRsvpButtonLayout.c = this;
        if (!bool) {
          break label359;
        }
      }
      label313:
      label359:
      for (int i2 = 8;; i2 = 0)
      {
        localEventRsvpButtonLayout.b.setVisibility(i2);
        localEventRsvpButtonLayout.a.setVisibility(i2);
        a(bqo.a(paramhxj), false);
        return;
        m = bqo.a(paramhxj);
        break;
        if ((m == 6) || ((localdww.a) && (m == 2)))
        {
          n = k;
          break label138;
        }
        if (m != 2) {
          break label365;
        }
        n = 2;
        break label138;
        k = 0;
        break label240;
      }
      label365:
      n = -1;
    }
  }
  
  public final void b(int paramInt)
  {
    if (this.e != null)
    {
      if (!this.h.a()) {
        getContext().startActivity(this.h.b());
      }
    }
    else {
      return;
    }
    a(paramInt, true);
    this.e.c(paramInt);
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    this.i = View.MeasureSpec.getSize(paramInt1);
    int k = d;
    a(this.f, this.i, 1073741824, 0, 0);
    int m = Math.max(k, this.f.getMeasuredHeight());
    a(this.g, this.i, 1073741824, 0, 0);
    int n = Math.max(m, this.g.getMeasuredHeight());
    a(this.f, this.i, 1073741824, n, 1073741824);
    a(this.f, 0, 0 + Math.max(0, (n - this.f.getMeasuredHeight()) / 2));
    a(this.g, this.i, 1073741824, n, 1073741824);
    a(this.g, 0, 0 + Math.max(0, (n - this.g.getMeasuredHeight()) / 2));
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawLine(0.0F, 0.0F, this.i, 0.0F, c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwt
 * JD-Core Version:    0.7.0.1
 */