import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class dfz
  extends hqf
  implements aip, eaj, lvh
{
  private static hqr a;
  private static kl<String, Integer> b;
  private static Interpolator c = new DecelerateInterpolator();
  public int aA = -1;
  public HashSet<String> aB = new HashSet();
  public HashSet<String> aC = new HashSet();
  public HashMap<String, ArrayList<String>> aD = new HashMap();
  ArrayList<dxu> aE = new ArrayList();
  ArrayList<lhw> aF = new ArrayList();
  final ArrayList<ocl> aG = new ArrayList();
  public boolean aH;
  public hn aI;
  public boolean aJ;
  public String aK;
  public boolean aL = true;
  public final int ar;
  final kq<String, djy> as;
  final HashSet<String> at;
  boolean au = false;
  public cyh av;
  public lvh aw;
  public int ax = -2147483648;
  public hfa ay;
  public ArrayList<String> az = new ArrayList();
  private dge d;
  private dat e;
  private lob f;
  private final Runnable g;
  private SparseIntArray h = new SparseIntArray();
  private HashSet<lpy> i = new HashSet();
  private HashSet<String> j = new HashSet();
  private HashMap<String, Object> k = new HashMap();
  private Map<String, List<String>> l = new HashMap();
  private hum m;
  private final HashSet<String> n = new HashSet();
  private boolean o;
  private View p;
  private int q;
  private int r;
  
  public dfz(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    super(paramContext);
    hqg localhqg1 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg6 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg6, 0, this.aO);
      this.aN = arrayOfhqg6;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i1 = this.aO;
    this.aO = (i1 + 1);
    arrayOfhqg1[i1] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg5 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg5, 0, this.aO);
      this.aN = arrayOfhqg5;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int i2 = this.aO;
    this.aO = (i2 + 1);
    arrayOfhqg2[i2] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg3 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg4 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg4, 0, this.aO);
      this.aN = arrayOfhqg4;
    }
    hqg[] arrayOfhqg3 = this.aN;
    int i3 = this.aO;
    this.aO = (i3 + 1);
    arrayOfhqg3[i3] = localhqg3;
    this.aP = false;
    notifyDataSetChanged();
    this.ar = paramInt;
    this.e = paramdat;
    this.d = paramdge;
    this.f = paramlob;
    this.as = new kq(256);
    this.at = new HashSet();
    this.g = new dga(this);
    this.o = true;
    this.aJ = true;
    this.av = paramcyh;
    this.ay = paramhfa;
    this.aK = null;
    this.p = null;
    this.m = ((hum)mbb.a(paramContext, hum.class));
    dgb localdgb = new dgb(this);
    paramStreamGridView.s.a = localdgb;
    this.r = paramContext.getResources().getDimensionPixelSize(efj.lU);
    this.q = paramContext.getResources().getDimensionPixelOffset(efj.nE);
  }
  
  private final int a(StreamGridView paramStreamGridView, int paramInt)
  {
    int i1 = this.h.get(paramInt, -1);
    int i2;
    if (i1 == -1)
    {
      i2 = paramStreamGridView.a.a;
      if ((paramStreamGridView.a.d != -1) && (paramStreamGridView.k != null)) {
        break label56;
      }
      i1 = i2;
    }
    for (;;)
    {
      this.h.put(paramInt, i1);
      return i1;
      label56:
      if (i2 != 1)
      {
        int i3 = 2147483647;
        for (int i4 = 0; i4 < i2; i4++) {
          if (paramStreamGridView.k[i4] < i3) {
            i3 = paramStreamGridView.k[i4];
          }
        }
        label199:
        for (int i5 = i2;; i5--)
        {
          if (i5 < 2) {
            break label205;
          }
          for (int i6 = 0;; i6++)
          {
            if (i6 > i2 - i5) {
              break label199;
            }
            int i7 = -2147483648;
            for (int i8 = i6; i8 < i6 + i5; i8++) {
              if (paramStreamGridView.k[i8] > i7) {
                i7 = paramStreamGridView.k[i8];
              }
            }
            if (i7 - i3 <= paramStreamGridView.a.d)
            {
              i1 = i5;
              break;
            }
          }
        }
      }
      label205:
      i1 = 1;
    }
  }
  
  private static String a(lll paramlll, int paramInt)
  {
    String str = (String)paramlll.a();
    return 12 + String.valueOf(str).length() + str + ":" + paramInt;
  }
  
  private final void a(View paramView, Cursor paramCursor, ViewGroup paramViewGroup, int paramInt)
  {
    int i1 = a((StreamGridView)paramViewGroup, paramInt);
    if ((paramView instanceof eab)) {
      a((eab)paramView);
    }
    lpi locallpi = (lpi)paramView;
    locallpi.a(paramCursor, this.ay, i1, 0);
    boolean bool;
    if ((this.o) && (this.aH))
    {
      bool = true;
      locallpi.c(bool);
      if (!(paramView instanceof eab)) {
        break label313;
      }
      eab localeab = (eab)paramView;
      localeab.s = this.aB.contains(localeab.N);
      if (this.aC.contains(localeab.f)) {
        localeab.p = false;
      }
      llr localllr = localeab.y;
      if (localllr != null)
      {
        lmo locallmo = localllr.a;
        String str2 = localeab.N;
        if ((locallmo != null) && (localeab.m) && (!locallmo.a) && (!this.j.contains(str2)))
        {
          Context localContext = this.aM;
          int i4 = this.ar;
          Intent localIntent = EsService.e.a(localContext, EsService.class);
          localIntent.putExtra("op", 26);
          localIntent.putExtra("account_id", i4);
          localIntent.putExtra("aid", str2);
          Integer.valueOf(EsService.a(localContext, localIntent));
          this.j.add(str2);
        }
      }
    }
    for (;;)
    {
      lpt locallpt = new lpt(-2);
      locallpt.topMargin = this.q;
      locallpt.a = locallpi.K;
      locallpi.setLayoutParams(locallpt);
      locallpi.a(this.ay);
      return;
      bool = false;
      break;
      label313:
      if ((paramView instanceof loa))
      {
        loa localloa = (loa)paramView;
        Bundle localBundle = new Bundle();
        localBundle.putInt("extra_promo_group_id", 1);
        localBundle.putInt("extra_promo_type", lod.a(localloa.c));
        int i2 = this.ar;
        gxx localgxx = (gxx)mbb.a(this.aM, gxx.class);
        gxw localgxw = new gxw(this.aM, i2);
        localgxw.c = gxz.ab;
        if (localBundle != null) {
          localgxw.h.putAll(localBundle);
        }
        localgxx.a(localgxw);
        String str1 = paramCursor.getString(2);
        if ((paramView instanceof dxu))
        {
          dxu localdxu = (dxu)paramView;
          this.aE.add(localdxu);
          for (int i3 = 0; i3 < localdxu.getChildCount(); i3++)
          {
            View localView = localdxu.getChildAt(i3);
            if ((localView instanceof dzr))
            {
              dzr localdzr = (dzr)localView;
              if (this.l.containsKey(localdzr.d())) {
                localdzr.a((List)this.l.get(localdzr.d()));
              }
              if (lod.b(str1) == 2) {
                efj.f(localdzr);
              }
            }
          }
        }
        if ((paramView instanceof lhw))
        {
          lhw locallhw = (lhw)paramView;
          this.aF.add(locallhw);
        }
        if ((paramView instanceof lor)) {
          ((lor)paramView).j().a((ArrayList)this.aD.get(str1));
        }
      }
    }
  }
  
  private final kl<String, Integer> c()
  {
    if (b == null)
    {
      b = new kl();
      ArrayList localArrayList1 = ((lln)mbb.a(this.aM, lln.class)).a();
      int i1 = 0;
      int i4;
      for (int i2 = 2; i1 < localArrayList1.size(); i2 = i4)
      {
        lll locallll = (lll)localArrayList1.get(i1);
        ArrayList localArrayList2 = locallll.b();
        int i3 = 0;
        i4 = i2;
        while (i3 < localArrayList2.size())
        {
          String str = a(locallll, ((Integer)localArrayList2.get(i3)).intValue());
          b.put(str, Integer.valueOf(i4));
          i4++;
          i3++;
        }
        i1++;
      }
    }
    return b;
  }
  
  public static hqr x()
  {
    if (a == null)
    {
      hqr localhqr = new hqr(new String[] { "_id" });
      a = localhqr;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      localhqr.a(arrayOfObject);
    }
    return a;
  }
  
  public void I_()
  {
    int i1 = e_(1);
    if (i1 > 0)
    {
      this.ax = (i1 - 1);
      return;
    }
    this.ax = -2147483648;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return 0;
    case 1: 
      return b_(paramInt2);
    }
    return b(paramInt2);
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
      View localView = new View(paramContext);
      lpt locallpt = new lpt(efj.y(paramContext));
      hfa localhfa = new hfa(paramContext, loh.a);
      locallpt.setMargins(-localhfa.f, -localhfa.d, -localhfa.f, 0);
      locallpt.a = localhfa.a;
      localView.setLayoutParams(locallpt);
      return localView;
    case 1: 
      return a(paramContext, paramCursor, paramViewGroup);
    }
    return b(paramContext, paramCursor, paramViewGroup);
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public void a(Cursor paramCursor, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramCursor != null) && (paramCursor.moveToFirst()))
    {
      do
      {
        localArrayList.add(paramCursor.getString(39));
      } while (paramCursor.moveToNext());
      paramCursor.moveToFirst();
    }
    int i3;
    int i1;
    if ((this.az.size() != 0) && (localArrayList.size() >= this.az.size()))
    {
      int i2 = this.az.size();
      i3 = 0;
      if (i3 >= i2) {
        break label453;
      }
      if (!TextUtils.equals((CharSequence)this.az.get(i3), (CharSequence)localArrayList.get(i3)))
      {
        paramInt = -1;
        if (!Log.isLoggable("StreamAdapter", 4)) {
          break label447;
        }
        new StringBuilder(59).append("recalculateStreamHash: changed because of index ").append(i3);
        int i4 = this.az.size();
        int i5 = 0;
        if (i5 < i4)
        {
          String str2 = (String)localArrayList.get(i5);
          String str3 = (String)this.az.get(i5);
          if (TextUtils.equals(str2, str3)) {}
          for (String str4 = "";; str4 = " *")
          {
            new StringBuilder(3 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length()).append("  ").append(str2).append(" ").append(str3).append(str4);
            i5++;
            break;
          }
        }
        int i6 = localArrayList.size();
        int i7 = i4;
        if (i7 < i6)
        {
          String str1 = String.valueOf((String)localArrayList.get(i7));
          if (str1.length() != 0) {
            "  ".concat(str1);
          }
          for (;;)
          {
            i7++;
            break;
            new String("  ");
          }
        }
        i1 = 1;
      }
    }
    for (;;)
    {
      boolean bool;
      if (i1 == 0)
      {
        bool = false;
        if (paramInt < 0) {}
      }
      else
      {
        bool = true;
      }
      a(bool, paramInt);
      this.az.clear();
      this.az = localArrayList;
      if (i1 != 0)
      {
        this.j.clear();
        this.aB.clear();
        this.aC.clear();
        this.aD.clear();
        this.k.clear();
      }
      return;
      i3++;
      break;
      i1 = 1;
      continue;
      label447:
      i1 = 1;
      continue;
      label453:
      i1 = 0;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    StreamGridView localStreamGridView = (StreamGridView)paramView;
    if (this.av != null) {
      this.av.a(paramView, paramInt);
    }
    int i1 = this.aE.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      dxu localdxu = (dxu)this.aE.get(i2);
      this.m.a(localdxu, (View)localStreamGridView.getParent());
    }
    int i3 = this.aF.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      lhw locallhw = (lhw)this.aF.get(i4);
      this.m.a(locallhw, (View)localStreamGridView.getParent());
    }
    boolean bool1;
    int i6;
    label168:
    lpj locallpj;
    if (paramInt == 0)
    {
      bool1 = true;
      this.o = bool1;
      if ((!this.o) || (localStreamGridView == null)) {
        return;
      }
      int i5 = localStreamGridView.getChildCount();
      i6 = 0;
      if (i6 >= i5) {
        return;
      }
      View localView = localStreamGridView.getChildAt(i6);
      if ((localView instanceof lpj))
      {
        locallpj = (lpj)localView;
        if ((!this.o) || (!this.aH)) {
          break label236;
        }
      }
    }
    label236:
    for (boolean bool2 = true;; bool2 = false)
    {
      locallpj.c(bool2);
      i6++;
      break label168;
      bool1 = false;
      break;
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.aL)
    {
      if (this.av != null) {
        this.av.a(paramView, paramInt1, paramInt2, paramInt3);
      }
      if (this.aw != null) {
        this.aw.a(paramView, paramInt1, paramInt2, paramInt3);
      }
    }
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof kbb)) {
      ((kbb)paramView).ap_();
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      if ((paramView instanceof kbb)) {
        ((kbb)paramView).b();
      }
      return;
      a(paramView, paramCursor);
      continue;
      a(paramView, paramCursor, paramViewGroup);
    }
  }
  
  public void a(View paramView, Cursor paramCursor) {}
  
  public void a(View paramView, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    int i1 = paramCursor.getPosition();
    int i2 = i1 + g(2);
    lpk locallpk;
    boolean bool2;
    int i3;
    label129:
    llr localllr;
    Object localObject;
    if ((paramView instanceof lpk))
    {
      locallpk = (lpk)paramView;
      a((StreamGridView)paramViewGroup, i1);
      locallpk.i = this.ay;
      boolean bool1 = a(paramCursor);
      efj.e(paramCursor, "Cursor cannot be null.");
      hfd localhfd = locallpk.e;
      localhfd.a(false);
      localhfd.a(null);
      if (!TextUtils.isEmpty(null))
      {
        bool2 = true;
        localhfd.b = bool2;
        localhfd.c.setText(null);
        TextView localTextView = localhfd.c;
        if (!localhfd.b) {
          break label364;
        }
        i3 = 0;
        localTextView.setVisibility(i3);
        locallpk.j = paramCursor.getString(2);
        localllr = llr.a(paramCursor.getBlob(37));
        if (localllr != null) {
          break label371;
        }
        localObject = null;
        label169:
        if ((!bool1) || (TextUtils.isEmpty((CharSequence)localObject))) {
          break label820;
        }
        locallpk.e.a((CharSequence)localObject);
        locallpk.e.setPadding(0, locallpk.g, 0, locallpk.g);
        label212:
        locallpk.e.a(true);
        efj.a(locallpk.e, lpi.a(locallpk.j, localllr));
        locallpk.e.setVisibility(0);
        lpt locallpt = new lpt(-2);
        locallpt.topMargin = this.r;
        locallpk.setLayoutParams(locallpt);
        a(locallpk.f, paramCursor, paramViewGroup, i1);
        locallpt.a = locallpk.f.K;
        if (TextUtils.equals(this.aK, locallpk.f.N))
        {
          locallpk.setVisibility(4);
          this.p = locallpk;
        }
      }
    }
    for (;;)
    {
      b(paramView, i2);
      if (this.e != null) {
        this.e.a(i2);
      }
      return;
      bool2 = false;
      break;
      label364:
      i3 = 8;
      break label129;
      label371:
      llq localllq = localllr.g;
      lmk locallmk = localllr.b;
      lmd locallmd = localllr.d;
      lmo locallmo = localllr.a;
      if ((localllq != null) && (locallmk == null))
      {
        localObject = localllq.b();
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          lls locallls = localllr.f;
          if ((locallls != null) && (locallls.c()) && (TextUtils.equals((CharSequence)localObject, locallls.b())))
          {
            localObject = null;
            break label169;
          }
          lxw.a((Spannable)localObject, new kuf(locallpk.e, new gxq(lpk.a(localllq)), locallpk.d), true);
          break label169;
        }
      }
      Context localContext = locallpk.getContext();
      localObject = null;
      int i6;
      if (locallmd != null)
      {
        i6 = locallmd.a();
        localObject = null;
      }
      label568:
      String str1;
      int i4;
      String str2;
      switch (i6)
      {
      case 2: 
      default: 
        if (locallmk != null)
        {
          List localList = locallmk.a();
          if ((localList != null) && (!localList.isEmpty()))
          {
            str1 = ((hev)localList.get(0)).a();
            i4 = localList.size();
            str2 = ((hev)localList.get(0)).b();
            if (str2 == null) {
              break label812;
            }
          }
        }
        break;
      }
      for (;;)
      {
        int i5 = do.aQ;
        Object[] arrayOfObject = new Object[6];
        arrayOfObject[0] = "GENDER";
        arrayOfObject[1] = str2;
        arrayOfObject[2] = "PERSON";
        arrayOfObject[3] = locallpk.b.a(str1);
        arrayOfObject[4] = "COUNT";
        arrayOfObject[5] = Integer.valueOf(i4);
        localObject = rfb.a(Locale.getDefault(), localContext.getResources().getString(i5), arrayOfObject);
        if ((!TextUtils.isEmpty((CharSequence)localObject)) || (locallmo == null)) {
          break;
        }
        localObject = localContext.getString(do.aP);
        break;
        byte[] arrayOfByte = paramCursor.getBlob(23);
        localObject = null;
        if (arrayOfByte == null) {
          break label568;
        }
        localObject = localContext.getString(do.aR);
        break label568;
        localObject = localContext.getString(do.aC);
        break label568;
        localObject = localContext.getString(do.am);
        break label568;
        label812:
        str2 = "other";
      }
      label820:
      locallpk.e.setPadding(0, 0, 0, locallpk.h);
      break label212;
      if ((paramView instanceof lpi)) {
        a(paramView, paramCursor, paramViewGroup, i1);
      } else if (Log.isLoggable("StreamAdapter", 6)) {
        Log.e("StreamAdapter", "Unrecognized view type.");
      }
    }
  }
  
  public void a(eab parameab)
  {
    parameab.o = this.d;
    if (!parameab.q) {
      parameab.n = this;
    }
  }
  
  public final void a(String paramString, View paramView)
  {
    w();
    this.aK = paramString;
    this.p = paramView;
    if (this.p != null) {
      this.p.setVisibility(4);
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    this.m.a(paramString1, paramString2, paramInt);
    v();
  }
  
  public final void a(String paramString, ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
    {
      this.l.remove(paramArrayList);
      return;
    }
    this.l.put(paramString, paramArrayList);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if (Log.isLoggable("StreamAdapter", 4)) {
      new StringBuilder(41).append("triggerStreamObservers ").append(paramBoolean).append(", ").append(paramInt);
    }
    if (paramBoolean)
    {
      this.aA = -1;
      if (paramInt >= 0) {
        break label98;
      }
      this.h.clear();
    }
    for (;;)
    {
      Iterator localIterator = this.i.iterator();
      while (localIterator.hasNext()) {
        ((lpy)localIterator.next()).a(paramBoolean, paramInt, this.aA);
      }
      label98:
      for (int i1 = -1 + this.h.size(); (i1 >= 0) && (this.h.keyAt(i1) >= paramInt); i1--) {
        this.h.removeAt(i1);
      }
    }
    this.aA = -1;
  }
  
  public boolean a(Cursor paramCursor)
  {
    return true;
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt, String paramString3, byte[] paramArrayOfByte)
  {
    long l1 = System.currentTimeMillis();
    boolean bool;
    if (this.as.a(paramString1) == null)
    {
      this.as.a(paramString1, new djy(paramString1, paramString2, paramInt, l1));
      this.at.add(paramString1);
      bool = true;
    }
    for (int i1 = 1;; i1 = 0)
    {
      if ((paramString3 != null) && (this.as.a(paramString3) == null))
      {
        this.as.a(paramString3, new djy(paramString3, paramString2, paramInt, l1));
        this.at.add(paramString3);
        bool = true;
        i1 = 1;
      }
      ohy localohy = lmp.a(paramArrayOfByte);
      if ((localohy != null) && (!this.n.contains(paramString1)))
      {
        ocl localocl = new ocl();
        localocl.a = localohy;
        localocl.b = 6;
        this.aG.add(localocl);
        this.n.add(paramString1);
        i1 = 1;
      }
      if ((i1 != 0) && (!this.au))
      {
        this.au = true;
        Runnable localRunnable = this.g;
        efj.m().postDelayed(localRunnable, 30000L);
      }
      return bool;
      bool = false;
    }
  }
  
  public int b(int paramInt)
  {
    Cursor localCursor = this.aN[2].c;
    localCursor.moveToPosition(paramInt);
    long l1 = localCursor.getLong(11);
    String str1 = localCursor.getString(2);
    lll locallll = ((lln)mbb.a(this.aM, lln.class)).a(str1);
    if (locallll != null)
    {
      String str2 = a(locallll, locallll.a(str1, l1));
      Integer localInteger = (Integer)c().get(str2);
      String str3;
      if ((localInteger == null) || (localInteger.intValue() < 0) || (localInteger.intValue() >= getViewTypeCount()))
      {
        str3 = String.valueOf(str2);
        if (str3.length() == 0) {
          break label161;
        }
      }
      label161:
      for (String str4 = "Unrecognized view type: ".concat(str3);; str4 = new String("Unrecognized view type: "))
      {
        Log.e("StreamAdapter", str4);
        return localInteger.intValue();
      }
    }
    Log.e("StreamAdapter", 70 + String.valueOf(str1).length() + "Could not find a view type for activityId=" + str1 + ", flags=" + l1);
    return -1;
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    ViewGroup localViewGroup = efj.a(paramContext, paramCursor.getString(2), paramCursor.getLong(11));
    if ((localViewGroup instanceof loa)) {
      ((loa)localViewGroup).b = this.f;
    }
    return localViewGroup;
  }
  
  public void b(Cursor paramCursor)
  {
    Cursor localCursor = this.aN[1].c;
    int i1;
    if (paramCursor == null)
    {
      i1 = 1;
      if (localCursor != null) {
        break label94;
      }
    }
    label94:
    for (int i2 = 1;; i2 = 0)
    {
      int i3 = i2 ^ i1;
      boolean bool = false;
      if (i3 != 0) {
        bool = true;
      }
      if (Log.isLoggable("StreamAdapter", 4)) {
        new StringBuilder(44).append("changeStreamHeaderCursor cursorChanged=").append(bool);
      }
      super.a(1, paramCursor);
      if (bool) {
        a(true, -1);
      }
      return;
      i1 = 0;
      break;
    }
  }
  
  public void b(Cursor paramCursor, int paramInt)
  {
    if (Log.isLoggable("StreamAdapter", 4)) {
      new StringBuilder(50).append("changeStreamCursor lastClickedPosition=").append(paramInt);
    }
    super.a(2, paramCursor);
    a(paramCursor, paramInt);
  }
  
  @TargetApi(16)
  protected final void b(View paramView, int paramInt)
  {
    if (this.aJ) {
      if (Build.VERSION.SDK_INT < 14) {
        break label126;
      }
    }
    label126:
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 != 0) && (paramInt > this.ax))
      {
        this.ax = paramInt;
        int i2 = (int)paramView.getTranslationY();
        if ((paramView instanceof lpj)) {
          ((lpj)paramView).u();
        }
        paramView.setTranslationY(this.ay.c / 3);
        paramView.invalidate();
        ViewPropertyAnimator localViewPropertyAnimator = paramView.animate().translationY(i2).setDuration(500L).setInterpolator(c);
        localViewPropertyAnimator.setListener(new dgc(this, paramView));
        localViewPropertyAnimator.setStartDelay(50L).start();
      }
      return;
    }
  }
  
  public int b_(int paramInt)
  {
    return 0;
  }
  
  public int getViewTypeCount()
  {
    return 2 + c().size();
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public boolean isEmpty()
  {
    return e_(2) == 0;
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.registerDataSetObserver(paramDataSetObserver);
    if ((paramDataSetObserver instanceof lpy)) {
      this.i.add((lpy)paramDataSetObserver);
    }
  }
  
  public final void t()
  {
    if (this.au)
    {
      Runnable localRunnable = this.g;
      efj.m().removeCallbacks(localRunnable);
      this.g.run();
    }
    this.aH = false;
  }
  
  public final String[] u()
  {
    int i1 = this.at.size();
    if (i1 == 0) {
      return null;
    }
    return (String[])this.at.toArray(new String[i1]);
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.unregisterDataSetObserver(paramDataSetObserver);
    if ((paramDataSetObserver instanceof lpy)) {
      this.i.remove(paramDataSetObserver);
    }
  }
  
  public final void v()
  {
    this.m.a(this.aM, this.ar, 18);
  }
  
  public final void w()
  {
    this.aK = null;
    if (this.p != null)
    {
      this.p.setVisibility(0);
      this.p = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfz
 * JD-Core Version:    0.7.0.1
 */