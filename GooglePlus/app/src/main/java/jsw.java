import java.io.ByteArrayOutputStream;

class jsw
{
  final byte[] a;
  final byte[] b;
  final int c;
  ByteArrayOutputStream d = new ByteArrayOutputStream();
  
  public jsw(jss paramjss, long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    this.a = jss.a(paramjss, paramLong, paramInt1);
    this.b = jss.a(paramString);
    this.c = paramInt2;
  }
  
  public void a()
  {
    if (this.d.size() < 524288) {
      this.e.a(this.a, this.b, this.c, this.d.toByteArray());
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d.size() < 524288) {
      this.d.write(paramArrayOfByte, 0, paramInt2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsw
 * JD-Core Version:    0.7.0.1
 */