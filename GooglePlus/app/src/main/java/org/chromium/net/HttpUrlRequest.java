package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.Map;

@Deprecated
public abstract interface HttpUrlRequest
{
  public abstract long a();
  
  public abstract void a(long paramLong);
  
  public abstract void a(long paramLong, boolean paramBoolean);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, ReadableByteChannel paramReadableByteChannel, long paramLong);
  
  public abstract void a(String paramString, byte[] paramArrayOfByte);
  
  public abstract int b();
  
  public abstract String b(String paramString);
  
  public abstract IOException c();
  
  public abstract ByteBuffer d();
  
  public abstract byte[] e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract boolean h();
  
  public abstract String i();
  
  public abstract String j();
  
  public abstract Map<String, List<String>> k();
  
  public abstract String l();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.HttpUrlRequest
 * JD-Core Version:    0.7.0.1
 */