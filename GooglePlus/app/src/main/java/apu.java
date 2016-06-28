import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

public final class apu
  implements asv
{
  public int a;
  public int b;
  private final asu c;
  private final int d;
  private final aud e;
  private final LayoutInflater f;
  
  public apu(Context paramContext, asu paramasu, int paramInt)
  {
    this.f = LayoutInflater.from(paramContext);
    this.e = ((aud)mbb.a(paramContext, aud.class));
    this.c = paramasu;
    this.d = paramInt;
  }
  
  public final int a()
  {
    return this.d;
  }
  
  public final View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = this.f.inflate(efj.vS, paramViewGroup, false);; localView = paramView)
    {
      List localList = this.c.a;
      if (localList != null) {}
      for (int i = localList.size(); paramInt1 >= i; i = 0)
      {
        localView.setVisibility(8);
        localView.setLayoutParams(new dxa(paramInt2, paramInt2));
        return localView;
      }
      Long localLong = (Long)this.c.a.get(paramInt1);
      PhotoTileView localPhotoTileView = (PhotoTileView)localView;
      if (this.a != 0)
      {
        localPhotoTileView.s = 0;
        localPhotoTileView.b(this.a, this.b);
      }
      localPhotoTileView.e(65536);
      apm localapm = ((apo)mbb.a(localView.getContext(), apo.class)).a(localLong.longValue(), apn.a);
      localPhotoTileView.setTag(aaw.kT, localLong);
      if (localapm != null) {
        a(localView.getContext(), localPhotoTileView, localapm);
      }
      for (;;)
      {
        localPhotoTileView.setTag(aaw.lo, aow.a);
        localPhotoTileView.setOnClickListener(new apw(this, localPhotoTileView, localLong));
        localPhotoTileView.setOnLongClickListener(new apx(this, localPhotoTileView, localLong));
        localView.setVisibility(0);
        break;
        localPhotoTileView.a(null);
        localPhotoTileView.a(null);
        Future localFuture1 = (Future)localPhotoTileView.getTag(aaw.lf);
        if (localFuture1 != null) {
          localFuture1.cancel(true);
        }
        app localapp = (app)mbb.a(localView.getContext(), app.class);
        long l = localLong.longValue();
        apv localapv = new apv(this, localPhotoTileView, localLong, localView);
        Future localFuture2 = localapp.a(Collections.singletonList(Long.valueOf(l)), new apq(localapp, localapv));
        localPhotoTileView.setTag(aaw.lf, localFuture2);
      }
    }
  }
  
  final void a(Context paramContext, PhotoTileView paramPhotoTileView, apm paramapm)
  {
    boolean bool1;
    boolean bool2;
    label32:
    bpr localbpr2;
    oih localoih1;
    label81:
    Object localObject;
    label95:
    ipm localipm;
    int i;
    label155:
    int j;
    label173:
    Resources localResources;
    if ((0x100 & paramapm.d) != 0L)
    {
      bool1 = true;
      if ((0x4000 & paramapm.d) == 0L) {
        break label287;
      }
      bool2 = true;
      bpr localbpr1 = (bpr)this.e.b.a(bpt.a, new bpu(paramapm.b));
      if (localbpr1 == null) {
        break label293;
      }
      oih localoih2 = localbpr1.c;
      localbpr2 = localbpr1;
      localoih1 = localoih2;
      ipf localipf = paramapm.f;
      if (localoih1 != null) {
        break label322;
      }
      localObject = null;
      paramPhotoTileView.a(localipf, (ioy)localObject, true);
      paramPhotoTileView.a(localbpr2);
      paramPhotoTileView.d = bool1;
      paramPhotoTileView.H = bool2;
      paramPhotoTileView.invalidate();
      localipm = paramapm.f.e;
      if ((paramapm.g == null) || (paramapm.g.o == null)) {
        break label336;
      }
      i = 1;
      if (localipm != ipm.b) {
        break label350;
      }
      if (i == 0) {
        break label342;
      }
      j = aau.vv;
      localResources = paramContext.getResources();
      if (i == 0) {
        break label429;
      }
      paramPhotoTileView.setContentDescription(localResources.getString(j, new Object[] { DateUtils.formatDateTime(paramContext, paramapm.g.o.longValue(), 20) }));
    }
    for (;;)
    {
      ((cpu)mbb.a(paramContext, cpu.class)).a(paramapm.f, paramPhotoTileView);
      if ("TRUE".equalsIgnoreCase(dun.h.a()))
      {
        paramPhotoTileView.e = 1;
        paramPhotoTileView.invalidate();
        ((cyr)mbb.a(paramContext, cyr.class)).a(paramPhotoTileView, paramapm.f);
      }
      return;
      bool1 = false;
      break;
      label287:
      bool2 = false;
      break label32;
      label293:
      localbpr2 = new bpr(paramapm.b, paramapm.f, null, null, paramapm.d);
      localoih1 = null;
      break label81;
      label322:
      localObject = new jpt(localoih1);
      break label95;
      label336:
      i = 0;
      break label155;
      label342:
      j = aau.vu;
      break label173;
      label350:
      if (localipm == ipm.d)
      {
        if (i != 0)
        {
          j = aau.iG;
          break label173;
        }
        j = aau.iF;
        break label173;
      }
      if (localipm == ipm.c)
      {
        if (i != 0)
        {
          j = aau.mr;
          break label173;
        }
        j = aau.mq;
        break label173;
      }
      if (i != 0)
      {
        j = aau.mT;
        break label173;
      }
      j = aau.mS;
      break label173;
      label429:
      paramPhotoTileView.setContentDescription(localResources.getString(j));
    }
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apu
 * JD-Core Version:    0.7.0.1
 */