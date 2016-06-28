import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoOneUpSelectionButton;

public class ayo
  extends mca
  implements gpq
{
  public aud Z;
  public tp a;
  public bdk b;
  public PhotoOneUpSelectionButton c;
  public dxl d;
  
  public ayo()
  {
    new gpk(this, this.bp, this);
    new jeq(this.bp, new ayp(this), '\000');
    new jeq(this.bp, new auf(this));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = ((PhotoOneUpSelectionButton)paramLayoutInflater.inflate(efj.vO, paramViewGroup, false));
    this.c.h = new dyb(this);
    return this.c;
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    this.a = paramtp;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp)
  {
    this.a = null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((dxl)this.bo.a(dxl.class));
    this.b = ((bdk)this.bo.a(bdk.class));
    this.Z = ((aud)this.bo.a(aud.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayo
 * JD-Core Version:    0.7.0.1
 */