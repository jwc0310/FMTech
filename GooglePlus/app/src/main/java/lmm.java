import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class lmm
  extends mab
  implements heq
{
  public int a;
  private String[] b;
  private String[] c;
  private String[] d;
  private Spanned[] e;
  
  private lmm() {}
  
  public lmm(Cursor paramCursor, int paramInt)
  {
    this.a = Math.min(3, paramCursor.getCount());
    this.b = new String[this.a];
    this.c = new String[this.a];
    this.d = new String[this.a];
    this.e = new Spanned[this.a];
    paramCursor.moveToLast();
    int i = 0;
    if (i < this.a)
    {
      this.b[i] = paramCursor.getString(0);
      this.c[i] = paramCursor.getString(1);
      this.d[i] = hdo.b(paramCursor.getString(2));
      Spanned[] arrayOfSpanned = this.e;
      byte[] arrayOfByte = paramCursor.getBlob(3);
      if (arrayOfByte == null) {}
      for (SpannableStringBuilder localSpannableStringBuilder = null;; localSpannableStringBuilder = lwh.a(ByteBuffer.wrap(arrayOfByte)))
      {
        arrayOfSpanned[i] = localSpannableStringBuilder;
        paramCursor.moveToPrevious();
        i++;
        break;
      }
    }
  }
  
  public lmm(List<ona> paramList, int paramInt)
  {
    int i = paramList.size();
    this.a = Math.min(3, i);
    this.b = new String[this.a];
    this.c = new String[this.a];
    this.d = new String[this.a];
    this.e = new Spanned[this.a];
    int j = i - this.a;
    int k = 0;
    if (k < this.a)
    {
      ona localona = (ona)paramList.get(j + k);
      this.b[k] = localona.e;
      String[] arrayOfString1 = this.c;
      String str1;
      label136:
      String[] arrayOfString2;
      if (localona.l != null)
      {
        str1 = localona.l.a;
        arrayOfString1[k] = str1;
        arrayOfString2 = this.d;
        if (localona.l == null) {
          break label247;
        }
      }
      label247:
      for (String str2 = localona.l.c;; str2 = null)
      {
        arrayOfString2[k] = str2;
        Spanned[] arrayOfSpanned = this.e;
        qoq localqoq = localona.m;
        hge localhge = efj.d();
        if (efj.Gy == null) {
          efj.Gy = new hgd();
        }
        arrayOfSpanned[k] = efj.a(localqoq, localhge, efj.Gy, efj.d(), efj.c(), efj.d(), efj.g());
        k++;
        break;
        str1 = null;
        break label136;
      }
    }
  }
  
  public static lmm a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    lmm locallmm = new lmm();
    locallmm.a = localByteBuffer.getInt();
    locallmm.b = new String[locallmm.a];
    locallmm.c = new String[locallmm.a];
    locallmm.d = new String[locallmm.a];
    locallmm.e = new Spanned[locallmm.a];
    for (int i = 0; i < locallmm.a; i++)
    {
      locallmm.b[i] = d(localByteBuffer);
      locallmm.c[i] = d(localByteBuffer);
      locallmm.d[i] = d(localByteBuffer);
      locallmm.e[i] = lwh.a(localByteBuffer);
    }
    return locallmm;
  }
  
  public static byte[] a(lmm paramlmm)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeInt(paramlmm.a);
    int i = 0;
    if (i < paramlmm.a)
    {
      a(localDataOutputStream, paramlmm.b[i]);
      a(localDataOutputStream, paramlmm.c[i]);
      a(localDataOutputStream, paramlmm.d[i]);
      Object localObject = paramlmm.e[i];
      if (((Spanned)localObject).length() <= 1024) {}
      for (;;)
      {
        localDataOutputStream.write(lwh.a((Spanned)localObject));
        i++;
        break;
        localObject = new SpannableStringBuilder((CharSequence)localObject, 0, 1024);
      }
    }
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final String a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public final String b(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public final String c(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public final Spanned d(int paramInt)
  {
    return this.e[paramInt];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmm
 * JD-Core Version:    0.7.0.1
 */