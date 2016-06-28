import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceColorProvider.SpaceColorObserver;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView;
import java.util.ArrayList;
import java.util.List;

public class kxi
  implements gpq, SpaceColorProvider.SpaceColorObserver, lvh
{
  public Window a;
  public tp b;
  public int c;
  public ColorDrawable d;
  public ShapeDrawable e;
  public ColorDrawable f;
  public LayerDrawable g;
  public kwz h;
  public List<kxj> i = new ArrayList();
  public kxb j;
  public int k = 0;
  public boolean l = true;
  
  public kxi(Context paramContext)
  {
    mbb localmbb = mbb.b(paramContext);
    Resources localResources = paramContext.getResources();
    if (efj.D(paramContext)) {}
    for (Object localObject = new ColorDrawable(1342177280);; localObject = localResources.getDrawable(aau.BY))
    {
      this.e = new ShapeDrawable(new RectShape());
      this.e.getPaint().setColor(localResources.getColor(aau.BX));
      this.f = new ColorDrawable(this.e.getPaint().getColor());
      Drawable[] arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = localObject;
      arrayOfDrawable[1] = this.f;
      this.g = new LayerDrawable(arrayOfDrawable);
      this.c = efj.y(paramContext);
      this.h = ((kwz)localmbb.b(kwz.class));
      ((gpl)localmbb.a(gpl.class)).a(this);
      return;
    }
  }
  
  public void a(View paramView, int paramInt) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    int m = 0;
    int n;
    boolean bool2;
    int i1;
    int i2;
    if (paramInt1 == 0)
    {
      View localView = paramView.findViewById(efj.Ww);
      if ((localView instanceof SpaceHeaderView))
      {
        n = localView.getMeasuredHeight();
        if ((n > 0) && (-paramInt3 <= n - this.c))
        {
          bool2 = bool1;
          CoverPhotoImageView localCoverPhotoImageView = ((SpaceHeaderView)localView).a;
          i1 = localCoverPhotoImageView.getMeasuredHeight();
          i2 = -paramInt3;
          if ((i1 <= 0) || (i2 > i1)) {
            break label177;
          }
          label90:
          if ((this.d == null) || (i1 <= 0)) {
            break label213;
          }
          if (!bool1) {
            break label183;
          }
          this.d.setAlpha(i2 * 255 / i1);
          localCoverPhotoImageView.b(this.d);
        }
      }
    }
    for (;;)
    {
      if (m != this.k)
      {
        this.k = m;
        b();
      }
      if (bool2 != this.l)
      {
        this.l = bool2;
        c();
      }
      return;
      bool2 = false;
      break;
      label177:
      bool1 = false;
      break label90;
      label183:
      if (bool2)
      {
        m = 255 * (i2 - i1) / (n - i1 - this.c);
        continue;
        label213:
        if (!bool1) {}
      }
      for (int i3 = i2 * 255 / i1;; i3 = 255)
      {
        m = i3;
        break;
        bool2 = bool1;
        m = 0;
        break;
      }
      m = 255;
      bool2 = false;
    }
  }
  
  public void a(gpr paramgpr) {}
  
  public void a(kxb paramkxb)
  {
    this.j = paramkxb;
    if (this.d == null) {
      this.d = new ColorDrawable();
    }
    this.d.setColor(paramkxb.b);
    this.f.setColor(paramkxb.b);
    this.e.getPaint().setColor(paramkxb.b);
    b();
    d();
  }
  
  public void a(tp paramtp)
  {
    this.b = paramtp;
    paramtp.a(0.0F);
    if (this.h != null) {
      this.h.a(this);
    }
    b();
    c();
  }
  
  public boolean a()
  {
    return this.l;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public kxi b(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if (paramActivity != null) {
        this.a = paramActivity.getWindow();
      }
    }
    else {
      return this;
    }
    this.a = null;
    return this;
  }
  
  public kxi b(kxj paramkxj)
  {
    this.i.add(paramkxj);
    return this;
  }
  
  public void b()
  {
    if (this.b == null) {
      return;
    }
    if (this.k >= 255)
    {
      this.b.b(this.e);
      return;
    }
    this.g.getDrawable(0).setAlpha(255 - this.k);
    this.g.getDrawable(1).setAlpha(this.k);
    this.b.b(this.g);
  }
  
  public void b(tp paramtp)
  {
    this.b = null;
    if (this.h != null) {
      this.h.c.remove(this);
    }
  }
  
  public void c()
  {
    if (this.b == null) {
      return;
    }
    for (int m = 0; m < this.i.size(); m++) {
      ((kxj)this.i.get(m)).x();
    }
    tp localtp = this.b;
    boolean bool1 = this.l;
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    localtp.d(bool2);
  }
  
  @TargetApi(21)
  public void d()
  {
    if ((this.a != null) && (this.j != null)) {
      this.a.setStatusBarColor(this.j.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxi
 * JD-Core Version:    0.7.0.1
 */