import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

public final class gry
  extends mfi
  implements oyw<grz>
{
  private grz a;
  private gsc b;
  
  @Deprecated
  public gry() {}
  
  public gry(Activity paramActivity)
  {
    b(paramActivity);
  }
  
  private final void b(Activity paramActivity)
  {
    try
    {
      this.b = ((gsc)((oze)((oyv)paramActivity).a()).a(new ozo(this)));
      this.a = this.b.e();
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", localClassCastException);
    }
  }
  
  private final grz v()
  {
    if (this.a == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    return (grz)this.a;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    
    try
    {
      super.a(paramLayoutInflater, paramViewGroup, paramBundle);
      grz localgrz = v();
      View localView = paramLayoutInflater.inflate(efj.EG, paramViewGroup, false);
      localgrz.g = ((Spinner)localView.findViewById(efj.EE));
      localgrz.g.setAdapter(localgrz.c);
      return localView;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void a(Activity paramActivity)
  {
    
    try
    {
      super.a(paramActivity);
      if (this.a == null) {
        b(paramActivity);
      }
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    
    try
    {
      super.a(paramBundle);
      grz localgrz = v();
      if (paramBundle != null)
      {
        localgrz.h = paramBundle.getInt("spinner state key", -1);
        grv localgrv = localgrz.e;
        String str = paramBundle.getString("categories_bundle_key");
        localgrv.b.a = str;
      }
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return new ozd(f().getLayoutInflater().getContext(), this.b).b();
  }
  
  public final Class<grz> au_()
  {
    return grz.class;
  }
  
  public final void d(Bundle paramBundle)
  {
    
    try
    {
      super.d(paramBundle);
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void d_()
  {
    
    try
    {
      super.d_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    grz localgrz = v();
    paramBundle.putInt("spinner state key", localgrz.h);
    paramBundle.putString("categories_bundle_key", localgrz.e.b.a);
  }
  
  public final void f_()
  {
    
    try
    {
      super.f_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void m()
  {
    
    try
    {
      super.m();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void n()
  {
    
    try
    {
      super.n();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void o()
  {
    
    try
    {
      super.o();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void p_()
  {
    
    try
    {
      super.p_();
      gsk localgsk = v().b;
      if (localgsk.b.a() != -1)
      {
        oxz localoxz = localgsk.c;
        grc localgrc = localgsk.a;
        String str = String.valueOf(localgrc.a);
        localoxz.a(new grg(localgrc, 21 + String.valueOf(str).length() + "activitylogcategories" + str), oxx.b, localgsk.e);
      }
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void q_()
  {
    
    try
    {
      super.q_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gry
 * JD-Core Version:    0.7.0.1
 */