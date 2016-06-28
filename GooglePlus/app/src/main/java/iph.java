import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.util.Map;

public final class iph
  extends ife
  implements jrs, jrt
{
  private static final ipl A;
  private static final ipl B;
  private static final ipl C;
  private static final ipl D;
  private static final ipl E;
  private static final ipl F;
  private static final ipl G;
  private static final ipl H;
  private static final ipl[] I;
  private static final ipl[] J;
  private static final ipl[] K;
  private static boolean L;
  private static boolean M;
  private static int N;
  private static int O;
  private static int P;
  private static int Q;
  private static int R;
  static int m;
  static int n;
  private static final ipl v = new ipl(3, 0);
  private static final ipl w = new ipl(6, 3);
  private static final ipl x = new ipl(6, 2);
  private static final ipl y = new ipl(6, 1);
  private static final ipl z = new ipl(7, 3);
  private String S;
  private File T;
  private File U;
  private ipl V;
  private ipl W;
  private String X;
  private ConnectivityManager Y;
  private ipj Z;
  private int aa = -1;
  private int ab = -1;
  private int ac = 0;
  private int ad = 0;
  private int ae = -1;
  private int af = -1;
  
  static
  {
    A = new ipl(7, 2);
    B = new ipl(7, 1);
    C = new ipl(8, 3);
    D = new ipl(8, 2);
    E = new ipl(8, 1);
    F = x.a(w);
    G = A.a(z);
    H = D.a(C);
    ipl[] arrayOfipl1 = new ipl[8];
    arrayOfipl1[0] = w;
    arrayOfipl1[1] = v.a(w);
    arrayOfipl1[2] = F;
    arrayOfipl1[3] = z.a(w);
    arrayOfipl1[4] = A.a(x);
    arrayOfipl1[5] = y.a(x);
    arrayOfipl1[6] = B.a(x);
    arrayOfipl1[7] = C.a(x);
    I = arrayOfipl1;
    ipl[] arrayOfipl2 = new ipl[8];
    arrayOfipl2[0] = v;
    arrayOfipl2[1] = z;
    arrayOfipl2[2] = G;
    arrayOfipl2[3] = C.a(A);
    arrayOfipl2[4] = x;
    arrayOfipl2[5] = D.a(A);
    arrayOfipl2[6] = y.a(A);
    arrayOfipl2[7] = B.a(A);
    J = arrayOfipl2;
    ipl[] arrayOfipl3 = new ipl[7];
    arrayOfipl3[0] = v;
    arrayOfipl3[1] = C;
    arrayOfipl3[2] = H;
    arrayOfipl3[3] = A;
    arrayOfipl3[4] = y.a(D);
    arrayOfipl3[5] = B.a(D);
    arrayOfipl3[6] = E.a(D);
    K = arrayOfipl3;
  }
  
  public iph(ifj paramifj, ipk paramipk)
  {
    super(paramifj, paramipk);
    if (!L)
    {
      int i = paramifj.g();
      O = i;
      m = (int)(0.5F * i);
      n = (int)(0.3F * O);
      float f = paramifj.n();
      if (f < 0.75D)
      {
        M = true;
        N = (int)(f * 8192.0F);
      }
      P = paramifj.h();
      Q = paramifj.i();
      DisplayMetrics localDisplayMetrics = efj.K(paramifj.r());
      R = Math.min(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels) / 4;
      L = true;
    }
    if (paramipk.e != -1)
    {
      this.Z = ((ipj)mbb.a(this.b.r(), ipj.class));
      this.aa = this.Z.a(paramipk.e);
      this.ab = this.Z.b(paramipk.e);
    }
  }
  
  private final Bitmap a(Context paramContext, Uri paramUri, int paramInt)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Point localPoint = efj.b(localContentResolver, paramUri);
    int i = Math.max(localPoint.x / paramInt, localPoint.y / paramInt);
    Bitmap localBitmap1 = null;
    if (i == 1) {
      localBitmap1 = this.b.b(localPoint.x, localPoint.y);
    }
    Bitmap localBitmap2 = efj.a(localContentResolver, paramUri, i, localBitmap1);
    if (localBitmap2 != localBitmap1) {
      this.b.a(localBitmap1);
    }
    int j = localBitmap2.getWidth();
    int k = localBitmap2.getHeight();
    float f = paramInt / Math.max(j, k);
    Bitmap localBitmap5;
    Bitmap localBitmap3;
    if (f < 1.0F)
    {
      localBitmap5 = this.b.b(Math.round(f * j), Math.round(f * k));
      if (f >= 1.0F)
      {
        localBitmap3 = localBitmap2;
        if (localBitmap3 != localBitmap5) {
          this.b.a(localBitmap5);
        }
      }
    }
    for (;;)
    {
      if (localBitmap3 != localBitmap2) {
        this.b.a(localBitmap2);
      }
      Bitmap localBitmap4 = a(paramContext, paramUri, localBitmap3);
      if (localBitmap4 != localBitmap3) {
        this.b.a(localBitmap3);
      }
      return localBitmap4;
      if (localBitmap5 == null) {}
      for (localBitmap3 = Bitmap.createBitmap(Math.round(f * localBitmap2.getWidth()), Math.round(f * localBitmap2.getHeight()), Bitmap.Config.ARGB_8888);; localBitmap3 = localBitmap5)
      {
        Matrix localMatrix = new Matrix();
        localMatrix.setScale(f, f);
        new Canvas(localBitmap3).drawBitmap(localBitmap2, localMatrix, new Paint(3));
        break;
      }
      localBitmap3 = localBitmap2;
    }
  }
  
  private final Bitmap a(Context paramContext, Uri paramUri, Bitmap paramBitmap)
  {
    int i = efj.c(paramContext.getContentResolver(), paramUri);
    if (i != 0)
    {
      Bitmap localBitmap1 = this.b.b(paramBitmap.getWidth(), paramBitmap.getHeight());
      Matrix localMatrix = new Matrix();
      localMatrix.setRotate(i);
      RectF localRectF = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
      localMatrix.mapRect(localRectF);
      int j = Math.round(localRectF.width());
      int k = Math.round(localRectF.height());
      Bitmap localBitmap2 = this.b.b(j, k);
      localMatrix.postTranslate(-localRectF.left, -localRectF.top);
      new Canvas(localBitmap2).drawBitmap(paramBitmap, localMatrix, new Paint(3));
      if (localBitmap2 != localBitmap1) {
        this.b.a(localBitmap1);
      }
      paramBitmap = localBitmap2;
    }
    return paramBitmap;
  }
  
  public static File a(Context paramContext, ipf paramipf)
  {
    String str = a(paramipf, 0, 1, 0, 0, null, null);
    return ((ifj)mbb.a(paramContext, ifj.class)).f().a(str);
  }
  
  public static File a(Context paramContext, String paramString)
  {
    iab localiab = ((ifj)mbb.a(paramContext, ifj.class)).f();
    String str = a(ipf.a(paramContext, paramString, ipm.b), 0, 4, 0, 0, null, null);
    File localFile = localiab.a(str);
    if (localFile != null) {
      return localFile;
    }
    return localiab.a(1 + String.valueOf(str).length() + str + '~');
  }
  
  public static File a(File paramFile)
  {
    String str1 = String.valueOf(paramFile.getAbsolutePath());
    String str2 = String.valueOf("-thumb");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return new File(str3);
    }
  }
  
  private final String a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      a(localStringBuilder, paramipf.c).append(File.separatorChar).append(paramInt2).append(',').append(paramInt3).append(',').append(paramInt4).append(',').append(paramInt5).append(',');
      a(localStringBuilder, paramInt1);
      localStringBuilder.append(',');
      return mfx.b(localStringBuilder);
    }
  }
  
  private static String a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, RectF paramRectF, String paramString)
  {
    int i;
    String str2;
    label34:
    String str4;
    String str6;
    if (paramipf.c != null)
    {
      i = 1;
      if (i == 0) {
        break label204;
      }
      if (paramipf.e != ipm.b) {
        break label195;
      }
      str2 = ira.a(paramipf.c);
      if (paramString == null) {
        break label445;
      }
      str4 = String.valueOf(str2);
      String str5 = String.valueOf(paramString);
      if (str5.length() == 0) {
        break label355;
      }
      str6 = str4.concat(str5);
    }
    label70:
    for (String str3 = str6;; str3 = str2)
    {
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      StringBuilder localStringBuilder;
      if (localmfz.b == 1)
      {
        localStringBuilder = localmfz.a;
        label113:
        localStringBuilder.append(efj.C(str3));
        switch (paramInt2)
        {
        }
      }
      for (;;)
      {
        a(localStringBuilder, paramInt1);
        if (paramRectF != null) {
          localStringBuilder.append(iqw.a(paramRectF, 0));
        }
        return mfx.b(localStringBuilder);
        i = 0;
        break;
        str2 = paramipf.c;
        break label34;
        label204:
        if (paramipf.d != null) {}
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label287;
          }
          String str7 = String.valueOf(paramipf.d);
          String str8 = String.valueOf(paramipf.g);
          str2 = 0 + String.valueOf(str7).length() + String.valueOf(str8).length() + str7 + str8;
          break;
        }
        if (paramipf.a())
        {
          str2 = Long.toString(paramipf.b.a);
          break label34;
        }
        String str1 = String.valueOf(paramipf);
        throw new IllegalStateException(31 + String.valueOf(str1).length() + "A media ref should have a URI: " + str1);
        label355:
        str6 = new String(str4);
        break label70;
        localStringBuilder = new StringBuilder(256);
        break label113;
        localStringBuilder.append('-').append(paramInt3).append('x').append(paramInt4);
        continue;
        localStringBuilder.append("-t");
        continue;
        localStringBuilder.append("-l");
        continue;
        localStringBuilder.append("-z");
      }
    }
  }
  
  private static StringBuilder a(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append(efj.C(efj.E(paramString))).append('+');
    return paramStringBuilder;
  }
  
  private final void a(Bitmap paramBitmap, String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.b.e().a(paramString, ByteBuffer.wrap(localByteArrayOutputStream.toByteArray()));
      return;
    }
    finally
    {
      localByteArrayOutputStream.close();
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    if ((paramInt & 0x4) != 0) {
      paramStringBuilder.append("-a");
    }
    if ((paramInt & 0x20) != 0) {
      paramStringBuilder.append("-nw");
    }
    if ((paramInt & 0x100) != 0) {
      paramStringBuilder.append("-p");
    }
    if ((0x20000 & paramInt) != 0) {
      paramStringBuilder.append("-ip");
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    int j;
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      i = paramInt1 - paramInt3;
      j = paramInt2 - paramInt3;
      if (i <= 0) {
        break label36;
      }
      if (j < 0) {}
      while (j > i) {
        return true;
      }
    }
    label36:
    while ((j >= 0) || (j >= i)) {
      return false;
    }
    return true;
  }
  
  private static boolean a(ipk paramipk)
  {
    if ((paramipk.d == 0) && (paramipk.e != -1) && (paramipk.i == null) && (paramipk.h == null))
    {
      if (paramipk.c.c != null) {}
      for (int i = 1; (i != 0) && ((paramipk.c.e == ipm.a) || (paramipk.c.e == ipm.d)); i = 0) {
        return true;
      }
    }
    return false;
  }
  
  private final void b(ipk paramipk)
  {
    if ((paramipk.f != 0) && (this.ac != 0)) {}
    for (double d = this.ac / paramipk.f; d < 2.0D; d = this.ad / paramipk.g) {
      do
      {
        return;
      } while ((paramipk.g == 0) || (this.ad == 0));
    }
    int i = (int)Math.pow(2.0D, Math.floor(Math.log(d) / Math.log(2.0D)));
    for (;;)
    {
      int k;
      try
      {
        Bitmap localBitmap = efj.a(this.b.r().getContentResolver(), Uri.fromFile(this.U), i, null);
        if (localBitmap == null) {
          break;
        }
        int j = i * localBitmap.getWidth();
        k = i * localBitmap.getHeight();
        if (this.ac != 0)
        {
          i2 = this.ac - j;
          if (Math.abs(i2) >= i) {
            break;
          }
          this.ac /= i;
          this.ad /= i;
          String str = a(paramipk.c, paramipk.j, this.ac, this.ad, this.ae, this.af);
          a(localBitmap, str);
          this.U = new File(this.b.e().b(str));
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e("ImageResource", "Cannot save downsampled bitmap", localException);
        return;
      }
      int i1 = this.ad;
      int i2 = i1 - k;
    }
  }
  
  private final void q()
  {
    int i = ((ipk)this.o).c();
    ipl[] arrayOfipl = null;
    int j;
    label48:
    String str2;
    String str4;
    label90:
    File localFile1;
    switch (i)
    {
    default: 
      String str1 = b();
      j = 0;
      if (j < arrayOfipl.length)
      {
        str2 = String.valueOf(str1);
        String str3 = String.valueOf(arrayOfipl[j].b);
        if (str3.length() == 0) {
          break label168;
        }
        str4 = str2.concat(str3);
        localFile1 = this.b.e().a(str4);
        if (localFile1 != null) {
          break label188;
        }
      }
      break;
    }
    label168:
    label188:
    for (File localFile2 = this.b.f().a(str4);; localFile2 = localFile1)
    {
      if (localFile2 != null)
      {
        this.V = arrayOfipl[j];
        this.U = localFile2;
        return;
        arrayOfipl = I;
        break;
        arrayOfipl = J;
        break;
        arrayOfipl = K;
        break;
        str4 = new String(str2);
        break label90;
      }
      j++;
      break label48;
    }
  }
  
  private final boolean r()
  {
    if (this.Y == null) {
      this.Y = ((ConnectivityManager)this.b.r().getSystemService("connectivity"));
    }
    ConnectivityManager localConnectivityManager = this.Y;
    NetworkInfo localNetworkInfo = localConnectivityManager.getNetworkInfo(1);
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected())) {
      return false;
    }
    return !iv.a.a(localConnectivityManager);
  }
  
  private final ipl s()
  {
    switch (((ipk)this.o).c())
    {
    default: 
      return H;
    case 6: 
      return F;
    }
    return G;
  }
  
  private final boolean t()
  {
    Uri localUri = ((ipk)this.o).c.d;
    if (mfq.a(localUri)) {}
    String str1;
    for (this.T = new File(localUri.getPath());; this.T = new File(str1))
    {
      return true;
      str1 = mfq.a(this.b.r().getContentResolver(), localUri);
      if (str1 == null)
      {
        String str2 = String.valueOf(this.o);
        Log.e("EsResource", 32 + String.valueOf(str2).length() + "Couldn't compute raw file name: " + str2, null);
        return false;
      }
    }
  }
  
  public final Uri a(Uri paramUri)
  {
    return ((iox)mbb.a(this.b.r(), iox.class)).a(this.b.r(), paramUri.getPath(), ipm.a);
  }
  
  public final String a()
  {
    ipk localipk1 = (ipk)this.o;
    ipf localipf = localipk1.c;
    String str1 = localipf.c;
    if (TextUtils.isEmpty(str1))
    {
      iox localiox = (iox)mbb.b(this.b.r(), iox.class);
      Uri localUri = localipf.d;
      if (localiox != null) {}
      for (str1 = localiox.a(localUri); str1 == null; str1 = null)
      {
        if (this.t)
        {
          String str3 = String.valueOf(this.o);
          new StringBuilder(33 + String.valueOf(str3).length()).append("Cannot retrieve content URI for: ").append(str3);
        }
        return null;
      }
    }
    String str2 = efj.E(str1);
    ipk localipk2 = (ipk)this.o;
    int i = 6;
    int j = localipk2.j;
    if ((j & 0x4) == 0)
    {
      i = 22;
      if ((j & 0x20) == 0) {
        i |= 0x20;
      }
      if ((j & 0x4000) != 0) {
        i |= 0x80;
      }
      if (localipk2.h == null) {
        break label597;
      }
    }
    label303:
    label583:
    label597:
    for (int k = i | 0x400;; k = i)
    {
      if ((0x20000 & j) != 0) {}
      for (int i1 = k | 0x200;; i1 = k)
      {
        switch (localipk1.d)
        {
        case 4: 
        default: 
          return str2;
        case 0: 
          if ((localipk1.f != 0) && (localipk1.g != 0))
          {
            if ((0x100 & localipk1.j) == 0) {
              i1 |= 0x48;
            }
          }
          else {
            if (localipk1.e == -1) {
              break label583;
            }
          }
          break;
        }
        for (int i3 = this.Z.a(localipk1.e, i1);; i3 = i1)
        {
          return iqw.a(str2, i3, localipk1.f, localipk1.g, this.aa, this.ab, localipk1.h);
          if ((j & 0x20) != 0) {
            break;
          }
          i = 16390;
          break;
          if ((0x200 & localipk1.j) != 512) {
            break label303;
          }
          i1 |= 0x40;
          break label303;
          if ((0x100 & localipk1.j) == 0) {
            i1 |= 0x8;
          }
          return iqw.a(str2, i1, P, localipk1.h);
          return iqw.a(str2, i1, Q, localipk1.h);
          return iqw.a(str2, i1, localipk1.h);
          ipk localipk3 = (ipk)this.o;
          int i2 = Math.max(localipk3.f, localipk3.g);
          if (i2 == 0) {
            i2 = O;
          }
          if ((0x400 & localipk3.j) == 0)
          {
            if (this.W == null) {
              this.W = s();
            }
            switch (this.W.a)
            {
            }
          }
          for (;;)
          {
            return iqw.a(str2, i1, i2, localipk1.h);
            if (M) {
              i2 = i2 * N / 8192;
            }
          }
        }
      }
    }
  }
  
  public final void a(Object paramObject)
  {
    ipk localipk = (ipk)this.o;
    switch (localipk.d)
    {
    }
    for (;;)
    {
      super.a(paramObject);
      return;
      if (this.W != null)
      {
        this.V = this.W;
        this.W = null;
        continue;
        this.ac = localipk.f;
        this.ad = localipk.g;
        this.ae = this.aa;
        this.af = this.ab;
      }
    }
  }
  
  public final String b()
  {
    ipk localipk;
    if (this.S == null)
    {
      localipk = (ipk)this.o;
      if (a(localipk)) {
        this.S = a(localipk.c, localipk.j, localipk.f, localipk.g, this.aa, this.ab);
      }
    }
    else
    {
      return this.S;
    }
    ipf localipf = localipk.c;
    int i = localipk.j;
    int j = localipk.d;
    int k = localipk.f;
    int i1 = localipk.g;
    RectF localRectF = localipk.h;
    if (localipk.i == null) {}
    for (String str = null;; str = localipk.i.a())
    {
      this.S = a(localipf, i, j, k, i1, localRectF, str);
      break;
    }
  }
  
  public final void b(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (this.t)
      {
        String str = String.valueOf(this.o);
        new StringBuilder(66 + String.valueOf(str).length()).append("Delivering resource type to consumers: ").append(str).append(" resource type: ").append(i);
      }
      if (i != 0) {
        this.b.b(this, i);
      }
      return;
      if (mfq.a(this.X))
      {
        i = 2;
      }
      else if (mfq.b(this.X))
      {
        i = 1;
      }
      else
      {
        i = -1;
        continue;
        i = 4;
        continue;
        i = 3;
      }
    }
  }
  
  public final void c()
  {
    ipk localipk = (ipk)this.o;
    ipf localipf = localipk.c;
    if ((0x2 & localipk.j) != 0)
    {
      int i;
      if (localipf.d != null) {
        i = 1;
      }
      while (i != 0) {
        if (t())
        {
          if (this.t)
          {
            String str1 = String.valueOf(this.o);
            String str2 = String.valueOf(f());
            new StringBuilder(46 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Returning file name to consumers: ").append(str1).append(" file name: ").append(str2);
          }
          this.b.a(this, 1, f());
          return;
          i = 0;
        }
        else
        {
          this.b.a(this, 5, null);
          return;
        }
      }
    }
    super.c();
  }
  
  public final void c(Object paramObject)
  {
    int i = 1;
    super.c(paramObject);
    ipk localipk;
    if (o() != 0)
    {
      localipk = (ipk)this.o;
      switch (localipk.d)
      {
      }
    }
    label147:
    label150:
    label240:
    label370:
    label376:
    label380:
    for (;;)
    {
      return;
      ipl localipl;
      if (this.V != null)
      {
        localipl = this.V.c;
        if (localipl != null) {
          if (localipl.a == 2)
          {
            this.W = localipl;
            if (this.W == null) {
              break label147;
            }
          }
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label150;
        }
        h();
        return;
        if ((localipl.a != 3) || (!M) || ((0x1000 & localipk.j) != 0) || (!r())) {
          break;
        }
        this.W = localipl;
        break;
        i = 0;
      }
      continue;
      if (r())
      {
        int j;
        int k;
        if (localipk.c.d != null)
        {
          j = i;
          if ((j != 0) || (!a(localipk)) || (localipk.e == -1) || ((0x1000 & localipk.j) != 0)) {
            break label376;
          }
          if (this.ae != 0) {
            break label240;
          }
          if (this.af <= this.ab) {
            break label257;
          }
          k = i;
        }
        for (;;)
        {
          if (k == 0) {
            break label380;
          }
          h();
          return;
          j = 0;
          break;
          if (this.af < this.ab)
          {
            k = i;
          }
          else
          {
            int i1 = b(paramObject);
            int i2 = k();
            double d = i1 / i2;
            int i3;
            int i4;
            if (localipk.f == 0)
            {
              i3 = (int)(d * localipk.g);
              if (this.ac != 0) {
                break label355;
              }
              i4 = (int)(d * this.ad);
              if (i3 - R <= i4) {
                break label376;
              }
              if (i4 <= i1) {
                break label364;
              }
            }
            for (int i5 = i;; i5 = 0)
            {
              if (i5 != 0) {
                break label370;
              }
              k = i;
              break;
              i3 = localipk.f;
              break label296;
              i4 = this.ac;
              break label314;
            }
            k = 0;
            continue;
            k = 0;
          }
        }
      }
    }
  }
  
  public final String d()
  {
    if (this.W != null)
    {
      String str1 = String.valueOf(b());
      String str2 = String.valueOf(this.W.b);
      if (str2.length() != 0) {
        return str1.concat(str2);
      }
      return new String(str1);
    }
    return b();
  }
  
  public final File f()
  {
    if (this.T != null) {
      return this.T;
    }
    return super.f();
  }
  
  public final File g()
  {
    if (this.T != null) {
      return this.T;
    }
    ipk localipk1 = (ipk)this.o;
    if ((0x400 & localipk1.j) != 0) {
      return this.b.f().a(b());
    }
    switch (localipk1.d)
    {
    default: 
    case 0: 
      for (;;)
      {
        return super.g();
        if (a(localipk1))
        {
          ipk localipk2 = (ipk)this.o;
          iab localiab = this.b.e();
          this.U = null;
          this.ac = 0;
          this.ad = 0;
          this.ae = -1;
          this.af = -1;
          mfz localmfz1 = (mfz)mfx.a.get();
          localmfz1.b = (1 + localmfz1.b);
          StringBuilder localStringBuilder1;
          File localFile;
          double d1;
          label232:
          double d2;
          double d3;
          int i;
          StringBuilder localStringBuilder2;
          label296:
          String str3;
          File[] arrayOfFile;
          if (localmfz1.b == 1)
          {
            localStringBuilder1 = localmfz1.a;
            a(localStringBuilder1, localipk2.c.c);
            localFile = new File(localiab.b(mfx.b(localStringBuilder1)));
            if (localFile.exists())
            {
              if ((localipk2.f != 0) && (localipk2.g != 0)) {
                break label439;
              }
              d1 = -1.0D;
              d2 = d1 - 0.1D;
              d3 = d1 + 0.1D;
              i = 0xFFFFFFDF & localipk2.j;
              mfz localmfz2 = (mfz)mfx.a.get();
              localmfz2.b = (1 + localmfz2.b);
              if (localmfz2.b != 1) {
                break label455;
              }
              localStringBuilder2 = localmfz2.a;
              a(localStringBuilder2, i);
              str3 = mfx.b(localStringBuilder2);
              arrayOfFile = localFile.listFiles();
              if ((arrayOfFile != null) && (arrayOfFile.length != 0)) {
                break label470;
              }
            }
          }
          for (;;)
          {
            if (this.U == null) {
              break label892;
            }
            if (Log.isLoggable("ImageResource", 3))
            {
              String str1 = String.valueOf(this.U.getParent());
              String str2 = String.valueOf(this.U.getName());
              new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Cached resource found: ").append(str1).append("/").append(str2);
            }
            return this.U;
            localStringBuilder1 = new StringBuilder(256);
            break;
            label439:
            d1 = localipk2.f / localipk2.g;
            break label232;
            label455:
            localStringBuilder2 = new StringBuilder(256);
            break label296;
            label470:
            int j = 0;
            Object localObject = null;
            if (j < arrayOfFile.length)
            {
              String str4 = arrayOfFile[j].getName();
              String[] arrayOfString = str4.split(",");
              if (arrayOfString.length < 4) {
                new File(localFile, str4).delete();
              }
              while (arrayOfString.length >= 6)
              {
                j++;
                break;
              }
              String str5;
              if (i != 0)
              {
                if (arrayOfString.length < 5) {
                  break label804;
                }
                str5 = arrayOfString[4];
                label558:
                if (!str3.equals(str5)) {
                  break label810;
                }
              }
              for (;;)
              {
                int k;
                int i1;
                int i3;
                try
                {
                  k = Integer.parseInt(arrayOfString[0]);
                  i1 = Integer.parseInt(arrayOfString[1]);
                  int i2 = Integer.parseInt(arrayOfString[2]);
                  i3 = Integer.parseInt(arrayOfString[3]);
                  if ((k != 0) && (i1 != 0)) {
                    break label827;
                  }
                  d4 = -1.0D;
                  if ((d4 < d2) || (d4 > d3) || (i2 != this.aa)) {
                    break;
                  }
                  if (localObject != null)
                  {
                    if (i2 != 0) {
                      break label839;
                    }
                    if ((this.af < i3) || ((this.ac == localipk2.f) && (this.ad == localipk2.g) && ((k != localipk2.f) || (i1 != localipk2.g))) || (a(this.ac, k, localipk2.f)) || (a(this.ad, i1, localipk2.g)) || ((localipk2.f != 0) && (this.ac != 0) && (k == 0)) || ((localipk2.g != 0) && (this.ad != 0) && (i1 == 0))) {
                      break;
                    }
                  }
                  this.ac = k;
                  this.ad = i1;
                  this.ae = i2;
                  this.af = i3;
                  localObject = str4;
                }
                catch (NumberFormatException localNumberFormatException)
                {
                  label804:
                  Log.e("ImageResource", "NumberFormatException parsing cached file's filename.");
                }
                str5 = "";
                break label558;
                label810:
                break;
                break;
                label827:
                double d4 = k / i1;
                continue;
                label839:
                if (this.af > i3) {
                  break;
                }
              }
            }
            if (localObject != null)
            {
              this.U = new File(localFile, localObject);
              if (localipk2.c.e == ipm.a) {
                b(localipk2);
              }
            }
          }
          label892:
          if (!Log.isLoggable("ImageResource", 3)) {}
        }
      }
    }
    q();
    return this.U;
  }
  
  protected final void h()
  {
    ipk localipk1 = (ipk)this.o;
    if ((this.W == null) && (localipk1.d == 5) && ((0x400 & localipk1.j) == 0))
    {
      this.W = s();
      if ((this.W.c != null) && ((0x8000 & localipk1.j) != 0) && (r())) {
        this.W = this.W.c;
      }
    }
    ipf localipf = ((ipk)this.o).c;
    int i;
    int i18;
    label158:
    Uri localUri1;
    label183:
    long l1;
    Context localContext;
    ipk localipk2;
    Uri localUri2;
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    jrn localjrn;
    String str7;
    label417:
    Object localObject;
    if (localipf.d != null)
    {
      i = 1;
      if (i == 0) {
        break label744;
      }
      Uri localUri5 = localipf.d;
      String str10 = localUri5.getScheme();
      iox localiox = (iox)mbb.b(this.b.r(), iox.class);
      if ((localiox == null) || (!localiox.b(localUri5))) {
        break label738;
      }
      i18 = 1;
      if ((str10 == null) || (str10.startsWith("http")) || (i18 != 0)) {
        break label744;
      }
      localUri1 = localUri5;
      if (localUri1 == null) {
        break label2017;
      }
      l1 = SystemClock.currentThreadTimeMillis();
      localContext = this.b.r();
      localipk2 = (ipk)this.o;
      localUri2 = localipk2.c.d;
      if (this.t)
      {
        String str9 = String.valueOf(localUri2);
        new StringBuilder(23 + String.valueOf(str9).length()).append("Loading local resource ").append(str9);
      }
      this.X = mfq.b(localContext.getContentResolver(), localUri2);
      bool1 = mfq.c(this.X);
      bool2 = mfq.a(this.X);
      bool3 = mfq.b(localUri2);
      bool4 = mfq.a(localUri2);
      if ((bool1) || (bool2)) {
        break label842;
      }
      localjrn = jrn.a(localContext);
      str7 = this.X;
      Map localMap = localjrn.b;
      String str8 = String.valueOf(localUri2);
      Integer localInteger = (Integer)localMap.get(0 + String.valueOf(str8).length() + String.valueOf(str7).length() + str8 + str7);
      if (localInteger == null) {
        break label750;
      }
      b(localInteger.intValue());
      localObject = null;
    }
    int j;
    int k;
    try
    {
      j = localipk2.f;
      k = localipk2.g;
      if (localipk2.d != 2) {
        break label866;
      }
      k = P;
      j = k;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        File localFile;
        String str1;
        String str2;
        String str3;
        long l2;
        String str4;
        String str5;
        String str6;
        int i1;
        a(6);
        return;
        k = Q;
        j = k;
        continue;
        if ((j == 0) && (k == 0))
        {
          k = Q;
          j = k;
          continue;
          str3 = new String(str1);
        }
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        a(3);
        return;
        if ((!bool2) || ((0x4 & localipk2.j) == 0)) {
          break;
        }
        bool5 = t();
        localObject = null;
        if (!bool5) {
          break label2040;
        }
        localByteBuffer = efj.a(this.T, false);
        localObject = null;
      }
      if (!bool3) {
        break label1587;
      }
      localipk3 = (ipk)this.o;
      if ((localipk3.d != 2) && (!bool1)) {
        break label1534;
      }
      if ((j != 0) || (k != 0)) {
        break label1083;
      }
      throw new IllegalArgumentException("Both width and height cannot be zero.");
    }
    catch (Exception localException)
    {
      a(5);
      return;
    }
    localFile = null;
    ByteBuffer localByteBuffer;
    label536:
    ipk localipk4;
    if (bool4)
    {
      str1 = String.valueOf(localUri2.getPath());
      str2 = String.valueOf("-thumb");
      if (str2.length() != 0)
      {
        str3 = str1.concat(str2);
        localFile = new File(str3);
      }
    }
    else
    {
      if ((localipk2.d != 2) || (localFile == null) || (!localFile.exists())) {
        break label981;
      }
      localByteBuffer = efj.a(localFile, false);
      if (localObject == null) {
        break label1999;
      }
      if ((0x1 & localipk2.j) == 0)
      {
        l2 = SystemClock.currentThreadTimeMillis();
        a((Bitmap)localObject, d());
        if (this.t)
        {
          str4 = String.valueOf(this.o);
          str5 = String.valueOf(f());
          str6 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l2));
          new StringBuilder(62 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length()).append("Saved local thumbnail in file cache: ").append(str4).append(" file name: ").append(str5).append(" time spent: ").append(str6);
        }
      }
      super.c(localObject);
      if (o() != 0)
      {
        localipk4 = (ipk)this.o;
        i1 = localipk4.d;
        switch (i1)
        {
        }
      }
    }
    label786:
    label1180:
    label2081:
    label2085:
    for (;;)
    {
      label732:
      return;
      i = 0;
      break;
      label738:
      i18 = 0;
      break label158;
      label744:
      localUri1 = null;
      break label183;
      label750:
      Uri localUri3;
      label842:
      label866:
      int i14;
      label981:
      int i15;
      label1083:
      label1251:
      label1519:
      label1534:
      int i9;
      label1330:
      label1587:
      label1740:
      int i2;
      int i3;
      if (mfq.a(localUri2))
      {
        Uri localUri4 = a(localUri2);
        localjrn.a.grantUriPermission("com.google.android.gms", localUri4, 1);
        localUri3 = localUri4;
        if (localjrn.c == null) {
          localjrn.c = ((fyd)mbb.a(localjrn.a, fyd.class));
        }
        localjrn.c.a(localUri3, new jro(localjrn, localUri2, str7, this));
        break label417;
        if (!bool2) {
          break label417;
        }
        this.s = 2;
        this.b.b(this, 2);
        break label417;
        switch (localipk2.d)
        {
        case 0: 
        case 1: 
        case 2: 
        case 4: 
        default: 
          throw new UnsupportedOperationException();
        }
        boolean bool5;
        ipk localipk3;
        Bitmap localBitmap1 = this.b.b(512, 384);
        Bitmap localBitmap2 = efj.a(localContext, localUri2, localBitmap1);
        if (localBitmap2 != localBitmap1) {
          this.b.a(localBitmap1);
        }
        int i10 = localBitmap2.getWidth();
        int i11 = localBitmap2.getHeight();
        float f1 = i10 / i11;
        int i16;
        int i17;
        Bitmap localBitmap3;
        Bitmap localBitmap4;
        if (j == 0)
        {
          int i12 = Math.round(f1 * k);
          int i13 = k;
          i14 = i12;
          i15 = i13;
          i16 = Math.min(i10, i14);
          i17 = Math.min(i11, i15);
          localBitmap3 = a(localContext, localUri2, localBitmap2);
          if (localBitmap3 != localBitmap2) {
            this.b.a(localBitmap2);
          }
          localBitmap4 = this.b.b(i16, i17);
          if (localBitmap3 != null) {
            break label1330;
          }
          localObject = null;
          if (localBitmap3 != localObject) {
            this.b.a(localBitmap3);
          }
          if (localBitmap4 != localObject) {
            this.b.a(localBitmap4);
          }
        }
        for (;;)
        {
          a(l1, "mediastore", -1, -1, -1, (Bitmap)localObject);
          localByteBuffer = null;
          break;
          if (k != 0) {
            break label2022;
          }
          i15 = Math.round(j / f1);
          i14 = j;
          break label1180;
          if ((localBitmap3.getWidth() == i16) && (localBitmap3.getHeight() == i17))
          {
            localObject = localBitmap3;
            break label1251;
          }
          float f2 = 0.0F;
          Matrix localMatrix = new Matrix();
          float f3;
          float f4;
          if (i17 * localBitmap3.getWidth() > i16 * localBitmap3.getHeight())
          {
            f3 = i17 / localBitmap3.getHeight();
            f4 = 0.5F * (i16 - f3 * localBitmap3.getWidth());
            localMatrix.setScale(f3, f3);
            localMatrix.postTranslate(0.5F + (int)f4, 0.5F + (int)f2);
            if (localBitmap4 == null) {
              break label1519;
            }
          }
          for (localObject = localBitmap4;; localObject = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888))
          {
            new Canvas((Bitmap)localObject).drawBitmap(localBitmap3, localMatrix, new Paint(3));
            break;
            f3 = i16 / localBitmap3.getWidth();
            f2 = 0.5F * (i17 - f3 * localBitmap3.getHeight());
            f4 = 0.0F;
            break label1418;
          }
          if (localipk3.d == 1) {
            localObject = efj.a(localContext.getContentResolver(), localUri2, this.b.c());
          } else {
            localObject = a(localContext, localUri2, Math.max(j, k));
          }
        }
        if (bool1)
        {
          localObject = efj.a(localContext, localUri2, j, k);
          a(l1, "video", -1, -1, -1, (Bitmap)localObject);
          localByteBuffer = null;
          break label536;
        }
        if (localipk2.d == 1) {}
        for (localObject = efj.a(localContext.getContentResolver(), localUri2, this.b.c());; localObject = a(localContext, localUri2, Math.max(j, k)))
        {
          a(l1, localUri2.getAuthority(), -1, -1, -1, (Bitmap)localObject);
          break;
        }
        if (this.V == null) {
          break label2046;
        }
        ipl localipl = this.V.c;
        if (localipl == null) {
          break label2046;
        }
        if (localipl.a == 2) {
          this.W = localipl;
        }
        for (;;)
        {
          if (this.W != null)
          {
            i9 = 1;
            if (i9 == 0) {
              break label2050;
            }
            h();
            return;
            if ((localipl.a == 3) && (M) && ((0x1000 & localipk4.j) == 0) && (r()))
            {
              this.W = localipl;
              continue;
              if (!r()) {
                break;
              }
              if (localipk4.c.d == null) {
                break label2052;
              }
              i2 = 1;
              if ((i2 != 0) || (!a(localipk4)) || (localipk4.e == -1) || ((0x1000 & localipk4.j) != 0)) {
                break label2081;
              }
              if (this.ae == 0)
              {
                if (this.af <= this.ab) {
                  break label1896;
                }
                i3 = 1;
              }
            }
          }
        }
      }
      for (;;)
      {
        label1869:
        if (i3 == 0) {
          break label2085;
        }
        h();
        return;
        if (this.af < this.ab)
        {
          i3 = 1;
        }
        else
        {
          label1896:
          int i4 = b(localObject);
          int i5 = k();
          double d = i4 / i5;
          int i6;
          int i7;
          if (localipk4.f == 0)
          {
            i6 = (int)(d * localipk4.g);
            if (this.ac != 0) {
              break label1990;
            }
            i7 = (int)(d * this.ad);
          }
          for (;;)
          {
            if (i6 - R > i7)
            {
              int i8;
              if (i7 > i4)
              {
                i8 = 1;
                break label2058;
                i6 = localipk4.f;
                break label1938;
                label1990:
                i7 = this.ac;
                continue;
                label1999:
                if (localByteBuffer != null)
                {
                  a(localByteBuffer);
                  return;
                }
                a(3);
                return;
                label2017:
                super.h();
                return;
                label2022:
                i15 = k;
                i14 = j;
                break label1180;
                localUri3 = localUri2;
                break label786;
                label2040:
                localByteBuffer = null;
                break;
                label2046:
                i9 = 0;
                break label1740;
                break label732;
                i2 = 0;
                break label1814;
              }
              for (;;)
              {
                if (i8 != 0) {
                  break label2075;
                }
                i3 = 1;
                break;
                i8 = 0;
              }
              i3 = 0;
              break label1869;
            }
          }
          i3 = 0;
        }
      }
    }
  }
  
  protected final String m()
  {
    String str = super.m();
    if (str == null) {
      return null;
    }
    if (((ipk)this.o).e == -1) {
      return str;
    }
    switch (this.aa)
    {
    default: 
      return str;
    case 0: 
      switch (this.af)
      {
      default: 
        return str;
      case 0: 
        return String.valueOf(str).concat(" (High)");
      case 1: 
        return String.valueOf(str).concat(" (Standard)");
      case 2: 
        return String.valueOf(str).concat(" (Low)");
      }
      return String.valueOf(str).concat(" (Very Low)");
    }
    int i = this.af;
    return 15 + String.valueOf(str).length() + str + " (L" + i + ")";
  }
  
  public final void n()
  {
    if (this.t)
    {
      String str = String.valueOf(this.o);
      new StringBuilder(48 + String.valueOf(str).length()).append("Failed to determine if the image is a panorama: ").append(str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iph
 * JD-Core Version:    0.7.0.1
 */