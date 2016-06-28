package android.support.v7.widget;

import aea;
import aeb;
import aec;
import afr;
import afz;
import aga;
import agb;
import agd;
import age;
import agf;
import agg;
import agh;
import agi;
import agj;
import agk;
import agl;
import agm;
import agn;
import agp;
import agr;
import ags;
import agt;
import agu;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import kl;
import ms;
import mw;
import mx;
import my;
import nd;
import nf;
import ni;
import nj;
import ns;
import pl;
import pn;
import ru;
import rx;
import sp;
import sq;
import x;

public class RecyclerView
  extends ViewGroup
  implements mx, nd
{
  public static final Interpolator F;
  private static final Class<?>[] G;
  public static final boolean a;
  public boolean A;
  public boolean B;
  public age C;
  public boolean D;
  public agu E;
  private final agm H;
  private agn I;
  private final Rect J;
  private final ArrayList<x> K;
  private x L;
  private boolean M;
  private boolean N;
  private int O;
  private final AccessibilityManager P;
  private int Q;
  private int R;
  private VelocityTracker S;
  private int T;
  private int U;
  private int V;
  private int W;
  private int aa;
  private final int ab;
  private final int ac;
  private float ad;
  private final int[] ae;
  private final my af;
  private final int[] ag;
  private final int[] ah;
  private final int[] ai;
  private Runnable aj;
  public final agl b;
  public afr c;
  public aea d;
  public boolean e;
  public final Runnable f;
  public aga g;
  public agh h;
  public final ArrayList<agf> i;
  public boolean j;
  public boolean k;
  public boolean l;
  public boolean m;
  public boolean n;
  public boolean o;
  public final boolean p;
  public boolean q;
  public int r;
  public ru s;
  public ru t;
  public ru u;
  public ru v;
  public agd w;
  public final ags x;
  public final agr y;
  public List<agj> z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20)) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = AttributeSet.class;
      arrayOfClass[2] = Integer.TYPE;
      arrayOfClass[3] = Integer.TYPE;
      G = arrayOfClass;
      F = new afz();
      return;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  /* Error */
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 146	android/view/ViewGroup:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 148	agm
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 151	agm:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   16: putfield 153	android/support/v7/widget/RecyclerView:H	Lagm;
    //   19: aload_0
    //   20: new 155	agl
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 156	agl:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   28: putfield 158	android/support/v7/widget/RecyclerView:b	Lagl;
    //   31: aload_0
    //   32: new 160	afx
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 161	afx:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   40: putfield 163	android/support/v7/widget/RecyclerView:f	Ljava/lang/Runnable;
    //   43: aload_0
    //   44: new 165	android/graphics/Rect
    //   47: dup
    //   48: invokespecial 166	android/graphics/Rect:<init>	()V
    //   51: putfield 168	android/support/v7/widget/RecyclerView:J	Landroid/graphics/Rect;
    //   54: aload_0
    //   55: new 170	java/util/ArrayList
    //   58: dup
    //   59: invokespecial 171	java/util/ArrayList:<init>	()V
    //   62: putfield 173	android/support/v7/widget/RecyclerView:i	Ljava/util/ArrayList;
    //   65: aload_0
    //   66: new 170	java/util/ArrayList
    //   69: dup
    //   70: invokespecial 171	java/util/ArrayList:<init>	()V
    //   73: putfield 175	android/support/v7/widget/RecyclerView:K	Ljava/util/ArrayList;
    //   76: aload_0
    //   77: iconst_0
    //   78: putfield 177	android/support/v7/widget/RecyclerView:q	Z
    //   81: aload_0
    //   82: iconst_0
    //   83: putfield 179	android/support/v7/widget/RecyclerView:r	I
    //   86: aload_0
    //   87: new 181	aed
    //   90: dup
    //   91: invokespecial 182	aed:<init>	()V
    //   94: putfield 184	android/support/v7/widget/RecyclerView:w	Lagd;
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield 186	android/support/v7/widget/RecyclerView:Q	I
    //   102: aload_0
    //   103: iconst_m1
    //   104: putfield 188	android/support/v7/widget/RecyclerView:R	I
    //   107: aload_0
    //   108: ldc 189
    //   110: putfield 191	android/support/v7/widget/RecyclerView:ad	F
    //   113: aload_0
    //   114: new 193	ags
    //   117: dup
    //   118: aload_0
    //   119: invokespecial 194	ags:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   122: putfield 196	android/support/v7/widget/RecyclerView:x	Lags;
    //   125: aload_0
    //   126: new 198	agr
    //   129: dup
    //   130: invokespecial 199	agr:<init>	()V
    //   133: putfield 201	android/support/v7/widget/RecyclerView:y	Lagr;
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield 203	android/support/v7/widget/RecyclerView:A	Z
    //   141: aload_0
    //   142: iconst_0
    //   143: putfield 205	android/support/v7/widget/RecyclerView:B	Z
    //   146: aload_0
    //   147: new 207	age
    //   150: dup
    //   151: aload_0
    //   152: invokespecial 208	age:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   155: putfield 210	android/support/v7/widget/RecyclerView:C	Lage;
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield 212	android/support/v7/widget/RecyclerView:D	Z
    //   163: aload_0
    //   164: iconst_2
    //   165: newarray int
    //   167: putfield 214	android/support/v7/widget/RecyclerView:ae	[I
    //   170: aload_0
    //   171: iconst_2
    //   172: newarray int
    //   174: putfield 216	android/support/v7/widget/RecyclerView:ag	[I
    //   177: aload_0
    //   178: iconst_2
    //   179: newarray int
    //   181: putfield 218	android/support/v7/widget/RecyclerView:ah	[I
    //   184: aload_0
    //   185: iconst_2
    //   186: newarray int
    //   188: putfield 220	android/support/v7/widget/RecyclerView:ai	[I
    //   191: aload_0
    //   192: new 222	afy
    //   195: dup
    //   196: aload_0
    //   197: invokespecial 223	afy:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   200: putfield 225	android/support/v7/widget/RecyclerView:aj	Ljava/lang/Runnable;
    //   203: aload_0
    //   204: iconst_1
    //   205: invokevirtual 229	android/support/v7/widget/RecyclerView:setScrollContainer	(Z)V
    //   208: aload_0
    //   209: iconst_1
    //   210: invokevirtual 232	android/support/v7/widget/RecyclerView:setFocusableInTouchMode	(Z)V
    //   213: getstatic 103	android/os/Build$VERSION:SDK_INT	I
    //   216: bipush 16
    //   218: if_icmplt +377 -> 595
    //   221: iconst_1
    //   222: istore 4
    //   224: aload_0
    //   225: iload 4
    //   227: putfield 234	android/support/v7/widget/RecyclerView:p	Z
    //   230: aload_1
    //   231: invokestatic 240	android/view/ViewConfiguration:get	(Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   234: astore 5
    //   236: aload_0
    //   237: aload 5
    //   239: invokevirtual 244	android/view/ViewConfiguration:getScaledTouchSlop	()I
    //   242: putfield 246	android/support/v7/widget/RecyclerView:aa	I
    //   245: aload_0
    //   246: aload 5
    //   248: invokevirtual 249	android/view/ViewConfiguration:getScaledMinimumFlingVelocity	()I
    //   251: putfield 251	android/support/v7/widget/RecyclerView:ab	I
    //   254: aload_0
    //   255: aload 5
    //   257: invokevirtual 254	android/view/ViewConfiguration:getScaledMaximumFlingVelocity	()I
    //   260: putfield 256	android/support/v7/widget/RecyclerView:ac	I
    //   263: getstatic 261	nj:a	Lns;
    //   266: aload_0
    //   267: invokevirtual 266	ns:a	(Landroid/view/View;)I
    //   270: iconst_2
    //   271: if_icmpne +330 -> 601
    //   274: iconst_1
    //   275: istore 6
    //   277: aload_0
    //   278: iload 6
    //   280: invokevirtual 269	android/support/v7/widget/RecyclerView:setWillNotDraw	(Z)V
    //   283: aload_0
    //   284: getfield 184	android/support/v7/widget/RecyclerView:w	Lagd;
    //   287: aload_0
    //   288: getfield 210	android/support/v7/widget/RecyclerView:C	Lage;
    //   291: putfield 273	agd:h	Lage;
    //   294: aload_0
    //   295: new 275	afr
    //   298: dup
    //   299: new 277	acz
    //   302: dup
    //   303: aload_0
    //   304: invokespecial 278	acz:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   307: invokespecial 281	afr:<init>	(Lacz;)V
    //   310: putfield 283	android/support/v7/widget/RecyclerView:c	Lafr;
    //   313: aload_0
    //   314: new 285	aea
    //   317: dup
    //   318: new 287	aec
    //   321: dup
    //   322: aload_0
    //   323: invokespecial 288	aec:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   326: invokespecial 291	aea:<init>	(Laec;)V
    //   329: putfield 293	android/support/v7/widget/RecyclerView:d	Laea;
    //   332: getstatic 261	nj:a	Lns;
    //   335: aload_0
    //   336: invokevirtual 295	ns:m	(Landroid/view/View;)I
    //   339: ifne +11 -> 350
    //   342: getstatic 261	nj:a	Lns;
    //   345: aload_0
    //   346: iconst_1
    //   347: invokevirtual 298	ns:c	(Landroid/view/View;I)V
    //   350: aload_0
    //   351: aload_0
    //   352: invokevirtual 302	android/support/v7/widget/RecyclerView:getContext	()Landroid/content/Context;
    //   355: ldc_w 304
    //   358: invokevirtual 308	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   361: checkcast 310	android/view/accessibility/AccessibilityManager
    //   364: putfield 312	android/support/v7/widget/RecyclerView:P	Landroid/view/accessibility/AccessibilityManager;
    //   367: aload_0
    //   368: new 314	agu
    //   371: dup
    //   372: aload_0
    //   373: invokespecial 315	agu:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   376: putfield 317	android/support/v7/widget/RecyclerView:E	Lagu;
    //   379: aload_0
    //   380: getfield 317	android/support/v7/widget/RecyclerView:E	Lagu;
    //   383: astore 7
    //   385: getstatic 261	nj:a	Lns;
    //   388: aload_0
    //   389: aload 7
    //   391: invokevirtual 320	ns:a	(Landroid/view/View;Lld;)V
    //   394: aload_2
    //   395: ifnull +182 -> 577
    //   398: aload_1
    //   399: aload_2
    //   400: getstatic 324	ach:a	[I
    //   403: iload_3
    //   404: iconst_0
    //   405: invokevirtual 328	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   408: astore 8
    //   410: aload 8
    //   412: getstatic 330	ach:b	I
    //   415: invokevirtual 336	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   418: astore 9
    //   420: aload 8
    //   422: invokevirtual 339	android/content/res/TypedArray:recycle	()V
    //   425: aload 9
    //   427: ifnull +150 -> 577
    //   430: aload 9
    //   432: invokevirtual 345	java/lang/String:trim	()Ljava/lang/String;
    //   435: astore 10
    //   437: aload 10
    //   439: invokevirtual 348	java/lang/String:length	()I
    //   442: ifeq +135 -> 577
    //   445: aload 10
    //   447: iconst_0
    //   448: invokevirtual 352	java/lang/String:charAt	(I)C
    //   451: bipush 46
    //   453: if_icmpne +154 -> 607
    //   456: new 354	java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   463: aload_1
    //   464: invokevirtual 358	android/content/Context:getPackageName	()Ljava/lang/String;
    //   467: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: aload 10
    //   472: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   475: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   478: astore 11
    //   480: aload_0
    //   481: invokevirtual 369	android/support/v7/widget/RecyclerView:isInEditMode	()Z
    //   484: ifeq +177 -> 661
    //   487: aload_0
    //   488: invokevirtual 375	java/lang/Object:getClass	()Ljava/lang/Class;
    //   491: invokevirtual 379	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   494: astore 18
    //   496: aload 18
    //   498: aload 11
    //   500: invokevirtual 385	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   503: ldc_w 387
    //   506: invokevirtual 391	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   509: astore 19
    //   511: aload 19
    //   513: getstatic 119	android/support/v7/widget/RecyclerView:G	[Ljava/lang/Class;
    //   516: invokevirtual 395	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   519: astore 26
    //   521: iconst_4
    //   522: anewarray 371	java/lang/Object
    //   525: astore 25
    //   527: aload 25
    //   529: iconst_0
    //   530: aload_1
    //   531: aastore
    //   532: aload 25
    //   534: iconst_1
    //   535: aload_2
    //   536: aastore
    //   537: aload 25
    //   539: iconst_2
    //   540: iload_3
    //   541: invokestatic 399	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   544: aastore
    //   545: aload 25
    //   547: iconst_3
    //   548: iconst_0
    //   549: invokestatic 399	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   552: aastore
    //   553: aload 26
    //   555: astore 24
    //   557: aload 24
    //   559: iconst_1
    //   560: invokevirtual 404	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   563: aload_0
    //   564: aload 24
    //   566: aload 25
    //   568: invokevirtual 408	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   571: checkcast 387	agh
    //   574: invokevirtual 411	android/support/v7/widget/RecyclerView:a	(Lagh;)V
    //   577: aload_0
    //   578: new 413	my
    //   581: dup
    //   582: aload_0
    //   583: invokespecial 416	my:<init>	(Landroid/view/View;)V
    //   586: putfield 418	android/support/v7/widget/RecyclerView:af	Lmy;
    //   589: aload_0
    //   590: iconst_1
    //   591: invokevirtual 421	android/support/v7/widget/RecyclerView:setNestedScrollingEnabled	(Z)V
    //   594: return
    //   595: iconst_0
    //   596: istore 4
    //   598: goto -374 -> 224
    //   601: iconst_0
    //   602: istore 6
    //   604: goto -327 -> 277
    //   607: aload 10
    //   609: ldc_w 423
    //   612: invokevirtual 427	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   615: ifeq +10 -> 625
    //   618: aload 10
    //   620: astore 11
    //   622: goto -142 -> 480
    //   625: new 354	java/lang/StringBuilder
    //   628: dup
    //   629: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   632: ldc 2
    //   634: invokevirtual 431	java/lang/Class:getPackage	()Ljava/lang/Package;
    //   637: invokevirtual 436	java/lang/Package:getName	()Ljava/lang/String;
    //   640: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: bipush 46
    //   645: invokevirtual 439	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   648: aload 10
    //   650: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   656: astore 11
    //   658: goto -178 -> 480
    //   661: aload_1
    //   662: invokevirtual 440	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   665: astore 17
    //   667: aload 17
    //   669: astore 18
    //   671: goto -175 -> 496
    //   674: astore 20
    //   676: aload 19
    //   678: iconst_0
    //   679: anewarray 107	java/lang/Class
    //   682: invokevirtual 395	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   685: astore 23
    //   687: aload 23
    //   689: astore 24
    //   691: aconst_null
    //   692: astore 25
    //   694: goto -137 -> 557
    //   697: astore 21
    //   699: aload 21
    //   701: aload 20
    //   703: invokevirtual 444	java/lang/NoSuchMethodException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   706: pop
    //   707: new 446	java/lang/IllegalStateException
    //   710: dup
    //   711: new 354	java/lang/StringBuilder
    //   714: dup
    //   715: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   718: aload_2
    //   719: invokeinterface 449 1 0
    //   724: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: ldc_w 451
    //   730: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: aload 11
    //   735: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   738: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   741: aload 21
    //   743: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   746: athrow
    //   747: astore 16
    //   749: new 446	java/lang/IllegalStateException
    //   752: dup
    //   753: new 354	java/lang/StringBuilder
    //   756: dup
    //   757: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   760: aload_2
    //   761: invokeinterface 449 1 0
    //   766: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   769: ldc_w 456
    //   772: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   775: aload 11
    //   777: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   780: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   783: aload 16
    //   785: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   788: athrow
    //   789: astore 15
    //   791: new 446	java/lang/IllegalStateException
    //   794: dup
    //   795: new 354	java/lang/StringBuilder
    //   798: dup
    //   799: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   802: aload_2
    //   803: invokeinterface 449 1 0
    //   808: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: ldc_w 458
    //   814: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: aload 11
    //   819: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   822: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   825: aload 15
    //   827: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   830: athrow
    //   831: astore 14
    //   833: new 446	java/lang/IllegalStateException
    //   836: dup
    //   837: new 354	java/lang/StringBuilder
    //   840: dup
    //   841: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   844: aload_2
    //   845: invokeinterface 449 1 0
    //   850: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   853: ldc_w 458
    //   856: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   859: aload 11
    //   861: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   867: aload 14
    //   869: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   872: athrow
    //   873: astore 13
    //   875: new 446	java/lang/IllegalStateException
    //   878: dup
    //   879: new 354	java/lang/StringBuilder
    //   882: dup
    //   883: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   886: aload_2
    //   887: invokeinterface 449 1 0
    //   892: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: ldc_w 460
    //   898: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   901: aload 11
    //   903: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   909: aload 13
    //   911: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   914: athrow
    //   915: astore 12
    //   917: new 446	java/lang/IllegalStateException
    //   920: dup
    //   921: new 354	java/lang/StringBuilder
    //   924: dup
    //   925: invokespecial 355	java/lang/StringBuilder:<init>	()V
    //   928: aload_2
    //   929: invokeinterface 449 1 0
    //   934: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: ldc_w 462
    //   940: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   943: aload 11
    //   945: invokevirtual 362	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   948: invokevirtual 365	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   951: aload 12
    //   953: invokespecial 454	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   956: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	957	0	this	RecyclerView
    //   0	957	1	paramContext	Context
    //   0	957	2	paramAttributeSet	AttributeSet
    //   0	957	3	paramInt	int
    //   222	375	4	bool1	boolean
    //   234	22	5	localViewConfiguration	android.view.ViewConfiguration
    //   275	328	6	bool2	boolean
    //   383	7	7	localagu	agu
    //   408	13	8	localTypedArray	android.content.res.TypedArray
    //   418	13	9	str1	String
    //   435	214	10	str2	String
    //   478	466	11	str3	String
    //   915	37	12	localClassCastException	java.lang.ClassCastException
    //   873	37	13	localIllegalAccessException	java.lang.IllegalAccessException
    //   831	37	14	localInstantiationException	java.lang.InstantiationException
    //   789	37	15	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   747	37	16	localClassNotFoundException	java.lang.ClassNotFoundException
    //   665	3	17	localClassLoader	java.lang.ClassLoader
    //   494	176	18	localObject1	java.lang.Object
    //   509	168	19	localClass	Class
    //   674	28	20	localNoSuchMethodException1	java.lang.NoSuchMethodException
    //   697	45	21	localNoSuchMethodException2	java.lang.NoSuchMethodException
    //   685	3	23	localConstructor1	java.lang.reflect.Constructor
    //   555	135	24	localObject2	java.lang.Object
    //   525	168	25	arrayOfObject	java.lang.Object[]
    //   519	35	26	localConstructor2	java.lang.reflect.Constructor
    // Exception table:
    //   from	to	target	type
    //   511	553	674	java/lang/NoSuchMethodException
    //   676	687	697	java/lang/NoSuchMethodException
    //   480	496	747	java/lang/ClassNotFoundException
    //   496	511	747	java/lang/ClassNotFoundException
    //   511	553	747	java/lang/ClassNotFoundException
    //   557	577	747	java/lang/ClassNotFoundException
    //   661	667	747	java/lang/ClassNotFoundException
    //   676	687	747	java/lang/ClassNotFoundException
    //   699	747	747	java/lang/ClassNotFoundException
    //   480	496	789	java/lang/reflect/InvocationTargetException
    //   496	511	789	java/lang/reflect/InvocationTargetException
    //   511	553	789	java/lang/reflect/InvocationTargetException
    //   557	577	789	java/lang/reflect/InvocationTargetException
    //   661	667	789	java/lang/reflect/InvocationTargetException
    //   676	687	789	java/lang/reflect/InvocationTargetException
    //   699	747	789	java/lang/reflect/InvocationTargetException
    //   480	496	831	java/lang/InstantiationException
    //   496	511	831	java/lang/InstantiationException
    //   511	553	831	java/lang/InstantiationException
    //   557	577	831	java/lang/InstantiationException
    //   661	667	831	java/lang/InstantiationException
    //   676	687	831	java/lang/InstantiationException
    //   699	747	831	java/lang/InstantiationException
    //   480	496	873	java/lang/IllegalAccessException
    //   496	511	873	java/lang/IllegalAccessException
    //   511	553	873	java/lang/IllegalAccessException
    //   557	577	873	java/lang/IllegalAccessException
    //   661	667	873	java/lang/IllegalAccessException
    //   676	687	873	java/lang/IllegalAccessException
    //   699	747	873	java/lang/IllegalAccessException
    //   480	496	915	java/lang/ClassCastException
    //   496	511	915	java/lang/ClassCastException
    //   511	553	915	java/lang/ClassCastException
    //   557	577	915	java/lang/ClassCastException
    //   661	667	915	java/lang/ClassCastException
    //   676	687	915	java/lang/ClassCastException
    //   699	747	915	java/lang/ClassCastException
  }
  
  private final void a(agg paramagg)
  {
    View localView = paramagg.a.a;
    a(paramagg.a);
    int i1 = paramagg.b;
    int i2 = paramagg.c;
    int i3 = localView.getLeft();
    int i4 = localView.getTop();
    if ((0x8 & paramagg.a.i) != 0) {}
    for (int i5 = 1; (i5 == 0) && ((i1 != i3) || (i2 != i4)); i5 = 0)
    {
      paramagg.a.a(false);
      localView.layout(i3, i4, i3 + localView.getWidth(), i4 + localView.getHeight());
      if (this.w.a(paramagg.a, i1, i2, i3, i4)) {
        m();
      }
      return;
    }
    paramagg.a.a(false);
    this.w.a(paramagg.a);
    m();
  }
  
  private final void a(agt paramagt)
  {
    View localView = paramagt.a;
    if (localView.getParent() == this) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.b.b(a(localView));
      if (!paramagt.e()) {
        break;
      }
      this.d.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.d.a(localView, -1, true);
      return;
    }
    aea localaea = this.d;
    int i2 = localaea.a.a(localView);
    if (i2 < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + localView);
    }
    localaea.b.a(i2);
    localaea.a(localView);
  }
  
  private final void a(MotionEvent paramMotionEvent)
  {
    int i1 = ms.b(paramMotionEvent);
    if (ms.a.b(paramMotionEvent, i1) == this.R) {
      if (i1 != 0) {
        break label93;
      }
    }
    label93:
    for (int i2 = 1;; i2 = 0)
    {
      this.R = ms.a.b(paramMotionEvent, i2);
      int i3 = (int)(0.5F + ms.a.c(paramMotionEvent, i2));
      this.V = i3;
      this.T = i3;
      int i4 = (int)(0.5F + ms.a.d(paramMotionEvent, i2));
      this.W = i4;
      this.U = i4;
      return;
    }
  }
  
  private final void a(kl<View, Rect> paramkl)
  {
    List localList = this.y.e;
    int i1 = -1 + localList.size();
    if (i1 >= 0)
    {
      View localView = (View)localList.get(i1);
      agt localagt = b(localView);
      agg localagg = (agg)this.y.b.remove(localagt);
      if (!this.y.j) {
        this.y.c.remove(localagt);
      }
      if (paramkl.remove(localView) != null)
      {
        agh localagh = this.h;
        agl localagl = this.b;
        aea localaea = localagh.f;
        int i2 = localaea.a.a(localView);
        if (i2 >= 0)
        {
          if (localaea.b.c(i2)) {
            localaea.b(localView);
          }
          localaea.a.a(i2);
        }
        localagl.a(localView);
      }
      for (;;)
      {
        i1--;
        break;
        if (localagg != null) {
          a(localagg);
        } else {
          a(new agg(localagt, localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
        }
      }
    }
    localList.clear();
  }
  
  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    this.f.run();
    aga localaga = this.g;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    if (localaga != null)
    {
      a();
      this.r = (1 + this.r);
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.beginSection("RV Scroll");
      }
      i3 = 0;
      i4 = 0;
      if (paramInt1 != 0)
      {
        i3 = this.h.a(paramInt1, this.b, this.y);
        i4 = paramInt1 - i3;
      }
      i1 = 0;
      i2 = 0;
      if (paramInt2 != 0)
      {
        i1 = this.h.b(paramInt2, this.b, this.y);
        i2 = paramInt2 - i1;
      }
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.endSection();
      }
      if (h())
      {
        int i9 = this.d.a();
        int i10 = 0;
        if (i10 < i9)
        {
          View localView1 = this.d.b(i10);
          agt localagt1 = a(localView1);
          agt localagt2;
          if ((localagt1 != null) && (localagt1.h != null))
          {
            localagt2 = localagt1.h;
            if (localagt2 == null) {
              break label286;
            }
          }
          label286:
          for (View localView2 = localagt2.a;; localView2 = null)
          {
            if (localView2 != null)
            {
              int i11 = localView1.getLeft();
              int i12 = localView1.getTop();
              if ((i11 != localView2.getLeft()) || (i12 != localView2.getTop())) {
                localView2.layout(i11, i12, i11 + localView2.getWidth(), i12 + localView2.getHeight());
              }
            }
            i10++;
            break;
          }
        }
      }
      f();
      a(false);
    }
    int i5 = i2;
    int i6 = i3;
    int i7 = i1;
    if (!this.i.isEmpty()) {
      invalidate();
    }
    if (dispatchNestedScroll(i6, i7, i4, i5, this.ag))
    {
      this.V -= this.ag[0];
      this.W -= this.ag[1];
      if (paramMotionEvent != null) {
        paramMotionEvent.offsetLocation(this.ag[0], this.ag[1]);
      }
      arrayOfInt1 = this.ai;
      arrayOfInt1[0] += this.ag[0];
      arrayOfInt2 = this.ai;
      arrayOfInt2[1] += this.ag[1];
    }
    while (nj.a.a(this) == 2)
    {
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      if ((i6 != 0) || (i7 != 0)) {
        b(i6, i7);
      }
      if (!awakenScrollBars()) {
        invalidate();
      }
      if ((i6 == 0) && (i7 == 0)) {
        break;
      }
      return true;
    }
    float f1;
    float f2;
    float f3;
    float f4;
    int i8;
    if (paramMotionEvent != null)
    {
      f1 = paramMotionEvent.getX();
      f2 = i4;
      f3 = paramMotionEvent.getY();
      f4 = i5;
      if (f2 >= 0.0F) {
        break label684;
      }
      b();
      ru localru4 = this.s;
      float f11 = -f2 / getWidth();
      float f12 = 1.0F - f3 / getHeight();
      boolean bool3 = ru.b.a(localru4.a, f11, f12);
      i8 = 0;
      if (bool3) {
        i8 = 1;
      }
      label588:
      if (f4 >= 0.0F) {
        break label761;
      }
      d();
      ru localru3 = this.t;
      float f9 = -f4 / getHeight();
      float f10 = f1 / getWidth();
      if (ru.b.a(localru3.a, f9, f10)) {
        i8 = 1;
      }
    }
    for (;;)
    {
      if ((i8 != 0) || (f2 != 0.0F) || (f4 != 0.0F)) {
        nj.a.l(this);
      }
      a(paramInt1, paramInt2);
      break;
      label684:
      boolean bool1 = f2 < 0.0F;
      i8 = 0;
      if (!bool1) {
        break label588;
      }
      c();
      ru localru1 = this.u;
      float f5 = f2 / getWidth();
      float f6 = f3 / getHeight();
      boolean bool2 = ru.b.a(localru1.a, f5, f6);
      i8 = 0;
      if (!bool2) {
        break label588;
      }
      i8 = 1;
      break label588;
      label761:
      if (f4 > 0.0F)
      {
        e();
        ru localru2 = this.v;
        float f7 = f4 / getHeight();
        float f8 = 1.0F - f1 / getWidth();
        if (ru.b.a(localru2.a, f7, f8)) {
          i8 = 1;
        }
      }
    }
    return false;
  }
  
  private long b(agt paramagt)
  {
    if (this.g.b) {
      return paramagt.d;
    }
    return paramagt.b;
  }
  
  public static agt b(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((agi)paramView.getLayoutParams()).c;
  }
  
  private boolean c(int paramInt1, int paramInt2)
  {
    if (this.h == null) {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    boolean bool1;
    boolean bool2;
    do
    {
      do
      {
        return false;
      } while (this.n);
      bool1 = this.h.e();
      bool2 = this.h.f();
      if ((!bool1) || (Math.abs(paramInt1) < this.ab)) {
        paramInt1 = 0;
      }
      if ((!bool2) || (Math.abs(paramInt2) < this.ab)) {
        paramInt2 = 0;
      }
    } while (((paramInt1 == 0) && (paramInt2 == 0)) || (dispatchNestedPreFling(paramInt1, paramInt2)));
    if ((bool1) || (bool2)) {}
    for (boolean bool3 = true;; bool3 = false)
    {
      dispatchNestedFling(paramInt1, paramInt2, bool3);
      if (!bool3) {
        break;
      }
      int i1 = Math.max(-this.ac, Math.min(paramInt1, this.ac));
      int i2 = Math.max(-this.ac, Math.min(paramInt2, this.ac));
      ags localags = this.x;
      localags.d.a(2);
      localags.b = 0;
      localags.a = 0;
      localags.c.a(0, 0, i1, i2, -2147483648, 2147483647, -2147483648, 2147483647);
      localags.a();
      return true;
    }
  }
  
  public static int d(View paramView)
  {
    agt localagt = b(paramView);
    if (localagt != null) {
      return localagt.c();
    }
    return -1;
  }
  
  private final void d(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    switch (i1)
    {
    default: 
      i3 = nj.a.o(this);
    }
    switch (i2)
    {
    default: 
      i4 = nj.a.p(this);
    }
    setMeasuredDimension(i3, i4);
  }
  
  private final boolean e(int paramInt1, int paramInt2)
  {
    int i1 = this.d.a();
    boolean bool;
    if (i1 == 0)
    {
      if (paramInt1 == 0)
      {
        bool = false;
        if (paramInt2 == 0) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    for (int i2 = 0;; i2++)
    {
      bool = false;
      if (i2 >= i1) {
        break;
      }
      agt localagt = b(this.d.b(i2));
      if (!localagt.a())
      {
        int i3 = localagt.c();
        if ((i3 < paramInt1) || (i3 > paramInt2)) {
          return true;
        }
      }
    }
  }
  
  private final void j()
  {
    ags localags = this.x;
    localags.d.removeCallbacks(localags);
    sp localsp = localags.c;
    localsp.b.f(localsp.a);
    if (this.h != null)
    {
      agh localagh = this.h;
      if (localagh.h != null) {
        localagh.h.b();
      }
    }
  }
  
  private void k()
  {
    this.v = null;
    this.t = null;
    this.u = null;
    this.s = null;
  }
  
  private final void l()
  {
    if (this.S != null) {
      this.S.clear();
    }
    stopNestedScroll();
    ru localru1 = this.s;
    boolean bool = false;
    if (localru1 != null)
    {
      ru localru5 = this.s;
      bool = ru.b.c(localru5.a);
    }
    if (this.t != null)
    {
      ru localru4 = this.t;
      bool |= ru.b.c(localru4.a);
    }
    if (this.u != null)
    {
      ru localru3 = this.u;
      bool |= ru.b.c(localru3.a);
    }
    if (this.v != null)
    {
      ru localru2 = this.v;
      bool |= ru.b.c(localru2.a);
    }
    if (bool) {
      nj.a.l(this);
    }
  }
  
  private final void m()
  {
    if ((!this.D) && (this.j))
    {
      Runnable localRunnable = this.aj;
      nj.a.a(this, localRunnable);
      this.D = true;
    }
  }
  
  private final void n()
  {
    boolean bool1 = true;
    if (this.q)
    {
      this.c.a();
      p();
      this.h.a();
    }
    int i1;
    label88:
    boolean bool2;
    label148:
    agr localagr2;
    int i2;
    if ((this.w != null) && (this.h.c()))
    {
      this.c.b();
      if (((!this.A) || (this.B)) && (!this.A) && ((!this.B) || (!h()))) {
        break label223;
      }
      i1 = bool1;
      agr localagr1 = this.y;
      if ((!this.l) || (this.w == null) || ((!this.q) && (i1 == 0) && (!this.h.i)) || ((this.q) && (!this.g.b))) {
        break label228;
      }
      bool2 = bool1;
      localagr1.k = bool2;
      localagr2 = this.y;
      if ((!this.y.k) || (i1 == 0) || (this.q)) {
        break label240;
      }
      if ((this.w == null) || (!this.h.c())) {
        break label234;
      }
      i2 = bool1;
      label201:
      if (i2 == 0) {
        break label240;
      }
    }
    for (;;)
    {
      localagr2.l = bool1;
      return;
      this.c.e();
      break;
      label223:
      i1 = 0;
      break label88;
      label228:
      bool2 = false;
      break label148;
      label234:
      i2 = 0;
      break label201;
      label240:
      bool1 = false;
    }
  }
  
  private void o()
  {
    int i1 = 0;
    int i2 = this.d.a.a();
    for (int i3 = 0; i3 < i2; i3++)
    {
      agt localagt4 = b(this.d.a.b(i3));
      if (!localagt4.a())
      {
        localagt4.c = -1;
        localagt4.f = -1;
      }
    }
    agl localagl = this.b;
    int i4 = localagl.c.size();
    for (int i5 = 0; i5 < i4; i5++)
    {
      agt localagt3 = (agt)localagl.c.get(i5);
      localagt3.c = -1;
      localagt3.f = -1;
    }
    int i6 = localagl.a.size();
    for (int i7 = 0; i7 < i6; i7++)
    {
      agt localagt2 = (agt)localagl.a.get(i7);
      localagt2.c = -1;
      localagt2.f = -1;
    }
    if (localagl.b != null)
    {
      int i8 = localagl.b.size();
      while (i1 < i8)
      {
        agt localagt1 = (agt)localagl.b.get(i1);
        localagt1.c = -1;
        localagt1.f = -1;
        i1++;
      }
    }
  }
  
  private void p()
  {
    int i1 = 0;
    int i2 = this.d.a.a();
    for (int i3 = 0; i3 < i2; i3++)
    {
      agt localagt2 = b(this.d.a.b(i3));
      if ((localagt2 != null) && (!localagt2.a())) {
        localagt2.i = (0x6 | localagt2.i);
      }
    }
    int i4 = this.d.a.a();
    for (int i5 = 0; i5 < i4; i5++) {
      ((agi)this.d.a.b(i5).getLayoutParams()).e = true;
    }
    agl localagl1 = this.b;
    int i6 = localagl1.c.size();
    for (int i7 = 0; i7 < i6; i7++)
    {
      agi localagi = (agi)((agt)localagl1.c.get(i7)).a.getLayoutParams();
      if (localagi != null) {
        localagi.e = true;
      }
    }
    agl localagl2 = this.b;
    int i8;
    if ((localagl2.e.g != null) && (localagl2.e.g.b)) {
      i8 = localagl2.c.size();
    }
    while (i1 < i8)
    {
      agt localagt1 = (agt)localagl2.c.get(i1);
      if (localagt1 != null)
      {
        localagt1.i = (0x6 | localagt1.i);
        localagt1.a(null);
      }
      i1++;
      continue;
      localagl2.a();
    }
  }
  
  public final agt a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return b(paramView);
  }
  
  public final void a()
  {
    if (!this.M)
    {
      this.M = true;
      if (!this.n) {
        this.m = false;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == this.Q) {}
    for (;;)
    {
      return;
      this.Q = paramInt;
      if (paramInt != 2) {
        j();
      }
      if (this.h != null) {
        this.h.g(paramInt);
      }
      if (this.z != null) {
        for (int i1 = -1 + this.z.size(); i1 >= 0; i1--) {
          this.z.get(i1);
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    ru localru1 = this.s;
    boolean bool1 = false;
    if (localru1 != null)
    {
      ru localru8 = this.s;
      boolean bool2 = ru.b.a(localru8.a);
      bool1 = false;
      if (!bool2)
      {
        bool1 = false;
        if (paramInt1 > 0)
        {
          ru localru9 = this.s;
          bool1 = ru.b.c(localru9.a);
        }
      }
    }
    if (this.u != null)
    {
      ru localru6 = this.u;
      if ((!ru.b.a(localru6.a)) && (paramInt1 < 0))
      {
        ru localru7 = this.u;
        bool1 |= ru.b.c(localru7.a);
      }
    }
    if (this.t != null)
    {
      ru localru4 = this.t;
      if ((!ru.b.a(localru4.a)) && (paramInt2 > 0))
      {
        ru localru5 = this.t;
        bool1 |= ru.b.c(localru5.a);
      }
    }
    if (this.v != null)
    {
      ru localru2 = this.v;
      if ((!ru.b.a(localru2.a)) && (paramInt2 < 0))
      {
        ru localru3 = this.v;
        bool1 |= ru.b.c(localru3.a);
      }
    }
    if (bool1) {
      nj.a.l(this);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = paramInt1 + paramInt2;
    int i2 = this.d.a.a();
    int i3 = 0;
    if (i3 < i2)
    {
      agt localagt2 = b(this.d.a.b(i3));
      if ((localagt2 != null) && (!localagt2.a()))
      {
        if (localagt2.b < i1) {
          break label89;
        }
        localagt2.a(-paramInt2, paramBoolean);
        this.y.i = true;
      }
      for (;;)
      {
        i3++;
        break;
        label89:
        if (localagt2.b >= paramInt1)
        {
          int i6 = paramInt1 - 1;
          int i7 = -paramInt2;
          localagt2.i = (0x8 | localagt2.i);
          localagt2.a(i7, paramBoolean);
          localagt2.b = i6;
          this.y.i = true;
        }
      }
    }
    agl localagl = this.b;
    int i4 = paramInt1 + paramInt2;
    int i5 = -1 + localagl.c.size();
    if (i5 >= 0)
    {
      agt localagt1 = (agt)localagl.c.get(i5);
      if (localagt1 != null)
      {
        if (localagt1.c() < i4) {
          break label218;
        }
        localagt1.a(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i5--;
        break;
        label218:
        if (localagt1.c() >= paramInt1)
        {
          localagt1.i = (0x8 | localagt1.i);
          localagl.b(i5);
        }
      }
    }
    requestLayout();
  }
  
  public final void a(aga paramaga)
  {
    if (this.n)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      this.n = false;
      if ((this.m) && (this.h != null) && (this.g != null)) {
        requestLayout();
      }
      this.m = false;
    }
    if (this.g != null)
    {
      aga localaga3 = this.g;
      agm localagm2 = this.H;
      localaga3.a.unregisterObserver(localagm2);
    }
    if (this.w != null) {
      this.w.c();
    }
    if (this.h != null)
    {
      this.h.c(this.b);
      this.h.b(this.b);
    }
    agl localagl1 = this.b;
    localagl1.a.clear();
    localagl1.a();
    this.c.a();
    aga localaga1 = this.g;
    this.g = paramaga;
    if (paramaga != null)
    {
      agm localagm1 = this.H;
      paramaga.a.registerObserver(localagm1);
    }
    agl localagl2 = this.b;
    aga localaga2 = this.g;
    localagl2.a.clear();
    localagl2.a();
    agk localagk = localagl2.b();
    if (localaga1 != null) {
      localagk.c = (-1 + localagk.c);
    }
    if (localagk.c == 0) {
      localagk.a.clear();
    }
    if (localaga2 != null) {
      localagk.c = (1 + localagk.c);
    }
    this.y.i = true;
    p();
    requestLayout();
  }
  
  public final void a(agh paramagh)
  {
    if (paramagh == this.h) {
      return;
    }
    if (this.h != null)
    {
      if (this.j)
      {
        agh localagh = this.h;
        agl localagl2 = this.b;
        localagh.j = false;
        localagh.a(this, localagl2);
      }
      this.h.a(null);
    }
    agl localagl1 = this.b;
    localagl1.a.clear();
    localagl1.a();
    aea localaea = this.d;
    localaea.b.a();
    for (int i1 = -1 + localaea.c.size(); i1 >= 0; i1--)
    {
      localaea.a.d((View)localaea.c.get(i1));
      localaea.c.remove(i1);
    }
    localaea.a.b();
    this.h = paramagh;
    if (paramagh != null)
    {
      if (paramagh.g != null) {
        throw new IllegalArgumentException("LayoutManager " + paramagh + " is already attached to a RecyclerView: " + paramagh.g);
      }
      this.h.a(this);
      if (this.j) {
        this.h.j = true;
      }
    }
    requestLayout();
  }
  
  public final void a(String paramString)
  {
    int i1;
    if (this.r > 0) {
      i1 = 1;
    }
    while (i1 != 0) {
      if (paramString == null)
      {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
        i1 = 0;
      }
      else
      {
        throw new IllegalStateException(paramString);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.M)
    {
      if ((paramBoolean) && (this.m) && (!this.n) && (this.h != null) && (this.g != null)) {
        i();
      }
      this.M = false;
      if (!this.n) {
        this.m = false;
      }
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final void b()
  {
    if (this.s != null) {
      return;
    }
    this.s = new ru(getContext());
    if (this.e)
    {
      ru localru2 = this.s;
      int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      int i4 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      ru.b.a(localru2.a, i3, i4);
      return;
    }
    ru localru1 = this.s;
    int i1 = getMeasuredHeight();
    int i2 = getMeasuredWidth();
    ru.b.a(localru1.a, i1, i2);
  }
  
  public final void b(int paramInt)
  {
    if (this.n) {
      return;
    }
    a(0);
    j();
    if (this.h == null)
    {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    this.h.c(paramInt);
    awakenScrollBars();
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    if (this.z != null) {
      for (int i3 = -1 + this.z.size(); i3 >= 0; i3--) {
        ((agj)this.z.get(i3)).a(this, paramInt1, paramInt2);
      }
    }
  }
  
  @Deprecated
  public final int c(View paramView)
  {
    agt localagt = b(paramView);
    if (localagt != null) {
      return localagt.d();
    }
    return -1;
  }
  
  public final void c()
  {
    if (this.u != null) {
      return;
    }
    this.u = new ru(getContext());
    if (this.e)
    {
      ru localru2 = this.u;
      int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      int i4 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      ru.b.a(localru2.a, i3, i4);
      return;
    }
    ru localru1 = this.u;
    int i1 = getMeasuredHeight();
    int i2 = getMeasuredWidth();
    ru.b.a(localru1.a, i1, i2);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof agi)) && (this.h.a((agi)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.h.e()) {
      return this.h.c(this.y);
    }
    return 0;
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.h.e()) {
      return this.h.a(this.y);
    }
    return 0;
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.h.e()) {
      return this.h.e(this.y);
    }
    return 0;
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.h.f()) {
      return this.h.d(this.y);
    }
    return 0;
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.h.f()) {
      return this.h.b(this.y);
    }
    return 0;
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.h.f()) {
      return this.h.f(this.y);
    }
    return 0;
  }
  
  public final void d()
  {
    if (this.t != null) {
      return;
    }
    this.t = new ru(getContext());
    if (this.e)
    {
      ru localru2 = this.t;
      int i3 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      int i4 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      ru.b.a(localru2.a, i3, i4);
      return;
    }
    ru localru1 = this.t;
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    ru.b.a(localru1.a, i1, i2);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.af.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.af.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.af.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.af.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2 = this.i.size();
    for (int i3 = 0; i3 < i2; i3++) {
      this.i.get(i3);
    }
    int i14;
    int i4;
    if (this.s != null)
    {
      ru localru8 = this.s;
      if (!ru.b.a(localru8.a))
      {
        int i13 = paramCanvas.save();
        if (this.e)
        {
          i14 = getPaddingBottom();
          paramCanvas.rotate(270.0F);
          paramCanvas.translate(i14 + -getHeight(), 0.0F);
          if (this.s == null) {
            break label554;
          }
          ru localru9 = this.s;
          if (!ru.b.a(localru9.a, paramCanvas)) {
            break label554;
          }
          i4 = i1;
          label142:
          paramCanvas.restoreToCount(i13);
        }
      }
    }
    for (;;)
    {
      int i12;
      if (this.t != null)
      {
        ru localru6 = this.t;
        if (!ru.b.a(localru6.a))
        {
          int i11 = paramCanvas.save();
          if (this.e) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if (this.t == null) {
            break label560;
          }
          ru localru7 = this.t;
          if (!ru.b.a(localru7.a, paramCanvas)) {
            break label560;
          }
          i12 = i1;
          label237:
          i4 |= i12;
          paramCanvas.restoreToCount(i11);
        }
      }
      int i9;
      label304:
      int i10;
      if (this.u != null)
      {
        ru localru4 = this.u;
        if (!ru.b.a(localru4.a))
        {
          int i7 = paramCanvas.save();
          int i8 = getWidth();
          if (!this.e) {
            break label566;
          }
          i9 = getPaddingTop();
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i9, -i8);
          if (this.u == null) {
            break label572;
          }
          ru localru5 = this.u;
          if (!ru.b.a(localru5.a, paramCanvas)) {
            break label572;
          }
          i10 = i1;
          label356:
          i4 |= i10;
          paramCanvas.restoreToCount(i7);
        }
      }
      if (this.v != null)
      {
        ru localru1 = this.v;
        if (!ru.b.a(localru1.a))
        {
          int i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.e) {
            break label578;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label444:
          ru localru2 = this.v;
          int i6 = 0;
          if (localru2 != null)
          {
            ru localru3 = this.v;
            boolean bool = ru.b.a(localru3.a, paramCanvas);
            i6 = 0;
            if (bool) {
              i6 = i1;
            }
          }
          i4 |= i6;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i4 == 0) && (this.w != null) && (this.i.size() > 0) && (this.w.b())) {}
      for (;;)
      {
        if (i1 != 0) {
          nj.a.l(this);
        }
        return;
        i14 = 0;
        break;
        label554:
        i4 = 0;
        break label142;
        label560:
        i12 = 0;
        break label237;
        label566:
        i9 = 0;
        break label304;
        label572:
        i10 = 0;
        break label356;
        label578:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label444;
        i1 = i4;
      }
      i4 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final Rect e(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    if (!localagi.e) {
      return localagi.d;
    }
    Rect localRect1 = localagi.d;
    localRect1.set(0, 0, 0, 0);
    int i1 = this.i.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.J.set(0, 0, 0, 0);
      ((agf)this.i.get(i2));
      Rect localRect2 = this.J;
      ((agi)paramView.getLayoutParams()).c.c();
      localRect2.set(0, 0, 0, 0);
      localRect1.left += this.J.left;
      localRect1.top += this.J.top;
      localRect1.right += this.J.right;
      localRect1.bottom += this.J.bottom;
    }
    localagi.e = false;
    return localRect1;
  }
  
  public final void e()
  {
    if (this.v != null) {
      return;
    }
    this.v = new ru(getContext());
    if (this.e)
    {
      ru localru2 = this.v;
      int i3 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      int i4 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      ru.b.a(localru2.a, i3, i4);
      return;
    }
    ru localru1 = this.v;
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    ru.b.a(localru1.a, i1, i2);
  }
  
  public final void f()
  {
    this.r = (-1 + this.r);
    if (this.r <= 0)
    {
      this.r = 0;
      int i1 = this.O;
      this.O = 0;
      if ((i1 != 0) && (g()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        localAccessibilityEvent.setEventType(2048);
        pl.a.a(localAccessibilityEvent, i1);
        sendAccessibilityEventUnchecked(localAccessibilityEvent);
      }
    }
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    View localView = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    if ((localView == null) && (this.g != null) && (this.h != null)) {
      if (this.r <= 0) {
        break label82;
      }
    }
    label82:
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 == 0) && (!this.n))
      {
        a();
        localView = this.h.c(paramInt, this.b, this.y);
        a(false);
      }
      if (localView == null) {
        break;
      }
      return localView;
    }
    return super.focusSearch(paramView, paramInt);
  }
  
  public final boolean g()
  {
    return (this.P != null) && (this.P.isEnabled());
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.h == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.h.b();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.h == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.h.a(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.h == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.h.a(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (this.h != null) {
      return -1;
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public final boolean h()
  {
    return (this.w != null) && (this.w.m);
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.af.a != null;
  }
  
  public final void i()
  {
    if (this.g == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (this.h == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    this.y.e.clear();
    a();
    this.r = (1 + this.r);
    n();
    agr localagr1 = this.y;
    if ((this.y.k) && (this.B) && (h())) {}
    int[] arrayOfInt;
    int i1;
    label173:
    int i35;
    for (kl localkl1 = new kl();; localkl1 = null)
    {
      localagr1.d = localkl1;
      this.B = false;
      this.A = false;
      this.y.j = this.y.l;
      this.y.f = this.g.a();
      arrayOfInt = this.ae;
      i1 = this.d.a();
      if (i1 != 0) {
        break;
      }
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      if (!this.y.k) {
        break label436;
      }
      this.y.b.clear();
      this.y.c.clear();
      int i33 = this.d.a();
      for (int i34 = 0;; i34++)
      {
        if (i34 >= i33) {
          break label436;
        }
        agt localagt10 = b(this.d.b(i34));
        if (!localagt10.a())
        {
          if ((0x4 & localagt10.i) == 0) {
            break;
          }
          i35 = 1;
          label257:
          if ((i35 == 0) || (this.g.b))
          {
            View localView3 = localagt10.a;
            this.y.b.put(localagt10, new agg(localagt10, localView3.getLeft(), localView3.getTop(), localView3.getRight(), localView3.getBottom()));
          }
        }
      }
    }
    int i2 = 2147483647;
    int i3 = -2147483648;
    int i4 = 0;
    label345:
    int i36;
    if (i4 < i1)
    {
      agt localagt11 = b(this.d.b(i4));
      if (localagt11.a()) {
        break label2239;
      }
      i36 = localagt11.c();
      if (i36 < i2) {
        i2 = i36;
      }
      if (i36 <= i3) {
        break label2239;
      }
    }
    for (int i37 = i2;; i37 = i2)
    {
      i4++;
      i2 = i37;
      i3 = i36;
      break label345;
      arrayOfInt[0] = i2;
      arrayOfInt[1] = i3;
      break label173;
      i35 = 0;
      break label257;
      label436:
      label575:
      kl localkl4;
      label658:
      int i26;
      label717:
      View localView2;
      int i27;
      if (this.y.l)
      {
        int i24 = this.d.a.a();
        for (int i25 = 0; i25 < i24; i25++)
        {
          agt localagt9 = b(this.d.a.b(i25));
          if ((!localagt9.a()) && (localagt9.c == -1)) {
            localagt9.c = localagt9.b;
          }
        }
        if (this.y.d != null)
        {
          int i29 = this.d.a();
          int i30 = 0;
          if (i30 < i29)
          {
            agt localagt8 = b(this.d.b(i30));
            int i31;
            if ((0x40 & localagt8.i) != 0)
            {
              i31 = 1;
              if (i31 != 0) {
                if ((0x8 & localagt8.i) == 0) {
                  break label658;
                }
              }
            }
            for (int i32 = 1;; i32 = 0)
            {
              if ((i32 == 0) && (!localagt8.a()))
              {
                long l4 = b(localagt8);
                this.y.d.put(Long.valueOf(l4), localagt8);
                this.y.b.remove(localagt8);
              }
              i30++;
              break;
              i31 = 0;
              break label575;
            }
          }
        }
        boolean bool2 = this.y.i;
        this.y.i = false;
        this.h.c(this.b, this.y);
        this.y.i = bool2;
        localkl4 = new kl();
        i26 = 0;
        if (i26 < this.d.a())
        {
          localView2 = this.d.b(i26);
          if (!b(localView2).a())
          {
            i27 = 0;
            label754:
            if (i27 >= this.y.b.size()) {
              break label2233;
            }
            if (((agt)this.y.b.b[(i27 << 1)]).a != localView2) {
              break label844;
            }
          }
        }
      }
      label1297:
      label1556:
      label2074:
      label2227:
      label2233:
      for (int i28 = 1;; i28 = 0)
      {
        if (i28 == 0) {
          localkl4.put(localView2, new Rect(localView2.getLeft(), localView2.getTop(), localView2.getRight(), localView2.getBottom()));
        }
        i26++;
        break label717;
        label844:
        i27++;
        break label754;
        o();
        this.c.c();
        for (kl localkl2 = localkl4;; localkl2 = null)
        {
          this.y.f = this.g.a();
          this.y.h = 0;
          this.y.j = false;
          this.h.c(this.b, this.y);
          this.y.i = false;
          this.I = null;
          agr localagr2 = this.y;
          boolean bool1;
          kl localkl3;
          label985:
          int i6;
          label997:
          agt localagt6;
          View localView1;
          if ((this.y.k) && (this.w != null))
          {
            bool1 = true;
            localagr2.k = bool1;
            if (!this.y.k) {
              break label2110;
            }
            if (this.y.d == null) {
              break label1246;
            }
            localkl3 = new kl();
            int i5 = this.d.a();
            i6 = 0;
            if (i6 >= i5) {
              break label1297;
            }
            localagt6 = b(this.d.b(i6));
            if (!localagt6.a())
            {
              localView1 = localagt6.a;
              long l2 = b(localagt6);
              if ((localkl3 == null) || (this.y.d.get(Long.valueOf(l2)) == null)) {
                break label1252;
              }
              localkl3.put(Long.valueOf(l2), localagt6);
            }
          }
          for (;;)
          {
            i6++;
            break label997;
            o();
            this.c.e();
            if (this.y.d == null) {
              break label2227;
            }
            int i20 = this.d.a();
            int i21 = 0;
            if (i21 >= i20) {
              break label2227;
            }
            agt localagt7 = b(this.d.b(i21));
            int i22;
            if ((0x40 & localagt7.i) != 0)
            {
              i22 = 1;
              label1151:
              if (i22 != 0) {
                if ((0x8 & localagt7.i) == 0) {
                  break label1234;
                }
              }
            }
            label1234:
            for (int i23 = 1;; i23 = 0)
            {
              if ((i23 == 0) && (!localagt7.a()))
              {
                long l3 = b(localagt7);
                this.y.d.put(Long.valueOf(l3), localagt7);
                this.y.b.remove(localagt7);
              }
              i21++;
              break;
              i22 = 0;
              break label1151;
            }
            bool1 = false;
            break;
            label1246:
            localkl3 = null;
            break label985;
            label1252:
            this.y.c.put(localagt6, new agg(localagt6, localView1.getLeft(), localView1.getTop(), localView1.getRight(), localView1.getBottom()));
          }
          a(localkl2);
          for (int i7 = -1 + this.y.b.size(); i7 >= 0; i7--)
          {
            agt localagt5 = (agt)this.y.b.b[(i7 << 1)];
            if (!this.y.c.containsKey(localagt5))
            {
              agg localagg4 = (agg)this.y.b.b[(1 + (i7 << 1))];
              this.y.b.b(i7);
              this.b.b(localagg4.a);
              a(localagg4);
            }
          }
          int i8 = this.y.c.size();
          if (i8 > 0)
          {
            int i17 = i8 - 1;
            if (i17 >= 0)
            {
              agt localagt4 = (agt)this.y.c.b[(i17 << 1)];
              agg localagg3 = (agg)this.y.c.b[(1 + (i17 << 1))];
              Rect localRect;
              if ((this.y.b.isEmpty()) || (!this.y.b.containsKey(localagt4)))
              {
                this.y.c.b(i17);
                if (localkl2 == null) {
                  break label1643;
                }
                localRect = (Rect)localkl2.get(localagt4.a);
                int i18 = localagg3.b;
                int i19 = localagg3.c;
                if ((localRect == null) || ((localRect.left == i18) && (localRect.top == i19))) {
                  break label1649;
                }
                localagt4.a(false);
                if (this.w.a(localagt4, localRect.left, localRect.top, i18, i19)) {
                  m();
                }
              }
              for (;;)
              {
                i17--;
                break;
                label1643:
                localRect = null;
                break label1556;
                label1649:
                localagt4.a(false);
                this.w.b(localagt4);
                m();
              }
            }
          }
          int i9 = this.y.c.size();
          for (int i10 = 0; i10 < i9; i10++)
          {
            agt localagt3 = (agt)this.y.c.b[(i10 << 1)];
            agg localagg1 = (agg)this.y.c.b[(1 + (i10 << 1))];
            agg localagg2 = (agg)this.y.b.get(localagt3);
            if ((localagg2 != null) && (localagg1 != null) && ((localagg2.b != localagg1.b) || (localagg2.c != localagg1.c)))
            {
              localagt3.a(false);
              if (this.w.a(localagt3, localagg2.b, localagg2.c, localagg1.b, localagg1.c)) {
                m();
              }
            }
          }
          int i11;
          int i12;
          label1865:
          agt localagt1;
          agt localagt2;
          int i13;
          int i14;
          int i15;
          int i16;
          if (this.y.d != null)
          {
            i11 = this.y.d.size();
            i12 = i11 - 1;
            if (i12 < 0) {
              break label2110;
            }
            long l1 = ((Long)this.y.d.b[(i12 << 1)]).longValue();
            localagt1 = (agt)this.y.d.get(Long.valueOf(l1));
            if ((!localagt1.a()) && (this.b.b != null) && (this.b.b.contains(localagt1)))
            {
              localagt2 = (agt)localkl3.get(Long.valueOf(l1));
              localagt1.a(false);
              a(localagt1);
              localagt1.g = localagt2;
              this.b.b(localagt1);
              i13 = localagt1.a.getLeft();
              i14 = localagt1.a.getTop();
              if ((localagt2 != null) && (!localagt2.a())) {
                break label2074;
              }
              i15 = i14;
              i16 = i13;
            }
          }
          for (;;)
          {
            if (this.w.a(localagt1, localagt2, i13, i14, i16, i15)) {
              m();
            }
            i12--;
            break label1865;
            i11 = 0;
            break;
            i16 = localagt2.a.getLeft();
            i15 = localagt2.a.getTop();
            localagt2.a(false);
            localagt2.h = localagt1;
          }
          label2110:
          a(false);
          this.h.b(this.b);
          this.y.g = this.y.f;
          this.q = false;
          this.y.k = false;
          this.y.l = false;
          f();
          this.h.i = false;
          if (this.b.b != null) {
            this.b.b.clear();
          }
          this.y.d = null;
          if (!e(this.ae[0], this.ae[1])) {
            break;
          }
          b(0, 0);
          return;
        }
      }
      label2239:
      i36 = i3;
    }
  }
  
  public boolean isAttachedToWindow()
  {
    return this.j;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.af.b;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.r = 0;
    this.j = true;
    this.l = false;
    if (this.h != null) {
      this.h.j = true;
    }
    this.D = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.w != null) {
      this.w.c();
    }
    this.l = false;
    a(0);
    j();
    this.j = false;
    if (this.h != null)
    {
      agh localagh = this.h;
      agl localagl = this.b;
      localagh.j = false;
      localagh.a(this, localagl);
    }
    removeCallbacks(this.aj);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.i.size();
    for (int i2 = 0; i2 < i1; i2++) {
      this.i.get(i2);
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.h == null) {}
    label183:
    label186:
    for (;;)
    {
      return false;
      if ((!this.n) && ((0x2 & ms.a.b(paramMotionEvent)) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.h.f())
        {
          f1 = -ms.a.e(paramMotionEvent, 9);
          if (!this.h.e()) {
            break label183;
          }
        }
        for (float f2 = ms.a.e(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label186;
          }
          float f3;
          if (this.ad == 1.4E-45F)
          {
            TypedValue localTypedValue = new TypedValue();
            boolean bool = getContext().getTheme().resolveAttribute(16842829, localTypedValue, true);
            f3 = 0.0F;
            if (bool) {
              this.ad = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
            }
          }
          else
          {
            f3 = this.ad;
          }
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = 1;
    if (this.n)
    {
      i2 = 0;
      return i2;
    }
    int i3 = paramMotionEvent.getAction();
    if ((i3 == 3) || (i3 == 0)) {
      this.L = null;
    }
    int i4 = this.K.size();
    int i5 = 0;
    if (i5 < i4)
    {
      x localx = (x)this.K.get(i5);
      if ((localx.a()) && (i3 != 3)) {
        this.L = localx;
      }
    }
    int i7;
    for (int i6 = i2;; i7 = 0)
    {
      if (i6 == 0) {
        break label123;
      }
      l();
      a(0);
      return i2;
      i5++;
      break;
    }
    label123:
    if (this.h == null) {
      return false;
    }
    boolean bool1 = this.h.e();
    boolean bool2 = this.h.f();
    if (this.S == null) {
      this.S = VelocityTracker.obtain();
    }
    this.S.addMovement(paramMotionEvent);
    int i8 = ms.a(paramMotionEvent);
    int i9 = ms.b(paramMotionEvent);
    switch (i8)
    {
    case 4: 
    default: 
      if (this.Q != i2) {
        return false;
      }
      break;
    case 0: 
      label228:
      if (this.N) {
        this.N = false;
      }
      this.R = ms.a.b(paramMotionEvent, 0);
      int i25 = (int)(0.5F + paramMotionEvent.getX());
      this.V = i25;
      this.T = i25;
      int i26 = (int)(0.5F + paramMotionEvent.getY());
      this.W = i26;
      this.U = i26;
      if (this.Q == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(i2);
        a(i2);
      }
      if (!bool1) {}
      break;
    }
    int i28;
    for (int i27 = i2;; i28 = 0)
    {
      if (bool2) {
        i27 |= 0x2;
      }
      startNestedScroll(i28);
      break label228;
      this.R = ms.a.b(paramMotionEvent, i9);
      int i23 = (int)(0.5F + ms.a.c(paramMotionEvent, i9));
      this.V = i23;
      this.T = i23;
      int i24 = (int)(0.5F + ms.a.d(paramMotionEvent, i9));
      this.W = i24;
      this.U = i24;
      break label228;
      int i10 = this.R;
      int i11 = ms.a.a(paramMotionEvent, i10);
      if (i11 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i12 = (int)(0.5F + ms.a.c(paramMotionEvent, i11));
      int i13 = (int)(0.5F + ms.a.d(paramMotionEvent, i11));
      if (this.Q == i2) {
        break label228;
      }
      int i14 = i12 - this.T;
      int i15 = i13 - this.U;
      int i22;
      if ((bool1) && (Math.abs(i14) > this.aa))
      {
        int i20 = this.T;
        int i21 = this.aa;
        if (i14 < 0)
        {
          i22 = i1;
          label584:
          this.V = (i20 + i22 * i21);
        }
      }
      label685:
      int i17;
      for (int i16 = i2;; i17 = 0)
      {
        int i18;
        int i19;
        if ((bool2) && (Math.abs(i15) > this.aa))
        {
          i18 = this.U;
          i19 = this.aa;
          if (i15 >= 0) {
            break label685;
          }
        }
        for (;;)
        {
          this.W = (i18 + i1 * i19);
          i16 = i2;
          if (i16 == 0) {
            break;
          }
          ViewParent localViewParent = getParent();
          if (localViewParent != null) {
            localViewParent.requestDisallowInterceptTouchEvent(i2);
          }
          a(i2);
          break;
          i22 = i2;
          break label584;
          i1 = i2;
        }
        a(paramMotionEvent);
        break label228;
        this.S.clear();
        stopNestedScroll();
        break label228;
        l();
        a(0);
        break label228;
        break;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a();
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection("RV OnLayout");
    }
    i();
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.endSection();
    }
    a(false);
    this.l = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.o)
    {
      a();
      n();
      if (this.y.l)
      {
        this.y.j = true;
        this.o = false;
        a(false);
      }
    }
    else
    {
      if (this.g == null) {
        break label104;
      }
      this.y.f = this.g.a();
      label64:
      if (this.h != null) {
        break label115;
      }
      d(paramInt1, paramInt2);
    }
    for (;;)
    {
      this.y.j = false;
      return;
      this.c.e();
      this.y.j = false;
      break;
      label104:
      this.y.f = 0;
      break label64;
      label115:
      this.h.g.d(paramInt1, paramInt2);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.I = ((agn)paramParcelable);
    super.onRestoreInstanceState(this.I.getSuperState());
    if ((this.h != null) && (this.I.a != null)) {
      this.h.a(this.I.a);
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    agn localagn = new agn(super.onSaveInstanceState());
    if (this.I != null)
    {
      localagn.a = this.I.a;
      return localagn;
    }
    if (this.h != null)
    {
      localagn.a = this.h.d();
      return localagn;
    }
    localagn.a = null;
    return localagn;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      k();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.n) || (this.N)) {}
    label127:
    do
    {
      return false;
      int i1 = paramMotionEvent.getAction();
      int i22;
      int i2;
      if (this.L != null)
      {
        if (i1 == 0) {
          this.L = null;
        }
      }
      else
      {
        if (i1 == 0) {
          break label133;
        }
        int i21 = this.K.size();
        i22 = 0;
        if (i22 >= i21) {
          break label133;
        }
        x localx = (x)this.K.get(i22);
        if (!localx.a()) {
          break label127;
        }
        this.L = localx;
        i2 = 1;
      }
      for (;;)
      {
        if (i2 == 0) {
          break label138;
        }
        l();
        a(0);
        return true;
        if ((i1 == 3) || (i1 == 1)) {
          this.L = null;
        }
        i2 = 1;
        continue;
        i22++;
        break;
        i2 = 0;
      }
    } while (this.h == null);
    label133:
    label138:
    boolean bool1 = this.h.e();
    boolean bool2 = this.h.f();
    if (this.S == null) {
      this.S = VelocityTracker.obtain();
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = ms.a(paramMotionEvent);
    int i4 = ms.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt3 = this.ai;
      this.ai[1] = 0;
      arrayOfInt3[0] = 0;
    }
    localMotionEvent.offsetLocation(this.ai[0], this.ai[1]);
    int i5 = 0;
    switch (i3)
    {
    case 4: 
    default: 
      if (i5 == 0) {
        this.S.addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      return true;
    case 0: 
      this.R = ms.a.b(paramMotionEvent, 0);
      int i18 = (int)(0.5F + paramMotionEvent.getX());
      this.V = i18;
      this.T = i18;
      int i19 = (int)(0.5F + paramMotionEvent.getY());
      this.W = i19;
      this.U = i19;
      if (!bool1) {
        break;
      }
    }
    label830:
    for (int i20 = 1;; i20 = 0)
    {
      if (bool2) {
        i20 |= 0x2;
      }
      startNestedScroll(i20);
      i5 = 0;
      break;
      this.R = ms.a.b(paramMotionEvent, i4);
      int i16 = (int)(0.5F + ms.a.c(paramMotionEvent, i4));
      this.V = i16;
      this.T = i16;
      int i17 = (int)(0.5F + ms.a.d(paramMotionEvent, i4));
      this.W = i17;
      this.U = i17;
      i5 = 0;
      break;
      int i8 = this.R;
      int i9 = ms.a.a(paramMotionEvent, i8);
      if (i9 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i10 = (int)(0.5F + ms.a.c(paramMotionEvent, i9));
      int i11 = (int)(0.5F + ms.a.d(paramMotionEvent, i9));
      int i12 = this.V - i10;
      int i13 = this.W - i11;
      if (dispatchNestedPreScroll(i12, i13, this.ah, this.ag))
      {
        i12 -= this.ah[0];
        i13 -= this.ah[1];
        localMotionEvent.offsetLocation(this.ag[0], this.ag[1]);
        int[] arrayOfInt1 = this.ai;
        arrayOfInt1[0] += this.ag[0];
        int[] arrayOfInt2 = this.ai;
        arrayOfInt2[1] += this.ag[1];
      }
      if (this.Q != 1)
      {
        if ((!bool1) || (Math.abs(i12) <= this.aa)) {
          break label1075;
        }
        if (i12 <= 0) {
          break label871;
        }
        i12 -= this.aa;
      }
      label718:
      for (int i15 = 1;; i15 = 0)
      {
        if ((bool2) && (Math.abs(i13) > this.aa))
        {
          if (i13 > 0)
          {
            i13 -= this.aa;
            label752:
            i15 = 1;
          }
        }
        else
        {
          if (i15 != 0)
          {
            ViewParent localViewParent = getParent();
            if (localViewParent != null) {
              localViewParent.requestDisallowInterceptTouchEvent(true);
            }
            a(1);
          }
          int i14 = this.Q;
          i5 = 0;
          if (i14 != 1) {
            break;
          }
          this.V = (i10 - this.ag[0]);
          this.W = (i11 - this.ag[1]);
          if (!bool1) {
            break label895;
          }
          if (!bool2) {
            break label901;
          }
        }
        for (;;)
        {
          boolean bool3 = a(i12, i13, localMotionEvent);
          i5 = 0;
          if (!bool3) {
            break;
          }
          getParent().requestDisallowInterceptTouchEvent(true);
          i5 = 0;
          break;
          label871:
          i12 += this.aa;
          break label718;
          i13 += this.aa;
          break label752;
          label895:
          i12 = 0;
          break label830;
          i13 = 0;
        }
        a(paramMotionEvent);
        i5 = 0;
        break;
        this.S.addMovement(localMotionEvent);
        this.S.computeCurrentVelocity(1000, this.ac);
        float f1;
        label974:
        VelocityTracker localVelocityTracker1;
        int i6;
        if (bool1)
        {
          VelocityTracker localVelocityTracker2 = this.S;
          int i7 = this.R;
          f1 = -nf.a.a(localVelocityTracker2, i7);
          if (!bool2) {
            break label1054;
          }
          localVelocityTracker1 = this.S;
          i6 = this.R;
        }
        for (float f2 = -nf.a.b(localVelocityTracker1, i6);; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!c((int)f1, (int)f2))) {
            a(0);
          }
          l();
          i5 = 1;
          break;
          f1 = 0.0F;
          break label974;
        }
        l();
        a(0);
        i5 = 0;
        break;
      }
    }
  }
  
  public void removeDetachedView(View paramView, boolean paramBoolean)
  {
    agt localagt = b(paramView);
    if (localagt != null)
    {
      if (!localagt.e()) {
        break label40;
      }
      localagt.i = (0xFFFFFEFF & localagt.i);
    }
    label40:
    while (localagt.a())
    {
      b(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localagt);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    int i2;
    int i1;
    label27:
    Rect localRect1;
    if (!this.h.k())
    {
      if (this.r > 0)
      {
        i2 = 1;
        if (i2 == 0) {
          break label233;
        }
      }
    }
    else
    {
      i1 = 1;
      if ((i1 == 0) && (paramView2 != null))
      {
        this.J.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
        ViewGroup.LayoutParams localLayoutParams = paramView2.getLayoutParams();
        if ((localLayoutParams instanceof agi))
        {
          agi localagi = (agi)localLayoutParams;
          if (!localagi.e)
          {
            Rect localRect2 = localagi.d;
            Rect localRect3 = this.J;
            localRect3.left -= localRect2.left;
            Rect localRect4 = this.J;
            localRect4.right += localRect2.right;
            Rect localRect5 = this.J;
            localRect5.top -= localRect2.top;
            Rect localRect6 = this.J;
            localRect6.bottom += localRect2.bottom;
          }
        }
        offsetDescendantRectToMyCoords(paramView2, this.J);
        offsetRectIntoDescendantCoords(paramView1, this.J);
        localRect1 = this.J;
        if (this.l) {
          break label238;
        }
      }
    }
    label233:
    label238:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, localRect1, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
      i2 = 0;
      break;
      i1 = 0;
      break label27;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    agh localagh = this.h;
    int i1 = localagh.o();
    int i2 = localagh.p();
    int i3 = localagh.m() - localagh.q();
    int i4 = localagh.n() - localagh.r();
    int i5 = paramView.getLeft() + paramRect.left;
    int i6 = paramView.getTop() + paramRect.top;
    int i7 = i5 + paramRect.width();
    int i8 = i6 + paramRect.height();
    int i9 = Math.min(0, i5 - i1);
    int i10 = Math.min(0, i6 - i2);
    int i11 = Math.max(0, i7 - i3);
    int i12 = Math.max(0, i8 - i4);
    RecyclerView localRecyclerView = localagh.g;
    int i13;
    if (nj.a.t(localRecyclerView) == 1) {
      if (i11 != 0)
      {
        if (i10 == 0) {
          break label229;
        }
        i13 = i10;
        label163:
        if ((i11 == 0) && (i13 == 0)) {
          break label528;
        }
        if (!paramBoolean) {
          break label244;
        }
        scrollBy(i11, i13);
      }
    }
    label229:
    label493:
    for (;;)
    {
      return true;
      i11 = Math.max(i9, i7 - i3);
      break;
      if (i9 != 0)
      {
        i11 = i9;
        break;
      }
      i11 = Math.min(i5 - i1, i11);
      break;
      i13 = Math.min(i6 - i2, i12);
      break label163;
      label244:
      if (this.h == null)
      {
        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      }
      else if (!this.n)
      {
        if (!this.h.e()) {
          i11 = 0;
        }
        if (!this.h.f()) {}
        for (int i14 = 0;; i14 = i13)
        {
          if ((i11 == 0) && (i14 == 0)) {
            break label535;
          }
          ags localags = this.x;
          int i15 = Math.abs(i11);
          int i16 = Math.abs(i14);
          int i17;
          int i18;
          int i19;
          if (i15 > i16)
          {
            i17 = 1;
            i18 = (int)Math.sqrt(0);
            i19 = (int)Math.sqrt(i11 * i11 + i14 * i14);
            if (i17 == 0) {
              break label480;
            }
          }
          int i23;
          for (int i20 = localags.d.getWidth();; i20 = localags.d.getHeight())
          {
            int i21 = i20 / 2;
            float f1 = Math.min(1.0F, 1.0F * i19 / i20);
            float f2 = i21 + i21 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
            if (i18 <= 0) {
              break label493;
            }
            i23 = 4 * Math.round(1000.0F * Math.abs(f2 / i18));
            localags.a(i11, i14, Math.min(i23, 2000), F);
            break;
            i17 = 0;
            break label337;
          }
          if (i17 != 0) {}
          for (int i22 = i15;; i22 = i16)
          {
            i23 = (int)(300.0F * (1.0F + i22 / i20));
            break;
          }
          return false;
        }
      }
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i1 = this.K.size();
    for (int i2 = 0; i2 < i1; i2++) {
      this.K.get(i2);
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((!this.M) && (!this.n))
    {
      super.requestLayout();
      return;
    }
    this.m = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.h == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
      {
        return;
      } while (this.n);
      bool1 = this.h.e();
      bool2 = this.h.f();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label74;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1;
    int i2;
    if (this.r > 0)
    {
      i1 = 1;
      i2 = 0;
      if (i1 != 0) {
        if (paramAccessibilityEvent == null) {
          break label72;
        }
      }
    }
    label72:
    for (int i3 = pl.a.a(paramAccessibilityEvent);; i3 = 0)
    {
      int i4 = 0;
      if (i3 == 0) {}
      for (;;)
      {
        this.O = (i4 | this.O);
        i2 = 1;
        if (i2 != 0)
        {
          return;
          i1 = 0;
          break;
        }
        super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        return;
        i4 = i3;
      }
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.e) {
      k();
    }
    this.e = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.l) {
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.af.a(paramBoolean);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.af.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.af.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView
 * JD-Core Version:    0.7.0.1
 */