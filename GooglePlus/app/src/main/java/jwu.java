import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public abstract class jwu
  extends jxg
{
  int f;
  public ArrayList<MediaView> g;
  ArrayList<MediaView> h;
  public View.OnClickListener i;
  public View.OnLongClickListener j;
  
  jwu(Context paramContext)
  {
    super(paramContext);
  }
  
  public void D_()
  {
    int k = 0;
    super.D_();
    removeAllViews();
    int m = this.g.size();
    for (int n = 0; n < m; n++) {
      ((MediaView)this.g.get(n)).clearAnimation();
    }
    int i1 = this.h.size();
    while (k < i1)
    {
      ((MediaView)this.h.get(k)).clearAnimation();
      k++;
    }
    if (this.g.size() == 5) {
      this.g.clear();
    }
    if (this.h.size() == 5) {
      this.h.clear();
    }
  }
  
  public int a(View paramView)
  {
    int k = 0;
    int m = this.g.size();
    while (k < m)
    {
      if (paramView == this.g.get(k)) {
        return k;
      }
      k++;
    }
    return -1;
  }
  
  final MediaView a(Context paramContext, int paramInt)
  {
    if (paramInt < this.g.size())
    {
      localMediaView = (MediaView)this.g.get(paramInt);
      addView(localMediaView);
      return localMediaView;
    }
    MediaView localMediaView = new MediaView(paramContext);
    localMediaView.E = 2;
    localMediaView.s = 0;
    localMediaView.e(4);
    localMediaView.setClickable(true);
    localMediaView.setOnClickListener(this.i);
    localMediaView.setOnLongClickListener(this.j);
    Resources localResources = paramContext.getResources();
    if ((this.c.f()) || (this.c.e())) {
      localMediaView.setContentDescription(localResources.getQuantityString(efj.TN, 1));
    }
    for (;;)
    {
      this.g.add(localMediaView);
      break;
      int k = efj.TN;
      int m = this.c.i;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt + 1);
      arrayOfObject[1] = Integer.valueOf(this.c.i);
      localMediaView.setContentDescription(localResources.getQuantityString(k, m, arrayOfObject));
    }
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
    Context localContext = getContext();
    llz[] arrayOfllz = this.c.h;
    for (int k = 0; k < this.y; k++)
    {
      llx localllx = arrayOfllz[k].d;
      if ((localllx != null) && (!TextUtils.isEmpty(localllx.e))) {
        ((MediaView)this.g.get(k)).a(ipf.a(localContext, localllx.f, localllx.h, localllx.e, null, localllx.m));
      }
    }
    this.f = View.MeasureSpec.makeMeasureSpec(d(), 1073741824);
  }
  
  protected void a(Context paramContext)
  {
    super.a(paramContext);
    this.g = new ArrayList();
    this.h = new ArrayList();
  }
  
  final MediaView b(Context paramContext, int paramInt)
  {
    MediaView localMediaView;
    if (paramInt < this.h.size()) {
      localMediaView = (MediaView)this.h.get(paramInt);
    }
    for (;;)
    {
      addView(localMediaView);
      return localMediaView;
      localMediaView = new MediaView(paramContext);
      localMediaView.s = 2;
      localMediaView.b(1);
      localMediaView.setClickable(true);
      localMediaView.setOnClickListener(this.i);
      nj.a.c(localMediaView, 2);
      this.h.add(localMediaView);
    }
  }
  
  public void b()
  {
    Context localContext = getContext();
    llz[] arrayOfllz = this.c.h;
    for (int k = 0; k < this.y; k++)
    {
      llx localllx = arrayOfllz[k].d;
      if ((localllx != null) && (!TextUtils.isEmpty(localllx.e)))
      {
        a(localContext, k);
        b(localContext, k).a(ipf.a(localContext, iqw.a(localllx.e, 256), ipm.a));
      }
      e(localContext, k);
      d(localContext, k);
      a(localContext, k, arrayOfllz[k].b);
      c(localContext, k);
    }
    addView(this.t);
  }
  
  abstract int d();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwu
 * JD-Core Version:    0.7.0.1
 */