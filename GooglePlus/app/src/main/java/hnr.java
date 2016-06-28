import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hnr
  extends loa
  implements View.OnClickListener, hnp
{
  final ArrayList<SpaceListItemView> a;
  private int d;
  private final int e;
  private final int f;
  private final int g;
  private StaticLayout h;
  private StaticLayout i;
  private final TextView j;
  private List<qpq> k;
  private final git l;
  private final hpo m;
  private final hnf n;
  private final kxq o;
  private final int p;
  private int q;
  private int r;
  
  public hnr(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = getResources();
    this.f = localResources.getDimensionPixelSize(efj.IS);
    this.e = localResources.getInteger(efj.Jb);
    this.g = localResources.getInteger(efj.Ja);
    this.j = new TextView(localContext);
    this.j.setTextAppearance(localContext, ehr.bd);
    this.j.setAllCaps(true);
    this.j.setGravity(8388613);
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aau.zt;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(arrayOfInt);
    this.j.setBackgroundResource(localTypedArray.getResourceId(0, 0));
    localTypedArray.recycle();
    this.j.setPadding(this.H.m, this.H.m, this.H.m, this.H.m);
    this.j.setText(efj.Jh);
    this.a = new ArrayList();
    this.l = ((git)mbb.a(localContext, git.class));
    this.m = ((hpo)mbb.a(localContext, hpo.class));
    this.n = ((hnf)mbb.a(localContext, hnf.class));
    this.o = ((kxq)mbb.a(localContext, kxq.class));
    setClickable(true);
    efj.a(this.j, new gxq(pju.o));
    this.j.setOnClickListener(new gxn(this));
    if (efj.B(getContext())) {
      setContentDescription(localContext.getString(efj.Jg));
    }
    this.p = localResources.getInteger(17694720);
  }
  
  private final int a(int paramInt)
  {
    this.i = new StaticLayout(getContext().getString(efj.Jf), efj.B(getContext(), ehr.bf), paramInt, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    return this.i.getHeight();
  }
  
  private final int d(boolean paramBoolean)
  {
    int i1 = (-1 + this.e) * this.f;
    this.d = ((this.P - i1) / this.e);
    int i2 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    for (int i4 = 0; i4 < this.a.size(); i4++)
    {
      ((View)this.a.get(i4)).measure(i2, i3);
      if (!paramBoolean) {
        break;
      }
    }
    boolean bool = this.a.isEmpty();
    int i5 = 0;
    if (!bool)
    {
      int i6 = ((View)this.a.get(0)).getMeasuredHeight();
      int i7 = (int)Math.ceil(this.a.size() / this.e);
      i5 = 0 + (i6 * i7 + this.f * (i7 - 1));
    }
    return i5;
  }
  
  public final void D_()
  {
    super.D_();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      SpaceListItemView localSpaceListItemView = (SpaceListItemView)localIterator.next();
      localSpaceListItemView.animate().cancel();
      localSpaceListItemView.setLayoutTransition(null);
      if ((localSpaceListItemView instanceof lxj)) {
        localSpaceListItemView.D_();
      }
    }
    lwo.e(this);
    this.n.a(this);
    this.k = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt2 + this.H.aP;
    this.h = new StaticLayout(getContext().getString(efj.Jg), efj.B(getContext(), ehr.bc), paramInt4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    int i2 = i1 + this.h.getHeight() + this.H.aP;
    this.q = i2;
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int i5 = d(false);
    if (i5 == 0) {}
    for (int i6 = i2 + a(paramInt4);; i6 = i2 + i5)
    {
      this.j.measure(i4, i3);
      int i7 = i6 + this.j.getMeasuredHeight();
      if (this.r == 0) {
        this.r = i7;
      }
      return this.r;
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = paramInt5 + this.H.aP;
    paramCanvas.translate(paramInt3, i1);
    this.h.draw(paramCanvas);
    paramCanvas.translate(-paramInt3, -i1);
    int i2 = i1 + this.h.getHeight();
    if (this.a.isEmpty())
    {
      int i3 = i2 + (getMeasuredHeight() - i2 - this.j.getMeasuredHeight() - this.i.getHeight()) / 2;
      if (this.i != null)
      {
        paramCanvas.translate(paramInt3, i3);
        this.i.draw(paramCanvas);
        paramCanvas.translate(-paramInt3, -i3);
      }
    }
    return paramInt5 + getHeight();
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    addView(this.j);
    this.n.a(this, this.N);
    try
    {
      qpp localqpp = new qpp();
      byte[] arrayOfByte = paramCursor.getBlob(30);
      qat.b(localqpp, arrayOfByte, 0, arrayOfByte.length);
      if ((localqpp.b == null) || (localqpp.b.length == 0)) {
        Log.e("FeaturedCollexionsPromo", "Featured collexions promo data contains no collexions.");
      }
      int i3 = localqpp.b.length;
      this.k = new ArrayList(i3);
      Set localSet = this.n.a();
      for (int i4 = 0; i4 < i3; i4++)
      {
        qpq localqpq = localqpp.b[i4];
        if (!localSet.contains(localqpq.a.a)) {
          this.k.add(localqpq);
        }
      }
      int i1;
      int i2;
      SpaceListItemView localSpaceListItemView;
      return;
    }
    catch (qas localqas)
    {
      Log.e("FeaturedCollexionsPromo", "Invalid promo data message");
      i1 = Math.min(this.k.size(), this.g);
      while (this.a.size() < i1) {
        this.a.add(this.o.b(getContext(), this));
      }
      for (i2 = 0; i2 < i1; i2++)
      {
        localSpaceListItemView = (SpaceListItemView)this.a.get(i2);
        addView(localSpaceListItemView);
        this.n.a(localSpaceListItemView, (qpq)this.k.remove(0), this);
      }
    }
  }
  
  public final void a(SpaceListItemView paramSpaceListItemView)
  {
    int i1 = this.a.indexOf(paramSpaceListItemView);
    this.a.remove(paramSpaceListItemView);
    paramSpaceListItemView.animate().alpha(0.0F).setDuration(this.p).setListener(new hns(this, paramSpaceListItemView));
    if (this.k.isEmpty())
    {
      if (!this.a.isEmpty())
      {
        localViewGroup = (ViewGroup)this.a.get(0);
        if ((i1 == 0) && (Build.VERSION.SDK_INT >= 16))
        {
          localLayoutTransition = new LayoutTransition();
          localLayoutTransition.enableTransitionType(4);
          localLayoutTransition.setDuration(this.p);
          localViewGroup.setLayoutTransition(localLayoutTransition);
        }
      }
      while (this.i != null)
      {
        ViewGroup localViewGroup;
        LayoutTransition localLayoutTransition;
        return;
      }
      a(getMeasuredWidth());
      return;
    }
    qpq localqpq = (qpq)this.k.remove(0);
    SpaceListItemView localSpaceListItemView = this.o.b(getContext(), this);
    addView(localSpaceListItemView);
    localSpaceListItemView.setAlpha(0.0F);
    this.a.add(i1, localSpaceListItemView);
    localSpaceListItemView.animate().alpha(1.0F).setDuration(this.p).setListener(new hnt(this, localSpaceListItemView));
    this.n.a(localSpaceListItemView, localqpq, this);
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = this.q;
    int i2 = -1 + this.e;
    int i3 = i1;
    for (int i4 = 0; i4 < this.a.size(); i4++)
    {
      View localView = (View)this.a.get(i4);
      int i6 = i4 % this.e;
      int i7 = this.M.left + i6 * (this.d + this.f);
      localView.layout(i7, i3, i7 + localView.getMeasuredWidth(), i3 + localView.getMeasuredHeight());
      if ((i6 == i2) || (i4 == -1 + this.a.size()))
      {
        i3 += localView.getMeasuredHeight();
        if (i4 != -1 + this.a.size()) {
          i3 += this.f;
        }
      }
    }
    int i5 = paramInt4 - paramInt2 - this.M.bottom;
    this.j.layout(this.M.left, i5 - this.j.getMeasuredHeight(), this.M.left + this.P, i5);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.j) {
      getContext().startActivity(this.m.a(this.l.c()));
    }
  }
  
  @TargetApi(18)
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    d(true);
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final gxq v()
  {
    return new gxq(pju.n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnr
 * JD-Core Version:    0.7.0.1
 */