import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class drz
  extends kes
  implements oyw<dsa>
{
  private dsa a;
  private dsc b;
  
  @Deprecated
  public drz() {}
  
  public drz(Activity paramActivity)
  {
    b(paramActivity);
  }
  
  private final void b(Activity paramActivity)
  {
    try
    {
      this.b = ((dsc)((oze)((oyv)paramActivity).a()).a(new ozo(this)));
      this.a = this.b.c();
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", localClassCastException);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    
    try
    {
      View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
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
  
  public final Class<dsa> au_()
  {
    return dsa.class;
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
 * Qualified Name:     drz
 * JD-Core Version:    0.7.0.1
 */