import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.viewer.components.captionbar.CaptionBarView;

public class azh
  extends mca
{
  private final azj Z = new azj(this);
  bfd a;
  private bdk aa;
  private bdg ab;
  bdi b;
  public CaptionBarView c;
  private final azk d = new azk(this);
  
  public azh()
  {
    new jeq(this.bp, new azi(this), '\000');
    new jeq(this.bp, new bdh(this));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = ((CaptionBarView)paramLayoutInflater.inflate(efj.vF, paramViewGroup, false));
    return this.c;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((bfd)this.bo.a(bfd.class));
    this.aa = ((bdk)this.bo.a(bdk.class));
    this.ab = ((bdg)this.bo.a(bdg.class));
    this.b = ((bdi)this.bo.a(bdi.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azh
 * JD-Core Version:    0.7.0.1
 */