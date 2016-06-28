import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class jwv
  extends jwu
{
  private static boolean J;
  private static int K;
  int k;
  View l;
  
  jwv(Context paramContext)
  {
    super(paramContext);
  }
  
  final TextView a(Context paramContext, int paramInt, String paramString)
  {
    TextView localTextView = super.a(paramContext, paramInt, paramString);
    localTextView.setTextAppearance(paramContext, eyg.aY);
    return localTextView;
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
    this.k = View.MeasureSpec.makeMeasureSpec((int)(0.6F * (int)(1.25D * (this.d / 2.0D))), 1073741824);
  }
  
  protected void a(Context paramContext)
  {
    super.a(paramContext);
    if (!J)
    {
      K = (int)paramContext.getResources().getDimension(efj.TC);
      J = true;
    }
    this.l = new View(paramContext);
    this.l.setBackgroundResource(efj.TF);
  }
  
  public void b()
  {
    int i = 0;
    Context localContext = getContext();
    llz[] arrayOfllz = this.c.h;
    for (int j = 0; j < this.y; j++)
    {
      llx localllx = arrayOfllz[j].d;
      if ((localllx != null) && (!TextUtils.isEmpty(localllx.e))) {
        a(localContext, j);
      }
    }
    addView(this.l);
    while (i < this.y)
    {
      c(localContext, i);
      e(localContext, i);
      d(localContext, i);
      a(localContext, i, arrayOfllz[i].b);
      i++;
    }
    addView(this.t);
  }
  
  final void b(int paramInt)
  {
    super.b(paramInt);
    TextView localTextView = (TextView)this.q.get(paramInt);
    localTextView.measure(b, b);
    View localView = (View)this.r.get(paramInt);
    int i = localView.getLeft() + (localView.getWidth() - localTextView.getMeasuredWidth()) / 2;
    localTextView.layout(i, localView.getTop() - K - localTextView.getMeasuredHeight(), i + localTextView.getMeasuredWidth(), localView.getTop());
  }
  
  final TextView c(Context paramContext, int paramInt)
  {
    TextView localTextView = super.c(paramContext, paramInt);
    localTextView.setTextAppearance(paramContext, eyg.aW);
    return localTextView;
  }
  
  final void c(int paramInt)
  {
    TextView localTextView = (TextView)this.p.get(paramInt);
    View localView = (View)this.r.get(paramInt);
    if (paramInt == this.x) {}
    for (int i = this.t.getMeasuredWidth();; i = 0)
    {
      a(paramInt, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredWidth() - i, 1073741824));
      a(localTextView, localView, i, 0);
      return;
    }
  }
  
  final int d()
  {
    return (int)(1.25D * (this.d / 2.0D));
  }
  
  public void e()
  {
    super.e();
    View localView = this.l;
    if (p()) {}
    for (float f = 1.0F;; f = 0.0F)
    {
      localView.setAlpha(f);
      return;
    }
  }
  
  final ArrayList<Animator> f()
  {
    ArrayList localArrayList = super.f();
    localArrayList.add(jxb.c(this.l, 0.0F, 1.0F));
    return localArrayList;
  }
  
  final ArrayList<Animator> g()
  {
    ArrayList localArrayList = super.g();
    localArrayList.add(jxb.c(this.l, 1.0F, 0.0F));
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwv
 * JD-Core Version:    0.7.0.1
 */