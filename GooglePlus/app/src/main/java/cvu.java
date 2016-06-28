import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.plus.notifications.ui.GunsListView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.media.ui.RoundedMediaView;
import com.google.android.libraries.social.ui.views.avatargroupview.AvatarGroupView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

final class cvu
  extends ArrayAdapter<jdt>
  implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener, lvw
{
  final View.OnClickListener a = new cvv(this);
  boolean b;
  ArrayList<cvy> c;
  cvz d;
  GunsListView e;
  private final View.OnClickListener f = new cvw(this);
  private final View.OnClickListener g = new cvx(this);
  private lvz h;
  private Context i;
  
  public cvu(Context paramContext, GunsListView paramGunsListView, lvz paramlvz)
  {
    super(paramContext, efj.Ao);
    this.i = paramContext;
    this.c = new ArrayList();
    this.b = false;
    this.e = paramGunsListView;
    this.d = new cvz(paramContext, paramGunsListView, this);
    this.h = paramlvz;
  }
  
  private static String a(String paramString)
  {
    String str1;
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("//")))
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {
        break label39;
      }
    }
    label39:
    for (String str2 = "https:".concat(str1);; str2 = new String("https:"))
    {
      paramString = str2;
      return paramString;
    }
  }
  
  static boolean a(View paramView1, View paramView2)
  {
    if ((paramView1 == null) || (paramView2 == null)) {
      return false;
    }
    for (;;)
    {
      View localView;
      paramView2 = localView;
      try
      {
        if (!paramView1.equals(paramView2))
        {
          localView = (View)paramView2.getParent();
          if (localView != null) {
            continue;
          }
          return false;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        return false;
      }
    }
    return true;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.h.a(paramBoolean);
  }
  
  public final void b_(View paramView)
  {
    cvz localcvz = this.d;
    if (paramView != null)
    {
      View localView = (View)paramView.getParent();
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = localView.getHeight();
      arrayOfInt[1] = 0;
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(arrayOfInt);
      localValueAnimator.setDuration(250L);
      localValueAnimator.addUpdateListener(new cwa(localcvz, localView));
      localValueAnimator.addListener(new cwb(localcvz, localView));
      localValueAnimator.start();
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    jdt localjdt;
    mkt localmkt;
    boolean bool;
    label52:
    int j;
    label127:
    int m;
    label277:
    AvatarGroupView localAvatarGroupView;
    RoundedMediaView localRoundedMediaView;
    mkr[] arrayOfmkr;
    int n;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(getContext()).inflate(efj.Ao, paramViewGroup, false);
      localjdt = (jdt)getItem(paramInt);
      localmkt = localjdt.c.a;
      if (localjdt.d != 2) {
        break label434;
      }
      bool = true;
      paramView.setTag(aau.wL, localjdt.a);
      TextView localTextView1 = (TextView)paramView.findViewById(aau.wK);
      localTextView1.setText(localmkt.c);
      TextView localTextView2 = (TextView)paramView.findViewById(aau.wJ);
      localTextView2.setText(localmkt.d);
      Resources localResources = getContext().getResources();
      if (!bool) {
        break label440;
      }
      j = aau.wr;
      int k = localResources.getColor(j);
      localTextView1.setTextColor(k);
      localTextView2.setTextColor(k);
      View localView = paramView.findViewById(aau.wz);
      localView.setTag(aau.wL, localjdt.a);
      ArrayList localArrayList1 = new ArrayList(1);
      localArrayList1.add(localjdt.a);
      ArrayList localArrayList2 = new ArrayList();
      if (localjdt.e != null) {
        localArrayList2.addAll(Arrays.asList(localjdt.e.a));
      }
      efj.a(localView, new kvh(pjt.b, localArrayList1, localArrayList2));
      lvp.d(localView);
      localView.setOnClickListener(this.g);
      localView.setOnTouchListener(null);
      if (!bool) {
        break label448;
      }
      m = efj.Al;
      localView.setBackgroundResource(m);
      localAvatarGroupView = (AvatarGroupView)paramView.findViewById(aau.wv);
      localRoundedMediaView = (RoundedMediaView)paramView.findViewById(aau.wC);
      localAvatarGroupView.setVisibility(8);
      localRoundedMediaView.setVisibility(8);
      arrayOfmkr = localmkt.b;
      paramView.setTag(aau.wM, Integer.valueOf(arrayOfmkr.length));
      if (arrayOfmkr.length <= 0) {
        break label594;
      }
      localAvatarGroupView.removeAllViews();
      n = arrayOfmkr.length;
      if (n != 1) {
        break label456;
      }
    }
    label434:
    label440:
    label448:
    label456:
    for (int i1 = 2;; i1 = 1)
    {
      for (int i2 = 0; i2 < n; i2++)
      {
        mkr localmkr = arrayOfmkr[i2];
        localAvatarGroupView.a(localmkr.b, localmkr.a, i1, bool, true);
      }
      paramView.getLayoutParams().height = ((int)this.i.getResources().getDimension(aau.wu));
      break;
      bool = false;
      break label52;
      j = aau.ws;
      break label127;
      m = efj.Am;
      break label277;
    }
    localAvatarGroupView.setVisibility(0);
    localAvatarGroupView.setTag(aau.wL, localjdt.a);
    localAvatarGroupView.setOnClickListener(this.f);
    for (;;)
    {
      MediaView localMediaView = (MediaView)paramView.findViewById(aau.wI);
      localMediaView.setVisibility(8);
      if ((localmkt.e.length > 0) && (localmkt.e[0].a != null))
      {
        String str2 = a(localmkt.e[0].a.a);
        if (URLUtil.isNetworkUrl(str2))
        {
          localMediaView.a(ipf.a(getContext(), str2, ipm.a));
          localMediaView.setVisibility(0);
          localMediaView.G = bool;
          localMediaView.invalidate();
        }
      }
      return paramView;
      label594:
      if (localmkt.a != null)
      {
        String str1 = a(localmkt.a.a);
        if (URLUtil.isNetworkUrl(str1))
        {
          localRoundedMediaView.a(ipf.a(getContext(), str1, ipm.a));
          localRoundedMediaView.setVisibility(0);
          localRoundedMediaView.G = bool;
          localRoundedMediaView.invalidate();
        }
      }
    }
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    int j = ((Integer)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag(aau.wM)).intValue();
    paramContextMenu.add(0, 1, 0, efj.As).setOnMenuItemClickListener(this);
    if (j > 0) {
      if (j != 1) {
        break label75;
      }
    }
    label75:
    for (int k = efj.Aq;; k = efj.Ar)
    {
      paramContextMenu.add(0, 2, 1, k).setOnMenuItemClickListener(this);
      return;
    }
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    switch (paramMenuItem.getItemId())
    {
    default: 
      return false;
    case 1: 
      String str = localAdapterContextMenuInfo.targetView.getTag(aau.wL).toString();
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((cvy)localIterator.next()).c(str);
      }
      return true;
    case 2: 
      this.f.onClick(localAdapterContextMenuInfo.targetView);
      return true;
    }
    this.a.onClick(localAdapterContextMenuInfo.targetView);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvu
 * JD-Core Version:    0.7.0.1
 */