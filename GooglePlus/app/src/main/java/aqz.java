import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aqz
  implements asv
{
  final ard a;
  final arj b;
  private Context c;
  private final jrh d;
  private final arc e;
  private final aud f;
  private final LayoutInflater g;
  
  public aqz(Context paramContext, arj paramarj, jrh paramjrh, arc paramarc)
  {
    this.c = paramContext;
    this.f = ((aud)mbb.a(paramContext, aud.class));
    this.a = ((ard)mbb.a(paramContext, ard.class));
    this.g = LayoutInflater.from(paramContext);
    this.b = paramarj;
    this.d = paramjrh;
    this.e = paramarc;
  }
  
  private static int a(arj paramarj, isq paramisq)
  {
    int i = 0;
    int j;
    if (paramisq != null)
    {
      List localList = paramarj.a;
      i = 0;
      if (localList != null)
      {
        Iterator localIterator = paramarj.c.l.iterator();
        j = 0;
        if (localIterator.hasNext())
        {
          ari localari = (ari)localIterator.next();
          if ((localari.i == 101) || ((jpu)paramisq.a(new jpy(paramarj.c.c), new jpw(localari.c)) == null)) {
            break label120;
          }
        }
      }
    }
    label120:
    for (int k = j + 1;; k = j)
    {
      j = k;
      break;
      i = j;
      return i;
    }
  }
  
  public final int a()
  {
    return 2 + this.d.a;
  }
  
  public final View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramInt1 < this.d.a)
    {
      if (paramView != null) {
        break label1158;
      }
      localView = this.g.inflate(efj.vS, paramViewGroup, false);
      localView.setLayoutParams(new ViewGroup.LayoutParams(paramInt2, paramInt2));
    }
    for (;;)
    {
      int i6;
      int i9;
      label111:
      int i7;
      label152:
      PhotoTileView localPhotoTileView2;
      Integer localInteger;
      int i8;
      label226:
      label241:
      boolean bool2;
      label296:
      jpu localjpu;
      boolean bool3;
      label400:
      Object localObject;
      if (this.b.a != null)
      {
        i6 = this.b.a.size();
        if ((this.b.a == null) || (paramInt1 >= i6)) {
          break label616;
        }
        if (101 != ((ari)this.b.a.get(paramInt1)).i) {
          break label610;
        }
        i9 = 1;
        if ((i9 != 0) || ((paramInt1 == i6 - 1) && (i6 == this.d.a) && (this.b.b.a))) {
          break label616;
        }
        i7 = 0;
        localView.setVisibility(i7);
        if (localView.getVisibility() != 8)
        {
          ari localari2 = (ari)this.b.a.get(paramInt1);
          localPhotoTileView2 = (PhotoTileView)localView;
          localPhotoTileView2.e(65536);
          localPhotoTileView2.a(localari2.c);
          localInteger = localari2.f;
          if (localInteger != null) {
            break label623;
          }
          i8 = 0;
          if (i8 <= 0) {
            break label633;
          }
          localPhotoTileView2.b(Integer.valueOf(i8));
          localPhotoTileView2.a(localari2.e);
          if (((0x0 & localari2.h) == 0L) && (((0x20000000 & localari2.h) == 0L) || ((0x4000 & localari2.g) == 0L))) {
            break label642;
          }
          bool2 = true;
          localjpu = (jpu)this.f.b.a(new jpy(localari2.d.c), new jpw(localari2.c));
          if (localjpu == null) {
            localjpu = new jpu(localari2.d.a, localari2.d.c, localari2.c, localari2.g, localari2.h);
          }
          if ((0x100 & localari2.g) == 0L) {
            break label648;
          }
          bool3 = true;
          ipf localipf = localari2.c;
          if (localjpu.a != null) {
            break label654;
          }
          localObject = null;
          label418:
          localPhotoTileView2.a(localipf, (ioy)localObject, true);
          localPhotoTileView2.a(localjpu);
          localPhotoTileView2.d = bool3;
          localPhotoTileView2.H = bool2;
          localPhotoTileView2.invalidate();
          localPhotoTileView2.setOnLongClickListener(this.e.a());
          localPhotoTileView2.setOnClickListener(new arb(this, localari2));
          cyr localcyr = this.e.b();
          if (localcyr != null)
          {
            localPhotoTileView2.e = 1;
            localPhotoTileView2.invalidate();
            localcyr.a(localPhotoTileView2, localari2.c);
          }
          if (this.e.c() != null) {
            this.e.c().a(localari2.c, localPhotoTileView2);
          }
          long l = localari2.j;
          if (l > 0L)
          {
            String str = DateUtils.formatDateTime(this.c, l, 20);
            localView.setContentDescription(localView.getResources().getString(aau.mT, new Object[] { str }));
          }
        }
        paramView = localView;
      }
      label610:
      label616:
      label623:
      label633:
      boolean bool1;
      label642:
      label648:
      label654:
      int j;
      do
      {
        return paramView;
        i6 = 0;
        break;
        i9 = 0;
        break label111;
        i7 = 8;
        break label152;
        i8 = localInteger.intValue();
        break label226;
        localPhotoTileView2.b(null);
        break label241;
        bool2 = false;
        break label296;
        bool3 = false;
        break label400;
        localObject = new jpt(localjpu.a);
        break label418;
        if (paramInt1 != -1 + (-1 + (2 + this.d.a))) {
          break label1066;
        }
        if (paramView == null)
        {
          paramView = this.g.inflate(efj.sT, paramViewGroup, false);
          ViewGroup.LayoutParams localLayoutParams2 = new ViewGroup.LayoutParams(paramInt2, paramInt2);
          paramView.setLayoutParams(localLayoutParams2);
        }
        bool1 = this.b.b();
        if (!bool1) {
          break label1040;
        }
        j = 0;
        paramView.setVisibility(j);
      } while (!bool1);
      int k = aaw.fo;
      PhotoTileView localPhotoTileView1 = (PhotoTileView)paramView.findViewById(k);
      localPhotoTileView1.setVisibility(0);
      localPhotoTileView1.a(true);
      Context localContext = this.c;
      int m = aau.kZ;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.c.b;
      localPhotoTileView1.setContentDescription(localContext.getString(m, arrayOfObject));
      arj localarj = this.b;
      int n = -1 + this.d.a;
      ari localari1;
      int i5;
      label906:
      label911:
      TextView localTextView;
      if (localarj.a != null)
      {
        localari1 = (ari)localarj.a.get(-1 + localarj.a.size());
        if (-1 + localarj.a.size() != n)
        {
          if (101 == localari1.i)
          {
            i5 = 1;
            if (i5 == 0) {
              break label1053;
            }
          }
        }
        else
        {
          if (localari1 != null) {
            localPhotoTileView1.a(localari1.c);
          }
          ara localara = new ara(this);
          paramView.setOnClickListener(localara);
          isq localisq = this.f.b;
          int i1 = aaw.jC;
          localTextView = (TextView)paramView.findViewById(i1);
          int i2 = 0;
          if (localisq != null)
          {
            int i4 = a(this.b, localisq);
            i2 = localisq.a(new jpy(this.b.c.c)) - i4;
            localTextView.setText(String.valueOf(i2));
          }
          if (i2 <= 0) {
            break label1059;
          }
        }
      }
      label1040:
      label1053:
      label1059:
      for (int i3 = 0;; i3 = 8)
      {
        localTextView.setVisibility(i3);
        return paramView;
        j = 8;
        break;
        i5 = 0;
        break label906;
        localari1 = null;
        break label911;
      }
      label1066:
      if (paramInt1 == -1 + (2 + this.d.a))
      {
        if (paramView == null)
        {
          paramView = this.g.inflate(efj.uu, paramViewGroup, false);
          ViewGroup.LayoutParams localLayoutParams1 = new ViewGroup.LayoutParams(paramInt2, paramInt2);
          paramView.setLayoutParams(localLayoutParams1);
        }
        if (this.b.b.b) {}
        for (int i = 0;; i = 8)
        {
          paramView.setVisibility(i);
          return paramView;
        }
      }
      throw new IllegalStateException("Unhandled collection list photo row child");
      label1158:
      localView = paramView;
    }
  }
  
  public final List<ari> a(long paramLong)
  {
    if (this.b.a == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = this.b.a.size();
    if ((this.b.a()) || ((i == this.d.a) && (this.b.b.a))) {}
    for (int j = i - 1;; j = i) {
      for (int k = 0; k < j; k++)
      {
        ari localari = (ari)this.b.a.get(k);
        if ((0x20000000 & localari.h) != 0L) {
          localArrayList.add(localari);
        }
      }
    }
    return localArrayList;
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqz
 * JD-Core Version:    0.7.0.1
 */