import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class axb
  extends mca
{
  Animation Z;
  giz a;
  boolean aa = false;
  git b;
  bdk c;
  View d;
  
  public axb()
  {
    new jeq(this.bp, new axc(this), (byte)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = paramLayoutInflater.inflate(efj.tf, paramViewGroup, false);
    return this.d;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((giz)this.bo.a(giz.class));
    this.b = ((git)this.bo.a(git.class));
    this.c = ((bdk)this.bo.a(bdk.class));
    this.Z = AnimationUtils.loadAnimation(f(), efj.iH);
    this.Z.setAnimationListener(new axd(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axb
 * JD-Core Version:    0.7.0.1
 */