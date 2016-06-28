import android.app.ActionBar;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.google.android.apps.photoeditor.views.FitImageView;
import com.google.android.libraries.photoeditor.core.FilterChain;

public final class akl
  extends mca
{
  private View Z;
  public aks a;
  private ProgressBar aa;
  private boolean ab;
  private boolean ac;
  private boolean b;
  private FitImageView c;
  private LinearLayout d;
  
  private final void b(boolean paramBoolean)
  {
    if (this.ac == paramBoolean) {
      return;
    }
    this.ac = paramBoolean;
    View localView = this.Z;
    if (this.ac) {}
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      f().invalidateOptionsMenu();
      return;
    }
  }
  
  private final void x()
  {
    this.d.removeAllViews();
    akp localakp = new akp(this);
    HorizontalScrollView localHorizontalScrollView = (HorizontalScrollView)this.d.getParent();
    if (Build.VERSION.SDK_INT >= 17) {
      localHorizontalScrollView.setLayoutDirection(0);
    }
    bp localbp = f();
    boolean bool1 = ghv.b(localbp);
    Resources localResources = g();
    int i = localResources.getDimensionPixelSize(efj.bV);
    int j = localResources.getDimensionPixelSize(efj.bU);
    boolean bool2 = ((alu)f()).d();
    aiu[] arrayOfaiu = ait.a;
    int k = arrayOfaiu.length;
    int m = 0;
    int n = 1000;
    aiu localaiu;
    int i3;
    label158:
    boolean bool3;
    label166:
    Drawable localDrawable;
    Drawable[] arrayOfDrawable;
    if (m < k)
    {
      localaiu = arrayOfaiu[m];
      if (!bool2)
      {
        int i2 = localaiu.a;
        if ((i2 == 6) || (i2 == 5) || (i2 == 18))
        {
          i3 = 1;
          if (i3 == 0) {
            break label381;
          }
        }
      }
      else
      {
        bool3 = true;
        localDrawable = localResources.getDrawable(localaiu.b);
        if (bool3) {
          break label435;
        }
        arrayOfDrawable = new Drawable[2];
        arrayOfDrawable[0] = localDrawable;
        arrayOfDrawable[1] = new ColorDrawable(2142220207);
      }
    }
    label393:
    label400:
    label435:
    for (Object localObject = new LayerDrawable(arrayOfDrawable);; localObject = localDrawable)
    {
      String str;
      label240:
      amx localamx;
      int i1;
      LinearLayout.LayoutParams localLayoutParams;
      float f;
      if (localaiu.c != -1)
      {
        str = localResources.getString(localaiu.c);
        localamx = new amx(localbp, (Drawable)localObject, str, localaiu.d);
        i1 = n + 1;
        localamx.setId(n);
        localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.setMargins(i / 2, 0, i / 2, j);
        localamx.setOnClickListener(localakp);
        localamx.setTag(Integer.valueOf(localaiu.a));
        localamx.setDuplicateParentStateEnabled(true);
        localamx.setEnabled(bool3);
        if (!bool3) {
          break label393;
        }
        f = 1.0F;
        label341:
        localamx.setAlpha(f);
        if (!bool1) {
          break label400;
        }
        this.d.addView(localamx, 0, localLayoutParams);
      }
      for (;;)
      {
        m++;
        n = i1;
        break;
        i3 = 0;
        break label158;
        label381:
        bool3 = false;
        break label166;
        str = null;
        break label240;
        f = 0.4F;
        break label341;
        this.d.addView(localamx, localLayoutParams);
      }
      if (ghv.b(localbp)) {
        localHorizontalScrollView.addOnLayoutChangeListener(new akq(this, localHorizontalScrollView));
      }
      return;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.gk, paramViewGroup, false);
    if (localView == null) {
      throw new IllegalStateException("Failed to inflate the root view");
    }
    this.c = ((FitImageView)localView.findViewById(efj.fM));
    this.d = ((LinearLayout)localView.findViewById(efj.fD));
    this.Z = localView.findViewById(efj.fE);
    this.aa = ((ProgressBar)localView.findViewById(efj.fP));
    this.Z.setOnTouchListener(new akm(this));
    a(true);
    x();
    if (paramBundle != null) {
      this.b = paramBundle.getBoolean("FilterSelectorFragment.filterListAnimated", false);
    }
    if ((!this.b) && (!ghv.b(this.bn)))
    {
      this.d.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this.bn, efj.bM));
      this.b = true;
      return localView;
    }
    this.b = false;
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
  }
  
  public final void a(Menu paramMenu)
  {
    ActionBar localActionBar = f().getActionBar();
    if (localActionBar == null) {
      throw new IllegalStateException("Could not get action bar");
    }
    localActionBar.getCustomView().setOnClickListener(new akn(this));
    MenuItem localMenuItem1 = paramMenu.findItem(efj.fu);
    if ((localMenuItem1 != null) && ((this.ac) || (((alu)f()).e() == null) || (!((alu)f()).e().d()))) {
      localMenuItem1.setEnabled(false);
    }
    MenuItem localMenuItem2 = paramMenu.findItem(efj.fq);
    View localView;
    if (localMenuItem2 != null)
    {
      localView = ((FrameLayout)localMenuItem2.getActionView()).findViewById(efj.fz);
      if (localView != null)
      {
        if (this.ac) {
          break label207;
        }
        if (localView != null) {
          localView.setOnTouchListener(new ako(this));
        }
      }
    }
    for (;;)
    {
      if (paramMenu.findItem(efj.ft) != null) {
        paramMenu.removeItem(efj.ft);
      }
      if (paramMenu.findItem(efj.fv) != null) {
        paramMenu.removeItem(efj.fv);
      }
      return;
      label207:
      localView.setEnabled(false);
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    f().getActionBar().setCustomView(efj.gg);
    paramMenuInflater.inflate(efj.gq, paramMenu);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.aa == null) {}
    do
    {
      return;
      this.aa.setVisibility(0);
    } while (!paramBoolean);
    b(true);
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == efj.fu)
    {
      if (((alu)f()).e().d())
      {
        akr localakr = new akr(this);
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
        localBuilder.setMessage(efj.iz);
        localBuilder.setPositiveButton(efj.ii, localakr);
        localBuilder.setNegativeButton(17039360, localakr);
        localBuilder.setCancelable(true);
        localBuilder.show();
      }
      return true;
    }
    return super.a_(paramMenuItem);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("FilterSelectorFragment.filterListAnimated", this.b);
  }
  
  public final void m()
  {
    super.m();
    if (this.ab) {
      v();
    }
  }
  
  public final void v()
  {
    aiq localaiq = ((alu)f()).e();
    if (localaiq != null) {
      if (localaiq.d == null) {
        break label43;
      }
    }
    label43:
    for (int i = 1; (i == 0) || (localaiq.h == null); i = 0)
    {
      this.ab = true;
      return;
    }
    Bitmap localBitmap = localaiq.b();
    FitImageView localFitImageView1 = this.c;
    localFitImageView1.a = localBitmap;
    localFitImageView1.b = true;
    localFitImageView1.invalidate();
    float f = efj.e(localaiq.h.getPostRotation());
    FitImageView localFitImageView2 = this.c;
    if ((localFitImageView2.c == f) || (Math.abs(f) % 90.0F != 0.0F)) {}
    for (;;)
    {
      w();
      this.ab = false;
      return;
      localFitImageView2.c = f;
      localFitImageView2.b = true;
      localFitImageView2.invalidate();
    }
  }
  
  public final void w()
  {
    if (this.aa == null) {
      return;
    }
    this.aa.setVisibility(4);
    b(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akl
 * JD-Core Version:    0.7.0.1
 */