package android.support.v7.app;

import aam;
import aao;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import ll;
import vm;
import wa;

public class MediaRouteActionProvider
  extends ll
{
  public final aao d;
  public final vm e;
  public aam f = aam.c;
  public MediaRouteButton g;
  private wa h = wa.a;
  
  public MediaRouteActionProvider(Context paramContext)
  {
    super(paramContext);
    this.d = aao.a(paramContext);
    this.e = new vm(this);
  }
  
  public final View a()
  {
    if (this.g != null) {
      Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
    }
    this.g = new MediaRouteButton(this.a);
    this.g.a = true;
    this.g.a(this.f);
    this.g.a(this.h);
    this.g.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    return this.g;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    return aao.a(this.f, 1);
  }
  
  public final boolean e()
  {
    if (this.g != null) {
      return this.g.a();
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.MediaRouteActionProvider
 * JD-Core Version:    0.7.0.1
 */