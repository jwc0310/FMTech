import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class dej
  extends hqf
{
  public int a;
  public int b;
  final AtomicBoolean c = new AtomicBoolean(false);
  public int d;
  public String e;
  public String f;
  public hqr g;
  int h;
  public boolean i;
  public boolean j;
  public View.OnClickListener k;
  public View.OnLongClickListener l;
  private final LayoutInflater m;
  private final int n;
  private String o;
  private hqr p;
  private final aud q;
  
  public dej(Context paramContext, int paramInt)
  {
    super(paramContext, (byte)0);
    for (int i1 = 0; i1 < 4; i1++)
    {
      hqg localhqg = new hqg(false, false);
      if (this.aO >= this.aN.length)
      {
        hqg[] arrayOfhqg2 = new hqg[2 + this.aO];
        System.arraycopy(this.aN, 0, arrayOfhqg2, 0, this.aO);
        this.aN = arrayOfhqg2;
      }
      hqg[] arrayOfhqg1 = this.aN;
      int i2 = this.aO;
      this.aO = (i2 + 1);
      arrayOfhqg1[i2] = localhqg;
      this.aP = false;
      notifyDataSetChanged();
    }
    this.q = ((aud)mbb.a(paramContext, aud.class));
    this.n = paramInt;
    this.h = new jrh(paramContext).a;
    this.a = aau.nS;
    this.b = aau.nT;
    this.m = LayoutInflater.from(paramContext);
  }
  
  private final void a(View paramView, Cursor paramCursor)
  {
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
    Context localContext = paramView.getContext();
    long l1 = paramCursor.getLong(15);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(7);
    ipm localipm1 = jrf.a(l1);
    ipf localipf;
    int i1;
    label104:
    label125:
    Integer localInteger;
    label139:
    label151:
    String str3;
    String str5;
    label187:
    long l2;
    long l3;
    boolean bool1;
    label221:
    jpu localjpu1;
    if ((l1 & 0x40000) != 0L)
    {
      String str7 = paramCursor.getString(20);
      localipf = ipf.a(localContext, Uri.parse(str2), localipm1, str7);
      localPhotoTileView.a(localipf);
      if (!paramCursor.isNull(10)) {
        break label504;
      }
      i1 = 0;
      if ((this.j) || (i1 <= 0)) {
        break label517;
      }
      localPhotoTileView.b(Integer.valueOf(i1));
      if (!paramCursor.isNull(11)) {
        break label525;
      }
      localInteger = null;
      if (!this.j) {
        break label541;
      }
      localPhotoTileView.a(null);
      str3 = paramCursor.getString(1);
      String str4 = paramCursor.getString(3);
      if ((str4 == null) || (!jrf.m(str4))) {
        break label550;
      }
      str5 = jrf.b();
      l2 = paramCursor.getLong(15);
      l3 = paramCursor.getLong(14);
      if ((0x20000000 & l3) == 0L) {
        break label559;
      }
      bool1 = true;
      isq localisq = this.q.b;
      localjpu1 = null;
      if (localisq != null) {
        localjpu1 = (jpu)localisq.a(new jpy(str5), new jpw(localipf));
      }
      if (localjpu1 != null) {
        break label676;
      }
    }
    label517:
    label525:
    label541:
    label676:
    for (jpu localjpu2 = new jpu(str5, str5, localipf, l2, l3);; localjpu2 = localjpu1)
    {
      boolean bool2;
      label304:
      long l4;
      int i2;
      label346:
      ipm localipm2;
      int i3;
      label371:
      Resources localResources;
      if ((0x100 & l2) != 0L)
      {
        bool2 = true;
        localPhotoTileView.a(localjpu2);
        localPhotoTileView.H = bool1;
        localPhotoTileView.invalidate();
        localPhotoTileView.d = bool2;
        l4 = paramCursor.getLong(16);
        if (l4 <= 0L) {
          break label571;
        }
        i2 = 1;
        localipm2 = localipf.e;
        if (localipm2 != ipm.b) {
          break label585;
        }
        if (i2 == 0) {
          break label577;
        }
        i3 = aau.vv;
        localResources = this.aM.getResources();
        if (i2 == 0) {
          break label664;
        }
      }
      for (String str6 = localResources.getString(i3, new Object[] { DateUtils.formatDateTime(this.aM, l4, 20) });; str6 = localResources.getString(i3))
      {
        localPhotoTileView.setContentDescription(str6);
        localjpu2.f = str6;
        paramView.setTag(aaw.ln, str3);
        paramView.setTag(aaw.lo, Integer.valueOf(3));
        paramView.setTag(aaw.la, Long.valueOf(l2));
        paramView.setTag(aaw.kX, paramCursor.getString(3));
        paramView.setOnClickListener(this.k);
        paramView.setOnLongClickListener(this.l);
        return;
        localipf = ipf.a(localContext, str1, str2, localipm1);
        break;
        label504:
        i1 = paramCursor.getInt(10);
        break label104;
        localPhotoTileView.b(null);
        break label125;
        localInteger = Integer.valueOf(paramCursor.getInt(11));
        break label139;
        localPhotoTileView.a(localInteger);
        break label151;
        label550:
        str5 = this.f;
        break label187;
        label559:
        bool1 = false;
        break label221;
        bool2 = false;
        break label304;
        label571:
        i2 = 0;
        break label346;
        label577:
        i3 = aau.vu;
        break label371;
        label585:
        if (localipm2 == ipm.d)
        {
          if (i2 != 0)
          {
            i3 = aau.iG;
            break label371;
          }
          i3 = aau.iF;
          break label371;
        }
        if (localipm2 == ipm.c)
        {
          if (i2 != 0)
          {
            i3 = aau.mr;
            break label371;
          }
          i3 = aau.mq;
          break label371;
        }
        if (i2 != 0)
        {
          i3 = aau.mT;
          break label371;
        }
        i3 = aau.mS;
        break label371;
      }
    }
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    do
    {
      return -1;
      return 0;
      return 1;
      return 2;
    } while (paramInt2 == super.getCount());
    return 3;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
    case 2: 
      LinearLayout localLinearLayout = (LinearLayout)this.m.inflate(efj.tj, paramViewGroup, false);
      localLinearLayout.findViewById(aaw.jO).setVisibility(8);
      localLinearLayout.findViewById(aaw.hs).setVisibility(8);
      localLinearLayout.setLayoutParams(new lyc(2, -2, this.h, 1));
      return localLinearLayout;
    case 1: 
      return a(paramContext, paramViewGroup);
    }
    if (paramInt2 == super.getCount()) {
      return this.m.inflate(efj.uu, paramViewGroup, false);
    }
    return this.m.inflate(efj.vS, paramViewGroup, false);
  }
  
  protected View a(Context paramContext, ViewGroup paramViewGroup)
  {
    return this.m.inflate(efj.vS, paramViewGroup, false);
  }
  
  public final void a(Cursor paramCursor)
  {
    Bundle localBundle;
    if (paramCursor == null)
    {
      localBundle = Bundle.EMPTY;
      this.o = localBundle.getString("resume_token");
      a(3, paramCursor);
      if ((this.i) && (paramCursor != null) && (paramCursor.getCount() != 0)) {
        break label70;
      }
      this.p = null;
    }
    for (;;)
    {
      a(2, this.p);
      return;
      localBundle = paramCursor.getExtras();
      break;
      label70:
      if (this.p == null)
      {
        this.p = new hqr(new String[0]);
        Object[] arrayOfObject = new Object[0];
        this.p.a(arrayOfObject);
      }
    }
  }
  
  protected void a(Cursor paramCursor, View paramView)
  {
    a(paramView, paramCursor);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    }
    do
    {
      return;
      TextView localTextView = (TextView)paramView.findViewById(aaw.bA);
      if (paramInt1 == 0)
      {
        localTextView.setText(this.a);
        return;
      }
      localTextView.setText(this.b);
      return;
      a(paramCursor, paramView);
      return;
    } while (paramInt2 >= super.e_(3));
    dek localdek;
    if ((this.o != null) && (super.e_(3) - paramInt2 < 100) && (this.c.compareAndSet(false, true)))
    {
      localdek = new dek(this.aM, this.n, this, this.e, this.d, this.f);
      if (Build.VERSION.SDK_INT >= 11) {
        break label185;
      }
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.o;
      localdek.execute(arrayOfString2);
    }
    for (;;)
    {
      a(paramView, paramCursor);
      return;
      label185:
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.o;
      localdek.executeOnExecutor(localExecutor, arrayOfString1);
    }
  }
  
  public final int e_(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    }
    do
    {
      Cursor localCursor;
      do
      {
        hqr localhqr1;
        do
        {
          hqr localhqr2;
          do
          {
            return i1;
            localhqr2 = this.g;
            i1 = 0;
          } while (localhqr2 == null);
          return this.g.getCount();
          return super.e_(paramInt);
          localhqr1 = this.p;
          i1 = 0;
        } while (localhqr1 == null);
        return this.p.getCount();
        localCursor = this.aN[paramInt].c;
        i1 = 0;
      } while (localCursor == null);
      i1 = super.e_(paramInt);
    } while (this.o == null);
    return i1 + 1;
  }
  
  public int getViewTypeCount()
  {
    return 4;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dej
 * JD-Core Version:    0.7.0.1
 */