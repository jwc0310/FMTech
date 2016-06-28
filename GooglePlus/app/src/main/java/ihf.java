import android.annotation.TargetApi;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ingest.ui.MtpFullscreenView;
import com.google.android.libraries.social.ingest.ui.MtpImageView;
import java.util.Collection;

@TargetApi(12)
public final class ihf
  extends nc
{
  public ihp b;
  private LayoutInflater c;
  private int d = 0;
  private ihc e;
  private int f = ihr.b;
  private MtpFullscreenView g = null;
  
  public ihf(Context paramContext, ihc paramihc)
  {
    this.c = LayoutInflater.from(paramContext);
    this.e = paramihc;
  }
  
  public final int a(int paramInt)
  {
    if (this.b == null) {}
    int i;
    ihv localihv;
    do
    {
      return -1;
      ihp localihp = this.b;
      i = this.f;
      localihv = localihp.e;
    } while (localihv == null);
    if (i == ihr.a)
    {
      ihh localihh2 = localihv.c[localihv.a[paramInt]];
      if (localihh2.b == paramInt) {
        paramInt++;
      }
      return -1 + (paramInt + localihh2.d) - localihh2.b;
    }
    int j = -1 + localihv.a.length - paramInt;
    ihh localihh1 = localihv.c[localihv.a[j]];
    if (localihh1.c == j) {
      j--;
    }
    return -1 + localihv.b.length - localihh1.d - j + localihh1.b;
  }
  
  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    MtpFullscreenView localMtpFullscreenView;
    int i;
    ihv localihv;
    ihk localihk;
    if (this.g != null)
    {
      localMtpFullscreenView = this.g;
      this.g = null;
      ihp localihp = this.b;
      i = this.f;
      localihv = localihp.e;
      localihk = null;
      if (localihv != null) {
        break label99;
      }
    }
    for (;;)
    {
      localMtpFullscreenView.a.a(this.b.a(), localihk, this.d);
      localMtpFullscreenView.a(paramInt, this.e);
      paramViewGroup.addView(localMtpFullscreenView);
      return localMtpFullscreenView;
      localMtpFullscreenView = (MtpFullscreenView)this.c.inflate(efj.Nv, paramViewGroup, false);
      break;
      label99:
      if (i == ihr.a) {
        localihk = localihv.b[paramInt];
      } else {
        localihk = localihv.b[(-1 + localihv.b.length - paramInt)];
      }
    }
  }
  
  public final void a(ViewGroup paramViewGroup)
  {
    this.g = null;
    super.a(paramViewGroup);
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    MtpFullscreenView localMtpFullscreenView = (MtpFullscreenView)paramObject;
    paramViewGroup.removeView(localMtpFullscreenView);
    this.e.a.remove(localMtpFullscreenView);
    this.g = localMtpFullscreenView;
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public final int b()
  {
    ihp localihp = this.b;
    int i = 0;
    if (localihp != null)
    {
      ihv localihv = this.b.e;
      i = 0;
      if (localihv != null) {
        i = localihv.b.length;
      }
    }
    return i;
  }
  
  public final void d()
  {
    this.d = (1 + this.d);
    super.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihf
 * JD-Core Version:    0.7.0.1
 */