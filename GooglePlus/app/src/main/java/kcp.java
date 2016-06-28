import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kcp
  extends kbw
{
  private static final Charset A = Charset.forName("US-ASCII");
  private static final byte[] a = "--MultiPartRequest\n".getBytes();
  private static final byte[] b = "--MultiPartRequest--\n".getBytes();
  private static final byte[] c = "Content-Type: ".getBytes();
  private static final byte[] d = "Content-Length: ".getBytes();
  private static final byte[] f = "Content-Type: application/http\n".getBytes();
  private static final byte[] g = "Content-ID: <item:".getBytes();
  private static final byte[] h = ">\n\n".getBytes();
  private static final Pattern w = Pattern.compile("Content-ID: <response-item:(.+)>");
  private static final Pattern x = Pattern.compile("HTTP/1\\.1 (\\d+) (.*)");
  private static final Pattern y = Pattern.compile("Content-Length: (\\d+)");
  private static final Pattern z = Pattern.compile("Content-Type:[\\s]*(.*)");
  private final String B;
  private final String C;
  private String D;
  private kbw E;
  public ArrayList<kbw> e = new ArrayList();
  
  public kcp(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramContext, new kcg(paramContext, paramInt), "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    String str = jrf.a(3, new String[] { jrf.a(null, paramString1, "~photos_of_user_home", "ALBUM") });
    if (paramBoolean) {
      a(new bkv(paramContext, paramInt, paramString1, str, "~pending_photos_of_user", null, 10, true));
    }
    for (boolean bool = false;; bool = paramBoolean)
    {
      a(new bkv(paramContext, paramInt, paramString1, str, "~approved_photos_of_user", paramString2, 100, bool));
      return;
    }
  }
  
  public kcp(Context paramContext, int paramInt, ArrayList<hus> paramArrayList)
  {
    this(paramContext, new kcg(paramContext, paramInt), "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    int i = Math.min(paramArrayList.size(), 50);
    int j = 0;
    int k = 0;
    if (j < i)
    {
      hvd localhvd = new hvd(paramContext, paramInt, (hus)paramArrayList.get(j));
      byte[] arrayOfByte = localhvd.e();
      if (arrayOfByte == null) {}
      for (int m = 0;; m = arrayOfByte.length)
      {
        if (k + m >= 51200) {
          return;
        }
        a(localhvd);
        k += m;
        j++;
        break;
      }
    }
  }
  
  public kcp(Context paramContext, kcg paramkcg, String paramString1, String paramString2)
  {
    super(paramContext, paramkcg, "batch", new kcq(paramContext, paramkcg.a, paramString2));
    this.B = paramString1;
    this.C = paramString2;
  }
  
  private static int a(ByteBuffer paramByteBuffer)
  {
    String str1 = null;
    for (;;)
    {
      String str2 = b(paramByteBuffer);
      if (str2 == null) {
        return -1;
      }
      if (str2.isEmpty()) {
        try
        {
          int i = Integer.parseInt(str1);
          return i;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw new IOException(40 + String.valueOf(str1).length() + "Invalid response format. Section ID = '" + str1 + "'");
        }
      }
      Matcher localMatcher = w.matcher(str2);
      if (localMatcher.matches()) {
        str1 = localMatcher.group(1);
      }
    }
  }
  
  private static String b(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int m;
    if (paramByteBuffer.hasArray())
    {
      while ((paramByteBuffer.hasRemaining()) && (paramByteBuffer.get() != 10)) {}
      m = -1 + (paramByteBuffer.position() - i);
      if (m < 0) {
        return null;
      }
      if (m == 0) {
        return "";
      }
      if (paramByteBuffer.get(-1 + (i + m)) != 13) {
        break label464;
      }
    }
    label415:
    label464:
    for (int n = m - 1;; n = m)
    {
      if (n == 0) {
        return "";
      }
      return new String(paramByteBuffer.array(), i + paramByteBuffer.arrayOffset(), n, A);
      mfz localmfz1 = (mfz)mfx.a.get();
      localmfz1.b = (1 + localmfz1.b);
      if (localmfz1.b == 1) {}
      mfz localmfz2;
      for (StringBuilder localStringBuilder = localmfz1.a;; localStringBuilder = new StringBuilder(256)) {
        try
        {
          while (paramByteBuffer.hasRemaining())
          {
            int k = paramByteBuffer.get();
            if (k == 10) {
              break;
            }
            localStringBuilder.append((char)k);
          }
          throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        }
        finally
        {
          localmfz2 = (mfz)mfx.a.get();
          if (localmfz2.b > 0) {
            break label415;
          }
        }
      }
      int j = paramByteBuffer.position();
      if (i == j)
      {
        mfz localmfz4 = (mfz)mfx.a.get();
        if (localmfz4.b <= 0) {
          throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        }
        if ((localmfz4.b == 1) && (localStringBuilder != localmfz4.a)) {
          throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
        }
        localStringBuilder.setLength(0);
        localmfz4.b = (-1 + localmfz4.b);
        return null;
      }
      if (localStringBuilder.charAt(-1 + localStringBuilder.length()) == '\r') {
        localStringBuilder.setLength(-1 + localStringBuilder.length());
      }
      String str = localStringBuilder.toString();
      mfz localmfz3 = (mfz)mfx.a.get();
      if (localmfz3.b <= 0) {
        throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
      }
      if ((localmfz3.b == 1) && (localStringBuilder != localmfz3.a)) {
        throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
      }
      localStringBuilder.setLength(0);
      localmfz3.b = (-1 + localmfz3.b);
      return str;
      if ((localmfz2.b == 1) && (localStringBuilder != localmfz2.a)) {
        throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
      }
      localStringBuilder.setLength(0);
      localmfz2.b = (-1 + localmfz2.b);
      throw localObject;
    }
  }
  
  private final void u()
  {
    int i = this.e.size();
    for (int j = 0; j < i; j++)
    {
      kbw localkbw = (kbw)this.e.get(j);
      if ((!b(localkbw.q)) && (localkbw.c(localkbw.q)))
      {
        String str = String.valueOf(localkbw.k());
        Log.e("HttpOperation", 23 + String.valueOf(str).length() + "[" + str + "] Unexpected exception", localkbw.q);
      }
    }
  }
  
  private final String v()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.e.size() << 4);
    localStringBuilder.append("BatchOperation[").append(this.e.size()).append("]: ");
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append(((kbw)localIterator.next()).k()).append(", ");
    }
    localStringBuilder.setLength(-2 + localStringBuilder.length());
    return localStringBuilder.toString();
  }
  
  public final void a()
  {
    int i = this.e.size();
    for (int j = 0; j < i; j++) {
      ((kbw)this.e.get(j)).a();
    }
  }
  
  public final void a(int paramInt, String paramString, IOException paramIOException)
  {
    super.a(paramInt, paramString, paramIOException);
    if (b(paramIOException))
    {
      int i = this.e.size();
      for (int j = 0; j < i; j++) {
        ((kbw)this.e.get(j)).a(paramInt, paramString, paramIOException);
      }
    }
  }
  
  public final void a(ByteBuffer paramByteBuffer, String paramString)
  {
    if (t()) {
      c(paramByteBuffer, v());
    }
    boolean[] arrayOfBoolean = new boolean[this.e.size()];
    ByteBuffer localByteBuffer1 = paramByteBuffer.duplicate();
    int i = 0;
    int j = a(localByteBuffer1);
    int i1;
    String str2;
    String str3;
    ByteBuffer localByteBuffer2;
    Object localObject;
    if (j != -1)
    {
      this.E = ((kbw)this.e.get(j));
      int n = 0;
      i1 = 200;
      str2 = null;
      str3 = null;
      for (;;)
      {
        String str4 = b(localByteBuffer1);
        if (str4.isEmpty()) {
          break;
        }
        Matcher localMatcher1 = y.matcher(str4);
        if (localMatcher1.matches())
        {
          n = Integer.parseInt(localMatcher1.group(1));
        }
        else
        {
          Matcher localMatcher2 = x.matcher(str4);
          if (localMatcher2.matches())
          {
            i1 = Integer.parseInt(localMatcher2.group(1));
            str2 = localMatcher2.group(2);
          }
          else
          {
            Matcher localMatcher3 = z.matcher(str4);
            if (localMatcher3.matches()) {
              str3 = localMatcher3.group(1);
            }
          }
        }
      }
      localByteBuffer2 = localByteBuffer1.slice();
      localByteBuffer2.limit(n);
      localByteBuffer1.position(n + localByteBuffer1.position());
      b(localByteBuffer1);
      if ((i1 >= 200) && (i1 < 300))
      {
        this.E.a(localByteBuffer2, str3);
        localObject = null;
        label259:
        this.E.a(i1, str2, (IOException)localObject);
        this.E.a(i1, str2, (Exception)localObject);
        a(this.E.k(), this.E.v.e);
        arrayOfBoolean[j] = true;
        if (!this.E.n()) {
          break label649;
        }
      }
    }
    label649:
    for (int i2 = i + 1;; i2 = i)
    {
      i = i2;
      break;
      if (Log.isLoggable("HttpOperation", 3))
      {
        String str5 = String.valueOf(this.E.k());
        new StringBuilder(22 + String.valueOf(str2).length() + String.valueOf(str5).length()).append("Error: ").append(i1).append("/").append(str2).append(" [").append(str5).append("]");
      }
      if (i1 == 401) {
        throw new kbt(i1, str2);
      }
      try
      {
        this.E.b(localByteBuffer2, str3);
        localObject = null;
      }
      catch (kce localkce)
      {
        label457:
        ArrayList localArrayList;
        boolean bool;
        int k;
        int m;
        break label457;
      }
      if (localObject != null) {
        break label259;
      }
      localObject = new kbt(i1, str2);
      break label259;
      localArrayList = this.e;
      if (i == 0)
      {
        bool = true;
        a(localArrayList, bool);
      }
      for (k = 0;; k++)
      {
        if (k >= arrayOfBoolean.length) {
          break label583;
        }
        if (arrayOfBoolean[k] == 0)
        {
          String str1 = String.valueOf(this.e.get(k));
          throw new IOException(43 + String.valueOf(str1).length() + "Incomplete response. Response missing for: " + str1);
          bool = false;
          break;
        }
      }
      label583:
      if (i != 0)
      {
        u();
        m = this.e.size();
        throw new IOException(57 + i + " of " + m + " operations in the batch failed");
      }
      return;
    }
  }
  
  public void a(List<kbw> paramList, boolean paramBoolean) {}
  
  public final void a(kbw paramkbw)
  {
    if (!paramkbw.a_(this.C))
    {
      String str1 = String.valueOf(paramkbw.k());
      if (str1.length() != 0) {}
      for (String str2 = "Operation cannot be batched: ".concat(str1);; str2 = new String("Operation cannot be batched: ")) {
        throw new IllegalArgumentException(str2);
      }
    }
    this.e.add(paramkbw);
  }
  
  public final String c()
  {
    return efj.a(this.j, this.B, "batch", true, false, null);
  }
  
  public final void c(String paramString)
  {
    if (super.n()) {
      super.c(paramString);
    }
    int i = this.e.size();
    for (int j = 0; j < i; j++) {
      ((kbw)this.e.get(j)).c(paramString);
    }
  }
  
  public final String d()
  {
    return "multipart/mixed; boundary=MultiPartRequest";
  }
  
  public final byte[] e()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(this.e.size() << 9);
      for (int i = 0; i < this.e.size(); i++)
      {
        kbw localkbw = (kbw)this.e.get(i);
        localByteArrayOutputStream.write(a);
        localByteArrayOutputStream.write(f);
        localByteArrayOutputStream.write(g);
        localByteArrayOutputStream.write(Integer.toString(i).getBytes());
        localByteArrayOutputStream.write(h);
        localByteArrayOutputStream.write(localkbw.l.getBytes());
        localByteArrayOutputStream.write(32);
        localByteArrayOutputStream.write(Uri.parse(localkbw.c()).getPath().getBytes());
        localByteArrayOutputStream.write(10);
        byte[] arrayOfByte2 = localkbw.e();
        if (s()) {
          localkbw.a(arrayOfByte2, localkbw.m());
        }
        if ((arrayOfByte2 != null) && (arrayOfByte2.length > 0))
        {
          localByteArrayOutputStream.write(c);
          localByteArrayOutputStream.write(localkbw.d().getBytes());
          localByteArrayOutputStream.write(10);
          localByteArrayOutputStream.write(d);
          localByteArrayOutputStream.write(Integer.toString(arrayOfByte2.length).getBytes());
          localByteArrayOutputStream.write(10);
          localByteArrayOutputStream.write(10);
          localByteArrayOutputStream.write(arrayOfByte2);
          localByteArrayOutputStream.write(10);
        }
        localByteArrayOutputStream.write(10);
      }
      localByteArrayOutputStream.write(b);
      byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      return arrayOfByte1;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException("Cannot create a byte array stream", localIOException);
    }
  }
  
  public ArrayList<hus> h()
  {
    ArrayList localArrayList1 = this.e;
    if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
    {
      int i = localArrayList1.size();
      ArrayList localArrayList2 = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        hvd localhvd = (hvd)localArrayList1.get(j);
        if ((!localhvd.n()) && (localhvd.q == null)) {
          localArrayList2.add(localhvd.a);
        }
      }
      return localArrayList2;
    }
    return null;
  }
  
  public final String k()
  {
    if (this.D == null)
    {
      StringBuilder localStringBuilder = new StringBuilder(super.k()).append('{');
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((kbw)localIterator.next()).k()).append(", ");
      }
      localStringBuilder.setLength(-2 + localStringBuilder.length());
      localStringBuilder.append('}');
      this.D = localStringBuilder.toString();
    }
    return this.D;
  }
  
  public final String[] l()
  {
    int i = this.e.size();
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++) {
      arrayOfString[j] = ((kbw)this.e.get(j)).k();
    }
    return arrayOfString;
  }
  
  public final String m()
  {
    return v();
  }
  
  public final boolean n()
  {
    if (super.n()) {
      return true;
    }
    int i = this.e.size();
    for (int j = 0; j < i; j++) {
      if (((kbw)this.e.get(j)).n()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcp
 * JD-Core Version:    0.7.0.1
 */