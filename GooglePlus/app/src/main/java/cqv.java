import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView.RecyclerListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.ReadNotificationListView;
import com.google.android.apps.plus.views.UnreadNotificationListView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class cqv
  extends mca
  implements AbsListView.RecyclerListener, AdapterView.OnItemClickListener, cw<Cursor>, dcc, ddl, dzc, gpq, gxs, jag, lvw, lvy
{
  final lvz Z = new lvz(this, this.bp);
  UnreadNotificationListView a;
  git aa;
  gpl ab;
  ConcurrentHashMap<brl, Integer> ac = new ConcurrentHashMap();
  boolean ad;
  private cre ae;
  private crf af;
  private cqm ag;
  private idy ah;
  private int ai;
  private long aj;
  private boolean ak;
  private boolean al;
  private dme am = new cqw(this);
  ReadNotificationListView b;
  cqm c;
  dzc d;
  
  public cqv()
  {
    new gpk(this, this.bp, this);
  }
  
  private void D()
  {
    this.b.a();
    this.b.setVisibility(8);
    this.a.setVisibility(0);
    UnreadNotificationListView localUnreadNotificationListView = this.a;
    localUnreadNotificationListView.clearAnimation();
    if (Build.VERSION.SDK_INT >= 11)
    {
      lwo.h(localUnreadNotificationListView);
      localUnreadNotificationListView.setTranslationY(0.0F);
      localUnreadNotificationListView.setAlpha(1.0F);
    }
    this.ad = false;
  }
  
  private final void g(boolean paramBoolean)
  {
    if (!a(brl.e))
    {
      if (paramBoolean)
      {
        cqm localcqm = this.ag;
        localcqm.e = false;
        localcqm.f = false;
      }
      brl localbrl = brl.e;
      Integer localInteger = EsService.a(f(), this.aa.c(), 1, 4, null, paramBoolean);
      if (localInteger != null) {
        this.ac.put(localbrl, localInteger);
      }
    }
    for (int i = 1;; i = 0)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
      if (i != 0)
      {
        lvz locallvz = this.Z;
        if (locallvz.a != null)
        {
          localSwipeRefreshLayoutWithUpScroll = locallvz.a;
          if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
            break label124;
          }
          localSwipeRefreshLayoutWithUpScroll.a(false);
        }
      }
      for (;;)
      {
        this.ae.al_();
        return;
        label124:
        if (localSwipeRefreshLayoutWithUpScroll.m != null)
        {
          if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
            localSwipeRefreshLayoutWithUpScroll.a(true);
          }
          if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
          {
            Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
            long l = localSwipeRefreshLayoutWithUpScroll.o;
            efj.m().postDelayed(localRunnable, l);
          }
        }
      }
    }
  }
  
  public final void A()
  {
    gxz localgxz = gxz.a(true, true, false);
    int i = this.aa.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = localgxz;
    localgxx.a(localgxw);
    this.ad = false;
  }
  
  public final void A_()
  {
    if (i())
    {
      this.Z.b();
      g(true);
    }
  }
  
  public final int B()
  {
    return this.ai;
  }
  
  public final boolean C()
  {
    return (a(brl.e)) || (a(brl.a)) || (a(brl.c)) || (a(brl.b)) || (a(brl.b));
  }
  
  public final boolean O_()
  {
    return a(brl.e);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.uQ, paramViewGroup, false);
    this.a = ((UnreadNotificationListView)localView.findViewById(aaw.mf));
    this.b = ((ReadNotificationListView)localView.findViewById(aaw.ip));
    this.b.b = this.d;
    this.a.setRecyclerListener(this);
    this.b.setRecyclerListener(this);
    this.Z.a(new gxq(pjt.e));
    cqx localcqx = new cqx(this);
    this.a.setOnScrollListener(localcqx);
    this.b.setOnScrollListener(localcqx);
    Resources localResources = g();
    if (Build.VERSION.SDK_INT < 11)
    {
      int i = localResources.getColor(efj.jG);
      this.a.setCacheColorHint(i);
      this.b.setCacheColorHint(i);
    }
    this.af = new crf(f(), this.a, this);
    this.ag = new cqm(f(), this, this.af.g, this, 1);
    this.c = new cqm(f(), this, null, this, 2);
    this.a.setVisibility(0);
    if (this.ad) {
      this.b.setVisibility(0);
    }
    this.a.setAdapter(this.ag);
    this.a.setOnItemClickListener(this);
    this.af.a = this.ag;
    this.b.setAdapter(this.c);
    this.b.setOnItemClickListener(this);
    this.b.a = this.a;
    byte[] arrayOfByte1;
    if (paramBundle != null)
    {
      if (paramBundle.getBoolean("read_notification_bar_visible"))
      {
        this.b.setVisibility(0);
        this.ad = true;
      }
      if (paramBundle.getBoolean("low_pri_read_expanded")) {
        this.c.e = true;
      }
      if (paramBundle.getBoolean("low_pri_read_expanded_ever")) {
        this.c.f = true;
      }
      if (paramBundle.getBoolean("low_pri_unread_expanded")) {
        this.ag.e = true;
      }
      if (paramBundle.getBoolean("low_pri_unread_expanded_ever")) {
        this.ag.f = true;
      }
      arrayOfByte1 = paramBundle.getByteArray("low_pri_read_summary");
      if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {}
    }
    try
    {
      this.c.j = ((noj)qat.b(new noj(), arrayOfByte1, 0, arrayOfByte1.length));
      arrayOfByte2 = paramBundle.getByteArray("low_pri_unread_summary");
      if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {}
    }
    catch (qas localqas2)
    {
      try
      {
        byte[] arrayOfByte2;
        this.ag.j = ((noj)qat.b(new noj(), arrayOfByte2, 0, arrayOfByte2.length));
        bp localbp = f();
        if ((localbp instanceof iww))
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
          localLayoutParams.topMargin = ((int)(localLayoutParams.topMargin + efj.y(localbp)));
          ((iww)localbp).a("notifications_legacy", 0L);
        }
        return localView;
        localqas2 = localqas2;
        Log.e("NotificationFragmentLeg", "Failed to deserialize the low-pri read notification summary", localqas2);
      }
      catch (qas localqas1)
      {
        for (;;)
        {
          Log.e("NotificationFragmentLeg", "Failed to deserialize the low-pri unread notification summary", localqas1);
        }
      }
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new hqj(f(), EsProvider.a(EsProvider.c(this.bn), this.aa.c()), crd.a, null, null, null);
    case 2: 
      return new cql(this.bn, this.aa.c());
    }
    return new cql(this.bn, this.aa.c(), 1, 4);
  }
  
  public final void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    if (!i()) {}
    do
    {
      return;
      if (paramInt2 == 4)
      {
        if (paramInt1 == 2)
        {
          bp localbp2 = f();
          this.b.setSelection(0);
          TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(0.0F, 0.0F, 0.0F, this.a.getHeight() - this.bn.getResources().getDimensionPixelSize(efj.mz));
          localTranslateAnimation2.setInterpolator(localbp2, efj.iC);
          localTranslateAnimation2.setDuration(250L);
          localTranslateAnimation2.setFillAfter(true);
          localTranslateAnimation2.setAnimationListener(new cra(this));
          this.b.startAnimation(localTranslateAnimation2);
          AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
          localAlphaAnimation2.setInterpolator(localbp2, efj.iC);
          localAlphaAnimation2.setDuration(250L);
          localAlphaAnimation2.setFillAfter(true);
          localAlphaAnimation2.setAnimationListener(new crb(this));
          this.a.clearAnimation();
          this.a.startAnimation(localAlphaAnimation2);
          return;
        }
        cqy localcqy = new cqy(this);
        bp localbp1 = f();
        TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(0.0F, 0.0F, this.a.getHeight() - this.bn.getResources().getDimensionPixelSize(efj.mz), 0.0F);
        localTranslateAnimation1.setInterpolator(localbp1, efj.iC);
        localTranslateAnimation1.setDuration(250L);
        localTranslateAnimation1.setFillAfter(true);
        localTranslateAnimation1.setAnimationListener(new cqz(this, localcqy));
        this.b.a();
        this.b.startAnimation(localTranslateAnimation1);
        AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
        localAlphaAnimation1.setInterpolator(localbp1, efj.iC);
        localAlphaAnimation1.setDuration(250L);
        localAlphaAnimation1.setFillAfter(true);
        this.a.clearAnimation();
        this.a.startAnimation(localAlphaAnimation1);
        return;
      }
    } while (paramInt2 != 2);
    brl localbrl1 = brl.f;
    if (paramInt1 == 2) {}
    for (brl localbrl2 = brl.h;; localbrl2 = localbrl1)
    {
      Integer localInteger = EsService.a(this.bn, this.aa.c(), paramInt1, 2, paramArrayOfByte, false);
      if (localInteger != null) {
        this.ac.put(localbrl2, localInteger);
      }
      x();
      return;
    }
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    Iterator localIterator = this.ac.entrySet().iterator();
    label226:
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Integer localInteger = (Integer)localEntry.getValue();
      if (localInteger == null) {}
      for (int i = 0; i == paramInt; i = localInteger.intValue())
      {
        brl localbrl = (brl)localEntry.getKey();
        ((Integer)this.ac.remove(localbrl));
        switch (crc.a[localbrl.ordinal()])
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
          x();
          break;
        }
      }
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int k = 1; k != 0; k = 0)
        {
          this.c.c();
          break;
        }
        if (paramdmx != null)
        {
          if (paramdmx.c != 200) {}
          for (int j = 1;; j = 0)
          {
            if (j == 0) {
              break label226;
            }
            this.ag.c();
            break;
          }
        }
      }
    }
    lvz locallvz = this.Z;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label273;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    for (;;)
    {
      this.ae.al_();
      return;
      label273:
      if (localSwipeRefreshLayoutWithUpScroll.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
          long l = localSwipeRefreshLayoutWithUpScroll.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    try
    {
      this.ae = ((cre)paramActivity);
      this.d = this;
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(String.valueOf(paramActivity.toString()).concat(" must implement all appropriate Listeners"));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (f().isFinishing()) {
      return;
    }
    if (paramBundle != null)
    {
      for (brl localbrl : brl.values()) {
        if (paramBundle.containsKey(localbrl.name()))
        {
          Integer localInteger = Integer.valueOf(paramBundle.getInt(localbrl.name()));
          if (localInteger != null) {
            this.ac.put(localbrl, localInteger);
          }
        }
      }
      this.ai = paramBundle.getInt("new_notifications_count");
      this.aj = paramBundle.getLong("last_viewed_notification_version");
      this.ak = paramBundle.getBoolean("is_active");
      this.ad = paramBundle.getBoolean("is_showing_read");
    }
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    int i = this.aa.c();
    if ((System.currentTimeMillis() - ((Long)dmr.a.get(i, Long.valueOf(0L))).longValue() > ((hyi)this.bo.a(hyi.class)).c(bwb.j, i).longValue()) && (!localgzj.a(dmr.a(i)))) {
      localgzj.b(new bnc(this.bn, dmr.a(i), i));
    }
    if (((jaa)mbb.a(this.bn, jaa.class)).b(i) == jak.f) {
      localgzj.b(new bom(this.bn, i));
    }
    cv localcv = k();
    localcv.a(0, null, this);
    localcv.a(1, null, this);
    localcv.a(2, null, this);
    this.ah = new idy(f(), this.bp, "android_nots_gmh");
    EsService.b(this.bn, this.aa.c());
    EsService.d(this.bn, this.aa.c());
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    this.ah.a(paramgpr);
    if ((!this.ad) && (this.ag.c > 0)) {
      paramgpr.b(aaw.gA);
    }
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(aau.uU);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.Z.a(paramBoolean);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    mbf localmbf = this.bn;
    int i = this.aa.c();
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 211);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("read_state", paramInt1);
    localIntent.putExtra("high_priority", paramInt2);
    localIntent.putExtra("next_fetch_param", paramArrayOfByte);
    int j = Integer.valueOf(EsService.a(localmbf, localIntent)).intValue();
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (paramInt1 == 2) {
      if (paramInt2 == 4)
      {
        brl localbrl4 = brl.c;
        Integer localInteger4 = Integer.valueOf(j);
        if (localInteger4 != null) {
          this.ac.put(localbrl4, localInteger4);
        }
        lvz locallvz = this.Z;
        if (locallvz.a != null)
        {
          localSwipeRefreshLayoutWithUpScroll = locallvz.a;
          if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
            break label282;
          }
          localSwipeRefreshLayoutWithUpScroll.a(false);
        }
      }
    }
    for (;;)
    {
      this.ae.al_();
      return;
      brl localbrl3 = brl.d;
      Integer localInteger3 = Integer.valueOf(j);
      if (localInteger3 == null) {
        break;
      }
      this.ac.put(localbrl3, localInteger3);
      break;
      if (paramInt2 == 4)
      {
        brl localbrl2 = brl.a;
        Integer localInteger2 = Integer.valueOf(j);
        if (localInteger2 == null) {
          break;
        }
        this.ac.put(localbrl2, localInteger2);
        break;
      }
      brl localbrl1 = brl.b;
      Integer localInteger1 = Integer.valueOf(j);
      if (localInteger1 == null) {
        break;
      }
      this.ac.put(localbrl1, localInteger1);
      break;
      label282:
      if (localSwipeRefreshLayoutWithUpScroll.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
          long l = localSwipeRefreshLayoutWithUpScroll.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.gA)
    {
      z();
      return true;
    }
    if ((i == aaw.ec) || (i == aaw.dA))
    {
      this.ah.a(paramMenuItem);
      return true;
    }
    return false;
  }
  
  final boolean a(brl parambrl)
  {
    return (this.ac.containsKey(parambrl)) && (this.ac.get(parambrl) != null);
  }
  
  public final void b(tp paramtp) {}
  
  public final void b(boolean paramBoolean)
  {
    this.ak = paramBoolean;
    if (paramBoolean)
    {
      g(false);
      return;
    }
    long l = this.ag.d;
    if (l > this.aj)
    {
      mbf localmbf = this.bn;
      int i = this.aa.c();
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 210);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("last_version", l);
      Integer.valueOf(EsService.a(localmbf, localIntent));
    }
    D();
    cqm localcqm1 = this.c;
    localcqm1.e = false;
    localcqm1.e();
    cqm localcqm2 = this.ag;
    localcqm2.e = false;
    localcqm2.e();
  }
  
  public final void b_(View paramView)
  {
    crf localcrf = this.af;
    View localView1 = crf.a(paramView);
    if (localView1 != null)
    {
      HashMap localHashMap = new HashMap();
      ListView localListView = (ListView)localcrf.c;
      int i = localListView.getFirstVisiblePosition();
      for (int j = 0; j < localcrf.c.getChildCount(); j++)
      {
        View localView2 = localcrf.c.getChildAt(j);
        int m = i + j;
        Long localLong = Long.valueOf(localcrf.a.getItemId(m));
        if (localView2 != localView1) {
          localHashMap.put(localLong, Float.valueOf(crf.c(localView2)));
        }
      }
      if (crf.a(localcrf.c, localView1))
      {
        int k = localListView.getPositionForView(localView1);
        if ((localcrf.a instanceof cqm))
        {
          localcrf.a.a(k);
          String str = paramView.getResources().getString(aau.lS);
          if (Build.VERSION.SDK_INT >= 16) {
            paramView.announceForAccessibility(str);
          }
          localcrf.a(localListView, localHashMap, false);
        }
      }
      localcrf.e = false;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aa = ((git)this.bo.a(git.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    Iterator localIterator = this.ac.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramBundle.putInt(((brl)localEntry.getKey()).name(), ((Integer)localEntry.getValue()).intValue());
    }
    paramBundle.putInt("new_notifications_count", this.ai);
    paramBundle.putLong("last_viewed_notification_version", this.aj);
    paramBundle.putBoolean("is_active", this.ak);
    paramBundle.putBoolean("is_showing_read", this.ad);
    if (this.b.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.putBoolean("read_notification_bar_visible", bool);
      paramBundle.putBoolean("low_pri_read_expanded", this.c.e);
      paramBundle.putBoolean("low_pri_read_expanded_ever", this.c.f);
      paramBundle.putBoolean("low_pri_unread_expanded", this.ag.e);
      paramBundle.putBoolean("low_pri_unread_expanded_ever", this.ag.f);
      noj localnoj1 = this.c.j;
      if (localnoj1 != null) {
        paramBundle.putByteArray("low_pri_read_summary", qat.a(localnoj1));
      }
      noj localnoj2 = this.ag.j;
      if (localnoj2 != null) {
        paramBundle.putByteArray("low_pri_unread_summary", qat.a(localnoj2));
      }
      return;
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.am);
    this.ab = ((gpl)mbb.a(this.bn, gpl.class));
    this.ab.c(this);
    Iterator localIterator = this.ac.values().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (localInteger != null)
      {
        int i = localInteger.intValue();
        if (!EsService.b.containsKey(Integer.valueOf(i))) {
          a(localInteger.intValue(), EsService.a(localInteger.intValue()));
        }
      }
    }
    lvz locallvz = this.Z;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label191;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    for (;;)
    {
      if (this.ak)
      {
        this.al = true;
        crg localcrg = new crg(this.af);
        efj.m().postDelayed(localcrg, 500L);
      }
      return;
      label191:
      if (localSwipeRefreshLayoutWithUpScroll.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
          long l = localSwipeRefreshLayoutWithUpScroll.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  public final void n()
  {
    super.n();
    EsService.a(this.bn, this.aa.c());
    EsService.d(this.bn, this.aa.c());
    dme localdme = this.am;
    EsService.d.remove(localdme);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramAdapterView == this.a) {
      this.ag.a(this.bn, this.aa.c(), paramInt);
    }
    while (paramAdapterView != this.b) {
      return;
    }
    this.c.a(this.bn, this.aa.c(), paramInt);
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    lwo.f(paramView);
  }
  
  public final void q_()
  {
    this.ab.d(this);
    super.q_();
  }
  
  public final gxq v()
  {
    return new gxq(pjt.c);
  }
  
  final void x()
  {
    cqm localcqm1 = this.c;
    boolean bool1 = a(brl.g);
    boolean bool2 = a(brl.h);
    localcqm1.g = bool1;
    localcqm1.h = bool2;
    localcqm1.notifyDataSetChanged();
    cqm localcqm2 = this.ag;
    boolean bool3 = a(brl.e);
    boolean bool4 = a(brl.f);
    localcqm2.g = bool3;
    localcqm2.h = bool4;
    localcqm2.notifyDataSetChanged();
  }
  
  public final void y()
  {
    g(true);
    D();
    this.b.setSelection(0);
    this.a.setSelection(0);
  }
  
  public final void z()
  {
    bmz localbmz = new bmz(this.bn, this.aa.c());
    gzj.a(f(), localbmz);
    this.a.setSelection(0);
    this.b.setSelection(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqv
 * JD-Core Version:    0.7.0.1
 */