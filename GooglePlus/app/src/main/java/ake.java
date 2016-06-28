import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.TouchVisualizationView;
import java.util.List;

public abstract class ake
  extends mca
  implements gxs
{
  private TransitionDrawable Z;
  private View a;
  public akj ab;
  FilterParameter ac;
  public TouchVisualizationView ad;
  public boolean ae;
  gia af;
  View ag;
  private View b;
  private View c;
  private View d;
  
  public ake()
  {
    new gxj(this.bp, (byte)0);
  }
  
  protected static String f(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt + 1);
    return String.format("%d", arrayOfObject);
  }
  
  protected void A()
  {
    gfc localgfc = K();
    if (localgfc == null)
    {
      a(this.ac, null);
      return;
    }
    a(true, true);
    localgfc.a(B(), null, this.ac, new akk(this));
  }
  
  protected gfb B()
  {
    return null;
  }
  
  protected boolean E()
  {
    return true;
  }
  
  protected gfg I()
  {
    return null;
  }
  
  protected gfh J()
  {
    return null;
  }
  
  protected gfc K()
  {
    return null;
  }
  
  protected final aiq M()
  {
    alu localalu = (alu)f();
    if (localalu != null) {
      return localalu.e();
    }
    return null;
  }
  
  public FilterParameter N()
  {
    return this.ac;
  }
  
  protected void O()
  {
    gfg localgfg = I();
    if (localgfg != null) {
      localgfg.a();
    }
  }
  
  final void P()
  {
    if (this.af != null)
    {
      this.af.a(true);
      this.af = null;
    }
  }
  
  protected final int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (f() == null) {
      return 0;
    }
    int i;
    bp localbp;
    Animation localAnimation1;
    if (paramBoolean2)
    {
      i = g().getInteger(efj.gf);
      localbp = f();
      if (!paramBoolean1) {
        break label155;
      }
      ((alu)f()).a(ghn.c);
      efj.a(localbp);
      localAnimation1 = AnimationUtils.loadAnimation(localbp, efj.bJ);
    }
    for (Animation localAnimation2 = AnimationUtils.loadAnimation(localbp, efj.bK);; localAnimation2 = AnimationUtils.loadAnimation(localbp, efj.bL))
    {
      localAnimation1.setDuration(i);
      localAnimation2.setDuration(i);
      this.b.startAnimation(localAnimation1);
      this.d.startAnimation(localAnimation1);
      this.ag.startAnimation(localAnimation1);
      this.c.startAnimation(localAnimation1);
      if (this.a != null)
      {
        this.a.setAlpha(1.0F);
        this.a.startAnimation(localAnimation2);
      }
      return i;
      i = 0;
      break;
      label155:
      ((alu)f()).a(null);
      if (localbp != null) {
        localbp.setRequestedOrientation(2);
      }
      localAnimation1 = AnimationUtils.loadAnimation(localbp, efj.bI);
    }
  }
  
  public String a(int paramInt, Object paramObject)
  {
    return b(paramInt, paramObject);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.ac = FilterFactory.a(paramBundle.getString("filter_parameter"));
    }
    if (this.ac == null) {
      this.ac = z();
    }
    d(true);
  }
  
  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    ActionBar localActionBar = f().getActionBar();
    localActionBar.setCustomView(efj.gh);
    ViewGroup localViewGroup = (ViewGroup)localActionBar.getCustomView();
    this.b = localViewGroup.findViewById(efj.fw);
    this.b.setOnClickListener(new akf(this));
    this.d = localViewGroup.findViewById(efj.fy);
    this.d.setOnClickListener(new akg(this));
    this.ag = localViewGroup.findViewById(efj.fJ);
    if (x())
    {
      this.ag.setOnClickListener(new akh(this));
      this.Z = ((TransitionDrawable)((ImageView)this.ag).getDrawable());
      this.Z.setCrossFadeEnabled(true);
    }
    for (;;)
    {
      this.c = localViewGroup.findViewById(efj.fz);
      if (!E()) {
        break;
      }
      this.c.setOnTouchListener(new aki(this));
      return;
      this.ag.setVisibility(8);
      localViewGroup.findViewById(efj.fK).setVisibility(8);
    }
    this.c.setVisibility(8);
    localViewGroup.findViewById(efj.fA).setVisibility(8);
  }
  
  protected void a(FilterParameter paramFilterParameter, Bitmap paramBitmap)
  {
    try
    {
      a(false, true);
      if (this.ab != null) {
        this.ab.a(paramFilterParameter, paramBitmap);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void a(boolean paramBoolean) {}
  
  protected boolean a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    boolean bool = N().a(paramInt, paramObject);
    if ((paramBoolean) && (bool)) {
      O();
    }
    return bool;
  }
  
  public final Context aI_()
  {
    return this.bn;
  }
  
  public String b(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return "*UNKNOWN*";
    case 42: 
      int i = efj.hH;
      return g().getString(i);
    case 3: 
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = e(paramInt);
      arrayOfObject2[1] = Integer.valueOf(1 + ((Number)paramObject).intValue());
      return String.format("%s %d", arrayOfObject2);
    }
    Number localNumber = (Number)paramObject;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = e(paramInt);
    arrayOfObject1[1] = Integer.valueOf(localNumber.intValue());
    return String.format("%s %d", arrayOfObject1);
  }
  
  protected void b(boolean paramBoolean) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxs.class, this);
  }
  
  public String e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "*UNKNOWN*";
    case 0: 
      int i28 = efj.hD;
      return g().getString(i28);
    case 1: 
      int i27 = efj.hG;
      return g().getString(i27);
    case 2: 
      int i26 = efj.hT;
      return g().getString(i26);
    case 3: 
      int i25 = efj.ib;
      return g().getString(i25);
    case 5: 
      int i24 = efj.hE;
      return g().getString(i24);
    case 6: 
      int i23 = efj.if;
      return g().getString(i23);
    case 104: 
      int i22 = efj.id;
      return g().getString(i22);
    case 38: 
      int i21 = efj.hZ;
      return g().getString(i21);
    case 7: 
      int i20 = efj.hM;
      return g().getString(i20);
    case 8: 
      int i19 = efj.hL;
      return g().getString(i19);
    case 221: 
      int i18 = efj.hN;
      return g().getString(i18);
    case 222: 
      int i17 = efj.hO;
      return g().getString(i17);
    case 42: 
      int i16 = efj.hH;
      return g().getString(i16);
    case 41: 
      int i15 = efj.hI;
      return g().getString(i15);
    case 40: 
      int i14 = efj.hJ;
      return g().getString(i14);
    case 9: 
      int i13 = efj.ic;
      return g().getString(i13);
    case 10: 
      int i12 = efj.hz;
      return g().getString(i12);
    case 11: 
      int i11 = efj.ig;
      return g().getString(i11);
    case 12: 
      int i10 = efj.hK;
      return g().getString(i10);
    case 13: 
      int i9 = efj.hB;
      return g().getString(i9);
    case 4: 
      int i8 = efj.hF;
      return g().getString(i8);
    case 14: 
      int i7 = efj.hP;
      return g().getString(i7);
    case 15: 
      int i6 = efj.hX;
      return g().getString(i6);
    case 16: 
      int i5 = efj.ia;
      return g().getString(i5);
    case 17: 
      int i4 = efj.ie;
      return g().getString(i4);
    case 19: 
      int i3 = efj.hC;
      return g().getString(i3);
    case 20: 
      int i2 = efj.hW;
      return g().getString(i2);
    case 231: 
      int i1 = efj.hU;
      return g().getString(i1);
    case 23: 
      int n = efj.hS;
      return g().getString(n);
    case 22: 
      int m = efj.hQ;
      return g().getString(m);
    case 232: 
      int k = efj.hR;
      return g().getString(k);
    case 233: 
      int j = efj.hV;
      return g().getString(j);
    case 654: 
      int i = efj.hY;
      return g().getString(i);
    case 650: 
      return "[ALPHA]";
    case 651: 
      return "[BETA]";
    case 652: 
      return "[BLACKS]";
    case 653: 
      return "[WHITES]";
    }
    return "";
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("filter_parameter", FilterFactory.a(this.ac));
  }
  
  protected void g(boolean paramBoolean) {}
  
  public final void h(boolean paramBoolean)
  {
    if (!this.ae) {
      return;
    }
    i(paramBoolean);
    P();
    this.ae = false;
    b(paramBoolean);
  }
  
  final void i(boolean paramBoolean)
  {
    if (!this.ae) {}
    int i;
    for (boolean bool = true;; bool = false)
    {
      i = a(bool, paramBoolean);
      this.ag.clearAnimation();
      if (!this.ae) {
        break;
      }
      this.Z.reverseTransition(i);
      return;
    }
    this.Z.startTransition(i);
  }
  
  public void m()
  {
    super.m();
    if (this.N != null)
    {
      if (this.ad == null) {
        this.ad = ((TouchVisualizationView)this.N.findViewById(efj.fL));
      }
      if (this.a == null) {
        this.a = this.N.findViewById(efj.fR);
      }
    }
    FilterChain localFilterChain = M().h;
    if (localFilterChain != null)
    {
      this.ac.setParameterInteger(616, localFilterChain.getPostRotation());
      this.ac.setParameterInteger(617, localFilterChain.getImageWidth());
      this.ac.setParameterInteger(618, localFilterChain.getImageHeight());
    }
  }
  
  public void n()
  {
    super.n();
    h(false);
  }
  
  public final void o()
  {
    super.o();
    ((alu)f()).a(null);
  }
  
  public abstract int w();
  
  protected boolean x()
  {
    return false;
  }
  
  protected List<ghw> y()
  {
    return null;
  }
  
  protected FilterParameter z()
  {
    return efj.Cv.a(w());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ake
 * JD-Core Version:    0.7.0.1
 */