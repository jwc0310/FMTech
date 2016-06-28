import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ckm
  extends hqf
  implements Filterable, cw<Cursor>, luu
{
  private static final String[] A = { "person_id", "lookup_key", "name", "email" };
  private static final String[] B = { "person_id", "lookup_key", "name", "email", "phone", "phone_type" };
  private static final String[] C = { "_id", "gaia_id", "person_id", "name", "avatar", "profile_type", "snippet", "in_same_visibility_group", "verified", "auto_complete_index", "auto_complete_suggestion" };
  private static String[] D = { "_id", "gaia_id" };
  private static Pattern E = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@([a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})*)?");
  private static final String[] z = { "_id", "person_id", "gaia_id", "name", "avatar", "packed_circle_ids", "email", "profile_type", "in_same_visibility_group", "verified", "interaction_sort_key" };
  private bw F;
  private boolean G;
  private final jjm<jgw> H = new ckn(this);
  private boolean I;
  private boolean J;
  private String K;
  private boolean L = true;
  private Set<String> M = new HashSet();
  private final int N;
  private final int O;
  private final int P;
  private final int Q;
  private final int R;
  private final int S;
  private Runnable T;
  @SuppressLint({"UseSparseArrays"})
  private final HashMap<Integer, Cursor> U = new HashMap();
  private final HashSet<Integer> V = new HashSet();
  private jiq W = new jiq();
  private boolean X;
  private Cursor Y;
  private Cursor Z;
  public final cv a;
  private int aa;
  private Filter ab;
  private final DataSetObserver ac = new ckp(this);
  public final giz b;
  public final jly c;
  public final int d;
  public int e = -1;
  public boolean f;
  public boolean g;
  public boolean h;
  boolean i;
  public boolean j;
  public boolean k = true;
  public boolean l;
  public boolean m = true;
  public ckx n;
  public String o;
  public String p;
  public boolean q;
  public boolean r;
  public boolean s;
  final int t;
  final HashSet<Integer> u = new HashSet();
  public boolean v;
  public Set<String> w = new HashSet();
  public final Handler x = new cko(this);
  volatile CountDownLatch y;
  
  public ckm(Context paramContext, bw parambw, cv paramcv, int paramInt)
  {
    this(paramContext, parambw, paramcv, paramInt, 0);
  }
  
  public ckm(Context paramContext, bw parambw, cv paramcv, int paramInt1, int paramInt2)
  {
    super(paramContext, (byte)0);
    for (int i1 = 0; i1 < 7; i1++)
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
    this.s = true;
    int i3 = 1024 + paramInt2 * 10;
    int i4 = i3 + 1;
    this.N = i3;
    int i5 = i4 + 1;
    this.O = i4;
    int i6 = i5 + 1;
    this.P = i5;
    int i7 = i6 + 1;
    this.Q = i6;
    int i8 = i7 + 1;
    this.t = i7;
    int i9 = i8 + 1;
    this.R = i8;
    this.S = i9;
    cky localcky = (cky)parambw.a("people_search_results");
    if (localcky == null)
    {
      localcky = new cky();
      parambw.a().a(localcky, "people_search_results").c();
    }
    for (;;)
    {
      localcky.a = this.W;
      this.F = parambw;
      this.a = paramcv;
      this.b = ((giz)mbb.a(paramContext, giz.class));
      this.d = paramInt1;
      jiq localjiq1 = this.W;
      localjiq1.n = this.L;
      localjiq1.m = false;
      this.c = new jly(paramContext, paramcv, this.d, paramInt2);
      jly localjly = this.c;
      DataSetObserver localDataSetObserver = this.ac;
      localjly.b.registerObserver(localDataSetObserver);
      return;
      jiq localjiq2 = localcky.a;
      if (localjiq2 != null)
      {
        this.W = localjiq2;
        this.o = this.W.a;
        this.X = true;
      }
    }
  }
  
  private final void b(int paramInt, Cursor paramCursor)
  {
    Cursor localCursor = (Cursor)this.U.get(Integer.valueOf(paramInt));
    if ((localCursor != null) && (localCursor != paramCursor))
    {
      localCursor.close();
      this.U.remove(Integer.valueOf(paramInt));
    }
    if ((paramCursor != null) && (localCursor != paramCursor)) {
      this.U.put(Integer.valueOf(paramInt), paramCursor);
    }
  }
  
  private final int c(int paramInt, Cursor paramCursor)
  {
    if (paramInt == this.t) {}
    for (int i1 = 1; (i1 == 0) && (paramInt != this.R); i1 = 0)
    {
      if (Log.isLoggable("PeopleSearchAdapter", 6)) {
        Log.e("PeopleSearchAdapter", 29 + "unexpected loader " + paramInt);
      }
      return 0;
    }
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      this.V.add(Integer.valueOf(paramInt));
      this.u.remove(Integer.valueOf(paramInt));
      return 0;
    }
    this.V.remove(Integer.valueOf(paramInt));
    if (!TextUtils.equals(paramCursor.getString(0), this.W.b)) {
      return 0;
    }
    this.u.remove(Integer.valueOf(paramInt));
    String str1 = paramCursor.getString(1);
    this.W.b = str1;
    int i2 = 0;
    String str2;
    String str3;
    String str4;
    jiq localjiq2;
    int i5;
    String str7;
    String str8;
    boolean bool4;
    label393:
    boolean bool5;
    label407:
    boolean bool3;
    for (;;)
    {
      if (paramCursor.moveToNext())
      {
        str2 = paramCursor.getString(2);
        str3 = paramCursor.getString(1);
        str4 = paramCursor.getString(3);
        if (TextUtils.isEmpty(str2))
        {
          if (Log.isLoggable("PeopleSearchAdapter", 5))
          {
            if (i1 != 0) {}
            for (String str9 = "PublicProfileSearch";; str9 = "AutocompleteMergedPeople")
            {
              new StringBuilder(39 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str9).length()).append("empty personId for gaiaId/name ").append(str3).append("/").append(str4).append(", from ").append(str9);
              break;
            }
          }
        }
        else if ((TextUtils.isEmpty(str3)) || (!this.M.contains(str3))) {
          if (i1 != 0)
          {
            localjiq2 = this.W;
            i5 = paramCursor.getInt(5);
            str7 = paramCursor.getString(4);
            str8 = paramCursor.getString(6);
            if (paramCursor.getInt(7) != 0)
            {
              bool4 = true;
              if (paramCursor.getInt(8) == 0) {
                break label468;
              }
              bool5 = true;
              if ((!TextUtils.isEmpty(str2)) && (!str2.equals(localjiq2.c)) && (!localjiq2.j.contains(str2))) {
                break label474;
              }
              bool3 = false;
              label444:
              if (!bool3) {
                break label655;
              }
            }
          }
        }
      }
    }
    label642:
    label655:
    for (int i4 = i2 + 1;; i4 = i2)
    {
      i2 = i4;
      break;
      bool4 = false;
      break label393;
      label468:
      bool5 = false;
      break label407;
      label474:
      localjiq2.j.add(str2);
      localjiq2.i.add(new jiv(str2, str3, str4, jiq.a(i5), str7, str8, bool4, bool5));
      localjiq2.m = false;
      bool3 = true;
      break label444;
      jiq localjiq1 = this.W;
      int i3 = paramCursor.getInt(5);
      String str5 = paramCursor.getString(4);
      String str6 = paramCursor.getString(6);
      boolean bool1;
      if (paramCursor.getInt(7) != 0)
      {
        bool1 = true;
        label580:
        if (paramCursor.getInt(8) == 0) {
          break label642;
        }
      }
      for (boolean bool2 = true;; bool2 = false)
      {
        bool3 = localjiq1.a(str2, str3, str4, i3, str5, str6, bool1, bool2, paramCursor.getInt(9), paramCursor.getString(10));
        break;
        bool1 = false;
        break label580;
      }
      k();
      return i2;
    }
  }
  
  private final void c(Bundle paramBundle)
  {
    if (this.T != null)
    {
      Runnable localRunnable2 = this.T;
      efj.m().removeCallbacks(localRunnable2);
    }
    this.T = new ckq(this, paramBundle, this);
    Runnable localRunnable1 = this.T;
    efj.m().postDelayed(localRunnable1, 1000L);
  }
  
  private final Bundle j()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("query", this.o);
    return localBundle;
  }
  
  private final void k()
  {
    this.x.removeMessages(0);
    Cursor localCursor = this.W.c();
    if (localCursor.getCount() == 0)
    {
      this.x.sendEmptyMessageDelayed(0, 500L);
      return;
    }
    a(5, localCursor);
  }
  
  private final String l()
  {
    if (TextUtils.isEmpty(this.o)) {}
    String str;
    do
    {
      Rfc822Token[] arrayOfRfc822Token;
      do
      {
        return null;
        arrayOfRfc822Token = Rfc822Tokenizer.tokenize(this.o);
      } while ((arrayOfRfc822Token == null) || (arrayOfRfc822Token.length <= 0));
      str = arrayOfRfc822Token[0].getAddress();
    } while ((TextUtils.isEmpty(str)) || (!E.matcher(str).matches()));
    return str;
  }
  
  private final String m()
  {
    if (TextUtils.isEmpty(this.o)) {}
    while (!PhoneNumberUtils.isWellFormedSmsAddress(this.o)) {
      return null;
    }
    int i1 = this.o.length();
    int i2 = 1;
    int i3 = 0;
    for (;;)
    {
      if (i3 >= i1) {
        break label76;
      }
      char c1 = this.o.charAt(i3);
      if ((!PhoneNumberUtils.isDialable(c1)) || ((c1 == '+') && (i2 == 0))) {
        break;
      }
      i3++;
      i2 = 0;
    }
    label76:
    return this.o;
  }
  
  public int a()
  {
    return 7;
  }
  
  protected int a(int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  protected final Bundle a(Cursor paramCursor)
  {
    int i1;
    String str;
    if (paramCursor.getInt(16) == 1)
    {
      i1 = 1;
      str = paramCursor.getString(15);
      if (!paramCursor.isNull(14)) {
        break label60;
      }
    }
    label60:
    for (int i2 = -1;; i2 = paramCursor.getInt(14))
    {
      if ((i1 != 0) || (i2 >= 0) || (!TextUtils.isEmpty(str))) {
        break label73;
      }
      return null;
      i1 = 0;
      break;
    }
    label73:
    int i3;
    if (paramCursor.getInt(4) == 1)
    {
      i3 = 1;
      if (i1 == 0) {
        break label154;
      }
    }
    label154:
    for (int i4 = 3;; i4 = 4)
    {
      Bundle localBundle = gxy.a("extra_search_query", this.o);
      localBundle.putInt("extra_search_type", i3);
      localBundle.putInt("extra_search_personalization_type", i4);
      localBundle.putString("extra_search_selected_text", str);
      localBundle.putInt("extra_search_selected_index", i2);
      return localBundle;
      i3 = 2;
      break;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (paramInt == this.N) {
      return new jma(this.aM, this.d, this.e, this.H);
    }
    if (paramInt == this.O) {
      return new ckd(this.aM, this.d, this.r, this.v);
    }
    if (paramInt == this.Q)
    {
      Context localContext = this.aM;
      if (this.q) {}
      for (String[] arrayOfString = B;; arrayOfString = A) {
        return new bwi(localContext, arrayOfString, this.o, 2, this.q);
      }
    }
    if (paramInt == this.P) {
      return new clg(this.aM, this.d, z, this.o, this.r, this.L, this.v, this.K, 10);
    }
    if (paramInt == this.t) {
      return new cox(this.aM, this.d, C, this.o, 2, this.r, this.v, this.W.b);
    }
    if (paramInt == this.R) {
      return new bxd(this.aM, this.d, C, this.o, 2, this.v, null);
    }
    if (paramInt == this.S) {
      return new bxo(this.aM, this.d, D, null);
    }
    return null;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle.setClassLoader(getClass().getClassLoader());
      this.o = paramBundle.getString("search_list_adapter.query");
      if ((paramBundle.containsKey("search_list_adapter.results")) && (!this.X)) {
        this.W = ((jiq)paramBundle.getParcelable("search_list_adapter.results"));
      }
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    String str5;
    String str6;
    String str8;
    if ("add_email_dialog".equals(paramString))
    {
      str5 = paramBundle.getString("message");
      str6 = l();
      if ((!TextUtils.isEmpty(str5)) && (!TextUtils.isEmpty(str6)))
      {
        String str7 = String.valueOf(str6);
        if (str7.length() == 0) {
          break label88;
        }
        str8 = "e:".concat(str7);
        if (!this.l) {
          break label103;
        }
        this.n.b(str8, str5, null);
      }
    }
    label88:
    label103:
    String str1;
    String str2;
    do
    {
      do
      {
        return;
        str8 = new String("e:");
        break;
        this.n.a(str8, null, new jjd(null, str5, str6), null);
        return;
      } while (!"add_sms_dialog".equals(paramString));
      str1 = paramBundle.getString("message");
      str2 = m();
    } while ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)));
    String str3 = String.valueOf(str2);
    if (str3.length() != 0) {}
    for (String str4 = "p:".concat(str3); this.l; str4 = new String("p:"))
    {
      this.n.b(str4, str1, null);
      return;
    }
    this.n.a(str4, null, new jjd(null, str1, str4), null);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString)
  {
    this.K = paramString;
    this.i = true;
  }
  
  public final void a(Collection<String> paramCollection)
  {
    this.M.clear();
    if (paramCollection != null) {
      this.M.addAll(paramCollection);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putString("search_list_adapter.query", this.o);
    jiq localjiq = this.W;
    if (localjiq.g.size() + localjiq.i.size() + localjiq.k.size() <= 1000) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        paramBundle.putParcelable("search_list_adapter.results", this.W);
      }
      return;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(String paramString)
  {
    if (TextUtils.equals(this.o, paramString))
    {
      CountDownLatch localCountDownLatch2 = this.y;
      if (localCountDownLatch2 != null) {
        localCountDownLatch2.countDown();
      }
    }
    Bundle localBundle;
    do
    {
      do
      {
        return;
        jiq localjiq = this.W;
        if (!TextUtils.equals(localjiq.a, paramString))
        {
          localjiq.a = paramString;
          localjiq.g.clear();
          localjiq.i.clear();
          localjiq.j.clear();
          localjiq.k.clear();
          localjiq.l.clear();
          localjiq.h = false;
          localjiq.m = false;
          localjiq.b = null;
        }
        this.x.removeMessages(0);
        this.x.removeMessages(1);
        this.o = paramString;
        this.aa = 0;
        if (!TextUtils.isEmpty(paramString)) {
          break;
        }
        this.a.a(this.N);
        this.a.a(this.P);
        this.a.a(this.Q);
        this.a.a(this.t);
        this.a.a(this.R);
        this.u.clear();
        y();
        CountDownLatch localCountDownLatch1 = this.y;
        if (localCountDownLatch1 != null) {
          localCountDownLatch1.countDown();
        }
      } while (this.n == null);
      this.n.T_();
      return;
      localBundle = j();
      if (this.e != -1)
      {
        this.aa = (1 + this.aa);
        this.a.b(this.N, localBundle, this);
      }
      this.aa = (1 + this.aa);
      this.a.b(this.P, localBundle, this);
      boolean bool = this.b.a(this.d).c("is_dasher_account");
      if ((!this.v) && (!bool))
      {
        this.aa = (1 + this.aa);
        this.a.b(this.Q, localBundle, this);
      }
    } while (!this.j);
    this.V.clear();
    this.u.clear();
    this.x.sendEmptyMessageDelayed(1, 300L);
    this.a.a(this.t);
    this.a.a(this.R);
    this.u.add(Integer.valueOf(this.R));
    this.a.a(this.R, localBundle, this);
    c(localBundle);
    d(false);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public final boolean b()
  {
    return (!TextUtils.isEmpty(this.o)) && (this.W.c().getCount() == 0) && ((!c()) || (!this.u.isEmpty()));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  protected final void c(String paramString)
  {
    ckw localckw1 = (ckw)this.F.a("add_person_dialog_listener");
    ckw localckw2;
    if (localckw1 == null)
    {
      localckw2 = new ckw();
      this.F.a().a(localckw2, "add_person_dialog_listener").b();
    }
    for (ckw localckw3 = localckw2;; localckw3 = localckw1)
    {
      localckw3.a = this;
      Context localContext = this.aM;
      bzk localbzk = bzk.a(localContext.getString(aau.bH), null, localContext.getString(aau.bG), localContext.getString(17039370), localContext.getString(17039360), false);
      localbzk.n = localckw3;
      localbzk.p = 0;
      localbzk.a(this.F, paramString);
      return;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    this.L = paramBoolean;
    jiq localjiq = this.W;
    localjiq.n = this.L;
    localjiq.m = false;
  }
  
  public final boolean c()
  {
    return (this.I) && (this.J) && ((this.e == -1) || (this.G)) && (this.c.c);
  }
  
  final void d(boolean paramBoolean)
  {
    if (!this.j) {
      return;
    }
    hqr localhqr = new hqr(new String[] { "_id" });
    if ((!TextUtils.isEmpty(this.o)) && (this.o.trim().length() >= 2) && (this.I) && (this.J))
    {
      if (this.V.isEmpty()) {
        break label112;
      }
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(3);
      localhqr.a(arrayOfObject3);
    }
    for (;;)
    {
      if (localhqr.getCount() != 0) {
        h();
      }
      a(6, localhqr);
      return;
      label112:
      if (!this.i) {
        if (((paramBoolean) || (!this.u.isEmpty())) && ((this.k) || (this.W.c().getCount() > 0)))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(1);
          localhqr.a(arrayOfObject1);
        }
        else
        {
          jiq localjiq = this.W;
          if (localjiq.i.size() + localjiq.k.size() == 0)
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(2);
            localhqr.a(arrayOfObject2);
          }
        }
      }
    }
  }
  
  final boolean d()
  {
    if (!TextUtils.isEmpty(this.W.b)) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      return false;
    }
    if (this.u.contains(Integer.valueOf(this.t))) {
      return false;
    }
    cox localcox = (cox)this.a.b(this.t);
    if ((localcox == null) || (!localcox.m)) {
      return false;
    }
    String str = this.W.b;
    return !TextUtils.equals(localcox.s, str);
  }
  
  public final void d_(int paramInt)
  {
    Cursor localCursor = (Cursor)getItem(paramInt);
    if (localCursor == null) {}
    do
    {
      String str17;
      jgs localjgs;
      do
      {
        return;
        int i1 = this.d;
        switch (e(paramInt))
        {
        default: 
          return;
        case 1: 
          String str19 = localCursor.getString(1);
          String str20 = localCursor.getString(2);
          String str21 = localCursor.getString(3);
          if (localCursor.getInt(8) != 0) {}
          for (boolean bool3 = true;; bool3 = false)
          {
            jjd localjjd3 = new jjd(str20, str21, null, null, bool3);
            if (this.n == null) {
              break;
            }
            this.n.a(str19, null, localjjd3, a(localCursor));
            return;
          }
        case 2: 
          Context localContext = this.aM;
          str17 = localCursor.getString(1);
          String str18 = localCursor.getString(2);
          int i2 = localCursor.getInt(4);
          localjgs = new jgs(str17, i2, str18, localCursor.getInt(6));
          if ((aau.a(localContext, this.d, i2)) && (!((giz)mbb.a(localContext, giz.class)).a(i1).c("minor_public_extended_dialog")))
          {
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
            localBuilder.setTitle(localCursor.getString(2));
            localBuilder.setMessage(aau.fb);
            localBuilder.setPositiveButton(aau.mf, new cks(this, str17, localjgs, localContext, i1));
            localBuilder.setNegativeButton(aau.cM, new ckt(this));
            localBuilder.show();
            return;
          }
          break;
        }
      } while (this.n == null);
      this.n.a(str17, localjgs);
      return;
    } while (this.n == null);
    ckx localckx = this.n;
    String str7 = localCursor.getString(0);
    String str8 = localCursor.getString(1);
    String str9 = localCursor.getString(2);
    String str10 = localCursor.getString(3);
    String str11 = localCursor.getString(5);
    boolean bool1;
    label424:
    String str12;
    if (localCursor.getInt(12) != 0)
    {
      bool1 = true;
      if (!this.q) {
        break label820;
      }
      String str15 = localCursor.getString(9);
      if (TextUtils.isEmpty(str15)) {
        break label820;
      }
      String str16 = String.valueOf(str15.trim());
      if (str16.length() == 0) {
        break label565;
      }
      str12 = "p:".concat(str16);
    }
    for (;;)
    {
      label477:
      if (str12 == null) {
        str12 = localCursor.getString(7);
      }
      String str14;
      String str13;
      if (TextUtils.isEmpty(str12))
      {
        str14 = localCursor.getString(8);
        boolean bool2 = TextUtils.isEmpty(str14);
        str13 = null;
        if (!bool2) {}
      }
      for (;;)
      {
        localckx.a(str7, str8, new jjd(str9, str10, str13, str11, bool1), a(localCursor));
        return;
        bool1 = false;
        break label424;
        label565:
        str12 = new String("p:");
        break label477;
        if (this.l) {
          break;
        }
        if (this.m)
        {
          c("add_email_dialog");
          return;
        }
        String str4 = l();
        if (TextUtils.isEmpty(str4)) {
          break;
        }
        String str5 = String.valueOf(str4);
        if (str5.length() != 0) {}
        for (String str6 = "e:".concat(str5);; str6 = new String("e:"))
        {
          jjd localjjd2 = new jjd(null, str4, str4);
          if (this.n == null) {
            break;
          }
          this.n.a(str6, null, localjjd2, null);
          return;
        }
        if (this.l) {
          break;
        }
        if (this.m)
        {
          c("add_sms_dialog");
          return;
        }
        String str1 = m();
        if (TextUtils.isEmpty(str1)) {
          break;
        }
        String str2 = String.valueOf(str1);
        if (str2.length() != 0) {}
        for (String str3 = "p:".concat(str2);; str3 = new String("p:"))
        {
          jjd localjjd1 = new jjd(null, str1, str3);
          if (this.n == null) {
            break;
          }
          this.n.a(str3, null, localjjd1, null);
          return;
        }
        str13 = str14;
        continue;
        str13 = str12;
      }
      label820:
      str12 = null;
    }
  }
  
  protected final void e()
  {
    if (!d()) {
      return;
    }
    this.x.post(new ckr(this, this));
  }
  
  public final void f()
  {
    gjb localgjb = this.b.a(this.d);
    if (!this.s)
    {
      String str = jjf.a(localgjb.b("gaia_id"));
      jiq localjiq = this.W;
      localjiq.c = str;
      localjiq.m = false;
    }
    Bundle localBundle = j();
    jly localjly = this.c;
    localjly.a.a(localjly.d, null, localjly);
    this.a.a(this.O, null, this);
    this.a.a(this.S, null, this);
    if ((this.e != -1) && (!TextUtils.isEmpty(this.o))) {
      this.a.a(this.N, localBundle, this);
    }
    if (!TextUtils.isEmpty(this.o)) {
      this.a.a(this.P, localBundle, this);
    }
    this.p = localgjb.b("domain_name");
    if ((!this.v) && (!localgjb.c("is_dasher_account"))) {
      this.a.a(this.Q, localBundle, this);
    }
    if (this.j)
    {
      this.u.add(Integer.valueOf(this.R));
      this.a.a(this.R, localBundle, this);
      c(localBundle);
    }
    d(false);
    ckw localckw = (ckw)this.F.a("add_person_dialog_listener");
    if (localckw != null) {
      localckw.a = this;
    }
  }
  
  public final void g()
  {
    this.x.removeMessages(0);
  }
  
  public Filter getFilter()
  {
    if (this.ab == null) {
      this.ab = new cku(this);
    }
    return this.ab;
  }
  
  protected final void h()
  {
    this.x.removeMessages(0);
    Cursor localCursor = this.W.c();
    if (localCursor.getCount() == 0) {
      a(5, localCursor);
    }
  }
  
  public boolean isEmpty()
  {
    return (TextUtils.isEmpty(this.o)) || (!this.c.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckm
 * JD-Core Version:    0.7.0.1
 */