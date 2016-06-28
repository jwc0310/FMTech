import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.socialcast.impl.CastService;

public final class kwe
  extends mca
{
  private boolean Z = false;
  final kwf a = new kwf(this);
  kwd b;
  private final kwg c = new kwg(this);
  private Context d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return LayoutInflater.from(this.d).inflate(efj.VP, paramViewGroup, false);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.d = f();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = f();
    if (paramBundle != null) {
      this.Z = paramBundle.getBoolean("cast_connecting", false);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putBoolean("cast_connecting", this.Z);
    super.e(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    this.d.bindService(new Intent(f(), CastService.class), this.c, 1);
  }
  
  public final void n()
  {
    if (this.b != null)
    {
      this.b.b(this.a);
      this.b = null;
    }
    this.d.unbindService(this.c);
    super.n();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwe
 * JD-Core Version:    0.7.0.1
 */