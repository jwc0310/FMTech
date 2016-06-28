import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.linearavatarpileview.LinearAvatarPileView;

public final class hif
  extends ViewGroup
  implements View.OnClickListener, hgy, lxj
{
  private int A;
  private final int B;
  private final boolean C;
  private final boolean D;
  private hmw E;
  private boolean F;
  private final int G;
  private final String H;
  private hig I;
  String a;
  public gik b;
  hgv c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private MediaView u;
  private final View v;
  private final TextView w;
  private final TextView x;
  private Button y;
  private final LinearAvatarPileView z;
  
  public hif(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
    this.B = 0;
    this.C = false;
    this.D = d();
    this.u = new MediaView(paramContext);
    this.v = new View(paramContext);
    this.w = new TextView(paramContext);
    this.x = new TextView(paramContext);
    this.z = new LinearAvatarPileView(paramContext);
    this.G = ((git)mbb.a(paramContext, git.class)).c();
    this.H = ((giz)mbb.a(paramContext, giz.class)).a(this.G).b("gaia_id");
    c();
  }
  
  public hif(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    super(paramContext, null, 0);
    a(paramContext);
    this.B = 0;
    this.C = true;
    this.D = d();
    this.u = new MediaView(paramContext, null, 0);
    this.v = new View(paramContext, null, 0);
    this.w = new TextView(paramContext, null, 0);
    this.x = new TextView(paramContext, null, 0);
    this.z = new LinearAvatarPileView(paramContext, null, 0);
    this.G = ((git)mbb.a(paramContext, git.class)).c();
    this.H = ((giz)mbb.a(paramContext, giz.class)).a(this.G).b("gaia_id");
    c();
  }
  
  private final void a(int paramInt)
  {
    String str;
    gxq localgxq;
    switch (paramInt)
    {
    default: 
      throw new IllegalStateException(32 + "Invalid follow state " + paramInt);
    case 6: 
      str = getContext().getString(aaw.nW);
      localgxq = new gxq(pjn.b);
    }
    for (;;)
    {
      this.y.setText(str);
      efj.a(this.y, localgxq);
      return;
      str = getContext().getString(aaw.om);
      localgxq = new gxq(pjn.ad);
      continue;
      str = getContext().getString(aaw.ok);
      localgxq = new gxq(pjn.F);
    }
  }
  
  private final void a(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    this.d = ((int)localResources.getDimension(aau.zb));
    this.e = ((int)localResources.getDimension(aau.zm));
    this.f = localResources.getColor(eyg.T);
    this.A = efj.i(paramContext);
    this.g = ((int)localResources.getDimension(aau.zc));
    this.h = ((int)localResources.getDimension(aau.zk));
    this.i = localResources.getColor(eyg.U);
    this.j = ((int)localResources.getDimension(aau.yY));
    this.k = ((int)localResources.getDimension(aau.zl));
    this.l = ((int)localResources.getDimension(aau.yX));
    this.m = ((int)localResources.getDimension(aau.za));
    this.n = ((int)localResources.getDimension(aau.yZ));
    this.o = ((int)localResources.getDimension(aau.ze));
    this.p = ((int)localResources.getDimension(aau.zd));
    this.q = ((int)localResources.getDimension(aau.yW));
    this.r = ((int)localResources.getDimension(aau.yV));
    this.s = localResources.getDimensionPixelSize(aau.zf);
    this.t = localResources.getDimensionPixelSize(aau.zg);
  }
  
  private final boolean b()
  {
    if ((!this.C) && (!this.F))
    {
      switch (this.E.h)
      {
      }
      for (int i1 = 0; i1 != 0; i1 = 1) {
        return true;
      }
    }
    return false;
  }
  
  private final void c()
  {
    if (this.D) {}
    for (int i1 = 5;; i1 = 3)
    {
      int i2 = i1 | 0x50;
      Context localContext = getContext();
      this.u.s = 0;
      this.u.e(4);
      this.u.setContentDescription(localContext.getString(aaw.nS));
      addView(this.u);
      addView(this.v);
      this.w.setMinHeight(this.d);
      this.w.setGravity(i2);
      this.w.setTextSize(0, this.e);
      this.w.setTextColor(this.f);
      addView(this.w);
      this.x.setMinHeight(this.g);
      this.x.setGravity(i2);
      this.x.setTextSize(0, this.h);
      this.x.setTextColor(this.i);
      addView(this.x);
      addView(this.z);
      return;
    }
  }
  
  @TargetApi(17)
  private final boolean d()
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (int i1 = 1; (i1 != 0) && (getLayoutDirection() == 1); i1 = 0) {
      return true;
    }
    return false;
  }
  
  public final void D_()
  {
    this.u.D_();
    if ((!this.C) && (this.b.f())) {
      this.c.a(this.a);
    }
    this.b = null;
  }
  
  public final void a(View paramView)
  {
    if (this.I == null) {
      this.I = new hig(this, this.G);
    }
    Context localContext = getContext();
    String str1 = this.E.a;
    if (paramView == this.y)
    {
      int i1 = this.E.h;
      if (i1 == 6)
      {
        Toast.makeText(localContext, localContext.getString(aaw.nV), 0).show();
        return;
      }
      int i2 = efj.h(i1);
      hig localhig2 = this.I;
      String str3 = this.a;
      localhig2.b.c.a(str3, str1, i2);
      return;
    }
    hig localhig1 = this.I;
    String str2 = this.E.b;
    localContext.startActivity(((hpo)mbb.a(localContext, hpo.class)).a(localhig1.a, localhig1.b.a, str1, str2));
  }
  
  @TargetApi(21)
  public final void a(hmw paramhmw, String paramString)
  {
    boolean bool;
    StateListDrawable localStateListDrawable;
    int i1;
    label254:
    int i2;
    if (paramhmw != null)
    {
      bool = true;
      efj.c(bool, "Invalid dbEmbedCollexion");
      this.E = paramhmw;
      this.a = paramString;
      String str = paramhmw.f;
      Context localContext = getContext();
      if (!TextUtils.isEmpty(str)) {
        this.u.a(ipf.a(localContext, str, ipm.a));
      }
      this.w.setText(paramhmw.b);
      this.v.setBackgroundColor(paramhmw.g);
      this.x.setText(paramhmw.d);
      LinearAvatarPileView localLinearAvatarPileView = this.z;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramhmw.e;
      localLinearAvatarPileView.a(arrayOfString);
      this.F = TextUtils.equals(paramhmw.c, this.H);
      if (!b()) {
        break label621;
      }
      if (this.y == null)
      {
        this.y = new Button(localContext, null, this.B);
        Resources localResources = localContext.getResources();
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { 16842919 }, localResources.getDrawable(eyg.R));
        localStateListDrawable.addState(new int[] { 16842908 }, localResources.getDrawable(eyg.R));
        localStateListDrawable.addState(StateSet.WILD_CARD, localResources.getDrawable(eyg.T));
        if (Build.VERSION.SDK_INT < 21) {
          break label597;
        }
        i1 = 1;
        if (i1 == 0) {
          break label603;
        }
        this.y.setBackgroundDrawable(efj.a(localStateListDrawable, ColorStateList.valueOf(localResources.getColor(eyg.S)), localStateListDrawable));
        label284:
        if (Build.VERSION.SDK_INT < 21) {
          break label615;
        }
        i2 = 1;
        label295:
        if (i2 != 0)
        {
          Button localButton1 = this.y;
          Button localButton2 = this.y;
          StateListAnimator localStateListAnimator = new StateListAnimator();
          int[] arrayOfInt1 = { 16842910, 16842919 };
          PropertyValuesHolder[] arrayOfPropertyValuesHolder1 = new PropertyValuesHolder[1];
          float[] arrayOfFloat1 = new float[1];
          arrayOfFloat1[0] = this.t;
          arrayOfPropertyValuesHolder1[0] = PropertyValuesHolder.ofFloat("translationZ", arrayOfFloat1);
          localStateListAnimator.addState(arrayOfInt1, ObjectAnimator.ofPropertyValuesHolder(localButton2, arrayOfPropertyValuesHolder1));
          int[] arrayOfInt2 = new int[0];
          PropertyValuesHolder[] arrayOfPropertyValuesHolder2 = new PropertyValuesHolder[1];
          float[] arrayOfFloat2 = new float[1];
          arrayOfFloat2[0] = this.s;
          arrayOfPropertyValuesHolder2[0] = PropertyValuesHolder.ofFloat("translationZ", arrayOfFloat2);
          localStateListAnimator.addState(arrayOfInt2, ObjectAnimator.ofPropertyValuesHolder(localButton2, arrayOfPropertyValuesHolder2));
          localButton1.setStateListAnimator(localStateListAnimator);
        }
        this.y.setMinHeight(this.j);
        this.y.setTextSize(0, this.k);
        this.y.setOnClickListener(new gxn(this));
        this.y.setPadding(this.n, this.m, this.n, this.m);
        addView(this.y);
      }
      this.y.setTextColor(paramhmw.g);
      this.y.setVisibility(0);
      a(paramhmw.h);
    }
    for (;;)
    {
      if (!this.C)
      {
        setOnClickListener(this);
        this.c = ((hgv)mbb.a(getContext(), hgv.class));
        if (this.b.f()) {
          this.c.a(paramString, this);
        }
      }
      return;
      bool = false;
      break;
      label597:
      i1 = 0;
      break label254;
      label603:
      this.y.setBackgroundDrawable(localStateListDrawable);
      break label284;
      label615:
      i2 = 0;
      break label295;
      label621:
      if (this.y != null) {
        this.y.setVisibility(8);
      }
    }
  }
  
  public final void b(int paramInt)
  {
    a(paramInt);
    this.E.h = paramInt;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.b != null) && (this.b.f()))
    {
      this.b.E_();
      return;
    }
    a(paramView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.u.layout(0, 0, 0 + this.u.getMeasuredWidth(), 0 + this.u.getMeasuredHeight());
    int i1 = 0 + this.u.getMeasuredHeight();
    this.v.layout(0, i1, 0 + this.v.getMeasuredWidth(), i1 + this.v.getMeasuredHeight());
    int i2;
    int i4;
    label118:
    int i6;
    label173:
    int i7;
    if (this.D)
    {
      i2 = this.v.getMeasuredWidth() - this.o;
      int i3 = this.z.getMeasuredHeight() / 2;
      if (!this.D) {
        break label350;
      }
      i4 = i2 - this.z.getMeasuredWidth();
      this.z.layout(i4, i1 - i3, i4 + this.z.getMeasuredWidth(), i1 + i3);
      int i5 = i1 + i3;
      if (!this.D) {
        break label357;
      }
      i6 = i2 - this.w.getMeasuredWidth();
      this.w.layout(i6, i5, i6 + this.w.getMeasuredWidth(), i5 + this.w.getMeasuredHeight());
      i7 = i5 + this.w.getMeasuredHeight();
      if (!this.D) {
        break label364;
      }
    }
    label350:
    label357:
    label364:
    for (int i8 = i2 - this.x.getMeasuredWidth();; i8 = i2)
    {
      this.x.layout(i8, i7, i8 + this.x.getMeasuredWidth(), i7 + this.x.getMeasuredHeight());
      if (b())
      {
        int i9 = i7 + (this.x.getMeasuredHeight() + this.l);
        if (this.D) {
          i2 -= this.y.getMeasuredWidth();
        }
        this.y.layout(i2, i9, i2 + this.y.getMeasuredWidth(), i9 + this.y.getMeasuredHeight());
      }
      return;
      i2 = this.o;
      break;
      i4 = i2;
      break label118;
      i6 = i2;
      break label173;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.makeMeasureSpec((int)(0.3333333333333333D * i1), 1073741824);
    this.u.measure(paramInt1, i2);
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(i1 - this.o - this.p, 1073741824);
    this.w.measure(i4, i3);
    this.x.measure(i4, i3);
    if (b()) {
      this.y.measure(i3, i3);
    }
    for (int i5 = this.q + this.r + this.l + this.w.getMeasuredHeight() + this.x.getMeasuredHeight() + this.y.getMeasuredHeight();; i5 = this.q + this.r + this.w.getMeasuredHeight() + this.x.getMeasuredHeight())
    {
      int i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
      this.v.measure(paramInt1, i6);
      this.z.measure(i3, View.MeasureSpec.makeMeasureSpec(this.A, 1073741824));
      setMeasuredDimension(i1, i5 + this.u.getMeasuredHeight());
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hif
 * JD-Core Version:    0.7.0.1
 */