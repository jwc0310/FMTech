import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.help.TooltipView;
import java.text.NumberFormat;
import java.util.ArrayList;

public abstract class jxg
  extends jtu
{
  private static NumberFormat J;
  private static InputFilter[] K;
  private static boolean f;
  private static int g;
  private static int h;
  private static int i;
  private static int j;
  private static int k;
  private static int l;
  static int m;
  static int n;
  static int o;
  public View.OnClickListener A;
  public jty B;
  public jtz C;
  public jxb D;
  public AnimatorSet E;
  public float F;
  public git G;
  public boolean H;
  public boolean I;
  private boolean L;
  private AnimatorSet M;
  private AnimatorSet N;
  private AnimatorSet O;
  public ArrayList<TextView> p;
  ArrayList<TextView> q;
  public ArrayList<View> r;
  ArrayList<View> s;
  public ImageView t;
  public TooltipView u;
  public long v;
  public boolean w;
  public int x;
  public int y;
  public long z;
  
  jxg(Context paramContext)
  {
    super(paramContext);
  }
  
  public static void a(AnimatorSet paramAnimatorSet)
  {
    if (paramAnimatorSet != null)
    {
      if (paramAnimatorSet.isStarted()) {
        paramAnimatorSet.end();
      }
      paramAnimatorSet.removeAllListeners();
    }
  }
  
  private final git d()
  {
    if (this.G == null) {
      this.G = ((git)mbb.a(getContext(), git.class));
    }
    return this.G;
  }
  
  private double e(int paramInt)
  {
    if (this.v == 0L) {
      return 0.0D;
    }
    return this.c.h[paramInt].c / this.v;
  }
  
  private void f(int paramInt)
  {
    View localView1 = (View)this.r.get(paramInt);
    View localView2 = (View)this.s.get(paramInt);
    ((GradientDrawable)localView2.getBackground()).setColor(0);
    localView2.setVisibility(8);
    localView2.measure(0, 0);
    int i1 = localView1.getTop();
    if (this.L) {}
    for (int i2 = localView1.getRight();; i2 = localView1.getLeft())
    {
      localView2.layout(i2, i1, i2, i1 + localView2.getMeasuredHeight());
      return;
    }
  }
  
  public void D_()
  {
    int i1 = 0;
    a(this.E);
    this.E = null;
    a(this.M);
    this.M = null;
    a(this.N);
    this.N = null;
    a(this.O);
    this.O = null;
    jty localjty = this.B;
    efj.m().removeCallbacks(localjty);
    jtz localjtz = this.C;
    efj.m().removeCallbacks(localjtz);
    removeAllViews();
    this.t.setVisibility(8);
    int i2 = this.p.size();
    for (int i3 = 0; i3 < i2; i3++) {
      ((TextView)this.p.get(i3)).clearAnimation();
    }
    int i4 = this.q.size();
    for (int i5 = 0; i5 < i4; i5++) {
      ((TextView)this.q.get(i5)).clearAnimation();
    }
    int i6 = this.r.size();
    for (int i7 = 0; i7 < i6; i7++) {
      ((View)this.r.get(i7)).clearAnimation();
    }
    int i8 = this.s.size();
    while (i1 < i8)
    {
      ((View)this.s.get(i1)).clearAnimation();
      i1++;
    }
    if (this.p.size() == 5) {
      this.p.clear();
    }
    if (this.q.size() == 5) {
      this.q.clear();
    }
    if (this.r.size() == 5) {
      this.r.clear();
    }
    if (this.s.size() == 5) {
      this.s.clear();
    }
  }
  
  TextView a(Context paramContext, int paramInt, String paramString)
  {
    Object localObject;
    if (paramInt < this.p.size())
    {
      localObject = (TextView)this.p.get(paramInt);
      ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      ((TextView)localObject).setText(jr.a().a(paramString));
      i();
      addView((View)localObject);
      return localObject;
    }
    TextView localTextView = new TextView(paramContext);
    localTextView.setTextAppearance(paramContext, eyg.aV);
    localTextView.setBackgroundResource(efj.TG);
    localTextView.setPadding(o, g, o, g);
    if (this.L) {}
    for (int i1 = 5;; i1 = 3)
    {
      localTextView.setGravity(i1 | 0x10);
      localTextView.setClickable(true);
      localTextView.setOnClickListener(this.A);
      localTextView.setMaxLines(i);
      localTextView.setFilters(K);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      this.p.add(localTextView);
      localObject = localTextView;
      break;
    }
  }
  
  public final jtu a(lly paramlly)
  {
    super.a(paramlly);
    this.y = paramlly.i;
    this.x = paramlly.k;
    this.v = paramlly.e;
    return this;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    TextView localTextView = (TextView)this.p.get(paramInt1);
    localTextView.measure(paramInt2, View.MeasureSpec.makeMeasureSpec(localTextView.getMeasuredHeight(), 1073741824));
  }
  
  protected void a(Context paramContext)
  {
    if (!f)
    {
      Resources localResources = paramContext.getResources();
      g = (int)localResources.getDimension(efj.TA);
      o = (int)localResources.getDimension(efj.Tz);
      m = (int)localResources.getDimension(efj.Tx);
      n = (int)localResources.getDimension(efj.Ty);
      j = (int)localResources.getDimension(efj.Tt);
      k = localResources.getColor(eyg.aS);
      h = localResources.getColor(eyg.aR);
      l = localResources.getColor(eyg.aP);
      i = localResources.getInteger(efj.TK);
      NumberFormat localNumberFormat = NumberFormat.getPercentInstance(localResources.getConfiguration().locale);
      J = localNumberFormat;
      localNumberFormat.setMaximumFractionDigits(0);
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      K = arrayOfInputFilter;
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(localResources.getInteger(efj.TJ));
      f = true;
    }
    this.p = new ArrayList();
    this.r = new ArrayList();
    this.s = new ArrayList();
    this.q = new ArrayList();
    this.t = new ImageView(getContext());
    this.t.setBackgroundResource(efj.TI);
    this.D = new jxb();
    this.L = jr.a().d;
  }
  
  final void a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + paramView2.getTop();
    int i2 = i1 + paramView1.getMeasuredHeight();
    int i4;
    int i3;
    if (this.L)
    {
      i4 = paramView2.getRight() - paramInt1;
      i3 = i4 - paramView1.getMeasuredWidth();
    }
    for (;;)
    {
      paramView1.layout(i3, i1, i4, i2);
      return;
      i3 = paramInt1 + paramView2.getLeft();
      i4 = i3 + paramView1.getMeasuredWidth();
    }
  }
  
  public int b(View paramView)
  {
    for (int i1 = 0; i1 < this.y; i1++) {
      if ((paramView == this.p.get(i1)) || (paramView == this.s.get(i1)) || (paramView == this.q.get(i1))) {
        return i1;
      }
    }
    return -1;
  }
  
  public void b(int paramInt)
  {
    if (p()) {}
    for (String str = J.format(e(paramInt));; str = null)
    {
      TextView localTextView = (TextView)this.q.get(paramInt);
      localTextView.setText(str);
      localTextView.setAlpha(0.0F);
      Context localContext = getContext();
      int i1 = da.L;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localTextView.getText();
      arrayOfObject[1] = ((TextView)this.p.get(paramInt)).getText();
      localTextView.setContentDescription(localContext.getString(i1, arrayOfObject));
      return;
    }
  }
  
  final void b(Context paramContext)
  {
    String str1 = paramContext.getString(da.D);
    String str2 = paramContext.getString(da.E);
    ied localied = new ied(d().c(), pkh.u, str2, str1, 1);
    if (!((iee)mbb.a(paramContext, iee.class)).b(localied))
    {
      this.u = new TooltipView(paramContext);
      this.u.a(localied);
      this.u.b = 0;
      this.u.a(1);
      this.u.setVisibility(8);
      addView(this.u);
    }
  }
  
  final void b(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + paramView2.getTop();
    int i2 = i1 + paramView1.getMeasuredHeight();
    int i4;
    int i3;
    if (this.L)
    {
      i4 = paramInt1 + paramView2.getLeft();
      i3 = i4 + paramView1.getMeasuredWidth();
    }
    for (;;)
    {
      paramView1.layout(i4, i1, i3, i2);
      return;
      i3 = paramView2.getRight() - paramInt1;
      i4 = i3 - paramView1.getMeasuredWidth();
    }
  }
  
  TextView c(Context paramContext, int paramInt)
  {
    TextView localTextView;
    if (paramInt < this.q.size()) {
      localTextView = (TextView)this.q.get(paramInt);
    }
    for (;;)
    {
      localTextView.setTextAppearance(paramContext, eyg.aZ);
      localTextView.setIncludeFontPadding(false);
      localTextView.setPadding(0, 0, 0, 0);
      addView(localTextView);
      return localTextView;
      localTextView = new TextView(paramContext);
      localTextView.setBackgroundDrawable(null);
      localTextView.setClickable(true);
      localTextView.setOnClickListener(this.A);
      localTextView.setGravity(16);
      this.q.add(localTextView);
    }
  }
  
  public final void c()
  {
    i();
  }
  
  public void c(int paramInt)
  {
    TextView localTextView = (TextView)this.p.get(paramInt);
    View localView = (View)this.r.get(paramInt);
    if (paramInt == this.x) {}
    for (int i1 = this.t.getMeasuredWidth();; i1 = 0)
    {
      a(paramInt, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredWidth() - i1 - o / 2 - ((TextView)this.q.get(paramInt)).getWidth(), 1073741824));
      a(localTextView, localView, i1, 0);
      return;
    }
  }
  
  final View d(Context paramContext, int paramInt)
  {
    if (paramInt < this.s.size()) {}
    View localView;
    for (Object localObject = (View)this.s.get(paramInt);; localObject = localView)
    {
      ((GradientDrawable)((View)localObject).getBackground()).setColor(0);
      addView((View)localObject);
      return localObject;
      localView = new View(paramContext);
      localView.setBackgroundResource(efj.TG);
      nj.a.c(localView, 2);
      localView.setOnClickListener(this.A);
      this.s.add(localView);
    }
  }
  
  public final void d(int paramInt)
  {
    this.t.setVisibility(0);
    View localView = (View)this.r.get(paramInt);
    int i1 = (localView.getMeasuredHeight() - this.t.getMeasuredHeight()) / 2;
    a(this.t, localView, j, i1);
    this.t.setPivotX(localView.getWidth() / 2.0F);
  }
  
  final View e(Context paramContext, int paramInt)
  {
    if (paramInt < this.r.size()) {}
    View localView;
    for (Object localObject = (View)this.r.get(paramInt);; localObject = localView)
    {
      ((GradientDrawable)((View)localObject).getBackground()).setColor(k);
      addView((View)localObject);
      return localObject;
      localView = new View(paramContext);
      localView.setBackgroundResource(efj.TE);
      nj.a.c(localView, 2);
      this.r.add(localView);
    }
  }
  
  public void e()
  {
    int i1 = 0;
    if (i1 < this.y)
    {
      int i3;
      if (p())
      {
        ((GradientDrawable)((View)this.r.get(i1)).getBackground()).setColor(h);
        ((TextView)this.q.get(i1)).setAlpha(1.0F);
        View localView1 = (View)this.r.get(i1);
        int i2 = (int)(localView1.getWidth() * e(i1));
        View localView2 = (View)this.s.get(i1);
        GradientDrawable localGradientDrawable = (GradientDrawable)localView2.getBackground();
        if (i1 == this.x)
        {
          i3 = k;
          label116:
          localGradientDrawable.setColor(i3);
          int i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
          int i5 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
          localView2.setVisibility(0);
          localView2.measure(i4, i5);
          a(localView2, localView1, 0, 0);
        }
      }
      for (;;)
      {
        i1++;
        break;
        i3 = l;
        break label116;
        ((GradientDrawable)((View)this.r.get(i1)).getBackground()).setColor(k);
        f(i1);
      }
    }
    l();
  }
  
  ArrayList<Animator> f()
  {
    return this.D.a(this.r, k, h);
  }
  
  ArrayList<Animator> g()
  {
    ArrayList localArrayList = this.D.a(this.r, h, k);
    localArrayList.addAll(this.D.a(this.q, 1.0F, 0.0F));
    return localArrayList;
  }
  
  final int h()
  {
    TextView localTextView = (TextView)this.q.get(0);
    localTextView.setText(getResources().getString(da.M));
    localTextView.measure(b, b);
    localTextView.setText(null);
    return localTextView.getMeasuredWidth();
  }
  
  public final void i()
  {
    Resources localResources = getResources();
    int i1 = 0;
    if (i1 < this.p.size())
    {
      TextView localTextView = (TextView)this.p.get(i1);
      String str = localTextView.getText().toString();
      int i2;
      label55:
      int i3;
      if (this.c.k == i1)
      {
        i2 = 1;
        if (!this.e) {
          break label111;
        }
        if (i2 == 0) {
          break label103;
        }
        i3 = da.K;
      }
      for (;;)
      {
        localTextView.setContentDescription(localResources.getString(i3, new Object[] { str }));
        i1++;
        break;
        i2 = 0;
        break label55;
        label103:
        i3 = da.I;
        continue;
        label111:
        if (i2 != 0) {
          i3 = da.J;
        } else {
          i3 = da.H;
        }
      }
    }
  }
  
  public final void j()
  {
    for (int i1 = 0; i1 < this.y; i1++) {
      f(i1);
    }
    a(this.N);
    this.N = null;
    this.N = new AnimatorSet();
    this.N.playTogether(g());
    this.N.setDuration(300L);
    this.N.addListener(new jxj(this));
    this.N.start();
  }
  
  public final void k()
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    if (i1 < this.y)
    {
      View localView1 = (View)this.r.get(i1);
      int i2 = (int)(localView1.getWidth() * e(i1));
      View localView2 = (View)this.s.get(i1);
      GradientDrawable localGradientDrawable = (GradientDrawable)localView2.getBackground();
      if (i1 == this.x) {}
      for (int i3 = k;; i3 = l)
      {
        localGradientDrawable.setColor(i3);
        localView2.setVisibility(0);
        int i4 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
        jxb localjxb = this.D;
        boolean bool = this.L;
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = localView2.getMeasuredWidth();
        arrayOfInt[1] = i2;
        ValueAnimator localValueAnimator = ValueAnimator.ofInt(arrayOfInt);
        localValueAnimator.addUpdateListener(new jxf(localjxb, localView2, i4, bool));
        localArrayList.add(localValueAnimator);
        i1++;
        break;
      }
    }
    localArrayList.addAll(this.D.a(this.q, 0.0F, 1.0F));
    a(this.O);
    this.O = null;
    this.O = new AnimatorSet();
    this.O.playTogether(localArrayList);
    this.O.setDuration(300L);
    this.O.addListener(new jxk(this));
    this.O.start();
  }
  
  public final void l()
  {
    if (!this.B.a())
    {
      jty localjty1 = this.B;
      efj.m().removeCallbacks(localjty1);
      jty localjty2 = this.B;
      efj.m().postDelayed(localjty2, 500L);
    }
  }
  
  public final void m()
  {
    if (this.C.a())
    {
      jtz localjtz1 = this.C;
      efj.m().removeCallbacks(localjtz1);
      jtz localjtz2 = this.C;
      long l1 = this.z;
      efj.m().postDelayed(localjtz2, l1);
    }
  }
  
  public final boolean n()
  {
    return d().f().b("gaia_id").equals(this.c.c);
  }
  
  public final boolean o()
  {
    return (this.v > 0L) && (n());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.u != null)
    {
      int i1 = a.m;
      int i2 = a.m;
      this.u.layout(i1, i2, i1 + this.u.getMeasuredWidth(), i2 + this.u.getMeasuredHeight());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.u != null)
    {
      int i1 = View.MeasureSpec.makeMeasureSpec(this.d - 2 * a.m, 1073741824);
      this.u.measure(i1, b);
    }
  }
  
  final boolean p()
  {
    if (this.x != -1) {}
    for (int i1 = 1;; i1 = 0)
    {
      boolean bool1;
      if ((i1 == 0) && (!o()))
      {
        boolean bool2 = this.H;
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxg
 * JD-Core Version:    0.7.0.1
 */