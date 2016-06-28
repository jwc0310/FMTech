import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.help.TooltipView;
import java.util.ArrayList;
import java.util.List;

public final class jwe
  implements jtv
{
  static final String a = jwk.class.getSimpleName();
  private jtx A;
  private jty B;
  private jtz C;
  private jtr D;
  private ill E;
  public final Context b;
  public lly c;
  public String d;
  jtn e;
  public final git f;
  jto g;
  jtq h;
  public boolean i;
  gik j;
  public final Object k = new Object();
  private jtw l;
  private jxa m;
  private jww n;
  private jwz o;
  private jwy p;
  private jxo q;
  private jwx r;
  private TextView s;
  private jwi t;
  private jwh u;
  private jwf v;
  private jwg w;
  private gzi x;
  private boolean y;
  private long z;
  
  public jwe(Context paramContext)
  {
    this.b = paramContext;
    this.f = ((git)mbb.a(paramContext, git.class));
    this.z = ((hyi)mbb.a(paramContext, hyi.class)).c(jwq.b, this.f.c()).longValue();
  }
  
  private jwg n()
  {
    if (this.w == null) {
      this.w = new jwg(this);
    }
    return this.w;
  }
  
  private jwf o()
  {
    if (this.v == null) {
      this.v = new jwf(this);
    }
    return this.v;
  }
  
  private jwh p()
  {
    if (this.u == null) {
      this.u = new jwh(this);
    }
    return this.u;
  }
  
  private final jwx q()
  {
    if (this.r == null)
    {
      this.r = new jwx(this.b);
      this.r.A = p();
      this.r.i = o();
      this.r.j = n();
      this.r.B = l();
      this.r.C = m();
      this.r.z = this.z;
    }
    return this.r;
  }
  
  private final jxo r()
  {
    if (this.q == null)
    {
      this.q = new jxo(this.b);
      this.q.A = p();
      this.q.i = o();
      this.q.j = n();
      this.q.B = l();
      this.q.C = m();
      this.q.z = this.z;
    }
    return this.q;
  }
  
  private final jwy s()
  {
    if (this.p == null)
    {
      this.p = new jwy(this.b);
      this.p.A = p();
      this.p.i = o();
      this.p.j = n();
      this.p.B = l();
      this.p.C = m();
      this.p.z = this.z;
    }
    return this.p;
  }
  
  private final jwz t()
  {
    if (this.o == null)
    {
      this.o = new jwz(this.b);
      this.o.A = p();
      this.o.i = o();
      this.o.j = n();
      this.o.B = l();
      this.o.C = m();
      this.o.z = this.z;
    }
    return this.o;
  }
  
  private final jww u()
  {
    if (this.n == null)
    {
      this.n = new jww(this.b);
      this.n.A = p();
      this.n.B = l();
      this.n.C = m();
      this.n.z = this.z;
    }
    return this.n;
  }
  
  private gzi v()
  {
    if (this.x == null) {
      this.x = new jwj(this);
    }
    return this.x;
  }
  
  public final void D_()
  {
    j().D_();
    for (;;)
    {
      synchronized (this.k)
      {
        if (this.c.g())
        {
          u().D_();
          k().b(v());
          this.j = null;
          return;
        }
        if (this.c.f()) {
          t().D_();
        }
      }
      if (this.c.e()) {
        s().D_();
      } else if (this.c.d()) {
        r().D_();
      } else if (this.c.c()) {
        q().D_();
      }
    }
  }
  
  public final void a(gik paramgik)
  {
    this.j = paramgik;
  }
  
  public final void a(la<Integer, String> paramla)
  {
    Resources localResources = this.b.getResources();
    jr localjr = jr.a();
    llz[] arrayOfllz = this.c.h;
    int i1 = 0;
    if (i1 < this.c.i)
    {
      String str1 = localjr.a(arrayOfllz[i1].b);
      if (i1 == this.c.k) {}
      for (String str2 = localResources.getString(eyg.at, new Object[] { str1 });; str2 = localResources.getString(eyg.au, new Object[] { str1 }))
      {
        paramla.put(Integer.valueOf(i1 + ehr.dq), str2);
        i1++;
        break;
      }
    }
  }
  
  /* Error */
  public final void a(lly paramlly, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 84	jwe:k	Ljava/lang/Object;
    //   4: astore 4
    //   6: aload 4
    //   8: monitorenter
    //   9: aload_1
    //   10: ifnonnull +7 -> 17
    //   13: aload 4
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: aload_1
    //   19: putfield 225	jwe:c	Llly;
    //   22: aload_0
    //   23: aload_2
    //   24: putfield 323	jwe:d	Ljava/lang/String;
    //   27: aload_0
    //   28: iload_3
    //   29: putfield 325	jwe:y	Z
    //   32: aload_0
    //   33: invokevirtual 219	jwe:j	()Ljxa;
    //   36: astore 6
    //   38: aload 6
    //   40: aload_1
    //   41: invokevirtual 328	jxa:a	(Llly;)Ljtu;
    //   44: pop
    //   45: iload_3
    //   46: ifeq +161 -> 207
    //   49: aconst_null
    //   50: astore 8
    //   52: aload 6
    //   54: aload 8
    //   56: putfield 330	jxa:f	Landroid/view/View$OnClickListener;
    //   59: iload_3
    //   60: ifne +264 -> 324
    //   63: iconst_1
    //   64: istore 9
    //   66: aload 6
    //   68: iload 9
    //   70: putfield 332	jxa:g	Z
    //   73: aload_1
    //   74: invokevirtual 229	lly:g	()Z
    //   77: ifeq +158 -> 235
    //   80: aload_0
    //   81: invokespecial 231	jwe:u	()Ljww;
    //   84: aload_1
    //   85: invokevirtual 333	jww:a	(Llly;)Ljtu;
    //   88: astore 10
    //   90: aload_0
    //   91: getfield 335	jwe:l	Ljtw;
    //   94: ifnonnull +20 -> 114
    //   97: aload_0
    //   98: aload_0
    //   99: getfield 86	jwe:b	Landroid/content/Context;
    //   102: ldc_w 337
    //   105: invokestatic 93	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   108: checkcast 337	jtw
    //   111: putfield 335	jwe:l	Ljtw;
    //   114: aload_0
    //   115: aload_0
    //   116: getfield 335	jwe:l	Ljtw;
    //   119: aload_2
    //   120: invokeinterface 340 2 0
    //   125: putfield 342	jwe:i	Z
    //   128: aload 10
    //   130: checkcast 160	jxg
    //   133: aload_0
    //   134: getfield 342	jwe:i	Z
    //   137: putfield 345	jxg:H	Z
    //   140: aload_0
    //   141: invokevirtual 235	jwe:k	()Ljtx;
    //   144: aload_0
    //   145: invokespecial 237	jwe:v	()Lgzi;
    //   148: invokeinterface 347 2 0
    //   153: aload_0
    //   154: getfield 349	jwe:D	Ljtr;
    //   157: ifnonnull +20 -> 177
    //   160: aload_0
    //   161: aload_0
    //   162: getfield 86	jwe:b	Landroid/content/Context;
    //   165: ldc_w 351
    //   168: invokestatic 93	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   171: checkcast 351	jtr
    //   174: putfield 349	jwe:D	Ljtr;
    //   177: aload_0
    //   178: getfield 349	jwe:D	Ljtr;
    //   181: astore 11
    //   183: iload_3
    //   184: ifne +135 -> 319
    //   187: aload 11
    //   189: aload_0
    //   190: invokeinterface 354 2 0
    //   195: aload 4
    //   197: monitorexit
    //   198: return
    //   199: astore 5
    //   201: aload 4
    //   203: monitorexit
    //   204: aload 5
    //   206: athrow
    //   207: aload_0
    //   208: getfield 356	jwe:t	Ljwi;
    //   211: ifnonnull +15 -> 226
    //   214: aload_0
    //   215: new 358	jwi
    //   218: dup
    //   219: aload_0
    //   220: invokespecial 359	jwi:<init>	(Ljwe;)V
    //   223: putfield 356	jwe:t	Ljwi;
    //   226: aload_0
    //   227: getfield 356	jwe:t	Ljwi;
    //   230: astore 8
    //   232: goto -180 -> 52
    //   235: aload_1
    //   236: invokevirtual 243	lly:f	()Z
    //   239: ifeq +16 -> 255
    //   242: aload_0
    //   243: invokespecial 245	jwe:t	()Ljwz;
    //   246: aload_1
    //   247: invokevirtual 360	jwz:a	(Llly;)Ljtu;
    //   250: astore 10
    //   252: goto -162 -> 90
    //   255: aload_1
    //   256: invokevirtual 248	lly:e	()Z
    //   259: ifeq +16 -> 275
    //   262: aload_0
    //   263: invokespecial 250	jwe:s	()Ljwy;
    //   266: aload_1
    //   267: invokevirtual 361	jwy:a	(Llly;)Ljtu;
    //   270: astore 10
    //   272: goto -182 -> 90
    //   275: aload_1
    //   276: invokevirtual 253	lly:d	()Z
    //   279: ifeq +16 -> 295
    //   282: aload_0
    //   283: invokespecial 255	jwe:r	()Ljxo;
    //   286: aload_1
    //   287: invokevirtual 362	jxo:a	(Llly;)Ljtu;
    //   290: astore 10
    //   292: goto -202 -> 90
    //   295: aload_1
    //   296: invokevirtual 258	lly:c	()Z
    //   299: ifeq +16 -> 315
    //   302: aload_0
    //   303: invokespecial 260	jwe:q	()Ljwx;
    //   306: aload_1
    //   307: invokevirtual 363	jwx:a	(Llly;)Ljtu;
    //   310: astore 10
    //   312: goto -222 -> 90
    //   315: aload 4
    //   317: monitorexit
    //   318: return
    //   319: aconst_null
    //   320: astore_0
    //   321: goto -134 -> 187
    //   324: iconst_0
    //   325: istore 9
    //   327: goto -261 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	330	0	this	jwe
    //   0	330	1	paramlly	lly
    //   0	330	2	paramString	String
    //   0	330	3	paramBoolean	boolean
    //   4	312	4	localObject1	Object
    //   199	6	5	localObject2	Object
    //   36	31	6	localjxa	jxa
    //   50	181	8	localjwi	jwi
    //   64	262	9	bool	boolean
    //   88	223	10	localjtu	jtu
    //   181	7	11	localjtr	jtr
    // Exception table:
    //   from	to	target	type
    //   13	16	199	finally
    //   17	45	199	finally
    //   52	59	199	finally
    //   66	90	199	finally
    //   90	114	199	finally
    //   114	177	199	finally
    //   177	183	199	finally
    //   187	198	199	finally
    //   201	204	199	finally
    //   207	226	199	finally
    //   226	232	199	finally
    //   235	252	199	finally
    //   255	272	199	finally
    //   275	292	199	finally
    //   295	312	199	finally
    //   315	318	199	finally
  }
  
  public final boolean a(int paramInt)
  {
    if (this.c == null) {}
    for (int i1 = 0;; i1 = this.c.i)
    {
      int i2 = ehr.dq;
      boolean bool = false;
      if (paramInt >= i2)
      {
        int i3 = i1 + i2;
        bool = false;
        if (paramInt < i3)
        {
          b(paramInt - i2);
          bool = true;
        }
      }
      return bool;
    }
  }
  
  public final jtu b()
  {
    if (this.c == null) {
      return null;
    }
    return j();
  }
  
  final void b(int paramInt)
  {
    if (!efj.J(this.b.getApplicationContext())) {
      jxn.a(this.b).a(this.b.getString(eyg.az));
    }
    jxg localjxg;
    do
    {
      boolean bool1;
      do
      {
        return;
        if (this.E == null)
        {
          ill localill = new ill(this.b, this.f.c());
          localill.a.add(ine.class);
          this.E = localill;
        }
        bool1 = this.E.a();
        if (!bool1) {
          this.b.startActivity(this.E.b());
        }
      } while (!bool1);
      localjxg = (jxg)c();
    } while (localjxg.w);
    int i1 = this.c.k;
    boolean bool2 = c(paramInt);
    this.i = false;
    localjxg.H = false;
    if (bool2) {
      k().b(this.d, this.c, i1, this.y);
    }
    for (;;)
    {
      this.l.b(this.d);
      return;
      k().a(this.d, this.c, i1, this.y);
    }
  }
  
  public final jtu c()
  {
    if (this.c == null) {
      return null;
    }
    if (this.c.g()) {
      return u();
    }
    if (this.c.f()) {
      return t();
    }
    if (this.c.e()) {
      return s();
    }
    if (this.c.d()) {
      return r();
    }
    if (this.c.c()) {
      return q();
    }
    String str1 = a;
    String str2 = String.valueOf(this.c.a);
    if (str2.length() != 0) {}
    for (String str3 = "Unknown poll type for poll id ".concat(str2);; str3 = new String("Unknown poll type for poll id "))
    {
      Log.e(str1, str3);
      return null;
    }
  }
  
  public final boolean c(int paramInt)
  {
    jxg localjxg = (jxg)c();
    boolean bool;
    int i1;
    label29:
    int i2;
    if (localjxg.x == paramInt)
    {
      bool = true;
      if (localjxg.x == -1) {
        break label192;
      }
      i1 = 1;
      localjxg.w = true;
      if (localjxg.x != paramInt) {
        break label198;
      }
      i2 = 1;
      label45:
      if (localjxg.x == -1) {
        break label204;
      }
    }
    label192:
    label198:
    label204:
    for (int i3 = 1;; i3 = 0)
    {
      if (i2 == 0) {
        break label210;
      }
      localjxg.c.h[paramInt].c = Math.max(0L, localjxg.c.h[paramInt].c - 1L);
      localjxg.v -= 1L;
      localjxg.c.e = Math.max(0L, localjxg.v);
      localjxg.x = -1;
      localjxg.t.setVisibility(8);
      lly locallly = localjxg.c;
      int i4 = localjxg.x;
      if (locallly.a()) {
        locallly.k = i4;
      }
      for (int i5 = 0; i5 < localjxg.y; i5++)
      {
        localjxg.b(i5);
        localjxg.c(i5);
      }
      bool = false;
      break;
      i1 = 0;
      break label29;
      i2 = 0;
      break label45;
    }
    label210:
    localjxg.c.h[paramInt].c = Math.max(0L, 1L + localjxg.c.h[paramInt].c);
    if (i3 != 0)
    {
      localjxg.c.h[localjxg.x].c = Math.max(0L, localjxg.c.h[localjxg.x].c - 1L);
      localjxg.t.setVisibility(8);
    }
    for (;;)
    {
      localjxg.x = paramInt;
      localjxg.d(paramInt);
      break;
      localjxg.v = (1L + localjxg.v);
      localjxg.c.e = Math.max(0L, localjxg.v);
    }
    Context localContext = localjxg.getContext();
    iee localiee = (iee)mbb.a(localContext, iee.class);
    if ((localjxg.u != null) && (!localiee.b(localjxg.u.d)))
    {
      giz localgiz = (giz)mbb.a(localContext, giz.class);
      new ieg(localContext).a(localgiz.b(localjxg.G.c()), Integer.toString(pkh.u.a));
      localjxg.u.setVisibility(0);
      localiee.c(localjxg.u);
      localjxg.u.post(new jxm(localjxg));
    }
    if (i2 != 0) {
      if (localjxg.o()) {
        localjxg.k();
      }
    }
    for (;;)
    {
      localjxg.i();
      if ((bool) || (i1 == 0)) {
        j().b(this.b);
      }
      return bool;
      localjxg.j();
      continue;
      if (i3 != 0)
      {
        localjxg.k();
      }
      else if (((localjxg.n()) && (localjxg.v > 1L)) || (localjxg.H))
      {
        localjxg.k();
      }
      else
      {
        jxb localjxb = localjxg.D;
        ImageView localImageView = localjxg.t;
        View localView1 = (View)localjxg.p.get(paramInt);
        View localView2 = (View)localjxg.r.get(paramInt);
        float f1 = localjxg.F;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(localjxb.a(localImageView, 1.0F, f1));
        localArrayList.add(localjxb.b(localImageView, 1.0F, 1.1F));
        localArrayList.add(localjxb.a(localView1, 1.0F, f1));
        localArrayList.add(localjxb.b(localView1, 1.0F, 1.1F));
        localArrayList.add(localjxb.a(localView2, 1.0F, f1));
        localArrayList.add(localjxb.b(localView2, 1.0F, 1.1F));
        jxg.a(localjxg.E);
        localjxg.E = null;
        localjxg.E = new AnimatorSet();
        localjxg.E.playTogether(localArrayList);
        localjxg.E.setDuration(300L);
        localjxg.E.addListener(new jxh(localjxg));
        localjxg.E.start();
      }
    }
  }
  
  public final View d()
  {
    if (this.s == null)
    {
      this.s = new TextView(this.b);
      this.s.setText(eyg.aE);
    }
    return this.s;
  }
  
  public final lly e()
  {
    return this.c;
  }
  
  public final String f()
  {
    return this.d;
  }
  
  public final boolean g()
  {
    return this.y;
  }
  
  public final boolean h()
  {
    return this.i;
  }
  
  public final String i()
  {
    if (this.c == null) {
      return null;
    }
    Resources localResources = this.b.getResources();
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = this.c.i;
    int i2 = efj.Ts;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i1);
    String str = localResources.getQuantityString(i2, i1, arrayOfObject);
    CharSequence[] arrayOfCharSequence = new CharSequence[2];
    arrayOfCharSequence[0] = str;
    arrayOfCharSequence[1] = this.m.c(this.b);
    efj.a(localStringBuilder, arrayOfCharSequence);
    return localStringBuilder.toString();
  }
  
  public final jxa j()
  {
    if (this.m == null) {
      this.m = new jxa(this.b);
    }
    return this.m;
  }
  
  public final jtx k()
  {
    if (this.A == null) {
      this.A = ((jtx)mbb.a(this.b, jtx.class));
    }
    return this.A;
  }
  
  final jty l()
  {
    if (this.B == null) {
      this.B = new jty(this);
    }
    return this.B;
  }
  
  final jtz m()
  {
    if (this.C == null) {
      this.C = new jtz(this);
    }
    return this.C;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwe
 * JD-Core Version:    0.7.0.1
 */