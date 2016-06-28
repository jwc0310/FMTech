import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.SparseIntArray;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TimeZone;

public final class hxp
{
  private static int A;
  private static int B;
  private static int C;
  private static int D;
  private static int E;
  private static int F;
  private static int G;
  private static int H;
  private static int I;
  private static int J;
  private static int K;
  private static int L;
  private static int M;
  private static int N;
  private static int O;
  private static int P;
  private static int Q;
  private static int R;
  private static int S;
  private static int T;
  private static int U;
  private static int V;
  private static int W;
  private static int X;
  private static int Y;
  private static int Z;
  public static final int a = 256;
  private static int aA;
  private static int aB;
  private static int aC;
  private static int aD;
  private static int aE;
  private static int aF;
  private static int aG;
  private static int aH;
  private static int aI;
  private static int aJ;
  private static int aK;
  private static int aL;
  private static int aM;
  private static int aN;
  private static int aO;
  private static int aP;
  private static int aQ;
  private static int aR;
  private static int aS;
  private static int aT;
  private static int aU;
  private static int aV;
  private static int aW;
  private static int aX;
  private static int aY;
  private static int aZ;
  private static int aa;
  private static int ab;
  private static int ac;
  private static int ad;
  private static int ae;
  private static int af;
  private static int ag;
  private static int ah;
  private static int ai;
  private static int aj;
  private static int ak;
  private static int al;
  private static int am;
  private static int an;
  private static int ao;
  private static int ap;
  private static int aq;
  private static int ar;
  private static int as;
  private static int at;
  private static int au;
  private static int av;
  private static int aw;
  private static int ax;
  private static int ay;
  private static int az;
  public static final int b = 257;
  private static int ba;
  private static int bb;
  private static int bc;
  private static int bd;
  private static int be;
  private static int bf;
  private static int bg;
  private static int bh;
  private static int bi;
  private static int bj;
  private static int bk;
  private static int bl;
  private static int bm;
  private static int bn;
  private static int bo;
  private static int bp;
  private static int bq;
  private static int br;
  private static int bs;
  private static final HashSet<Short> bt;
  public static final int c;
  public static final int d;
  public static final int e;
  public static final int f;
  public static final int g;
  public static final int h;
  public static final int i;
  public static final int j;
  public static final int k;
  public static final int l;
  public static final int m;
  public static final int n;
  public static final int o;
  public static final int p;
  public static final int q;
  public static final int r;
  public static final int s;
  public static final int t;
  static HashSet<Short> u;
  public static final ByteOrder w = ByteOrder.BIG_ENDIAN;
  private static int y = 258;
  private static int z = 259;
  private final DateFormat bu = new SimpleDateFormat("yyyy:MM:dd");
  private SparseIntArray bv;
  public hxq v = new hxq(w);
  public final DateFormat x = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
  
  static
  {
    A = 262;
    B = 270;
    c = 271;
    d = 272;
    e = 273;
    f = 274;
    C = 277;
    D = 278;
    g = 279;
    E = 282;
    F = 283;
    G = 284;
    H = 296;
    I = 301;
    h = 305;
    i = 306;
    J = 315;
    K = 318;
    L = 319;
    M = 529;
    N = 530;
    O = 531;
    P = 532;
    Q = 33432;
    j = 34665;
    k = 34853;
    l = 66049;
    m = 66050;
    R = 164506;
    S = 164509;
    T = 165922;
    U = 165924;
    n = 165927;
    V = 165928;
    W = 167936;
    o = 167939;
    p = 167940;
    X = 168193;
    Y = 168194;
    Z = 168449;
    q = 168450;
    aa = 168451;
    ab = 168452;
    ac = 168453;
    ad = 168454;
    ae = 168455;
    af = 168456;
    r = 168457;
    s = 168458;
    ag = 168468;
    ah = 168572;
    ai = 168582;
    aj = 168592;
    ak = 168593;
    al = 168594;
    am = 172032;
    an = 172033;
    ao = 172034;
    ap = 172035;
    aq = 172036;
    t = 172037;
    ar = 172555;
    as = 172556;
    at = 172558;
    au = 172559;
    av = 172560;
    aw = 172564;
    ax = 172565;
    ay = 172567;
    az = 172800;
    aA = 172801;
    aB = 172802;
    aC = 173057;
    aD = 173058;
    aE = 173059;
    aF = 173060;
    aG = 173061;
    aH = 173062;
    aI = 173063;
    aJ = 173064;
    aK = 173065;
    aL = 173066;
    aM = 173067;
    aN = 173068;
    aO = 173088;
    aP = 262144;
    aQ = 262145;
    aR = 262146;
    aS = 262147;
    aT = 262148;
    aU = 262149;
    aV = 262150;
    aW = 262151;
    aX = 262152;
    aY = 262153;
    aZ = 262154;
    ba = 262155;
    bb = 262156;
    bc = 262157;
    bd = 262158;
    be = 262159;
    bf = 262160;
    bg = 262161;
    bh = 262162;
    bi = 262163;
    bj = 262164;
    bk = 262167;
    bl = 262168;
    bm = 262169;
    bn = 262170;
    bo = 262171;
    bp = 262172;
    bq = 262173;
    br = 262174;
    bs = 196609;
    HashSet localHashSet1 = new HashSet();
    u = localHashSet1;
    localHashSet1.add(Short.valueOf((short)k));
    u.add(Short.valueOf((short)j));
    u.add(Short.valueOf((short)l));
    u.add(Short.valueOf((short)t));
    u.add(Short.valueOf((short)e));
    HashSet localHashSet2 = new HashSet(u);
    bt = localHashSet2;
    localHashSet2.add(Short.valueOf((short)-1));
    bt.add(Short.valueOf((short)m));
    bt.add(Short.valueOf((short)g));
  }
  
  public hxp()
  {
    Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    this.bv = null;
    this.bu.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  private static double a(hye[] paramArrayOfhye, String paramString)
  {
    try
    {
      hye localhye1 = paramArrayOfhye[0];
      double d1 = localhye1.a / localhye1.b;
      hye localhye2 = paramArrayOfhye[1];
      double d2 = localhye2.a / localhye2.b;
      hye localhye3 = paramArrayOfhye[2];
      double d3 = localhye3.a / localhye3.b;
      double d4 = d1 + d2 / 60.0D + d3 / 3600.0D;
      if (!paramString.equals("S"))
      {
        boolean bool = paramString.equals("W");
        if (!bool) {}
      }
      else
      {
        d4 = -d4;
      }
      return d4;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new IllegalArgumentException();
    }
  }
  
  public static int a(short paramShort)
  {
    switch (paramShort)
    {
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 7: 
    default: 
      return 0;
    case 6: 
      return 90;
    case 3: 
      return 180;
    }
    return 270;
  }
  
  private static int a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0)
    {
      i2 = 0;
      return i2;
    }
    int[] arrayOfInt = hyb.d;
    int i1 = 0;
    int i2 = 0;
    label17:
    int i3;
    if (i1 < 5) {
      i3 = paramArrayOfInt.length;
    }
    for (int i4 = 0;; i4++) {
      if (i4 < i3)
      {
        int i5 = paramArrayOfInt[i4];
        if (arrayOfInt[i1] == i5) {
          i2 |= 1 << i1;
        }
      }
      else
      {
        i1++;
        break label17;
        break;
      }
    }
  }
  
  private OutputStream a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException("Argument is null");
    }
    hxu localhxu = new hxu(paramOutputStream, this);
    localhxu.a = this.v;
    return localhxu;
  }
  
  public static short a(int paramInt)
  {
    return (short)paramInt;
  }
  
  protected static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[1024];
    for (int i1 = paramInputStream.read(arrayOfByte, 0, 1024); i1 != -1; i1 = paramInputStream.read(arrayOfByte, 0, 1024)) {
      paramOutputStream.write(arrayOfByte, 0, i1);
    }
  }
  
  private boolean a(ByteBuffer paramByteBuffer, Collection<hya> paramCollection)
  {
    if (paramCollection == null) {
      return false;
    }
    try
    {
      hxs localhxs = new hxs(paramByteBuffer, this);
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        hya localhya = (hya)localIterator.next();
        localhxs.a.a(localhya);
      }
      String str;
      bool = localhxs.a();
    }
    catch (hxr localhxr)
    {
      str = String.valueOf(localhxr);
      throw new IOException(22 + String.valueOf(str).length() + "Invalid exif format : " + str);
    }
    boolean bool;
    return bool;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 16;
  }
  
  public static boolean c(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = hyb.d;
    int i1 = paramInt1 >>> 24;
    for (int i2 = 0;; i2++)
    {
      int i3 = arrayOfInt.length;
      boolean bool = false;
      if (i2 < i3)
      {
        if ((paramInt2 == arrayOfInt[i2]) && ((0x1 & i1 >> i2) == 1)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public static short f(int paramInt)
  {
    return (short)(0xFF & paramInt >> 16);
  }
  
  public static int g(int paramInt)
  {
    return 0xFFFF & paramInt;
  }
  
  public final hya a(int paramInt1, int paramInt2)
  {
    if (!hya.a(paramInt2)) {}
    short s1;
    hyb localhyb;
    do
    {
      return null;
      hxq localhxq = this.v;
      s1 = (short)paramInt1;
      localhyb = localhxq.a[paramInt2];
    } while (localhyb == null);
    return localhyb.a(s1);
  }
  
  public final void a(Bitmap paramBitmap, OutputStream paramOutputStream)
  {
    if ((paramBitmap == null) || (paramOutputStream == null)) {
      throw new IllegalArgumentException("Argument is null");
    }
    OutputStream localOutputStream = a(paramOutputStream);
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localOutputStream);
    localOutputStream.flush();
  }
  
  public final void a(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      throw new IllegalArgumentException("Argument is null");
    }
    try
    {
      hxq localhxq = new hxz(this).a(paramInputStream);
      this.v = localhxq;
      return;
    }
    catch (hxr localhxr)
    {
      String str = String.valueOf(localhxr);
      throw new IOException(22 + String.valueOf(str).length() + "Invalid exif format : " + str);
    }
  }
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +14 -> 15
    //   4: new 562	java/lang/IllegalArgumentException
    //   7: dup
    //   8: ldc_w 573
    //   11: invokespecial 574	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   14: athrow
    //   15: new 702	java/io/BufferedInputStream
    //   18: dup
    //   19: new 704	java/io/FileInputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 705	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   27: invokespecial 707	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   30: astore_2
    //   31: aload_0
    //   32: aload_2
    //   33: invokevirtual 709	hxp:a	(Ljava/io/InputStream;)V
    //   36: aload_2
    //   37: invokevirtual 710	java/io/InputStream:close	()V
    //   40: return
    //   41: astore_3
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_2
    //   45: ifnull +9 -> 54
    //   48: aload_2
    //   49: invokeinterface 590 1 0
    //   54: aload_3
    //   55: athrow
    //   56: astore 4
    //   58: goto -4 -> 54
    //   61: astore_3
    //   62: goto -18 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	hxp
    //   0	65	1	paramString	String
    //   30	19	2	localBufferedInputStream	java.io.BufferedInputStream
    //   41	14	3	localIOException1	IOException
    //   61	1	3	localIOException2	IOException
    //   56	1	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   15	31	41	java/io/IOException
    //   48	54	56	java/lang/Throwable
    //   31	36	61	java/io/IOException
  }
  
  public final void a(Collection<hya> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      hya localhya = (hya)localIterator.next();
      this.v.a(localhya);
    }
  }
  
  public final boolean a(int paramInt, Object paramObject)
  {
    hya localhya = a(paramInt, d(paramInt));
    if (localhya == null) {
      return false;
    }
    return localhya.a(paramObject);
  }
  
  /* Error */
  public final boolean a(String paramString, Collection<hya> paramCollection)
  {
    // Byte code:
    //   0: new 720	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 721	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: new 702	java/io/BufferedInputStream
    //   12: dup
    //   13: new 704	java/io/FileInputStream
    //   16: dup
    //   17: aload_3
    //   18: invokespecial 724	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: invokespecial 707	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: astore 4
    //   26: new 726	hxv
    //   29: dup
    //   30: aload 4
    //   32: bipush 63
    //   34: aload_0
    //   35: invokespecial 729	hxv:<init>	(Ljava/io/InputStream;ILhxp;)V
    //   38: astore 5
    //   40: aload 5
    //   42: getfield 730	hxv:g	I
    //   45: i2l
    //   46: lstore 12
    //   48: aload 4
    //   50: invokevirtual 710	java/io/InputStream:close	()V
    //   53: new 732	java/io/RandomAccessFile
    //   56: dup
    //   57: aload_3
    //   58: ldc_w 734
    //   61: invokespecial 737	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   64: astore 14
    //   66: aload 14
    //   68: invokevirtual 740	java/io/RandomAccessFile:length	()J
    //   71: lload 12
    //   73: lcmp
    //   74: ifge +82 -> 156
    //   77: new 638	java/io/IOException
    //   80: dup
    //   81: ldc_w 742
    //   84: invokespecial 658	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   87: athrow
    //   88: astore 6
    //   90: aconst_null
    //   91: astore 4
    //   93: aload 14
    //   95: astore 7
    //   97: aload 7
    //   99: ifnull +10 -> 109
    //   102: aload 7
    //   104: invokeinterface 590 1 0
    //   109: aload 6
    //   111: athrow
    //   112: astore 8
    //   114: aload 4
    //   116: astore 9
    //   118: aload 9
    //   120: ifnull +10 -> 130
    //   123: aload 9
    //   125: invokeinterface 590 1 0
    //   130: aload 8
    //   132: athrow
    //   133: astore 19
    //   135: new 638	java/io/IOException
    //   138: dup
    //   139: ldc_w 649
    //   142: aload 19
    //   144: invokespecial 745	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   147: athrow
    //   148: astore 6
    //   150: aconst_null
    //   151: astore 7
    //   153: goto -56 -> 97
    //   156: lload 12
    //   158: lconst_0
    //   159: lcmp
    //   160: istore 15
    //   162: iconst_0
    //   163: istore 16
    //   165: iload 15
    //   167: ifle +28 -> 195
    //   170: aload_0
    //   171: aload 14
    //   173: invokevirtual 749	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   176: getstatic 755	java/nio/channels/FileChannel$MapMode:READ_WRITE	Ljava/nio/channels/FileChannel$MapMode;
    //   179: lconst_0
    //   180: lload 12
    //   182: invokevirtual 761	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   185: aload_2
    //   186: invokespecial 763	hxp:a	(Ljava/nio/ByteBuffer;Ljava/util/Collection;)Z
    //   189: istore 18
    //   191: iload 18
    //   193: istore 16
    //   195: iconst_0
    //   196: ifeq +9 -> 205
    //   199: aconst_null
    //   200: invokeinterface 590 1 0
    //   205: aload 14
    //   207: invokevirtual 764	java/io/RandomAccessFile:close	()V
    //   210: iload 16
    //   212: ireturn
    //   213: astore 17
    //   215: goto -10 -> 205
    //   218: astore 11
    //   220: goto -111 -> 109
    //   223: astore 10
    //   225: goto -95 -> 130
    //   228: astore 8
    //   230: aconst_null
    //   231: astore 9
    //   233: goto -115 -> 118
    //   236: astore 6
    //   238: aconst_null
    //   239: astore 4
    //   241: aconst_null
    //   242: astore 7
    //   244: goto -147 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	hxp
    //   0	247	1	paramString	String
    //   0	247	2	paramCollection	Collection<hya>
    //   8	50	3	localFile	java.io.File
    //   24	216	4	localBufferedInputStream1	java.io.BufferedInputStream
    //   38	3	5	localhxv	hxv
    //   88	22	6	localIOException1	IOException
    //   148	1	6	localIOException2	IOException
    //   236	1	6	localIOException3	IOException
    //   95	148	7	localRandomAccessFile1	java.io.RandomAccessFile
    //   112	19	8	localObject1	Object
    //   228	1	8	localObject2	Object
    //   116	116	9	localBufferedInputStream2	java.io.BufferedInputStream
    //   223	1	10	localThrowable1	Throwable
    //   218	1	11	localThrowable2	Throwable
    //   46	135	12	l1	long
    //   64	142	14	localRandomAccessFile2	java.io.RandomAccessFile
    //   160	6	15	bool1	boolean
    //   163	48	16	bool2	boolean
    //   213	1	17	localThrowable3	Throwable
    //   189	3	18	bool3	boolean
    //   133	10	19	localhxr	hxr
    // Exception table:
    //   from	to	target	type
    //   66	88	88	java/io/IOException
    //   170	191	88	java/io/IOException
    //   26	40	112	finally
    //   40	53	112	finally
    //   102	109	112	finally
    //   109	112	112	finally
    //   135	148	112	finally
    //   26	40	133	hxr
    //   26	40	148	java/io/IOException
    //   40	53	148	java/io/IOException
    //   135	148	148	java/io/IOException
    //   199	205	213	java/lang/Throwable
    //   102	109	218	java/lang/Throwable
    //   123	130	223	java/lang/Throwable
    //   0	26	228	finally
    //   53	66	228	finally
    //   66	88	228	finally
    //   170	191	228	finally
    //   0	26	236	java/io/IOException
    //   53	66	236	java/io/IOException
  }
  
  public final double[] a()
  {
    int i1 = aR;
    hye[] arrayOfhye1 = b(i1, d(i1));
    String str1 = c(aQ);
    int i2 = aT;
    hye[] arrayOfhye2 = b(i2, d(i2));
    String str2 = c(aS);
    if ((arrayOfhye1 == null) || (arrayOfhye2 == null) || (str1 == null) || (str2 == null) || (arrayOfhye1.length < 3) || (arrayOfhye2.length < 3)) {
      return null;
    }
    double[] arrayOfDouble = new double[2];
    arrayOfDouble[0] = a(arrayOfhye1, str1);
    arrayOfDouble[1] = a(arrayOfhye2, str2);
    return arrayOfDouble;
  }
  
  public final SparseIntArray b()
  {
    if (this.bv == null)
    {
      this.bv = new SparseIntArray();
      int i1 = a(new int[] { 0, 1 }) << 24;
      this.bv.put(c, i1 | 0x20000);
      this.bv.put(a, 0x1 | i1 | 0x40000);
      this.bv.put(b, 0x1 | i1 | 0x40000);
      this.bv.put(y, 0x3 | i1 | 0x30000);
      this.bv.put(z, 0x1 | i1 | 0x30000);
      this.bv.put(A, 0x1 | i1 | 0x30000);
      this.bv.put(f, 0x1 | i1 | 0x30000);
      this.bv.put(C, 0x1 | i1 | 0x30000);
      this.bv.put(G, 0x1 | i1 | 0x30000);
      this.bv.put(N, 0x2 | i1 | 0x30000);
      this.bv.put(O, 0x1 | i1 | 0x30000);
      this.bv.put(E, 0x1 | i1 | 0x50000);
      this.bv.put(F, 0x1 | i1 | 0x50000);
      this.bv.put(H, 0x1 | i1 | 0x30000);
      this.bv.put(e, i1 | 0x40000);
      this.bv.put(D, 0x1 | i1 | 0x40000);
      this.bv.put(g, i1 | 0x40000);
      this.bv.put(I, 0x300 | i1 | 0x30000);
      this.bv.put(K, 0x2 | i1 | 0x50000);
      this.bv.put(L, 0x6 | i1 | 0x50000);
      this.bv.put(M, 0x3 | i1 | 0x50000);
      this.bv.put(P, 0x6 | i1 | 0x50000);
      this.bv.put(i, 0x14 | i1 | 0x20000);
      this.bv.put(B, i1 | 0x20000);
      this.bv.put(c, i1 | 0x20000);
      this.bv.put(d, i1 | 0x20000);
      this.bv.put(h, i1 | 0x20000);
      this.bv.put(J, i1 | 0x20000);
      this.bv.put(Q, i1 | 0x20000);
      this.bv.put(j, 0x1 | i1 | 0x40000);
      this.bv.put(k, 0x1 | i1 | 0x40000);
      int i2 = a(new int[] { 1 }) << 24;
      this.bv.put(l, 0x1 | i2 | 0x40000);
      this.bv.put(m, 0x1 | i2 | 0x40000);
      int i3 = a(new int[] { 2 }) << 24;
      this.bv.put(W, 0x4 | i3 | 0x70000);
      this.bv.put(am, 0x4 | i3 | 0x70000);
      this.bv.put(an, 0x1 | i3 | 0x30000);
      this.bv.put(X, 0x4 | i3 | 0x70000);
      this.bv.put(Y, 0x1 | i3 | 0x50000);
      this.bv.put(ao, 0x1 | i3 | 0x40000);
      this.bv.put(ap, 0x1 | i3 | 0x40000);
      this.bv.put(ah, i3 | 0x70000);
      this.bv.put(ai, i3 | 0x70000);
      this.bv.put(aq, 0xD | i3 | 0x20000);
      this.bv.put(o, 0x14 | i3 | 0x20000);
      this.bv.put(p, 0x14 | i3 | 0x20000);
      this.bv.put(aj, i3 | 0x20000);
      this.bv.put(ak, i3 | 0x20000);
      this.bv.put(al, i3 | 0x20000);
      this.bv.put(aO, 0x21 | i3 | 0x20000);
      this.bv.put(R, 0x1 | i3 | 0x50000);
      this.bv.put(S, 0x1 | i3 | 0x50000);
      this.bv.put(T, 0x1 | i3 | 0x30000);
      this.bv.put(U, i3 | 0x20000);
      this.bv.put(n, i3 | 0x30000);
      this.bv.put(V, i3 | 0x70000);
      this.bv.put(Z, 0x1 | 0xA0000 | i3);
      this.bv.put(q, 0x1 | i3 | 0x50000);
      this.bv.put(aa, 0x1 | 0xA0000 | i3);
      this.bv.put(ab, 0x1 | 0xA0000 | i3);
      this.bv.put(ac, 0x1 | i3 | 0x50000);
      this.bv.put(ad, 0x1 | i3 | 0x50000);
      this.bv.put(ae, 0x1 | i3 | 0x30000);
      this.bv.put(af, 0x1 | i3 | 0x30000);
      this.bv.put(r, 0x1 | i3 | 0x30000);
      this.bv.put(s, 0x1 | i3 | 0x50000);
      this.bv.put(ag, i3 | 0x30000);
      this.bv.put(ar, 0x1 | i3 | 0x50000);
      this.bv.put(as, i3 | 0x70000);
      this.bv.put(at, 0x1 | i3 | 0x50000);
      this.bv.put(au, 0x1 | i3 | 0x50000);
      this.bv.put(av, 0x1 | i3 | 0x30000);
      this.bv.put(aw, 0x2 | i3 | 0x30000);
      this.bv.put(ax, 0x1 | i3 | 0x50000);
      this.bv.put(ay, 0x1 | i3 | 0x30000);
      this.bv.put(az, 0x1 | i3 | 0x70000);
      this.bv.put(aA, 0x1 | i3 | 0x70000);
      this.bv.put(aB, i3 | 0x70000);
      this.bv.put(aC, 0x1 | i3 | 0x30000);
      this.bv.put(aD, 0x1 | i3 | 0x30000);
      this.bv.put(aE, 0x1 | i3 | 0x30000);
      this.bv.put(aF, 0x1 | i3 | 0x50000);
      this.bv.put(aG, 0x1 | i3 | 0x30000);
      this.bv.put(aH, 0x1 | i3 | 0x30000);
      this.bv.put(aI, 0x1 | i3 | 0x50000);
      this.bv.put(aJ, 0x1 | i3 | 0x30000);
      this.bv.put(aK, 0x1 | i3 | 0x30000);
      this.bv.put(aL, 0x1 | i3 | 0x30000);
      this.bv.put(aM, i3 | 0x70000);
      this.bv.put(aN, 0x1 | i3 | 0x30000);
      this.bv.put(t, 0x1 | i3 | 0x40000);
      int i4 = a(new int[] { 4 }) << 24;
      this.bv.put(aP, 0x4 | 0x10000 | i4);
      this.bv.put(aQ, 0x2 | i4 | 0x20000);
      this.bv.put(aS, 0x2 | i4 | 0x20000);
      this.bv.put(aR, 0x3 | 0xA0000 | i4);
      this.bv.put(aT, 0x3 | 0xA0000 | i4);
      this.bv.put(aU, 0x1 | 0x10000 | i4);
      this.bv.put(aV, 0x1 | i4 | 0x50000);
      this.bv.put(aW, 0x3 | i4 | 0x50000);
      this.bv.put(aX, i4 | 0x20000);
      this.bv.put(aY, 0x2 | i4 | 0x20000);
      this.bv.put(aZ, 0x2 | i4 | 0x20000);
      this.bv.put(ba, 0x1 | i4 | 0x50000);
      this.bv.put(bb, 0x2 | i4 | 0x20000);
      this.bv.put(bc, 0x1 | i4 | 0x50000);
      this.bv.put(bd, 0x2 | i4 | 0x20000);
      this.bv.put(be, 0x1 | i4 | 0x50000);
      this.bv.put(bf, 0x2 | i4 | 0x20000);
      this.bv.put(bg, 0x1 | i4 | 0x50000);
      this.bv.put(bh, i4 | 0x20000);
      this.bv.put(bi, 0x2 | i4 | 0x20000);
      this.bv.put(bj, 0x1 | i4 | 0x50000);
      this.bv.put(bk, 0x2 | i4 | 0x20000);
      this.bv.put(bl, 0x1 | i4 | 0x50000);
      this.bv.put(bm, 0x2 | i4 | 0x20000);
      this.bv.put(bn, 0x1 | i4 | 0x50000);
      this.bv.put(bo, i4 | 0x70000);
      this.bv.put(bp, i4 | 0x70000);
      this.bv.put(bq, 0xB | i4 | 0x20000);
      this.bv.put(br, 0xB | i4 | 0x30000);
      int i5 = a(new int[] { 3 }) << 24;
      this.bv.put(bs, i5 | 0x20000);
    }
    return this.bv;
  }
  
  public final OutputStream b(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Argument is null");
    }
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramString);
      return a(localFileOutputStream);
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (0 == 0) {}
    }
    try
    {
      null.close();
      label41:
      throw localFileNotFoundException;
    }
    catch (Throwable localThrowable)
    {
      break label41;
    }
  }
  
  /* Error */
  public final void b(String paramString, Collection<hya> paramCollection)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: invokevirtual 798	hxp:a	(Ljava/lang/String;Ljava/util/Collection;)Z
    //   8: ifne +173 -> 181
    //   11: aload_0
    //   12: getfield 505	hxp:v	Lhxq;
    //   15: astore 4
    //   17: aload_0
    //   18: new 500	hxq
    //   21: dup
    //   22: getstatic 497	hxp:w	Ljava/nio/ByteOrder;
    //   25: invokespecial 503	hxq:<init>	(Ljava/nio/ByteOrder;)V
    //   28: putfield 505	hxp:v	Lhxq;
    //   31: new 704	java/io/FileInputStream
    //   34: dup
    //   35: aload_1
    //   36: invokespecial 705	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   39: astore 5
    //   41: new 800	java/io/ByteArrayOutputStream
    //   44: dup
    //   45: invokespecial 801	java/io/ByteArrayOutputStream:<init>	()V
    //   48: astore 6
    //   50: aload 5
    //   52: aload 6
    //   54: invokestatic 803	hxp:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   57: aload 6
    //   59: invokevirtual 807	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   62: astore 11
    //   64: aload_0
    //   65: new 809	java/io/ByteArrayInputStream
    //   68: dup
    //   69: aload 11
    //   71: invokespecial 812	java/io/ByteArrayInputStream:<init>	([B)V
    //   74: invokevirtual 709	hxp:a	(Ljava/io/InputStream;)V
    //   77: aload_2
    //   78: ifnull +150 -> 228
    //   81: aload_0
    //   82: aload_2
    //   83: invokevirtual 814	hxp:a	(Ljava/util/Collection;)V
    //   86: goto +142 -> 228
    //   89: new 562	java/lang/IllegalArgumentException
    //   92: dup
    //   93: ldc_w 573
    //   96: invokespecial 574	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   99: athrow
    //   100: astore 8
    //   102: aload 5
    //   104: astore 9
    //   106: aload 9
    //   108: ifnull +10 -> 118
    //   111: aload 9
    //   113: invokeinterface 590 1 0
    //   118: aload 8
    //   120: athrow
    //   121: astore 7
    //   123: aload 9
    //   125: astore 5
    //   127: aload 5
    //   129: ifnull +8 -> 137
    //   132: aload 5
    //   134: invokevirtual 815	java/io/FileInputStream:close	()V
    //   137: aload_0
    //   138: aload 4
    //   140: putfield 505	hxp:v	Lhxq;
    //   143: aload 7
    //   145: athrow
    //   146: aload_0
    //   147: aload_1
    //   148: invokevirtual 817	hxp:b	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   151: astore_3
    //   152: aload_3
    //   153: aload 11
    //   155: iconst_0
    //   156: aload 11
    //   158: arraylength
    //   159: invokevirtual 603	java/io/OutputStream:write	([BII)V
    //   162: aload_3
    //   163: invokevirtual 691	java/io/OutputStream:flush	()V
    //   166: aload_3
    //   167: invokevirtual 818	java/io/OutputStream:close	()V
    //   170: aload 5
    //   172: invokevirtual 815	java/io/FileInputStream:close	()V
    //   175: aload_0
    //   176: aload 4
    //   178: putfield 505	hxp:v	Lhxq;
    //   181: return
    //   182: astore 12
    //   184: aload_3
    //   185: ifnull +9 -> 194
    //   188: aload_3
    //   189: invokeinterface 590 1 0
    //   194: aload 12
    //   196: athrow
    //   197: astore 7
    //   199: goto -72 -> 127
    //   202: astore 13
    //   204: goto -10 -> 194
    //   207: astore 10
    //   209: goto -91 -> 118
    //   212: astore 7
    //   214: aconst_null
    //   215: astore 5
    //   217: goto -90 -> 127
    //   220: astore 8
    //   222: aconst_null
    //   223: astore 9
    //   225: goto -119 -> 106
    //   228: aload 11
    //   230: ifnull -141 -> 89
    //   233: aload_1
    //   234: ifnonnull -88 -> 146
    //   237: goto -148 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	hxp
    //   0	240	1	paramString	String
    //   0	240	2	paramCollection	Collection<hya>
    //   1	188	3	localOutputStream	OutputStream
    //   15	162	4	localhxq	hxq
    //   39	177	5	localObject1	Object
    //   48	10	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   121	23	7	localObject2	Object
    //   197	1	7	localObject3	Object
    //   212	1	7	localObject4	Object
    //   100	19	8	localIOException1	IOException
    //   220	1	8	localIOException2	IOException
    //   104	120	9	localObject5	Object
    //   207	1	10	localThrowable1	Throwable
    //   62	167	11	arrayOfByte	byte[]
    //   182	13	12	localIOException3	IOException
    //   202	1	13	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   41	77	100	java/io/IOException
    //   81	86	100	java/io/IOException
    //   89	100	100	java/io/IOException
    //   166	170	100	java/io/IOException
    //   188	194	100	java/io/IOException
    //   194	197	100	java/io/IOException
    //   111	118	121	finally
    //   118	121	121	finally
    //   146	166	182	java/io/IOException
    //   41	77	197	finally
    //   81	86	197	finally
    //   89	100	197	finally
    //   146	166	197	finally
    //   166	170	197	finally
    //   188	194	197	finally
    //   194	197	197	finally
    //   188	194	202	java/lang/Throwable
    //   111	118	207	java/lang/Throwable
    //   31	41	212	finally
    //   31	41	220	java/io/IOException
  }
  
  public final hye[] b(int paramInt1, int paramInt2)
  {
    hya localhya = a(paramInt1, paramInt2);
    if (localhya == null) {}
    while (!(localhya.g instanceof hye[])) {
      return null;
    }
    return (hye[])localhya.g;
  }
  
  public final String c(int paramInt)
  {
    hya localhya = a(paramInt, d(paramInt));
    if (localhya == null) {
      return null;
    }
    return localhya.a();
  }
  
  public final int d(int paramInt)
  {
    if (b().get(paramInt) == 0) {
      return -1;
    }
    return paramInt >>> 16;
  }
  
  protected final hya e(int paramInt)
  {
    int i1 = b().get(paramInt);
    if (i1 == 0) {
      return null;
    }
    short s1 = (short)(0xFF & i1 >> 16);
    int i2 = i1 & 0xFFFF;
    if (i2 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      int i3 = paramInt >>> 16;
      return new hya((short)paramInt, s1, i2, i3, bool);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxp
 * JD-Core Version:    0.7.0.1
 */