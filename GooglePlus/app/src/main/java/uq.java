import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class uq
{
  static uq a(Context paramContext, Window paramWindow, up paramup)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return new ux(paramContext, paramWindow, paramup);
    }
    if (i >= 14) {
      return new uv(paramContext, paramWindow, paramup);
    }
    if (i >= 11) {
      return new uu(paramContext, paramWindow, paramup);
    }
    return new uz(paramContext, paramWindow, paramup);
  }
  
  public abstract aci a(acj paramacj);
  
  public abstract tp a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean b(int paramInt);
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract tv h();
  
  public abstract void i();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     uq
 * JD-Core Version:    0.7.0.1
 */